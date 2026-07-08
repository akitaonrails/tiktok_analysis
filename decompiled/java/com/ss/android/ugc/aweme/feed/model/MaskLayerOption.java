package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes36.dex */
public class MaskLayerOption {
    public boolean mDoOrCancel;
    public int mIconResId;
    public int mTextResId;
    public int mType;

    public int getIconResId() {
        return this.mIconResId;
    }

    public int getTextResId() {
        return this.mTextResId;
    }

    public int getType() {
        return this.mType;
    }

    public boolean isDoOrCancel() {
        return this.mDoOrCancel;
    }

    public void setDoOrCancel(boolean z) {
        this.mDoOrCancel = z;
    }

    public void setIconResId(int i) {
        this.mIconResId = i;
    }

    public void setTextResId(int i) {
        this.mTextResId = i;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public MaskLayerOption(int i, int i2, int i3) {
        this.mType = i;
        this.mIconResId = i2;
        this.mTextResId = i3;
    }

    public MaskLayerOption(int i, int i2, int i3, boolean z) {
        this.mType = i;
        this.mIconResId = i2;
        this.mTextResId = i3;
        this.mDoOrCancel = z;
    }
}
