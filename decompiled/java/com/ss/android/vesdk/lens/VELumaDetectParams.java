package com.ss.android.vesdk.lens;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes36.dex */
public class VELumaDetectParams extends VEBaseRecorderLensParams {
    public float ecStep;
    public int faceNum;
    public Rect[] faceRects;
    public int iso = 100;
    public int minIso = 100;
    public int maxIso = 6400;
    public int exposureTime = 1;
    public int minExposureTime = 1;
    public int maxExposureTime = 1;
    public int detectFrames = 3;
}
