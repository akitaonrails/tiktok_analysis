package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes4.dex */
public final class VoterListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("voter_info")
        public List<RankUser> voterInfo = new ArrayList();

        @C09CT("is_same_live_map")
        public Map<Long, Boolean> isSameLiveMap = new LinkedHashMap();

        @C09CT("is_anonymous")
        public Map<Long, Boolean> isAnonymous = new LinkedHashMap();
    }
}
