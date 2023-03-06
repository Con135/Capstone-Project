import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class Game extends Application  {
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		
		Image mapImage = new Image("Project Map Picture.jpg");
		
		//Player manager
		//Hunger
		//Thirst
		int[] playerStats = new int[2];
				playerStats[0] = 3;
				playerStats[1] = 3;
		
		//Resource Manager
		//0- Food
		//1- Water
		//2- Wood
		//3- Scrap
		//4- Lighthouse Key
		//5- Set of Tools
		//6- Gasoline
		//7- Boat Parts
		//8- Cave Key
		int[] resourceArray = new int[9]; 
				resourceArray[0] = 0;
				resourceArray[1] = 0;
				resourceArray[2] = 0;
				resourceArray[3] = 0;
				resourceArray[4] = 0;
				resourceArray[5] = 0;
				resourceArray[6] = 0;
				resourceArray[7] = 0; 
				resourceArray[8] = 0; 
				
		//Resource Labels
		Label lbFood = new Label("Food: " + resourceArray[0]);
		lbFood.setTranslateX(960);
		lbFood.setTranslateY(150);
		lbFood.setVisible(true);
		lbFood.setFont(new Font("Consolas", 30));
		
		Label lbWater = new Label("Water: " + resourceArray[1]);
		lbWater.setTranslateX(960);
		lbWater.setTranslateY(175);
		lbWater.setVisible(true);
		lbWater.setFont(new Font("Consolas", 30));
		
		Label lbWood = new Label("Wood: " + resourceArray[2]);
		lbWood.setTranslateX(960);
		lbWood.setTranslateY(200);
		lbWood.setVisible(true);
		lbWood.setFont(new Font("Consolas", 30));
		
		Label lbScrap = new Label("Scrap: " + resourceArray[3]);
		lbScrap.setTranslateX(960);
		lbScrap.setTranslateY(225);
		lbScrap.setVisible(true);
		lbScrap.setFont(new Font("Consolas", 30));
		
		Label lbLighthouseKey = new Label("Lighthouse Key");
		lbLighthouseKey.setTranslateX(960);
		lbLighthouseKey.setTranslateY(250);
		lbLighthouseKey.setVisible(false);
		lbLighthouseKey.setFont(new Font("Consolas", 30));
		
		Label lbSetofTools = new Label("Set of Tools");
		lbSetofTools.setTranslateX(960);
		lbSetofTools.setTranslateY(275);
		lbSetofTools.setVisible(false);
		lbSetofTools.setFont(new Font("Consolas", 30));
		
		Label lbGasoline = new Label("Gasoline");
		lbGasoline.setTranslateX(960);
		lbGasoline.setTranslateY(300);
		lbGasoline.setVisible(false);
		lbGasoline.setFont(new Font("Consolas", 30));
		
		Label lbBoatParts = new Label("Boat Parts");
		lbBoatParts.setTranslateX(960);
		lbBoatParts.setTranslateY(325);
		lbBoatParts.setVisible(false);
		lbBoatParts.setFont(new Font("Consolas", 30));
		
		Label lbCaveKey = new Label("Cave Key");
		lbCaveKey.setTranslateX(960);
		lbCaveKey.setTranslateY(350);
		lbCaveKey.setVisible(false);
		lbCaveKey.setFont(new Font("Consolas", 30));
		
		//Map setup
		RadioButton rbPlaneHead = new RadioButton();
		rbPlaneHead.setTranslateX(220);
		rbPlaneHead.setTranslateY(62);
		rbPlaneHead.setVisible(true);
		
		RadioButton rbForestTown = new RadioButton();
		rbForestTown.setTranslateX(340);
		rbForestTown.setTranslateY(180);
		rbForestTown.setVisible(false);
		
		RadioButton rbPlaneTail = new RadioButton();
		rbPlaneTail.setTranslateX(390);
		rbPlaneTail.setTranslateY(120);
		rbPlaneTail.setVisible(false);
		
		RadioButton rbBrokenJeep = new RadioButton();
		rbBrokenJeep.setTranslateX(210);
		rbBrokenJeep.setTranslateY(130);
		rbBrokenJeep.setVisible(false);
		
		RadioButton rbManor = new RadioButton();
		rbManor.setTranslateX(280);
		rbManor.setTranslateY(270);
		rbManor.setVisible(false);
		
		RadioButton rbLake = new RadioButton();
		rbLake.setTranslateX(432);
		rbLake.setTranslateY(205);
		rbLake.setVisible(false);
		
		RadioButton rbNorthernSawmill = new RadioButton();
		rbNorthernSawmill.setTranslateX(507);
		rbNorthernSawmill.setTranslateY(85);
		rbNorthernSawmill.setVisible(false);
		
		RadioButton rbDockHouse = new RadioButton();
		rbDockHouse.setTranslateX(310);
		rbDockHouse.setTranslateY(330);
		rbDockHouse.setVisible(false);
		
		RadioButton rbWreckedBoat = new RadioButton();
		rbWreckedBoat.setTranslateX(145);
		rbWreckedBoat.setTranslateY(345);
		rbWreckedBoat.setVisible(false);
		
		RadioButton rbRiverBridge = new RadioButton();
		rbRiverBridge.setTranslateX(355);
		rbRiverBridge.setTranslateY(370);
		rbRiverBridge.setVisible(false);
		
		RadioButton rbSouthernLumberyard = new RadioButton();
		rbSouthernLumberyard.setTranslateX(480);
		rbSouthernLumberyard.setTranslateY(340);
		rbSouthernLumberyard.setVisible(false);
		
		RadioButton rbMine = new RadioButton();
		rbMine.setTranslateX(600);
		rbMine.setTranslateY(310);
		rbMine.setVisible(false);
		
		RadioButton rbMountainTown = new RadioButton();
		rbMountainTown.setTranslateX(695);
		rbMountainTown.setTranslateY(300);
		rbMountainTown.setVisible(false);
		
		RadioButton rbLighthouse = new RadioButton();
		rbLighthouse.setTranslateX(720);
		rbLighthouse.setTranslateY(395);
		rbLighthouse.setVisible(false);
		
		RadioButton rbStoneBridge = new RadioButton();
		rbStoneBridge.setTranslateX(630);
		rbStoneBridge.setTranslateY(170);
		rbStoneBridge.setVisible(false);
		
		RadioButton rbSecretCave = new RadioButton();
		rbSecretCave.setTranslateX(738);
		rbSecretCave.setTranslateY(113);
		rbSecretCave.setVisible(false);
		
		ToggleGroup toggleGroup = new ToggleGroup();
		rbPlaneHead.setToggleGroup(toggleGroup);
		rbForestTown.setToggleGroup(toggleGroup);
		rbPlaneTail.setToggleGroup(toggleGroup);
		rbBrokenJeep.setToggleGroup(toggleGroup);
		rbManor.setToggleGroup(toggleGroup);
		rbLake.setToggleGroup(toggleGroup);
		rbNorthernSawmill.setToggleGroup(toggleGroup);
		rbDockHouse.setToggleGroup(toggleGroup);
		rbWreckedBoat.setToggleGroup(toggleGroup);
		rbRiverBridge.setToggleGroup(toggleGroup);
		rbSouthernLumberyard.setToggleGroup(toggleGroup);
		rbMine.setToggleGroup(toggleGroup);
		rbMountainTown.setToggleGroup(toggleGroup);
		rbLighthouse.setToggleGroup(toggleGroup);
		rbStoneBridge.setToggleGroup(toggleGroup);
		rbSecretCave.setToggleGroup(toggleGroup);
		
		//Location name, Discovered, first visit test, scavenge times left
		String[][] locationArray = {
				{"PlaneHead", "True", "False", "0"},
				{"ForestTown", "False", "False", "0"},
				{"PlaneTail", "False", "False", "0"},
				{"BrokenJeep", "False", "False", "0"},
				{"Manor", "False", "False", "0"},
				{"Lake", "False", "False", "0"},
				{"NorthernSawmill", "False", "False", "0"},
				{"DockHouse", "False", "False", "0"},
				{"WreckedBoat", "False", "False", "0"},
				{"RiverBridge", "False", "False", "0"},
				{"SouthernLumberyard", "False", "False", "0"},
				{"Mine", "False", "False", "0"},
				{"MountainTown", "False", "False", "0"},
				{"Lighthouse", "False", "False", "0"},
				{"StoneBridge", "False", "False", "0"},
				{"SecretCave", "False", "False", "0"}
		};
		
		//Textbox setup
		TextArea taTextBox = new TextArea();
		taTextBox.setWrapText(true);
		taTextBox.setEditable(false);
		taTextBox.setFont(new Font("Consolas", 17));
		taTextBox.setTranslateX(100);
		taTextBox.setTranslateY(480);
		taTextBox.setPrefSize(1000, 150);
		
		//Actions setup
		Button btEat = new Button("Eat");
		Button btDrink = new Button("Drink");
		Button btScavenge = new Button("Scavenge");
		Button btInteract = new Button("Interact");
		Button btExplore = new Button("Explore");
		Button btTravel = new Button("Travel");
		
		//Hbox for Actions
		HBox hBoxActions = new HBox(30);
		hBoxActions.getChildren().addAll(btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
		hBoxActions.setTranslateX(350);
		hBoxActions.setTranslateY(650);
		
		//Pane setup
		Pane Pane = new Pane();
		BackgroundSize bSize = new BackgroundSize(840, 480, false, false, false, false);
		BackgroundImage bImg = new BackgroundImage(mapImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, bSize);
		Background bGround = new Background(bImg);
		Pane.setBackground(bGround);
		Pane.getChildren().addAll(hBoxActions, taTextBox, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
									rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, rbWreckedBoat, 
									rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave);
	    //pane.setCenter(tableView);
	    //pane.setBottom(eventFlowPane);
	    //pane.setTop(tabPane);
	    Scene scene = new Scene(Pane, 1200, 700);
	    primaryStage.setTitle("Island Survival"); // Set the window title
	    primaryStage.setScene(scene); // Place the scene in the window
	    primaryStage.show(); // Display the window
	    
	    taTextBox.appendText("The last thing you remember before blacking out was the loud sound of beeping and crashing as your plane "
	    						+ "fell out of the sky. You vaguely remember the pilots yelling about the plane lossing all power over "
	    						+ "this island. After examining yourself, thankfully you learn you aren't too hurt. Looking around "
	    						+ "you find some damanged paper and quickly scribble down what you saw of this island while crashing. "
	    						+ "Your head is still fuzzy from the landing, but one thing you know for sure is that you have to leave this island!" + "\n" + "\n");
	    
	    PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	}
	
	public static void PlaneHead(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
									String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
									RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
									RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
									RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
									TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {
		
		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);
		
		//First Visit Check
		if (locationArray[0][2] == "False") {
			taTextBox.appendText("All you can see for a few miles is hills and tall grass. In the very far distance over the ocean "
									+ "appears to be a more land, and hopefully civilization. You just need a way to get there..." + "\n" + "\n");
			locationArray[0][2] = "True";
		}
		else {
			taTextBox.appendText("The fires have died down at this chunk of the plane, you quickly look for more survivors "
									+ "but find no signs of the others. Hopefully someone else managed to make it..." + "\n" + "\n");
		}
		
		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});
		
		btScavenge.setOnAction(
	    		e -> {
	    			if(locationArray[0][3] == "0") {
		    			taTextBox.appendText("You find the where they store the on board meals for passengers, most of it didn't "
		    									+ "make it, but some did!" + "\n" + "\n");
		    			//Food + 3
		    			resourceArray[0] = resourceArray[0] + 3;
		    			lbFood.setText("Food: " + resourceArray[0]);
		    			//Water + 2
		    			resourceArray[1] = resourceArray[1] + 2;
		    			lbWater.setText("Water: " + resourceArray[1]);
		    			locationArray[0][3] = "1";
	    			}
	    			else if(locationArray[0][3] == "1") {
		    			taTextBox.appendText("You look through the cockpit of the downed plane, unfortunately finding both the pilots "
		    									+ "dead. You do salvage some electronics that are still working, though out of power." + "\n" + "\n");
		    			//Scrap + 2
		    			resourceArray[3] = resourceArray[3] + 2;
		    			lbScrap.setText("Scrap: " + resourceArray[3]);
		    			locationArray[0][3] = "2";
	    			}
	    			else if(locationArray[0][3] == "2") {
		    			taTextBox.appendText("Besides the bodies of those who didn't make it, you find the snack cart somewhat intact with food." + "\n" + "\n");
		    			//Food + 2
		    			resourceArray[0] = resourceArray[0] + 2;
		    			lbFood.setText("Food: " + resourceArray[0]);
		    			locationArray[0][3] = "3";
	    			}
	    			else {
	    				taTextBox.appendText("After searching the plane again, you find nothing useful." + "\n" + "\n");
	    			}
	    		});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});
		
		btExplore.setOnAction(
	    		e -> {
	    			if(locationArray[1][1] == "False") {
	    				taTextBox.appendText("You find a recent trail going away from the plane, survivors! "
	    										+ "Following them leads to a town in the distance!" + "\n" + "\n");
	    				locationArray[1][1] = "True";
	    				rbForestTown.setVisible(true);
	    			}
	    			else if(locationArray[2][1] == "False") {
	    				taTextBox.appendText("You discover a forest over some hills. The more interesting news is that there "
	    										+ "is a lot of smoke coming from within. Maybe a handmade fire?" + "\n" + "\n");
	    				locationArray[2][1] = "True";
	    				rbPlaneTail.setVisible(true);
	    			}
	    			else {
	    				taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
	    			}
	    		});
		
		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void ForestTown(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[1][2] == "False") {
			taTextBox.appendText("You arrive at the village near the forest edge, only to find it desolate and in ruin." + "\n" + "\n");
			locationArray[1][2] = "True";
		}
		else {
			taTextBox.appendText("A chilling wind blows through the empty buildings as you arrive, it is too calm..." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[1][3] == "0") {
						taTextBox.appendText("You search some homes, finding some supplies underneath loose floorboards." + "\n" + "\n");
						//Food + 3
						resourceArray[0] = resourceArray[0] + 3;
						lbFood.setText("Food: " + resourceArray[0]);
						//Water + 3
						resourceArray[1] = resourceArray[1] + 3;
						lbWater.setText("Water: " + resourceArray[1]);
						locationArray[1][3] = "1";
					}
					else if(locationArray[1][3] == "1") {
						taTextBox.appendText("On the side of some buildings you find some small stockpiles of useable wood." + "\n" + "\n");
						//Wood + 3
						resourceArray[2] = resourceArray[2] + 3;
						lbWood.setText("Wood: " + resourceArray[2]);

						locationArray[1][3] = "2";
					}
					else if(locationArray[1][3] == "2") {
						taTextBox.appendText("After more searching, you find nothing useful. However looking down the well at "
												+ "the center of town you can see water at the bottom. With some wood..., "
												+ "you could repair the well to get some." + "\n" + "\n");

						locationArray[1][3] = "3";
					}
					else {
						taTextBox.appendText("You find the town is empty of both life and supplies." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
	    			if (locationArray[1][3] == "3" && resourceArray[2] >= 2) {
	    				taTextBox.appendText("With some difficulties, you manage to fix the well crank long enough to gather "
	    										+ "some water before it completely falls apart." + "\n" + "\n");
	    				//Water + 4
						resourceArray[1] = resourceArray[1] + 4;
						lbWater.setText("Water: " + resourceArray[1]);
						//Wood - 2
						resourceArray[2] = resourceArray[2] - 2;
						lbWood.setText("Wood: " + resourceArray[2]);
						locationArray[1][3] = "4";
	    			}
	    			else if (locationArray[1][3] == "3" && resourceArray[2] < 2) {
	    				taTextBox.appendText("You lack the wood to fix the well crank." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    			}
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[2][1] == "False") {
						taTextBox.appendText("From here you can see smoke from inside the forest, maybe people built a fire there?." + "\n" + "\n");
						locationArray[2][1] = "True";
						rbPlaneTail.setVisible(true);
					}
					else if(locationArray[3][1] == "False") {
						taTextBox.appendText("Down a dirt road you can see a jeep that crashed into a ditch. Something useful could be in there..." + "\n" + "\n");
						locationArray[3][1] = "True";
						rbBrokenJeep.setVisible(true);
					}
					else if(locationArray[4][1] == "False") {
						taTextBox.appendText("You go through the town and find a grand manor on a hill in the distance, must be the island owner's home." + "\n" + "\n");
						locationArray[4][1] = "True";
						rbManor.setVisible(true);
					}
					else if(locationArray[5][1] == "False") {
						taTextBox.appendText("Down a small road you can see a few shacks and a dock by the lake. Hopefully some fish are being stored there." + "\n" + "\n");
						locationArray[5][1] = "True";
						rbLake.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void PlaneTail(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[2][2] == "False") {
			taTextBox.appendText("In a clearing you find the other half of the plane you arrived in. Just as destroyed, "
									+ "with as many people sadly fallen, hopefully you can find something useful." + "\n" + "\n");
			locationArray[2][2] = "True";
		}
		else {
			taTextBox.appendText("You arrive back at the plane's back half, a few more damaged trees have fallen around the clearing." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[2][3] == "0") {
						taTextBox.appendText("After crawling till the very back of the plane, you where the employee food is stored. "
												+ "Or what is left of it." + "\n" + "\n");
						//Food + 2
						resourceArray[0] = resourceArray[0] + 2;
						lbFood.setText("Food: " + resourceArray[0]);
						//Water + 2
						resourceArray[1] = resourceArray[1] + 2;
						lbWater.setText("Water: " + resourceArray[1]);
						locationArray[2][3] = "1";
					}
					else if(locationArray[2][3] == "1") {
						taTextBox.appendText("By investigation, you discover that plenty of the machinery in the plane's tail "
												+ "is still functional, if you can find the tools needed to reach them." + "\n" + "\n");

						locationArray[2][3] = "2";
					}
					else {
						taTextBox.appendText("There isn't anything left that isn't destoryed or gone." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[1][1] == "False") {
						taTextBox.appendText("Through the trees of the forest you can see some buildings, looks like a village." + "\n" + "\n");
						locationArray[1][1] = "True";
						rbForestTown.setVisible(true);
					}
					else if(locationArray[6][1] == "False") {
						taTextBox.appendText("After traveling a bit further you can see a large damaged building with chopped trees around it." + "\n" + "\n");
						locationArray[6][1] = "True";
						rbNorthernSawmill.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void BrokenJeep(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[3][2] == "False") {
			taTextBox.appendText("On the side of the road you climb down a ditch and find a mostly intact jeep. You try to start "
									+ "it up, but it's long gone. Yet, it is still surprisly in decent condition." + "\n" + "\n");
			locationArray[3][2] = "True";
		}
		else {
			taTextBox.appendText("You return to the jeep with a little spark of hope it could turn on, but are disappointed with dead silence." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[3][3] == "0") {
						taTextBox.appendText("You take a look under the hood, not finding much but some of the engine. "
												+ "Yet without the proper tools you can't take it apart." + "\n" + "\n");
						locationArray[3][3] = "1";
					}
					else {
						taTextBox.appendText("Nothing else is left." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
	    			if (locationArray[3][3] == "1" && resourceArray[5] == 1) {
	    				taTextBox.appendText("Using the tools you take the decent parts of the engine and then pry off the gas cap. "
								+ "You siphon out the rest of the fuel, now only if you can find a vehicle that actually works." + "\n" + "\n");
	    				//Scrap + 5
						resourceArray[3] = resourceArray[3] + 5;
						lbScrap.setText("Scrap: " + resourceArray[3]);
						resourceArray[6] = resourceArray[6] + 1;
						lbGasoline.setVisible(true);
						locationArray[3][3] = "2";
	    			}
	    			else if (locationArray[3][3] == "1" && resourceArray[5] == 0) {
	    				taTextBox.appendText("Without tools you cannot harvest from the engine." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    			}
	    		});

		btExplore.setOnAction(
				e -> {
					taTextBox.appendText("There is nothing notable nearby." + "\n" + "\n");
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void Manor(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[4][2] == "False") {
			taTextBox.appendText("Slowly opening the doors you quickly realize how much this manor truly is. "
									+ "There is bound to be plenty of supplies in here, you just gotta find them." + "\n" + "\n");
			locationArray[4][2] = "True";
		}
		else {
			taTextBox.appendText("Returning here kinda makes you want to live in a place like this, but you have to focas on escaping first." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[4][3] == "0") {
						taTextBox.appendText("You search though the ruined kitchen and find some food in a cupboard." + "\n" + "\n");
						//Food + 3
						resourceArray[0] = resourceArray[0] + 3;
						lbFood.setText("Food: " + resourceArray[0]);
						
						locationArray[4][3] = "1";
					}
					else if(locationArray[4][3] == "1") {
						taTextBox.appendText("Upstairs hidden under the masterbed was some water bottles, and next to the bed a few planks of wood. "
												+ "Looks like they were in the middle of boarding up the windows..." + "\n" + "\n");
						//Water + 2
						resourceArray[1] = resourceArray[1] + 2;
						lbFood.setText("Food: " + resourceArray[0]);
						//Wood + 2
						resourceArray[2] = resourceArray[2] + 2;

						locationArray[4][3] = "2";
					}
					else if(locationArray[4][3] == "2") {
						taTextBox.appendText("You make your way down into the basement, making sure to stay as quiet as possible. "
												+ "Each step you take deeper in is darker and colder till you arrive at the back. "
												+ "At the back corner is a bunch of bodies facing away from a set of keys, as if "
												+ "guarding them. You grab the keys and run out of there, feeling like something is "
												+ "watching from the shadows..." + "\n" + "\n");
						resourceArray[4] = resourceArray[4] + 1;
						lbLighthouseKey.setVisible(true);
						locationArray[4][3] = "3";
					}
					else {
						taTextBox.appendText("Everything else is destroyed or too difficult to remove." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[7][1] == "False") {
						taTextBox.appendText("After exploreing the overgrown backyard you can see a smaller road going towards the coast and a building." + "\n" + "\n");
						locationArray[7][1] = "True";
						rbDockHouse.setVisible(true);
					}
					else if(locationArray[8][1] == "False") {
						taTextBox.appendText("From the second story you can see something in the water near one of the beaches. Wonder what it is..." + "\n" + "\n");
						locationArray[8][1] = "True";
						rbWreckedBoat.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void Lake(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[5][2] == "False") {
			taTextBox.appendText("Finally you make it to the lake dock, and it is beatiful. Too bad it smells so bad due to rotting fish." + "\n" + "\n");
			locationArray[5][2] = "True";
		}
		else {
			taTextBox.appendText("The fishy smell informs you that you have made it to the lake." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[5][3] == "0") {
						taTextBox.appendText("Ripping open the sheds reveals various foods that's supposed to be used as bait, "
												+ "but you'll take what you can get." + "\n" + "\n");
						//Food + 4
						resourceArray[0] = resourceArray[0] + 3;
						lbFood.setText("Food: " + resourceArray[0]);

						locationArray[5][3] = "1";
					}
					else if(locationArray[5][3] == "1") {
						taTextBox.appendText("In a nearby truck is a large glass jar of water. While the jar is dirty, the water appears fine." + "\n" + "\n");
						//Water + 3
						resourceArray[1] = resourceArray[1] + 3;
						lbWater.setText("Water: " + resourceArray[1]);
						
						locationArray[5][3] = "2";
					}
					else {
						taTextBox.appendText("Besides rotting fish, nothing else remains." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[7][1] == "False") {
						taTextBox.appendText("From the lake you can see a large building near the coast with ships? Maybe an escape!." + "\n" + "\n");
						locationArray[7][1] = "True";
						rbDockHouse.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void NorthernSawmill(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[6][2] == "False") {
			taTextBox.appendText("After travling through the trees, you arrive at a clearing. The smell of sawdust is strong when reach the buildings." + "\n" + "\n");
			locationArray[6][2] = "True";
		}
		else {
			taTextBox.appendText("The repeat trip back here proves to be much easier as you reach the sawmill." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[6][3] == "0") {
						taTextBox.appendText("You grab as much free chopped wood as you can, making sure to mentally thank the workers "
												+ "who did all the hard work for you." + "\n" + "\n");
						//Wood + 6
						resourceArray[2] = resourceArray[2] + 6;
						lbWood.setText("Wood: " + resourceArray[2]);

						locationArray[6][3] = "1";
					}
					else {
						taTextBox.appendText("Bugs have rampaged the rest of the wood, making it too fragile to do much with" + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					taTextBox.appendText("There is nothing notable nearby." + "\n" + "\n");
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void DockHouse(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[7][2] == "False") {
			taTextBox.appendText("As you reach the dock house you see plenty of boats. Excitedly you check each one, "
									+ "only to find them all beyond fixing. At least you had a taste of freedom for a second..." + "\n" + "\n");
			locationArray[7][2] = "True";
		}
		else {
			taTextBox.appendText("You have to remind yourself of the conditions of the boats when you arrive to not play yourself." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[1][3] == "0") {
						taTextBox.appendText("Although the boats are a in terrible condition, they were still some rations inside them and "
												+ "the building itself." + "\n" + "\n");
						//Food + 1
						resourceArray[0] = resourceArray[0] + 1;
						lbFood.setText("Food: " + resourceArray[0]);
						//Water + 2
						resourceArray[1] = resourceArray[1] + 2;
						lbWater.setText("Water: " + resourceArray[1]);
						
						locationArray[1][2] = "1";
					}
					else {
						taTextBox.appendText("Constant water damage ruined everything else worth taking." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[4][1] == "False") {
						taTextBox.appendText("Up on the hill you can see a very large house overlooking the valley." + "\n" + "\n");
						locationArray[4][1] = "True";
						rbManor.setVisible(true);
					}
					else if(locationArray[5][1] == "False") {
						taTextBox.appendText("Up the river you can see it enter a large lake." + "\n" + "\n");
						locationArray[5][1] = "True";
						rbLake.setVisible(true);
					}
					else if(locationArray[8][1] == "False") {
						taTextBox.appendText("Off the coast you can see a ship crashed into a reef." + "\n" + "\n");
						locationArray[8][1] = "True";
						rbWreckedBoat.setVisible(true);
					}
					else if(locationArray[9][1] == "False") {
						taTextBox.appendText("By the river there is a wooden bridge leading to the other side." + "\n" + "\n");
						locationArray[9][1] = "True";
						rbRiverBridge.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void WreckedBoat(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[8][2] == "False") {
			taTextBox.appendText("Out on a reef is a larger boat, stuck on the coral. It could be risky swimming out there...,"
									+ "but you have to try to escape! The waves are tough, but you get onboard, just be quick here." + "\n" + "\n");
			locationArray[8][2] = "True";
		}
		else {
			taTextBox.appendText("You pull yourself onto the boat again, maybe you missed something before?" + "\n" + "\n");
		}
		
		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[8][3] == "0") {
						taTextBox.appendText("Some of the random various parts look intact enough to use." + "\n" + "\n");
						//Scrap + 2
						resourceArray[3] = resourceArray[3] + 2;
						lbScrap.setText("Scrap: " + resourceArray[3]);

						locationArray[8][3] = "1";
					}
					else if(locationArray[8][3] == "1") {
						taTextBox.appendText("In the engine room is parts that look pristine! With tools you could take them and repair a boat..." + "\n" + "\n");

						locationArray[8][3] = "2";
					}
					else {
						taTextBox.appendText("Nothing else here is worth the risk of weighing you down on the return swim." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
	    			if (locationArray[8][3] == "2" && resourceArray[5] == 1) {
	    				taTextBox.appendText("You take the near perfect boat engine parts, as well as anything else that looks half decent." + "\n" + "\n");
	    				//Scrap + 3
						resourceArray[3] = resourceArray[3] + 3;
						lbScrap.setText("Scrap: " + resourceArray[3]);
						resourceArray[7] = resourceArray[7] + 1;
						lbBoatParts.setVisible(true);
						locationArray[8][3] = "3";
	    			}
	    			else if (locationArray[2][3] == "2" && resourceArray[5] == 0) {
	    				taTextBox.appendText("You don't want to risk damanging the parts by not using tools." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    			}	    		
	    		});

		btExplore.setOnAction(
				e -> {
					taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void RiverBridge(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[9][2] == "False") {
			taTextBox.appendText("The bridge is too broken and dangerous to pass with those jagged rocks underneath it. But it looks fixable, "
									+ "if you had the supplies." + "\n" + "\n");
			locationArray[9][2] = "True";
		}
		else {
			taTextBox.appendText("You arrive at the river bridge." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					taTextBox.appendText("Beside waterlogged planks, nothing here is worth the backpack space." + "\n" + "\n");
				});
		
		btInteract.setOnAction(
	    		e -> {
	    			if (locationArray[9][3] == "0" && resourceArray[2] >= 7 && resourceArray[3] >= 3) {
	    				taTextBox.appendText("After plenty of hardwork and a few close calls, you finish the bridge repairs." + "\n" + "\n");
	    				//Wood - 7
	    				resourceArray[2] = resourceArray[2] - 7;
	    				lbWood.setText("Wood: " + resourceArray[2]);
	    				//Scrap - 3
	    				resourceArray[3] = resourceArray[3] - 3;
	    				lbScrap.setText("Scrap: " + resourceArray[3]);
	    				locationArray[9][3] = "1";
	    			}
					else if (locationArray[9][3] == "0" && (resourceArray[2] < 7 || resourceArray[3] < 3)) {
	    				taTextBox.appendText("You lack the supplies to fix the bridge." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    			}
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[9][3] == "1") {
						if(locationArray[10][1] == "False") {
							taTextBox.appendText("From the bridge you can see a lumber yard in the southern forest." + "\n" + "\n");
							locationArray[10][1] = "True";
							rbSouthernLumberyard.setVisible(true);
						}
						else if(locationArray[11][1] == "False") {
							taTextBox.appendText("Through the moutain pass you can see sheds and minecarts, looks like a mineshaft." + "\n" + "\n");
							locationArray[11][1] = "True";
							rbMine.setVisible(true);
						}
						else if(locationArray[14][1] == "False") {
							taTextBox.appendText("Along the river you find a bridge made of stone that leads to a smaller island." + "\n" + "\n");
							locationArray[14][1] = "True";
							rbStoneBridge.setVisible(true);
						}
						else {
							taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
						}
					}
					else {
						taTextBox.appendText("You can't cross the bridge until it is fixed." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void SouthernLumberyard(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[10][2] == "False") {
			taTextBox.appendText("You follow a trail of tree stumps till you reach an open area with dozens of large trees pilled up. "
									+ "Wonder what they where preparing all these for?" + "\n" + "\n");
			locationArray[10][2] = "True";
		}
		else {
			taTextBox.appendText("The forest get easier everytime you travel through it, and you reach the lumber yard in no time." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[10][3] == "0") {
						taTextBox.appendText("Most of the wood is ruined thanks to the weather, but some of it was protected." + "\n" + "\n");
						//Wood + 3
						resourceArray[2] = resourceArray[2] + 3;
						lbWood.setText("Wood: " + resourceArray[2]);

						locationArray[10][3] = "1";
					}
					else {
						taTextBox.appendText("The rest of the wood is warped too badly to use." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[11][1] == "False") {
						taTextBox.appendText("On the other side of the lumber yard is a cave that appears to lead to a mine?" + "\n" + "\n");
						locationArray[11][1] = "True";
						rbMine.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void Mine(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[11][2] == "False") {
			taTextBox.appendText("With shaking hands, you stumble into the mine. As you get deeper you find body after body, "
									+ "each decayed to nearly nothing but skin and bones. It looks lke they were n the middle "
									+ "of work when somehting happened to them. The urge to leave this island grows within you suddenly." + "\n" + "\n");
			locationArray[11][2] = "True";
		}
		else {
			taTextBox.appendText("The mine is dark and cold, but you power through it, only getting lost a few times." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[11][3] == "0") {
						taTextBox.appendText("You find some extra minecart pieces that could be useful." + "\n" + "\n");
						//Scrap + 5
						resourceArray[3] = resourceArray[3] + 5;
						lbScrap.setText("Scrap: " + resourceArray[3]);

						locationArray[11][3] = "1";
					}
					else if(locationArray[11][3] == "1") {
						taTextBox.appendText("In a rest area you find some leftover food and water, but not much." + "\n" + "\n");
						//Food + 1
						resourceArray[0] = resourceArray[0] + 4;
						lbFood.setText("Food: " + resourceArray[0]);
						//Water + 2
						resourceArray[1] = resourceArray[1] + 3;

						locationArray[11][3] = "2";
					}
					else if(locationArray[11][3] == "2") {
						taTextBox.appendText("You break down an old door and find a set of tools. Who knows what you can do with these..." + "\n" + "\n");
						resourceArray[5] = resourceArray[5] + 1;
						lbSetofTools.setVisible(true);

						locationArray[11][3] = "3";
					}
					else {
						taTextBox.appendText("Nothing else you can see is useful." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[10][1] == "False") {
						taTextBox.appendText("One of the mine exits leads to a forest clearing with a lot of tree stumps." + "\n" + "\n");
						locationArray[10][1] = "True";
						rbSouthernLumberyard.setVisible(true);
					}
					else if(locationArray[12][1] == "False") {
						locationArray[12][1] = "True";
						taTextBox.appendText("Following the aged vehicles up the road leads to a town in the mountains." + "\n" + "\n");
						rbMountainTown.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void MountainTown(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[12][2] == "False") {
			taTextBox.appendText("Up in the mountains there are several buildings and homes, all barely hanging on to their frames. "
									+ "even more bodies lay everywhere. What happened to this island?" + "\n" + "\n");
			locationArray[12][2] = "True";
		}
		else {
			taTextBox.appendText("When you arrive its just as empty as before, and just as creepy." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
					if(locationArray[12][3] == "0") {
						taTextBox.appendText("Hardly anything is still intact, by you find something at least." + "\n" + "\n");
						//Food + 2
						resourceArray[0] = resourceArray[0] + 2;
						lbFood.setText("Food: " + resourceArray[0]);
						//Water + 2
						resourceArray[1] = resourceArray[1] + 2;
						lbWater.setText("Water: " + resourceArray[1]);
						
						locationArray[12][3] = "1";
					}
					else if(locationArray[12][3] == "1") {
						taTextBox.appendText("You find a shed with some stuff in it." + "\n" + "\n");
						//Wood + 3
						resourceArray[2] = resourceArray[2] + 3;
						lbWood.setText("Wood: " + resourceArray[2]);
						//Scrap + 3
						resourceArray[3] = resourceArray[3] + 3;
						lbScrap.setText("Scrap: " + resourceArray[3]);

						locationArray[12][3] = "2";
					}
					else {
						taTextBox.appendText("You find nothing else useful." + "\n" + "\n");
					}
				});
		
		btInteract.setOnAction(
	    		e -> {
		    		taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[11][1] == "False") {
						taTextBox.appendText("Down the stone road leads to a abandoned mine." + "\n" + "\n");
						locationArray[11][1] = "True";
						rbMine.setVisible(true);
					}
					else if(locationArray[13][1] == "False") {
						taTextBox.appendText("Up on a cliff egde nearby is a dormant lighthouse, its light off." + "\n" + "\n");
						locationArray[13][1] = "True";
						rbLighthouse.setVisible(true);
					}
					else if(locationArray[14][1] == "False") {
						taTextBox.appendText("From the top of a smaller mountain you can see a bridge reaching to a tiny islad off the coast." + "\n" + "\n");
						locationArray[14][1] = "True";
						rbStoneBridge.setVisible(true);
					}
					else {
						taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void Lighthouse(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[13][2] == "False" && resourceArray[4] == 1) {
			taTextBox.appendText("You climb up a small hill while admiring the beatiful lighthouse. You feel a bit sad "
										+ "when you see the light is off, yet who is left to maintain it?" + "\n" + "\n");
			locationArray[13][2] = "True";
		}
		else if (locationArray[13][2] == "True") {
			taTextBox.appendText("You are left a bit tired, but you make it to the dark lighthouse." + "\n" + "\n");
		}
		else {
			taTextBox.appendText("You try to enter the lighthouse, but the door remains shut in front of you. Looks like you need a key..." + "\n" + "\n");
			MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
		}
		
		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
						taTextBox.appendText("There is nothing to scavenge here." + "\n" + "\n");
				});
		
		btInteract.setOnAction(
	    		e -> {
	    			if (locationArray[13][3] == "0" && resourceArray[4] == 1) {
	    				taTextBox.appendText("The door creaks open as you enter the base floor of the lighthouse. You slowly climb "
	    										+ "the stairs till you reach the top. Next to the dea light is a body clenching "
	    										+ "a key. You grab it and head back down, feeling even colder than before." + "\n" + "\n");
						resourceArray[8] = resourceArray[8] + 1;
						lbCaveKey.setVisible(true);
						locationArray[13][3] = "1";
	    			}
	    			else if (locationArray[13][3] == "0" && resourceArray[4] == 0) {
	    				taTextBox.appendText("Without the key you can't enter." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    			}
	    		});

		btExplore.setOnAction(
				e -> {
					taTextBox.appendText("There is nothing notable nearby." + "\n" + "\n");
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void StoneBridge(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[14][2] == "False") {
			taTextBox.appendText("Turning a corner, you can barley see the brigde as it is covered in dead plants. "
									+ "Each plant is filled with thorns and bristles, making passage not possible. You're gonna have to clear it somehow." + "\n" + "\n");
			locationArray[14][2] = "True";
		}
		else {
			taTextBox.appendText("The bridge is beatiful, with carvings in every stone. But you don't have time for sight seeing, you have to escape." + "\n" + "\n");
		}

		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
						taTextBox.appendText("Nothing here is worth taking." + "\n" + "\n");
				});
		
		btInteract.setOnAction(
	    		e -> {
	    			if (locationArray[14][3] == "0" && resourceArray[6] == 1) {
	    				taTextBox.appendText("You pour some of the gasoline on the plants and then set it on fire. Soon it all "
	    										+ "burns away, leaving a clear bridge to continue." + "\n" + "\n");
	    				locationArray[14][3] = "1";
	    			}
					else if (locationArray[14][3] == "0" && resourceArray[2] == 0) {
	    				taTextBox.appendText("You lack the supplies to clear the bridge." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    			}
	    		});

		btExplore.setOnAction(
				e -> {
					if(locationArray[14][3] == "1") {
						if(locationArray[15][1] == "False") {
							taTextBox.appendText("After exploring the small island, you find a hidden cave near the one beach." + "\n" + "\n");
							rbSecretCave.setVisible(true);
						}
						else {
							taTextBox.appendText("After searching you found no new locations." + "\n" + "\n");
						}
					}
					else {
						taTextBox.appendText("You can't cross the bridge until it is cleared." + "\n" + "\n");
					}
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You travel to the hidden cave." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SecretCave(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	public static void SecretCave(int[] playerStats, int[] resourceArray, Label lbFood, Label lbWater, Label lbWood, Label lbScrap, Label lbLighthouseKey, Label lbSetofTools, Label lbGasoline, Label lbBoatParts, Label lbCaveKey,  
			String[][] locationArray, RadioButton rbPlaneHead, RadioButton rbForestTown, RadioButton rbPlaneTail, RadioButton rbBrokenJeep, 
			RadioButton rbManor, RadioButton rbLake, RadioButton rbNorthernSawmill, RadioButton rbDockHouse, RadioButton rbWreckedBoat, 
			RadioButton rbRiverBridge, RadioButton rbSouthernLumberyard, RadioButton rbMine, RadioButton rbMountainTown, 
			RadioButton rbLighthouse, RadioButton rbStoneBridge, RadioButton rbSecretCave,
			TextArea taTextBox, Button btEat, Button btDrink, Button btScavenge, Button btInteract, Button btExplore, Button btTravel) {

		rbPlaneHead.setSelected(false);
		rbForestTown.setSelected(false);
		rbPlaneTail.setSelected(false);
		rbBrokenJeep.setSelected(false);
		rbManor.setSelected(false);
		rbLake.setSelected(false);
		rbNorthernSawmill.setSelected(false);
		rbDockHouse.setSelected(false);
		rbWreckedBoat.setSelected(false);
		rbRiverBridge.setSelected(false);
		rbSouthernLumberyard.setSelected(false);
		rbMine.setSelected(false);
		rbMountainTown.setSelected(false);
		rbLighthouse.setSelected(false);
		rbStoneBridge.setSelected(false);
		rbSecretCave.setSelected(false);

		//First Visit Check
		if (locationArray[15][2] == "False" && resourceArray[8] == 1) {
			taTextBox.appendText("At long last you find your way inside after unlocking the door, crawling and climbing till you reach an opening. "
									+ "The caves opens to the ocean, with a mall shed nearby. In the water sits a boat gently "
									+ "bobbing up and down with the currents. It doesn't turn on, but it looks to have been repaired "
									+ "to near perfection. You just need fuel and some missing parts, then you are good to go!" + "\n" + "\n");
			locationArray[15][2] = "True";
		}
		else if (locationArray[15][2] == "True") {
			taTextBox.appendText("The cave echos as water drops hit rain from the ceiling. The boat is still there, waiting for repairs." + "\n" + "\n");
		}
		else {
			taTextBox.appendText("A large iron bar door block the only path into this cave. You feel that the answer must be in there, "
									+ "if only you had the key." + "\n" + "\n");
			StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
		}
		
		if(playerStats[0] <= 2 && playerStats[0] > 0) {
			taTextBox.appendText("You are getting hungry..." + "\n" + "\n");
		}
		else if(playerStats[0] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too hungry to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		if(playerStats[1] <= 2 && playerStats[1] > 0) {
			taTextBox.appendText("You are getting thirsty..." + "\n" + "\n");
		}
		else if(playerStats[1] <= 0) {
			taTextBox.appendText("You collapse onto the ground, too thirsty to go on..." + "\n" + "\n");
			taTextBox.appendText("GAME OVER!" + "\n" + "\n");
			taTextBox.appendText("Restart the program to try again." + "\n" + "\n");
			btEat.setVisible(false);
			btDrink.setVisible(false);
			btScavenge.setVisible(false);
			btInteract.setVisible(false);
			btExplore.setVisible(false);
			btTravel.setVisible(false);
		}
		
		btEat.setOnAction(
	    		e -> {
	    			if(resourceArray[0] > 0 && playerStats[0] < 5) {
	    				playerStats[0] = playerStats[0] + 2;
	    				resourceArray[0] = resourceArray[0] - 1;
	    				taTextBox.appendText("You eat some food." + "\n" + "\n");
	    				lbFood.setText("Food: " + resourceArray[0]);
	    			}
	    			else if (resourceArray[0] == 0){
	    				taTextBox.appendText("You are out of anything edible." + "\n" + "\n");
	    			}
	    			else if (playerStats[0] > 4) {
	    				taTextBox.appendText("You are not hungry." + "\n" + "\n");
	    			}
	    		});
		
		btDrink.setOnAction(
	    		e -> {
	    			if(resourceArray[1] > 0 && playerStats[1] < 5) {
	    				playerStats[1] = playerStats[1] + 2;
	    				resourceArray[1] = resourceArray[1] - 1;
	    				taTextBox.appendText("You drink some water." + "\n" + "\n");
	    				lbWater.setText("Water: " + resourceArray[1]);
	    			}
	    			else if (resourceArray[1] == 0){
	    				taTextBox.appendText("You are out of anything drinkable." + "\n" + "\n");
	    			}
	    			else if (playerStats[1] > 4) {
	    				taTextBox.appendText("You are not thirsty." + "\n" + "\n");
	    			}
	    		});

		btScavenge.setOnAction(
				e -> {
						taTextBox.appendText("Only the boat here is useful." + "\n" + "\n");
				});
		
		btInteract.setOnAction(
	    		e -> {
	    			if (locationArray[15][3] == "0" && resourceArray[6] == 1 && resourceArray[7] == 1 && resourceArray[2] >= 5 && resourceArray[3] >= 15) {
	    				//Wood - 5
	    				resourceArray[2] = resourceArray[2] - 5;
	    				lbWood.setText("Wood: " + resourceArray[2]);
	    				//Scrap - 10
	    				resourceArray[3] = resourceArray[3] - 10;
	    				lbScrap.setText("Scrap: " + resourceArray[3]);
	    				taTextBox.appendText("Taking the parts you got from the reefed ship off the coast, you "
	    										+ "replace to broken versions in this boat as best as you can. "
	    										+ "After you take that gasoline tank and slowly pour it till its "
	    										+ "empty. You hop inside and turn key a few times, each failing to"
	    										+ "power the engine. Taking a deep breathe.., you turn it one more "
	    										+ "time and the boat roars to life. Quickly you jet out of the cave "
	    										+ "and turn towards the sight of land. At least there can't be worse "
	    										+ "then this island right..?" + "\n" + "\n");
	    				
	    				taTextBox.appendText("YOU ESCAPED!" + "\n" + "\n");
	    				 
	    				btEat.setVisible(false);
	    				btDrink.setVisible(false);
	    				btScavenge.setVisible(false);
	    				btInteract.setVisible(false);
	    				btExplore.setVisible(false);
	    				btTravel.setVisible(false);
	    				
						locationArray[15][3] = "1";
	    			}
	    			else if (locationArray[15][3] == "0" && (resourceArray[6] == 0 || resourceArray[7] == 0)) {
	    				taTextBox.appendText("You feel you're so close to escaping, you're just missing something." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("There is nothing here to interact with." + "\n" + "\n");
	    			}
	    		});

		btExplore.setOnAction(
				e -> {
					taTextBox.appendText("There is nothing notable nearby." + "\n" + "\n");
				});

		btTravel.setOnAction(
	    		e -> {
	    			if(rbPlaneHead.isSelected()) {
		    			taTextBox.appendText("You travel to the plane's front end." + "\n" + "\n");
		    			playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
		    			PlaneHead(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
		    	    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
		    	    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
		    	    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbForestTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town near the forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				ForestTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbPlaneTail.isSelected()) {
	    				taTextBox.appendText("You travel to the plane's back end." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				PlaneTail(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbBrokenJeep.isSelected()) {
	    				taTextBox.appendText("You travel to the broken jeep." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				BrokenJeep(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbManor.isSelected()) {
	    				taTextBox.appendText("You travel to the abandoned manor." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Manor(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLake.isSelected()) {
	    				taTextBox.appendText("You travel to the lake dock." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lake(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbNorthernSawmill.isSelected()) {
	    				taTextBox.appendText("You travel to the sawmill in the northern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				NorthernSawmill(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbDockHouse.isSelected()) {
	    				taTextBox.appendText("You travel to the dockhouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				DockHouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbWreckedBoat.isSelected()) {
	    				taTextBox.appendText("You travel to the wrecked boat." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				WreckedBoat(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbRiverBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the river bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				RiverBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSouthernLumberyard.isSelected()) {
	    				taTextBox.appendText("You travel to the lumberyard in  the southern forest." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				SouthernLumberyard(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMine.isSelected()) {
	    				taTextBox.appendText("You travel to the mines." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Mine(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbMountainTown.isSelected()) {
	    				taTextBox.appendText("You travel to the town in the mountains." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				MountainTown(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbLighthouse.isSelected()) {
	    				taTextBox.appendText("You travel to the lighthouse." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				Lighthouse(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbStoneBridge.isSelected()) {
	    				taTextBox.appendText("You travel to the stone bridge." + "\n" + "\n");
	    				playerStats[0] = playerStats[0] - 1; playerStats[1] = playerStats[1] - 1;
	    				StoneBridge(playerStats, resourceArray, lbFood, lbWater, lbWood, lbScrap, lbLighthouseKey, lbSetofTools, lbGasoline, lbBoatParts, lbCaveKey, 
	    		    			locationArray, rbPlaneHead, rbForestTown, rbPlaneTail, rbBrokenJeep, rbManor, rbLake, rbNorthernSawmill, rbDockHouse, 
	    		    			rbWreckedBoat, rbRiverBridge, rbSouthernLumberyard, rbMine, rbMountainTown, rbLighthouse, rbStoneBridge, rbSecretCave,
	    		    			taTextBox, btEat, btDrink, btScavenge, btInteract, btExplore, btTravel);
	    			}
	    			else if(rbSecretCave.isSelected()) {
	    				taTextBox.appendText("You are already here." + "\n" + "\n");
	    			}
	    			else {
	    				taTextBox.appendText("Select a location on the map to travel there." + "\n" + "\n");
	    			}
	    		});
	}
	
	/**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   * line.
	   */
	public static void main(String[] args) {
		launch(args);
	}
}