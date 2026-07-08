package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerSspAllowListItem {

    @C09CT("bid")
    public final String bid;

    @C09CT("domains")
    public final List<String> domains;

    @C09CT("excluded_urls")
    public final List<String> excludedUrls;

    public PipoContainerSspAllowListItem() {
        this(null, null, null);
    }

    public final String getBid() {
        return this.bid;
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public final List<String> getExcludedUrls() {
        return this.excludedUrls;
    }

    public PipoContainerSspAllowListItem(String str, List<String> list, List<String> list2) {
        this.bid = str;
        this.domains = list;
        this.excludedUrls = list2;
    }
}
