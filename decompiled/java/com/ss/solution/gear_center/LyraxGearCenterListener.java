package com.ss.solution.gear_center;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public interface LyraxGearCenterListener {
    void onGearStrategyResult(LyraxGearStrategyResult lyraxGearStrategyResult);

    void onProbeError(LyraxProbeErrorCode lyraxProbeErrorCode);

    void onProbeProgress(LyraxNetProbeProgress lyraxNetProbeProgress);

    void onProbeResult(LyraxNetProbeResult lyraxNetProbeResult);

    void onReportEvent(String str, JSONObject jSONObject);
}
