package com.bytedance.android.starship.engine.graph.foundation;

import X.C09CT;
import X.C1307220k7c;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes21.dex */
public final class Packet {

    @C09CT("data")
    public final Object data;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Packet(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Packet() {
        this(C1307220k7c.LIZ.incrementAndGet(), null);
    }

    public Packet(Object obj) {
        this(C1307220k7c.LIZ.incrementAndGet(), obj);
    }

    public Packet(long j, Object obj) {
        this.id = j;
        this.data = obj;
    }
}
