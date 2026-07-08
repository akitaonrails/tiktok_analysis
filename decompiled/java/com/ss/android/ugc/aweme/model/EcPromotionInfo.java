package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class EcPromotionInfo {
    public Integer LIZ;

    @C09CT("rich_query_shop_id")
    public final String attachShopId;

    @C09CT("rich_query_user_id")
    public final String attachUserId;

    @C09CT("dark_icon")
    public final EcPromotionIcon darkIcon;

    @C09CT("icon")
    public final EcPromotionIcon icon;

    @C09CT("priority")
    public final String priority;

    @C09CT("content")
    public final EcPromotionText text;

    @C09CT("track_info")
    public final List<Map<String, String>> trackInfo;

    @C09CT("promotion_type")
    public final String type;

    public EcPromotionInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcPromotionInfo(String str, String str2, EcPromotionIcon ecPromotionIcon, EcPromotionIcon ecPromotionIcon2, EcPromotionText ecPromotionText, List<? extends Map<String, String>> list, String str3, String str4, Integer num) {
        this.type = str;
        this.priority = str2;
        this.icon = ecPromotionIcon;
        this.darkIcon = ecPromotionIcon2;
        this.text = ecPromotionText;
        this.trackInfo = list;
        this.attachUserId = str3;
        this.attachShopId = str4;
        this.LIZ = num;
    }
}
