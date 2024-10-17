package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        // ( °C × 9/5) + 32 =  °F
        float temperatureFahrenheit = (temperatureCelsius * (float)(9 / 5)) + 32;
        System.out.println(temperatureFahrenheit);
    }
}
