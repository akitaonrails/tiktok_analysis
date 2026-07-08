package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2097608Jq;
import X.EnumC1230500i7s;
import X.EnumC1230590i81;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.publicgroup.data.JoinApplyInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupJoinRequestV2 {

    @C09CT("apply_info")
    public final JoinApplyInfo applyInfo;

    @C09CT("conv_short_id")
    public final long conversationShortId;

    @C09CT("invite_id")
    public final String inviteId;

    @C09CT("join_event_info")
    public final Map<String, String> joinEventInfo;

    @C09CT("join_group_source")
    public final String joinGroupSource;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public GroupJoinRequestV2() {
        this("", 0L, EnumC1230590i81.JOIN_GROUP_SCENE_UNKNOWN.getValue(), new JoinApplyInfo(""), EnumC1230500i7s.UNKNOWN.getValue(), C2097608Jq.LJ());
    }

    public GroupJoinRequestV2(String str, long j, int i, JoinApplyInfo joinApplyInfo, String str2, Map<String, String> map) {
        this.inviteId = str;
        this.conversationShortId = j;
        this.scene = i;
        this.applyInfo = joinApplyInfo;
        this.joinGroupSource = str2;
        this.joinEventInfo = map;
    }
}
