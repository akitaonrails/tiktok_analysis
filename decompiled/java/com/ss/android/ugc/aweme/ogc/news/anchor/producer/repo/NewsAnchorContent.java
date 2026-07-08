package com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class NewsAnchorContent {

    @C09CT("news_anchor_allow_domain_links")
    public List<String> allowDomainLinks;

    @C09CT("news_anchor_blocked_domains")
    public List<String> blockedDomains;

    @C09CT("default_title")
    public String defaultTitle;

    @C09CT("is_new_news_anchor_permission")
    public Boolean hasPermission;

    @C09CT("is_publisher_suspended")
    public Boolean isPublisherSuspended;

    @C09CT("term_link")
    public String termLink;

    @C09CT("news_anchor_title_maximum_length")
    public Integer titleMaximumLength;

    public NewsAnchorContent() {
        this(null, null, null, null, null, null, null);
    }

    public NewsAnchorContent(List<String> list, Boolean bool, Integer num, String str, List<String> list2, String str2, Boolean bool2) {
        this.allowDomainLinks = list;
        this.hasPermission = bool;
        this.titleMaximumLength = num;
        this.defaultTitle = str;
        this.blockedDomains = list2;
        this.termLink = str2;
        this.isPublisherSuspended = bool2;
    }
}
