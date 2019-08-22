package com.dicoding.rifaniisa.skincare.model;

import java.util.ArrayList;

public class SkincareData {
    public static String[][] data = new String[][]{
            {"Innisfree Greentea Seed Serum",
                    "Krim lembut yang kaya akan hidrasi dan anti oksidan dari perasan dan minyak biji Jeju Green Tea untuk mengembalikan dan membantu menjaga kelembapan kulit agar tampak bercahaya dan sehat.",
                    "http://www.innisfree.com/id/id/upload/product/22324_l.png", "RP. 370.0000"},
            {"Innisfree Greentea Seed Cream",
                    "Krim pelembap dari formula perasaan Jeju green tea organic dan green tea seed oil yang kaya akan kandungan kelembapan dan nutrisi \n" +
                            "Kombinasi formula perasan Jeju green tea organic yang mengisi kandungan kelembapan pada kulit kering dan green tea seed oil yang mengunci kelembapan pada kulit menghasilkan wajah sehat dan lembap terawat sepanjang hari.",
                    "http://www.innisfree.com/id/id/upload/product/22337_l.png","RP. 340.0000"},
            {"Innisfree Greentea Balancing Skin",
                    "Beauty green tea merawat kulit menjadi lebih lembab \n" +
                            "Fresh green tea water yang sangat efektif sebagai pelembab diserap pada kulit secara cepat sehingga membantu kulit menjadi lebih sehat. ",
                    "http://www.innisfree.com/id/id/upload/product/27850_l.png", "RP. 240.0000"},
            {"Innisfree Greentea Balancing Lotion",
                    "Beauty green tea merawat kulit menjadi lebih lembab dan lembut \n" +
                            "Fresh green tea water yang sangat efektif sebagai pelembab diserap pada kulit secara cepat dan melindungi kulit dengan lapisan kelembaban sehingga terasa lebih halus ",
                    "http://www.innisfree.com/id/id/upload/product/27851_l.png", "RP. 240.0000"},
            {"Innisfree Greentea Cleansing Foam",
                    "Cleanser bertekstur gel yang halus tanpa gelembung \n" +
                            "Cleanser bertekstur gel yang halus tanpa gelembung tetap dapat melembabkan kulit tanpa rasa kaku.",
                    "http://www.innisfree.com/id/id/upload/product/29860_l.png", "RP. 135.0000" },
            {"Innisfree Greentea Cleansing Oil",
                    " Menghapus make-up, menghaluskan kulit \n" +
                            "Minyak bertekstur halus dan penuh kelembaban menghapus make-up, membersih kotoran sampai dalam pori-pori sehingga tekstur kulit menjadi lebih halus dan cerah.",
                    "http://www.innisfree.com/id/id/upload/product/27870_l.png", "RP. 270.0000"},
            {"Innisfree Greentea Seed Eye & Face Ball",
                    "Roller ball 'essence' massage \n" +
                            "Memijat kulit sekitar mata dengan roller ball dengan essence sehingga membuat kulit sekitar mata lebih vitalitas.",
                    "http://www.innisfree.com/id/id/upload/product/27864_l.png", "RP. 290.0000"},
            {"Innisfree Greentea Seed Essence-In-Lotion",
                    " Membuat kulit lebih lembab dengan nourishing yang diekstraksi dari essence dan lotion.Bertekstur seperti susu dengan daya lekat yang tinggi sehingga kelembaban dapat bertahan lama  ",
                    "http://www.innisfree.com/id/id/upload/product/27865_l.png", "RP. 330.0000"},
            {"Innisfree Greentea Seed Eye Cream",
                    "Eye cream yang memberi kelembaban pada kulit yang sensitif sekitar mata.  Nourishing eye cream untuk merawat kulit sekitar mata dengan kelembaban. Tekstur kream yang halus dan dapat melekat pada kulit kering sekitar mata  ",
                    "http://www.innisfree.com/id/id/upload/product/27862_l.png", "RP. 350.0000"},
            {"Innisfree Greentea Sleeping Mask",
                    " Bertekstur gel yang penuh kelembaban \n" +
                            "Fresh green tea water yang sangat efektif untuk memberi kelembaban terasa segar saat digunakan dan diserap secara cepat pada kulit.",
                    "http://www.innisfree.com/id/id/upload/product/27867_l.png", "RP. 220.0000"},

    };

    public static ArrayList<Skincare> getListData(){
        ArrayList<Skincare> list = new ArrayList<>();
        for (String[] aData : data) {
            Skincare sc = new Skincare();
            sc.setName(aData[0]);
            sc.setFunction(aData[1]);
            sc.setPhoto(aData[2]);
            sc.setPrice(aData[3]);

            list.add(sc);
        }

        return list;
    }

}
