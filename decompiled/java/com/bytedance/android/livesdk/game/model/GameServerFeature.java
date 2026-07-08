package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GameServerFeature {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("value")
    public String value = "";

    @C09CT("value_map")
    public Map<String, String> valueMap = new LinkedHashMap();
}
