package com.ss.android.vesdk;

import X.C07WT;
import X.C1293970jmF;
import X.C2188811AlT;
import X.C2218121Bre;
import X.C2218131Brf;
import X.C2218161Bri;
import X.C2484209oO;
import X.InterfaceC2218141Brg;
import X.InterfaceC2218151Brh;
import Y.ACallableS257S0200000_34;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttve.audio.TEDubWriter;
import com.ss.android.ttve.nativePort.TEAudioAEDInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;

/* JADX INFO: loaded from: classes35.dex */
public class VEAudioRecorder implements GenericLifecycleObserver {
    public VEAudioEncodeSettings mAudioEncodeSettings;
    public C2218121Bre mAudioRecorder;
    public long mCurrentTime;
    public volatile InterfaceC2218151Brh mExternalListener;
    public final InterfaceC2218151Brh mInternalListener;
    public VERuntime mRuntime;
    public volatile TEAudioAEDInterface mVoiceDetect;
    public String mWavFilePath;
    public boolean mbRecording;

    public int getChannelCount() {
        return 2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destory();
        }
    }

    public long stopRecord() {
        return stopRecord(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destory() {
        boolean z = Build.VERSION.SDK_INT < 31;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioRecorder destory in. mbRecording = ");
        sbLIZ.append(this.mbRecording);
        sbLIZ.append(", releaseAudioRecoder = ");
        sbLIZ.append(z);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
        removeVoiceDetectListener();
        C2218121Bre c2218121Bre = this.mAudioRecorder;
        synchronized (c2218121Bre) {
            c2218121Bre.LIZJ(c2218121Bre.LJFF);
        }
    }

    public int getSampleRate() {
        C2218121Bre c2218121Bre = this.mAudioRecorder;
        c2218121Bre.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call getSampleRateInHz():");
        sbLIZ.append(c2218121Bre.LJ);
        C2484209oO.LJI("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ));
        return c2218121Bre.LJ;
    }

    public String getWavFilePath() {
        if (this.mbRecording) {
            throw new VEException(-105, "audio is recording");
        }
        return this.mWavFilePath;
    }

    public void removeVoiceDetectListener() {
        TEAudioAEDInterface tEAudioAEDInterface = this.mVoiceDetect;
        this.mVoiceDetect = null;
        if (tEAudioAEDInterface != null) {
            tEAudioAEDInterface.release();
            C2484209oO.LJI("VEAudioRecorder", "removeVoiceDetectListener: AED released.");
        }
    }

    public String toAAC() {
        if (TextUtils.isEmpty(this.mWavFilePath)) {
            C2484209oO.LIZJ("VEAudioRecorder", "toAAC failed: wav path is empty");
            return null;
        }
        C1293970jmF resManager = this.mRuntime.getResManager();
        resManager.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(resManager.LIZ());
        sbLIZ.append(File.separator);
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("_");
        sbLIZ.append("record");
        sbLIZ.append(".aac");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int channelCount = getChannelCount();
        int sampleRate = getSampleRate();
        VEAudioEncodeSettings vEAudioEncodeSettings = this.mAudioEncodeSettings;
        int bps = vEAudioEncodeSettings != null ? vEAudioEncodeSettings.getBps() : 131072;
        int iTransCodeAudioFile = TEVideoUtils.transCodeAudioFile(this.mWavFilePath, 0, -1, strLIZIZ, channelCount, bps, sampleRate);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("toAAC ret=");
        sbLIZ2.append(iTransCodeAudioFile);
        sbLIZ2.append(", out=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", channels=");
        sbLIZ2.append(channelCount);
        sbLIZ2.append(", bitRate=");
        sbLIZ2.append(bps);
        sbLIZ2.append(", sampleRate=");
        sbLIZ2.append(sampleRate);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ2));
        if (iTransCodeAudioFile == 0) {
            return strLIZIZ;
        }
        return null;
    }

    public VEAudioRecorder() {
        C2218131Brf c2218131Brf = new C2218131Brf(this);
        this.mInternalListener = c2218131Brf;
        this.mRuntime = VERuntime.getInstance();
        C2218121Bre c2218121Bre = new C2218121Bre(!VEConfigCenter.getInstance().getValue("ve_enable_aaudio_mic_record", false).booleanValue() ? new TEDubWriter() : null);
        this.mAudioRecorder = c2218121Bre;
        c2218121Bre.LIZLLL = c2218131Brf;
    }

    public long getCurrentTime() {
        return this.mCurrentTime;
    }

    public VEAudioRecorder(LifecycleOwner lifecycleOwner) {
        this();
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public void destory(Cert cert) {
        boolean z;
        if (Build.VERSION.SDK_INT < 31) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioRecorder destory in. mbRecording = ");
        sbLIZ.append(this.mbRecording);
        sbLIZ.append(", releaseAudioRecoder = ");
        sbLIZ.append(z);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
        removeVoiceDetectListener();
        this.mAudioRecorder.LIZJ(cert);
    }

    public void setRecorderListener(InterfaceC2218151Brh interfaceC2218151Brh) {
        this.mExternalListener = interfaceC2218151Brh;
    }

    public long stopRecord(Cert cert) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioRecorder stopRecord in. mbRecording = ");
        sbLIZ.append(this.mbRecording);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.mbRecording) {
            return -105L;
        }
        InterfaceC2218141Brg interfaceC2218141Brg = this.mAudioRecorder.LIZ;
        if (interfaceC2218141Brg != null) {
            this.mCurrentTime = interfaceC2218141Brg.LIZLLL();
        }
        C2218121Bre c2218121Bre = this.mAudioRecorder;
        synchronized (c2218121Bre) {
            if (c2218121Bre.LIZIZ == null) {
                C2484209oO.LJI("TEBufferedAudioCaptureRecorder", "call stopRecording()  audioCpature is null");
            } else {
                c2218121Bre.LJFF = cert;
                if (c2218121Bre.LIZIZ(new ACallableS257S0200000_34(c2218121Bre, cert, 7), "stopRecording") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("call stopRecording() retValue:");
                sbLIZ2.append(z);
                C2484209oO.LJI("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Stop record ,current time is ");
        sbLIZ3.append(this.mCurrentTime);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ3));
        this.mbRecording = false;
        return this.mCurrentTime;
    }

    public int delete(int i, int i2) {
        if (i >= i2 || i < 0) {
            return -100;
        }
        return TEVideoUtils.nativeClearWavSeg(this.mWavFilePath, i, i2);
    }

    public int init(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.mAudioEncodeSettings = vEAudioEncodeSettings;
        this.mbRecording = false;
        this.mWavFilePath = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioRecorder init in. mWavFilePath = ");
        sbLIZ.append(this.mWavFilePath);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
        this.mAudioRecorder.LIZ();
        return 0;
    }

    public int setVoiceDetectListener(C2218161Bri c2218161Bri, C07WT c07wt) {
        C2484209oO.LIZJ("VEAudioRecorder", "setVoiceDetectListener: invalid config (modelPath empty)");
        return -100;
    }

    public int init(VEAudioEncodeSettings vEAudioEncodeSettings, int i) {
        return init(null, vEAudioEncodeSettings, i);
    }

    public int init(String str, VEAudioEncodeSettings vEAudioEncodeSettings, int i) {
        this.mAudioEncodeSettings = vEAudioEncodeSettings;
        this.mbRecording = false;
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LJI("VEAudioRecorder", "Empty directory use default path");
            C1293970jmF resManager = this.mRuntime.getResManager();
            resManager.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(resManager.LIZ());
            sbLIZ.append(File.separator);
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append("_");
            sbLIZ.append("record");
            sbLIZ.append(".wav");
            this.mWavFilePath = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Use wav save path ");
            sbLIZ2.append(str);
            C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ2));
            this.mWavFilePath = str;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("VEAudioRecorder init in. mWavFilePath = ");
        sbLIZ3.append(this.mWavFilePath);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ3));
        this.mAudioRecorder.LIZ();
        String str2 = this.mWavFilePath;
        C2218121Bre c2218121Bre = this.mAudioRecorder;
        c2218121Bre.getClass();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("call getSampleRateInHz():");
        sbLIZ4.append(c2218121Bre.LJ);
        C2484209oO.LJI("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ4));
        TEVideoUtils.nativeGenerateMuteWav(str2, c2218121Bre.LJ, 2, i);
        return 0;
    }

    public int startRecord(float f, int i, int i2) {
        return startRecord(f, i, i2, null);
    }

    public int startRecord(float f, int i, int i2, Cert cert) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioRecorder startRecord in. mbRecording = ");
        sbLIZ.append(this.mbRecording);
        C2484209oO.LJI("VEAudioRecorder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mbRecording) {
            return -105;
        }
        TEAudioAEDInterface tEAudioAEDInterface = this.mVoiceDetect;
        if (tEAudioAEDInterface != null) {
            tEAudioAEDInterface.reset();
        }
        C2218121Bre c2218121Bre = this.mAudioRecorder;
        String str = this.mWavFilePath;
        double d = f;
        synchronized (c2218121Bre) {
            if (c2218121Bre.LIZIZ == null) {
                C2484209oO.LJI("TEBufferedAudioCaptureRecorder", "call startRecording()  audioCpature is null");
            } else {
                c2218121Bre.LJI = str;
                c2218121Bre.LJII = d;
                c2218121Bre.LJIIIIZZ = i;
                c2218121Bre.LJIIIZ = i2;
                c2218121Bre.LJFF = cert;
                int iLIZIZ = c2218121Bre.LIZIZ(new ACallableS257S0200000_34(c2218121Bre, cert, 8), "startRecording()");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("call startRecording  path:");
                sbLIZ2.append(str);
                sbLIZ2.append(" speed:");
                sbLIZ2.append(d);
                sbLIZ2.append(" startMs:");
                sbLIZ2.append(i);
                sbLIZ2.append(" durationMs:");
                sbLIZ2.append(i2);
                sbLIZ2.append(" retValue:");
                sbLIZ2.append(iLIZIZ);
                C2484209oO.LJI("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        this.mbRecording = true;
        return 0;
    }
}
