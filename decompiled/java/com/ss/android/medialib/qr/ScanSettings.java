package com.ss.android.medialib.qr;

/* JADX INFO: loaded from: classes36.dex */
public class ScanSettings {
    public String detectModelDir;
    public float detectRectHeight;
    public float detectRectLeft;
    public float detectRectTop;
    public float detectRectWidth;
    public boolean enableDetectRect;
    public int width = -1;
    public int height = -1;
    public long detectRequirement = 65536;
    public int buildChainFlag = 1;

    public int getBuildChainFlag() {
        return this.buildChainFlag;
    }

    public String getDetectModelDir() {
        return this.detectModelDir;
    }

    public long getDetectRequirement() {
        return this.detectRequirement;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
