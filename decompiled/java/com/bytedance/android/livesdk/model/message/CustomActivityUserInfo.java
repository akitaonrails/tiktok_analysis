package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class CustomActivityUserInfo {

    @C09CT("avatar")
    public UserAvatar avatar;

    @C09CT("friendship")
    public int friendship;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("room_info")
    public CustomActivityLiveRoomInfo roomInfo;

    @C09CT("id_sec")
    public String idSec = "";

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("handle_name")
    public String handleName = "";
}
