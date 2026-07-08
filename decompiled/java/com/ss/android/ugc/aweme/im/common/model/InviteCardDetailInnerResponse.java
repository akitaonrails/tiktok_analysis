package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InviteCardDetailInnerResponse extends BaseResponse {

    @C09CT("event_tracking")
    public final Map<String, String> eventTracking;

    @C09CT("group")
    public final GroupInfo group;

    @C09CT("error")
    public final InviteError inviteError;

    @C09CT("popup_info")
    public final InvitePopupInfo invitePopupInfo;

    @C09CT("invitee_group_status")
    public final Integer inviteeGroupStatus;

    @C09CT("inviter_id")
    public final Long inviterId;

    @C09CT("inviter_name")
    public final String inviterName;

    public InviteCardDetailInnerResponse() {
        this(null, null, null, null, null, null, C2097608Jq.LJ());
    }

    public final InviteCardDetailInnerResponse copy(GroupInfo groupInfo, Long l, String str, InviteError inviteError, Integer num, InvitePopupInfo invitePopupInfo, Map<String, String> map) {
        return new InviteCardDetailInnerResponse(groupInfo, l, str, inviteError, num, invitePopupInfo, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteCardDetailInnerResponse)) {
            return false;
        }
        InviteCardDetailInnerResponse inviteCardDetailInnerResponse = (InviteCardDetailInnerResponse) obj;
        return Intrinsics.LJFF(this.group, inviteCardDetailInnerResponse.group) && Intrinsics.LJFF(this.inviterId, inviteCardDetailInnerResponse.inviterId) && Intrinsics.LJFF(this.inviterName, inviteCardDetailInnerResponse.inviterName) && Intrinsics.LJFF(this.inviteError, inviteCardDetailInnerResponse.inviteError) && Intrinsics.LJFF(this.inviteeGroupStatus, inviteCardDetailInnerResponse.inviteeGroupStatus) && Intrinsics.LJFF(this.invitePopupInfo, inviteCardDetailInnerResponse.invitePopupInfo) && Intrinsics.LJFF(this.eventTracking, inviteCardDetailInnerResponse.eventTracking);
    }

    public int hashCode() {
        GroupInfo groupInfo = this.group;
        int iHashCode = (groupInfo == null ? 0 : groupInfo.hashCode()) * 31;
        Long l = this.inviterId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.inviterName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InviteError inviteError = this.inviteError;
        int iHashCode4 = (iHashCode3 + (inviteError == null ? 0 : inviteError.hashCode())) * 31;
        Integer num = this.inviteeGroupStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        InvitePopupInfo invitePopupInfo = this.invitePopupInfo;
        return ((iHashCode5 + (invitePopupInfo != null ? invitePopupInfo.hashCode() : 0)) * 31) + this.eventTracking.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteCardDetailInnerResponse(group=");
        sbLIZ.append(this.group);
        sbLIZ.append(", inviterId=");
        sbLIZ.append(this.inviterId);
        sbLIZ.append(", inviterName=");
        sbLIZ.append(this.inviterName);
        sbLIZ.append(", inviteError=");
        sbLIZ.append(this.inviteError);
        sbLIZ.append(", inviteeGroupStatus=");
        sbLIZ.append(this.inviteeGroupStatus);
        sbLIZ.append(", invitePopupInfo=");
        sbLIZ.append(this.invitePopupInfo);
        sbLIZ.append(", eventTracking=");
        sbLIZ.append(this.eventTracking);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getChatTypeForET() {
        String str = this.eventTracking.get("a:et_chat_type");
        return str == null ? "" : str;
    }

    public final String getGroupOwnerAccountType() {
        String str = this.eventTracking.get("group_owner_account_type");
        return str == null ? "" : str;
    }

    public final String getGroupType() {
        String str;
        GroupInfo groupInfo = this.group;
        return (groupInfo == null || (str = groupInfo.groupType) == null) ? "" : str;
    }

    public final String getGroupTypeForET() {
        String str = this.eventTracking.get("a:et_group_type");
        return str == null ? "" : str;
    }

    public final Map<String, String> getEventTracking() {
        return this.eventTracking;
    }

    public final GroupInfo getGroup() {
        return this.group;
    }

    public final InviteError getInviteError() {
        return this.inviteError;
    }

    public final InvitePopupInfo getInvitePopupInfo() {
        return this.invitePopupInfo;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public final Long getInviterId() {
        return this.inviterId;
    }

    public final String getInviterName() {
        return this.inviterName;
    }

    public InviteCardDetailInnerResponse(GroupInfo groupInfo, Long l, String str, InviteError inviteError, Integer num, InvitePopupInfo invitePopupInfo, Map<String, String> map) {
        this.group = groupInfo;
        this.inviterId = l;
        this.inviterName = str;
        this.inviteError = inviteError;
        this.inviteeGroupStatus = num;
        this.invitePopupInfo = invitePopupInfo;
        this.eventTracking = map;
    }
}
