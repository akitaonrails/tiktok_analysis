package com.ss.android.ugc.aweme.rss.api.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class RssFeed {

    @C09CT("entries")
    public final List<RssEntry> entries;

    public RssFeed(List<RssEntry> list) {
        this.entries = list;
    }
}
