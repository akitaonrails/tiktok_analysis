package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class TrackParams {

    @C09CT("action_type")
    public String action_type;

    @C09CT("ad_id")
    public String ad_id;

    @C09CT("anchor_anim_type")
    public Integer anchor_anim_type;

    @C09CT("anchor_show_type")
    public String anchor_show_type;

    @C09CT("author_id")
    public String author_id;

    @C09CT("aweme_type")
    public Integer awemeType;

    @C09CT("cart_item_id")
    public String cartItemId;

    @C09CT("creative_id")
    public String creativeId;

    @C09CT("enter_click_area")
    public String enterClickArea;

    @C09CT("enter_from")
    public String enter_from;

    @C09CT("enter_from_info")
    public String enter_from_info;

    @C09CT("entrance_form")
    public String entrance_form;

    @C09CT("follow_status")
    public String follow_status;

    @C09CT("from_ec_ug")
    public String fromEcUg;

    @C09CT("inner_search_id")
    public String inner_search_id;

    @C09CT("is_indirectly_pdp")
    public String isIndirectlyPdp;

    @C09CT("is_ad")
    public Integer is_ad;

    @C09CT("is_inner")
    public String is_inner;

    @C09CT("is_self")
    public Integer is_self;

    @C09CT("is_single_anchor")
    public String is_single_anchor;

    @C09CT("list_item_id")
    public String list_item_id;

    @C09CT("pic_cnt")
    public Integer picCnt;

    @C09CT("previous_page")
    public String previous_page;

    @C09CT("product_id")
    public String product_id;

    @C09CT("product_source")
    public String product_source;

    @C09CT("rank_inner")
    public String rank_inner;

    @C09CT("rec_session_id")
    public String rec_session_id;

    @C09CT("request_id")
    public String request_id;

    @C09CT("search_entrance")
    public String search_entrance;

    @C09CT("source")
    public String source;

    @C09CT("source_module")
    public String sourceModule;

    @C09CT("source_content_id")
    public String source_content_id;

    @C09CT("source_from")
    public String source_from;

    @C09CT("source_page_type")
    public String source_page_type;

    @C09CT("track_id")
    public String track_id;

    @C09CT("traffic_source_list")
    public int[] traffic_source_list;

    @C09CT("video_shopping_list_style")
    public Integer videoShoppingListStyle;

    public TrackParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public TrackParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, Integer num2, String str15, Integer num3, String str16, String str17, String str18, int[] iArr, String str19, String str20, String str21, String str22, Integer num4, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Integer num5, Integer num6) {
        this.track_id = str;
        this.anchor_show_type = str2;
        this.author_id = str3;
        this.enter_from_info = str4;
        this.product_id = str5;
        this.product_source = str6;
        this.source_content_id = str7;
        this.source_from = str8;
        this.source = str9;
        this.follow_status = str10;
        this.entrance_form = str11;
        this.source_page_type = str12;
        this.request_id = str13;
        this.is_self = num;
        this.is_single_anchor = str14;
        this.is_ad = num2;
        this.ad_id = str15;
        this.anchor_anim_type = num3;
        this.previous_page = str16;
        this.enter_from = str17;
        this.rec_session_id = str18;
        this.traffic_source_list = iArr;
        this.search_entrance = str19;
        this.list_item_id = str20;
        this.creativeId = str21;
        this.sourceModule = str22;
        this.videoShoppingListStyle = num4;
        this.cartItemId = str23;
        this.action_type = str24;
        this.fromEcUg = str25;
        this.isIndirectlyPdp = str26;
        this.enterClickArea = str27;
        this.is_inner = str28;
        this.inner_search_id = str29;
        this.rank_inner = str30;
        this.awemeType = num5;
        this.picCnt = num6;
    }
}
