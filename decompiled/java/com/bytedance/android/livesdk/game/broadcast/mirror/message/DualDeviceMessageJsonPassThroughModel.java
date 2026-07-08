package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceMessageJsonPassThroughModel {

    @C09CT("name")
    public String name;

    @C09CT("param")
    public n param;

    public DualDeviceMessageJsonPassThroughModel() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name = ");
        sbLIZ.append(this.name);
        sbLIZ.append(",param = ");
        sbLIZ.append(this.param);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DualDeviceMessageJsonPassThroughModel(String str, n nVar) {
        this.name = str;
        this.param = nVar;
    }
}
