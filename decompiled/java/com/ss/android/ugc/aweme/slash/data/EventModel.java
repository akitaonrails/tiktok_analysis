package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class EventModel implements Serializable {

    @C09CT("service_type")
    public final String serviceType;

    @C09CT("slash_param")
    public final SlashParam slashParam;

    public EventModel() {
        this(null, null);
    }

    public EventModel(String str, SlashParam slashParam) {
        this.serviceType = str;
        this.slashParam = slashParam;
    }
}
