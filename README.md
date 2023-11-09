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
**7 )** Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql
programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu
düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından
sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query=
kısmını nasıl doldurmalıyım?
<details>
  <summary>Cevap</summary>

- **updateAt** alanında 2020 Ocak ayından sonraki verileri getirmek icin query su sekilde olabilir : 
```
http://example?query=updateAt:[2020-01-01T00:00:00Z TO *]
```
- Bu query, **updateAt** alanının 2020 Ocak ayından sonraki tarihler arasında olan verileri getirecektir.
- Burada `TO *` ifadesi, belirtilen tarihten sonraki tüm verileri ifade eder.
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

##### Employees Table
![employee-table](https://github.com/ykpsph/enoca-challenge/assets/52661595/ea163a2d-6722-4590-9dc6-63e1245e09fd)

##### Departments Table
![department-table](https://github.com/ykpsph/enoca-challenge/assets/52661595/8979667f-ff15-4e66-8790-5b7aa0b482b3)


- **Employee** tablosu uzerinde Postman kullanilarak gerceklestirilen CRUD operasyonlari :
- Add Employee
![Add Employee](https://github.com/ykpsph/enoca-challenge/assets/52661595/86c28ecb-ec64-4808-a058-4cac62fdfa56)
- Get All Employees
![7-employee-getall](https://github.com/ykpsph/enoca-challenge/assets/52661595/86c60dea-2117-448a-8cc4-346e88948fc4)
- Get Employee By Id
![8-employee-getbyid](https://github.com/ykpsph/enoca-challenge/assets/52661595/5c61636e-e049-4b9e-9270-df301dd40b64)
- Update Employee 1
![11-employee-before-update](https://github.com/ykpsph/enoca-challenge/assets/52661595/31e0ca5f-4df1-4737-8cbf-2c2be5595c61)
- Update Employee 2
![12-employee-after-update](https://github.com/ykpsph/enoca-challenge/assets/52661595/f7384792-2605-44cd-b5a3-b56651d832a1)
- Delete Employee 1
![9-employee-before-deleting](https://github.com/ykpsph/enoca-challenge/assets/52661595/078ed231-67d3-4b86-bdc0-b7ebed183f0b)
- Delete Employee 2
![10-employee-after-deletion](https://github.com/ykpsph/enoca-challenge/assets/52661595/09919f44-becd-4aeb-ac09-a76ddb76ff74)

- **Department** tablosu uzerinde Postman kullanilarak gerceklestirilen CRUD operasyonlari :
- Get All Departments
![3-department-get-all](https://github.com/ykpsph/enoca-challenge/assets/52661595/33c1d9c7-8a85-4130-998d-be0d32a18713)
- Get Department By Id
![4-department-getbyid](https://github.com/ykpsph/enoca-challenge/assets/52661595/535c3daa-66bb-4bf4-8b5a-3dc6e54f061e)
- Update Department
![5-department-update](https://github.com/ykpsph/enoca-challenge/assets/52661595/e35ae244-b314-4e99-83a3-f5082aaddca3)
- Delete Department 1
![1-department-before-delete](https://github.com/ykpsph/enoca-challenge/assets/52661595/dbeacc96-6bf0-449a-859c-b8fb84b62109)
- Delete Department 2
![2-department-after-deletion](https://github.com/ykpsph/enoca-challenge/assets/52661595/e5c0cb3e-4a1f-44f6-b6e8-04b893ea0245)







</details>

















