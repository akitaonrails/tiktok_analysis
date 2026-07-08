package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityConfigItem {

    @C09CT("activity_sub_type")
    public int activitySubType;

    @C09CT("activity_sub_type_int")
    public int activitySubTypeInt;

    @C09CT("activity_type")
    public int activityType;

    @C09CT("activity_type_int")
    public int activityTypeInt;

    @C09CT("chosen")
    public boolean chosen;

    @C09CT("text")
    public String text = "";

    @C09CT("extra_text")
    public String extraText = "";

    @C09CT("activity_sub_value")
    public List<String> activitySubValue = new ArrayList();
}
