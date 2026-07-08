package com.ss.android.ugc.aweme.ecommerce.showcase.mix.event;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMixJumpLynxEvent extends BaseStoreOverlayEvent {

    @C09CT("data")
    public final n data;

    @C09CT("schema")
    public final String schema;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("zIndex")
    public final Integer zIndex;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreMixJumpLynxEvent(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", zIndex=");
        sbLIZ.append(this.zIndex);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        BaseStoreOverlayEvent baseStoreOverlayEvent;
        String str = this.id;
        String str2 = null;
        if ((obj instanceof StoreMixJumpLynxEvent) && (baseStoreOverlayEvent = (BaseStoreOverlayEvent) obj) != null) {
            str2 = baseStoreOverlayEvent.id;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public StoreMixJumpLynxEvent(String str, Integer num, n nVar, Long l) {
        this.schema = str;
        this.zIndex = num;
        this.data = nVar;
        this.timestamp = l;
    }
}
