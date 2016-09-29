package com.learning.pranavjain.xando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    int gameOver = 0;
    int[] gameStat = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    String player1Wins = "Player 1 has won the game!";
    String player2Wins = "Player 2 has won the game!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.winner);
        linearLayout.setVisibility(View.INVISIBLE);
    }

    public void shape00(View view) {

        gameOver++;
        ImageView image00 = (ImageView) findViewById(R.id.image00);
        gameStat[0] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image00.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image00.setBackgroundResource(R.drawable.o);
        }
        image00.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape01(View view) {

        gameOver++;
        ImageView image01 = (ImageView) findViewById(R.id.image01);
        gameStat[1] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image01.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image01.setBackgroundResource(R.drawable.o);
        }
        image01.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape02(View view) {

        gameOver++;
        ImageView image02 = (ImageView) findViewById(R.id.image02);
        gameStat[2] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image02.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image02.setBackgroundResource(R.drawable.o);
        }
        image02.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape10(View view) {

        gameOver++;
        ImageView image10 = (ImageView) findViewById(R.id.image10);
        gameStat[3] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image10.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image10.setBackgroundResource(R.drawable.o);
        }
        image10.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape11(View view) {

        gameOver++;
        ImageView image11 = (ImageView) findViewById(R.id.image11);
        gameStat[4] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image11.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image11.setBackgroundResource(R.drawable.o);
        }
        image11.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape12(View view) {

        gameOver++;
        ImageView image12 = (ImageView) findViewById(R.id.image12);
        gameStat[5] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image12.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image12.setBackgroundResource(R.drawable.o);
        }
        image12.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }


    public void shape20(View view) {

        gameOver++;
        ImageView image20 = (ImageView) findViewById(R.id.image20);
        gameStat[6] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image20.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image20.setBackgroundResource(R.drawable.o);
        }
        image20.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape21(View view) {

        gameOver++;
        ImageView image21 = (ImageView) findViewById(R.id.image21);
        gameStat[7] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image21.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image21.setBackgroundResource(R.drawable.o);
        }
        image21.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void shape22(View view) {

        gameOver++;
        ImageView image22 = (ImageView) findViewById(R.id.image22);
        gameStat[8] = count;
        gameWinner(view);
        if (count == 0) {
            count++;
            image22.setBackgroundResource(R.drawable.x);
        } else {
            count--;
            image22.setBackgroundResource(R.drawable.o);
        }
        image22.setEnabled(false);
        if (gameOver == 9) {
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Player " + (count + 1) + "'s chance!", Toast.LENGTH_SHORT).show();
        }
    }

    public void gameWinner(View view) {

        LinearLayout winner = (LinearLayout) findViewById(R.id.winner);
        TextView setName = (TextView) findViewById(R.id.winnerName);
        ImageView image00 = (ImageView) findViewById(R.id.image00);
        ImageView image01 = (ImageView) findViewById(R.id.image01);
        ImageView image02 = (ImageView) findViewById(R.id.image02);
        ImageView image10 = (ImageView) findViewById(R.id.image10);
        ImageView image11 = (ImageView) findViewById(R.id.image11);
        ImageView image12 = (ImageView) findViewById(R.id.image12);
        ImageView image20 = (ImageView) findViewById(R.id.image20);
        ImageView image21 = (ImageView) findViewById(R.id.image21);
        ImageView image22 = (ImageView) findViewById(R.id.image22);
        Button reset = (Button) findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(getBaseContext().getPackageName());
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        if (gameStat[0] == gameStat[1] && gameStat[1] == gameStat[2]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[0] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameStat[3] == gameStat[4] && gameStat[4] == gameStat[5]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[3] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameStat[6] == gameStat[7] && gameStat[7] == gameStat[8]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[6] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameStat[0] == gameStat[3] && gameStat[3] == gameStat[6]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[0] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameStat[1] == gameStat[4] && gameStat[4] == gameStat[7]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[1] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameStat[2] == gameStat[5] && gameStat[5] == gameStat[8]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[2] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameStat[0] == gameStat[4] && gameStat[4] == gameStat[8]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[0] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameStat[2] == gameStat[4] && gameStat[4] == gameStat[6]) {
            winner.setVisibility(View.VISIBLE);
            image00.setEnabled(false);
            image01.setEnabled(false);
            image02.setEnabled(false);
            image10.setEnabled(false);
            image11.setEnabled(false);
            image12.setEnabled(false);
            image20.setEnabled(false);
            image21.setEnabled(false);
            image22.setEnabled(false);
            if (gameStat[2] == 0) {
                setName.setText(player1Wins);
            } else {
                setName.setText(player2Wins);
            }
        } else if (gameOver == 9) {
            String draw = "Draw , what a game!";
            winner.setVisibility(View.VISIBLE);
            setName.setText(draw);
        }

    }

}