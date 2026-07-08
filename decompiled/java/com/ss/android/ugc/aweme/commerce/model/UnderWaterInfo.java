package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class UnderWaterInfo implements Serializable {

    @C09CT("profile_video_under_water_status_map")
    public Map<String, String> profileVideoUnderWaterStatusMap;

    @C09CT("under_water_status")
    public String underWater;

    public final Map<String, String> getProfileVideoUnderWaterStatusMap() {
        return this.profileVideoUnderWaterStatusMap;
    }

    public final String getUnderWater() {
        return this.underWater;
    }

    public final void setProfileVideoUnderWaterStatusMap(Map<String, String> map) {
        this.profileVideoUnderWaterStatusMap = map;
    }

    public final void setUnderWater(String str) {
        this.underWater = str;
    }
}
