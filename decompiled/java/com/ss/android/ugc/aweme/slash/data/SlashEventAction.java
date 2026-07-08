package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import X.C1180220gom;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashEventAction implements Serializable {
    public static final C1180220gom Companion = new Object() { // from class: X.0gom
    };

    @C09CT("service_type")
    public final String serviceType;

    @C09CT("slash_param")
    public final SlashParam slashParam;

    @C09CT("type")
    public final String type;

    public SlashEventAction() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashEventAction(serviceType=");
        sbLIZ.append(this.serviceType);
        sbLIZ.append(", slashParam=");
        sbLIZ.append(this.slashParam);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashEventAction(String str, SlashParam slashParam, String str2) {
        this.serviceType = str;
        this.slashParam = slashParam;
        this.type = str2;
    }
}
