package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VirtualWaitingUser {

    @C09CT("avatars")
    public List<ImageModel> avatars = new ArrayList();

    @C09CT("send_timestamp")
    public long sendTimestamp;

    @C09CT("send_user_id")
    public long sendUserId;
}
