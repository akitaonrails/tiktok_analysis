package com.bytedance.android.livesdk.model.message.ext;

import X.AbstractC1136060ffY;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.BillboardDisplayResult;
import com.bytedance.android.livesdk.model.message.BillboardInfo;
import com.bytedance.android.livesdk.model.message.CampaignBannerDisplay;
import com.bytedance.android.livesdk.model.message.CampaignBannerDisplayResult;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.FlashSaleAtmosphereInfo;
import com.bytedance.android.livesdk.model.message.LivePermissionInfo;
import com.bytedance.android.livesdk.model.message.ProductSnapShot;
import com.bytedance.android.livesdk.model.message.PromotionInfo;
import com.bytedance.android.livesdk.model.message.RefreshLiveBagInfo;
import com.bytedance.android.livesdk.model.message.Voucher;
import java.util.List;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("anchor_pin_card_reset_type")
    public int anchorPinCardResetType;

    @C09CT("atmosphere_tag_info")
    public AtmosphereTagInfo atmosphereTagInfo;

    @C09CT("billboard_display_result")
    public BillboardDisplayResult billboardDisplayResult;

    @C09CT("billboard_info")
    public BillboardInfo billboardInfo;

    @C09CT("campaign_banner_display")
    public CampaignBannerDisplay campaignBannerDisplay;

    @C09CT("campaign_banner_display_result")
    public CampaignBannerDisplayResult campaignBannerDisplayResult;

    @C09CT("card_type")
    public int cardType;

    @C09CT("dispersion_info")
    public List<DispersionInfo> dispersionInfo;

    @C09CT("flash_sale_atmosphere_info")
    public List<FlashSaleAtmosphereInfo> flashSaleAtmosphereInfo;

    @C09CT("hot_tags")
    public List<HotTag> hotTags;

    @C09CT("live_permission_info")
    public LivePermissionInfo livePermissionInfo;

    @C09CT("live_product_number")
    public int liveProductNumber;

    @C09CT("oec_live_shopping_message_v2")
    public OecLiveShoppingMessageV2 oecLiveShoppingMessageV2;

    @C09CT("pin_card_delay_time")
    public long pinCardDelayTime;

    @C09CT("pop_product")
    public PopProduct popProduct;

    @C09CT("product_snap_shot")
    public ProductSnapShot productSnapShot;

    @C09CT("promotion_info")
    public PromotionInfo promotionInfo;

    @C09CT("refresh_live_bag_info")
    public RefreshLiveBagInfo refreshLiveBagInfo;

    @C09CT("trace_info")
    public TraceInfo traceInfo;

    @C09CT("voucher")
    public Voucher voucher;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 10000;
    }
}
