package com.example.android.fencingscore;

import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final
    String  MY_TOTAL_SCORE_1 =  "SCORE_1";
    String  MY_TOTAL_SCORE_2 = "SCORE_2";
    String  MY_TOUCH_POINT_1 = "TOUCH_1";
    String MY_TOUCH_POINT_2 = "TOUCH_2";
    String My_ROW_POINT_1 = "ROW_1";
    String MY_ROW_POINT_2 = "ROW_2";
    String MY_RED_1 = "RED_1";
    String MY_RED_2 = "RED_2";
    String MY_YELLOW_1 = "YELLOW_1";
    String MY_YELLOW_2 = "YELLOW_2";
    String MY_BLACK_1 = "BLACK_1";
    String MY_BLACK_2 = "BLACK_2";
    String MY_CURRENT_PAGE = "CURRENT_PAGE";


    int quantity1 = 0;
    int quantity2 = 0;

    int sumTouchPoint1 = 0;
    int sumTouchPoint2 = 0;

    int sumRowPoint1 = 0;
    int sumRowPoint2 = 0;

    int sumRedCardPoint1 = 0;
    int sumRedCardPoint2 = 0;


    int sumYellowCard1 = 0;
    int sumYellowCard2 = 0;

    int sumBlackCard1 = 0;
    int sumBlackCard2 = 0;

    int currentPage;


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        quantity1=savedInstanceState.getInt(MY_TOTAL_SCORE_1);
        quantity2=savedInstanceState.getInt(MY_TOTAL_SCORE_2);
        sumTouchPoint1=savedInstanceState.getInt(MY_TOUCH_POINT_1);
        sumTouchPoint2=savedInstanceState.getInt(MY_TOUCH_POINT_2);
        sumRowPoint1=savedInstanceState.getInt(My_ROW_POINT_1);
        sumRowPoint2=savedInstanceState.getInt(MY_ROW_POINT_2);
        sumRedCardPoint1=savedInstanceState.getInt(MY_RED_1);
        sumRedCardPoint2=savedInstanceState.getInt(MY_RED_2);
        sumYellowCard1=savedInstanceState.getInt(MY_YELLOW_1);
        sumYellowCard2=savedInstanceState.getInt(MY_YELLOW_2);
        sumBlackCard1=savedInstanceState.getInt(MY_BLACK_1);
        sumBlackCard2=savedInstanceState.getInt(MY_BLACK_2);
        currentPage = savedInstanceState.getInt(MY_CURRENT_PAGE);

        displayScorePlayer1(quantity1);
        displayScorePlayer2(quantity2);
        disPlayTouchPointStat1(sumTouchPoint1);
        disPlayTouchPointStat2(sumTouchPoint2);
        disPlayRowPointStat1(sumRowPoint1);
        disPlayRowPointStat2(sumRowPoint2);
        displayRedCardPoint1(sumRedCardPoint1);
        displayRedCardPoint2(sumRedCardPoint2);
        displayYellowCard1(sumYellowCard1);
        displayYellowCard2(sumYellowCard2);
        displayBlackCard1(sumBlackCard1);
        displayBlackCard2(sumBlackCard2);

        saveCurrentPage();
    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("SCORE_1", quantity1 );
        outState.putInt("SCORE_2", quantity2 );
        outState.putInt("TOUCH_1", sumTouchPoint1 );
        outState.putInt("TOUCH_2", sumTouchPoint2);
        outState.putInt("ROW_1", sumRowPoint1);
        outState.putInt("ROW_2", sumRowPoint2);
        outState.putInt("RED_1", sumRedCardPoint1);
        outState.putInt("RED_2", sumRedCardPoint2);
        outState.putInt("YELLOW_1", sumYellowCard1);
        outState.putInt("YELLOW_2", sumYellowCard2);
        outState.putInt("BLACK_1", sumBlackCard1);
        outState.putInt("BLACK_2", sumBlackCard2);
        outState.putInt("CURRENT_PAGE",currentPage);

        super.onSaveInstanceState(outState);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



// the following is the method used to calculate the statistics for player 1


    /**
     * this method is called when touch point is clicked to record statistics player 1
     */
    public void touchPointStatPlayer1(View view) {

        sumTouchPoint1 = sumTouchPoint1 + 1;
        disPlayTouchPointStat1(sumTouchPoint1);
    }

    /**
     * this method is called when R.O.W. point is clicked to record statistics player 1
     */
    public void rowPointStatPlayer1(View view) {

        sumRowPoint1 = sumRowPoint1 + 1;
        disPlayRowPointStat1(sumRowPoint1);
    }

    /**
     * this method is called when Red Card point is clicked to record statistics player 1
     */
    public void redCardPointStat1(View view) {

        sumRedCardPoint1 = sumRedCardPoint1 + 1;
        displayRedCardPoint1(sumRedCardPoint1);
    }


    /**
     * this method is called when Yellow Card point is clicked to record statistics player 1
     */
    public void yellowCardStat1(View view) {

        sumYellowCard1 = sumYellowCard1 + 1;
        displayYellowCard1(sumYellowCard1);
    }

    /**
     * this method is called when Black Card point is clicked to record statistics player 1
     */
    public void blackCardPointStat1() {

        sumBlackCard1 = sumBlackCard1 + 1;
        displayBlackCard1(sumBlackCard1);

    }


    // the following is the method used to calculate the statistics for player 2


    /**
     * this method is called when touch point is clicked to record statistics player 2
     */
    public void touchPointStatPlayer2(View view) {

        sumTouchPoint2 = sumTouchPoint2 + 1;
        disPlayTouchPointStat2(sumTouchPoint2);
    }

    /**
     * this method is called when R.O.W. point is clicked to record statistics player 2
     */
    public void rowPointStatPlayer2(View view) {

        sumRowPoint2 = sumRowPoint2 + 1;
        disPlayRowPointStat2(sumRowPoint2);
    }

    /**
     * this method is called when Red Card point is clicked to record statistics player 2
     */
    public void redCardPointStatPlayer2(View view) {

        sumRedCardPoint2 = sumRedCardPoint2 + 1;
        displayRedCardPoint2(sumRedCardPoint2);
    }


    /**
     * this method is called when Yellow Card point is clicked to record statistics player 2
     */
    public void yellowCardStatPlayer2(View view) {

        sumYellowCard2 = sumYellowCard2 + 1;
        displayYellowCard2(sumYellowCard2);
    }

    /**
     * this method is called when Black Card point is clicked to record statistics player 2
     */
    public void blackCardStatPlayer2() {

        sumBlackCard2 = sumBlackCard2 + 1;
        displayBlackCard2(sumBlackCard2);

    }


    // the following methods are used to calculate the score for player 1//


    /**
     * this method is called when Touch Point Button player #1 is clicked
     */
    public void addTouchPointPlayer1(View view) {

        if (quantity1 == 15) {

            displayWinnerPlayer1("player 1 " + ("Winner"));
            return;
        }
        quantity1 = quantity1 + 1;
        displayScorePlayer1(quantity1);
        touchPointStatPlayer1(view);
    }


    /**
     * this method is called when R.O.W. Point Button player #1 is clicked
     */
    public void addRowPointPlayer1(View view) {

        if (quantity1 == 15) {

            displayWinnerPlayer1("player 1 " + ("Winner"));
            return;
        }
        quantity1 = quantity1 + 1;
        displayScorePlayer1(quantity1);
        rowPointStatPlayer1(view);
    }

    /**
     * this method is called when Red Card Button player # 2 is clicked and the point added to player #1
     */
    public void addRedCardPointPlayer1(View view) {

        if (quantity1 == 15) {

            displayWinnerPlayer1("player 1 " + ("Winner"));
            return;
        }
        quantity1 = quantity1 + 1;
        displayScorePlayer1(quantity1);
        redCardPointStatPlayer2(view);
    }

// the following methods are used to calculate the scores for player 2

    /**
     * this method is called when Touch Point Button Player # 2 is clicked
     */
    public void addTouchPointPlayer2(View view) {

        if (quantity2 == 15) {

            displayWinnerPlayer2("player 2 " + ("Winner"));
            return;
        }

        quantity2 = quantity2 + 1;
        displayScorePlayer2(quantity2);
        touchPointStatPlayer2(view);

    }

    /**
     * this method is called when R.O.W. Point Button Player # 2 is clicked
     */
    public void addRowPointPlayer2(View view) {

        if (quantity2 == 15) {

            displayWinnerPlayer2("player 2 " + ("Winner"));
            return;
        }
        quantity2 = quantity2 + 1;
        displayScorePlayer2(quantity2);
        rowPointStatPlayer2(view);

    }

    /**
     * this method is called when Red Card Button Player #1 is clicked and point is added to player #2
     */
    public void addRedCardPointPlayer2(View view) {

        if (quantity2 == 15) {

            displayWinnerPlayer2("player 2 " + ("Winner"));
            return;
        }
        quantity2 = quantity2 + 1;
        displayScorePlayer2(quantity2);
        redCardPointStat1(view);

    }


    // the following methods are used to rest the game

    /**
     * this method is called when reset button is clicked
     */
    public void resetAllScores(View reset) {

        quantity1 = 0;
        quantity2 = 0;
        displayScorePlayer1(quantity1);
        displayScorePlayer2(quantity2);
        clearWinnerPlayer1("Player 1");
        clearWinnerPlayer2("Player 2");
    }

    /**
     * this method is called when Black button player # 2 is clicked
     */
    public void declareWinnerPlayer1(View view) {

        displayWinnerPlayer1("Player 1 " + "(Winner)");
        blackCardStatPlayer2();

    }


    /**
     * this method is called when Black Button Player # 1 is clicked
     */
    public void declareWinnerPlayer2(View view) {

        displayWinnerPlayer2("Player 2 " + "(winner)");
        blackCardPointStat1();

    }


    /**
     * this method display score player #1
     */

    public void displayScorePlayer1(int score) {

        TextView scorePlayer1 = (TextView) findViewById(R.id.score_player_1);
        scorePlayer1.setText(String.valueOf(score));
    }


    /**
     * this method display score player #2
     */

    public void displayScorePlayer2(int score) {

        TextView scorePlayer2 = (TextView) findViewById(R.id.score_player_2);
        scorePlayer2.setText(String.valueOf(score));

    }

    /**
     * @param message display Player 1 is the winner
     */

    public void displayWinnerPlayer1(String message) {

        TextView winner = (TextView) findViewById(R.id.player_1_title);
        winner.setText(message);
        winner.setTextColor(Color.RED);

    }

    /**
     * @param message display player 2 is the winner
     */
    public void displayWinnerPlayer2(String message) {
        TextView winner = (TextView) findViewById(R.id.player_2_title);
        winner.setText(message);
        winner.setTextColor(Color.RED);
    }


    /**
     * this method clear the display of the winner player # 1
     */

    public void clearWinnerPlayer1(String message) {
        TextView winner = (TextView) findViewById(R.id.player_1_title);
        winner.setText(message);
        winner.setTextColor(Color.WHITE);
    }

    /**
     * this method clear the display of the winner player # 2
     */

    public void clearWinnerPlayer2(String message) {
        TextView winner = (TextView) findViewById(R.id.player_2_title);
        winner.setText(message);
        winner.setTextColor(Color.WHITE);
    }


    // the following are the methods used to create java objects for Player 1 stat. text view//


    /**
     * this method is display the touch point statistics player #1
     */

    public void disPlayTouchPointStat1(int score) {

        TextView touchPointStat = (TextView) findViewById(R.id.touch_point_statistics);
        touchPointStat.setText(String.valueOf(score));

    }

    /**
     * this method is display the R.O.W. point statistics player #1
     */

    public void disPlayRowPointStat1(int score) {

        TextView rowPointStat1 = (TextView) findViewById(R.id.row_point_statistics);
        rowPointStat1.setText(String.valueOf(score));
    }

    /**
     * this method is display the Red Card point statistics player 1
     */

    public void displayRedCardPoint1(int score) {

        TextView redCardPoint1 = (TextView) findViewById(R.id.red_card_point_statistics);
        redCardPoint1.setText(String.valueOf(score));
    }


    /**
     * this method is displayed the Yellow Card point statistics player 1
     */

    public void displayYellowCard1(int score) {

        TextView yellowCardPoint1 = (TextView) findViewById(R.id.yellow_card_statistics);
        yellowCardPoint1.setText(String.valueOf(score));
    }

    /**
     * this method is display the Black Card point player 1
     */

    public void displayBlackCard1(int score) {

        TextView blackCard1 = (TextView) findViewById(R.id.black_card_statistics);
        blackCard1.setText(String.valueOf(score));
    }


    // the following are the methods used to create java objects for Player 2 stat. text view//


    /**
     * this method is display the touch point statistics player #2
     */

    public void disPlayTouchPointStat2(int score) {

        TextView touchPointStat2 = (TextView) findViewById(R.id.touch_point_statistics_2);
        touchPointStat2.setText(String.valueOf(score));

    }

    /**
     * this method is display the R.O.W. point statistics player #2
     */

    public void disPlayRowPointStat2(int score) {

        TextView rowPointStat2 = (TextView) findViewById(R.id.row_point_statistics_2);
        rowPointStat2.setText(String.valueOf(score));
    }

    /**
     * this method is display the Red Card point statistics player 2
     */

    public void displayRedCardPoint2(int score) {

        TextView redCardPoint2 = (TextView) findViewById(R.id.red_card_point_statistics_2);
        redCardPoint2.setText(String.valueOf(score));
    }


    /**
     * this method is displayed the Yellow Card point statistics player 2
     */

    public void displayYellowCard2(int score) {

        TextView yellowCardPoint2 = (TextView) findViewById(R.id.yellow_card_statistics_2);
        yellowCardPoint2.setText(String.valueOf(score));
    }

    /**
     * this method is display the Black Card point player 2
     */

    public void displayBlackCard2(int score) {

        TextView blackCard2 = (TextView) findViewById(R.id.black_card_statistics_2);
        blackCard2.setText(String.valueOf(score));
    }


    /**
     * this method display the View Statistics
     */

    public void disPlayStatistics(View view) {

        View statistics = (View) findViewById(R.id.statistics);
        statistics.setVisibility(View.VISIBLE);

        View helpPage = (View) findViewById(R.id.help_page);
        helpPage.setVisibility(View.INVISIBLE);
        currentPage =1;

    }
    public void displayHelpPage(View view) {
        View helpPage = (View) findViewById(R.id.help_page);
        helpPage.setVisibility(View.VISIBLE);

        LinearLayout threeButtons = findViewById(R.id.three_buttons_layout);
        threeButtons.bringToFront();

        currentPage = 2;
    }


    /**
     * this method hide the View Statistics
     */

    public void displayHome(View view) {

        View statistics = (View) findViewById(R.id.statistics);
        statistics.setVisibility(View.INVISIBLE);

        View helpPage = (View) findViewById(R.id.help_page);
        helpPage.setVisibility((View.INVISIBLE));

        currentPage=3;

    }

    //this methods to maintain the current page when the device rotate

    /** method is called to maintain the help page and statistics page when the device rotate
     *
     */
    private void saveCurrentPage (){
        View savePage = new View (this);

        if (currentPage==1) {
            disPlayStatistics(savePage);
        }

        if(currentPage==2){
            displayHelpPage(savePage);
        }


        if(currentPage==3){
            displayHome(savePage);
        }

    }
}