package com.ss.bytertc.audio.device.webrtc;

import X.C08FF;
import X.C0W9U;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.ExceptionUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public class WebRtcAudioTrack {
    public static final int DEFAULT_USAGE;
    public static ErrorCallback errorCallback;
    public static WebRtcAudioTrackErrorCallback errorCallbackOld;
    public static boolean sForbidVoip;
    public static volatile boolean speakerMute;
    public static int usageAttribute;
    public String apiResult;
    public final AudioManager audioManager;
    public AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    public final ThreadUtils.ThreadChecker threadChecker;

    /* JADX INFO: loaded from: classes28.dex */
    public static class AudioTrackErrorCode {
    }

    public class AudioTrackThread extends BPEAThread {
        public volatile boolean keepAlive;

        private void bpea_origin_run() {
            com_ss_bytertc_audio_device_webrtc_WebRtcAudioTrack$AudioTrackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void stopThread() {
            synchronized (this) {
                try {
                    Logging.i("WebRtcAudioTrack", "stopThread");
                    this.keepAlive = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public void com_ss_bytertc_audio_device_webrtc_WebRtcAudioTrack$AudioTrackThread__run$___twin___() {
            int iWriteBytes;
            try {
                if (WebRtcAudioTrack.this.audioTrack == null) {
                    Logging.e("WebRtcAudioTrack", "null audio track instance");
                    this.keepAlive = false;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AudioTrackThread");
                    sbLIZ.append(WebRtcAudioUtils.getThreadInfo());
                    Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AudioTrack state: ");
                    sbLIZ2.append(WebRtcAudioTrack.this.audioTrack.getPlayState());
                    Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ2));
                }
                Process.setThreadPriority(-19);
                int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
                while (this.keepAlive) {
                    synchronized (this) {
                        try {
                            if (this.keepAlive) {
                                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                                webRtcAudioTrack.nativeGetPlayoutData(iCapacity, webRtcAudioTrack.nativeAudioTrack);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (WebRtcAudioTrack.speakerMute) {
                        WebRtcAudioTrack.this.byteBuffer.clear();
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        webRtcAudioTrack2.byteBuffer.put(webRtcAudioTrack2.emptyBytes);
                        WebRtcAudioTrack.this.byteBuffer.position(0);
                    }
                    try {
                        WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                        iWriteBytes = writeBytes(webRtcAudioTrack3.audioTrack, webRtcAudioTrack3.byteBuffer, iCapacity);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.keepAlive = false;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("AudioTrack.write error, Exception: ");
                        sbLIZ3.append(e.getMessage());
                        Logging.e("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ3));
                        WebRtcAudioTrack webRtcAudioTrack4 = WebRtcAudioTrack.this;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("AudioTrack.write error, Exception: ");
                        sbLIZ4.append(e.getMessage());
                        webRtcAudioTrack4.reportWebRtcAudioTrackError(C2188811AlT.LIZIZ(sbLIZ4));
                        iWriteBytes = -1;
                    }
                    if (iWriteBytes != iCapacity && iWriteBytes < 0) {
                        this.keepAlive = false;
                        Logging.e("WebRtcAudioTrack", "AudioTrack.write played invalid number of bytes: " + iWriteBytes);
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + iWriteBytes);
                    }
                    WebRtcAudioTrack.this.byteBuffer.rewind();
                }
                if (WebRtcAudioTrack.this.audioTrack != null) {
                    Logging.i("WebRtcAudioTrack", "Calling AudioTrack.stop...");
                    try {
                        WebRtcAudioTrack.this.audioTrack.stop();
                        Logging.i("WebRtcAudioTrack", "AudioTrack.stop is done.");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("AudioTrack.stop failed: ");
                        sbLIZ5.append(e2.getMessage());
                        Logging.e("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("AudioTrackThread.run error, Exception: ");
                sbLIZ6.append(e3.getMessage());
                Logging.e("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ6));
                WebRtcAudioTrack webRtcAudioTrack5 = WebRtcAudioTrack.this;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("AudioTrackThread.run error, Exception: ");
                sbLIZ7.append(e3.getMessage());
                webRtcAudioTrack5.reportWebRtcAudioTrackError(C2188811AlT.LIZIZ(sbLIZ7));
            }
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("WebRtcAudioTrack$AudioTrackThread@4b5b.run");
            boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
            try {
                com_ss_bytertc_audio_device_webrtc_WebRtcAudioTrack$AudioTrackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("WebRtcAudioTrack$AudioTrackThread@4b5b.run");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public static void com_ss_bytertc_audio_device_webrtc_WebRtcAudioTrack$AudioTrackThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AudioTrackThread audioTrackThread) {
            try {
                audioTrackThread.com_ss_bytertc_audio_device_webrtc_WebRtcAudioTrack$AudioTrackThread__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            if (audioTrack == null) {
                return -1;
            }
            return audioTrack.write(byteBuffer, i, 0);
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeGetPlayoutData(int i, long j);

    private String getApiResult() {
        this.threadChecker.checkIsOnValidThread();
        return this.apiResult;
    }

    private int getAudioSessionId() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getAudioSessionId();
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.i("WebRtcAudioTrack", "getStreamMaxVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return C786410Ut5.Z3(audioManager, 0);
    }

    private int getStreamType() {
        this.threadChecker.checkIsOnValidThread();
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getStreamType();
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.i("WebRtcAudioTrack", "getStreamVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamVolume(0);
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AudioTrack: buffer capacity in frames: ");
            sbLIZ.append(this.audioTrack.getBufferCapacityInFrames());
            Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT < 24 || this.audioTrack == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("underrun count: ");
        sbLIZ.append(this.audioTrack.getUnderrunCount());
        Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void releaseAudioResources() {
        Logging.i("WebRtcAudioTrack", "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    private int startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.i("WebRtcAudioTrack", "startPlayout");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            Logging.e("WebRtcAudioTrack", "null audio track object");
            return -100;
        }
        if (this.audioThread != null) {
            Logging.e("WebRtcAudioTrack", "the previous audio thread leak");
            return -101;
        }
        this.apiResult = "StartPlayout:";
        try {
            audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                AudioTrackThread audioTrackThread = new AudioTrackThread("BaeTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return 0;
            }
            AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AudioTrack.play failed - incorrect state :");
            sbLIZ.append(this.audioTrack.getPlayState());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.apiResult);
            sbLIZ2.append("AudioTrack.play failed - incorrect state :");
            sbLIZ2.append(this.audioTrack.getPlayState());
            this.apiResult = C2188811AlT.LIZIZ(sbLIZ2);
            releaseAudioResources();
            return -103;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AudioTrack.play failed: ");
            sbLIZ3.append(e.getMessage());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, C2188811AlT.LIZIZ(sbLIZ3));
            releaseAudioResources();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.apiResult);
            sbLIZ4.append("AudioTrack.play failed: ");
            sbLIZ4.append(e.getMessage());
            this.apiResult = C2188811AlT.LIZIZ(sbLIZ4);
            return -102;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.i("WebRtcAudioTrack", "stopPlayout");
        this.apiResult = "StopPlayout:";
        logUnderrunCount();
        if (this.audioThread != null) {
            Logging.i("WebRtcAudioTrack", "Stopping the AudioTrackThread...");
            this.audioThread.stopThread();
            Logging.i("WebRtcAudioTrack", "interrupt the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                Logging.e("WebRtcAudioTrack", "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.apiResult);
                sbLIZ.append("Join of AudioTrackThread timed out.");
                this.apiResult = C2188811AlT.LIZIZ(sbLIZ);
            }
            Logging.i("WebRtcAudioTrack", "AudioTrackThread has now been stopped.");
            this.audioThread = null;
        }
        releaseAudioResources();
        Logging.i("WebRtcAudioTrack", "stopPlayout release done.");
        return true;
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    private void logBufferSizeInFrames() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioTrack: buffer size in frames: ");
        sbLIZ.append(this.audioTrack.getBufferSizeInFrames());
        Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void logMainParameters() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioTrack: session ID: ");
        sbLIZ.append(this.audioTrack.getAudioSessionId());
        sbLIZ.append(", channels: ");
        sbLIZ.append(this.audioTrack.getChannelCount());
        sbLIZ.append(", sample rate: ");
        sbLIZ.append(this.audioTrack.getSampleRate());
        sbLIZ.append(", max gain: ");
        sbLIZ.append(AudioTrack.getMaxVolume());
        Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    /* JADX INFO: loaded from: classes28.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH;

        public static AudioTrackStartErrorCode valueOf(String str) {
            return (AudioTrackStartErrorCode) C08FF.LIZ(AudioTrackStartErrorCode.class, str);
        }
    }

    public WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.apiResult = "";
        threadChecker.checkIsOnValidThread();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ctor");
        sbLIZ.append(WebRtcAudioUtils.getThreadInfo());
        Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) C786410Ut5.H2(ContextUtils.getApplicationContext(), "audio");
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Init playout error: ");
        sbLIZ.append(str);
        Logging.e("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Default usage attribute is changed from: ");
        sbLIZ.append(DEFAULT_USAGE);
        sbLIZ.append(" to ");
        sbLIZ.append(i);
        Logging.w("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        usageAttribute = i;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.i("WebRtcAudioTrack", "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public static void setSpeakerMute(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSpeakerMute(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        Logging.w("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStreamVolume(");
        sbLIZ.append(i);
        sbLIZ.append(")");
        Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        if (this.audioManager == null) {
            return false;
        }
        if (isVolumeFixed()) {
            Logging.e("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    public void reportWebRtcAudioTrackError(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Run-time playback error: ");
        sbLIZ.append(str);
        Logging.e("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.i("WebRtcAudioTrack", "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start playout error: ");
        sbLIZ.append(audioTrackStartErrorCode);
        sbLIZ.append(". ");
        sbLIZ.append(str);
        Logging.e("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        int i4;
        Logging.i("WebRtcAudioTrack", "createAudioTrackOnLollipopOrHigher");
        if (sForbidVoip) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(i4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nativeOutputSampleRate: ");
        sbLIZ.append(nativeOutputSampleRate);
        Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ));
        if (i != nativeOutputSampleRate) {
            Logging.w("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        if (sForbidVoip) {
            usageAttribute = 1;
        } else {
            usageAttribute = DEFAULT_USAGE;
        }
        if (usageAttribute != DEFAULT_USAGE) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("A non default usage attribute is used: ");
            sbLIZ2.append(usageAttribute);
            Logging.w("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        if (sForbidVoip) {
            return new AudioTrack(3, i, i2, 2, i3, 1);
        }
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private int initPlayout(int i, int i2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitPlayout(sampleRate=");
        sbLIZ.append(i);
        sbLIZ.append(", channels=");
        sbLIZ.append(i2);
        sbLIZ.append(", forbidVoip=");
        sbLIZ.append(z);
        sbLIZ.append("):");
        this.apiResult = C2188811AlT.LIZIZ(sbLIZ);
        sForbidVoip = z;
        try {
            this.threadChecker.checkIsOnValidThread();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initPlayout(sampleRate=");
            sbLIZ2.append(i);
            sbLIZ2.append(", channels=");
            sbLIZ2.append(i2);
            sbLIZ2.append(")");
            Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ2));
            this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("byteBuffer.capacity: ");
            sbLIZ3.append(this.byteBuffer.capacity());
            Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ3));
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int iChannelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioTrack.getMinBufferSize(i, iChannelCountToConfiguration, 2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("AudioTrack.getMinBufferSize: ");
            sbLIZ4.append(minBufferSize);
            Logging.i("WebRtcAudioTrack", C2188811AlT.LIZIZ(sbLIZ4));
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(this.apiResult);
                sbLIZ5.append("AudioTrack.getMinBufferSize returns an invalid value.");
                this.apiResult = C2188811AlT.LIZIZ(sbLIZ5);
                return -200;
            }
            if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(this.apiResult);
                sbLIZ6.append("Conflict with existing AudioTrack.");
                this.apiResult = C2188811AlT.LIZIZ(sbLIZ6);
                return -201;
            }
            try {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(this.apiResult);
                sbLIZ7.append("minBufferSizeInBytes: ");
                sbLIZ7.append(minBufferSize);
                this.apiResult = C2188811AlT.LIZIZ(sbLIZ7);
                AudioTrack audioTrackCreateAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, iChannelCountToConfiguration, minBufferSize);
                this.audioTrack = audioTrackCreateAudioTrackOnLollipopOrHigher;
                if (audioTrackCreateAudioTrackOnLollipopOrHigher != null && audioTrackCreateAudioTrackOnLollipopOrHigher.getState() == 1) {
                    logMainParameters();
                    logMainParametersExtended();
                    return 0;
                }
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(this.apiResult);
                sbLIZ8.append("Initialization of audio track failed.");
                this.apiResult = C2188811AlT.LIZIZ(sbLIZ8);
                if (this.audioTrack == null) {
                    return -203;
                }
                return -204;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append(ExceptionUtils.stackTrace(e));
                sbLIZ9.append(e.getMessage());
                reportWebRtcAudioTrackInitError(C2188811AlT.LIZIZ(sbLIZ9));
                releaseAudioResources();
                return -202;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Logging.w("WebRtcAudioTrack", "initPlayout exception", e2);
            reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e2));
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(this.apiResult);
            sbLIZ10.append("initPlayout exception");
            this.apiResult = C2188811AlT.LIZIZ(sbLIZ10);
            return -205;
        }
    }
}
