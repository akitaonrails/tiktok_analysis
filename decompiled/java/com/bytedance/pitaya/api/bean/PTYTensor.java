package com.bytedance.pitaya.api.bean;

import X.C122300dJ;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes.dex */
public final class PTYTensor extends PTYClass {
    public static final C122300dJ Companion = new Object() { // from class: X.00dJ
    };
    public final int dataFormat;
    public final int dataType;
    public final int[] dims;
    public final int fraction;
    public final String name;
    public final byte[] rawBytes;
    public final int rawDataType;
    public final float[] rawFloats;

    private final int dataTypeSize(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 20) {
            return 2;
        }
        if (i == 22) {
            return 8;
        }
        switch (i) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 1;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 2;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 4;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void getRawDataType$annotations() {
    }

    public final int getDataFormat() {
        return this.dataFormat;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final int[] getDims() {
        return this.dims;
    }

    public final int getFraction() {
        return this.fraction;
    }

    public final String getName() {
        return this.name;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final float[] getRawFloats() {
        return this.rawFloats;
    }

    public PTYTensor(byte[] bArr, float[] fArr, int i, int i2, int[] iArr, int i3, String str) {
        int i4;
        super(0);
        this.rawBytes = bArr;
        this.rawFloats = fArr;
        this.dataType = i;
        this.dataFormat = i2;
        this.dims = iArr;
        this.fraction = i3;
        this.name = str;
        if (bArr != null) {
            i4 = 2;
        } else if (fArr != null) {
            i4 = 3;
        } else {
            throw new IllegalArgumentException("Tensor has no data!");
        }
        this.rawDataType = i4;
    }
}
