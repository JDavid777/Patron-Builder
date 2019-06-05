package co.agenciaviajes.negocio;

/**
 * Director Director que controla la creación paso a paso, solo cuando el Builder
 * ha terminado de construir el objeto lo recupera el Director
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class DirectorPlan {

    private PlanBuilder planBuilder;

    public DirectorPlan() {
    }
    
    public void construirPlan(){
        planBuilder.crearNuevoPlan();
        planBuilder.buildAlimentacion();
        planBuilder.buildAlojamiento();
        planBuilder.buildCliente();
        planBuilder.buildImpuestoTiquete();
        planBuilder.buildSeguroHotelero();
        planBuilder.buildTours();
        planBuilder.buildTransportes();
    }
    public Plan getPlan(){
        return planBuilder.getPlan();
    }
    public DirectorPlan(PlanBuilder planBuilder) {
        this.planBuilder = planBuilder;
    }

    
    // Completar métodos

    public PlanBuilder getPlanBuilder() {
        return planBuilder;
    }

    public void setPlanBuilder(PlanBuilder planBuilder) {
        this.planBuilder = planBuilder;
    }
    
}