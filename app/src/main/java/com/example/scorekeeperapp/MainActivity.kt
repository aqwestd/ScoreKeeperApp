package com.lscore.androidl.scorekeeperapp

import android.R
import android.os.Bundle

import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var player1_score = 0.0
    var player2_score = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Increase the score for Player 1 by 1 point.
     */
    fun addVictoryForPlayer1(v: View?) {
        ++player1_score
        displayForPlayer1(player1_score)
    }

    /**
     * Don`t increase the score for Player 1.
     */
    fun addLossForPlayer1(v: View?) {
        displayForPlayer1(player1_score)
    }

    /**
     * Increase the score for Player 1 by 0.5 point.
     */
    fun addDrawForPlayer1(v: View?) {
        player1_score = player1_score + 0.5
        displayForPlayer1(player1_score)
    }

    /**
     * Increase the score for Player 2 by 1 point.
     */
    fun addVictoryForPlayer2(v: View?) {
        ++player2_score
        displayForPlayer2(player2_score)
    }

    /**
     * Don`t increase the score for Player 2.
     */
    fun addLossForPlayer2(v: View?) {
        displayForPlayer2(player2_score)
    }

    /**
     * Increase the score for Player 2 by 0.5 point.
     */
    fun addDrawForPlayer2(v: View?) {
        player2_score = player2_score + 0.5
        displayForPlayer2(player2_score)
    }

    /**
     * Displays the given score for Player 1.
     */
    fun displayForPlayer1(score: Double) {
        val scoreView = findViewById<View>(R.id.player1_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Player 2.
     */
    fun displayForPlayer2(score: Double) {
        val scoreView = findViewById<View>(R.id.player2_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Resets the score for both players back to 0.
     */
    fun ResetScore(v: View?) {
        player1_score = 0.0
        player2_score = 0.0
        displayForPlayer1(player1_score)
        displayForPlayer2(player2_score)
    }
}