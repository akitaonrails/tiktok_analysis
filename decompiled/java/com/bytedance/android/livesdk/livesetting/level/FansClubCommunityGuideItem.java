package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCommunityGuideItem {
    public static final TypeAdapter ADAPTER = new FansClubCommunityGuideItem_OptTypeAdapter(NormalGson.singleton());

    @C09CT("display_configuration")
    public FansClubCommunityGuideDisplayConfiguration displayConfiguration;

    @C09CT("event_params")
    public Map<String, String> eventParams;

    @C09CT("guidance_type")
    public int guidanceType;

    public FansClubCommunityGuideItem() {
        this(null, null, 0);
    }

    public final FansClubCommunityGuideDisplayConfiguration getDisplayConfiguration() {
        return this.displayConfiguration;
    }

    public final Map<String, String> getEventParams() {
        return this.eventParams;
    }

    public final int getGuidanceType() {
        return this.guidanceType;
    }

    public final void setDisplayConfiguration(FansClubCommunityGuideDisplayConfiguration fansClubCommunityGuideDisplayConfiguration) {
        this.displayConfiguration = fansClubCommunityGuideDisplayConfiguration;
    }

    public final void setEventParams(Map<String, String> map) {
        this.eventParams = map;
    }

    public final void setGuidanceType(int i) {
        this.guidanceType = i;
    }

    public FansClubCommunityGuideItem(FansClubCommunityGuideDisplayConfiguration fansClubCommunityGuideDisplayConfiguration, Map<String, String> map, int i) {
        this.displayConfiguration = fansClubCommunityGuideDisplayConfiguration;
        this.eventParams = map;
        this.guidanceType = i;
    }
}
