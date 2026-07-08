package com.ss.ttlivestreamer.core.effect;

import X.AbstractC768410UCh;
import X.C0VSJ;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeAudioStrange extends AbstractC768410UCh {
    public AudioDeviceModule mAdm;
    public int mChannel;
    public boolean mEnableOpt;
    public long mNativeObj;
    public AudioDeviceModule.AudioRenderSink mPlayer;
    public boolean mRelease;
    public int mSampleHz;

    private native long nativeCreate(int i, int i2, String str, String str2, boolean z);

    private native int nativeProcess(long j, Buffer buffer, int i, int i2, int i3, long j2);

    private native void nativeRelease(long j);

    private native int nativeUpdateResource(long j, String str, String str2);

    @Override // X.AbstractC768410UCh
    public int setAudioStrangeResource(String str) {
        return -1;
    }

    @Override // X.AbstractC768410UCh
    public void release() {
        super.release();
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.enableAudioStrangeVoice(false);
            this.mAdm = null;
            this.mRelease = true;
        }
    }

    @Override // X.AbstractC768410UCh
    public void setEnable(boolean z) {
        if (!this.mRelease && this.mAdm != null) {
            super.setEnable(z);
            this.mAdm.enableAudioStrangeVoice(z);
        }
    }

    @Override // X.AbstractC768410UCh
    public void enablePlayerMode(boolean z, boolean z2) {
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.enablePlayOutEcho(z);
        }
    }

    @Override // X.AbstractC768410UCh
    public int setAudioStrangeResource(String str, String str2) {
        if (str2 == null) {
            if (!TextUtils.isEmpty(str)) {
                str2 = new C0VSJ(str).getParent();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Using ");
            sbLIZ.append(str2);
            sbLIZ.append(" as search path");
            AVLog.iow("NativeAudioStrange", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!TextUtils.isEmpty(str) && !new C0VSJ(str).canRead()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Resource ");
            sbLIZ2.append(str);
            sbLIZ2.append("invalid.");
            AVLog.iow("NativeAudioStrange", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule == null) {
            return -1;
        }
        audioDeviceModule.setAudioStrangeResource(str, str2);
        return 0;
    }

    public NativeAudioStrange(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z, AudioDeviceModule audioDeviceModule) {
        this.mSampleHz = i;
        this.mChannel = i2;
        this.mPlayer = audioRenderSink;
        this.mEnableOpt = z;
        this.mAdm = audioDeviceModule;
    }

    @Override // X.AbstractC768410UCh
    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        if (!this.mEnable) {
            return buffer;
        }
        synchronized (this) {
            try {
                long j2 = this.mNativeObj;
                if (j2 != 0) {
                    if (nativeProcess(j2, buffer, i, i2, i3, j) != 0) {
                        return buffer;
                    }
                    if (this.mIsPlayerMode && (audioRenderSink = this.mPlayer) != null) {
                        audioRenderSink.onData(buffer, i, i2, i3, j);
                    }
                }
                return buffer;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
