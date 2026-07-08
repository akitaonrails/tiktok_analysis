package com.ss.android.ugc.aweme.ml.feature.events;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EventWithPortraitsConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("events")
    public List<EventWithPortraitsOneItem> events;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", events=");
        sbLIZ.append(this.events);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<EventWithPortraitsOneItem> getEvents() {
        return this.events;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setEvents(List<EventWithPortraitsOneItem> list) {
        this.events = list;
    }
}
