package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CampaignBannerDisplay {

    @C09CT("billboard_version")
    public int billboardVersion;

    @C09CT("campaign_banner_is_display")
    public boolean campaignBannerIsDisplay;

    @C09CT("source_from")
    public int sourceFrom;

    @C09CT("image_url")
    public String imageUrl = "";

    @C09CT("born_time_ms")
    public String bornTimeMs = "";

    @C09CT("da_info")
    public Map<String, String> daInfo = new LinkedHashMap();
}
