/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class KendaraanContext {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void namaSiswa(String name) {
        strategy.kendaraanKeSekolah(name);
    }
}
