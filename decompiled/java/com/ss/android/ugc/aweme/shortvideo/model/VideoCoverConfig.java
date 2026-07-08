package com.ss.android.ugc.aweme.shortvideo.model;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoCoverConfig {
    public final Bitmap.Config config;
    public final int displayHeight;
    public final int displayWidth;

    public VideoCoverConfig() {
        this(0, 0, Bitmap.Config.ARGB_8888);
    }

    public VideoCoverConfig(int i, int i2, Bitmap.Config config) {
        this.displayWidth = i;
        this.displayHeight = i2;
        this.config = config;
    }
}
