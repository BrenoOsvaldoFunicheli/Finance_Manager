/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITY;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author osval
 */
@Entity
@Table(name = "tb_account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountEntity.findAll", query = "SELECT a FROM AccountEntity a")
    , @NamedQuery(name = "AccountEntity.findByIdAccount", query = "SELECT a FROM AccountEntity a WHERE a.idAccount = :idAccount")
    , @NamedQuery(name = "AccountEntity.findAccountByIdUser", query = "SELECT a FROM AccountEntity a WHERE a.idUser = :idUser")
    , @NamedQuery(name = "AccountEntity.findAccountByIdUserAccount", query = "SELECT a FROM AccountEntity a WHERE a.idUser = :idUser AND a.nameAccount = :name")
    , @NamedQuery(name = "AccountEntity.findByNameAccount", query = "SELECT a FROM AccountEntity a WHERE a.nameAccount = :nameAccount")
    , @NamedQuery(name = "AccountEntity.findByTipoAccount", query = "SELECT a FROM AccountEntity a WHERE a.tipoAccount = :tipoAccount")
    , @NamedQuery(name = "AccountEntity.findByFgAtivo", query = "SELECT a FROM AccountEntity a WHERE a.fgAtivo = :fgAtivo")})
public class AccountEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_account")
    private Integer idAccount;
    @Column(name = "name_account")
    private String nameAccount;
    @Column(name = "tipo_account")
    private String tipoAccount;
    @Basic(optional = false)
    @Column(name = "fg_ativo")
    private boolean fgAtivo;
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne
    private UserEntity idUser;
    @OneToMany(mappedBy = "idAccount")
    private Collection<ItemFinnanceEntity> itemFinnanceEntityCollection;

    public AccountEntity() {
    }

    public AccountEntity(String nameAccount) {
        this.nameAccount = nameAccount;
        fgAtivo = true;
    }

    public AccountEntity(UserEntity idUser, String nameAccount, String tipoAccount, boolean fgAtivo) {
        this.nameAccount = nameAccount;
        this.tipoAccount = tipoAccount;
        this.fgAtivo = fgAtivo;
        this.idUser = idUser;
    }

    public AccountEntity(Integer idAccount, String nameAccount, String tipoAccount, boolean fgAtivo) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        this.tipoAccount = tipoAccount;
        this.fgAtivo = fgAtivo;
    }

    public AccountEntity(String nameAccount, String tipoAccount, boolean fgAtivo) {
        this.nameAccount = nameAccount;
        this.tipoAccount = tipoAccount;
        this.fgAtivo = fgAtivo;
    }

    public AccountEntity(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public AccountEntity(Integer idAccount, boolean fgAtivo) {
        this.idAccount = idAccount;
        this.fgAtivo = fgAtivo;
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getTipoAccount() {
        return tipoAccount;
    }

    public void setTipoAccount(String tipoAccount) {
        this.tipoAccount = tipoAccount;
    }

    public boolean getFgAtivo() {
        return fgAtivo;
    }

    public void setFgAtivo(boolean fgAtivo) {
        this.fgAtivo = fgAtivo;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Collection<ItemFinnanceEntity> getItemFinnanceEntityCollection() {
        return itemFinnanceEntityCollection;
    }

    public void setItemFinnanceEntityCollection(Collection<ItemFinnanceEntity> itemFinnanceEntityCollection) {
        this.itemFinnanceEntityCollection = itemFinnanceEntityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccount != null ? idAccount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountEntity)) {
            return false;
        }
        AccountEntity other = (AccountEntity) object;
        if ((this.idAccount == null && other.idAccount != null) || (this.idAccount != null && !this.idAccount.equals(other.idAccount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccountEntity{" + "idAccount=" + idAccount + ", nameAccount=" + nameAccount + ", tipoAccount=" + tipoAccount + ", fgAtivo=" + fgAtivo + ", idUser=" + idUser + '}';
    }

}
