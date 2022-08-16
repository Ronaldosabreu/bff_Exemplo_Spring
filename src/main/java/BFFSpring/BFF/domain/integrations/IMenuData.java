package BFFSpring.BFF.domain.integrations;


import BFFSpring.BFF.domain.entity.Menu.ListMenus;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "menu", url="http://localhost:3000/data")
public interface IMenuData {

    @GetMapping(value = "")
    @Headers("Content-Type: application/json")
    ListMenus getMenu();
}
