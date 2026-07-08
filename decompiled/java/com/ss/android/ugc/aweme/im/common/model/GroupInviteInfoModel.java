package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupInviteInfoModel extends BaseResponse implements Serializable {

    @C09CT("expired_at")
    public Long expiredAt;

    @C09CT("group")
    public GroupInfo groupInfo;

    @C09CT("error")
    public InviteError inviteError;

    @C09CT("invite_id")
    public String inviteId;

    @C09CT("invite_short_url")
    public String inviteShortUrl;

    @C09CT("invite_url")
    public String inviteUrl;

    public GroupInviteInfoModel() {
        this(null, null, null, null, null, null);
    }

    public final GroupInviteInfoModel copy(String str, String str2, String str3, Long l, GroupInfo groupInfo, InviteError inviteError) {
        return new GroupInviteInfoModel(str, str2, str3, l, groupInfo, inviteError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInviteInfoModel)) {
            return false;
        }
        GroupInviteInfoModel groupInviteInfoModel = (GroupInviteInfoModel) obj;
        return Intrinsics.LJFF(this.inviteId, groupInviteInfoModel.inviteId) && Intrinsics.LJFF(this.inviteUrl, groupInviteInfoModel.inviteUrl) && Intrinsics.LJFF(this.inviteShortUrl, groupInviteInfoModel.inviteShortUrl) && Intrinsics.LJFF(this.expiredAt, groupInviteInfoModel.expiredAt) && Intrinsics.LJFF(this.groupInfo, groupInviteInfoModel.groupInfo) && Intrinsics.LJFF(this.inviteError, groupInviteInfoModel.inviteError);
    }

    public int hashCode() {
        String str = this.inviteId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inviteUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inviteShortUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.expiredAt;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        GroupInfo groupInfo = this.groupInfo;
        int iHashCode5 = (iHashCode4 + (groupInfo == null ? 0 : groupInfo.hashCode())) * 31;
        InviteError inviteError = this.inviteError;
        return iHashCode5 + (inviteError != null ? inviteError.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupInviteInfoModel(inviteId=");
        sbLIZ.append(this.inviteId);
        sbLIZ.append(", inviteUrl=");
        sbLIZ.append(this.inviteUrl);
        sbLIZ.append(", inviteShortUrl=");
        sbLIZ.append(this.inviteShortUrl);
        sbLIZ.append(", expiredAt=");
        sbLIZ.append(this.expiredAt);
        sbLIZ.append(", groupInfo=");
        sbLIZ.append(this.groupInfo);
        sbLIZ.append(", inviteError=");
        sbLIZ.append(this.inviteError);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    public final GroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public final InviteError getInviteError() {
        return this.inviteError;
    }

    public final String getInviteId() {
        return this.inviteId;
    }

    public final String getInviteShortUrl() {
        return this.inviteShortUrl;
    }

    public final String getInviteUrl() {
        return this.inviteUrl;
    }

    public final void setExpiredAt(Long l) {
        this.expiredAt = l;
    }

    public final void setGroupInfo(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    public final void setInviteError(InviteError inviteError) {
        this.inviteError = inviteError;
    }

    public final void setInviteId(String str) {
        this.inviteId = str;
    }

    public final void setInviteShortUrl(String str) {
        this.inviteShortUrl = str;
    }

    public final void setInviteUrl(String str) {
        this.inviteUrl = str;
    }

    public GroupInviteInfoModel(String str, String str2, String str3, Long l, GroupInfo groupInfo, InviteError inviteError) {
        this.inviteId = str;
        this.inviteUrl = str2;
        this.inviteShortUrl = str3;
        this.expiredAt = l;
        this.groupInfo = groupInfo;
        this.inviteError = inviteError;
    }
}
