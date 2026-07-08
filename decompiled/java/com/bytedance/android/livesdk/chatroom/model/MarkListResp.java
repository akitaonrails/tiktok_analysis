package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class MarkListResp {

    @C09CT("data")
    public List<MarkedUser> data = new ArrayList();

    public static final class MarkedUser {

        @C09CT("user_info")
        public User userInfo;

        @C09CT("user_tag")
        public String userTag = "";
    }
}
