package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GuideInfoRequest {

    @C09CT("enter_room_from_outside")
    public boolean enterRoomFromOutside;

    @C09CT("room_id")
    public long roomId;

    @C09CT("scene_type")
    public int sceneType;

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("scene_detail")
    public String sceneDetail = "";

    @C09CT("other_info_map")
    public Map<String, String> otherInfoMap = new LinkedHashMap();

    @C09CT("enter_from_merge")
    public String enterFromMerge = "";

    @C09CT("enter_method")
    public String enterMethod = "";
}
