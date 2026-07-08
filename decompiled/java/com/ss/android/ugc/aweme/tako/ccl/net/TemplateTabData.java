package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateTabData {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("en_name")
    public final String tabEnName;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String tabId;

    @C09CT("name")
    public final String tabName;

    @C09CT("tab_type")
    public final Integer tabType;

    @C09CT("templates")
    public final List<CreativeTemplate> templates;

    @C09CT("top_templates")
    public final List<CreativeTemplate> topTemplates;

    @C09CT("top_title")
    public final String topTitle;

    @C09CT(alternate = {"trend_title"}, value = "trending_title")
    public final String trendingTitle;

    public TemplateTabData() {
        this(null, null, null, null, false, null, null, null, null, 511, null);
    }

    public TemplateTabData(String str, String str2, String str3, List<CreativeTemplate> list, boolean z, Integer num, List<CreativeTemplate> list2, String str4, String str5) {
        this.tabId = str;
        this.tabName = str2;
        this.tabEnName = str3;
        this.templates = list;
        this.hasMore = z;
        this.tabType = num;
        this.topTemplates = list2;
        this.topTitle = str4;
        this.trendingTitle = str5;
    }

    public TemplateTabData(String str, String str2, String str3, List list, boolean z, Integer num, List list2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : num, (i & 64) != 0 ? C13BV.INSTANCE : list2, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
