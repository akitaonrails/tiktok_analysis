package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoFullScreenDisclaimerTextModel {

    @C09CT("confirm_query")
    public final String confirmQuery;

    @C09CT("confirm_title")
    public final String confirmTitle;

    @C09CT("recommend_query")
    public final List<Map<String, String>> queryList;

    @C09CT("title")
    public final String title;

    @C09CT("top_banner_desc")
    public final String topBannerDesc;

    @C09CT("top_banner_learn_more")
    public final String topBannerLearnMore;

    @C09CT("top_banner_title")
    public final String topBannerTitle;

    public TakoFullScreenDisclaimerTextModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakoFullScreenDisclaimerTextModel(String str, String str2, String str3, List<? extends Map<String, String>> list, String str4, String str5, String str6) {
        this.confirmTitle = str;
        this.confirmQuery = str2;
        this.title = str3;
        this.queryList = list;
        this.topBannerTitle = str4;
        this.topBannerDesc = str5;
        this.topBannerLearnMore = str6;
    }

    public TakoFullScreenDisclaimerTextModel(String str, String str2, String str3, List list, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null);
    }
}
