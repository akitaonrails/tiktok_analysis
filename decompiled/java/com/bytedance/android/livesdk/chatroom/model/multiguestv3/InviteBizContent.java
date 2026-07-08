package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkmicShareRevenueSettingStruct;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* JADX INFO: loaded from: classes.dex */
public final class InviteBizContent {

    @C09CT("invite_source")
    public int inviteSource;

    @C09CT("invitee_user_info")
    public User inviteeUserInfo;

    @C09CT("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    @C09CT("operator_link_admin_type")
    public int operatorLinkAdminType;

    @C09CT("operator_user_info")
    public User operatorUserInfo;

    @C09CT("share_revenue_setting")
    public int shareRevenueSetting;

    @C09CT("share_revenue_setting_struct")
    public LinkmicShareRevenueSettingStruct shareRevenueSettingStruct;

    public InviteBizContent() {
        this(null, 0, null, 0, null, 0, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteBizContent(multiLiveAnchorPanelSettings=");
        sbLIZ.append(this.multiLiveAnchorPanelSettings);
        sbLIZ.append(", inviteSource=");
        sbLIZ.append(this.inviteSource);
        sbLIZ.append(", operatorUserInfo=");
        sbLIZ.append(this.operatorUserInfo);
        sbLIZ.append(", operatorLinkAdminType=");
        sbLIZ.append(this.operatorLinkAdminType);
        sbLIZ.append(", inviteeUserInfo=");
        sbLIZ.append(this.inviteeUserInfo);
        sbLIZ.append(", shareRevenueSetting=");
        sbLIZ.append(this.shareRevenueSetting);
        sbLIZ.append(", shareRevenueSettingStruct=");
        sbLIZ.append(this.shareRevenueSettingStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InviteBizContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, User user, int i2, User user2, int i3, LinkmicShareRevenueSettingStruct linkmicShareRevenueSettingStruct) {
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
        this.inviteSource = i;
        this.operatorUserInfo = user;
        this.operatorLinkAdminType = i2;
        this.inviteeUserInfo = user2;
        this.shareRevenueSetting = i3;
        this.shareRevenueSettingStruct = linkmicShareRevenueSettingStruct;
    }
}
