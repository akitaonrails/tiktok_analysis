package com.ss.android.ugc.aweme.feed.model.explore;

/* JADX INFO: loaded from: classes25.dex */
public final class ExploreClientExtra {
    public static final Companion Companion = new Companion();
    public volatile int cacheType;
    public String displayDesc;
    public boolean isInnerFeed;

    public static final class Companion {
    }

    public ExploreClientExtra() {
        this(0, null, false);
    }

    public final boolean isInnerFeed() {
        return this.isInnerFeed;
    }

    public final void setCacheType(int i) {
        this.cacheType = i;
    }

    public final void setDisplayDesc(String str) {
        this.displayDesc = str;
    }

    public final void setInnerFeed(boolean z) {
        this.isInnerFeed = z;
    }

    public final void update(ExploreClientExtra exploreClientExtra) {
        if (exploreClientExtra == null) {
            return;
        }
        if (exploreClientExtra.cacheType > this.cacheType) {
            this.cacheType = exploreClientExtra.cacheType;
        }
        if (this.displayDesc == null) {
            this.displayDesc = exploreClientExtra.displayDesc;
        }
        this.isInnerFeed = exploreClientExtra.isInnerFeed;
    }

    public ExploreClientExtra(int i, String str, boolean z) {
        this.cacheType = i;
        this.displayDesc = str;
        this.isInnerFeed = z;
    }
}
