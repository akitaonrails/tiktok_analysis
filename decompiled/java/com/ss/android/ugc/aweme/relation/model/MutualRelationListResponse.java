package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MutualRelationListResponse extends BaseResponse implements Serializable {

    @C09CT("detect_by")
    public final List<Integer> detectBy;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("mention_block_types")
    public final List<Long> mentionBlockTypes;

    @C09CT("other_follow_tier")
    public final List<Integer> otherFollowTier;

    @C09CT("self_follow_tier")
    public final List<Integer> selfFollowTier;

    @C09CT("users")
    public final List<User> userInfos;

    public MutualRelationListResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final MutualRelationListResponse copy(List<? extends User> list, List<Long> list2, List<Integer> list3, List<Integer> list4, List<Integer> list5, LogPbBean logPbBean) {
        return new MutualRelationListResponse(list, list2, list3, list4, list5, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutualRelationListResponse)) {
            return false;
        }
        MutualRelationListResponse mutualRelationListResponse = (MutualRelationListResponse) obj;
        return Intrinsics.LJFF(this.userInfos, mutualRelationListResponse.userInfos) && Intrinsics.LJFF(this.mentionBlockTypes, mutualRelationListResponse.mentionBlockTypes) && Intrinsics.LJFF(this.detectBy, mutualRelationListResponse.detectBy) && Intrinsics.LJFF(this.selfFollowTier, mutualRelationListResponse.selfFollowTier) && Intrinsics.LJFF(this.otherFollowTier, mutualRelationListResponse.otherFollowTier) && Intrinsics.LJFF(this.logPb, mutualRelationListResponse.logPb);
    }

    public int hashCode() {
        int iHashCode = ((this.userInfos.hashCode() * 31) + this.mentionBlockTypes.hashCode()) * 31;
        List<Integer> list = this.detectBy;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.selfFollowTier.hashCode()) * 31) + this.otherFollowTier.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutualRelationListResponse(userInfos=");
        sbLIZ.append(this.userInfos);
        sbLIZ.append(", mentionBlockTypes=");
        sbLIZ.append(this.mentionBlockTypes);
        sbLIZ.append(", detectBy=");
        sbLIZ.append(this.detectBy);
        sbLIZ.append(", selfFollowTier=");
        sbLIZ.append(this.selfFollowTier);
        sbLIZ.append(", otherFollowTier=");
        sbLIZ.append(this.otherFollowTier);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<User> getUserList() {
        List<User> list = this.userInfos;
        for (User user : list) {
            LogPbBean logPbBean = this.logPb;
            user.setRequestId(logPbBean != null ? logPbBean.getImprId() : null);
        }
        return list;
    }

    public final List<Integer> getDetectBy() {
        return this.detectBy;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<Long> getMentionBlockTypes() {
        return this.mentionBlockTypes;
    }

    public final List<Integer> getOtherFollowTier() {
        return this.otherFollowTier;
    }

    public final List<Integer> getSelfFollowTier() {
        return this.selfFollowTier;
    }

    public final List<User> getUserInfos() {
        return this.userInfos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutualRelationListResponse(List<? extends User> list, List<Long> list2, List<Integer> list3, List<Integer> list4, List<Integer> list5, LogPbBean logPbBean) {
        this.userInfos = list;
        this.mentionBlockTypes = list2;
        this.detectBy = list3;
        this.selfFollowTier = list4;
        this.otherFollowTier = list5;
        this.logPb = logPbBean;
    }

    public MutualRelationListResponse(List list, List list2, List list3, List list4, List list5, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C13BV.INSTANCE : list5, (i & 32) != 0 ? null : logPbBean);
    }
}
