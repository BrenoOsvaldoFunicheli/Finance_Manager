/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author osval
 */
@Entity
@Table(name = "tb_item_finnance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemFinnanceEntity.findAll",
            query = "SELECT i FROM ItemFinnanceEntity i")

    , @NamedQuery(name = "ItemFinnanceEntity.findByIdItemFinnance",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.idItemFinnance = :idItemFinnance")

    , @NamedQuery(name = "ItemFinnanceEntity.getAllExpense",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.tipoItem = 'DESPESA'")

    , @NamedQuery(name = "ItemFinnanceEntity.findExpenseWithIdAccount",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.tipoItem = 'DESPESA' AND i.idAccount = :idAccount")

    , @NamedQuery(name = "ItemFinnanceEntity.sumOfExpense",
            query = "SELECT SUM(i.valueItem*i.quantity) FROM ItemFinnanceEntity i WHERE i.tipoItem = 'DESPESA' AND i.idAccount = :idAccount")

    , @NamedQuery(name = "ItemFinnanceEntity.sumOfRecipe",
            query = "SELECT SUM(i.valueItem*i.quantity) FROM ItemFinnanceEntity i WHERE i.tipoItem = 'RECEITA' AND i.idAccount = :idAccount")

    , @NamedQuery(name = "ItemFinnanceEntity.findRecipeWithIdAccount",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.tipoItem = 'RECEITA' AND i.idAccount = :idAccount")

    , @NamedQuery(name = "ItemFinnanceEntity.getAllRecipe",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.tipoItem = 'RECEITA'")

    , @NamedQuery(name = "ItemFinnanceEntity.findByNameItem",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.nameItem = :nameItem")

    , @NamedQuery(name = "ItemFinnanceEntity.findByDescrib",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.describ = :describ")

    , @NamedQuery(name = "ItemFinnanceEntity.findByValueItem",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.valueItem = :valueItem")

    , @NamedQuery(name = "ItemFinnanceEntity.findByQuantity",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.quantity = :quantity")

    , @NamedQuery(name = "ItemFinnanceEntity.findByDateItem",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.dateItem = :dateItem")

    , @NamedQuery(name = "ItemFinnanceEntity.findByTipoItem",
            query = "SELECT i FROM ItemFinnanceEntity i WHERE i.tipoItem = :tipoItem")})
public class ItemFinnanceEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_item_finnance")
    private Integer idItemFinnance;
    @Column(name = "name_item")
    private String nameItem;
    @Column(name = "describ")
    private String describ;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "value_item")
    private BigDecimal valueItem;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "date_item")
    @Temporal(TemporalType.DATE)
    private Date dateItem;
    @Basic(optional = false)
    @Column(name = "tipo_item")
    private String tipoItem;
    @JoinColumn(name = "id_account", referencedColumnName = "id_account")
    @ManyToOne
    private AccountEntity idAccount;

    public ItemFinnanceEntity() {
    }

    public ItemFinnanceEntity(Integer idItemFinnance) {
        this.idItemFinnance = idItemFinnance;
    }

    public ItemFinnanceEntity(Integer idItemFinnance, String tipoItem) {
        this.idItemFinnance = idItemFinnance;
        this.tipoItem = tipoItem;
    }

    public Integer getIdItemFinnance() {
        return idItemFinnance;
    }

    public void setIdItemFinnance(Integer idItemFinnance) {
        this.idItemFinnance = idItemFinnance;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public BigDecimal getValueItem() {
        return valueItem;
    }

    public void setValueItem(BigDecimal valueItem) {
        this.valueItem = valueItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDateItem() {
        return dateItem;
    }

    public void setDateItem(Date dateItem) {
        this.dateItem = dateItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public AccountEntity getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(AccountEntity idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItemFinnance != null ? idItemFinnance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemFinnanceEntity)) {
            return false;
        }
        ItemFinnanceEntity other = (ItemFinnanceEntity) object;
        if ((this.idItemFinnance == null && other.idItemFinnance != null) || (this.idItemFinnance != null && !this.idItemFinnance.equals(other.idItemFinnance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemFinnanceEntity{" + "idItemFinnance=" + idItemFinnance + ", nameItem=" + nameItem + ", describ=" + describ + ", valueItem=" + valueItem + ", quantity=" + quantity + ", dateItem=" + dateItem + ", tipoItem=" + tipoItem + ", idAccount=" + idAccount + '}';
    }

}
