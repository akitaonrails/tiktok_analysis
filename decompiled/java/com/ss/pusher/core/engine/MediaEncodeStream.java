package com.ss.pusher.core.engine;

import X.InterfaceC1279120jOI;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.statics.StaticsReport;
import com.ss.pusher.core.transport.LibRTMPTransport;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class MediaEncodeStream {
    public long LIZ;
    public InternalObserver LIZIZ;
    public VsyncModule LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    private native TEBundle nativeGetParameter(long j);

    private native double nativeGetStaticsInfoWithKey(long j, String str);

    private native boolean nativeGetStaticsReport(long j, StaticsReport staticsReport);

    private native int nativeGetVideoEncodeBps(long j);

    private native void nativeOnData(long j, ByteBuffer byteBuffer, int i, int i2, int i3, long j2);

    private native void nativeOnFrame(long j, VideoFrame.Buffer buffer, int i, int i2, int i3, long j2);

    private native void nativeRegisterObserver(long j, Object obj);

    private native void nativeRelease(long j);

    private native void nativeRequestIDRFrame(long j);

    private native void nativeSetAudioBitrate(int i, long j);

    private native void nativeSetEstimateTimeInterval(long j, int i);

    private native void nativeSetIsAddCropInfo(long j, boolean z);

    private native void nativeSetParameter(long j, TEBundle tEBundle);

    private native void nativeSetSITICaculator(long j, SITICalculator sITICalculator);

    private native void nativeSetVideoEncoderFactory(long j, VideoEncoderFactory videoEncoderFactory);

    private native void nativeSetupTransport(long j, Transport transport);

    private native void nativeStart(long j);

    private native void nativeStartRecord(long j, String str);

    private native void nativeStop(long j);

    private native void nativeStopRecord(long j);

    private native void nativeUnRegisterObserver(long j, Object obj);

    public final synchronized void LJI() {
        if (this.LIZ == 0) {
            return;
        }
        this.LIZLLL.set(true);
        LJIILIIL();
        nativeSetVideoEncoderFactory(this.LIZ, null);
        VsyncModule vsyncModule = this.LIZJ;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.LIZJ = null;
        }
        nativeUnRegisterObserver(this.LIZ, this.LIZIZ);
        this.LIZIZ.release();
        this.LIZIZ = null;
        nativeRelease(this.LIZ);
        this.LIZ = 0L;
    }

    public native long nativeGetVsyncModule(long j);

    public final TEBundle LIZ() {
        return nativeGetParameter(this.LIZ);
    }

    public final int LIZJ() {
        return nativeGetVideoEncodeBps(this.LIZ);
    }

    public final void LJIIL() {
        nativeStart(this.LIZ);
    }

    public final void LJIILIIL() {
        nativeStop(this.LIZ);
    }

    public static class InternalObserver extends NativeObject implements InterfaceC1279120jOI {
        public InterfaceC1279120jOI mObserver;

        public void onChanged() {
        }

        public void registerObserver(InterfaceC1279120jOI interfaceC1279120jOI) {
            this.mObserver = interfaceC1279120jOI;
        }

        @Override // X.InterfaceC1279120jOI
        public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
            InterfaceC1279120jOI interfaceC1279120jOI = this.mObserver;
            if (interfaceC1279120jOI != null) {
                interfaceC1279120jOI.onMediaEncodeStreamEvent(i, i2, j, str);
            }
        }
    }

    public MediaEncodeStream(long j) {
        this.LIZ = j;
        this.LIZJ = new VsyncModule(nativeGetVsyncModule(j));
        InternalObserver internalObserver = new InternalObserver();
        this.LIZIZ = internalObserver;
        nativeRegisterObserver(this.LIZ, internalObserver);
    }

    public final boolean LIZIZ(StaticsReport staticsReport) {
        if (this.LIZLLL.get()) {
            return false;
        }
        return nativeGetStaticsReport(this.LIZ, staticsReport);
    }

    public final void LJFF(InterfaceC1279120jOI interfaceC1279120jOI) {
        this.LIZIZ.registerObserver(interfaceC1279120jOI);
    }

    public final void LJII(int i) {
        nativeSetEstimateTimeInterval(this.LIZ, i);
    }

    public final void LJIIIIZZ(boolean z) {
        nativeSetIsAddCropInfo(this.LIZ, z);
    }

    public final void LJIIIZ(TEBundle tEBundle) {
        nativeSetParameter(this.LIZ, tEBundle);
    }

    public final void LJIIJ(SITICalculator sITICalculator) {
        nativeSetSITICaculator(this.LIZ, sITICalculator);
    }

    public final void LJIIJJI(LibRTMPTransport libRTMPTransport) {
        if (libRTMPTransport != null) {
            libRTMPTransport.setVysncModule(new VsyncModule(nativeGetVsyncModule(this.LIZ)));
            nativeSetupTransport(this.LIZ, libRTMPTransport);
        }
    }

    public final void LIZLLL(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        nativeOnData(this.LIZ, byteBuffer, i, i2, i3, j);
    }

    public final void LJ(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        nativeOnFrame(this.LIZ, buffer, i, i2, i3, j);
    }
}
