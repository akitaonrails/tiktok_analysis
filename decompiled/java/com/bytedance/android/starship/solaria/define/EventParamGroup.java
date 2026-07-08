package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EventParamGroup implements Serializable {

    @C09CT("event_group_name")
    public final String eventGroupName;

    @C09CT("event_param")
    public List<EventParam> eventParams;

    public EventParamGroup() {
        this(null, null);
    }

    public final void setEventParams(List<EventParam> list) {
        this.eventParams = list;
    }

    public EventParamGroup(String str, List<EventParam> list) {
        this.eventGroupName = str;
        this.eventParams = list;
    }
}
