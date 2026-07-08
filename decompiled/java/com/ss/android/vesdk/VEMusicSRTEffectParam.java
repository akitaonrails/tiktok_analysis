package com.ss.android.vesdk;

import X.C1DP5;
import X.C1DP6;
import X.C1DP7;

/* JADX INFO: loaded from: classes36.dex */
public class VEMusicSRTEffectParam {
    public boolean mAddMask;
    public String mEffectResourcePath;
    public int mFontFaceIndex;
    public String mFontTTFPath;
    public C1DP7 mGetMusicProgressInvoker;
    public int mMaskColor;
    public boolean mParamUpdated;
    public C1DP5[] mSrtData;

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        C1DP7 c1dp7 = this.mGetMusicProgressInvoker;
        if (c1dp7 != null) {
            return c1dp7.LIZ();
        }
        return 0.0f;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length][];
        for (int i = 0; i < this.mSrtData.length; i++) {
            iArr[i] = convertDataToUnicode32(null);
        }
        return iArr;
    }

    public VEMusicSRTEffectParam() {
        this.mMaskColor = 1291845632;
    }

    public boolean getAddMask() {
        return this.mAddMask;
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    private int[] convertDataToUnicode32(C1DP5 c1dp5) {
        throw null;
    }

    public void setAddMask(boolean z) {
        this.mAddMask = z;
        this.mParamUpdated = true;
    }

    public void setMaskColor(int i) {
        this.mMaskColor = i;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(C1DP5[] c1dp5Arr, String str, String str2, int i, C1DP7 c1dp7) {
        this.mMaskColor = 1291845632;
        this.mSrtData = c1dp5Arr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = c1dp7;
        this.mParamUpdated = true;
    }

    public void updateEffectResPath(C1DP5[] c1dp5Arr, String str, String str2, int i, C1DP7 c1dp7) {
        this.mSrtData = c1dp5Arr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = c1dp7;
        this.mParamUpdated = true;
    }

    public VEMusicBitmapParam generateBitmap(String str, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        C1DP7 c1dp7 = this.mGetMusicProgressInvoker;
        if (c1dp7 != null && (c1dp7 instanceof C1DP6)) {
            return ((C1DP6) c1dp7).LJJJJZI();
        }
        return null;
    }

    public VEMusicBitmapParam generateBitmapUnicode(int[] iArr, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        if (iArr != null && iArr.length > 0) {
            return generateBitmap(new String(iArr, 0, iArr.length), i, i2, i3, f, i4, i5, i6);
        }
        return null;
    }
}
