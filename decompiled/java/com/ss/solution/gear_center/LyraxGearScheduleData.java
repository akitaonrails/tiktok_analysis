package com.ss.solution.gear_center;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearScheduleData {
    public final boolean canGoLive1080p;
    public final List<LyraxGearModel> gearList;
    public final String probeUrl;
    public final int recommendLevel;
    public final String roomId;
    public final JSONObject sdkParams;

    public LyraxGearScheduleData() {
        this(false, "", "", new JSONObject(), null, -1);
    }

    public final boolean getCanGoLive1080p() {
        return this.canGoLive1080p;
    }

    public final List<LyraxGearModel> getGearList() {
        return this.gearList;
    }

    public final String getProbeUrl() {
        return this.probeUrl;
    }

    public final int getRecommendLevel() {
        return this.recommendLevel;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final JSONObject getSdkParams() {
        return this.sdkParams;
    }

    public LyraxGearScheduleData(boolean z, String str, String str2, JSONObject jSONObject, List<LyraxGearModel> list, int i) {
        this.canGoLive1080p = z;
        this.roomId = str;
        this.probeUrl = str2;
        this.sdkParams = jSONObject;
        this.gearList = list;
        this.recommendLevel = i;
    }
}
