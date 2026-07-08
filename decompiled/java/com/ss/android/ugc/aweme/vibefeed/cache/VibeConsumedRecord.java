package com.ss.android.ugc.aweme.vibefeed.cache;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeConsumedRecord {

    @C09CT("aid")
    public final String aid;

    @C09CT("cover_url")
    public final UrlModel coverUrl;

    @C09CT("feed_id")
    public final String feedId;

    @C09CT("has_consumed")
    public Boolean hasConsumed;

    @C09CT("liked_uids")
    public List<String> likedUids;

    @C09CT("timestamp")
    public final Long timestamp;

    public VibeConsumedRecord() {
        this(null, null, null, null, null, null);
    }

    public VibeConsumedRecord(Long l, String str, String str2, Boolean bool, List<String> list, UrlModel urlModel) {
        this.timestamp = l;
        this.feedId = str;
        this.aid = str2;
        this.hasConsumed = bool;
        this.likedUids = list;
        this.coverUrl = urlModel;
    }
}
