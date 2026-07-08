package webcast.api.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeUserStruct {

    @C09CT("avatar_url")
    public NoticeUrlStruct avatarUrl;

    @C09CT("follow_status")
    public long followStatus;

    @C09CT("is_living")
    public boolean isLiving;

    @C09CT("jump_type")
    public int jumpType;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("user_id")
    public long userId;

    @C09CT("user_room_id")
    public long userRoomId;
}
