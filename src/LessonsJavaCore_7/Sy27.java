package LessonsJavaCore_7;

import java.util.Random;

public class Sy27 extends Plane implements SpecialFeatures {

    Random random = new Random ( );

    Airplanecontrol airControl = new Airplanecontrol ( );

    public void setAirControl ( Airplanecontrol airControl ) {
        this.airControl = airControl;
    }

    public Airplanecontrol getAirControl ( ) {
        return airControl;
    }

    Plane plane = new Plane ( ) {
        @Override
        public String toString ( ) {
            return super.toString ( );
        }
    };

    public Sy27 ( ) {

    }

    public Sy27 ( int Length ,int Width ,int Weight ) {
        super ( Length ,Width ,Weight );
    }


    @Override
    public void TurboAcceleration ( ) {
        int turb = random.nextInt ( 150 ) + 90;
        System.out.println ( "ТурбоПрискорення " + turb );
    }

    @Override
    public void StealthTechnology ( ) {
        int stealth = random.nextInt ( 10 ) + 1;
        System.out.println ( "літака не видно " + stealth );
    }

    @Override
    public void NuclearStrike ( ) {
        int nuclear = random.nextInt ( 1 ) + 5;
        System.out.println ( "ядерних боєоловок скинуто " + nuclear );
    }
}
