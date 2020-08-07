/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        KendaraanContext context = new KendaraanContext();
        
        context.setStrategy(new KendaraanMobil());
        context.namaSiswa("Andy");
        System.out.println("====================");
        
        context.setStrategy(new KendaraanMotor());
        context.namaSiswa("Farhan");
        System.out.println("====================");
        
        context.setStrategy(new KendaraanTransportasiUmum());
        context.namaSiswa("Helmi");        
    }
}
