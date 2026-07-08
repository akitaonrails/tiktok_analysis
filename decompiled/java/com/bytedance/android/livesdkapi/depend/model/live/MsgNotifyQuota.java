package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MsgNotifyQuota {

    @C09CT("component_type")
    public int componentType;

    @C09CT("default_count")
    public long defaultCount;

    @C09CT("position_count_map")
    public Map<String, Long> positionCountMap = new LinkedHashMap();
}
