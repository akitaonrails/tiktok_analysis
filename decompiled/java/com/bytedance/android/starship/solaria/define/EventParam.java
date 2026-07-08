package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class EventParam implements Serializable {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("event_param_field")
    public final String field;

    @C09CT("event_param_filter")
    public final String filter;
    public transient int tag;

    @C09CT("type")
    public final int type;

    public EventParam() {
        this(null, 0, null, null, 0);
    }

    public final void setTag(int i) {
        this.tag = i;
    }

    public EventParam(String str, int i, String str2, String str3, int i2) {
        this.eventName = str;
        this.type = i;
        this.field = str2;
        this.filter = str3;
        this.tag = i2;
    }
}
