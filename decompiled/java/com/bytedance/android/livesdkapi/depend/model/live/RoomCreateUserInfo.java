package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class RoomCreateUserInfo {

    @C09CT("fans_club_info")
    public User.FansClubInfo fansClubInfo;

    @C09CT("own_room")
    public User.OwnRoom ownRoom;

    @C09CT("subscribe_info")
    public SubscribeInfo subscribeInfo;
}
