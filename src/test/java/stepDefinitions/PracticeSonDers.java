package stepDefinitions;

public class PracticeSonDers {

    /*
    Selenium Nedir?
Selenium web uygulamalarını test etmek için kullanılan açık kaynaklı (open source) bir otomasyon aracıdır.
Peki selenium neden bir framework değilde bir araç olarak adlandırılır?
Çünkü birden fazla framework kullanımı hatta hibrit mantıkla bir arada kullanımına olanak sağladığı ve bu bağlamda farklı görevler üstlenen araçlara sahip olduğu için.
Mesela Cucumber framework'ü insaa ettiğimiz zaman hem Junit  hemde TestNG kütüphanelerinden istifade ederiz
Seleniumun Avantajları?
Bu soru neden seleniumu tercih edersiniz şeklinde de sorulabilir?
Açık kaynaklı olması, genis bir kullanıcı kitlesi ve bunların bilgi paylasim portalları mevcuttur.
Ücretsizdir.
Birçok browser için destek sağlaması(chrome, mozilla, edge..)
Farklı programlama dilleri ile çalışması(java, phyton, c++,)
Tüm işletim sistemleri ile uyumludur(Microsoft, Linux, Mac)
Seleniumun dezavantajları?
Bu soru selenium da otomasyon yapılamayan nesneler şeklinde de gelebilir?
Proglama dili bilmeniz gerekir.
Sadece web tabanlı uygulamalar ile çalısır.
Performans testleri yapmaz, daha çok fonksiyonel testlere odaklanır
CAPTCHA mümkün değildir (ben robot değilim)
Api testi yapılamaz
Açık kaynaklı olduğundan profesyonel bir müşteri hizmetleri yoktur.
Grafik, barkod, resim, şekil vs.. otomasyonu desteklemez
Locator (yer bulucu) nedir?
Web sayfası içinde unique (eşsiz, tek) bir web elementi tanımlayan bir adres olarak tarif edilebilir.
Bu sayede Selenium da farklı locator tiplerini kullanarak doğru ve isabetli  bir şekilde web elementi tanımlayabiliriz
Site üzerindeki bir elemente örneğin giriş butonuna selenium ile tıklama işlemi yaptırmak istediğimizde bu işlemi locator’lar aracılığıyla yaparız. Selenium ile geliştirmek istediğimiz test otomasyonlarında locator’ları kullanarak ilgili alanlara veri gönderebilir, tıklama işlemi yaptırabilir, var olan içeriği temizleyebiliriz.
Locator çeşitleri?
id, name, tagname, linkText, partialLinkText, xpath, css,classname
Testlerinizi otomate ederken genellikle hangi locator'ı tercih edersiniz
Bir otomasyonda locate olarak ilk akla gelen id dir.
Çünkü id sistemlerin unique olarak atadığı benzersiz bir kullanıcı numarasıdır. Bizde locate alırken unique olamasına dikkat ederiz.
Unique olmayınca aldığımız web elementin adresi net olmayacak ve otomasyon yaparken hangi element olduğunu bulamayacaktır
Ancak her HTML kodu düzenli olmadığından id ile locate alma işlemi herzaman mümkün olmaz.
Ozamanda diğer locatorlara bakarız
Bu arada Web elementi bulma noktasında en garantili olduğunu düsündüğüm xpath ile locate almayı da tercih ederim
Elbette duruma göre uygun olursa name, tagname ....vs diğer locatorlar ilede bu islemi yapmak mümkündür.
Relative Xpath ile Absolute Xpath arasındaki farklar
1 Absolute XPath
Öğeyi bulmanın doğrudan yoludur, ancak Absolute XPath’ın dezavantajı, öğenin yolunda herhangi bir değişiklik yapılması durumunda XPath’ın başarısız olmasıdır.
Relative xpath:
Relative Xpath için path (öğe yolu), HTML DOM yapısının ortasından başlar. Çift eğik çizgi (//) ile başlar, yani öğeyi web sayfasının herhangi bir yerinde arayabilir.
driver.close() ile driver.quit() arasındaki fark nedir?
driver.close() =>mevcut browser ı kapatır
driver.quit()  =>açık olan tüm browserları kapatır.
Findelement ile Findelements arasındaki farklar nelerdir?
Her iki methodda bir web sayfasında webelement bulmak için kullanılır.
findElement(); web sayfasında bir adet elementi bulmak için kullanılır ve sadece bir webelement döndürür.
Webelementi bulamazsa exception (nosuchelement exception) fırlatır.
findElements(); birden fazla webelement bulmak için kullanılır ve Webelements listesi döndürür. Şayet elementleri bulamazsa exception fırlatmaz boş bir liste döndürür.
Selenium'da Page Object Model (Page Object Model) nedir? Tarif edermisiniz?
POM, seleniumda bir çesit design pattern (tasarım modeli) dir
bu tasarım modeli yaygın olarak ortaya çıkan yazılım problemlerinin çözümü için bir standart ortaya koyar.
Bu standart ile clean kod yazımı, daha az kod, daha kullanıslı bir tasarım ve zaman ile paradan tasarruf sağlanabilir.
Naming convention gereği doğru isimlendirmeler ile takım çalısmasında baska bir arkadasımızın da kolaylıkla bu tasarımı kullanabilmesini sağlar ve daha sürdürülebilir bir framework meydana getirebiliriz.
POM ile dizayn edilmis framework, kodların daha reusable, ve daha readable ve maintainable (=bakımı kolay yapılabilir) olmasını sağladığı gibi değisikliklerin daha kolay ve hızlı bir sekilde uygulanabilir olması dinamik bir framework ile çalısma imkanı da sağlar.
Frameworkümüzü oluşturan packagelerin, sayfaların tasarım modeli ve arasındaki ilişkilerin doğru tanımlanması ile sorunsuz çalışan yapıya POM denir.
**No such Element exception aldığınızı varsayalım ne yaparsınız?
Locatorun doğru olup olmadığını kontrol ederim
Senkronizasyon sorunu olabilir. Bu durumda wait eklereyerek düzeltmeyi denerim.
sayfada iframe olabilir. ilgili locator iframe içerisinde kalmıs ise driver bu locatoru bulamaz .

     */






}
