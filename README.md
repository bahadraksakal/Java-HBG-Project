# Similarity Of Gene Sequences Align With Chi-Square Computational Biology App With Gui

### Ahmet Bahadır Aksakal

#### 20360859079

****

- [EN : Description :book: :leftwards_arrow_with_hook:](#en)  
- [TR : Açıklama :book: :leftwards_arrow_with_hook:](#tr)

****

#### [EN]

## Bursa Technical University - 2nd Year Spring Semester - Computational Biology Course Project Assignment

1. ### What the Program Does
    
     * This program compares two gene sequences and maps these gene sequences.

2. ### Technology and Languages Used in the Project:
    
     * java
     * Java - Swing
      
3. ### How to Use 
    
     * The program is run through the compiled java file.
     * The relevant gene sequence is copied into the first input window and the 'ok' button is clicked.
     * The relevant gene sequence is copied into the second input window and the 'ok' button is clicked.
     * The program will automatically map and visualize the relevant sequences.
      
4. ### Detailed Working Structure and Function Descriptions
    
     * #### Step 1:
        
         In order to perform the operation mentioned in our book, I had to get two matrices from the user. I performed this operation in the method called get sequence. At this stage, since we know that DNA sequences consist of A, C, G and T bases, I wrote a code that will not accept any other characters. I also designed the function to be case-insensitive.
        
     * #### Step 2:
        
         In order to create a dot matrix, I had to get the k number of the sequences (the number of bases) from the user, but since this process would lengthen the already long code and reduce its readability, and since the number k was always taken as two in the sample templates I encountered, I continued my operations by accepting k as two. I did. However, at this stage, instead of making a determination like k = 2, I directly wrote the code as if k = 2. Therefore, there is no such thing as the number k in the source code.
        
     * #### Step 3:
        
         I wrote a code that finds intersection points and plots these points in accordance with dot-matrix rules. If the points continue to intersect in accordance with these rules, I increased the score of this cell by +1 point.
        
     * #### Step 4:
        
         I created a window that displays the dot matrix we obtained using Jtable in the swing library in Java, colored.
        
     * #### Step 5:
        
         I tested the code and compared it with ready-made examples and tables to prove that it works without any problems.
        
5. ### Images from the Program:
    
    *   ![](GorsellerReadme/1.png)
    *   ![](GorsellerReadme/2.png)
    *   ![](GorsellerReadme/3.png)

   
****
****


#### [TR]

## Bursa Teknik Üniversitesi - 2. Sınıf Bahar Dönemi - Hesaplamalı Biyoloji Dersi Proje Ödevi

1.  ### Program Ne Yapar
    
    *   Bu program iki gen dizisini karşılaştırarak, bu gen dizilerini haritalamaktadır.

2.  ### Projede Kullanılan Teknoloji Ve Diller:
    
    *   Java
    *   Java - Swing
      
3.  ### Nasıl Kullanılır
    
    *   Program derlenmiş java dosyası üzerinden çalıştırılır.
    *   İlk gelen input pencresine iligi gen dizisi kopyalanır ve 'ok' butonuna tıklanır.
    *   İkinci gelen input pencresine iligi gen dizisi kopyalanır ve 'ok' butonuna tıklanır.
    *   Program otomatik olarak ilgili dizileri haritalandırıp görselleştirecektir.
      
4.  ### Detaylı Çalışma Yapısı Ve Fonksiyon Açıklamları
    
    *   #### Adım 1:
        
        Kitabımızda bahsi geçen işlemi yapabilmek için kullanıcadan iki adet matris almam lazımdı. Bu işlemi sekans al isimli metodun içinde gerçekleştirdim. Bu aşamada DNA dizilerinin A,C,G ve T bazlarından oluştuğunu bildiğimiz için başka karakterleri kabul etmeyecek bir kod yazdım. Aynı zamanda fonksiyonu büyük-küçük harfe duyarlı olmayacak şekilde tasarladım.
        
    *   #### Adım 2:
        
        Dot matrisi oluşturabilmek için sekansların k sayısı (bazlara kaçlı olarak bakılacığı)'nı kullanıcadan almam lazımdı fakat bu işlem zaten uzun olan kodu iyice uzatacağından ve oknurluğu düşereceğinden aynı zamanda karşılaştığım örnek şablonlarda k sayısını hep iki olarak alınmış olduğundan bende k yı iki kabul ederek işlemlerime devam ettim. Fakat bu aşamadı k=2 gibi bir belirleme yapmaktansa direkt olarak kodu k=2 imiş gibi yazdım. Bu nedenle k sayısı diye bir şey kaynak kodun içinde yok.
        
    *   #### Adım 3:
        
        Dot-matris kurallarına uygun olarak kesişim noktalarını bulan ve bu noktaları paunlayan bir kod yazdım. Bu kurallara uygun bir biçimde kesişen noktaların devam etmesi durumunda , bu hücrenin puanını +1 puan daha artırdım.
        
    *   #### Adım 4:
        
        Javada bulunan swing kütüphanesinin içindeki Jtable'ı kullanarak elde ettiğimiz dot matrisi renklendirilmiş olarak ekrana veren bir pencere yaptım.
        
    *   #### Adım 5:
        
        Kodu test ettim elimde hazır örnek ve tablolarla karşılaştırarak sorunsuzca çalıştığını ispatladım.
        
5.  ### Programdan Görseller:
    
    *   ![](GorsellerReadme/1.png)
    *   ![](GorsellerReadme/2.png)
    *   ![](GorsellerReadme/3.png)
