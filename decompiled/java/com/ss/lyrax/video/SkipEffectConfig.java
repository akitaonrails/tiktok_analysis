package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class SkipEffectConfig {

    @C09CT("debug")
    public boolean debug;

    @C09CT("height")
    public int height;

    @C09CT("strategy")
    public int strategy;

    @C09CT("width")
    public int width;

    public SkipEffectConfig() {
        this.width = 360;
        this.height = 640;
    }

    public int getHeight() {
        return this.height;
    }

    public int getStrategy() {
        return this.strategy;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public SkipEffectConfig(int i, int i2, int i3, boolean z) {
        this.strategy = i;
        this.width = i2;
        this.height = i3;
        this.debug = z;
    }
}
