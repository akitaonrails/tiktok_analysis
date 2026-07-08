package com.bytedance.android.livesdk.livesetting.performance;

import X.C20441214yg;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.PerformanceSample;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("live_performance_sample_report_opt")
public final class PerformanceSampleSetting {
    public static final PerformanceSampleSetting INSTANCE = new PerformanceSampleSetting();
    public static int didLastNum = -1;
    public static final PerformanceSample DEFAULT = new PerformanceSample();

    public final boolean isReportGpu() {
        if (!isExperiment(false)) {
            return true;
        }
        PerformanceSample getValue = getGetValue();
        return isReport(false, getValue != null ? getValue.audienceGpuSampleRate : 10);
    }

    public final PerformanceSample getGetValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PerformanceSample performanceSample = DEFAULT;
        PerformanceSample performanceSample2 = (PerformanceSample) settingsManager.getValueSafely("live_performance_sample_report_opt", performanceSample);
        return performanceSample2 != null ? performanceSample2 : performanceSample;
    }

    public final boolean isExperiment(boolean z) {
        if (z) {
            PerformanceSample getValue = getGetValue();
            if (getValue == null) {
                return false;
            }
            return getValue.isHostExperiment;
        }
        PerformanceSample getValue2 = getGetValue();
        if (getValue2 == null) {
            return false;
        }
        return getValue2.isAudienceExperiment;
    }

    public final boolean isReportCpu(boolean z) {
        if (!isExperiment(z)) {
            return true;
        }
        int i = 10;
        if (z) {
            PerformanceSample getValue = getGetValue();
            if (getValue != null) {
                i = getValue.hostCpuSampleRate;
            }
        } else {
            PerformanceSample getValue2 = getGetValue();
            if (getValue2 != null) {
                i = getValue2.audienceCpuSampleRate;
            }
        }
        return isReport(z, i);
    }

    public final boolean isReportMem(boolean z) {
        if (!isExperiment(z)) {
            return true;
        }
        int i = 10;
        if (z) {
            PerformanceSample getValue = getGetValue();
            if (getValue != null) {
                i = getValue.hostMemSampleRate;
            }
        } else {
            PerformanceSample getValue2 = getGetValue();
            if (getValue2 != null) {
                i = getValue2.audienceMemSampleRate;
            }
        }
        return isReport(z, i);
    }

    private final boolean isReport(boolean z, int i) {
        if (!isExperiment(z)) {
            return true;
        }
        if (didLastNum < 0) {
            try {
                try {
                    String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                    if (!TextUtils.isEmpty(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                        didLastNum = Integer.parseInt(String.valueOf(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.charAt(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() - 1)));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIIIZ("PerformanceSampleSetting", e.toString());
                    if (didLastNum < 0) {
                    }
                }
                if (didLastNum < 0) {
                    didLastNum = ThreadLocalRandom.current().nextInt(0, 10);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (didLastNum < 0) {
                    didLastNum = ThreadLocalRandom.current().nextInt(0, 10);
                }
                throw th;
            }
        }
        if (didLastNum < i) {
            return true;
        }
        return false;
    }
}
