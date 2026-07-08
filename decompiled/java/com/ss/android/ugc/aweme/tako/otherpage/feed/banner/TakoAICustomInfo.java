package com.ss.android.ugc.aweme.tako.otherpage.feed.banner;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoAICustomInfo {

    @C09CT("ai_templates")
    public final List<TakoAITemplates> aiTemplates;

    @C09CT("feedbar_type")
    public final String feedbarType;

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("word")
    public final String wordContent;

    public TakoAICustomInfo() {
        this(null, null, null, null);
    }

    public TakoAICustomInfo(List<TakoAITemplates> list, String str, String str2, String str3) {
        this.aiTemplates = list;
        this.feedbarType = str;
        this.imprId = str2;
        this.wordContent = str3;
    }
}
