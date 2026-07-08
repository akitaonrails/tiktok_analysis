package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchFeedVideoGuideRequestParams {

    @C09CT("author_uid")
    public final String authorUid;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("bcm_chain")
    public final String bcmChain;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("diversion_type")
    public final Integer diversionType;

    @C09CT("ecom_user_actions")
    public final String ecomUserActions;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("history_search_word_list")
    public final List<String> historySearchWordList;

    @C09CT("new_style")
    public final Integer newStyle;

    @C09CT("pdp_diversion_schema")
    public final String pdpDiversionSchema;

    @C09CT("product_id")
    public final String productId;

    @C09CT("rec_score_info")
    public final String recScoreInfo;

    @C09CT("search_after_watch_words")
    public final List<EcSearchFeedVideoGuideAfterWatchWord> searchAfterWatchWords;

    @C09CT("sharer_did")
    public final String sharerDid;

    @C09CT("sharer_uid")
    public final String sharerUid;

    @C09CT("shop_tab_position")
    public final Integer shopTabPosition;

    @C09CT("show_srp_sharer_info")
    public final Integer showSrpSharerInfo;

    @C09CT("source_material_intent")
    public final List<Integer> sourceMaterialIntent;

    @C09CT("srp_style")
    public final Integer srpStyle;

    @C09CT("video_play_duration")
    public final String videoPlayDuration;

    @C09CT("video_play_progress")
    public final String videoPlayProgress;

    public EcSearchFeedVideoGuideRequestParams() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, 0, 0, null, null, null, null);
    }

    public EcSearchFeedVideoGuideRequestParams(Integer num, String str, String str2, Integer num2, List<Integer> list, String str3, List<String> list2, List<EcSearchFeedVideoGuideAfterWatchWord> list3, String str4, Integer num3, String str5, String str6, String str7, String str8, String str9, Integer num4, Integer num5, String str10, String str11, String str12, String str13) {
        this.diversionType = num;
        this.awemeId = str;
        this.authorUid = str2;
        this.shopTabPosition = num2;
        this.sourceMaterialIntent = list;
        this.ecomUserActions = str3;
        this.historySearchWordList = list2;
        this.searchAfterWatchWords = list3;
        this.bcmChain = str4;
        this.newStyle = num3;
        this.recScoreInfo = str5;
        this.videoPlayDuration = str6;
        this.videoPlayProgress = str7;
        this.enterFrom = str8;
        this.productId = str9;
        this.srpStyle = num4;
        this.showSrpSharerInfo = num5;
        this.sharerUid = str10;
        this.sharerDid = str11;
        this.chainKey = str12;
        this.pdpDiversionSchema = str13;
    }
}
