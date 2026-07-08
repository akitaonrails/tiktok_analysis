package com.ss.android.ugc.now.interaction.api;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LikeState extends Interaction {
    public final String awemeId;
    public final boolean isLiked;
    public final boolean isRefresh;
    public final long likeCount;

    public final LikeState copy(long j, boolean z, boolean z2, String str) {
        return new LikeState(j, z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeState)) {
            return false;
        }
        LikeState likeState = (LikeState) obj;
        return this.likeCount == likeState.likeCount && this.isLiked == likeState.isLiked && this.isRefresh == likeState.isRefresh && Intrinsics.LJFF(this.awemeId, likeState.awemeId);
    }

    public int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.likeCount) * 31) + C786410Ut5.Z2(this.isLiked)) * 31) + C786410Ut5.Z2(this.isRefresh)) * 31;
        String str = this.awemeId;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LikeState(likeCount=");
        sbLIZ.append(this.likeCount);
        sbLIZ.append(", isLiked=");
        sbLIZ.append(this.isLiked);
        sbLIZ.append(", isRefresh=");
        sbLIZ.append(this.isRefresh);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final long getLikeCount() {
        return this.likeCount;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public LikeState(long j, boolean z, boolean z2, String str) {
        super(null);
        this.likeCount = j;
        this.isLiked = z;
        this.isRefresh = z2;
        this.awemeId = str;
    }
}
