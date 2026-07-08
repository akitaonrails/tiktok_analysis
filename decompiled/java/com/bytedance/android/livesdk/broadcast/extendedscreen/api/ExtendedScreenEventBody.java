package com.bytedance.android.livesdk.broadcast.extendedscreen.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExtendedScreenEventBody {

    @C09CT("event_data")
    public final Map<String, Object> event_data;

    @C09CT("event_time")
    public final long event_time;

    @C09CT("event_type")
    public final String event_type;

    @C09CT("user_id")
    public final String user_id;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedScreenEventBody)) {
            return false;
        }
        ExtendedScreenEventBody extendedScreenEventBody = (ExtendedScreenEventBody) obj;
        return Intrinsics.LJFF(this.user_id, extendedScreenEventBody.user_id) && Intrinsics.LJFF(this.event_type, extendedScreenEventBody.event_type) && this.event_time == extendedScreenEventBody.event_time && Intrinsics.LJFF(this.event_data, extendedScreenEventBody.event_data);
    }

    public final int hashCode() {
        return (((((this.user_id.hashCode() * 31) + this.event_type.hashCode()) * 31) + C786410Ut5.Y2(this.event_time)) * 31) + this.event_data.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtendedScreenEventBody(user_id=");
        sbLIZ.append(this.user_id);
        sbLIZ.append(", event_type=");
        sbLIZ.append(this.event_type);
        sbLIZ.append(", event_time=");
        sbLIZ.append(this.event_time);
        sbLIZ.append(", event_data=");
        sbLIZ.append(this.event_data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExtendedScreenEventBody(String str, String str2, long j, Map<String, ? extends Object> map) {
        this.user_id = str;
        this.event_type = str2;
        this.event_time = j;
        this.event_data = map;
    }
}
