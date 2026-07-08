package com.ss.ttlivestreamer.core.buffer;

import X.C1273850jFn;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes21.dex */
public class RoiInfo extends NativeObject {
    public long externalNativeObj;
    public int height;
    public float mLatestRoiSurfaceRatio;
    public int width;

    private native void nativeCreate();

    private native int nativeGetCenterPosX();

    private native int nativeGetCenterPosY();

    private native ByteBuffer nativeGetFacePointsData();

    private native int nativeGetRoiHeight();

    private native float nativeGetRoiPitch();

    private native float nativeGetRoiRoll();

    private native int nativeGetRoiWidth();

    private native float nativeGetRoiYaw();

    private native int[] nativeGetStretchedRoi();

    private native void nativeLockFacePointsData();

    private native void nativeSetEnable(boolean z);

    private native void nativeSetRoiInfo(int i, int i2, int i3, int i4, float f, float f2, float f3);

    private native void nativeUnlockFacePointsData();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        if (this.externalNativeObj != 0) {
            setNativeObj(0L);
            this.externalNativeObj = 0L;
        }
        super.release();
    }

    public int getCenterPosX() {
        return nativeGetCenterPosX();
    }

    public int getCenterPosY() {
        return nativeGetCenterPosY();
    }

    public ByteBuffer getFacePointsData() {
        return nativeGetFacePointsData();
    }

    public int getRoiHeight() {
        return nativeGetRoiHeight();
    }

    public float getRoiPitch() {
        return nativeGetRoiPitch();
    }

    public float getRoiRoll() {
        return nativeGetRoiRoll();
    }

    public int getRoiWidth() {
        return nativeGetRoiWidth();
    }

    public float getRoiYaw() {
        return nativeGetRoiYaw();
    }

    public int[] getStretchedRoi() {
        return nativeGetStretchedRoi();
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void finalize() {
        release();
    }

    public float getLatestRoiSurfaceRatio() {
        return this.mLatestRoiSurfaceRatio;
    }

    public void lockFacePointsData() {
        nativeLockFacePointsData();
    }

    public void unlockFacePointsData() {
        nativeUnlockFacePointsData();
    }

    public RoiInfo(long j) {
        this.externalNativeObj = j;
        setNativeObj(j);
        this.width = getRoiWidth();
        this.height = getRoiHeight();
    }

    public ByteBuffer getFaceRectsData(C1273850jFn c1273850jFn) {
        if (c1273850jFn == null) {
            c1273850jFn = new C1273850jFn();
        }
        int[] stretchedRoi = getStretchedRoi();
        if (stretchedRoi != null && stretchedRoi.length >= 4) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(0, 2);
            byteBufferAllocate.putInt(4, 20);
            int i = stretchedRoi[0];
            int i2 = stretchedRoi[2];
            float f = ((i + i2) / 2.0f) / this.width;
            float f2 = ((stretchedRoi[1] + stretchedRoi[3]) / 2.0f) / this.height;
            float fAbs = Math.abs(i2 - i) / this.width;
            float fAbs2 = Math.abs(stretchedRoi[3] - stretchedRoi[1]) / this.height;
            float f3 = c1273850jFn.LIZJ * fAbs;
            float f4 = c1273850jFn.LIZLLL * fAbs2;
            float fFloatValue = ((Float) clamp(Float.valueOf((f - (f3 / 2.0f)) + (c1273850jFn.LIZ * fAbs)), Float.valueOf(0.0f), Float.valueOf(1.0f))).floatValue();
            float fFloatValue2 = ((Float) clamp(Float.valueOf((f2 - (f4 / 2.0f)) + (c1273850jFn.LIZIZ * fAbs2)), Float.valueOf(0.0f), Float.valueOf(1.0f))).floatValue();
            float fFloatValue3 = ((Float) clamp(Float.valueOf(fFloatValue + f3), Float.valueOf(0.0f), Float.valueOf(1.0f))).floatValue();
            float fFloatValue4 = ((Float) clamp(Float.valueOf(fFloatValue2 + f4), Float.valueOf(0.0f), Float.valueOf(1.0f))).floatValue();
            this.mLatestRoiSurfaceRatio = f3 * f4;
            byteBufferAllocate.putFloat(8, fFloatValue);
            byteBufferAllocate.putFloat(12, fFloatValue2);
            byteBufferAllocate.putFloat(16, fFloatValue3);
            byteBufferAllocate.putFloat(20, fFloatValue4);
            byteBufferAllocate.putFloat(24, c1273850jFn.LJ);
            byteBufferAllocate.rewind();
            return byteBufferAllocate;
        }
        return null;
    }

    public void setEnable(boolean z) {
        nativeSetEnable(z);
    }

    public RoiInfo(int i, int i2) {
        this.width = i;
        this.height = i2;
        nativeCreate();
        nativeSetRoiInfo(0, 0, i, i2, 0.0f, 0.0f, 0.0f);
    }

    public static <T extends Comparable<T>> T clamp(T t, T t2, T t3) {
        if (t.compareTo(t2) < 0) {
            return t2;
        }
        if (t.compareTo(t3) > 0) {
            return t3;
        }
        return t;
    }

    public RoiInfo(int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this(i3, i4);
        nativeSetRoiInfo(i, i2, i3, i4, f, f2, f3);
    }
}
