package com.ss.android.ugc.aweme.shortvideo.publish.watermark;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class WatermarkResSettingData implements Serializable {
    public static final int $stable = 0;
    public final int height;
    public final int width;

    public WatermarkResSettingData() {
        this(0, 0);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public WatermarkResSettingData(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
