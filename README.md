# Yakup Sipahi Enoca Challenge Soru ve Cevapları
**1 )** MVC kavramını açıklar mısınız ? Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor.
Object Oriented katmanları nelerdir ?
<details>
  <summary>Cevap</summary>

- **MVC** : Model-View-Controller, üç bileşenden oluşan bir tasarım desenidir.
- Bir uygulamanın temel bileşenlerini ayri tutarak daha organize ve bakimi kolay hale getirir.
- **_Model_** : Uygulamanin veri yapisini ve is mantigini temsil eder. Veri tabanina erisim, verilerin saklanmas, islenmesi, guncellenmesi ile ilgili islemleri bulunduran katmandir.
- **_View_** : Kullanicinin goruntulemesini istedigimiz web sayfalarini olusturdugumuz katman.
- **_Controller_** : Model ve View katmanlari arasindaki iletisimi saglar. Kullanici islemlerinin yapildigi yerdir.
- Kisacasi projemizde kullandigimiz yapilari katmanlamak icin MVC design pattern kullaniyoruz boylece, veritabani icin bir katman, sorgularimiz icin ayri bir katman ve son kullaniciya sunulacak olan ekran icin ayri bir katman olusturmaktir.
- **Neden MVC ?** : MVC ile uygulama daha iyi yonetilebilir ve bakimi daha kolay hale gelir. Bu uc katman ayri ayri test edilebilirler ve yeni ozellikler, ornegin _view_'da bir degisiklik yapmak istedigimizda _Model_ katmaninda bir degisiklik yapmamiza gerek olmaz.
</details>

---
**2 )** Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X
platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim
halinde request-response ilişkisi kurması gerekiyor. Bu yapıyı nasıl sağlarız.
<details>
  <summary>Cevap</summary>

- **Web service'leri** kullanarak farklı platformlar arasında iletisim kurabiliriz.(örn: SOAP, `RESTful`)
- Örneğin **REST** mimarisini kullanarak client-server arasindaki iletisim HTTP protokolu sayesinde kolay bir sekilde yapilir.
- **REST** mimarisinde bilgiler URI'lar uzerinden sunulur.(orn: http://localhost:8080/api/jobs/1). **RESTful web servisleri** ise, REST mimarisi temel alınarak geliştirilmiş hafif, genişletilebilir ve basit servislerdir.
- **RESTful servis**'lerin amaci client-server arasindaki veri akisini platformdan bagimsiz olarak gerceklestirebilmek ve veri akisini en az yukle saglayabilmektir.
- **RESTful servis**'ler response tipi olarak _JSON_, _HTML_, _XML_ gibi formatlar dondurebilir.
- **X** platformunda Java ve Spring Boot ile **RESTful API**'lar olusturulur.
- **X** platformu bir **RESTful servis** oldugu icin HTTP'nin tum metodlarini destekler ve **Y** platformundan gelen istege gore response dondurur.
</details>

---
**3 )** Bir web sayfasında ekran sürekli Backend’ den veya bir başka yapı tarafından
güncelleniyor. Siz, web sayfasını refresh etmeden bu güncel bilgiyi anlık ekrana nasıl
yansıtırsınız.
<details>
  <summary>Cevap</summary>

- Bu islem **WebSocket** teknolojisi kullanilarak gerceklestirilebilir.
- **WebSocket** bir istemci ve bir sunucu arasinda bir baglanti olusturmak ve aralarinda gercek zamanli olarak iletisimi saglamak icin gelismis bir teknolojidir.
</details>

---
**4 )** Bir for döngüsü ile aşağıdaki çıktıyı yazar mısınız.
```
*
**
****
******
********
**********
```
<details>
  <summary>Cevap</summary>

```java
    public static void main(String[] args) {
        System.out.println("*");
        for(int i = 1; i < 6; i++){
            System.out.println("*".repeat(i * 2));
        }
    }
```
</details>

---
**5 )** Firmada çalışman için sana remote bir linux server verildi. Elinde ip adresi port bilgisi
kullanıcı adi ve şifren var. Server a erişimi nasıl test edersin, Server a nasıl erişirsin, Server a
nasıl dosya atarsın, Serverdan nasıl dosya çekersin.
<details>
  <summary>Cevap</summary>

- erisim
```
ssh kullanici_adi@sunucu_ip -p port_numarasi
```
- dosya atma
```
scp gonderilecek_dosya kullanici_adi@sunucu_ip:gonderilecek_yer
scp a.txt yakupsipahi@192.168.1.7:/home/java/documents/
```
- dosya cekme
```
scp kullanici_adi@sunucu_ip:dosya_path dosya_adi
scp yakupsipahi@192.168.1.7:/home/java/documents/ a.txt
```
</details>

---
**6 )** Local database kurulumu (mysql, postgresql veya herhangi bir database)
- Java spring uygulaması ayağa kaldırılması,
- İki adet tablo yer alamalı ve bu tabloların birbirleriyle bağı olmalıdır. (Örn: şirket ve çalışan
gibi),
- Java spring uygulamasında ekleme,silme,güncelleme,listeleme gibi servisler yer almalıdır ve
responseda yapılan işlem detayı return edilmelidir.
- Ekleme,silme,güncelleme,listeleme işlemlerini postman vb ile işlem yapılabilmelidir.
Bu adımlar sırasıyla izlenip java uygulaması üzerinden database’ e kayıt atılmalı (Herhangi
bir kayıt olabilir fark etmez. Database'de bir tablo açılıp o tabloya değer girilmesi java isteği
üzerinden). Daha sonra aynı istek atılan uygulama ile (örnek postman ...) get ve list java
spring endpointleri çağırılarak, database e atılan kayıt response olarak dönülmeli.
MVC deki model ve kontroller akışının güzel kurgulanması ve uygulama ayağı nasıl
kaldırılıp servislerin nasıl kullanıldığına dair bir döküman hazırlanmalıdır. Bu proje için
kaynak kodu ile iletilmesi gerekmektedir.
<details>
  <summary>Cevap</summary>

- Spring uygulamanızın kaynak kodlarını derlemeniz ve gerekli bağımlılıkları (dependencies) içeren bir paket veya JAR (Java ARchive) dosyası oluşturmanız gerekir.
</details>

---
**7 )** Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql
programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu
düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından
sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query=
kısmını nasıl doldurmalıyım?
<details>
  <summary>Cevap</summary>

- something
</details>

















