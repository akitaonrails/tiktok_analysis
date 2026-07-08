package com.bytedance.android.livesdk.message.proto;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayControl {

    @C09CT("duration")
    public long duration;

    @C09CT("horizontal_trigger_type")
    public int horizontalTriggerType;

    @C09CT("priority")
    public int priority;

    @C09CT("target_group_show_rst")
    public Map<Integer, ShowResult> targetGroupShowRst = new LinkedHashMap();
}
