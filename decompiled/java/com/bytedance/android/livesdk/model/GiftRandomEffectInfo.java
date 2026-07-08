package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftRandomEffectInfo {

    @C09CT("audience_key")
    public String audienceKey;

    @C09CT("effect_ids")
    public List<Long> effectIds;

    @C09CT("host_key")
    public String hostKey;

    @C09CT("random_gift_bubble")
    public RandomGiftBubble randomGiftBubble;

    @C09CT("random_gift_panel_banner")
    public RandomGiftPanelBanner randomGiftPanelBanner;

    public GiftRandomEffectInfo() {
        this(null, null, null, null, null);
    }

    public GiftRandomEffectInfo(List<Long> list, RandomGiftPanelBanner randomGiftPanelBanner, RandomGiftBubble randomGiftBubble, String str, String str2) {
        this.effectIds = list;
        this.randomGiftPanelBanner = randomGiftPanelBanner;
        this.randomGiftBubble = randomGiftBubble;
        this.hostKey = str;
        this.audienceKey = str2;
    }
}
