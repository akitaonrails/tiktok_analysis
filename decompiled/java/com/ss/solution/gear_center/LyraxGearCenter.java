package com.ss.solution.gear_center;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public interface LyraxGearCenter {

    public static final class DefaultImpls {
    }

    void dispose();

    LyraxGearStrategyResult getGearStrategyResult(LyraxGearStrategyOption lyraxGearStrategyOption);

    JSONObject getMonitorMetrics();

    JSONObject getTraceMetrics();

    List<LyraxGearModel> getValidGearList();

    void setCustomFeatures(Map<String, ? extends Object> map);

    void setListener(LyraxGearCenterListener lyraxGearCenterListener);

    void setManualLevel(int i, LyraxManualLevelSource lyraxManualLevelSource);

    void setPerfData(LyraxGearPerfData lyraxGearPerfData);

    void setScheduleData(LyraxGearScheduleData lyraxGearScheduleData, boolean z);

    void startProbe(LyraxStartProbeOption lyraxStartProbeOption);

    void stopProbe(LyraxStopProbeOption lyraxStopProbeOption);
}
