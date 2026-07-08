package com.ss.android.ttve.nativePort;

import X.C2218091Brb;
import X.C2218101Brc;
import X.InterfaceC2218081Bra;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public class TEAudioDataInterface implements InterfaceC2218081Bra {
    public long handle = nativeCreate();
    public VEAudioCaptureSettings mAudioCaptureSettings;

    private native long nativeCreate();

    private native int nativeInit(long j, int i, int i2, int i3);

    private native void nativeRelease(long j);

    private native int nativeSendArrayData(long j, byte[] bArr, int i, long j2, long j3);

    private native int nativeSendBufferData(long j, ByteBuffer byteBuffer, int i, long j2, long j3);

    @Override // X.InterfaceC2218071BrZ
    public void onError(int i, int i2, String str) {
    }

    public synchronized void release() {
        long j = this.handle;
        if (j != 0) {
            nativeRelease(j);
            this.handle = 0L;
        }
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public long getHandle() {
        return this.handle;
    }

    @Override // X.InterfaceC2218081Bra
    public synchronized void onReceive(VEAudioSample vEAudioSample) {
        if (this.handle != 0 && this.mAudioCaptureSettings != null && !VEConfigCenter.getInstance().getValue("ve_enable_aaudio_mic_record", false).booleanValue()) {
            if (this.mAudioCaptureSettings.getDataStore() == 0) {
                nativeSendArrayData(this.handle, ((C2218091Brb) vEAudioSample.getSampleBuffer()).LIZ, vEAudioSample.getByteSize(), vEAudioSample.getTimeStamp(), (System.nanoTime() / 1000) - vEAudioSample.getTimeStamp());
            } else {
                nativeSendBufferData(this.handle, ((C2218101Brc) vEAudioSample.getSampleBuffer()).LIZ, vEAudioSample.getByteSize(), vEAudioSample.getTimeStamp(), (System.nanoTime() / 1000) - vEAudioSample.getTimeStamp());
            }
        }
    }

    @Override // X.InterfaceC2218071BrZ
    public void onInfo(int i, int i2, double d, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            VEAudioCaptureSettings vEAudioCaptureSettings = (VEAudioCaptureSettings) obj;
            this.mAudioCaptureSettings = vEAudioCaptureSettings;
            long j = this.handle;
            if (j != 0) {
                nativeInit(j, vEAudioCaptureSettings.getSampleRate(), this.mAudioCaptureSettings.getChannel(), this.mAudioCaptureSettings.getBitSamples());
            }
        }
    }
}
