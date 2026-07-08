package com.facebook.animated.gif;

import X.C1322210kVn;
import X.C1322350kW1;
import X.C1328580kg4;
import X.C1329360khK;
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
public class GifImage extends g implements InterfaceC1330350kiv {
    public static volatile boolean sInitialized;
    public long mNativeContext;

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // X.InterfaceC1329600khi
    public boolean doesRenderSupportScaling() {
        return false;
    }

    public static synchronized void ensure() {
        if (!sInitialized) {
            sInitialized = true;
            C1322210kVn.LIZIZ("gifimage");
        }
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
    public int getLoopCount() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // X.InterfaceC1329600khi
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.InterfaceC1329600khi
    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }

    public GifImage() {
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.InterfaceC1329600khi
    public C1330000kiM getImageFormat() {
        return C1328580kg4.LIZJ;
    }

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public static GifImage createFromByteArray(byte[] bArr) {
        bArr.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        return createFromByteBuffer(byteBufferAllocateDirect, C1329360khK.LJIIZILJ);
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer) {
        return createFromByteBuffer(byteBuffer, C1329360khK.LJIIZILJ);
    }

    public static EnumC1329860ki8 fromGifDisposalMethod(int i) {
        if (i == 0) {
            return EnumC1329860ki8.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return EnumC1329860ki8.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return EnumC1329860ki8.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return EnumC1329860ki8.DISPOSE_TO_PREVIOUS;
        }
        return EnumC1329860ki8.DISPOSE_DO_NOT;
    }

    @Override // X.InterfaceC1330350kiv
    public InterfaceC1329600khi decode(ByteBuffer byteBuffer) {
        return createFromByteBuffer(byteBuffer, null);
    }

    @Override // X.InterfaceC1329600khi
    public C1329890kiB getFrameInfo(int i) {
        GifFrame frame = getFrame(i);
        try {
            C1329890kiB c1329890kiB = new C1329890kiB(frame.getXOffset(), frame.getYOffset(), frame.getWidth(), frame.getHeight(), EnumC1329870ki9.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.LIZ()));
            frame.dispose();
            return c1329890kiB;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            frame.dispose();
            throw th;
        }
    }

    @Override // X.InterfaceC1329600khi
    public GifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer, C1329360khK c1329360khK) {
        ensure();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
    }

    public static GifImage createFromFileDescriptor(int i, C1329360khK c1329360khK) {
        ensure();
        return nativeCreateFromFileDescriptor(i, Integer.MAX_VALUE, false);
    }

    @Override // X.InterfaceC1330350kiv
    public InterfaceC1329600khi decode(long j, int i) {
        return createFromNativeMemory(j, i, null);
    }

    public static GifImage createFromNativeMemory(long j, int i, C1329360khK c1329360khK) {
        boolean z;
        ensure();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        return nativeCreateFromNativeMemory(j, i, 65534, false);
    }
}
