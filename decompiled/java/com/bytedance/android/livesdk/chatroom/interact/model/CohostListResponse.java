package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.GuestUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class CohostListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("group_channel_id")
        public long groupChannelId;

        @C09CT("total_position_count")
        public long totalPositionCount;

        @C09CT("users")
        public List<CohostListUser> users = new ArrayList();

        @C09CT("guest_user_infos")
        public Map<Long, GuestUserInfo> guestUserInfos = new LinkedHashMap();

        @C09CT("cohost_ab_infos")
        public Map<Long, CohostABInfo> cohostAbInfos = new LinkedHashMap();
    }
}
