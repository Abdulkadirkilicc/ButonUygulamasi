# ButonUygulamasi
- 1220505050 Abdulkadir Kılıç
# Buton Uygulamasi Çalıştırılması
- $ cd src/ && javac Main.java && java Main
# Buton Uygulamasi Hakkında Bilgi 
- Uygulamayı çalıştırdıktan sonra karşımıza aşşağıdaki gibi 4x4'lük 16 butonu olan  Buton Uygulaması çıkacaktır.
![1](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/4fb864bd-7ef2-45bd-addd-79d5dc653d0c)

- Butona tıklanıldığında ise tıklanılan buton aktif hale gelecektir.Diğer butonlara tıklanılmadığı için diğerleri pasif halde kalacaktır. 

![2](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/5ac4923d-b6de-4baa-9afb-3681eedeb6b5)

- Butona tıklanıldığında ise  bize hayali bir mutation olarak ekranda değişiklik yaptığımızı konsola  yazdıracak.
![4](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/101ca051-6f9d-4da4-b43c-317e828620f6)

- Birden fazla butonu aktif yapabiliriz. 
![3](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/dd561885-883f-4639-b5ef-2b8fc9f5b617)

- Bu butonlardan istediğimizi pasif hale getirebiliriz ve aşşağıdaki gibi ekran çıkacak karşımıza 
![4](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/9ae30d3c-294b-46dd-a2ed-a67fd84773ae)


- Bu değişikliklerden sonra karşımıza aşşağıdaki gibi ekran çıkacak, sırasıyla aktif hale getirdiğimiz ve pasif hale getirdiğimiz butonları konsola yazdıracak.

![5](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/c447e4c3-dc54-4189-ae5d-c0062aa38afb)

# GraphQL Nedir ve Ne İşe Yarar Kullanımı Nasıldır

GraphQL, modern web uygulamalarında veri sorgulama için kullanılan etkili bir dil ve çalışma zamanıdır. Geleneksel API sorgulama metodolojilerine alternatif olarak, istemcilere uygun veri taleplerini yönetme olanağı sunuyor. Karmaşık veri ilişkileri ve farklı veri kaynaklarıyla çalışan uygulamalarda avantajlı yerdedir. Esnek yapısı ve birleştirilmiş veri kaynaklarını etkili bir şekilde yönetme yeteneği bulunur, geliştiricilere etkileşimli bir çalışma ortamı sunar.
GraphQL, REST tabanlı web projelerindeki veri işleme zorluklarını aşmak için geliştirilmiştir. Proje özelliklerine göre farklı gereksinimleri karşılamak üzere tasarlanmış olup , veri sorgulama, güncelleme ve silme işlemlerini daha etkili bir şekilde yönetme olanağını bizlere sağlıyor. Farklı projelerdeki gereksinimleri düşünerek zaman ve zahmet emeği önemli ölçüde azaltıyor. Karmaşık sorguların hızlı bir şekilde oluşturulmasına imkan tanıyor.
Bunlardan yola çıkarak, GraphQL, veri sorgulama ve işleme süreçlerini optimize eden, esnek ve performanslı bir teknolojidir. Farklı dillerde geliştirilen web projelerine entegre edilebilir ve geniş veri setlerinin etkili bir şekilde yönetilmesine katkıda bulunabilir.
GrapQL karşımıza çıkan temel kavramlar şunlardır;
- Type (Tip) : Tipleri farklı türdeki verileri birbirlerinden ayırt etmek için kullanır ve tanımlarız.
- Field (Alan) : Bir veri tipinin kendine has özelliklerini belirten ve belirli bir tipte veri tutan alanları (field) vardır.
- Query (Sorgu) : Sunucudan, istenilen biçimdeki ve içinde veri olan yanıtı tanımlamak için kullanılan spesifik istektir.

- Sorgu (Query): İstemciler, ihtiyaç duydukları veriyi belirli bir yapıda sormak için GraphQL sorgularını kullanır. Bu sayede gereksiz verileri  önlenir ve istemcide sadece ihtiyacı olan veriyi alır veri kalabalığı önlenmiş olur.


![6](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/d2101bd0-2d1b-4daa-81ad-e26128e8199d)
- Bu sorgu, ID'si 100  olan bir kullanıcının adını ve e-posta adresini getirir. 



- Mutasyon (Mutation): Veri üzerinde değişiklik yapmak için kullanılır. Örneğin; Yeni veri eklemek, güncellemek veya silmek için mutasyonlar kullanılır.

![7](https://github.com/Abdulkadirkilicc/ButonUygulamasi/assets/115181323/7baada52-95c3-43a2-b7b1-4bd7bd486119)
- Bu mutasyon, ID'si 100 olan kullanıcının adını günceller.

Yani şu şekilde özetleyebiliriz;
- API geliştiricisi istemcinin üzerinde sorgu ve mutasyon gerçekleştirebileceği veri türlerini ve bahsi geçen sorgu ve mutasyonları tanımlamak için GraphQL şeması oluşturur. GraphQL şeması nesne tiplerinin, sorguların ve mutasyonların tanımından oluşur. Bu tanımlar belirli tipteki nesnelerin hangi alanlara sahip olduğunu, hangi veri tipinin sorgulanabileceğini, nasıl sorguların kullanılacağını ve hangi durumlarda sorgulanabileceğini belirtir. Ayrıca geliştirici query (sorgu) ve mutation (mutasyon) şemada belirtir. Belirtilen sorgu ve mutasyonlar geliştirici tarafından çözücü   fonksiyonlarla ilişkilendirilir. GraphQL tanımı yapılmış sorgu ve mutasyonları gerçekleştirmek için çözücülere ihtiyaç duyar.
İstemci ya da istemci geliştiricisi de API geliştiricisinin tanımladığı şema dahilinde kendi amacına uygun bir biçimde sorgu ve mutasyonları kullanabilir.

# GraphQL Avantajları

1. İstemcinin istediği verileri tek bir sorguda almasını sağlar. İstemci sorgusu backend server tarafında tek bir sorguda işlenir ve karşısında getirir.
2. Eksiksiz ve kesinlikle tanımlanmış veri tipleri kullanarak istemci ile sunucu arasında sağlıklı iletişim kurulmasını sağlar.
3. GraphQL için birçok açık kaynaklı eklenti bulunmaktadır. Bu eklentiler, REST API tarafından gerçekleştirilemeyen birçok işleve kolaylık tanır.
4. Projenin mimarisinden bağımsız olarak entegre edilebilir.
5. İstemciler, ihtiyaçlarına göre özelleştirilmiş veri alabilirler,  yukarıda bahsettiğimiz gibi bu sayede gereksiz veri transferini önler.
6. İstemciler, ihtiyacı olan veriyi sormak için kullanıcı tanımlı sorguları kullanır, bu da API'nin versiyon kontrolüne ihtiyaç duymasını azaltır.
7. Kendini açıkça belgeleme özelliği ile gelir. Bu sayede geliştiriciler, API'yi daha iyi anlar.

# GraphQL Dezavantajları

1. Veri sorgulama işlemlerinin büyük bir kısmını sunucu tarafında gerçekleştirir. Bu, istemci tarafından özelleştirilmiş sorguların sunucu tarafında işlenmesini gerektirir.
2. REST API'lerden geçiş yapan geliştiriciler, GraphQL'in kavramlarını öğrenmekte zorluk çekebilirler.
3. GraphQL'de önbellekleme, özellikle karmaşık ilişkilerle uğraşan projelerde daha karmaşık bir işlemdir. Veri taleplerinin dinamik olması önbellekleme stratejilerini uygulamayı zorlaştırabilir.
4. Karmaşık veri ihtiyaçlarına sahip projelerde, bazı GraphQL sorguları çok fazla kaynağı etkileyebilir. Bu durum performans sorunlarına yol açabilir.
5. Doğru bir şekilde yapılandırılmamış bir GraphQL API, güvenlik açıklarına neden olabilir. İstemcilerin sadece gerekli veriye erişmelerini sağlamak gerekiyor.







