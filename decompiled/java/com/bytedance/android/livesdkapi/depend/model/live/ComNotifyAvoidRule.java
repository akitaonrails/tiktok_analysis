package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class ComNotifyAvoidRule {
    public static final TypeAdapter ADAPTER = new ComNotifyAvoidRule_OptTypeAdapter(NormalGson.singleton());

    @C09CT("component")
    public int component;

    @C09CT("range_id")
    public String rangeId = "";

    @C09CT("range_id_room_map")
    public Map<Integer, String> rangeIdRoomMap = new LinkedHashMap();

    @C09CT("avoid_scene")
    public List<String> avoidScene = new ArrayList();

    @C09CT("avoid_scene_applied")
    public List<Integer> avoidSceneApplied = new ArrayList();
}
