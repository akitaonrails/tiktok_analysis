package com.ss.android.ttve.nativePort;

import X.C1305520k4s;
import X.C1305600k50;
import X.C1621480sIU;
import X.C1C7U;
import X.C2188811AlT;
import X.C2484209oO;
import X.EnumC2217951BrN;
import X.InterfaceC1305530k4t;
import X.InterfaceC2217931BrL;
import X.InterfaceC2218051BrX;
import X.InterfaceC2218071BrZ;
import X.InterfaceC2218141Brg;
import android.os.Handler;
import android.util.Log;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEAAudioRecord;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public class TEAAudioRecord implements InterfaceC2218051BrX {
    public static final String TAG = "TEAAudioRecord";
    public long mAudioCallbackHandle;
    public VEAudioCaptureSettings mAudioCaptureSettings;
    public InterfaceC2217931BrL mCallback;
    public long mHandle;
    public TEAudioDataInterface mNativeAudioDataCallback;

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, int i, int i2, int i3, int i4, long j2);

    private native int nativeStart(long j);

    private native int nativeStop(long j);

    public native int nativeCloseWavFile(long j);

    public native void nativeDestroyWavFile(long j);

    public native long nativeGetCurrentTime(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d, int i3, int i4);

    public void release() {
        release(null);
    }

    public void setAudioDevice(C1621480sIU c1621480sIU) {
    }

    @Override // X.InterfaceC2218051BrX
    public void setHandler(Handler handler) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$release$2() {
        nativeDestroy(this.mHandle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$start$0() {
        nativeStart(this.mHandle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$stop$4() {
        nativeStop(this.mHandle);
        return null;
    }

    public InterfaceC2218141Brg createAudioWriter() {
        return new InterfaceC2218141Brg() { // from class: X.1BrO
            @Override // X.InterfaceC2218141Brg
            public final int LIZJ(int i, byte[] bArr) {
                return 0;
            }

            @Override // X.InterfaceC2218141Brg
            public final int LIZIZ() {
                TEAAudioRecord tEAAudioRecord = this.LIZ;
                return tEAAudioRecord.nativeCloseWavFile(tEAAudioRecord.mHandle);
            }

            @Override // X.InterfaceC2218141Brg
            public final long LIZLLL() {
                TEAAudioRecord tEAAudioRecord = this.LIZ;
                return tEAAudioRecord.nativeGetCurrentTime(tEAAudioRecord.mHandle);
            }

            @Override // X.InterfaceC2218141Brg
            public final void destroy() {
                TEAAudioRecord tEAAudioRecord = this.LIZ;
                tEAAudioRecord.nativeDestroyWavFile(tEAAudioRecord.mHandle);
            }

            @Override // X.InterfaceC2218141Brg
            public final int LIZ(int i, String str, int i2, double d, int i3) {
                TEAAudioRecord tEAAudioRecord = this.LIZ;
                return tEAAudioRecord.nativeInitWavFile(tEAAudioRecord.mHandle, str, i, 2, d, i2, i3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$3(Cert cert) {
        C1C7U.LIZ("TEAAudioRecord@6f7c.release$1L");
        try {
            C1305520k4s.LIZ(cert, new InterfaceC1305530k4t() { // from class: X.1BrQ
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() {
                    return this.LIZ.lambda$release$2();
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
        }
        C1C7U.LIZIZ("TEAAudioRecord@6f7c.release$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1(Cert cert) {
        C1C7U.LIZ("TEAAudioRecord@6f7c.start$1L");
        try {
            C1305520k4s.LIZIZ(cert, new InterfaceC1305530k4t() { // from class: X.1BrR
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() {
                    return this.LIZ.lambda$start$0();
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
        }
        C1C7U.LIZIZ("TEAAudioRecord@6f7c.start$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$5(Cert cert) {
        C1C7U.LIZ("TEAAudioRecord@6f7c.stop$1L");
        try {
            C1305520k4s.LIZJ(cert, new InterfaceC1305530k4t() { // from class: X.1BrP
                @Override // X.InterfaceC1305530k4t
                public final Object invoke() {
                    return this.LIZ.lambda$stop$4();
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
        }
        C1C7U.LIZIZ("TEAAudioRecord@6f7c.stop$1L");
    }

    @Override // X.InterfaceC2218061BrY
    public int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        long jNativeCreate = nativeCreate();
        this.mHandle = jNativeCreate;
        this.mAudioCaptureSettings = vEAudioCaptureSettings;
        int iNativeInit = nativeInit(jNativeCreate, vEAudioCaptureSettings.getSampleRate(), vEAudioCaptureSettings.getChannel(), vEAudioCaptureSettings.getBitSamples(), vEAudioCaptureSettings.getFramesPerBuffer(), this.mAudioCallbackHandle);
        InterfaceC2217931BrL interfaceC2217931BrL = this.mCallback;
        if (interfaceC2217931BrL != null) {
            interfaceC2217931BrL.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT, iNativeInit, vEAudioCaptureSettings);
        }
        return iNativeInit;
    }

    @Override // X.InterfaceC2218061BrY
    public void release(Cert cert) {
        try {
            lambda$release$3(cert);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
        }
        this.mHandle = 0L;
    }

    @Override // X.InterfaceC2218051BrX
    public void setAudioCallback(InterfaceC2217931BrL interfaceC2217931BrL) {
        this.mCallback = interfaceC2217931BrL;
    }

    @Override // X.InterfaceC2218051BrX
    public void setNativeAudioDataCallback(InterfaceC2218071BrZ interfaceC2218071BrZ) {
        if (interfaceC2218071BrZ != null && (interfaceC2218071BrZ instanceof TEAudioDataInterface)) {
            TEAudioDataInterface tEAudioDataInterface = (TEAudioDataInterface) interfaceC2218071BrZ;
            this.mNativeAudioDataCallback = tEAudioDataInterface;
            this.mAudioCallbackHandle = tEAudioDataInterface.getHandle();
        }
    }

    @Override // X.InterfaceC2218061BrY
    public int start(Cert cert) {
        Cert cert2;
        try {
            try {
                lambda$start$1(cert);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
            }
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start ---- AAudioMediaEngine address:");
            sbLIZ.append(this.mHandle);
            C2484209oO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC2217931BrL interfaceC2217931BrL = this.mCallback;
            if (interfaceC2217931BrL != null) {
                interfaceC2217931BrL.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START, 0, "");
            }
            return 0;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2484209oO.LIZJ(TAG, Log.getStackTraceString(e2));
            HashMap<EnumC2217951BrN, Cert> audioPrivacyCertMap = this.mAudioCaptureSettings.getAudioPrivacyCertMap();
            if (audioPrivacyCertMap != null) {
                cert2 = audioPrivacyCertMap.get(EnumC2217951BrN.EXCEPTION_CLOSE_MIC);
            } else {
                cert2 = null;
            }
            release(cert2);
            return -603;
        }
    }

    @Override // X.InterfaceC2218061BrY
    public int stop(Cert cert) {
        Cert cert2;
        try {
            try {
                lambda$stop$5(cert);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
            }
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop ---- AAudioMediaEngine address:");
            sbLIZ.append(this.mHandle);
            C2484209oO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2484209oO.LIZJ(TAG, Log.getStackTraceString(e2));
            HashMap<EnumC2217951BrN, Cert> audioPrivacyCertMap = this.mAudioCaptureSettings.getAudioPrivacyCertMap();
            if (audioPrivacyCertMap != null) {
                cert2 = audioPrivacyCertMap.get(EnumC2217951BrN.EXCEPTION_CLOSE_MIC);
            } else {
                cert2 = null;
            }
            release(cert2);
            return -603;
        }
    }

    public void dataCallback(byte[] bArr, int i) {
        InterfaceC2217931BrL interfaceC2217931BrL = this.mCallback;
        if (this.mAudioCaptureSettings.getDataStore() == 0) {
            interfaceC2217931BrL.onReceive(VEAudioSample.createByteArrayAudioSample(bArr, i));
        } else {
            interfaceC2217931BrL.onReceive(VEAudioSample.createByteBufferAudioSample(ByteBuffer.wrap(bArr), i));
        }
    }
}
