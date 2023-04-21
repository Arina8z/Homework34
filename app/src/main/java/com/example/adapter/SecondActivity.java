package com.example.adapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Dog> dogs = new ArrayList<Dog>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_breed);

        // создадим адаптер и загрузим в него контейнер с данными
        DogsAdapter adapter = new DogsAdapter(this, dogs);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        dogs.add( new Dog("Немецкая овчарка", "Немецкие овчарки - это мускулистые и сильные собаки среднего размера. Рост кобелей 60-65 см, вес 30-40 кг, рост сук 55-60 см, вес 22-32 кг. Длина корпуса больше высоты на 10-17%, корпус имеет наклон около 23°. ",
                R.drawable.german_shepherd));
        dogs.add( new Dog("Французский бульдог", "Французский бульдог — порода собак. Некрупная, отличающаяся крупной, но короткой мордой, плоским раздвоенным носом, широкой раздвоенной верхней губой. Стоячие уши, широкие у основания и закругляющиеся сверху.",
                R.drawable.bouledogue));
        dogs.add( new Dog("Пудель", "Стандартный пудель — собака внимательная, чуткая и любящая. Он необыкновенно понятлив и выполняет любые команды хозяина, быстро усваивая новые навыки. Кроме того, он чудесно ладит с детьми. Благородный и преданный пудель проявит все свои положительные качества, если правильно с ним обращаться.",
                R.drawable.pudel));
        dogs.add( new Dog("Померанский шпиц", "Померанский шпиц относится к низкорослым декоративным породам (рост в холке в среднем — 16-22 см, вес не превышает 3 - 3,5 кг). Такую миниатюрную собачку можно завести даже в небольшой квартире. Кстати, померанец — это одна из пород-долгожителей. Живут шпицы около 12-16 лет.",
                R.drawable.shpits));
       dogs.add( new Dog("Такса", "Такса – норная собака, популярная как среди охотников, так и среди любителей-собаководов. Эту породу любят за любознательность, энергичность, веселый нрав, высокий интеллект и самое главное – за безграничную преданность хозяину.",
                R.drawable.taksa));
    }
}