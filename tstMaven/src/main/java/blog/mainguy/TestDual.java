package blog.mainguy;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: michaelmainguy
 * Date: 5/15/12
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestDual {
    public static class Vehicle implements RaceCar {
        String color;
        public void setColor(String color) {
            this.color = color;

        }

        public String getColor() {
            return color;
        }

        public void driveFast() {
            System.out.println("put put ...");
        }

        public <T extends RaceCar> T getRaceCar() {
            return (T)this;
        }

    }

    public static class Audi extends Vehicle implements FastRaceCar {
        @Override
        public void driveFaster() {
            System.out.println("Vroooooom!");
        }
    }

    public static class Ford extends Vehicle {

    }



    public static interface RaceCar {
        void driveFast();
    }

    public static interface FastRaceCar extends RaceCar {
        void driveFaster();
    }


    public static void main(String[] args) {
        Ford f = new Ford();
        RaceCar r = f.getRaceCar();
        r.driveFast();

        Audi a = new Audi();
        FastRaceCar fcr = a.getRaceCar();
        fcr.driveFaster();

        FastRaceCar fcr2 = f.getRaceCar();

        RaceCar rc = a.getRaceCar();
        rc.driveFast();

    }


    public class LookupEntity {
        private String name;
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object other) {
            if (other != null && other instanceof  LookupEntity) {
                return new EqualsBuilder().append(this.getName(), ((LookupEntity)other).getName()).isEquals();
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder().append(this.getName()).hashCode();
        }


    }

}
