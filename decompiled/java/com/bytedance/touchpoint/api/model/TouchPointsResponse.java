package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TouchPointsResponse {

    @C09CT("dynamic_popups")
    public List<TouchPoint> dynamicPops;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("task_events")
    public List<TaskEvent> taskEvents;

    @C09CT("touch_points")
    public List<TouchPoint> touchPoints;
}
