package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ComponentParam;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class GetCommonChannelRequest implements Serializable {

    @C09CT("component_param_list")
    public final List<ComponentParam> componentParamList;

    @C09CT("extra_param")
    public final HashMap<String, Object> extraParam;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("traffic_param")
    public final HashMap<String, Object> trafficParam;

    public GetCommonChannelRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public GetCommonChannelRequest(String str, HashMap<String, Object> map, List<ComponentParam> list, HashMap<String, Object> map2, String str2) {
        this.scene = str;
        this.extraParam = map;
        this.componentParamList = list;
        this.trafficParam = map2;
        this.sessionId = str2;
    }

    public GetCommonChannelRequest(String str, HashMap map, List list, HashMap map2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new HashMap() : map, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : map2, (i & 16) == 0 ? str2 : null);
    }
}
