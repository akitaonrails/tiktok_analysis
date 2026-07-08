package com.ss.pusher.core.buffer;

import com.ss.pusher.core.engine.NativeObject;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class RoiInfo extends NativeObject {
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

    public RoiInfo() {
        nativeCreate();
    }

    public final int getCenterPosX() {
        return nativeGetCenterPosX();
    }

    public final int getCenterPosY() {
        return nativeGetCenterPosY();
    }

    public final int getRoiHeight() {
        return nativeGetRoiHeight();
    }

    public final int getRoiWidth() {
        return nativeGetRoiWidth();
    }

    public final int[] getStretchedRoi() {
        return nativeGetStretchedRoi();
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void finalize() {
        release();
    }

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final void release() {
        super.release();
    }
}
