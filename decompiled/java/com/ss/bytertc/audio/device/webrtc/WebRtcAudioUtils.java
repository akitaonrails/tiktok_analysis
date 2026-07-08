package com.ss.bytertc.audio.device.webrtc;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C838410Wul;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes35.dex */
public final class WebRtcAudioUtils {
    public static boolean isDefaultSampleRateOverridden;
    public static boolean useWebRtcBasedAcousticEchoCanceler;
    public static boolean useWebRtcBasedNoiseSuppressor;
    public static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = {"SM-G9650", "SM-G9750", "SM-N9600", "V1962A"};
    public static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    public static final String[] BLACKLISTED_NS_MODELS = new String[0];
    public static int defaultSampleRateHz = 16000;

    public static String deviceTypeToString(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "TYPE_HDMI";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "TYPE_HDMI_ARC";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "TYPE_USB_DEVICE";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "TYPE_USB_ACCESSORY";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "TYPE_TV_TUNER";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        return defaultSampleRateHz;
    }

    public static String getProductBrand() {
        return getSystemProperty("ro.product.brand");
    }

    public static String getVivoRomVersion() {
        String systemProperty = getSystemProperty("ro.vivo.os.build.display.id");
        String systemProperty2 = getSystemProperty("ro.vivo.product.version");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(systemProperty);
        sbLIZ.append("_");
        sbLIZ.append(systemProperty2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        return isDefaultSampleRateOverridden;
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        if (useWebRtcBasedAcousticEchoCanceler) {
            Logging.w("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC AEC!");
        }
        return useWebRtcBasedAcousticEchoCanceler;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        if (useWebRtcBasedNoiseSuppressor) {
            Logging.w("WebRtcAudioUtils", "Overriding default behavior; now using WebRTC NS!");
        }
        return useWebRtcBasedNoiseSuppressor;
    }

    public static String getThreadInfo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("@[name=");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(", id=");
        sbLIZ.append(C786410Ut5.u3().getId());
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    public static boolean isPermissionGranted() {
        return C838410Wul.LIZ(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0;
    }

    public static String getRomVersion(String str) {
        if (str.toLowerCase().equals("vivo")) {
            return getVivoRomVersion();
        }
        return "";
    }

    public static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    public static void logAudioState(String str) {
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(ContextUtils.getApplicationContext(), "audio");
        if (audioManager != null) {
            logAudioStateBasic(str, audioManager);
        }
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        isDefaultSampleRateOverridden = true;
        defaultSampleRateHz = i;
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        useWebRtcBasedAcousticEchoCanceler = z;
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        Logging.w("WebRtcAudioUtils", "setWebRtcBasedAutomaticGainControl() is deprecated");
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        useWebRtcBasedNoiseSuppressor = z;
    }

    public static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        String str2;
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Logging.i(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb = new StringBuilder("  ");
            sb.append(deviceTypeToString(audioDeviceInfo.getType()));
            if (audioDeviceInfo.isSource()) {
                str2 = "(in): ";
            } else {
                str2 = "(out): ";
            }
            sb.append(str2);
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb.append("channels=");
                sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb.append("encodings=");
                sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb.append("sample rates=");
                sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb.append(", ");
            }
            sb.append("id=");
            sb.append(audioDeviceInfo.getId());
            Logging.i(str, sb.toString());
        }
    }

    public static void logAudioStateBasic(String str, AudioManager audioManager) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Audio State: audio mode: ");
        sbLIZ.append(modeToString(audioManager.getMode()));
        sbLIZ.append(", has mic: ");
        sbLIZ.append(hasMicrophone());
        sbLIZ.append(", mic muted: ");
        sbLIZ.append(audioManager.isMicrophoneMute());
        sbLIZ.append(", music active: ");
        sbLIZ.append(audioManager.isMusicActive());
        sbLIZ.append(", speakerphone: ");
        sbLIZ.append(audioManager.isSpeakerphoneOn());
        sbLIZ.append(", BT SCO: ");
        sbLIZ.append(audioManager.isBluetoothScoOn());
        Logging.i(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.i(str, "Audio State: ");
        boolean zIsVolumeFixed = isVolumeFixed(audioManager);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  fixed volume=");
        sbLIZ.append(zIsVolumeFixed);
        Logging.i(str, C2188811AlT.LIZIZ(sbLIZ));
        if (!zIsVolumeFixed) {
            int i = 0;
            do {
                int i2 = iArr[i];
                StringBuilder sb = new StringBuilder();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("  ");
                sbLIZ2.append(streamTypeToString(i2));
                sbLIZ2.append(": ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                sb.append("volume=");
                sb.append(audioManager.getStreamVolume(i2));
                sb.append(", max=");
                sb.append(C786410Ut5.Z3(audioManager, i2));
                logIsStreamMute(str, audioManager, i2, sb);
                Logging.i(str, sb.toString());
                i++;
            } while (i < 6);
        }
    }

    public static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        sb.append(", muted=");
        sb.append(audioManager.isStreamMute(i));
    }
}
