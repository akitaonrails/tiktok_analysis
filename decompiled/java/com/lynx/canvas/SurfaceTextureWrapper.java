package com.lynx.canvas;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceTextureWrapper {
    public final SurfaceTexture LIZ;
    public Surface LIZIZ;

    public double getTimestamp() {
        SurfaceTexture surfaceTexture = this.LIZ;
        if (surfaceTexture == null) {
            return 0.0d;
        }
        long timestamp = surfaceTexture.getTimestamp();
        long jAbs = Math.abs(System.nanoTime() - timestamp);
        long jAbs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - timestamp);
        return r4 - Math.min(Math.min(jAbs, jAbs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - timestamp));
    }

    public void release() {
        SurfaceTexture surfaceTexture = this.LIZ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        Surface surface = this.LIZIZ;
        if (surface != null) {
            surface.release();
        }
    }

    public float[] updateTexture() {
        SurfaceTexture surfaceTexture = this.LIZ;
        if (surfaceTexture == null) {
            return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        surfaceTexture.updateTexImage();
        float[] fArr = new float[16];
        this.LIZ.getTransformMatrix(fArr);
        return fArr;
    }

    public SurfaceTextureWrapper(int i, int i2, int i3) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.LIZ = surfaceTexture;
        if (i2 > 0 && i3 > 0) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
    }

    public static SurfaceTextureWrapper create(int i, int i2, int i3) {
        return new SurfaceTextureWrapper(i, i2, i3);
    }
}
