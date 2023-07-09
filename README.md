# Auction-Project-Spring-Jwt-Docker

# Proje Özellikleri

## Proje çalıştırmak için

* Proje git clone komutu ile bilgisayara indirilmelidir.
* Veritabanı olarak mysql kullanıldığı için kendi mysql veritabanımızı bağlamalıyız.
* application.properties dosyasına girerek burada veritabanı bağlantısını yapabiliriz.
* Daha sonra proje çalıştırılarak 8080 portundan görüntülenebilir.
* !! Veritabanı sıfırdan oluşturulursa ve Role hatası alınırsa veritabanında roles tablosuna 

INSERT INTO roles(name) VALUES ('ROLE_USER');
INSERT INTO roles(name) VALUES ('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES ('ROLE_ADMIN');

komutu ile roller eklenmelidir.
