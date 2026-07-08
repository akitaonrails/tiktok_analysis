package com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class NewsAnchorPublishPageConfig {
    public static final NewsAnchorPublishPageConfig LIZ = new NewsAnchorPublishPageConfig(null, null, null, null, null, null, 63, null);

    @C09CT("news_anchor_allow_domain_links")
    public List<String> allowDomains;

    @C09CT("term_link")
    public String articleTermLink;

    @C09CT("news_anchor_blocked_domains")
    public List<String> blockDomains;

    @C09CT("default_title")
    public String defaultTitle;

    @C09CT("is_new_news_anchor_permission")
    public Boolean isCustomTitle;

    @C09CT("news_anchor_title_maximum_length")
    public Integer titleMaximumLength;

    public NewsAnchorPublishPageConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public NewsAnchorPublishPageConfig(List<String> list, List<String> list2, Boolean bool, Integer num, String str, String str2) {
        this.allowDomains = list;
        this.blockDomains = list2;
        this.isCustomTitle = bool;
        this.titleMaximumLength = num;
        this.articleTermLink = str;
        this.defaultTitle = str2;
    }

    public NewsAnchorPublishPageConfig(List list, List list2, Boolean bool, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? 35 : num, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null);
    }
}
