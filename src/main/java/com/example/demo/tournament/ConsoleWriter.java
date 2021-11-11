package com.example.demo.tournament;

import org.springframework.stereotype.Component;

import java.util.Map;


public class ConsoleWriter {

    public void printWinner(String winner) {
        System.out.println("\n********************\n");
        System.out.println("Winner of the tournament is " + winner);
        System.out.println("\n********************");
    }

    public void printMatch(Map<Team, Integer> result, Match match) {

        System.out.println("\n" + match.getRound());

        if(result.get(match.getTeamOne()) > result.get(match.getTeamTwo())){
            System.out.println("Team " + match.getTeamOne().getName() + " defended team " + match.getTeamTwo().getName() + " with score " + match.getScore());
        }
        else{
            System.out.println("Team " + match.getTeamTwo().getName() + " defended team " + match.getTeamOne().getName() + " with score " + match.getScore());
        }

        System.out.println("\n__________________________");
    }
}
