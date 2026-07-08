package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class DialogButtonAction implements Serializable {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("route")
    public final String route;

    public final String getEventName() {
        return this.eventName;
    }

    public final String getRoute() {
        return this.route;
    }
}
