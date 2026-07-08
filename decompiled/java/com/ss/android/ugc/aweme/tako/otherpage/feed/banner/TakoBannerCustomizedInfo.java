package com.ss.android.ugc.aweme.tako.otherpage.feed.banner;

import X.C09CT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCCustomizedColors;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoBannerCustomizedInfo {

    @C09CT("ai_templates")
    public final List<TakoAITemplates> aiTemplates;

    @C09CT("background_dark")
    public final String backgroundDark;

    @C09CT("background_light")
    public final String backgroundLight;

    @C09CT("bot_info")
    public final TakoBotInfo botInfo;

    @C09CT("customized_colors")
    public final AIGCCustomizedColors customizedColors;

    @C09CT("feedbar_type")
    public final String feedbarType;

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("qrec_json_info")
    public final String qrecJsonInfo;

    @C09CT("query")
    public final String query;

    @C09CT("recall_info")
    public final String recallInfo;

    @C09CT("rec_reason_type")
    public final String recommendType;

    @C09CT("search_intent")
    public final String searchIntent;

    @C09CT("tako_intent")
    public final String takoIntent;

    @C09CT("trace_info")
    public final TakoBannerTraceInfo traceInfo;

    @C09CT("word")
    public final String word;

    @C09CT("word_hint")
    public final String wordHint;

    @C09CT("word_id")
    public final String wordId;

    public TakoBannerCustomizedInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public TakoBannerCustomizedInfo(String str, TakoBannerTraceInfo takoBannerTraceInfo, String str2, String str3, TakoBotInfo takoBotInfo, String str4, String str5, String str6, String str7, String str8, String str9, List<TakoAITemplates> list, String str10, String str11, AIGCCustomizedColors aIGCCustomizedColors, String str12, String str13) {
        this.query = str;
        this.traceInfo = takoBannerTraceInfo;
        this.wordId = str2;
        this.imprId = str3;
        this.botInfo = takoBotInfo;
        this.feedbarType = str4;
        this.wordHint = str5;
        this.word = str6;
        this.recallInfo = str7;
        this.searchIntent = str8;
        this.takoIntent = str9;
        this.aiTemplates = list;
        this.backgroundLight = str10;
        this.backgroundDark = str11;
        this.customizedColors = aIGCCustomizedColors;
        this.recommendType = str12;
        this.qrecJsonInfo = str13;
    }
}
