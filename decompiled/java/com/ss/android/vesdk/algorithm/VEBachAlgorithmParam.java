package com.ss.android.vesdk.algorithm;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public class VEBachAlgorithmParam extends VEBaseAlgorithmParam {
    public String algorithmConfig;
    public Bitmap bitmap;
    public String graphName;
    public String picturePath;
    public int reqHeight;
    public int reqWidth;

    public VEBachAlgorithmParam() {
        this(8, "Bach", false);
    }

    public String getAlgorithmConfig() {
        return this.algorithmConfig;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public VEBachAlgorithmParam(int i, String str, boolean z) {
        super(i, str, z);
    }
}
