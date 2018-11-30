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
@Table(name = "tb_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserEntity.findAllUser", query = "SELECT u FROM UserEntity u")
    , @NamedQuery(name = "UserEntity.findUser", query = "SELECT u FROM UserEntity u WHERE u.login = :login AND u.passwordUser = :passwordUser")
    , @NamedQuery(name = "UserEntity.findByIdUser", query = "SELECT u FROM UserEntity u WHERE u.idUser = :idUser")
    , @NamedQuery(name = "UserEntity.findByLogin", query = "SELECT u FROM UserEntity u WHERE u.login = :login")
    , @NamedQuery(name = "UserEntity.findByPasswordUser", query = "SELECT u FROM UserEntity u WHERE u.passwordUser = :passwordUser")})
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "login")
    private String login;
    @Column(name = "password_user")
    private String passwordUser;
    @OneToMany(mappedBy = "idUser")
    private Collection<AccountEntity> accountEntityCollection;

    public UserEntity(String login, String passwordUser) {
        this.login = login;
        this.passwordUser = passwordUser;
    }

    public UserEntity(Integer idUser, String login, String passwordUser) {
        this.idUser = idUser;
        this.login = login;
        this.passwordUser = passwordUser;
    }

    public UserEntity() {
    }

    public UserEntity(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @XmlTransient
    public Collection<AccountEntity> getAccountEntityCollection() {
        return accountEntityCollection;
    }

    public void setAccountEntityCollection(Collection<AccountEntity> accountEntityCollection) {
        this.accountEntityCollection = accountEntityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserEntity)) {
            return false;
        }
        UserEntity other = (UserEntity) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "idUser=" + idUser + ", login=" + login + ", passwordUser=" + passwordUser + ", accountEntityCollection=" + accountEntityCollection + '}';
    }

}
