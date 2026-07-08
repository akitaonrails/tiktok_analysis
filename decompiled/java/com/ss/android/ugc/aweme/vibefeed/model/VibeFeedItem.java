package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedItem {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("feed_id")
    public final String feedId;

    @C09CT("liked_uids")
    public final List<String> likedUids;

    @C09CT("refresh_time")
    public final Long refreshTime;

    public VibeFeedItem() {
        this(null, null, null, null, 15, null);
    }

    public VibeFeedItem(Aweme aweme, List<String> list, String str, Long l) {
        this.aweme = aweme;
        this.likedUids = list;
        this.feedId = str;
        this.refreshTime = l;
    }

    public VibeFeedItem(Aweme aweme, List list, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aweme, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l);
    }
}
