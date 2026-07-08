package com.facebook.animated.webp;

import X.C1322350kW1;
import X.C1328580kg4;
import X.C1329890kiB;
import X.C1330000kiM;
import X.C1330450kj5;
import X.EnumC1329860ki8;
import X.EnumC1329870ki9;
import X.InterfaceC1329600khi;
import X.InterfaceC1330350kiv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import so6.g;

/* JADX INFO: loaded from: classes21.dex */
public class WebPImage extends g implements InterfaceC1330350kiv {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

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

    public WebPImage() {
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.InterfaceC1329600khi
    public C1330000kiM getImageFormat() {
        return C1328580kg4.LJIIIZ;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage create(byte[] bArr) {
        C1330450kj5.LIZ();
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
        WebPFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            if (frame.LIZ()) {
                enumC1329870ki9 = EnumC1329870ki9.BLEND_WITH_PREVIOUS;
            } else {
                enumC1329870ki9 = EnumC1329870ki9.NO_BLEND;
            }
            if (frame.LIZIZ()) {
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

    public static WebPImage create(ByteBuffer byteBuffer) {
        C1330450kj5.LIZ();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    @Override // X.InterfaceC1329600khi
    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static WebPImage create(long j, int i) {
        boolean z;
        C1330450kj5.LIZ();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        return nativeCreateFromNativeMemory(j, i);
    }

    @Override // X.InterfaceC1330350kiv
    public InterfaceC1329600khi decode(long j, int i) {
        return create(j, i);
    }
}
