package com.ss.ttlivestreamer.core.engine;

import X.C2188811AlT;
import X.InterfaceC1267880j6A;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class MediaEncodeStream extends MediaEditorStream {
    public InternalObserver mInternalObserver;
    public long mNativeObj;
    public List<MediaTrack> mTracks;
    public Transport mTransport;
    public final List<Transport> mTransportList;
    public VsyncModule mVsyncModule;

    private native void nativeAddTrack(long j, MediaTrack mediaTrack);

    private native int nativeAddTransport(Transport transport, long j);

    private native TEBundle nativeGetParameter(long j);

    private native double nativeGetStaticsInfoWithKey(long j, String str);

    private native boolean nativeGetStaticsReport(long j, StaticsReport staticsReport);

    private native void nativeRegisterObserver(long j, Object obj);

    private native void nativeRelease(long j);

    private native void nativeRemoveTrack(long j, MediaTrack mediaTrack);

    private native void nativeRemoveTransport(Transport transport, long j);

    private native void nativeRequestIDRFrame(long j);

    private native void nativeSetAudioBitrate(int i, long j);

    private native void nativeSetEstimateTimeInterval(long j, int i);

    private native void nativeSetIsAddCropInfo(long j, boolean z);

    private native void nativeSetParameter(long j, TEBundle tEBundle);

    private native void nativeSetVideoEncoderFactory(long j, VideoEncoderFactory videoEncoderFactory);

    private native void nativeStart(long j);

    private native void nativeStartRecord(long j, String str);

    private native void nativeStop(long j);

    private native void nativeStopRecord(long j);

    public static native long nativeToEditorStream(long j);

    private native void nativeUnRegisterObserver(long j, Object obj);

    public native long nativeGetVsyncModule(long j);

    @Override // com.ss.ttlivestreamer.core.engine.MediaEditorStream
    public synchronized void release() {
        if (this.mNativeObj == 0) {
            return;
        }
        stop();
        for (Transport transport : this.mTransportList) {
            nativeRemoveTransport(transport, this.mNativeObj);
            transport.release();
        }
        this.mTransportList.clear();
        for (MediaTrack mediaTrack : this.mTracks) {
            nativeRemoveTrack(this.mNativeObj, mediaTrack);
            mediaTrack.release();
        }
        this.mTracks.clear();
        nativeSetVideoEncoderFactory(this.mNativeObj, null);
        if (this.mTransport != null) {
            this.mTransport = null;
        }
        VsyncModule vsyncModule = this.mVsyncModule;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.mVsyncModule = null;
        }
        nativeUnRegisterObserver(this.mNativeObj, this.mInternalObserver);
        this.mInternalObserver.release();
        this.mInternalObserver = null;
        super.release();
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0L;
    }

    public void setSITICaculator(SITICalculator sITICalculator) {
    }

    public TEBundle getParameter() {
        return nativeGetParameter(this.mNativeObj);
    }

    public void requestIDRFrame() {
        nativeRequestIDRFrame(this.mNativeObj);
    }

    public void start() {
        nativeStart(this.mNativeObj);
    }

    public void stop() {
        nativeStop(this.mNativeObj);
    }

    public void stopRecord() {
        nativeStopRecord(this.mNativeObj);
    }

    public VsyncModule getVsyncModule() {
        return this.mVsyncModule;
    }

    public class InternalObserver extends NativeObject implements InterfaceC1267880j6A {
        public InterfaceC1267880j6A mObserver;

        public void onChanged() {
        }

        public InternalObserver() {
        }

        public void registerObserver(InterfaceC1267880j6A interfaceC1267880j6A) {
            this.mObserver = interfaceC1267880j6A;
        }

        @Override // X.InterfaceC1267880j6A
        public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
            InterfaceC1267880j6A interfaceC1267880j6A = this.mObserver;
            if (interfaceC1267880j6A != null) {
                interfaceC1267880j6A.onMediaEncodeStreamEvent(i, i2, j, str);
            }
        }
    }

    public void addTrack(MediaTrack mediaTrack) {
        nativeAddTrack(this.mNativeObj, mediaTrack);
        this.mTracks.add(mediaTrack);
    }

    public int addTransport(Transport transport) {
        if (!this.mTransportList.contains(transport)) {
            this.mTransportList.add(transport);
            return nativeAddTransport(transport, this.mNativeObj);
        }
        return -1;
    }

    public boolean containTrack(MediaTrack mediaTrack) {
        return this.mTracks.contains(mediaTrack);
    }

    public double getStaticsInfoWithKey(String str) {
        return nativeGetStaticsInfoWithKey(this.mNativeObj, str);
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(this.mNativeObj, staticsReport);
    }

    public void registerObserver(InterfaceC1267880j6A interfaceC1267880j6A) {
        this.mInternalObserver.registerObserver(interfaceC1267880j6A);
    }

    public void removeTrack(MediaTrack mediaTrack) {
        if (this.mTracks.remove(mediaTrack)) {
            nativeRemoveTrack(this.mNativeObj, mediaTrack);
        }
    }

    public void removeTransport(Transport transport) {
        if (this.mTransportList.contains(transport)) {
            this.mTransportList.remove(transport);
            nativeRemoveTransport(transport, this.mNativeObj);
        }
    }

    public void setAudioBitrate(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioBitrate: ");
        sbLIZ.append(i);
        AVLog.iod("MediaEncodeStream", C2188811AlT.LIZIZ(sbLIZ));
        nativeSetAudioBitrate(i, this.mNativeObj);
    }

    public void setEstimateTimeInterval(int i) {
        nativeSetEstimateTimeInterval(this.mNativeObj, i);
    }

    public void setIsAddCropInfo(boolean z) {
        nativeSetIsAddCropInfo(this.mNativeObj, z);
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(this.mNativeObj, tEBundle);
    }

    public void startRecord(String str) {
        nativeStartRecord(this.mNativeObj, str);
    }

    public MediaEncodeStream(long j, Transport transport) {
        super(nativeToEditorStream(j));
        this.mTransportList = new CopyOnWriteArrayList();
        this.mNativeObj = j;
        this.mTransport = transport;
        this.mVsyncModule = new VsyncModule(nativeGetVsyncModule(j));
        this.mTracks = new CopyOnWriteArrayList();
        InternalObserver internalObserver = new InternalObserver();
        this.mInternalObserver = internalObserver;
        nativeRegisterObserver(this.mNativeObj, internalObserver);
    }
}
