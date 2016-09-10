package com.learning.pranavjain.xando;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    int gameOver = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Player "+(count+1)+"'s chance!",Toast.LENGTH_SHORT).show();

    }

    public void shape00(View view){

        gameOver++;
        ImageView image00 = (ImageView) findViewById(R.id.image00);
        if(count == 0){
            count++;
            image00.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image00.setBackgroundResource(R.drawable.o);
        }
        image00.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape01(View view){

        gameOver++;
        ImageView image01 = (ImageView) findViewById(R.id.image01);
        if(count == 0){
            count++;
            image01.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image01.setBackgroundResource(R.drawable.o);
        }
        image01.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape02(View view){

        gameOver++;
        ImageView image02 = (ImageView) findViewById(R.id.image02);
        if(count == 0){
            count++;
            image02.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image02.setBackgroundResource(R.drawable.o);
        }
        image02.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape10(View view){

        gameOver++;
        ImageView image10 = (ImageView) findViewById(R.id.image10);
        if(count == 0){
            count++;
            image10.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image10.setBackgroundResource(R.drawable.o);
        }
        image10.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }
    public void shape11(View view){

        gameOver++;
        ImageView image11 = (ImageView) findViewById(R.id.image11);
        if(count == 0){
            count++;
            image11.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image11.setBackgroundResource(R.drawable.o);
        }
        image11.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape12(View view){

        gameOver++;
        ImageView image12 = (ImageView) findViewById(R.id.image12);
        if(count == 0){
            count++;
            image12.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image12.setBackgroundResource(R.drawable.o);
        }
        image12.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }


    public void shape20(View view){

        gameOver++;
        ImageView image20 = (ImageView) findViewById(R.id.image20);
        if(count == 0){
            count++;
            image20.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image20.setBackgroundResource(R.drawable.o);
        }
        image20.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape21(View view){

        gameOver++;
        ImageView image21 = (ImageView) findViewById(R.id.image21);
        if(count == 0){
            count++;
            image21.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image21.setBackgroundResource(R.drawable.o);
        }
        image21.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape22(View view){

        gameOver++;
        ImageView image22 = (ImageView) findViewById(R.id.image22);
        if(count == 0){
            count++;
            image22.setBackgroundResource(R.drawable.x);
        }else {
            count--;
            image22.setBackgroundResource(R.drawable.o);
        }
        image22.setEnabled(false);
        if(gameOver == 9){
            Toast.makeText(getApplicationContext(),"Game Over!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

}
