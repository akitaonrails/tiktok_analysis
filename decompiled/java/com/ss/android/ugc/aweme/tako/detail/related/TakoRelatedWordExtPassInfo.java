package com.ss.android.ugc.aweme.tako.detail.related;

import X.C09CT;
import X.C13LP;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCCustomizedColors;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoBannerTraceInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoRelatedWordExtPassInfo {

    @C09CT("ai_templates")
    public final List<TakoAITemplates> aiTemplates;

    @C09CT("background_dark")
    public final String backgroundDark;

    @C09CT("background_light")
    public final String backgroundLight;

    @C09CT("comment_top_type")
    public final String commentTopType;

    @C09CT("customized_colors")
    public final AIGCCustomizedColors customizedColors;

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("qrec_json_info")
    public final String qrecJsonInfo;

    @C09CT("query")
    public final String query;

    @C09CT("recall_info")
    public final String recallInfo;

    @C09CT("search_intent")
    public final String searchIntent;

    @C09CT("tako_intent")
    public final String takoIntent;

    @C09CT("trace_info")
    public final TakoBannerTraceInfo traceInfo;

    @C09CT("word_id")
    public final String wordId;

    public TakoRelatedWordExtPassInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String LIZ() {
        TakoAITemplates takoAITemplates;
        List<TakoAITemplates> list = this.aiTemplates;
        if (list == null || (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return takoAITemplates.takoPrompt;
    }

    public final String LIZIZ() {
        TakoAITemplates takoAITemplates;
        List<TakoAITemplates> list = this.aiTemplates;
        if (list == null || (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return takoAITemplates.templateId;
    }

    public final String LIZJ() {
        TakoAITemplates takoAITemplates;
        List<TakoAITemplates> list = this.aiTemplates;
        if (list == null || (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return takoAITemplates.taskType;
    }

    public final Integer LIZLLL() {
        TakoAITemplates takoAITemplates;
        List<TakoAITemplates> list = this.aiTemplates;
        if (list == null || (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return takoAITemplates.imgCnt;
    }

    public final boolean LJ() {
        return Intrinsics.LJFF(this.commentTopType, "ai_play");
    }

    public final boolean LJFF() {
        return Intrinsics.LJFF(this.commentTopType, "ai_play_new_ui");
    }

    public final boolean LJI() {
        List<TakoAITemplates> list;
        TakoAITemplates takoAITemplates;
        Integer numLIZLLL = LIZLLL();
        return (numLIZLLL == null || numLIZLLL.intValue() <= 0 || (list = this.aiTemplates) == null || (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) == null || takoAITemplates.LIZIZ()) ? false : true;
    }

    public TakoRelatedWordExtPassInfo(String str, TakoBannerTraceInfo takoBannerTraceInfo, String str2, String str3, String str4, String str5, String str6, List<TakoAITemplates> list, String str7, String str8, String str9, AIGCCustomizedColors aIGCCustomizedColors, String str10) {
        this.query = str;
        this.traceInfo = takoBannerTraceInfo;
        this.wordId = str2;
        this.imprId = str3;
        this.recallInfo = str4;
        this.searchIntent = str5;
        this.takoIntent = str6;
        this.aiTemplates = list;
        this.commentTopType = str7;
        this.backgroundLight = str8;
        this.backgroundDark = str9;
        this.customizedColors = aIGCCustomizedColors;
        this.qrecJsonInfo = str10;
    }
}
