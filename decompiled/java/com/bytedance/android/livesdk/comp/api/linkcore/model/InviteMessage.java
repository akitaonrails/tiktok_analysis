package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes16.dex */
public final class InviteMessage {
    public final CustomLinkMessage customMessage;
    public final int inviteSource;
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final User inviteeUserInfo;
    public final LinkUser inviter;
    public final LayoutDSLConfig layoutDSLConfig;
    public final Integer shareRevenueSetting;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteMessage(inviter=");
        sbLIZ.append(this.inviter);
        sbLIZ.append(", inviteeFixedMicInfo=");
        sbLIZ.append(this.inviteeFixedMicInfo);
        sbLIZ.append(", layoutDSLConfig=");
        sbLIZ.append(this.layoutDSLConfig);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(", inviteSource=");
        sbLIZ.append(this.inviteSource);
        sbLIZ.append(", inviteeUserInfo=");
        sbLIZ.append(this.inviteeUserInfo);
        sbLIZ.append(", shareRevenueSetting=");
        sbLIZ.append(this.shareRevenueSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InviteMessage(LinkUser linkUser, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customLinkMessage, int i, User user, Integer num) {
        this.inviter = linkUser;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.layoutDSLConfig = layoutDSLConfig;
        this.customMessage = customLinkMessage;
        this.inviteSource = i;
        this.inviteeUserInfo = user;
        this.shareRevenueSetting = num;
    }
}
