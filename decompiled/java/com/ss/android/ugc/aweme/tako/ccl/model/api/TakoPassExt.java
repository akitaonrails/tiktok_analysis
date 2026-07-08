package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C12824050c;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoPassExt {

    @C09CT("answer_status")
    public final int answerStatus;

    @C09CT("auto_send_message_type")
    public final String autoSendMessageType;

    @C09CT("content_extra")
    public final String contentExtra;

    @C09CT("id_list")
    public final String idList;

    @C09CT("inline_content")
    public final String inlineContent;

    @C09CT("interaction_type")
    public final int interactionType;

    @C09CT("is_big_video")
    public final int isBigVideo;

    @C09CT("is_quote_product")
    public final int isQuoteProduct;

    @C09CT("is_quote_video")
    public final int isQuoteVideo;

    @C09CT("message_type")
    public final String messageType;

    @C09CT("perf_extra")
    public final String perfExtra;

    @C09CT("plugin_type")
    public String pluginType;

    @C09CT("push_source")
    public final String pushSource;

    @C09CT("strategy_info")
    public final String strategyInfo;

    @C09CT("tako_out_search_id")
    public final String takoOutSearchId;

    @C09CT("tns_intercept")
    public final int tnsIntercept;

    @C09CT("user_intent")
    public final String userIntent;

    public TakoPassExt() {
        this(0, null, 0, "", "", C12824050c.LIZ(), 0, "", 0, "", 0, "", null, null, 0, null, "");
    }

    public TakoPassExt(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, int i4, String str6, int i5, String str7, String str8, String str9, int i6, String str10, String str11) {
        this.answerStatus = i;
        this.contentExtra = str;
        this.tnsIntercept = i2;
        this.pluginType = str2;
        this.messageType = str3;
        this.idList = str4;
        this.isQuoteVideo = i3;
        this.takoOutSearchId = str5;
        this.isBigVideo = i4;
        this.autoSendMessageType = str6;
        this.isQuoteProduct = i5;
        this.pushSource = str7;
        this.perfExtra = str8;
        this.userIntent = str9;
        this.interactionType = i6;
        this.inlineContent = str10;
        this.strategyInfo = str11;
    }
}
