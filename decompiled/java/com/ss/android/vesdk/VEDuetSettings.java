package com.ss.android.vesdk;

import X.EnumC1103230eob;
import X.EnumC12975055x;

/* JADX INFO: loaded from: classes18.dex */
public final class VEDuetSettings {
    public boolean enableV2;
    public float mAlpha;
    public String mDuetAudioPath;
    public String mDuetVideoPath;
    public boolean mIsFitMode;
    public float mXInPercent;
    public float mYInPercent;
    public EnumC1103230eob mPlayMode = EnumC1103230eob.ATTACH;
    public EnumC12975055x mDuetLayout = EnumC12975055x.VEDuetLayoutHorizontal;

    public String toString() {
        return "{\"mDuetVideoPath\":\"" + this.mDuetVideoPath + "\",\"mDuetAudioPath\":\"" + this.mDuetAudioPath + "\",\"mXInPercent\":" + this.mXInPercent + ",\"mYInPercent\":" + this.mYInPercent + ",\"mAlpha\":" + this.mAlpha + ",\"mIsFitMode\":" + this.mIsFitMode + ",\"enableV2\":" + this.enableV2 + ",\"DuetLayout\":" + this.mDuetLayout.ordinal() + '}';
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public String getDuetAudioPath() {
        return this.mDuetAudioPath;
    }

    public EnumC12975055x getDuetLayout() {
        return this.mDuetLayout;
    }

    public String getDuetVideoPath() {
        return this.mDuetVideoPath;
    }

    public boolean getEnableV2() {
        return this.enableV2;
    }

    public boolean getIsFitMode() {
        return this.mIsFitMode;
    }

    public EnumC1103230eob getPlayMode() {
        return this.mPlayMode;
    }

    public float getXInPercent() {
        return this.mXInPercent;
    }

    public float getYInPercent() {
        return this.mYInPercent;
    }

    public void setDuetLayout(EnumC12975055x enumC12975055x) {
        this.mDuetLayout = enumC12975055x;
    }

    public void setEnableV2(boolean z) {
        this.enableV2 = z;
    }

    public void setPlayMode(EnumC1103230eob enumC1103230eob) {
        this.mPlayMode = enumC1103230eob;
    }

    public VEDuetSettings(String str, String str2, float f, float f2, float f3, boolean z) {
        this.mDuetVideoPath = str;
        this.mDuetAudioPath = str2;
        this.mXInPercent = f;
        this.mYInPercent = f2;
        this.mAlpha = f3;
        this.mIsFitMode = z;
    }
}
