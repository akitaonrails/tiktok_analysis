package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Billboard {

    @C09CT("auction_config")
    public GroupConfig auctionConfig;

    @C09CT("big_sale_config")
    public BigSaleConfig bigSaleConfig;

    @C09CT("billboard_type_int")
    public int billboardTypeInt;

    @C09CT("image_config")
    public BillboardImageConfig imageConfig;

    @C09CT("key_message_config")
    public BillboardKeyMessageConfig keyMessageConfig;

    @C09CT("product_config")
    public BillboardProductConfig productConfig;

    @C09CT("promotion_config")
    public BillboardPromotionConfig promotionConfig;

    @C09CT("size_guidance_config")
    public BillboardSizeGuidanceConfig sizeGuidanceConfig;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("support_auto_set")
    public boolean supportAutoSet;

    @C09CT("trigger_source")
    public int triggerSource;

    @C09CT("type")
    public int type;

    @C09CT("ui_type")
    public int uiType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("author_id")
    public String authorId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("c_schema")
    public String cSchema = "";
}
