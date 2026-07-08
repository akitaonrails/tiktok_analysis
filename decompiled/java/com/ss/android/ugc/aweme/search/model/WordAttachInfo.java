package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class WordAttachInfo {

    @C09CT("attach_image")
    public final List<AttachImage> attachImage;

    @C09CT("attach_pid")
    public final String attachPid;

    @C09CT("is_live")
    public final Boolean isLive;

    @C09CT("penetrate_info")
    public final String penetrateInfo;

    @C09CT("promotion_icon_attach_product_ids")
    public final List<String> promotionIconAttachProductIds;

    @C09CT("rich_creator_id")
    public final String richCreatorId;

    @C09CT("rich_shop_id")
    public final String richShopId;

    public WordAttachInfo(List<AttachImage> list, String str, String str2, String str3, String str4, Boolean bool, List<String> list2) {
        this.attachImage = list;
        this.richCreatorId = str;
        this.richShopId = str2;
        this.attachPid = str3;
        this.penetrateInfo = str4;
        this.isLive = bool;
        this.promotionIconAttachProductIds = list2;
    }
}
