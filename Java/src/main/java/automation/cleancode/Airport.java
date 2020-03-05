package automation.cleancode;

import automation.cleancode.models.ClassificationLevel;
import automation.cleancode.planes.ExperimentalPlane;
import automation.cleancode.models.MilitaryType;
import automation.cleancode.planes.MilitaryPlane;
import automation.cleancode.planes.PassengerPlane;
import automation.cleancode.planes.Plane;
import java.util.*;

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getListOfPassengerPlanes() {
        List<PassengerPlane> listOfPassengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                listOfPassengerPlanes.add((PassengerPlane) plane);
            }
        }
        return listOfPassengerPlanes;
    }

    public List<MilitaryPlane> getListOfMilitaryPlanes() {
        List<MilitaryPlane> listOfMilitaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                listOfMilitaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return listOfMilitaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getListOfPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity()
                    > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getListOfTransportMilitaryPlanes() {
        List<MilitaryPlane> listOfTransportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getListOfMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.TRANSPORT) {
                listOfTransportMilitaryPlanes.add(plane);
            }
        }
        return listOfTransportMilitaryPlanes;
    }

    public List<MilitaryPlane> getListOfBomberMilitaryPlanes() {
        List<MilitaryPlane> listOfBomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getListOfMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                listOfBomberMilitaryPlanes.add(plane);
            }
        }
        return listOfBomberMilitaryPlanes;
    }

    public List<ExperimentalPlane> getListOfExperimentalPlanes() {
        List<ExperimentalPlane> listOfExperimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                listOfExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return listOfExperimentalPlanes;
    }

    public Airport sortPlanesByMaxDistance() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane thisPlane, Plane thatPlane) {
                return thisPlane.getMaxFlightDistance() - thatPlane.getMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortPlanesByMaxSpeed() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane thisPlane, Plane thatPlane) {
                return thisPlane.getMaxSpeed() - thatPlane.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortPlanesByMaxLoadCapacity() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane thisPlane, Plane thatPlane) {
                return thisPlane.getMaxLoadCapacity() - thatPlane.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public boolean isSortedInAscendingOrderOfPlanesMaxLoadCapacity() {
        boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;

        for (int i = 0; i < planes.size() - 1; i++) {
            Plane currentPlane = planes.get(i);
            Plane nextPlane = planes.get(i + 1);
            if (currentPlane.getMaxLoadCapacity() > nextPlane.getMaxLoadCapacity()) {
                nextPlaneMaxLoadCapacityIsHigherThanCurrent = false;
                break;
            }
        }
        return nextPlaneMaxLoadCapacityIsHigherThanCurrent;
    }

    public boolean hasUnclassifiedExperimentalPlanes() {
        List<ExperimentalPlane> listOfExperimentalPlanes = getListOfExperimentalPlanes();
        boolean hasUnclassifiedExperimentalPlanes = false;

        for (ExperimentalPlane experimentalPlane : listOfExperimentalPlanes) {
            if (experimentalPlane.getClassificationLevel().name()
                    .equals(ClassificationLevel.UNCLASSIFIED.name())) {
            hasUnclassifiedExperimentalPlanes = true;
            break;
            }
        }
        return hasUnclassifiedExperimentalPlanes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        for (Plane plane : collection) {
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes = " + planes.toString() +
                '}';
    }
}