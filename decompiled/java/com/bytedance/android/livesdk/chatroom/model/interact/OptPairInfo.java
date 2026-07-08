package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OptPairInfo {

    @C09CT("expected_time_sec")
    public long expectedTimeSec;

    @C09CT("mapping_id")
    public long mappingId;

    @C09CT("opt_pair_status")
    public int optPairStatus;

    @C09CT("opt_pair_type")
    public long optPairType;

    @C09CT("team_info")
    public List<TeamInfo> teamInfo = new ArrayList();

    public static final class TeamInfo {

        @C09CT("team_id")
        public long teamId;

        @C09CT("user_id")
        public List<Long> userId = new ArrayList();
    }
}
