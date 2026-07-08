package com.ss.android.ugc.aweme.service;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ProgressRecord {
    public Aweme aweme;
    public Long cacheTimestamp;
    public Long collectionId;
    public Float videoProgress;

    public ProgressRecord() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressRecord)) {
            return false;
        }
        ProgressRecord progressRecord = (ProgressRecord) obj;
        return Intrinsics.LJFF(this.collectionId, progressRecord.collectionId) && Intrinsics.LJFF(this.aweme, progressRecord.aweme) && Intrinsics.LJFF(this.videoProgress, progressRecord.videoProgress) && Intrinsics.LJFF(this.cacheTimestamp, progressRecord.cacheTimestamp);
    }

    public int hashCode() {
        Long l = this.collectionId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Aweme aweme = this.aweme;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Float f = this.videoProgress;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Long l2 = this.cacheTimestamp;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProgressRecord(collectionId=");
        sbLIZ.append(this.collectionId);
        sbLIZ.append(", awemeId=");
        Aweme aweme = this.aweme;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(", videoProgress=");
        sbLIZ.append(this.videoProgress);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setCacheTimestamp(Long l) {
        this.cacheTimestamp = l;
    }

    public final void setCollectionId(Long l) {
        this.collectionId = l;
    }

    public final void setVideoProgress(Float f) {
        this.videoProgress = f;
    }

    public ProgressRecord(Long l, Aweme aweme, Float f, Long l2) {
        this.collectionId = l;
        this.aweme = aweme;
        this.videoProgress = f;
        this.cacheTimestamp = l2;
    }
}
