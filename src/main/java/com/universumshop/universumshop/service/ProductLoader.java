package com.universumshop.universumshop.service;

import com.universumshop.universumshop.model.Product;
import com.universumshop.universumshop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductLoader {

    public ProductRepo productRepo;

    @Autowired
    public ProductLoader(ProductRepo productRepo) {
        this.productRepo = productRepo;
        LoadProducts();
    }

    private void LoadProducts() {
        productRepo.save(new Product(
                1L,
                "Levenhuk ",
                "Labzz T3",
                120f,
                "начинаещи",
                "/labbz_t3.jpg",
                "Асимудален монтаж, х179 максимално увеличение. " +
                        "Чедусен телескоп за всеки начинаещ астро-наблюдател!"

        ));

        productRepo.save(new Product(
                2L,
                "Levenhuk ",
                "Labzz D1",
                89f,
                "начинаещи",
                "/labzz_d1.jpg",
                "Чудесен подарък за деца и начинаещи. " +
                        "Добсънов монтаж, лесен и удобен за употреба."

        ));

        productRepo.save(new Product(
                3L,
                "Meade ",
                "LightBridge Plus 10\"",
                1590f,
                "напреднали",
                "/meade_lightbridge_10.jpg",
                "254мм обектив, ф=1250мм, Олекотен дизайн, " +
                        "лесно сглобяване - за отдадените на хобито!"

        ));

        productRepo.save(new Product(
                4L,
                "Bresser ",
                "NatGeo 114/900 AZ",
                390f,
                "начинаещи",
                "/bresser_ng.jpg",
                "114мм обектив, 900мм фокусно разстояние. " +
                        "За наблюдение на обекти в дълбокия космос."

        ));

        productRepo.save(new Product(
                5L,
                "Celestron ",
                "FirstScope",
                175f,
                "начинаещи",
                "/celestron_first.jpg",
                "Компактен но достатъчно мощен с добсънов монтаж, " +
                        "този телескоп е чудесен за встъпване в хобито."

        ));

        productRepo.save(new Product(
                6L,
                "Celestron ",
                "PowerSeeker 114EQ",
                495f,
                "напреднали",
                "/celestron_pwrseek.jpg",
                "Среден по размер, достатъчно мощен " +
                        "за наблюдение на мъглевини и далечни галактики."

        ));

        productRepo.save(new Product(
                7L,
                "Celestron ",
                "NexStar 6SE",
                3395f,
                "напреднали",
                "/celestron_nexstar_6se.jpg",
                "150мм, ф=1500мм, автоматично следене на обекти " +
                        "от собствена база данни с 40000 небесни тела!!!"

        ));

        productRepo.save(new Product(
                8L,
                "Meade ",
                "EclipseView 76",
                375f,
                "начинаещи",
                "/meade_eclipseview.jpg",
                "EclipseView е предназначен за безопасно " +
                        "наблюдение на слънцето! Яко, а?!"

        ));

        productRepo.save(new Product(
                9L,
                "Meade ",
                "LX85 5\"",
                2635f,
                "напреднали",
                "/meade_lx86.jpg",
                "Възможност за монтаж на камера, база с 30000 небесни тела. " +
                        "Екваториален монтаж с перфектен баланс!"

        ));


    }

}
