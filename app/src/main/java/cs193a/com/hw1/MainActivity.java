//  Julea Chin <julea@stanford.edu>
//  Rock, Paper, Scissors! - This app shows three options on the screen, and
//  asks the user to pick an option. The CPU also randomly selects an option.
//  Paper wraps rock, rock crushes scissors, and scissors cut paper. Have fun.
//  Note: Runs best on a Nexus 5.

package cs193a.com.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int cpuChoice;
    private int cpuScore = 0;
    private int humanScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialization code
    }

    private void setCpuChoice() {
        TextView cpuText = (TextView) findViewById(R.id.cpuSelection);
        String CPUchoice = "";

        Random rand = new Random();
        cpuChoice = rand.nextInt(3);
        if (cpuChoice == 0){
            CPUchoice = "ROCK";
        } else if (cpuChoice == 1){
            CPUchoice = "PAPER";
        } else if (cpuChoice == 2){
            CPUchoice = "SCISSORS";
        }
        cpuText.setText("The computer selected " + CPUchoice + ". ");

    }


    public void rockButtonClick(View view) {
        String HUMANchoice = "ROCK";
        TextView humanText = (TextView) findViewById(R.id.humanSelection);
        humanText.setText("You selected " + HUMANchoice + ". ");

        TextView updatedStatus = (TextView) findViewById(R.id.status);
        setCpuChoice();
        if (cpuChoice == 0){
            //tie
            updatedStatus.setText("You got a TIE! Not too shabby. ");

        } else if (cpuChoice == 2){
            //win
            updatedStatus.setText("You WON! Nice job. ");
            humanScore++;
            TextView humanScoreText = (TextView) findViewById(R.id.humanScore);
            humanScoreText.setText("Your score: " + humanScore);

        } else {
            //lose
            updatedStatus.setText("You LOST. Better luck next time... ");
            cpuScore++;
            TextView CPUScoreText = (TextView) findViewById(R.id.cpuScore);
            CPUScoreText.setText("CPU score: " + cpuScore);
        }
    }

    public void paperButtonClick(View view) {
        String HUMANchoice = "PAPER";
        TextView humanText = (TextView) findViewById(R.id.humanSelection);
        humanText.setText("You selected " + HUMANchoice + ". ");

        TextView updatedStatus = (TextView) findViewById(R.id.status);

        setCpuChoice();
        if (cpuChoice == 1){
            //tie
            updatedStatus.setText("You got a TIE! Not too shabby. ");

        } else if (cpuChoice == 0){
            //win
            updatedStatus.setText("You WON! Nice job. ");
            humanScore++;
            TextView humanScoreText = (TextView) findViewById(R.id.humanScore);
            humanScoreText.setText("Your score: " + humanScore);

        } else {
            //lose
            updatedStatus.setText("You LOST. Better luck next time... ");
            cpuScore++;
            TextView CPUScoreText = (TextView) findViewById(R.id.cpuScore);
            CPUScoreText.setText("CPU score: " + cpuScore);
        }
    }

    public void scissorsButtonClick(View view) {
        String HUMANchoice = "SCISSORS";
        TextView humanText = (TextView) findViewById(R.id.humanSelection);
        humanText.setText("You selected " + HUMANchoice + ". ");

        TextView updatedStatus = (TextView) findViewById(R.id.status);

        setCpuChoice();
        if (cpuChoice == 2){
            //tie
            updatedStatus.setText("You got a TIE! Not too shabby. ");

        } else if (cpuChoice == 1){    //win
            updatedStatus.setText("You WON! Nice job. ");
            humanScore++;
            TextView humanScoreText = (TextView) findViewById(R.id.humanScore);
            humanScoreText.setText("Your score: " + humanScore);

        } else {
            //lose
            updatedStatus.setText("You LOST. Better luck next time... ");
            cpuScore++;
            TextView CPUScoreText = (TextView) findViewById(R.id.cpuScore);
            CPUScoreText.setText("CPU score: " + cpuScore);
        }
    }
}
