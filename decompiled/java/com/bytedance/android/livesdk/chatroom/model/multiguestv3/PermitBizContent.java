package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* JADX INFO: loaded from: classes.dex */
public final class PermitBizContent {

    @C09CT("expire_timestamp")
    public long expireTime;

    @C09CT("is_apply_auto_approved")
    public boolean isApplyAutoApproved;

    @C09CT("is_full_position_pre_approved")
    public boolean isFullPositionPreApproved;

    @C09CT("is_quick_call_auto_approved")
    public boolean isQuickCallAutoApproved;

    @C09CT("link_type_permission")
    public long linkTypePermission;

    @C09CT("link_user_type")
    public int linkUserType;

    @C09CT("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    @C09CT("operator_link_admin_type")
    public int operatorLinkAdminType;

    @C09CT("operator_user_info")
    public User operatorUserInfo;

    public PermitBizContent() {
        this(null, 0L, null, 0, 0, false, 0L, false, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitBizContent(multiLiveAnchorPanelSettings=");
        sbLIZ.append(this.multiLiveAnchorPanelSettings);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.expireTime);
        sbLIZ.append(", operatorUserInfo=");
        sbLIZ.append(this.operatorUserInfo);
        sbLIZ.append(", operatorLinkAdminType=");
        sbLIZ.append(this.operatorLinkAdminType);
        sbLIZ.append(", linkUserType=");
        sbLIZ.append(this.linkUserType);
        sbLIZ.append(", isApplyAutoApproved=");
        sbLIZ.append(this.isApplyAutoApproved);
        sbLIZ.append(", linkTypePermission=");
        sbLIZ.append(this.linkTypePermission);
        sbLIZ.append(", isFullPositionPreApproved=");
        sbLIZ.append(this.isFullPositionPreApproved);
        sbLIZ.append(", isQuickCallAutoApproved=");
        sbLIZ.append(this.isQuickCallAutoApproved);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PermitBizContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, long j, User user, int i, int i2, boolean z, long j2, boolean z2, boolean z3) {
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
        this.expireTime = j;
        this.operatorUserInfo = user;
        this.operatorLinkAdminType = i;
        this.linkUserType = i2;
        this.isApplyAutoApproved = z;
        this.linkTypePermission = j2;
        this.isFullPositionPreApproved = z2;
        this.isQuickCallAutoApproved = z3;
    }
}
