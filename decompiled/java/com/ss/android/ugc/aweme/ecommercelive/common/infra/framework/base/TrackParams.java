package com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.base;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class TrackParams {

    @C09CT("action_type")
    public String action_type;

    @C09CT("ad_id")
    public String ad_id;

    @C09CT("anchor_show_type")
    public String anchor_show_type;

    @C09CT("author_id")
    public String author_id;

    @C09CT("creative_id")
    public String creative_id;

    @C09CT("effect_ad_extra")
    public Map<String, String> effect_ad_extra;

    @C09CT("enter_from_info")
    public String enter_from_info;

    @C09CT("enter_from_merge")
    public String enter_from_merge;

    @C09CT("entrance_form")
    public String entrance_form;

    @C09CT("follow_status")
    public String follow_status;

    @C09CT("is_from_live_author_bag")
    public String isFromLiveAuthorBag;

    @C09CT("is_ad")
    public String is_ad;

    @C09CT("list_item_id")
    public String list_item_id;

    @C09CT("product_id")
    public String product_id;

    @C09CT("product_source")
    public String product_source;

    @C09CT("rec_content_id")
    public String rec_content_id;

    @C09CT("rec_content_type")
    public String rec_content_type;

    @C09CT("rec_session_id")
    public String rec_session_id;

    @C09CT("request_id")
    public String request_id;

    @C09CT("search_id")
    public String search_id;

    @C09CT("search_result_id")
    public String search_result_id;

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

    @C09CT("source_previous_page")
    public String source_previous_page;

    @C09CT("track_id")
    public String track_id;

    @C09CT("traffic_source_list")
    public int[] traffic_source_list;

    public TrackParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public TrackParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Map<String, String> map, String str21, String str22, int[] iArr, String str23, String str24, String str25, String str26, String str27) {
        this.anchor_show_type = str;
        this.author_id = str2;
        this.product_id = str3;
        this.enter_from_info = str4;
        this.enter_from_merge = str5;
        this.action_type = str6;
        this.product_source = str7;
        this.source_from = str8;
        this.source = str9;
        this.source_content_id = str10;
        this.follow_status = str11;
        this.source_page_type = str12;
        this.source_previous_page = str13;
        this.entrance_form = str14;
        this.is_ad = str15;
        this.rec_content_id = str16;
        this.rec_content_type = str17;
        this.request_id = str18;
        this.search_id = str19;
        this.search_result_id = str20;
        this.effect_ad_extra = map;
        this.track_id = str21;
        this.rec_session_id = str22;
        this.traffic_source_list = iArr;
        this.list_item_id = str23;
        this.creative_id = str24;
        this.ad_id = str25;
        this.sourceModule = str26;
        this.isFromLiveAuthorBag = str27;
    }
}
