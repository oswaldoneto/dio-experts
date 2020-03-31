package digitalinnovation.one.experts.shoppingcart.shoppingcart.repository;

import digitalinnovation.one.experts.shoppingcart.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
