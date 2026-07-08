package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class OrderAttribute implements Serializable {

    @C09CT("activity_page_id")
    public final String activityPageId;

    @C09CT("activity_source")
    public final String activitySource;

    @C09CT("click_id")
    public final String adClickId;

    @C09CT("bcm_chain")
    public final String bcmChain;

    @C09CT("card_type")
    public final String cardType;

    @C09CT("initial_poi_enter_from")
    public final String initialPoiEnterFrom;

    @C09CT("initial_poi_enter_method")
    public final String initialPoiEnterMethod;

    @C09CT("initial_poi_from_group_id")
    public final String initialPoiFromGroupId;

    @C09CT("initial_poi_id")
    public final String initialPoiId;

    @C09CT("one_click_booking_type_able")
    public final String oneClickBookingTypeAble;

    @C09CT("one_click_booking_type_actual")
    public final String oneClickBookingTypeActual;

    @C09CT("order_submit_enter_from")
    public final String orderSubmitEnterFrom;

    @C09CT("order_submit_enter_method")
    public final String orderSubmitEnterMethod;

    @C09CT("pdp_enter_from")
    public final String pdpEnterFrom;

    @C09CT("pdp_enter_method")
    public final String pdpEnterMethod;

    @C09CT("poi_detail_enter_from")
    public final String poiDetailEnterFrom;

    @C09CT("poi_detail_enter_method")
    public final String poiDetailEnterMethod;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("poi_session_id")
    public final String poiSessionId;

    @C09CT("promote_id")
    public final String promoteId;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("search_result_id")
    public final String searchResultId;

    @C09CT("sub_card_type")
    public final String subCardType;

    @C09CT("ttls_anchor_product_cnt")
    public final String ttlsAnchorProductCnt;

    @C09CT("ttls_anchor_type")
    public final String ttlsAnchorType;

    @C09CT("ttls_card_log_id")
    public final String ttlsCardLogId;

    public OrderAttribute() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public OrderAttribute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27) {
        this.bcmChain = str;
        this.initialPoiEnterFrom = str2;
        this.initialPoiEnterMethod = str3;
        this.initialPoiFromGroupId = str4;
        this.initialPoiId = str5;
        this.poiId = str6;
        this.poiDetailEnterFrom = str7;
        this.poiDetailEnterMethod = str8;
        this.pdpEnterFrom = str9;
        this.pdpEnterMethod = str10;
        this.orderSubmitEnterFrom = str11;
        this.orderSubmitEnterMethod = str12;
        this.searchId = str13;
        this.searchResultId = str14;
        this.activitySource = str15;
        this.activityPageId = str16;
        this.requestId = str17;
        this.adClickId = str18;
        this.ttlsCardLogId = str19;
        this.promoteId = str20;
        this.ttlsAnchorType = str21;
        this.ttlsAnchorProductCnt = str22;
        this.cardType = str23;
        this.subCardType = str24;
        this.poiSessionId = str25;
        this.oneClickBookingTypeAble = str26;
        this.oneClickBookingTypeActual = str27;
    }
}
