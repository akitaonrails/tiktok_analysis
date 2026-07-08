package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetUserStatusResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("is_follower_of_anchor")
        public boolean isFollowerOfAnchor;

        @C09CT("user_in_room")
        public boolean userInRoom;
    }
}
