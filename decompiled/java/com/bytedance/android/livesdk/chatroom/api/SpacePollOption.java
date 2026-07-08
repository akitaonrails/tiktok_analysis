package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SpacePollOption {

    @C09CT("option_id")
    public long optionId;

    @C09CT("votes")
    public long votes;

    @C09CT("text")
    public String text = "";

    @C09CT("poll_user_list")
    public List<User> pollUserList = new ArrayList();
}
