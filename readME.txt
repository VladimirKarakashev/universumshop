"Когато човек не знае какво иска да постигне - го постига много трудно!"
                                                                  - народна мъдрост

По същество:

1) описание на свършеното

2) какво не успях да накарам да работи

======================================

1) 

+ приложението се намира на стандартния адрес http://localhost:8080

+ приложението ползва inMemory h2 база от данни, която с малко рефакторинг може да се превърне в постоянна
    
    + влизането става с име и парола, които са във формат на едниствената форма на Spring Security, която успях да реализирам - inMemoryAuthentication()

        + потребител с име "user" има парола "123" и роля "USER"

            - потребител "user" има достъп до начална страница, "контакти" и "телескопи"


            + в "телескопи" се зареждат хардкоуднати артикули (общо 9)

                - продуктите могат бъдат сортирани по два критерия - "категория" и "марка"


        + потребител с име "admin" има парола "321" и съответно роля "ADMIN"

            - Админа има достъп до h2 конзолата (http://localhost:8080/h2) и /adminpanel частта на приложението

            + Админпанела се намира на http://localhost:8080/adminpanel и също може да се достъпи с клик върху малкото бяло слънце в долния ляв край на footer-а

                + тук в графата "продукти" администраторът може да прави CRUD заявки изразяващи се в "добавяне", "редакция" и "изтриване" на продукт 

                    - итформацията за всеки продукт се съхранява на части в общо 4 таблици в h2 базата (което не съм сигурен дали отговаря на изискването в заданието за проекта, но това успях да сътворя)

2) 

Имах следните идеи:

- база данни от регистрирани потребители 

- база данни от поръчки, съдържащи продукти


П.П. - изготвено с Intellij без никакви адони, в случай че има значение =) 