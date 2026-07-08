package com.ss.bytertc.audio.device.webrtc;

import X.C2188811AlT;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes35.dex */
public class WebRtcAudioEffects {
    public static AudioEffect.Descriptor[] cachedEffects;
    public AcousticEchoCanceler aec;
    public NoiseSuppressor ns;
    public boolean shouldEnableAec;
    public boolean shouldEnableNs;
    public static Map<String, List<String>> audioEffectBlackList = new HashMap();
    public static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    public static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = (!isAcousticEchoCancelerEffectAvailable() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted()) ? false : true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canUseAcousticEchoCanceler: ");
        sbLIZ.append(z);
        Logging.i("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = (!isNoiseSuppressorEffectAvailable() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted()) ? false : true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canUseNoiseSuppressor: ");
        sbLIZ.append(z);
        Logging.i("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static boolean IsAudioEffectSupported() {
        if (audioEffectBlackList.isEmpty()) {
            initAudioEffectBlackList();
        }
        String productBrand = WebRtcAudioUtils.getProductBrand();
        if (productBrand.isEmpty() || !audioEffectBlackList.containsKey(productBrand)) {
            return true;
        }
        String romVersion = WebRtcAudioUtils.getRomVersion(productBrand);
        boolean zContains = audioEffectBlackList.get(productBrand).contains(romVersion);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IsAudioEffectSupported, ");
        sbLIZ.append(productBrand);
        sbLIZ.append(", ");
        sbLIZ.append(romVersion);
        sbLIZ.append(", in black list = ");
        sbLIZ.append(zContains);
        Logging.w("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
        return !zContains;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    public static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        try {
            AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
            cachedEffects = descriptorArrQueryEffects;
            return descriptorArrQueryEffects;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return cachedEffects;
        }
    }

    public static void initAudioEffectBlackList() {
        audioEffectBlackList.put("vivo", new ArrayList());
        audioEffectBlackList.get("vivo").add("Funtouch OS_3.1_PD1616_D_7.17.5");
    }

    public static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    public static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    public void release() {
        Logging.i("WebRtcAudioEffects", "release");
        try {
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
                this.aec = null;
            }
            NoiseSuppressor noiseSuppressor = this.ns;
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
                this.ns = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.aec = null;
            this.ns = null;
        }
    }

    public WebRtcAudioEffects() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ctor");
        sbLIZ.append(WebRtcAudioUtils.getThreadInfo());
        Logging.i("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForAecUsage.contains(str);
        if (zContains) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is blacklisted for HW AEC usage!");
            Logging.w("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zContains;
    }

    public static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean zContains = blackListedModelsForNsUsage.contains(str);
        if (zContains) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is blacklisted for HW NS usage!");
            Logging.w("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zContains;
    }

    public static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public static void assertTrue(boolean z) {
        if (z) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (!AudioEffect.EFFECT_TYPE_AEC.equals(uuid) || !isAcousticEchoCancelerEffectAvailable()) {
            if (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorEffectAvailable()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable(int r14) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.audio.device.webrtc.WebRtcAudioEffects.enable(int):void");
    }

    public boolean setAEC(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAEC(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        Logging.i("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
        if (!canUseAcousticEchoCanceler()) {
            Logging.w("WebRtcAudioEffects", "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec != null && z != this.shouldEnableAec) {
            Logging.e("WebRtcAudioEffects", "Platform AEC state can't be modified while recording");
            return false;
        }
        this.shouldEnableAec = z;
        return true;
    }

    public boolean setNS(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNS(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        Logging.i("WebRtcAudioEffects", C2188811AlT.LIZIZ(sbLIZ));
        if (!canUseNoiseSuppressor()) {
            Logging.w("WebRtcAudioEffects", "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns != null && z != this.shouldEnableNs) {
            Logging.e("WebRtcAudioEffects", "Platform NS state can't be modified while recording");
            return false;
        }
        this.shouldEnableNs = z;
        return true;
    }
}
