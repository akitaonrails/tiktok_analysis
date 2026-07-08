package com.ss.bytertc.audio.device.webrtc;

import X.C08FF;
import X.C0W9U;
import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import android.media.AudioRecord;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes35.dex */
public class WebRtcAudioRecord {
    public static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    public static int defaultMediaModeAudioSource;
    public static WebRtcAudioRecordErrorCallback errorCallback;
    public static volatile boolean microphoneMute;
    public String apiResult = "";
    public AudioRecord audioRecord;
    public AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioRecord;

    public static class AudioRecordErrorCode {
    }

    public class AudioRecordThread extends BPEAThread {
        public volatile boolean keepAlive;

        private void bpea_origin_run() {
            com_ss_bytertc_audio_device_webrtc_WebRtcAudioRecord$AudioRecordThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void stopThread() {
            synchronized (this) {
                try {
                    Logging.i("WebRtcAudioRecord", "stopThread");
                    this.keepAlive = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public void com_ss_bytertc_audio_device_webrtc_WebRtcAudioRecord$AudioRecordThread__run$___twin___() throws Throwable {
            int iLJJZZIII;
            Process.setThreadPriority(-19);
            Logging.i("WebRtcAudioRecord", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            AudioRecord audioRecord = WebRtcAudioRecord.this.audioRecord;
            if (audioRecord == null || audioRecord.getRecordingState() != 3) {
                StringBuilder sb = new StringBuilder("AudioRecord.run failed: incorrect state :");
                AudioRecord audioRecord2 = WebRtcAudioRecord.this.audioRecord;
                sb.append(audioRecord2 == null ? "null" : Integer.valueOf(audioRecord2.getRecordingState()));
                String string = sb.toString();
                Logging.e("WebRtcAudioRecord", string);
                this.keepAlive = false;
                WebRtcAudioRecord.this.reportWebRtcAudioRecordError(string);
            }
            System.nanoTime();
            while (this.keepAlive) {
                try {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    AudioRecord audioRecord3 = webRtcAudioRecord.audioRecord;
                    ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
                    iLJJZZIII = C2204961BRm.LJJZZIII(audioRecord3, byteBuffer, byteBuffer.capacity(), new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw4liOF7S3exQuyR6WF2FHJp9r1hLrCn3/g==", null));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Logging.e("WebRtcAudioRecord", "audioRecord.read failed: " + e.getMessage());
                    this.keepAlive = false;
                    iLJJZZIII = -1;
                }
                if (iLJJZZIII == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.byteBuffer.put(webRtcAudioRecord2.emptyBytes);
                    }
                    synchronized (this) {
                        try {
                            if (this.keepAlive) {
                                WebRtcAudioRecord webRtcAudioRecord3 = WebRtcAudioRecord.this;
                                webRtcAudioRecord3.nativeDataIsRecorded(iLJJZZIII, webRtcAudioRecord3.nativeAudioRecord);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else if (iLJJZZIII == -3 || iLJJZZIII == -6) {
                    this.keepAlive = false;
                    String str = "AudioRecord.read failed: " + iLJJZZIII;
                    Logging.e("WebRtcAudioRecord", str);
                    WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                }
            }
            try {
                AudioRecord audioRecord4 = WebRtcAudioRecord.this.audioRecord;
                if (audioRecord4 != null) {
                    C2204961BRm.LJLIIL(audioRecord4, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw4liOF7S3exQuyR6WF2FHJp9r1hLrCn3/g==", null));
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                Logging.e("WebRtcAudioRecord", "AudioRecord.stop failed: " + e2.getMessage());
            }
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("WebRtcAudioRecord$AudioRecordThread@d0b8.run");
            boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
            try {
                com_ss_bytertc_audio_device_webrtc_WebRtcAudioRecord$AudioRecordThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("WebRtcAudioRecord$AudioRecordThread@d0b8.run");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public static void com_ss_bytertc_audio_device_webrtc_WebRtcAudioRecord$AudioRecordThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AudioRecordThread audioRecordThread) {
            try {
                audioRecordThread.com_ss_bytertc_audio_device_webrtc_WebRtcAudioRecord$AudioRecordThread__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    public static int getDefaultAudioSource() {
        return 0;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeDataIsRecorded(int i, long j);

    private int getAudioSessionId() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSessionId();
    }

    private int getAudioSource() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            return -1;
        }
        return audioRecord.getAudioSource();
    }

    private void releaseAudioResources() throws Throwable {
        Logging.i("WebRtcAudioRecord", "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            C2204961BRm.LJLI(audioRecord, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw4liOF7S3exQuyR6WF2FHJp9r1hLrCn3/g==", null));
            this.audioRecord = null;
        }
    }

    private int startRecording() throws Throwable {
        this.apiResult = "StartRecording:";
        Logging.i("WebRtcAudioRecord", "StartRecording:");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null) {
            Logging.e("WebRtcAudioRecord", "null audio record object");
            return -300;
        }
        if (this.audioThread != null) {
            Logging.e("WebRtcAudioRecord", "the previous audio thread leak");
            return -301;
        }
        try {
            C2204961BRm.LJLIIIL(audioRecord, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw4liOF7S3exQuyR6WF2FHJp9r1hLrCn3/g==", null));
            if (this.audioRecord.getRecordingState() == 3) {
                AudioRecordThread audioRecordThread = new AudioRecordThread("BaeRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                return 0;
            }
            AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AudioRecord.startRecording failed - incorrect state :");
            sbLIZ.append(this.audioRecord.getRecordingState());
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.apiResult);
            sbLIZ2.append("AudioRecord.startRecording failed - incorrect state :");
            sbLIZ2.append(this.audioRecord.getRecordingState());
            this.apiResult = C2188811AlT.LIZIZ(sbLIZ2);
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.release();
            }
            releaseAudioResources();
            return -303;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AudioRecord.startRecording failed: ");
            sbLIZ3.append(e.getMessage());
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.apiResult);
            sbLIZ4.append("AudioRecord.startRecording failed: ");
            sbLIZ4.append(e.getMessage());
            this.apiResult = C2188811AlT.LIZIZ(sbLIZ4);
            releaseAudioResources();
            return -302;
        }
    }

    private boolean stopRecording() throws Throwable {
        this.apiResult = "StopRecording:";
        Logging.i("WebRtcAudioRecord", "StopRecording:");
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stopThread();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                Logging.e("WebRtcAudioRecord", "Join of AudioRecordJavaThread timed out");
                WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.apiResult);
                sbLIZ.append("Join of AudioRecordJavaThread timed out");
                this.apiResult = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.audioThread = null;
        }
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        Logging.i("WebRtcAudioRecord", "stopRecording release done.");
        return true;
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        defaultMediaModeAudioSource = defaultAudioSource;
    }

    private void logMainParameters() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioRecord: session ID: ");
        sbLIZ.append(this.audioRecord.getAudioSessionId());
        sbLIZ.append(", channels: ");
        sbLIZ.append(this.audioRecord.getChannelCount());
        sbLIZ.append(", sample rate: ");
        sbLIZ.append(this.audioRecord.getSampleRate());
        sbLIZ.append(", source:");
        sbLIZ.append(this.audioRecord.getAudioSource());
        Logging.w("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void logMainParametersExtended() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioRecord: buffer size in frames: ");
        sbLIZ.append(this.audioRecord.getBufferSizeInFrames());
        Logging.w("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static class AudioSamples {
        public final int audioFormat;
        public final int channelCount;
        public final byte[] data;
        public final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        public AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    private String getApiResult() {
        return this.apiResult;
    }

    /* JADX INFO: loaded from: classes30.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH;

        public static AudioRecordStartErrorCode valueOf(String str) {
            return (AudioRecordStartErrorCode) C08FF.LIZ(AudioRecordStartErrorCode.class, str);
        }
    }

    public WebRtcAudioRecord(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ctor");
        sbLIZ.append(WebRtcAudioUtils.getThreadInfo());
        Logging.i("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
        this.nativeAudioRecord = j;
        if (WebRtcAudioEffects.IsAudioEffectSupported()) {
            this.effects = WebRtcAudioEffects.create();
        }
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableBuiltInAEC(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        Logging.i("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e("WebRtcAudioRecord", "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableBuiltInNS(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        Logging.i("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.e("WebRtcAudioRecord", "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z);
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Init recording error: ");
        sbLIZ.append(str);
        Logging.e("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.i("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMicrophoneMute(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        Logging.w("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    public void reportWebRtcAudioRecordError(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Run-time recording error: ");
        sbLIZ.append(str);
        Logging.e("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private int cvtNativeSetAudioSource(int i, boolean z) {
        int i2 = defaultMediaModeAudioSource;
        int i3 = 7;
        if (!z) {
            i2 = 7;
        }
        if (i != 0) {
            int i4 = 1;
            if (i != 1) {
                i4 = 5;
                if (i != 5) {
                    i4 = 6;
                    if (i != 6) {
                        if (i != 7) {
                            i3 = 9;
                            if (i != 9) {
                                i3 = 10;
                                if (i != 10) {
                                    return i2;
                                }
                            }
                        }
                        return i3;
                    }
                }
            }
            return i4;
        }
        return 0;
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start recording error: ");
        sbLIZ.append(audioRecordStartErrorCode);
        sbLIZ.append(". ");
        sbLIZ.append(str);
        Logging.e("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private int initRecording(int i, int i2, int i3, boolean z, int i4) throws Throwable {
        AudioRecord audioRecord;
        Object objValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitRecording(sampleRate=");
        sbLIZ.append(i);
        sbLIZ.append(", channels=");
        sbLIZ.append(i2);
        sbLIZ.append(", frameSizeMs=");
        sbLIZ.append(i3);
        sbLIZ.append(", forbidVoip=");
        sbLIZ.append(z);
        sbLIZ.append(", preferredSource=");
        sbLIZ.append(i4);
        sbLIZ.append("):");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.apiResult = strLIZIZ;
        Logging.w("WebRtcAudioRecord", strLIZIZ);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -400;
        }
        int i5 = i2 * 2;
        int i6 = i / 100;
        if (i3 > 0 && i3 % 10 == 0) {
            i6 = (i3 * i) / LSPassThroughRecordSizeConfig.DEFAULT;
        }
        this.byteBuffer = ByteBuffer.allocateDirect(i5 * i6);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("byteBuffer.capacity: ");
        sbLIZ2.append(this.byteBuffer.capacity());
        Logging.i("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ2));
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int iChannelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, iChannelCountToConfiguration, 2);
        if (minBufferSize != -1 && minBufferSize != -2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AudioRecord.getMinBufferSize: ");
            sbLIZ3.append(minBufferSize);
            Logging.i("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ3));
            int iMax = Math.max(minBufferSize, this.byteBuffer.capacity() * 2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("bufferSizeInBytes: ");
            sbLIZ4.append(iMax);
            Logging.i("WebRtcAudioRecord", C2188811AlT.LIZIZ(sbLIZ4));
            try {
                synchronized (this) {
                    try {
                        int iCvtNativeSetAudioSource = cvtNativeSetAudioSource(i4, z);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(this.apiResult);
                        sbLIZ5.append(",AudioSource:");
                        sbLIZ5.append(iCvtNativeSetAudioSource);
                        sbLIZ5.append(",MinBufferSize:");
                        sbLIZ5.append(minBufferSize);
                        sbLIZ5.append(",byteBuffer.capcity:");
                        sbLIZ5.append(this.byteBuffer.capacity());
                        sbLIZ5.append(", bufferSizeInBytes:");
                        sbLIZ5.append(iMax);
                        this.apiResult = C2188811AlT.LIZIZ(sbLIZ5);
                        audioRecord = this.audioRecord;
                        if (audioRecord == null) {
                            audioRecord = new AudioRecord(iCvtNativeSetAudioSource, i, iChannelCountToConfiguration, 2, iMax);
                        }
                        this.audioRecord = audioRecord;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (audioRecord.getState() != 1) {
                    reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                    releaseAudioResources();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(this.apiResult);
                    sbLIZ6.append("Failed to create a new AudioRecord instance state:");
                    AudioRecord audioRecord2 = this.audioRecord;
                    if (audioRecord2 == null) {
                        objValueOf = "null";
                    } else {
                        objValueOf = Integer.valueOf(audioRecord2.getState());
                    }
                    sbLIZ6.append(objValueOf);
                    this.apiResult = C2188811AlT.LIZIZ(sbLIZ6);
                    if (this.audioRecord == null) {
                        return -402;
                    }
                    return -403;
                }
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                return i6;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("AudioRecord ctor error: ");
                sbLIZ7.append(e.getMessage());
                reportWebRtcAudioRecordInitError(C2188811AlT.LIZIZ(sbLIZ7));
                releaseAudioResources();
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(this.apiResult);
                sbLIZ8.append("AudioRecord ctor error: ");
                sbLIZ8.append(e.getMessage());
                this.apiResult = C2188811AlT.LIZIZ(sbLIZ8);
                return -401;
            }
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("AudioRecord.getMinBufferSize failed: ");
        sbLIZ9.append(minBufferSize);
        reportWebRtcAudioRecordInitError(C2188811AlT.LIZIZ(sbLIZ9));
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(this.apiResult);
        sbLIZ10.append("AudioRecord.getMinBufferSize failed: ");
        sbLIZ10.append(minBufferSize);
        this.apiResult = C2188811AlT.LIZIZ(sbLIZ10);
        return minBufferSize;
    }
}
