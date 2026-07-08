package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCommunityGuideConfig {
    public static final TypeAdapter ADAPTER = new FansClubCommunityGuideConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_community_guidance")
    public List<FansClubCommunityGuideItem> liveCommunityGuidance;

    public FansClubCommunityGuideConfig() {
        this(new ArrayList());
    }

    public final List<FansClubCommunityGuideItem> getLiveCommunityGuidance() {
        return this.liveCommunityGuidance;
    }

    public FansClubCommunityGuideConfig(List<FansClubCommunityGuideItem> list) {
        this.liveCommunityGuidance = list;
    }

    public final void setLiveCommunityGuidance(List<FansClubCommunityGuideItem> list) {
        this.liveCommunityGuidance = list;
    }
}
