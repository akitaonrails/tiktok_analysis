package com.ss.android.ttve.nativePort;

import X.C1621480sIU;
import X.EnumC1641600sow;
import X.InterfaceC2217931BrL;
import X.InterfaceC2218051BrX;
import X.InterfaceC2218071BrZ;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;

/* JADX INFO: loaded from: classes35.dex */
public class TEAudioCaptureInterface implements InterfaceC2218051BrX {
    public InterfaceC2217931BrL mCallback;
    public long mHandle;

    private native long nativeCreate(boolean z, boolean z2);

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, int i, int i2, int i3, int i4);

    private native int nativeStart(long j);

    private native int nativeStop(long j);

    public void release() {
        release(null);
    }

    public void setAudioDevice(C1621480sIU c1621480sIU) {
    }

    @Override // X.InterfaceC2218051BrX
    public void setHandler(Handler handler) {
    }

    @Override // X.InterfaceC2218051BrX
    public void setNativeAudioDataCallback(InterfaceC2218071BrZ interfaceC2218071BrZ) {
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    @Override // X.InterfaceC2218061BrY
    public int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        boolean z;
        if (TESystemUtils.getOutputAudioDeviceType() == EnumC1641600sow.WIRED.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        long jNativeCreate = nativeCreate(vEAudioCaptureSettings.isEnableSysKaraoke(), z);
        this.mHandle = jNativeCreate;
        int iNativeInit = nativeInit(jNativeCreate, vEAudioCaptureSettings.getSampleRate(), vEAudioCaptureSettings.getChannel(), vEAudioCaptureSettings.getBitSamples(), vEAudioCaptureSettings.getFramesPerBuffer());
        InterfaceC2217931BrL interfaceC2217931BrL = this.mCallback;
        if (interfaceC2217931BrL != null) {
            interfaceC2217931BrL.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT, iNativeInit, vEAudioCaptureSettings);
        }
        return iNativeInit;
    }

    @Override // X.InterfaceC2218061BrY
    public void release(Cert cert) {
        nativeDestroy(this.mHandle);
        this.mHandle = 0L;
    }

    @Override // X.InterfaceC2218051BrX
    public void setAudioCallback(InterfaceC2217931BrL interfaceC2217931BrL) {
        this.mCallback = interfaceC2217931BrL;
    }

    @Override // X.InterfaceC2218061BrY
    public int start(Cert cert) {
        int iNativeStart = nativeStart(this.mHandle);
        InterfaceC2217931BrL interfaceC2217931BrL = this.mCallback;
        if (interfaceC2217931BrL != null) {
            interfaceC2217931BrL.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START, iNativeStart, "");
        }
        return iNativeStart;
    }

    @Override // X.InterfaceC2218061BrY
    public int stop(Cert cert) {
        return nativeStop(this.mHandle);
    }

    public void onNativeExtCallback(int i, int i2) {
        InterfaceC2217931BrL interfaceC2217931BrL = this.mCallback;
        if (interfaceC2217931BrL != null) {
            int i3 = VEInfo.TE_ERROR_RECORD_AUDIO_CAPTURE;
            if (i == i3) {
                interfaceC2217931BrL.onError(i3, i2, "");
            } else {
                interfaceC2217931BrL.LIZ(i, i2, "");
            }
        }
    }
}
