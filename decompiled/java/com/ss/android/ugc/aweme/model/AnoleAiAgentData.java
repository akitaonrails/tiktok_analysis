package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleAiAgentData {

    @C09CT("dynamic_hints")
    public final List<ProgressHint> dynamicHints;

    @C09CT("ec_agent_schema")
    public final String ecAgentSchema;

    @C09CT("icon")
    public final String icon;

    @C09CT("layout_type")
    public final int layoutType;

    @C09CT("photo_carousel_info")
    public final PhotoCarouselInfoStruct photoCarouselInfo;

    @C09CT("long_questions")
    public final List<String> shortHints;

    @C09CT("ask_question")
    public final String textChain;

    @C09CT("title")
    public final String title;

    public AnoleAiAgentData() {
        this(1, null, null, null, null, null, null, null);
    }

    public AnoleAiAgentData(int i, String str, String str2, String str3, List<String> list, PhotoCarouselInfoStruct photoCarouselInfoStruct, List<ProgressHint> list2, String str4) {
        this.layoutType = i;
        this.title = str;
        this.icon = str2;
        this.textChain = str3;
        this.shortHints = list;
        this.photoCarouselInfo = photoCarouselInfoStruct;
        this.dynamicHints = list2;
        this.ecAgentSchema = str4;
    }
}
