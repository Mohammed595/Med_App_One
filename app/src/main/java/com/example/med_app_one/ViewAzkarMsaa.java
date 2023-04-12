package com.example.med_app_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewAzkarMsaa extends AppCompatActivity {
    ListView listView ;
    Button btnNext ;

    ArrayList <Post> posts ;

    int counter ;
    int c ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_azkar_msaa);

        listView= findViewById(R.id.listView_var);
        btnNext = findViewById(R.id.btnNext);
        posts = new ArrayList<>();

        MyAdapter adapter = new MyAdapter( ViewAzkarMsaa.this,posts);
        listView.setAdapter(adapter);
        counter = 1 ;
        c = 2 ;

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter == 5){
                    counter = 10 ;
                    btnNext.setText("أنتهى");
                }else {
                    Post  p = update(posts, counter);
                    adapter.notifyDataSetChanged();
                    ++counter ;
                }



            }
        });

    }

   public Post update (ArrayList <Post> p, int count){

        Post post, post0 , post1, post2, post3, post4 ;

        if (count == 0) {
            post = new Post("test", "plaplaplapl");
            p.add(post);
            return post ;

        }else if (count == 1){
            post1 = new Post("آية الكرسي", "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَن ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلاَّ بِمَا شَاء وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ.");
            p.add(post1);
            return  post1 ;
        }else if (count == 2) {
             post2 = new Post("سورة التوحيد", "قُلْ هُوَ ٱللَّهُ أَحَدٌ، ٱللَّهُ ٱلصَّمَدُ، لَمْ يَلِدْ وَلَمْ يُولَدْ، وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ. ");
            p.add(post2);
            return  post2 ;
        }else if (count == 3){
           post3 = new Post("سورة الفلق", "قُلْ أَعُوذُ بِرَبِّ ٱلْفَلَقِ، مِن شَرِّ مَا خَلَقَ، وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ، وَمِن شَرِّ ٱلنَّفَّٰثَٰتِ فِى ٱلْعُقَدِ، وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ.");
            p.add(post3);
        }else if (count == 4) {
            post4 = new Post("سورة الناس", "قُلْ أَعُوذُ بِرَبِّ ٱلنَّاسِ، مَلِكِ ٱلنَّاسِ، إِلَٰهِ ٱلنَّاسِ، مِن شَرِّ ٱلْوَسْوَاسِ ٱلْخَنَّاسِ، ٱلَّذِى يُوَسْوِسُ فِى صُدُورِ ٱلنَّاسِ، مِنَ ٱلْجِنَّةِ وَٱلنَّاسِ.");
            p.add(post4);
            return  post4;
        }
        return  null ;
    }

}