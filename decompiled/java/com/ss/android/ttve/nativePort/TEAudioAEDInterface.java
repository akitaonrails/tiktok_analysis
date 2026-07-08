package com.ss.android.ttve.nativePort;

import X.C07WT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public class TEAudioAEDInterface {
    public long mHandle;
    public volatile C07WT mListener;

    private native long nativeCreate(int i, int i2, boolean z, int i3);

    private native int nativeInit(long j, String str, String str2);

    private native int nativeProcess(long j, byte[] bArr, int i);

    private native void nativeRelease(long j);

    private native void nativeReset(long j);

    private native void nativeSetReportInterval(long j, int i);

    private void onNativeAEDResult(boolean z, boolean z2, float f, float f2, float f3) {
    }

    public synchronized void release() {
        long j = this.mHandle;
        if (j != 0) {
            nativeRelease(j);
            this.mHandle = 0L;
        }
    }

    public synchronized void reset() {
        long j = this.mHandle;
        if (j != 0) {
            nativeReset(j);
        }
    }

    public void setListener(C07WT c07wt) {
    }

    public static class AEDResult {
        public final boolean hasVoice;
        public final float music;
        public final float sing;
        public final float speech;
        public final boolean valid;

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AEDResult{valid=");
            sbLIZ.append(this.valid);
            sbLIZ.append(", hasVoice=");
            sbLIZ.append(this.hasVoice);
            sbLIZ.append(", music=");
            sbLIZ.append(this.music);
            sbLIZ.append(", sing=");
            sbLIZ.append(this.sing);
            sbLIZ.append(", speech=");
            sbLIZ.append(this.speech);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AEDResult(boolean z, boolean z2, float f, float f2, float f3) {
            this.valid = z;
            this.hasVoice = z2;
            this.music = f;
            this.sing = f2;
            this.speech = f3;
        }
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public synchronized void setReportInterval(int i) {
        long j = this.mHandle;
        if (j != 0) {
            nativeSetReportInterval(j, i);
        }
    }

    public synchronized int init(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        if (str2 == null) {
            str2 = "";
        }
        return nativeInit(j, str, str2);
    }

    public synchronized int process(byte[] bArr, int i) {
        long j = this.mHandle;
        if (j != 0 && bArr != null && i > 0) {
            return nativeProcess(j, bArr, i);
        }
        return -1;
    }

    public TEAudioAEDInterface(int i, int i2, boolean z, int i3) {
        this.mHandle = nativeCreate(i, i2, z, i3);
    }
}
