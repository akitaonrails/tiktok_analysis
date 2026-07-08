package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class Action implements Serializable {

    @C09CT("commonLog")
    public final List<String> commonLog;
    public final Map<String, String> mergedParams;

    @C09CT("name")
    public final String name;

    @C09CT("once")
    public final Integer once;

    @C09CT("params")
    public final Map<String, Object> params;

    public final Action copy(String str, Map<String, ? extends Object> map, List<String> list, Integer num, Map<String, String> map2) {
        return new Action(str, map, list, num, map2);
    }

    public Action(String str, Map<String, ? extends Object> map, List<String> list, Integer num, Map<String, String> map2) {
        this.name = str;
        this.params = map;
        this.commonLog = list;
        this.once = num;
        this.mergedParams = map2;
    }

    public Action(String str, Map map, List list, Integer num, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? C2097608Jq.LJ() : map2);
    }
}
