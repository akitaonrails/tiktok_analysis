package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberInfo {

    @C09CT("send_subs")
    public long sendSubs;

    @C09CT("sub_info")
    public SubInfo subInfo;

    @C09CT("subscriber")
    public User subscriber;
}
