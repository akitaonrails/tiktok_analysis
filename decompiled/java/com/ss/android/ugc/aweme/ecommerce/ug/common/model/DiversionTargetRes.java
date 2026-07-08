package com.ss.android.ugc.aweme.ecommerce.ug.common.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes27.dex */
public final class DiversionTargetRes {

    @C09CT("blocking")
    public final String blocking;

    @C09CT("config")
    public final DiversionTargetResCfg config;

    @C09CT("name")
    public final String name;

    @C09CT("type")
    public final String type;

    @C09CT("uuid")
    public final String uuid;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiversionTargetRes(uuid=");
        sbLIZ.append(this.uuid);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", config=");
        sbLIZ.append(this.config);
        sbLIZ.append(", blocking=");
        sbLIZ.append(this.blocking);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DiversionTargetRes(String str, String str2, String str3, DiversionTargetResCfg diversionTargetResCfg, String str4) {
        this.uuid = str;
        this.name = str2;
        this.type = str3;
        this.config = diversionTargetResCfg;
        this.blocking = str4;
    }
}
