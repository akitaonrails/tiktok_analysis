package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class FriendsV3TextPostArchiveRequestConfig {

    @C09CT("loadmore_count")
    public final int loadMoreCount;

    @C09CT("loadmore_prefetch_offset")
    public final int loadMorePrefetchOffset;

    @C09CT("refresh_count")
    public final int refreshCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3TextPostArchiveRequestConfig)) {
            return false;
        }
        FriendsV3TextPostArchiveRequestConfig friendsV3TextPostArchiveRequestConfig = (FriendsV3TextPostArchiveRequestConfig) obj;
        return this.refreshCount == friendsV3TextPostArchiveRequestConfig.refreshCount && this.loadMoreCount == friendsV3TextPostArchiveRequestConfig.loadMoreCount && this.loadMorePrefetchOffset == friendsV3TextPostArchiveRequestConfig.loadMorePrefetchOffset;
    }

    public final int hashCode() {
        return (((this.refreshCount * 31) + this.loadMoreCount) * 31) + this.loadMorePrefetchOffset;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3TextPostArchiveRequestConfig(refreshCount=");
        sbLIZ.append(this.refreshCount);
        sbLIZ.append(", loadMoreCount=");
        sbLIZ.append(this.loadMoreCount);
        sbLIZ.append(", loadMorePrefetchOffset=");
        sbLIZ.append(this.loadMorePrefetchOffset);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FriendsV3TextPostArchiveRequestConfig() {
        this(15, 15, 5);
    }

    public FriendsV3TextPostArchiveRequestConfig(int i, int i2, int i3) {
        this.refreshCount = i;
        this.loadMoreCount = i2;
        this.loadMorePrefetchOffset = i3;
    }
}
