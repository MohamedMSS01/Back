package backtest.demo;



import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String inventoryStatus;
    private String category;
    private String image;
    private Integer rating;

    

    //Getter methods
    public Long getId() {
        return id;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public String getInventoryStatus() {
        return inventoryStatus;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getImage() {
        return image;
    }

    public Integer getRating() {
        return rating;
    }
    
    //Setter methods
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
