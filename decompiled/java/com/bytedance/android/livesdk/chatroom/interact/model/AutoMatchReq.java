package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AutoMatchReq {

    @C09CT("auto_match_entrance")
    public int autoMatchEntrance;

    @C09CT("auto_match_scene")
    public int autoMatchScene;

    @C09CT("enter_timestamp_sec")
    public long enterTimestampSec;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("inner_channel_id")
    public long innerChannelId;

    @C09CT("preference_tag")
    public int preferenceTag;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("selected_content_ids")
    public String selectedContentIds = "";

    @C09CT("pool_id")
    public String poolId = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.replace(0, 2, "AutoMatchReq{");
        sb.append('}');
        return sb.toString();
    }
}
