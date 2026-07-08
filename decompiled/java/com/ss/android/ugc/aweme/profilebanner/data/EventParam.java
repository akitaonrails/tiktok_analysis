package com.ss.android.ugc.aweme.profilebanner.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EventParam {

    @C09CT("biz_action_params")
    public final Map<String, String> bizActionParams;

    @C09CT("biz_params")
    public final Map<String, String> bizParams;

    @C09CT("event")
    public final String event;

    @C09CT("type")
    public final Integer type;

    public EventParam() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParam)) {
            return false;
        }
        EventParam eventParam = (EventParam) obj;
        return Intrinsics.LJFF(this.bizParams, eventParam.bizParams) && Intrinsics.LJFF(this.bizActionParams, eventParam.bizActionParams) && Intrinsics.LJFF(this.event, eventParam.event) && Intrinsics.LJFF(this.type, eventParam.type);
    }

    public final int hashCode() {
        Map<String, String> map = this.bizParams;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.bizActionParams;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.event;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventParam(bizParams=");
        sbLIZ.append(this.bizParams);
        sbLIZ.append(", bizActionParams=");
        sbLIZ.append(this.bizActionParams);
        sbLIZ.append(", event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EventParam(Map<String, String> map, Map<String, String> map2, String str, Integer num) {
        this.bizParams = map;
        this.bizActionParams = map2;
        this.event = str;
        this.type = num;
    }
}
