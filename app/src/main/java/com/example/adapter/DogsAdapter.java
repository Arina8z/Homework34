package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

    class DogsAdapter extends RecyclerView.Adapter<DogsAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Dog> dogs; // поле коллекции контейнера для хранения данных (объектов класса Animal)

    // конструктор адаптера
    public DogsAdapter(Context context, List<Dog> dogs) {
        this.inflater = LayoutInflater.from(context);
        this.dogs = dogs;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @Override
    public DogsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(DogsAdapter.ViewHolder holder, int position) {
        Dog dog = dogs.get(position);
        holder.dogView.setImageResource(dog.getDogResource());
        holder.breedNameView.setText(dog.getBreedName());
        holder.dogDescriptionView.setText(dog.getDogsDescription());

    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return dogs.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView dogView;
        final TextView breedNameView, dogDescriptionView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            dogView = view.findViewById(R.id.dogResource);
            breedNameView = view.findViewById(R.id.breedName);
            dogDescriptionView = view.findViewById(R.id.description);
        }
    }
}