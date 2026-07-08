package com.ss.android.ugc.profile.business.profile.popup.outreach.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class EventParam {

    @C09CT("biz_params")
    public final Map<String, String> bizParams;

    @C09CT("event")
    public final String event;

    @C09CT("type")
    public final Integer type;

    public EventParam() {
        this(null, null, null);
    }

    public EventParam(Map<String, String> map, String str, Integer num) {
        this.bizParams = map;
        this.event = str;
        this.type = num;
    }
}
