package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes27.dex */
public final class DiversionEntranceRes {

    @C09CT("config")
    public final DiversionEntranceResCfg config;

    @C09CT("name")
    public final String name;

    @C09CT("type")
    public final String type;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiversionEntranceRes(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", config=");
        sbLIZ.append(this.config);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DiversionEntranceRes(String str, String str2, DiversionEntranceResCfg diversionEntranceResCfg) {
        this.name = str;
        this.type = str2;
        this.config = diversionEntranceResCfg;
    }
}
