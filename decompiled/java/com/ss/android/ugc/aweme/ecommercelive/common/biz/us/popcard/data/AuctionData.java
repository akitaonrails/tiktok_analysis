package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ComponentData;
import java.util.Map;
import webcast.data.oec_msg.CarouselCfg;
import webcast.data.oec_msg.ExtendAuctionCfg;

/* JADX INFO: loaded from: classes33.dex */
public final class AuctionData {

    @C09CT("atmosphere")
    public final AuctionAtmosphere atmosphere;

    @C09CT("auction_config_id")
    public final Long auctionConfigId;

    @C09CT("auction_da_info")
    public final Map<String, Object> auctionDaInfo;

    @C09CT("auction_id")
    public final Long auctionId;

    @C09CT("auction_status")
    public final int auctionStatus;

    @C09CT("auction_text")
    public final Map<String, AuctionText> auctionStatusText;

    @C09CT("auction_text_type")
    public int auctionTextType;

    @C09CT("auction_title")
    public final String auctionTitle;

    @C09CT("auction_type")
    public final int auctionType;

    @C09CT("bid_btn_text")
    public final String bidBtnText;

    @C09CT("bid_finished_text")
    public final String bidFinishedText;

    @C09CT("bid_panel")
    public final BidPanel bidPanel;

    @C09CT("bid_price_version")
    public final Long bidPriceVersion;

    @C09CT("bidder_info")
    public final AuctionUserInfo bidderInfo;

    @C09CT("carousel_cfg")
    public final CarouselCfg carouselCfg;

    @C09CT("component_data")
    public final ComponentData componentData;

    @C09CT("bid_price")
    public final SinglePriceItem currentBidPrice;

    @C09CT("customize_bid_price")
    public final SinglePriceItem customizeBidPrice;

    @C09CT("customize_bid_price_prefix")
    public final String customizeBidPricePrefix;

    @C09CT("customize_panel")
    public final CustomizePanel customizePanel;

    @C09CT("auction_end_time")
    public Long endTime;

    @C09CT("extend_auction_cfg")
    public final ExtendAuctionCfg extendAuctionCfg;

    @C09CT("is_carousel")
    public final boolean isCarousel;

    @C09CT("is_customize_bid_price")
    public final boolean isCustomizeBidPrice;

    @C09CT("next_bid_price")
    public final SinglePriceItem nextBidPrice;

    @C09CT("pincard_display_double_btns")
    public final boolean pincardDisplayDoubleBtns;

    @C09CT("regular_auction_data")
    public final RegularAuctionData regularAuctionData;

    @C09CT("schema")
    public final String schema;

    @C09CT("start_bid_price")
    public final SinglePriceItem startBidPrice;

    @C09CT("status_retry_cfg_map")
    public final Map<String, StatusRetryCfg> statusRetryCfg;

    @C09CT("surprise_set_data")
    public final SurpriseSetData surpriseSetData;

    public AuctionData() {
        this(null, null, null, null, false, null, null, null, null, null, 0, null, null, null, 0, false, null, null, null, 0L, null, null, null, null, null, 0, null, null, null, null, false);
    }

    public AuctionData(Long l, AuctionAtmosphere auctionAtmosphere, Long l2, AuctionUserInfo auctionUserInfo, boolean z, SinglePriceItem singlePriceItem, String str, SinglePriceItem singlePriceItem2, SinglePriceItem singlePriceItem3, SinglePriceItem singlePriceItem4, int i, BidPanel bidPanel, CustomizePanel customizePanel, Map<String, AuctionText> map, int i2, boolean z2, CarouselCfg carouselCfg, String str2, String str3, Long l3, ExtendAuctionCfg extendAuctionCfg, SurpriseSetData surpriseSetData, RegularAuctionData regularAuctionData, String str4, Map<String, StatusRetryCfg> map2, int i3, Long l4, Map<String, ? extends Object> map3, String str5, ComponentData componentData, boolean z3) {
        this.auctionId = l;
        this.atmosphere = auctionAtmosphere;
        this.endTime = l2;
        this.bidderInfo = auctionUserInfo;
        this.isCustomizeBidPrice = z;
        this.customizeBidPrice = singlePriceItem;
        this.customizeBidPricePrefix = str;
        this.currentBidPrice = singlePriceItem2;
        this.startBidPrice = singlePriceItem3;
        this.nextBidPrice = singlePriceItem4;
        this.auctionStatus = i;
        this.bidPanel = bidPanel;
        this.customizePanel = customizePanel;
        this.auctionStatusText = map;
        this.auctionTextType = i2;
        this.isCarousel = z2;
        this.carouselCfg = carouselCfg;
        this.bidFinishedText = str2;
        this.bidBtnText = str3;
        this.bidPriceVersion = l3;
        this.extendAuctionCfg = extendAuctionCfg;
        this.surpriseSetData = surpriseSetData;
        this.regularAuctionData = regularAuctionData;
        this.auctionTitle = str4;
        this.statusRetryCfg = map2;
        this.auctionType = i3;
        this.auctionConfigId = l4;
        this.auctionDaInfo = map3;
        this.schema = str5;
        this.componentData = componentData;
        this.pincardDisplayDoubleBtns = z3;
    }
}
