package com.bytedance.pitaya.api.bean;

import X.C122500dL;

/* JADX INFO: loaded from: classes.dex */
public final class PTYNDArray extends PTYClass {
    public static final C122500dL Companion = new Object() { // from class: X.00dL
    };
    public final int bits;
    public final int deviceID;
    public final int deviceType;
    public final int index;
    public final int lanes;
    public final byte[] rawBytes;
    public final int rawDataType;
    public final float[] rawFloats;
    public final int[] shapes;
    public final int type;

    public static /* synthetic */ void getRawDataType$annotations() {
    }

    public final int getBits() {
        return this.bits;
    }

    public final int getDeviceID() {
        return this.deviceID;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLanes() {
        return this.lanes;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final float[] getRawFloats() {
        return this.rawFloats;
    }

    public final int[] getShapes() {
        return this.shapes;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTYNDArray(int i, byte[] bArr, float[] fArr, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        super(3);
        int i7 = 3;
        this.index = i;
        this.rawBytes = bArr;
        this.rawFloats = fArr;
        this.shapes = iArr;
        this.type = i2;
        this.bits = i3;
        this.lanes = i4;
        this.deviceID = i5;
        this.deviceType = i6;
        if (bArr != null) {
            i7 = 2;
        } else if (fArr == null) {
            throw new IllegalArgumentException("NDArray has no data!");
        }
        this.rawDataType = i7;
    }
}
