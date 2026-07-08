package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class BizJoinDirectParams {

    @C09CT("join_direct_type")
    public int joinDirectType;

    @C09CT("link_type")
    public long linkType;

    @C09CT("outside_room_invite_source")
    public int outsideRoomInviteSource;

    @C09CT("reply_type")
    public int replyType;

    @C09CT("share_revenue_setting")
    public int shareRevenueSetting;

    @C09CT("share_revenue_setting_ratio")
    public int shareRevenueSettingRatio;

    @C09CT("user_return_type")
    public int userReturnType;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizJoinDirectParams(linkType=");
        sbLIZ.append(this.linkType);
        sbLIZ.append(", replyType=");
        sbLIZ.append(this.replyType);
        sbLIZ.append(", userReturnType=");
        sbLIZ.append(this.userReturnType);
        sbLIZ.append(", shareRevenueSetting=");
        sbLIZ.append(this.shareRevenueSetting);
        sbLIZ.append(", outsideRoomInviteSource=");
        sbLIZ.append(this.outsideRoomInviteSource);
        sbLIZ.append(", joinDirectType=");
        sbLIZ.append(this.joinDirectType);
        sbLIZ.append(", shareRevenueSettingRatio=");
        sbLIZ.append(this.shareRevenueSettingRatio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizJoinDirectParams() {
        this(0L, 0, 0, 0, 0, 0, 0);
    }

    public BizJoinDirectParams(long j, int i, int i2, int i3, int i4, int i5, int i6) {
        this.linkType = j;
        this.replyType = i;
        this.userReturnType = i2;
        this.shareRevenueSetting = i3;
        this.outsideRoomInviteSource = i4;
        this.joinDirectType = i5;
        this.shareRevenueSettingRatio = i6;
    }
}
