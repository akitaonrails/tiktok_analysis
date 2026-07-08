package com.ss.android.ugc.aweme.nimblecard.tako.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class Event {

    @C09CT("type")
    public final String action;

    @C09CT("condition")
    public final String condition;

    @C09CT("event")
    public final String eventName;

    @C09CT("isOnce")
    public final Boolean isOnce;

    @C09CT("params")
    public final Map<String, Object> params;

    public Event() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return Intrinsics.LJFF(this.eventName, event.eventName) && Intrinsics.LJFF(this.params, event.params) && Intrinsics.LJFF(this.action, event.action) && Intrinsics.LJFF(this.condition, event.condition) && Intrinsics.LJFF(this.isOnce, event.isOnce);
    }

    public final int hashCode() {
        String str = this.eventName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.params;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.action;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.condition;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOnce;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Event(eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", condition=");
        sbLIZ.append(this.condition);
        sbLIZ.append(", isOnce=");
        sbLIZ.append(this.isOnce);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Event(String str, Map<String, ? extends Object> map, String str2, String str3, Boolean bool) {
        this.eventName = str;
        this.params = map;
        this.action = str2;
        this.condition = str3;
        this.isOnce = bool;
    }
}
