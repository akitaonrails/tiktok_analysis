package com.ss.android.ugc.aweme.fangroup.settings;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupChatConfig {

    @C09CT("group_admin_limit")
    public final Map<String, Integer> groupAdminConfigMap;

    @C09CT("group_member_limit")
    public final Map<String, Integer> groupMemberConfigMap;

    @C09CT("group_number_limit")
    public final Map<String, Integer> groupNumberConfigMap;

    public GroupChatConfig() {
        this(null, null, null, 7, null);
    }

    public GroupChatConfig(Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        this.groupMemberConfigMap = map;
        this.groupNumberConfigMap = map2;
        this.groupAdminConfigMap = map3;
    }

    public GroupChatConfig(Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("default", 32), new Pair("fan_group", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)), new Pair("campus_group", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))) : map, (i & 2) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("default", Integer.MAX_VALUE), new Pair("fan_group", 20), new Pair("campus_group", 5)) : map2, (i & 4) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("default", 5), new Pair("fan_group", 5), new Pair("campus_group", 5)) : map3);
    }
}
