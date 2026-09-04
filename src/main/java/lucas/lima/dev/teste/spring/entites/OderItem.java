package lucas.lima.dev.teste.spring.entites;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lucas.lima.dev.teste.spring.entities.pk.OrderItemPK;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_oder_item")
public class OderItem implements Serializable {

    @EmbeddedId
    private OrderItemPK id;

    private Integer quantity;
    private Double price;

    public OderItem(){

    }
    public OderItem( Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OderItem oderItem = (OderItem) o;
        return Objects.equals(id, oderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
