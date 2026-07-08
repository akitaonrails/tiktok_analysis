package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import java.util.List;
import webcast.data.oec_msg.ScrollElement;

/* JADX INFO: loaded from: classes33.dex */
public final class SurpriseSetData {

    @C09CT("allow_status_click")
    public final List<Integer> allowStatusClick;

    @C09CT("auction_icon_dark")
    public final ECImage auctionIconDark;

    @C09CT("auction_icon_light")
    public final ECImage auctionIconLight;

    @C09CT("auction_label")
    public final AuctionLabel auctionLabel;

    @C09CT("auction_title")
    public final String auctionTitle;

    @C09CT("drawing_state_text_type")
    public final Integer drawingStateTextType;

    @C09CT("play_name")
    public final String playName;

    @C09CT("remaining_stock")
    public final Long remainingStock;

    @C09CT("reward_item")
    public final ScrollElement rewardItem;

    @C09CT("schema")
    public final String schema;

    @C09CT("scroll_element_list")
    public final List<ScrollElement> scrollElementList;

    @C09CT("surprise_set_id")
    public final Long surpriseSetId;

    @C09CT("top_title")
    public final String topTitle;

    @C09CT("total_stock")
    public final Long totalStock;

    @C09CT("winner_decoration_light")
    public final ECImage winnerDecoration;

    public SurpriseSetData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public SurpriseSetData(Long l, Long l2, String str, ECImage eCImage, ECImage eCImage2, String str2, String str3, List<ScrollElement> list, ScrollElement scrollElement, String str4, Integer num, Long l3, ECImage eCImage3, List<Integer> list2, AuctionLabel auctionLabel) {
        this.remainingStock = l;
        this.totalStock = l2;
        this.playName = str;
        this.auctionIconLight = eCImage;
        this.auctionIconDark = eCImage2;
        this.topTitle = str2;
        this.schema = str3;
        this.scrollElementList = list;
        this.rewardItem = scrollElement;
        this.auctionTitle = str4;
        this.drawingStateTextType = num;
        this.surpriseSetId = l3;
        this.winnerDecoration = eCImage3;
        this.allowStatusClick = list2;
        this.auctionLabel = auctionLabel;
    }
}
