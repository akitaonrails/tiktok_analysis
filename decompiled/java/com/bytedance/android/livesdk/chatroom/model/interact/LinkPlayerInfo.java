package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class LinkPlayerInfo {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJII;

    @C09CT("app_version")
    public int appVersion;

    @C09CT("blurred_avatar")
    public ImageModel blurredAvatar;

    @C09CT("can_bring_to_cohost_during_multiguest")
    public boolean canBringToCohostDuringMultiguest;

    @C09CT("inviter_user_id")
    public long inviterUserId;

    @C09CT("is_full_position_pre_approved")
    public boolean isFullPositionPreApproved;

    @C09CT("is_last_meet_gift_score_threshold_applier")
    public boolean isLastMeetGiftScoreThresholdApplier;

    @C09CT("is_user_invited")
    public boolean isUserInvited;

    @C09CT("link_type_permission")
    public long linkTypePermission;

    @C09CT("link_user_type")
    public int linkUserType;

    @C09CT("loc_room_type")
    public int locRoomType;

    @C09CT("fan_ticket")
    public long mFanTicket;

    @C09CT("fan_ticket_icon_type")
    public int mFanTicketType;

    @C09CT("linkmic_id_str")
    public String mInteractIdStr;

    @C09CT("link_type")
    public int mLinkType;

    @C09CT("modify_time")
    public long mModifyTime;

    @C09CT("role_type")
    public int mRoleType;

    @C09CT("user")
    public User mUser;

    @C09CT("online_status")
    public int onlineStatus;

    @C09CT("payed_money")
    public int paidMoney;

    @C09CT("permission_as_viewer")
    public int permissionAsViewer;

    @C09CT("recommend_tag_list")
    public List<String> recommendTagList;

    @C09CT("room_score_rank")
    public long roomScoreRank;

    @C09CT("shared_invitation_type")
    public int sharedInvitationType;

    @C09CT("tag_list")
    public List<String> tagKeyList;

    @C09CT("tag_map")
    public Map<String, String> tagMap;

    @C09CT("track_map")
    public Map<String, String> trackMap;

    @C09CT("user_type")
    public int userType;

    @C09CT("recall_reason")
    public String recallReason = "";
    public int LJFF = 1;
    public long LJI = -1;

    public final int hashCode() {
        return Objects.hash(this.mUser, Integer.valueOf(this.linkUserType), Boolean.valueOf(this.isFullPositionPreApproved), Integer.valueOf(this.onlineStatus), Integer.valueOf(this.LIZ), Integer.valueOf(this.mLinkType), Integer.valueOf(this.mRoleType), this.mInteractIdStr, Long.valueOf(this.linkTypePermission), Integer.valueOf(this.LIZIZ));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkPlayerInfo{, mFanTicket=");
        sbLIZ.append(this.mFanTicket);
        sbLIZ.append(", mFanTicketType=");
        sbLIZ.append(this.mFanTicketType);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.mUser.getId());
        sbLIZ.append(", mModifyTime=");
        sbLIZ.append(this.mModifyTime);
        sbLIZ.append(", mLinkStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mLinkType=");
        sbLIZ.append(this.mLinkType);
        sbLIZ.append(", mRoleType=");
        sbLIZ.append(this.mRoleType);
        sbLIZ.append(", paidMoney=");
        sbLIZ.append(this.paidMoney);
        sbLIZ.append(", linkDuration=");
        sbLIZ.append(0);
        sbLIZ.append(", mInteractIdStr='");
        sbLIZ.append(this.mInteractIdStr);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
        User user = this.mUser;
        if (user != null && linkPlayerInfo.mUser != null && user.getIdStr().equals(linkPlayerInfo.mUser.getIdStr())) {
            return true;
        }
        return false;
    }
}
