package com.ss.android.ttve.vealgorithm.params;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes28.dex */
public class VEBachCommonImageParam extends VEAlgorithmParam {
    public Bitmap[] bitmaps;
    public int mattingOutType;
    public String outDir;
    public String path;
    public float reframeRatio;
    public short[] resourceBuffer;
    public int algorithmType = VEBachCommonImageType.VEBachAlgorithmTypeNone;
    public String configPath = "";
    public boolean returnCrop = true;
    public int mFindCountorType = 0;
    public int dilateOrErodeValue = 0;
    public int resourceWidth = -1;
    public int resourceHeight = -1;

    public VEBachCommonImageParam() {
        this.type = VEAlgorithmType.VEAlgorithmTypeBachCommonImage;
    }

    public short[] getResourceBuffer() {
        return this.resourceBuffer;
    }
}
