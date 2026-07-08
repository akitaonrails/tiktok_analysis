package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public class LinkInviteResult {

    @C09CT("action_id")
    public Long actionId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("channel_id_str")
    public String channelIdStr;

    @C09CT("extra")
    public InviteExtra extra;

    @C09CT("linkmic_id_str")
    public String linkMicIdStr;

    @C09CT("perception_message")
    public PerceptionMessage perceptionMessage;

    @C09CT("perception_status")
    public int perceptionStatus;

    @C09CT("rivals_linkmic_id_str")
    public String rivalsLinkMicIdStr;

    @C09CT("rtc_ext_info")
    public String rtcExtInfo;

    @C09CT("rtc_join_channel")
    public boolean rtcJoinChannel;

    @C09CT("rtc_push_stream")
    public boolean rtcPushStream;

    @C09CT(Scene.SCENE_SERVICE)
    public Long scene;

    @C09CT("vendor")
    public int vendor;
}
