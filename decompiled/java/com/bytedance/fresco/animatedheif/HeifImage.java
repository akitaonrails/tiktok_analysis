package com.bytedance.fresco.animatedheif;

import X.C1322350kW1;
import X.C1328540kg0;
import X.C1329890kiB;
import X.C1330000kiM;
import X.EnumC1329860ki8;
import X.EnumC1329870ki9;
import X.InterfaceC1329600khi;
import X.InterfaceC1330350kiv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import so6.g;

/* JADX INFO: loaded from: classes21.dex */
public class HeifImage extends g implements InterfaceC1330350kiv {
    public long mNativeContext;

    private native HeifImage nativeCloneHeifImage();

    public static native HeifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native HeifImage nativeCreateFromNativeMemory(long j, int i);

    public static native HeifImage nativeCreateFromNativeMemory(long j, int i, boolean z, int i2);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native HeifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // X.InterfaceC1329600khi
    public boolean doesRenderSupportScaling() {
        return false;
    }

    @Override // so6.g, X.InterfaceC1329600khi
    public InterfaceC1329600khi cloneOrNull() {
        return nativeCloneHeifImage();
    }

    @Override // X.InterfaceC1329600khi
    public int getDuration() {
        return nativeGetDuration();
    }

    @Override // X.InterfaceC1329600khi
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // X.InterfaceC1329600khi
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // X.InterfaceC1329600khi
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.InterfaceC1329600khi
    public C1330000kiM getImageFormat() {
        return C1328540kg0.LIZJ();
    }

    @Override // X.InterfaceC1329600khi
    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    @Override // X.InterfaceC1329600khi
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.InterfaceC1329600khi
    public int getWidth() {
        return nativeGetWidth();
    }

    public HeifImage() {
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public HeifImage(long j) {
        this.mNativeContext = j;
    }

    public static HeifImage create(byte[] bArr) {
        bArr.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(byteBufferAllocateDirect);
    }

    @Override // X.InterfaceC1330350kiv
    public InterfaceC1329600khi decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    @Override // X.InterfaceC1329600khi
    public C1329890kiB getFrameInfo(int i) {
        EnumC1329870ki9 enumC1329870ki9;
        EnumC1329860ki8 enumC1329860ki8;
        HeifFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            if (frame.isBlendWithPreviousFrame()) {
                enumC1329870ki9 = EnumC1329870ki9.BLEND_WITH_PREVIOUS;
            } else {
                enumC1329870ki9 = EnumC1329870ki9.NO_BLEND;
            }
            if (frame.shouldDisposeToBackgroundColor()) {
                enumC1329860ki8 = EnumC1329860ki8.DISPOSE_TO_BACKGROUND;
            } else {
                enumC1329860ki8 = EnumC1329860ki8.DISPOSE_DO_NOT;
            }
            C1329890kiB c1329890kiB = new C1329890kiB(xOffset, yOffset, width, height, enumC1329870ki9, enumC1329860ki8);
            frame.dispose();
            return c1329890kiB;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            frame.dispose();
            throw th;
        }
    }

    public static HeifImage create(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    @Override // X.InterfaceC1329600khi
    public HeifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static HeifImage create(long j, int i) {
        boolean z;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        return nativeCreateFromNativeMemory(j, i, false, 1);
    }

    @Override // X.InterfaceC1330350kiv
    public InterfaceC1329600khi decode(long j, int i) {
        return create(j, i);
    }
}
