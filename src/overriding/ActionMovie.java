package overriding;

public class ActionMovie extends Movie {
public String fightScene(int  fightCount) {
	if(fightCount <=3 && fightCount > 0) {
		return fightCount+" fight scene is a normal movie" ;
	}
	
	if(fightCount >3 &&  fightCount <6) {
		return fightCount+" fight scene is a action movie" ;
	}
	if(fightCount >=6 ) {
		return fightCount+" fight scene is a super action movie" ;
	}
	else {
		return " normal movie" ;
	}
	
}
}
