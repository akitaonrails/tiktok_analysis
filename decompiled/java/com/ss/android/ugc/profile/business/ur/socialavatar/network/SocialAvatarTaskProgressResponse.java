package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAssets;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarTaskProgressResponse extends BaseResponse {

    @C09CT("social_avatar_assets")
    public final SocialAvatarAssets assetDetail;

    @C09CT("has_more_update")
    public final Boolean hasMoreUpdate;

    @C09CT("polling_interval")
    public final long pollingIntervalMs;

    @C09CT("task_detail")
    public final SocialAvatarTaskProgress taskDetail;

    public SocialAvatarTaskProgressResponse() {
        this(new SocialAvatarTaskProgress(null, null, null, null, null, null, null, null), 10000L, Boolean.FALSE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarTaskProgressResponse)) {
            return false;
        }
        SocialAvatarTaskProgressResponse socialAvatarTaskProgressResponse = (SocialAvatarTaskProgressResponse) obj;
        return Intrinsics.LJFF(this.taskDetail, socialAvatarTaskProgressResponse.taskDetail) && this.pollingIntervalMs == socialAvatarTaskProgressResponse.pollingIntervalMs && Intrinsics.LJFF(this.hasMoreUpdate, socialAvatarTaskProgressResponse.hasMoreUpdate) && Intrinsics.LJFF(this.assetDetail, socialAvatarTaskProgressResponse.assetDetail);
    }

    public final int hashCode() {
        int iHashCode = ((this.taskDetail.hashCode() * 31) + C786410Ut5.Y2(this.pollingIntervalMs)) * 31;
        Boolean bool = this.hasMoreUpdate;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        SocialAvatarAssets socialAvatarAssets = this.assetDetail;
        return iHashCode2 + (socialAvatarAssets != null ? socialAvatarAssets.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarTaskProgressResponse(taskDetail=");
        sbLIZ.append(this.taskDetail);
        sbLIZ.append(", pollingIntervalMs=");
        sbLIZ.append(this.pollingIntervalMs);
        sbLIZ.append(", hasMoreUpdate=");
        sbLIZ.append(this.hasMoreUpdate);
        sbLIZ.append(", assetDetail=");
        sbLIZ.append(this.assetDetail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarTaskProgressResponse(SocialAvatarTaskProgress socialAvatarTaskProgress, long j, Boolean bool, SocialAvatarAssets socialAvatarAssets) {
        this.taskDetail = socialAvatarTaskProgress;
        this.pollingIntervalMs = j;
        this.hasMoreUpdate = bool;
        this.assetDetail = socialAvatarAssets;
    }
}
