package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityCurrent {

    @C09CT("current_serial_id")
    public int currentSerialId;

    @C09CT("generate_now_ms")
    public long generateNowMs;

    @C09CT("now")
    public int now;

    @C09CT("time_offset")
    public int timeOffset;

    @C09CT("time_zone_offset")
    public int timeZoneOffset;

    @C09CT("phase_name")
    public String phaseName = "";

    @C09CT("activity_code")
    public String activityCode = "";

    @C09CT("runtime_activity")
    public String runtimeActivity = "";

    @C09CT("now_ms")
    public String nowMs = "";

    @C09CT("push_action_types")
    public List<Integer> pushActionTypes = new ArrayList();
}
