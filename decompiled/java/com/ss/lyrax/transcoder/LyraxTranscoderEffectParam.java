package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderEffectParam {
    public String color;
    public boolean enable;
    public boolean enableSdkCallback;
    public boolean enableSegmentStore;
    public boolean enableWordMuting;
    public int thickness;

    public LyraxTranscoderEffectParam() {
    }

    public String getColor() {
        return this.color;
    }

    public int getThickness() {
        return this.thickness;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isEnableSdkCallback() {
        return this.enableSdkCallback;
    }

    public boolean isEnableSegmentStore() {
        return this.enableSegmentStore;
    }

    public boolean isEnableWordMuting() {
        return this.enableWordMuting;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setEnableSdkCallback(boolean z) {
        this.enableSdkCallback = z;
    }

    public void setEnableSegmentStore(boolean z) {
        this.enableSegmentStore = z;
    }

    public void setEnableWordMuting(boolean z) {
        this.enableWordMuting = z;
    }

    public void setThickness(int i) {
        this.thickness = i;
    }

    public LyraxTranscoderEffectParam(String str, int i) {
        this.color = str;
        this.thickness = i;
    }

    public LyraxTranscoderEffectParam(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableWordMuting = z;
        this.enableSegmentStore = z2;
        this.enableSdkCallback = z3;
        this.enable = z4;
    }
}
