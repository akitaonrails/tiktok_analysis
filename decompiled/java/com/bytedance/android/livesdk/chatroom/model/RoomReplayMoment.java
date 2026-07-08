package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class RoomReplayMoment {

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("moment_end_time")
    public long momentEndTime;

    @C09CT("moment_start_time")
    public long momentStartTime;

    @C09CT("push_status")
    public long pushStatus;

    @C09CT("reason")
    public RoomReplayReason reason;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("vid")
    public String vid = "";

    @C09CT("play_url")
    public String playUrl = "";
}
