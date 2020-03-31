package digitalinnovation.one.experts.shoppingcart.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {

    private Integer productId;
    private Integer amount;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
