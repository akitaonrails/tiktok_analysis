package com.bytedance.android.livesdk.comp.api.subscription.setting;

import X.C098200Yq;
import X.C189200o6;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_view_perf_report_sample_config")
public final class LiveSubViewPerfReportSampleConfigSetting {
    public static final LiveSubViewPerfReportSampleConfigSetting INSTANCE = new LiveSubViewPerfReportSampleConfigSetting();
    public static final Map<String, Float> DEFAULT = C2097608Jq.LJ();

    private final Map<String, Float> getValue() {
        Object c098200Yq;
        try {
            c098200Yq = (Map) SettingsManager.INSTANCE.getValueSafely("live_sub_view_perf_report_sample_config", DEFAULT);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Map<String, Float> map = DEFAULT;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = map;
        }
        return (Map) c098200Yq;
    }

    public final float sampleFloatRate(String str) {
        Float f;
        Map<String, Float> value = getValue();
        if (value != null && (f = value.get(str)) != null) {
            return f.floatValue();
        }
        return 1.0f;
    }
}
