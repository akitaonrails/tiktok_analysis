package com.ss.bytertc.audio.device.webrtc;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C838410Wul;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.audio.device.router.device.AudioModeHelper;
import com.ss.bytertc.audio.device.webrtc.observer.MicMuteChangedObserver;
import com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class WebRtcAudioManager implements VolumeChangedObserver.OnVolumeChangedListener, MicMuteChangedObserver.OnMicMuteChangedListener {
    public static int MAX_VOLUMED;
    public static int MAX_VOLUMED_VOIP;
    public static boolean blacklistDeviceForOpenSLESUsage;
    public static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    public static boolean useStereoInput;
    public static boolean useStereoOutput;
    public boolean aAudio;
    public int apiLevel;
    public final AudioManager audioManager;
    public boolean disablePhoneStateListener;
    public boolean hardwareAEC;
    public boolean hardwareAGC;
    public boolean hardwareNS;
    public boolean initialized;
    public int inputBufferSize;
    public int inputChannels;
    public Set<NativeRecordCallbackInfo> lastRecordcallbackInfos;
    public Set<String> lastReportedPlaybackConfigurationJsonSet;
    public boolean lowLatencyInput;
    public boolean lowLatencyOutput;
    public WebRtcAudioEarBack mByteAudioEarback;
    public MicMuteChangedObserver mMicMuteChangedObserver;
    public VolumeChangedObserver mVolumeChangedObserver;
    public int microphoneVolume = 100;
    public long nativeAudioManager;
    public int nativeChannels;
    public int nativeSampleRate;
    public int outputBufferSize;
    public int outputChannels;
    public AudioManagerPhoneStateListener phoneStateListener;
    public AudioManagerPlaybackConfigurationCallback playbackConfigurationCallback;
    public int preferAudioLayer;
    public boolean proAudio;
    public AudioManagerRecordingCallback recordingCallback;
    public int sampleRate;
    public static final Pattern PLAYBACK_CONFIGURATION_PIID_PATTERN = PatternProtector.compile("\\bpiid:([^\\s]+)");
    public static final Pattern PLAYBACK_CONFIGURATION_DEVICE_ID_PATTERN = PatternProtector.compile("\\bdeviceId:([^\\s]+)");
    public static final Pattern PLAYBACK_CONFIGURATION_UID_PID_PATTERN = PatternProtector.compile("\\bu/pid:([^/\\s]+)/([^\\s]+)");
    public static final Pattern PLAYBACK_CONFIGURATION_STATE_PATTERN = PatternProtector.compile("\\bstate:([^\\s]+)");
    public static final Pattern PLAYBACK_CONFIGURATION_FLAGS_PATTERN = PatternProtector.compile("\\bflags=([^\\s]+)");
    public static final Pattern PLAYBACK_CONFIGURATION_SESSION_ID_PATTERN = PatternProtector.compile("\\bsessionId:([^\\s]+)");

    public static final class NativeAudioLayer {
    }

    private int getPreferAudioLayer() {
        return 0;
    }

    private boolean isCommunicationModeEnabled() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Logging.e("WebRtcAudioManager", stringWriter.toString());
        }
        return 3 == getAudioMode();
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, int i6, int i7, long j);

    private native void nativeOnHardwareEarbackReleased(boolean z, long j);

    private native void nativeOnHardwareEarbackSupportParamsGet(String str, long j);

    private native void nativeOnHardwareEarbackSupported(boolean z, long j);

    private native void nativeOnMicMuteChanged(boolean z, long j);

    private native void nativeOnPhoneStateListenerRegisterChanged(boolean z, long j);

    private native void nativeReportApi(String str, int i, String str2, long j);

    private native void onVolumeChanged(int i, int i2, long j);

    private void terminate() {
        AudioManagerRecordingCallback audioManagerRecordingCallback;
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("terminate(");
                sbLIZ.append(this);
                sbLIZ.append(")");
                sbLIZ.append(WebRtcAudioUtils.getThreadInfo());
                Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
                unregisterPlaybackConfigurationCallback();
                if (Build.VERSION.SDK_INT >= 24 && (audioManagerRecordingCallback = this.recordingCallback) != null) {
                    try {
                        this.audioManager.unregisterAudioRecordingCallback(audioManagerRecordingCallback);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        Logging.e("WebRtcAudioManager", stringWriter.toString());
                    }
                    this.recordingCallback = null;
                }
                if (!this.disablePhoneStateListener) {
                    registerPhoneStateListener(0);
                }
                VolumeChangedObserver volumeChangedObserver = this.mVolumeChangedObserver;
                if (volumeChangedObserver != null) {
                    volumeChangedObserver.release();
                    this.mVolumeChangedObserver = null;
                }
                MicMuteChangedObserver micMuteChangedObserver = this.mMicMuteChangedObserver;
                if (micMuteChangedObserver != null) {
                    micMuteChangedObserver.release();
                    this.mMicMuteChangedObserver = null;
                }
                WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
                if (webRtcAudioEarBack != null) {
                    webRtcAudioEarBack.ByteAudioEarBackRelease();
                    this.mByteAudioEarback = null;
                }
                this.nativeAudioManager = 0L;
                this.initialized = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public native void nativeOnPhoneCallEnd(long j);

    public native void nativeOnPhoneCallStart(long j);

    public native void nativePlaybackConfigurationChanged(String[] strArr, long j);

    public native void nativeRecordCallbackChanged(Object[] objArr, long j);

    private boolean earBackGetIsSupport() {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackSupport();
        }
        return false;
    }

    private int earBackGetLatency() {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackGetLatency();
        }
        return -1;
    }

    private void earBackInit() {
        if (this.mByteAudioEarback == null) {
            this.mByteAudioEarback = new WebRtcAudioEarBack(this);
        }
        this.mByteAudioEarback.ByteAudioEarBackInit();
    }

    private int[] getActiveRecordingSessionIds() {
        AudioManager audioManager = this.audioManager;
        if (Build.VERSION.SDK_INT < 24 || audioManager == null) {
            return new int[0];
        }
        try {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < activeRecordingConfigurations.size(); i++) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) ListProtector.get(activeRecordingConfigurations, i);
                if (audioRecordingConfiguration != null) {
                    arrayList.add(Integer.valueOf(audioRecordingConfiguration.getClientAudioSessionId()));
                }
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) ListProtector.get(arrayList, i2)).intValue();
            }
            return iArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new int[0];
        }
    }

    private int getAudioMode() {
        return AudioModeHelper.INSTANCE.getAudioMode();
    }

    private int getMicrophoneMuteState() {
        try {
            return this.audioManager.isMicrophoneMute() ? 1 : 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Logging.e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getSampleRateForApiLevel() {
        String property;
        try {
            property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property == null) {
                return WebRtcAudioUtils.getDefaultSampleRateHz();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Logging.e("WebRtcAudioManager", stringWriter.toString());
            property = "";
        }
        return CastIntegerProtector.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        return useStereoInput;
    }

    public static synchronized boolean getStereoOutput() {
        return useStereoOutput;
    }

    private boolean isAAudioSupported() {
        return Build.VERSION.SDK_INT >= 28;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean zDeviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (zDeviceIsBlacklistedForOpenSLESUsage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Build.MODEL);
            sbLIZ.append(" is blacklisted for OpenSL ES usage!");
            Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zDeviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isRecordShouldUseVoiceRecognition() {
        return Build.BRAND.equals("samsung");
    }

    private boolean isWiredHeadsetOn() {
        try {
            return this.audioManager.isWiredHeadsetOn();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Logging.e("WebRtcAudioManager", stringWriter.toString());
            return false;
        }
    }

    private void refreshAudioParameters() {
        storeAudioParameters();
        nativeCacheAudioParameters(this.apiLevel, this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, this.preferAudioLayer, this.nativeAudioManager);
    }

    private void registerPlaybackConfigurationCallback() {
        String strThrowableToString;
        int i = -1;
        if (Build.VERSION.SDK_INT < 26) {
            reportApi("register_playback_configuration_listener", -1, "AudioPlaybackCallback requires Android O or above");
            return;
        }
        if (this.playbackConfigurationCallback != null) {
            return;
        }
        AudioManagerPlaybackConfigurationCallback audioManagerPlaybackConfigurationCallback = new AudioManagerPlaybackConfigurationCallback();
        this.lastReportedPlaybackConfigurationJsonSet = null;
        this.playbackConfigurationCallback = audioManagerPlaybackConfigurationCallback;
        try {
            this.audioManager.registerAudioPlaybackCallback(audioManagerPlaybackConfigurationCallback, null);
            i = 0;
            strThrowableToString = "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strThrowableToString = throwableToString(th);
            Logging.e("WebRtcAudioManager", strThrowableToString);
            if (this.playbackConfigurationCallback == audioManagerPlaybackConfigurationCallback) {
                this.playbackConfigurationCallback = null;
            }
        }
        reportApi("register_playback_configuration_listener", i, strThrowableToString);
        if (i == 0) {
            try {
                List<AudioPlaybackConfiguration> activePlaybackConfigurations = this.audioManager.getActivePlaybackConfigurations();
                if (activePlaybackConfigurations == null) {
                    activePlaybackConfigurations = new ArrayList<>();
                }
                audioManagerPlaybackConfigurationCallback.onPlaybackConfigChanged(activePlaybackConfigurations);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                Logging.e("WebRtcAudioManager", throwableToString(th2));
            }
        }
    }

    private void storeAudioParameters() {
        this.apiLevel = Build.VERSION.SDK_INT;
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = WebRtcAudioEffects.canUseAcousticEchoCanceler();
        this.hardwareAGC = false;
        this.hardwareNS = WebRtcAudioEffects.canUseNoiseSuppressor();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyOutputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
        this.preferAudioLayer = getPreferAudioLayer();
    }

    private void unregisterPlaybackConfigurationCallback() {
        String strThrowableToString;
        int i;
        if (Build.VERSION.SDK_INT < 26) {
            this.playbackConfigurationCallback = null;
            this.lastReportedPlaybackConfigurationJsonSet = null;
            Logging.e("WebRtcAudioManager", "unregister_playback_configuration_listener skipped, AudioPlaybackCallback requires Android O or above");
            return;
        }
        AudioManagerPlaybackConfigurationCallback audioManagerPlaybackConfigurationCallback = this.playbackConfigurationCallback;
        this.playbackConfigurationCallback = null;
        this.lastReportedPlaybackConfigurationJsonSet = null;
        if (audioManagerPlaybackConfigurationCallback == null) {
            Logging.e("WebRtcAudioManager", "unregister_playback_configuration_listener skipped, callback is not registered");
            return;
        }
        try {
            this.audioManager.unregisterAudioPlaybackCallback(audioManagerPlaybackConfigurationCallback);
            i = 0;
            strThrowableToString = "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strThrowableToString = throwableToString(th);
            Logging.e("WebRtcAudioManager", strThrowableToString);
            i = -1;
        }
        Logging.e("WebRtcAudioManager", "unregister_playback_configuration_listener, errorCode: " + i + ", message: " + strThrowableToString);
    }

    private String getAudioDeviceInfo() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{ Audio State: audio mode: ");
            sbLIZ.append(WebRtcAudioUtils.modeToString(getAudioMode()));
            sbLIZ.append(", has mic: ");
            sbLIZ.append(WebRtcAudioUtils.hasMicrophone());
            sbLIZ.append(", music active: ");
            sbLIZ.append(this.audioManager.isMusicActive());
            sbLIZ.append(", speakerphone: ");
            sbLIZ.append(this.audioManager.isSpeakerphoneOn());
            sbLIZ.append(", headset: ");
            sbLIZ.append(this.audioManager.isWiredHeadsetOn());
            sbLIZ.append("BT SCO: ");
            sbLIZ.append(this.audioManager.isBluetoothScoOn());
            sbLIZ.append("music actived: ");
            sbLIZ.append(this.audioManager.isMusicActive());
            sbLIZ.append("permission: ");
            sbLIZ.append(WebRtcAudioUtils.isPermissionGranted());
            sbLIZ.append(" bt_sco_available_off_call: ");
            sbLIZ.append(this.audioManager.isBluetoothScoAvailableOffCall());
            sbLIZ.append(" }");
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Logging.e("WebRtcAudioManager", stringWriter.toString());
            return stringWriter.toString();
        }
    }

    private int getFixedDevicePlayVolume() {
        try {
            int audioMode = getAudioMode();
            int i = 3;
            if (audioMode != 0) {
                if (audioMode == 1) {
                    i = 2;
                } else if (audioMode == 2 || audioMode == 3) {
                    i = 0;
                }
            }
            return (int) ((((double) this.audioManager.getStreamVolume(i)) * 100.0d) / ((double) C786410Ut5.Z3(this.audioManager, i)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Logging.e("WebRtcAudioManager", stringWriter.toString());
            return -1;
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        if (isLowLatencyOutputSupported()) {
            try {
                property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringWriter stringWriter = new StringWriter();
                e.printStackTrace(new PrintWriter(stringWriter));
                Logging.e("WebRtcAudioManager", stringWriter.toString());
                property = "";
            }
            if (property != null) {
                if (CastIntegerProtector.parseInt(property) != 0) {
                    return CastIntegerProtector.parseInt(property);
                }
            }
        }
        return 256;
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.i("WebRtcAudioManager", "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Default sample rate is overriden to ");
            sbLIZ.append(WebRtcAudioUtils.getDefaultSampleRateHz());
            sbLIZ.append(" Hz");
            Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Sample rate is set to ");
        sbLIZ2.append(defaultSampleRateHz);
        sbLIZ2.append(" Hz");
        Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ2));
        return defaultSampleRateHz;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isPermissionGranted() {
        return WebRtcAudioUtils.isPermissionGranted();
    }

    private boolean isProAudioSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }

    private int getFixedDeviceRecordVolume() {
        return this.microphoneVolume;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public class AudioManagerPhoneStateListener extends PhoneStateListener {
        public int callState;

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
        }

        public AudioManagerPhoneStateListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            synchronized (WebRtcAudioManager.this) {
                try {
                    int i2 = this.callState;
                    this.callState = i;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCallStateChanged, from: ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", to: ");
                    sbLIZ.append(i);
                    Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (i != 0) {
                        if ((i == 1 || i == 2) && i2 == 0) {
                            if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                                Logging.i("WebRtcAudioManager", "startPhoneCall");
                                WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                                webRtcAudioManager.nativeOnPhoneCallStart(webRtcAudioManager.nativeAudioManager);
                            } else {
                                Logging.e("WebRtcAudioManager", "nativeAudioManager is null");
                            }
                        }
                    } else if (i2 == 1 || i2 == 2) {
                        if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                            Logging.i("WebRtcAudioManager", "endPhoneCall");
                            WebRtcAudioManager webRtcAudioManager2 = WebRtcAudioManager.this;
                            webRtcAudioManager2.nativeOnPhoneCallEnd(webRtcAudioManager2.nativeAudioManager);
                        } else {
                            Logging.e("WebRtcAudioManager", "nativeAudioManager is null");
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public class AudioManagerPlaybackConfigurationCallback extends AudioManager.AudioPlaybackCallback {
        public AudioManagerPlaybackConfigurationCallback() {
        }

        @Override // android.media.AudioManager.AudioPlaybackCallback
        public void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> list) {
            super.onPlaybackConfigChanged(list);
            String[] strArrBuildPlaybackConfigurations = WebRtcAudioManager.this.buildPlaybackConfigurations(list);
            Set<String> setBuildPlaybackConfigurationJsonSet = WebRtcAudioManager.buildPlaybackConfigurationJsonSet(strArrBuildPlaybackConfigurations);
            synchronized (WebRtcAudioManager.this) {
                try {
                    WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                    if (webRtcAudioManager.nativeAudioManager != 0 && webRtcAudioManager.playbackConfigurationCallback == this) {
                        Set<String> set = webRtcAudioManager.lastReportedPlaybackConfigurationJsonSet;
                        if (set != null && set.equals(setBuildPlaybackConfigurationJsonSet)) {
                            return;
                        }
                        WebRtcAudioManager webRtcAudioManager2 = WebRtcAudioManager.this;
                        webRtcAudioManager2.lastReportedPlaybackConfigurationJsonSet = setBuildPlaybackConfigurationJsonSet;
                        webRtcAudioManager2.nativePlaybackConfigurationChanged(strArrBuildPlaybackConfigurations, webRtcAudioManager2.nativeAudioManager);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public class AudioManagerRecordingCallback extends AudioManager.AudioRecordingCallback {
        public WebRtcAudioManager manager;

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            Set<NativeRecordCallbackInfo> set;
            int audioSource;
            super.onRecordingConfigChanged(list);
            HashSet hashSet = new HashSet();
            for (int i = 0; i < list.size(); i++) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) ListProtector.get(list, i);
                NativeRecordCallbackInfo nativeRecordCallbackInfo = WebRtcAudioManager.this.new NativeRecordCallbackInfo();
                nativeRecordCallbackInfo.audio_session_id = audioRecordingConfiguration.getClientAudioSessionId();
                nativeRecordCallbackInfo.client_audio_source = audioRecordingConfiguration.getClientAudioSource();
                int i2 = Build.VERSION.SDK_INT;
                int i3 = -1;
                if (i2 >= 29) {
                    audioSource = audioRecordingConfiguration.getAudioSource();
                } else {
                    audioSource = -1;
                }
                nativeRecordCallbackInfo.audio_source = audioSource;
                if (i2 >= 29) {
                    if (audioRecordingConfiguration.isClientSilenced()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                }
                nativeRecordCallbackInfo.is_client_silenced = i3;
                hashSet.add(nativeRecordCallbackInfo);
            }
            synchronized (this.manager) {
                try {
                    WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                    if (webRtcAudioManager.nativeAudioManager != 0 && ((set = webRtcAudioManager.lastRecordcallbackInfos) == null || !set.equals(hashSet))) {
                        WebRtcAudioManager.this.nativeRecordCallbackChanged(hashSet.toArray(new NativeRecordCallbackInfo[hashSet.size()]), WebRtcAudioManager.this.nativeAudioManager);
                        WebRtcAudioManager.this.lastRecordcallbackInfos = hashSet;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public AudioManagerRecordingCallback(WebRtcAudioManager webRtcAudioManager) {
            this.manager = webRtcAudioManager;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public final class NativeRecordCallbackInfo {
        public int audio_session_id;
        public int audio_source;
        public int client_audio_source;
        public int is_client_silenced;

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.audio_session_id), Integer.valueOf(this.client_audio_source), Integer.valueOf(this.audio_source), Integer.valueOf(this.is_client_silenced));
        }

        public NativeRecordCallbackInfo() {
            this.audio_session_id = -1;
            this.client_audio_source = -1;
            this.audio_source = -1;
            this.is_client_silenced = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || NativeRecordCallbackInfo.class != obj.getClass()) {
                return false;
            }
            NativeRecordCallbackInfo nativeRecordCallbackInfo = (NativeRecordCallbackInfo) obj;
            if (this.audio_session_id == nativeRecordCallbackInfo.audio_session_id && this.client_audio_source == nativeRecordCallbackInfo.client_audio_source && this.audio_source == nativeRecordCallbackInfo.audio_source && this.is_client_silenced == nativeRecordCallbackInfo.is_client_silenced) {
                return true;
            }
            return false;
        }
    }

    public WebRtcAudioManager(long j) {
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ctor(");
                sbLIZ.append(this);
                sbLIZ.append(")");
                sbLIZ.append(WebRtcAudioUtils.getThreadInfo());
                Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
                this.nativeAudioManager = j;
                AudioModeHelper.INSTANCE.init(ContextUtils.getApplicationContext());
                AudioManager audioManager = (AudioManager) C786410Ut5.H2(ContextUtils.getApplicationContext(), "audio");
                this.audioManager = audioManager;
                MAX_VOLUMED = C786410Ut5.Z3(audioManager, 3);
                MAX_VOLUMED_VOIP = C786410Ut5.Z3(audioManager, 0);
                refreshAudioParameters();
                WebRtcAudioUtils.logAudioState("WebRtcAudioManager");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private int SetAudioMode(int i) {
        Logging.i("WebRtcAudioManager", "SetAudioMode enter");
        int mode = AudioModeHelper.INSTANCE.setMode(i);
        Logging.i("WebRtcAudioManager", "SetAudioMode leave");
        return mode;
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static Set<String> buildPlaybackConfigurationJsonSet(String[] strArr) {
        HashSet hashSet = new HashSet();
        if (strArr == null) {
            return hashSet;
        }
        for (String str : strArr) {
            if (str != null) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private int earBackEnable(boolean z) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackEnable(z);
        }
        return -1;
    }

    private int earBackSetEffect(int i) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.ByteAudioEarBackEffect(i);
            return 0;
        }
        return 0;
    }

    private int earBackSetEqualizer(int i) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.ByteAudioEarBackEqualizer(i);
            return 0;
        }
        return 0;
    }

    private int earBackSetVolume(int i) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.ByteAudioEarBackSetVolume(i);
            return 0;
        }
        return 0;
    }

    private boolean init(boolean z) {
        synchronized (this) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("init(");
                sbLIZ.append(this);
                sbLIZ.append(")");
                sbLIZ.append(WebRtcAudioUtils.getThreadInfo());
                sbLIZ.append(", disablePhoneStateListener: ");
                sbLIZ.append(z);
                Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
                if (this.initialized) {
                    return true;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("audio mode is: ");
                sbLIZ2.append(WebRtcAudioUtils.modeToString(getAudioMode()));
                Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (Build.VERSION.SDK_INT >= 24 && this.recordingCallback == null) {
                    AudioManagerRecordingCallback audioManagerRecordingCallback = new AudioManagerRecordingCallback(this);
                    this.recordingCallback = audioManagerRecordingCallback;
                    try {
                        this.audioManager.registerAudioRecordingCallback(audioManagerRecordingCallback, null);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        Logging.e("WebRtcAudioManager", stringWriter.toString());
                    }
                }
                this.disablePhoneStateListener = z;
                if (!z) {
                    registerPhoneStateListener(32);
                }
                this.mVolumeChangedObserver = new VolumeChangedObserver(this);
                try {
                    int audioMode = getAudioMode();
                    if (audioMode == 0) {
                        onVolumeChanged(3, this.audioManager.getStreamVolume(3));
                    } else if (audioMode == 3) {
                        onVolumeChanged(0, this.audioManager.getStreamVolume(0));
                    }
                    this.initialized = true;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringWriter stringWriter2 = new StringWriter();
                    e2.printStackTrace(new PrintWriter(stringWriter2));
                    Logging.e("WebRtcAudioManager", stringWriter2.toString());
                }
                this.mMicMuteChangedObserver = new MicMuteChangedObserver(this);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean isActivePlaybackConfiguration(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.contains("stopped") && !lowerCase.contains("paused") && !lowerCase.contains("idle") && !lowerCase.contains("released")) {
            return true;
        }
        return false;
    }

    public static String objectToString(Object obj) {
        String string = "";
        if (obj != null) {
            try {
                string = obj.toString();
                return string;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return string;
    }

    private void registerPhoneStateListener(final int i) {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Logging.e("WebRtcAudioManager", "context is null");
        } else if (Build.VERSION.SDK_INT >= 31 && applicationContext.getApplicationInfo().targetSdkVersion >= 31 && C838410Wul.LIZ(applicationContext, "android.permission.READ_PHONE_STATE") != 0) {
            Logging.e("WebRtcAudioManager", "Missing READ_PHONE_STATE permission");
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: com.ss.bytertc.audio.device.webrtc.WebRtcAudioManager.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("WebRtcAudioManager@d3b9.registerPhoneStateListener$1");
                    com_ss_bytertc_audio_device_webrtc_WebRtcAudioManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("WebRtcAudioManager@d3b9.registerPhoneStateListener$1");
                }

                public void com_ss_bytertc_audio_device_webrtc_WebRtcAudioManager$1__run$___twin___() {
                    try {
                        WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                        if (webRtcAudioManager.phoneStateListener == null) {
                            webRtcAudioManager.phoneStateListener = WebRtcAudioManager.this.new AudioManagerPhoneStateListener();
                        }
                        if (i == 0) {
                            WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(false);
                        }
                        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(ContextUtils.getApplicationContext(), "phone");
                        if (telephonyManager != null) {
                            C2204961BRm.LLILIL(telephonyManager, WebRtcAudioManager.this.phoneStateListener, i, new C0WZX("dzBzEhEpEcjFQVIzURHKZ7WSg+BNe5vkPBFlw4liOF7S3exQuyR6WF2FHJp9r0dPYLQs3tk=", null));
                        }
                        if (i == 32) {
                            WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(true);
                        }
                        Logging.i("WebRtcAudioManager", "registerPhoneStateListener success with event: " + i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Logging.e("WebRtcAudioManager", "registerPhoneStateListener (" + i + "), error: " + th.getCause() + ", " + th.getMessage());
                    }
                }

                public static void com_ss_bytertc_audio_device_webrtc_WebRtcAudioManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_bytertc_audio_device_webrtc_WebRtcAudioManager$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        blacklistDeviceForOpenSLESUsageIsOverridden = true;
        blacklistDeviceForOpenSLESUsage = z;
    }

    private void setPlaybackConfigurationReportEnabled(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlaybackConfigurationReportEnabled(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this) {
            try {
                if (z) {
                    registerPlaybackConfigurationCallback();
                } else {
                    unregisterPlaybackConfigurationCallback();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Overriding default input behavior: setStereoInput(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        Logging.w("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
        useStereoInput = z;
    }

    public static synchronized void setStereoOutput(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Overriding default output behavior: setStereoOutput(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        Logging.w("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
        useStereoOutput = z;
    }

    public static String throwableToString(Throwable th) {
        if (th == null) {
            return "";
        }
        String message = th.getMessage();
        if (message != null && !message.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getClass().getSimpleName());
            sbLIZ.append(": ");
            sbLIZ.append(message);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return th.getClass().getSimpleName();
    }

    public String[] buildPlaybackConfigurations(List<AudioPlaybackConfiguration> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size() && arrayList.size() < 20; i++) {
                AudioPlaybackConfiguration audioPlaybackConfiguration = (AudioPlaybackConfiguration) ListProtector.get(list, i);
                if (audioPlaybackConfiguration != null) {
                    String strObjectToString = objectToString(audioPlaybackConfiguration);
                    if (!strObjectToString.isEmpty() && isActivePlaybackConfiguration(strObjectToString)) {
                        arrayList.add(buildPlaybackConfigurationJson(audioPlaybackConfiguration, strObjectToString));
                    }
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return new String[0];
    }

    public void notifyPhoneStateListenerRegistered(boolean z) {
        synchronized (this) {
            try {
                if (this.nativeAudioManager != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dixing: notifyPhoneStateListenerRegistered: ");
                    sbLIZ.append(z);
                    sbLIZ.append(", ");
                    sbLIZ.append(this.nativeAudioManager);
                    Logging.i("WebRtcAudioManager", C2188811AlT.LIZIZ(sbLIZ));
                    nativeOnPhoneStateListenerRegisterChanged(z, this.nativeAudioManager);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onHardwareEarbackReleased(boolean z) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnHardwareEarbackReleased(z, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onHardwareEarbackSupportParamsGet(String str) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnHardwareEarbackSupportParamsGet(str, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onHardwareEarbackSupported(boolean z) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnHardwareEarbackSupported(z, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.audio.device.webrtc.observer.MicMuteChangedObserver.OnMicMuteChangedListener
    public void onMicMuteChanged(boolean z) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnMicMuteChanged(z, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String buildPlaybackConfigurationJson(AudioPlaybackConfiguration audioPlaybackConfiguration, String str) {
        JSONObject jSONObject = new JSONObject();
        putMatchedLongValue(jSONObject, "piid", str, PLAYBACK_CONFIGURATION_PIID_PATTERN);
        putMatchedLongValue(jSONObject, "deviceId", str, PLAYBACK_CONFIGURATION_DEVICE_ID_PATTERN);
        putUidPid(jSONObject, str);
        putMatchedValue(jSONObject, "state", str, PLAYBACK_CONFIGURATION_STATE_PATTERN);
        putAudioAttributeValues(jSONObject, audioPlaybackConfiguration);
        putMatchedValue(jSONObject, "flags", str, PLAYBACK_CONFIGURATION_FLAGS_PATTERN);
        putMatchedLongValue(jSONObject, "session_id", str, PLAYBACK_CONFIGURATION_SESSION_ID_PATTERN);
        return C786410Ut5.J3(jSONObject);
    }

    public static int getMinInputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i4;
    }

    public static int getMinOutputFrameSize(int i, int i2) {
        int i3;
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    public static void putAudioAttributeValues(JSONObject jSONObject, AudioPlaybackConfiguration audioPlaybackConfiguration) {
        try {
            AudioAttributes audioAttributes = audioPlaybackConfiguration.getAudioAttributes();
            if (audioAttributes == null) {
                return;
            }
            jSONObject.put("usage", audioAttributes.getUsage());
            jSONObject.put("content", audioAttributes.getContentType());
            if (Build.VERSION.SDK_INT >= 29) {
                jSONObject.put("allowed_capture_policy", audioAttributes.getAllowedCapturePolicy());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void putUidPid(JSONObject jSONObject, String str) {
        try {
            Matcher matcher = PLAYBACK_CONFIGURATION_UID_PID_PATTERN.matcher(str);
            if (!matcher.find()) {
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null && !strGroup.isEmpty()) {
                jSONObject.put("uid", CastLongProtector.parseLong(strGroup));
            }
            if (strGroup2 != null && !strGroup2.isEmpty()) {
                jSONObject.put("pid", CastLongProtector.parseLong(strGroup2));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onEvent(int i, int i2) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.onEvent(i, i2);
        }
    }

    @Override // com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver.OnVolumeChangedListener
    public void onVolumeChanged(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = MAX_VOLUMED_VOIP;
        } else {
            i3 = MAX_VOLUMED;
        }
        double d = ((((double) i2) * 1.0d) / ((double) i3)) * 100.0d;
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    onVolumeChanged(i, (int) d, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void putJsonValue(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            try {
                if (!str2.isEmpty()) {
                    jSONObject.put(str, str2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    private void reportApi(String str, int i, String str2) {
        String str3 = str2;
        if (str3 == null) {
            str3 = "";
        }
        long j = this.nativeAudioManager;
        if (j == 0) {
            return;
        }
        nativeReportApi(str, i, str3, j);
    }

    public static void putMatchedLongValue(JSONObject jSONObject, String str, String str2, Pattern pattern) {
        String strGroup;
        try {
            Matcher matcher = pattern.matcher(str2);
            if (matcher.find() && (strGroup = matcher.group(1)) != null && !strGroup.isEmpty()) {
                jSONObject.put(str, CastLongProtector.parseLong(strGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void putMatchedValue(JSONObject jSONObject, String str, String str2, Pattern pattern) {
        String strGroup;
        try {
            Matcher matcher = pattern.matcher(str2);
            if (matcher.find() && (strGroup = matcher.group(1)) != null && !strGroup.isEmpty()) {
                jSONObject.put(str, strGroup);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
