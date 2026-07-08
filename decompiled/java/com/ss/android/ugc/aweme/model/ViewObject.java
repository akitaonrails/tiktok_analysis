package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ViewObject implements Serializable {

    @C09CT("children")
    public final List<ViewObject> children;

    @C09CT("events")
    public final Map<String, EventItem> events;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("name")
    public final String name;

    @C09CT("props")
    public final Map<String, Object> props;

    public ViewObject(String str, Map<String, ? extends Object> map, List<ViewObject> list, Map<String, EventItem> map2, String str2) {
        this.name = str;
        this.props = map;
        this.children = list;
        this.events = map2;
        this.id = str2;
    }

    public ViewObject(String str, Map map, List list, Map map2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C2097608Jq.LJ() : map2, (i & 16) != 0 ? null : str2);
    }
}
