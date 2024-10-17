package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        // ( °C × 9/5) + 32 =  °F
        float temperatureFahrenheit = (float)(temperatureCelsius * 1.8) + 32;
        System.out.println(temperatureFahrenheit);
    }
}
