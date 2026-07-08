package com.ss.android.vesdk.audio;

import X.C0WZX;
import X.C1305520k4s;
import X.C1305600k50;
import X.C1305700k5A;
import X.C1621480sIU;
import X.C21690319uf;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217941BrM;
import X.C2484209oO;
import X.C786410Ut5;
import X.C825920Wac;
import X.EnumC1641600sow;
import X.EnumC2217951BrN;
import X.InterfaceC1305530k4t;
import X.InterfaceC2217931BrL;
import X.InterfaceC2218051BrX;
import X.InterfaceC2218071BrZ;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Handler;
import android.util.Log;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.runtime.VERuntime;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes35.dex */
public class TEAudioRecord implements InterfaceC2218051BrX {
    public InterfaceC2217931BrL mAudioCallback;
    public VEAudioCaptureSettings mAudioCaptureSettings;
    public AudioRecord mAudioRecord;
    public long mAudioRecordStartTime;
    public long mAudioRecordStopTime;
    public int mBufferSizeInBytes;
    public ByteBuffer mByteBuffer;
    public Handler mHandler;
    public double mSampleNanoTimePerSecond;
    public int mSampleSize;
    public C2217941BrM mTimestampStrategy;
    public static final String TAG = "TEAudioRecord";
    public static final int[] SUGGEST_SAMPLERATE_ARRAY = {44100, 8000, 11025, 16000, 22050};
    public static final int[] SUGGEST_CHANNEL_ARRAY = {2, 1};
    public int mSampleRate = 44100;
    public int mChannels = 2;
    public int mBitsPerSample = 16;
    public int mAudioSource = 1;
    public int hasInited = -1;

    private int getSysAudioFormat(int i) {
        if (i != 8) {
            return i != 16 ? 1 : 2;
        }
        return 3;
    }

    private int getSysAudioSource(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 5;
            if (i != 5) {
                i2 = 6;
                if (i != 6) {
                    return 0;
                }
            }
        }
        return i2;
    }

    private int getSysChannelConfig(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 12;
        }
        return 16;
    }

    public void release() {
        release(null);
    }

    public void setAudioDevice(C1621480sIU c1621480sIU) {
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

    public int getRecordingState() {
        return this.mAudioRecord.getRecordingState();
    }

    public int getState() {
        return this.mAudioRecord.getState();
    }

    public int init() {
        return init(this.mAudioSource, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    public int read() throws Throwable {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int iLJJZZIII = C2204961BRm.LJJZZIII(this.mAudioRecord, this.mByteBuffer, this.mBufferSizeInBytes, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWrgv+ivRbYGHntwT71fzyJfM+6w==", null));
            if (iLJJZZIII > 0 && this.mAudioRecordStartTime != 0) {
                if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", System.currentTimeMillis() - this.mAudioRecordStartTime);
                        b.LIZ("vesdk_record_audio_first_frame", "business", jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                this.mAudioRecordStartTime = 0L;
            }
            return iLJJZZIII;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return -1;
        }
    }

    public TEAudioRecord() {
    }

    public int getBufferSize() {
        return this.mBufferSizeInBytes;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public ByteBuffer getPcmBuffer() {
        return this.mByteBuffer;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public TEAudioRecord(C2217941BrM c2217941BrM) {
        this.mTimestampStrategy = c2217941BrM;
    }

    @Override // X.InterfaceC2218061BrY
    public int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        VEAudioCaptureSettings vEAudioCaptureSettings2;
        this.mAudioCaptureSettings = vEAudioCaptureSettings;
        int iInit = init(vEAudioCaptureSettings.getAudioSource(), vEAudioCaptureSettings.getSampleRate(), vEAudioCaptureSettings.getChannel(), vEAudioCaptureSettings.getBitSamples());
        if (this.mAudioCallback != null && (vEAudioCaptureSettings2 = this.mAudioCaptureSettings) != null) {
            VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder(vEAudioCaptureSettings2);
            builder.setSampleRate(this.mSampleRate);
            builder.setChannel(this.mChannels);
            builder.setBitSamples(this.mBitsPerSample);
            this.mAudioCallback.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT, 0, this.mAudioCaptureSettings);
        }
        C1305700k5A.LIZIZ(1L, "te_record_audio_mic_type");
        C1305700k5A.LIZIZ(this.mSampleRate, "te_record_audio_mic_sample_rate");
        int i = this.mBufferSizeInBytes;
        int i2 = this.mChannels;
        if (i2 == 0) {
            i2 = 1;
        }
        C1305700k5A.LIZIZ((i / i2) / 2, "te_record_audio_mic_frame_per_buffer");
        return iInit;
    }

    public int read(byte[] bArr) throws Throwable {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int iLJL = C2204961BRm.LJL(this.mAudioRecord, bArr, this.mBufferSizeInBytes, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWrgv+ivRbYGHntwT71fzyJfM+6w==", null));
            if (iLJL > 0 && this.mAudioRecordStartTime != 0) {
                if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", System.currentTimeMillis() - this.mAudioRecordStartTime);
                        b.LIZIZ("vesdk_record_audio_first_frame", "business", jSONObject, true);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                this.mAudioRecordStartTime = 0L;
            }
            return iLJL;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return -1;
        }
    }

    @Override // X.InterfaceC2218061BrY
    public void release(Cert cert) {
        HashMap<EnumC2217951BrN, Cert> audioPrivacyCertMap;
        if (this.mAudioRecord != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (cert == null && (audioPrivacyCertMap = this.mAudioCaptureSettings.getAudioPrivacyCertMap()) != null) {
                cert = audioPrivacyCertMap.get(EnumC2217951BrN.EXCEPTION_CLOSE_MIC);
            }
            final AudioRecord audioRecord = this.mAudioRecord;
            if (cert == null || C825920Wac.LIZ(cert) == null || C825920Wac.LIZ(cert).intValue() <= 0) {
                cert = CertProviderManagerKt.findCert("bpea-ve_close", 1476788484);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check privacy, Audio release cert: ");
            sbLIZ.append(cert);
            C2484209oO.LJI("TEAudioPolicyAdapter", C2188811AlT.LIZIZ(sbLIZ));
            try {
                C1305520k4s.LIZ(cert, new InterfaceC1305530k4t<Object>() { // from class: X.0k53
                    @Override // X.InterfaceC1305530k4t
                    public final Object invoke() throws Throwable {
                        C2204961BRm.LJLI(audioRecord, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmzvblv8cW3TJrgm/Vk6+wi5e5BE=", null));
                        return null;
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2484209oO.LIZIZ(C1305600k50.class, "Exception occur:", e);
            }
            this.hasInited = -1;
            C1305700k5A.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "te_record_audio_release_record_time");
        }
    }

    @Override // X.InterfaceC2218051BrX
    public void setAudioCallback(InterfaceC2217931BrL interfaceC2217931BrL) {
        this.mAudioCallback = interfaceC2217931BrL;
    }

    @Override // X.InterfaceC2218051BrX
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    @Override // X.InterfaceC2218061BrY
    public int start(Cert cert) {
        Cert cert2;
        this.mAudioRecordStartTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        if (this.mAudioRecord.getRecordingState() == 3) {
            return -2;
        }
        try {
            C1305600k50.LIZ(this.mAudioRecord, cert);
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start hashCode:");
            sbLIZ.append(this.mAudioRecord.hashCode());
            C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
            C2217941BrM c2217941BrM = this.mTimestampStrategy;
            if (c2217941BrM != null) {
                c2217941BrM.LIZ = 0L;
                Context context = VERuntime.getInstance().getContext();
                String str2 = C2217941BrM.LIZIZ;
                if (context == null) {
                    C2484209oO.LIZJ(str2, "context null");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        C2484209oO.LIZJ(str2, "pm null");
                    } else {
                        packageManager.hasSystemFeature("android.hardware.audio.pro");
                    }
                }
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.1BrK
                    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[PHI: r3
                      0x005c: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:16:0x004f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 331
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2217921BrK.LIZ():void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TEAudioRecord@604e.start$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TEAudioRecord@604e.start$1");
                    }
                });
            }
            C1305700k5A.LIZIZ(System.currentTimeMillis() - this.mAudioRecordStartTime, "te_record_audio_start_record_time");
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZJ(TAG, Log.getStackTraceString(e));
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
        this.mAudioRecordStartTime = 0L;
        this.mAudioRecordStopTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        if (cert == null) {
            try {
                HashMap<EnumC2217951BrN, Cert> audioPrivacyCertMap = this.mAudioCaptureSettings.getAudioPrivacyCertMap();
                if (audioPrivacyCertMap != null) {
                    cert = audioPrivacyCertMap.get(EnumC2217951BrN.EXCEPTION_CLOSE_MIC);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2484209oO.LIZJ(TAG, Log.getStackTraceString(e));
            }
        }
        C1305600k50.LIZIZ(this.mAudioRecord, cert);
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop hashCode:");
        sbLIZ.append(this.mAudioRecord.hashCode());
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        C1305700k5A.LIZIZ(System.currentTimeMillis() - this.mAudioRecordStopTime, "te_record_audio_stop_record_time");
        return 0;
    }

    public int init(int i) {
        this.mAudioSource = i;
        return init(i, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    public int init(int i, int i2, int i3) {
        return init(this.mAudioSource, i, i2, i3);
    }

    private int initAudioRecord(int i, int i2, int i3, int i4) {
        AudioDeviceInfo audioDeviceInfo;
        int sysAudioSource = getSysAudioSource(i);
        int sysChannelConfig = getSysChannelConfig(i3);
        int sysAudioFormat = getSysAudioFormat(i4);
        int minBufferSize = AudioRecord.getMinBufferSize(i2, sysChannelConfig, sysAudioFormat);
        Cert cert = null;
        try {
            AudioRecord audioRecord = new AudioRecord(sysAudioSource, i2, sysChannelConfig, sysAudioFormat, minBufferSize);
            this.mAudioRecord = audioRecord;
            if (audioRecord.getState() == 1) {
                VEAudioCaptureSettings vEAudioCaptureSettings = this.mAudioCaptureSettings;
                if (vEAudioCaptureSettings != null && vEAudioCaptureSettings.isPreferBuiltinMicInBluetoothScene()) {
                    new C21690319uf();
                    if (C21690319uf.LIZ() == EnumC1641600sow.BLUETOOTH) {
                        AudioRecord audioRecord2 = this.mAudioRecord;
                        AudioDeviceInfo[] devices = ((AudioManager) C786410Ut5.H2(VERuntime.getInstance().getContext(), "audio")).getDevices(1);
                        int length = devices.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                audioDeviceInfo = devices[i5];
                                if (audioDeviceInfo.getType() == 15) {
                                    break;
                                }
                                i5++;
                            } else {
                                audioDeviceInfo = null;
                                break;
                            }
                        }
                        audioRecord2.setPreferredDevice(audioDeviceInfo);
                    }
                }
                this.mSampleRate = i2;
                this.mChannels = i3;
                this.mBitsPerSample = i4;
                this.mBufferSizeInBytes = minBufferSize;
                String str = TAG;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Init audio recorder succeed, apply audio record sample rate ");
                sbLIZ.append(this.mSampleRate);
                sbLIZ.append(" channels ");
                sbLIZ.append(this.mChannels);
                sbLIZ.append(" buffer ");
                sbLIZ.append(this.mBufferSizeInBytes);
                sbLIZ.append(" state ");
                sbLIZ.append(this.mAudioRecord.getState());
                C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
                this.mByteBuffer = ByteBuffer.allocateDirect(this.mBufferSizeInBytes);
                this.mSampleNanoTimePerSecond = 1.0E9d / ((double) this.mSampleRate);
                this.mSampleSize = (this.mChannels * this.mBitsPerSample) / 8;
                return 0;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Audio record is not initialized![");
            sbLIZ2.append(this.mSampleRate);
            sbLIZ2.append(",");
            sbLIZ2.append(this.mChannels);
            sbLIZ2.append(",");
            sbLIZ2.append(i4);
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZJ(TAG, Log.getStackTraceString(e));
            HashMap<EnumC2217951BrN, Cert> audioPrivacyCertMap = this.mAudioCaptureSettings.getAudioPrivacyCertMap();
            if (audioPrivacyCertMap != null) {
                cert = audioPrivacyCertMap.get(EnumC2217951BrN.EXCEPTION_CLOSE_MIC);
            }
            release(cert);
            this.mSampleRate = 44100;
            this.mChannels = 2;
            this.mBitsPerSample = 16;
            return -100;
        }
    }

    public int init(int i, int i2, int i3, int i4) {
        Cert cert;
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init audioSource: ");
        sbLIZ.append(i);
        sbLIZ.append(", sampleRate: ");
        sbLIZ.append(i2);
        sbLIZ.append(", channels: ");
        sbLIZ.append(i3);
        sbLIZ.append(", bitsPerSample: ");
        sbLIZ.append(i4);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.hasInited == 0) {
            C2484209oO.LJI(str, "has inited");
            return 0;
        }
        int iInitAudioRecord = initAudioRecord(i, i2, i3, i4);
        if (iInitAudioRecord == 0) {
            this.hasInited = 0;
            return 0;
        }
        HashMap<EnumC2217951BrN, Cert> audioPrivacyCertMap = this.mAudioCaptureSettings.getAudioPrivacyCertMap();
        if (audioPrivacyCertMap != null) {
            cert = audioPrivacyCertMap.get(EnumC2217951BrN.EXCEPTION_CLOSE_MIC);
        } else {
            cert = null;
        }
        release(cert);
        for (int i5 : SUGGEST_SAMPLERATE_ARRAY) {
            for (int i6 : SUGGEST_CHANNEL_ARRAY) {
                iInitAudioRecord = initAudioRecord(i, i5, i6, i4);
                if (iInitAudioRecord == 0) {
                    return 0;
                }
                release(cert);
            }
        }
        this.hasInited = iInitAudioRecord;
        return iInitAudioRecord;
    }
}
