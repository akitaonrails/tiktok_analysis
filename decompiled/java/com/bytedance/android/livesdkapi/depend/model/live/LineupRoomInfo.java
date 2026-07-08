package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class LineupRoomInfo {

    @C09CT("backup_room_id")
    public Long backupRoomId;

    @C09CT("backup_room_id_str")
    public String backupRoomIdStr;

    @C09CT("channel_user")
    public User channelUser;

    @C09CT("event_id")
    public Integer eventId;

    @C09CT("event_name")
    public String eventName;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelUser != null) {
            sb.append(", channel_user=");
            sb.append(this.channelUser);
        }
        if (this.eventId != null) {
            sb.append(", event_id=");
            sb.append(this.eventId);
        }
        if (this.eventName != null) {
            sb.append(", event_name=");
            sb.append(this.eventName);
        }
        if (this.backupRoomId != null) {
            sb.append(", backup_room_id=");
            sb.append(this.backupRoomId);
        }
        if (this.backupRoomIdStr != null) {
            sb.append(", backup_room_id_str=");
            sb.append(this.backupRoomIdStr);
        }
        sb.replace(0, 2, "LineupRoomInfo{");
        sb.append('}');
        return sb.toString();
    }
}
