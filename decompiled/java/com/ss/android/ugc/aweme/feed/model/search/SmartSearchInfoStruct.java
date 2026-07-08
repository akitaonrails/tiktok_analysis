package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SmartSearchInfoStruct implements Serializable {

    @C09CT("ai_overview_intent_type")
    public Integer aiOverviewIntentType;

    @C09CT("ask_tako_intent_type")
    public Integer askTakoIntentType;

    @C09CT("find_similar_intent_type")
    public Integer findSimilarIntentType;

    @C09CT("related_videos_intent_type")
    public Integer relatedVideosIntentType;

    @C09CT("title_smart_search_panel_type")
    public Integer titleSmartSearchPanelType;

    public SmartSearchInfoStruct() {
        this(0, 0, 0, 0, 0);
    }

    public SmartSearchInfoStruct(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.titleSmartSearchPanelType = num;
        this.findSimilarIntentType = num2;
        this.askTakoIntentType = num3;
        this.relatedVideosIntentType = num4;
        this.aiOverviewIntentType = num5;
    }
}
