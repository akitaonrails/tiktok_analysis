package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinChannelBase {

    @C09CT("bulletin_board_id")
    public final String bulletinBoardId;

    @C09CT("channel_access_control")
    public final String channelAccessControl;

    @C09CT("channel_command_version")
    public final Long channelCommandVersion;

    @C09CT("channel_owner")
    public final String channelOwner;

    @C09CT("channel_status_code")
    public final Integer channelStatusCode;

    @C09CT("channel_type")
    public final Long channelType;

    @C09CT("channel_version")
    public final Long channelVersion;

    @C09CT("identity_type")
    public final Integer identityType;

    @C09CT("subscribe_status_code")
    public final Integer subscribeStatusCode;

    public BulletinChannelBase(String str, Long l, Long l2, String str2, Integer num, Integer num2, String str3, Integer num3, Long l3) {
        this.bulletinBoardId = str;
        this.channelVersion = l;
        this.channelCommandVersion = l2;
        this.channelOwner = str2;
        this.channelStatusCode = num;
        this.identityType = num2;
        this.channelAccessControl = str3;
        this.subscribeStatusCode = num3;
        this.channelType = l3;
    }
}
