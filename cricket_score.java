package aaCRICKET_SCORE_CARD;

import java.util.Scanner;

public class CRICKET { 
	
public static void main(String[] args) {
		
	int score = 0;                    //team score   
	int wickets = 0;				  //team wicketss
	int overballs = 6;                //every over have 6 balls
	int player1 = 0;                  //player 1 runs
	int player2 = 0;				  //player 2 runs
	int current_player = player1 ;    //who is striking player 1 or player 2 
	int ballsp1 = 0;                  //how many balls player 1 played
	int ballsp2 = 0;                  //how many balls player 2 played
	
	int bowlerscore = 0;
	
	
	System.out.println("Enter first batsmen name : ");
	Scanner BATMEN1 = new Scanner(System.in);
	String B1 = BATMEN1.nextLine();
	
	System.out.println("Enter second batsmen name : ");
	Scanner BATMEN2 = new Scanner(System.in);
	String B2 = BATMEN2.nextLine();
	
	/*System.out.println("Enter bowler name : ");
	Scanner BOWLER1 = new Scanner(System.in);
	String BOWL = BOWLER1.nextLine();*/
	
	for (int k = 1;k <= 2;k++) {       //how many overs to be played loop
		
		System.out.println("Enter bowler name : ");
		Scanner BOWLER1 = new Scanner(System.in);
		String BOWL = BOWLER1.nextLine();
	
	for(int i = 1; i <= overballs ; i++) {       //individual over loop
		
		System.out.println("Enter the input of ball " + i + ":");
		
		Scanner Jo = new Scanner(System.in);
		int j = Jo.nextInt();
		
		if(j==1 || j==3 || j == 5) {    //single , 3d , 5d runs
			
			score = score + j;
			
			if(current_player == 2) {
				current_player = 0;  
				player2 = player2 + j;   
				ballsp2++ ;
				bowlerscore = bowlerscore + j;
				
			}else {
				current_player = 2;
				player1 = player1 + j;  
				ballsp1++ ;
				bowlerscore = bowlerscore + j;
				
			}
		}
		else if(j==2 || j==4 || j==6) {     //2d , 4 , 6
			
			score = score + j;
			if(current_player == 2) {
				  
				player2 = player2 + j; 
				ballsp2++ ;
				bowlerscore = bowlerscore + j;
				
			}else {
				
				player1 = player1 + j;
				ballsp1++ ;
				bowlerscore = bowlerscore + j;
			}
			
		}
		else if(j==10) {           			 //wide
			
			score = score + 1;
			bowlerscore ++ ;
			System.out.println("Enter if any runs scored while wide ball : ");
			Scanner wide = new Scanner(System.in);
			int w = wide.nextInt();
			
			if(w==1 || w==3) {
				if(current_player == 2) {
					current_player = 0; 
					   
				}else {
					current_player = 2;
					
				}
			}
			
			score = score + w;
			overballs++;
			
		}
		else if(j==100) {            //No Ball
			
			score++;
			bowlerscore ++;
			
			System.out.println("Enter if any runs scored while no ball : ");
			Scanner noball = new Scanner(System.in);
			int n = noball.nextInt();
			score = score + n;
			bowlerscore = bowlerscore + n;
			if(n==1 || n==3) {
				if(current_player == 2) {
					current_player = 0; 
					   
				}else {
					current_player = 2;
					
				}
			}
			
			else if(n==2){
				
				//no changes current player is at same positions
				
			}
			
			overballs++;
		}
		
		else if(j==1000) {             //catch out
			
			if(current_player == 2) {
				
				wickets ++;
				ballsp2++ ;
				System.out.println(B2 + " : "+ player2 + "("+ballsp2+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME2 = new Scanner(System.in);
				String NB2 = BATME2.nextLine();
				
				B2 = NB2;
				
				player2 = player2 * 0;
				ballsp2 = ballsp2 * 0;
				
			}else {
				ballsp1++;
				wickets ++;
				System.out.println(B1 + " : "+player1+ "("+ballsp1+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME1 = new Scanner(System.in);
				String NB1 = BATME1.nextLine();
				
				B1 = NB1;
				
				player1 = player1 * 0;
				ballsp1 = ballsp1 * 0;
			}
			
		}
		
		
		else if(j==1001) {           //Run out
			
			System.out.println("if player is run out enter runs have taken : ");
			Scanner runout = new Scanner(System.in);  //runs while runout
			int r = runout.nextInt();
			
			System.out.println("Enter Which end batter got out :");  //outend 
			Scanner End = new Scanner(System.in);                   //1=striker end
			int outend = End.nextInt();                              //2= non-st
			
			if(r == 0 && current_player == 0 && outend == 2) {
				
				score = score + r;
				current_player = 2;
				player1 = player1 + r;
				ballsp1++;
				wickets ++;
				System.out.println(B1 + " : "+player1 + "("+ballsp1+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME1 = new Scanner(System.in);
				String NB1 = BATME1.nextLine();
				
				B1 = NB1;
				
				player1 = player1 * 0;
				ballsp1 = ballsp1 * 0;
				
			}
			else if(r == 1 && current_player == 0 && outend == 1) {
				
				score = score + r;
				player1 = player1 + r;
				ballsp1++;
				wickets ++;
				bowlerscore = bowlerscore + r;
				System.out.println(B1 + " : "+player1 + "("+ballsp1+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME1 = new Scanner(System.in);
				String NB1 = BATME1.nextLine();
				
				B1 = NB1;
				
				player1 = player1 * 0;
				ballsp1 = ballsp1 * 0;
				
			}
			else if(r == 1 && current_player == 0 && outend == 2) {
				
				score = score + r;
				player1 = player1 + r;
				current_player = 2;
				ballsp1++ ;
				wickets++;
				bowlerscore = bowlerscore + r;
				System.out.println(B1 + " : "+player1 + "("+ballsp1+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME1 = new Scanner(System.in);
				String NB1 = BATME1.nextLine();
				
				B1 = NB1;
				
				player1 = player1 * 0;
				ballsp1 = ballsp1 * 0;
				
			}
			else if(r == 2 && current_player == 0 && outend == 1) {
				
				score = score + r;
				player1 = player1 + r;
				ballsp1++ ;
				wickets++ ;
				bowlerscore = bowlerscore + r;
				System.out.println(B1 + " : "+player1 + "("+ballsp1+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME1 = new Scanner(System.in);
				String NB1 = BATME1.nextLine();
				
				B1 = NB1;
				
				player1 = player1 * 0;
				ballsp1 = ballsp1 * 0;
				
			}
			else if(r == 2 && current_player == 0 && outend == 2) {
				
				score = score + r;
				player1 = player1 + r;
				current_player = 2;
				ballsp1++ ;
				wickets++ ;
				bowlerscore = bowlerscore + r;
				System.out.println(B1 + " : "+player1 + "("+ballsp1+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME1 = new Scanner(System.in);
				String NB1 = BATME1.nextLine();
				
				B1 = NB1;
				
				player1 = player1 * 0;
				ballsp1 = ballsp1 * 0;
				
			}
			else if(r == 0 && current_player == 2 && outend == 2) {
				
				score = score + r;
				current_player = 0;
				player2 = player2 + r;
				ballsp2++ ;
				wickets ++;
				bowlerscore = bowlerscore + r;
				System.out.println(B2 + " : "+player2 + "("+ballsp2+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME2 = new Scanner(System.in);
				String NB2 = BATME2.nextLine();
				
				B2 = NB2;
				
				player2 = player2 * 0;
				ballsp2 = ballsp2 * 0;
				
			}
			else if(r == 1 && current_player == 2 && outend == 1) {
				
				score = score + r;
				player2 = player2 + r;
				ballsp2++ ;
				wickets ++;
				bowlerscore = bowlerscore + r;
				System.out.println(B2 + " : "+player2 + "("+ballsp2+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME2 = new Scanner(System.in);
				String NB2 = BATME2.nextLine();
				
				B2 = NB2;
				
				player2 = player2 * 0;
				ballsp2 = ballsp2 * 0;
				
			}
			else if(r == 1 && current_player == 2 && outend == 2) {
				
				score = score + r;
				player2 = player2 + r;
			    current_player = 0;
			    ballsp2++ ;
			    wickets ++;
			    bowlerscore = bowlerscore + r;
			    System.out.println(B2 + " : "+player2 + "("+ballsp2+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME2 = new Scanner(System.in);
				String NB2 = BATME2.nextLine();
				
				B2 = NB2;
				
			    player2 = player2 * 0;
			    ballsp2 = ballsp2 * 0;
				
			}
			else if(r == 2 && current_player == 2 && outend == 1) {
				
				score = score + r;
				player2 = player2 + r;
				ballsp2++ ;
				wickets ++;
				bowlerscore = bowlerscore + r;
				System.out.println(B2 + " : "+player2 + "("+ballsp2+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME2 = new Scanner(System.in);
				String NB2 = BATME2.nextLine();
				
				B2 = NB2;
				
				player2 = player2 * 0;
				ballsp2 = ballsp2 * 0;
				
			}
			else if(r == 2 && current_player == 2 && outend == 2) {
				
				score = score + r;
				current_player = 0;
				player2 = player2 + r;
				ballsp2++ ;
				wickets ++;
				bowlerscore = bowlerscore + r;
				System.out.println(B2 + " : "+player2 + "("+ballsp2+")");
				System.out.println("Score : "+ score +"/"+wickets);
				
				System.out.println("Enter next batsmen name : ");   //new batsmen name
				Scanner BATME2 = new Scanner(System.in);
				String NB2 = BATME2.nextLine();
				
				B2 = NB2;
				
				player2 = player2 * 0;
				ballsp2 = ballsp2 * 0;
			}
			
			
		}
		
		if (wickets == 10) {
			k = 0;
			i = 0;
			System.out.println("First innings completed! ");
			break;
		}
		
	}
	
	System.out.println(B1 + " : " + player1 + "("+ballsp1+")");
	System.out.println(B2 + " : "+ player2 + "("+ballsp2+")");
	System.out.println("score : " + score + "/" + wickets);
	System.out.println("BOWLER " + BOWL + " : " + bowlerscore + "("+ 6 + ")" + " \n");
	bowlerscore = bowlerscore * 0;
	
	if(current_player == 2) {
		current_player = 1; 
		   
	}else {
		current_player = 2;
		
	}
	
}
	System.out.println("First innings completed!\n"
			+ "Thats a great score \n"
			+ "Now Bowling Time!!! \n"
			+ "..............\n"
			+"....... \n"
			+"Seconds innings Started ");
		
		
	}
	
}
