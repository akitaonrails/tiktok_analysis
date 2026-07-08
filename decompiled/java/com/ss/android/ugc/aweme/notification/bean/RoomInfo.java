package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RoomInfo {
    public static final int $stable = 8;

    @C09CT("link_mic")
    public final LinkMic linkMic;

    @C09CT("live_type_screenshot")
    public final Boolean liveTypeScreenshot;

    @C09CT("live_type_social_live")
    public final Boolean liveTypeSocialLive;

    @C09CT("owner_user_id")
    public final Long ownerUserId;

    @C09CT("room_id")
    public final long roomId;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    public RoomInfo() {
        this(0L, null, null, Boolean.FALSE, Boolean.FALSE, null, 0L);
    }

    public RoomInfo(long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic, Long l) {
        this.roomId = j;
        this.title = str;
        this.type = num;
        this.liveTypeSocialLive = bool;
        this.liveTypeScreenshot = bool2;
        this.linkMic = linkMic;
        this.ownerUserId = l;
    }
}
