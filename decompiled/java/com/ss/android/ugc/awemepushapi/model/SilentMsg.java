package com.ss.android.ugc.awemepushapi.model;

import X.C09CT;
import X.C2188811AlT;
import X.C815080VyE;
import X.EnumC048500Fn;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class SilentMsg implements Serializable {
    public static final C815080VyE Companion = new Object() { // from class: X.0VyE
    };
    public String data;

    @C09CT("silent_scene")
    public final String scene;
    public int type;

    public SilentMsg() {
        this("LANDING_INBOX");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SilentMsg(type: ");
        sbLIZ.append(this.type);
        sbLIZ.append(", scene: ");
        sbLIZ.append(this.scene);
        sbLIZ.append(", data: ");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SilentMsg(String str) {
        this.scene = str;
        this.type = EnumC048500Fn.SILENT_PUSH_DEFAULT.ordinal();
        this.data = "";
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
