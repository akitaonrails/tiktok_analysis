package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OfficialChannelInfo {

    @C09CT("backup_room_id")
    public long backupRoomId;

    @C09CT("backup_room_id_str")
    public String backupRoomIdStr;

    @C09CT("event_name")
    public String channelName;

    @C09CT("channel_user")
    public User channelUser;

    @C09CT("delay_enter_time")
    public Map<Long, Long> delayEnterTime;

    @C09CT("end_timestamp")
    public long endTimeStamp;

    @C09CT("exist_linkmic")
    public boolean existLinkmic;

    @C09CT("forbidden_before_end")
    public long forbiddenBeforeEnd;

    @C09CT("linkmic_type")
    public int linkmicType;

    @C09CT("max_next_time")
    public long maxNextTime;

    @C09CT("role_type")
    public int roleType;

    @C09CT("start_timestamp")
    public long startTimeStamp;
}
