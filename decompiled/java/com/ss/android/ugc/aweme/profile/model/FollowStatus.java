package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowStatus extends BaseResponse implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("contact_name")
    public String contactName;
    public int followFrom;

    @C09CT("follow_status")
    public int followStatus;
    public Integer followerStatus;

    @C09CT("is_enterprise")
    public int isEnterprise;
    public boolean isFollowChange;
    public boolean isFollowSuccess;
    public boolean isFromSharerCard;

    @C09CT("log_pb")
    public final LogPbBean logPb;
    public int preStatus;
    public String secUserId;
    public final User user;
    public String userId;

    @C09CT("watch_status")
    public int watchStatus;

    public static final class Companion {
    }

    public FollowStatus() {
        this(0, 0, null, 0, null, null, true, true, -1, 0, null, null, -1, false);
    }

    public final FollowStatus copy(int i, int i2, String str, int i3, String str2, String str3, boolean z, boolean z2, Integer num, int i4, User user, LogPbBean logPbBean, int i5, boolean z3) {
        return new FollowStatus(i, i2, str, i3, str2, str3, z, z2, num, i4, user, logPbBean, i5, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowStatus)) {
            return false;
        }
        FollowStatus followStatus = (FollowStatus) obj;
        return this.watchStatus == followStatus.watchStatus && this.followStatus == followStatus.followStatus && Intrinsics.LJFF(this.contactName, followStatus.contactName) && this.isEnterprise == followStatus.isEnterprise && Intrinsics.LJFF(this.userId, followStatus.userId) && Intrinsics.LJFF(this.secUserId, followStatus.secUserId) && this.isFollowSuccess == followStatus.isFollowSuccess && this.isFollowChange == followStatus.isFollowChange && Intrinsics.LJFF(this.followerStatus, followStatus.followerStatus) && this.followFrom == followStatus.followFrom && Intrinsics.LJFF(this.user, followStatus.user) && Intrinsics.LJFF(this.logPb, followStatus.logPb) && this.preStatus == followStatus.preStatus && this.isFromSharerCard == followStatus.isFromSharerCard;
    }

    public int hashCode() {
        int i = ((this.watchStatus * 31) + this.followStatus) * 31;
        String str = this.contactName;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.isEnterprise) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secUserId;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.isFollowSuccess)) * 31) + C786410Ut5.Z2(this.isFollowChange)) * 31;
        Integer num = this.followerStatus;
        int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.followFrom) * 31;
        User user = this.user;
        int iHashCode5 = (iHashCode4 + (user == null ? 0 : user.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return ((((iHashCode5 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31) + this.preStatus) * 31) + C786410Ut5.Z2(this.isFromSharerCard);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "FollowStatus(watchStatus=" + this.watchStatus + ", followStatus=" + this.followStatus + ", contactName=" + this.contactName + ", isEnterprise=" + this.isEnterprise + ", userId=" + this.userId + ", secUserId=" + this.secUserId + ", isFollowSuccess=" + this.isFollowSuccess + ", isFollowChange=" + this.isFollowChange + ", followerStatus=" + this.followerStatus + ", followFrom=" + this.followFrom + ", user=" + this.user + ", logPb=" + this.logPb + ", preStatus=" + this.preStatus + ", isFromSharerCard=" + this.isFromSharerCard + ')';
    }

    public final boolean isCheating() {
        return this.status_code == 2149;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final int getFollowFrom() {
        return this.followFrom;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.followerStatus;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final int getPreStatus() {
        return this.preStatus;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getWatchStatus() {
        return this.watchStatus;
    }

    public final int isEnterprise() {
        return this.isEnterprise;
    }

    public final boolean isFollowChange() {
        return this.isFollowChange;
    }

    public final boolean isFollowSuccess() {
        return this.isFollowSuccess;
    }

    public final boolean isFromSharerCard() {
        return this.isFromSharerCard;
    }

    public final void setContactName(String str) {
        this.contactName = str;
    }

    public final void setEnterprise(int i) {
        this.isEnterprise = i;
    }

    public final void setFollowChange(boolean z) {
        this.isFollowChange = z;
    }

    public final void setFollowFrom(int i) {
        this.followFrom = i;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setFollowSuccess(boolean z) {
        this.isFollowSuccess = z;
    }

    public final void setFollowerStatus(Integer num) {
        this.followerStatus = num;
    }

    public final void setFromSharerCard(boolean z) {
        this.isFromSharerCard = z;
    }

    public final void setPreStatus(int i) {
        this.preStatus = i;
    }

    public final void setSecUserId(String str) {
        this.secUserId = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setWatchStatus(int i) {
        this.watchStatus = i;
    }

    public FollowStatus(String str, int i) {
        this(0, 0, null, 0, null, null, true, true, -1, 0, null, null, -1, false);
        this.userId = str;
        this.followStatus = i;
    }

    public FollowStatus(String str, int i, Integer num) {
        this(0, 0, null, 0, null, null, true, true, -1, 0, null, null, -1, false);
        this.userId = str;
        this.followStatus = i;
        if (num != null) {
            this.followerStatus = Integer.valueOf(num.intValue());
        }
    }

    public FollowStatus(String str, int i, Integer num, int i2) {
        this(0, 0, null, 0, null, null, true, true, -1, 0, null, null, -1, false);
        this.userId = str;
        this.followStatus = i;
        this.followerStatus = num;
        this.status_code = i2;
    }

    public FollowStatus(int i, int i2, String str, int i3, String str2, String str3, boolean z, boolean z2, Integer num, int i4, User user, LogPbBean logPbBean, int i5, boolean z3) {
        this.watchStatus = i;
        this.followStatus = i2;
        this.contactName = str;
        this.isEnterprise = i3;
        this.userId = str2;
        this.secUserId = str3;
        this.isFollowSuccess = z;
        this.isFollowChange = z2;
        this.followerStatus = num;
        this.followFrom = i4;
        this.user = user;
        this.logPb = logPbBean;
        this.preStatus = i5;
        this.isFromSharerCard = z3;
    }
}
