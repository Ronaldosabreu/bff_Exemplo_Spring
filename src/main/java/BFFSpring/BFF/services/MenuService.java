package BFFSpring.BFF.services;

import BFFSpring.BFF.domain.integrations.IMenuData;
import BFFSpring.BFF.model.MenuDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    @Autowired
    IMenuData _iMenuData;

    public MenuDataResponse menu()
    {
        var menudata = _iMenuData.getMenu();
        MenuDataResponse data = new MenuDataResponse();
        data.setData(menudata);

        return data;
    }
}
