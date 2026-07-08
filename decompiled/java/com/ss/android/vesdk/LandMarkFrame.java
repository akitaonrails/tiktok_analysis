package com.ss.android.vesdk;

/* JADX INFO: loaded from: classes.dex */
public class LandMarkFrame {
    public float[] FOVAngle;
    public float[] quaternion;
    public double sensorTimestamp;

    public float[] getFOVAngle() {
        return this.FOVAngle;
    }

    public float[] getQuaternion() {
        return this.quaternion;
    }

    public double getSensorTimestamp() {
        return this.sensorTimestamp;
    }

    public void setFOVAngle(float[] fArr) {
        this.FOVAngle = fArr;
    }

    public void setQuaternion(float[] fArr) {
        this.quaternion = fArr;
    }

    public void setSensorTimestamp(double d) {
        this.sensorTimestamp = d;
    }

    public void setInfo(double d, float[] fArr, float[] fArr2) {
        this.sensorTimestamp = d;
        this.quaternion = fArr;
        this.FOVAngle = fArr2;
    }
}
