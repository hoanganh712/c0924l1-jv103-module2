package ss18_case_study.controller;

import java.util.ArrayList;

public class VehicleController {
    private ArrayList<Vehicle> danhSachPhuongTien;

    public VehicleController() {
        this.danhSachPhuongTien = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle vehicle) {
        return danhSachPhuongTien.add(vehicle);
    }

    public ArrayList<Vehicle> getVehiclesByType(String type) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v : danhSachPhuongTien) {
            if (v.getLoai().equals(type)) {
                result.add(v);
            }
        }
        return result;
    }

    public boolean removeVehicle(String bienKiemSoat) {
        Vehicle vehicleToRemove = null;
        for (Vehicle v : danhSachPhuongTien) {
            if (v.getBienKiemSoat().equals(bienKiemSoat)) {
                vehicleToRemove = v;
                break;
            }
        }
        if (vehicleToRemove != null) {
            danhSachPhuongTien.remove(vehicleToRemove);
            return true;
        }
        return false;
    }
}

