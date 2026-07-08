package com.bytedance.android.livesdk.livesetting.other;

import X.C1161920gLG;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.MonitorSampleData;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_slardar_monitor_sample_opt")
public final class LiveMonitorSampleSetting {
    public static IHostConfig hostService;
    public static Boolean isOffline;
    public static final LiveMonitorSampleSetting INSTANCE = new LiveMonitorSampleSetting();
    public static double randomSampleVale = -1.0d;
    public static final MonitorSampleData DEFAULT = new MonitorSampleData();
    public static final int $stable = 8;

    public final void release() {
    }

    private final IHostConfig getHostService() {
        IHostConfig iHostConfig = hostService;
        if (iHostConfig != null) {
            return iHostConfig;
        }
        IHostConfig iHostConfig2 = (IHostConfig) C1161920gLG.LIZJ(IHostConfig.class);
        hostService = iHostConfig2;
        return iHostConfig2;
    }

    private final MonitorSampleData getSampleData() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MonitorSampleData monitorSampleData = DEFAULT;
        MonitorSampleData monitorSampleData2 = (MonitorSampleData) settingsManager.getValueSafely("live_slardar_monitor_sample_opt", monitorSampleData);
        return monitorSampleData2 != null ? monitorSampleData2 : monitorSampleData;
    }

    private final boolean isOffline() {
        Boolean boolValueOf = isOffline;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline());
            isOffline = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    private final boolean isSlardarExperiment() {
        MonitorSampleData sampleData = getSampleData();
        if (sampleData != null) {
            return sampleData.isSlardarBeforeExperiment;
        }
        return false;
    }

    public final boolean isDolphinExperiment() {
        MonitorSampleData sampleData = getSampleData();
        if (sampleData != null) {
            return sampleData.isDolphinExperiment;
        }
        return false;
    }

    private final boolean isSlardarReport(String str) {
        Set<String> setSa2;
        if (!TextUtils.isEmpty(str) && isSlardarExperiment()) {
            IHostConfig hostService2 = getHostService();
            if (hostService2 != null && (setSa2 = hostService2.Sa2()) != null) {
                return setSa2.contains(str);
            }
            return false;
        }
        return true;
    }

    public final boolean isReportSlardar(String str) {
        if (!TextUtils.isEmpty(str) && !isOffline()) {
            return isSlardarReport(str);
        }
        return true;
    }

    public final boolean isReportDolphin(String str, double d) {
        Map<String, Double> map;
        Double d2;
        if (TextUtils.isEmpty(str) || isOffline() || !isDolphinExperiment()) {
            return true;
        }
        if (randomSampleVale < 0.0d) {
            randomSampleVale = ThreadLocalRandom.current().nextDouble();
        }
        MonitorSampleData sampleData = getSampleData();
        if (sampleData != null && (map = sampleData.sampleList) != null && (d2 = map.get(str)) != null) {
            d = d2.doubleValue();
        }
        if (randomSampleVale < d && isSlardarReport(str)) {
            return true;
        }
        return false;
    }
}
