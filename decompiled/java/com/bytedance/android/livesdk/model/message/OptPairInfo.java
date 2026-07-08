package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OptPairInfo {

    @C09CT("button_notice_type")
    public int buttonNoticeType;

    @C09CT("display_user_list")
    public List<OptPairUser> displayUserList = new ArrayList();

    @C09CT("expected_time_sec")
    public long expectedTimeSec;

    @C09CT("mapping_id")
    public long mappingId;

    @C09CT("opt_pair_type")
    public long optPairType;

    public static final class OptPairUser {

        @C09CT("room_id")
        public long roomId;

        @C09CT("user")
        public User user;
    }
}
