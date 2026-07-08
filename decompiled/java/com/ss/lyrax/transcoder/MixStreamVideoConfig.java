package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class MixStreamVideoConfig {
    public float expectedRatio;
    public int gop;
    public int height;
    public boolean mixValidRegion;
    public int upgradeHeight;
    public int upgradeWidth;
    public int width;

    public float getExpectedRatio() {
        return this.expectedRatio;
    }

    public int getGop() {
        return this.gop;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean getMixValidRegion() {
        return this.mixValidRegion;
    }

    public int getUpgradeHeight() {
        return this.upgradeHeight;
    }

    public int getUpgradeWidth() {
        return this.upgradeWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public void setExpectedRatio(float f) {
        this.expectedRatio = f;
    }

    public void setGop(int i) {
        this.gop = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMixValidRegion(boolean z) {
        this.mixValidRegion = z;
    }

    public void setUpgradeHeight(int i) {
        this.upgradeHeight = i;
    }

    public void setUpgradeWidth(int i) {
        this.upgradeWidth = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
