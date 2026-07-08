package com.ss.android.ugc.aweme.discover.model;

import X.C786410Ut5;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TrendingTopicOrAd implements Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 42;
    public final TrendingTopicsAdInfo ad;
    public final TrendingTopic topic;

    public static final class Companion {
    }

    public final boolean isAd() {
        return this.ad != null;
    }

    public final boolean isTopic() {
        return this.topic != null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        if (!isAd()) {
            return this.topic.getChallenge() != null ? C786410Ut5.j4("TrendingTopicOrAd[Category.challenge %s]", Arrays.copyOf(new Object[]{this.topic.getChallenge().getDesc()}, 1)) : this.topic.getMusic() != null ? C786410Ut5.j4("TrendingTopicOrAd[Category.music %s]", Arrays.copyOf(new Object[]{this.topic.getMusic().getAlbum()}, 1)) : this.topic.getItems() != null ? C786410Ut5.j4("TrendingTopicOrAd[Category.items %d]", Arrays.copyOf(new Object[]{Integer.valueOf(this.topic.getItems().size())}, 1)) : "TrendingTopicOrAd[Category.unknown]";
        }
        Object[] objArr = new Object[1];
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.ad;
        objArr[0] = trendingTopicsAdInfo != null ? Long.valueOf(trendingTopicsAdInfo.adId) : null;
        return C786410Ut5.j4("TrendingTopicOrAd[Ad %d]", Arrays.copyOf(objArr, 1));
    }

    public final TrendingTopicsAdInfo getAd() {
        return this.ad;
    }

    public TrendingTopicOrAd(TrendingTopic trendingTopic) {
        this.topic = trendingTopic;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r3.isTopic()
            if (r0 == 0) goto L5f
            r2 = r4
            com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd r2 = (com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd) r2
            boolean r0 = r2.isTopic()
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r3.topic
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.getChallenge()
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r2.topic
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.getChallenge()
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r3.topic
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.getChallenge()
            java.lang.String r1 = r0.getCid()
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r2.topic
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.getChallenge()
            java.lang.String r0 = r0.getCid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        L3e:
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r3.topic
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r2.topic
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r3.topic
            com.ss.android.ugc.aweme.music.model.Music r1 = r0.getMusic()
            com.ss.android.ugc.aweme.discover.model.TrendingTopic r0 = r2.topic
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        L5f:
            boolean r0 = r3.isAd()
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd r4 = (com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd) r4
            boolean r0 = r4.isAd()
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo r1 = r3.ad
            com.ss.android.ugc.aweme.discover.model.TrendingTopicsAdInfo r0 = r4.ad
            boolean r0 = r3.equals(r1, r0)
            return r0
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd.equals(java.lang.Object):boolean");
    }

    public TrendingTopicOrAd(TrendingTopicsAdInfo trendingTopicsAdInfo) {
        this.ad = trendingTopicsAdInfo;
    }

    private final boolean equals(TrendingTopicsAdInfo trendingTopicsAdInfo, TrendingTopicsAdInfo trendingTopicsAdInfo2) {
        if (trendingTopicsAdInfo == trendingTopicsAdInfo2) {
            return true;
        }
        if (trendingTopicsAdInfo != null && trendingTopicsAdInfo2 != null) {
            return equals(Long.valueOf(trendingTopicsAdInfo.adId), Long.valueOf(trendingTopicsAdInfo2.adId));
        }
        return false;
    }

    private final boolean equals(Long l, Long l2) {
        if (l == null) {
            if (l2 == null) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(l, l2);
    }
}
