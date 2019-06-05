/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.agenciaviajes.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dawish
 */
public class PopayanSanAndresBuilder extends PlanBuilder{
      @Override
    public void buildCliente() {
        try {
            Cliente cli = new Cliente("8665329", "Oscar", "Muños", "M", "Oscar@gmail.com", new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1995"));
            plan.setCliente(cli);
            plan.setTotalAdultos(2);
            plan.setTotalNinos(1);
        } catch (ParseException ex) {
            Logger.getLogger(SanAndresBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void buildTransportes() {
        plan.setTransporte("Popayan-San Andres");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.sumarValor(900567 * (this.plan.getTotalAdultos() + this.plan.getTotalNinos()));

    }

    @Override
    public void buildAlojamiento() {
        plan.setAlojamiento("Hotel Guacamole Premium");
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.sumarValor(308089);
    }

    @Override
    public void buildAlimentacion() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setAlimentacion("Desayuno, almuerzo y cena");
    }

    @Override
    public void buildSeguroHotelero() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a los hoteles
        plan.setSeguroHotelero(true);
        plan.sumarValor(56000);
    }

    @Override
    public void buildImpuestoTiquete() {
        // Se simplifica la lógica, pero en realidad este dato vendría de un servicio a las aerolineas
        plan.setImpuestoTiqute(true);
        plan.sumarValor(32000);
    }

    @Override
    public void buildTours() {
        String tours[] = {"Por los barrios"};
        plan.setTours(tours);
    }
}
