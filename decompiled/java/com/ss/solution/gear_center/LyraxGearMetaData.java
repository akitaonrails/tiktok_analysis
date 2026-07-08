package com.ss.solution.gear_center;

import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearMetaData {
    public final int gearCenterVersion;
    public final LyraxProbeEngineType probeEngine;
    public final int probeMaxLevel;
    public final int probeMinLevel;
    public final int recommendLevel;
    public final JSONArray resolutionBase;
    public final List<LyraxGearModel> validGearList;

    public LyraxGearMetaData() {
        this(-1, -1, -1, -1, null, null, LyraxProbeEngineType.Default);
    }

    public final int getGearCenterVersion() {
        return this.gearCenterVersion;
    }

    public final LyraxProbeEngineType getProbeEngine() {
        return this.probeEngine;
    }

    public final int getProbeMaxLevel() {
        return this.probeMaxLevel;
    }

    public final int getProbeMinLevel() {
        return this.probeMinLevel;
    }

    public final int getRecommendLevel() {
        return this.recommendLevel;
    }

    public final JSONArray getResolutionBase() {
        return this.resolutionBase;
    }

    public final List<LyraxGearModel> getValidGearList() {
        return this.validGearList;
    }

    public LyraxGearMetaData(int i, int i2, int i3, int i4, List<LyraxGearModel> list, JSONArray jSONArray, LyraxProbeEngineType lyraxProbeEngineType) {
        this.gearCenterVersion = i;
        this.probeMaxLevel = i2;
        this.probeMinLevel = i3;
        this.recommendLevel = i4;
        this.validGearList = list;
        this.resolutionBase = jSONArray;
        this.probeEngine = lyraxProbeEngineType;
    }
}
