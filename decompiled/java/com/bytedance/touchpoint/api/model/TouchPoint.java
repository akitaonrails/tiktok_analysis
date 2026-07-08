package com.bytedance.touchpoint.api.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class TouchPoint {
    public boolean LIZ;

    @C09CT("ab_versions")
    public String abVersions;

    @C09CT("event_params")
    public Map<String, String> customEventParams;

    @C09CT("data")
    public String data;

    @C09CT("enable_record")
    public Boolean enableRecord;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("launch_plan_id")
    public Integer launchPlanId;

    @C09CT("preview_schema")
    public String previewSchema;

    @C09CT("product")
    public String product;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("touchpoint_id")
    public int touchPointId;

    @C09CT("touchpoint_name")
    public String touchPointName;

    public TouchPoint(int i, String str, Integer num, Map<String, String> map, String str2, String str3, String str4, String str5, String str6, Long l, Boolean bool, boolean z) {
        this.touchPointId = i;
        this.touchPointName = str;
        this.launchPlanId = num;
        this.customEventParams = map;
        this.scene = str2;
        this.abVersions = str3;
        this.previewSchema = str4;
        this.data = str5;
        this.product = str6;
        this.endTime = l;
        this.enableRecord = bool;
        this.LIZ = z;
    }
}
