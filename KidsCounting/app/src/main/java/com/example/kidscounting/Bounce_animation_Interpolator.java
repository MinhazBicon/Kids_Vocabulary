package com.example.kidscounting;

import android.view.animation.Interpolator;

public class Bounce_animation_Interpolator implements Interpolator {
    private double amplitude = 1,frequency = 15;

    public Bounce_animation_Interpolator(double amplitude, double frequency) {
        this.amplitude = amplitude;
        this.frequency = frequency;
    }

    @Override
    public float getInterpolation(float v) {
        float time = (float) (-1*Math.pow(Math.E, -v/amplitude)*Math.cos(frequency*v)+1);

        return time;


    }
}
