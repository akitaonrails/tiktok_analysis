package com.bytedance.i18n.location.api;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class AreaModel {

    @C09CT("ASCIName")
    public final String asciiName;

    @C09CT("Code")
    public final String code;

    @C09CT("GeoNameID")
    public final Long geoNameId;

    @C09CT("LocalID")
    public final String localId;

    @C09CT("Name")
    public final String name;

    public AreaModel() {
        this(null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AreaModel(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", geoNameId=");
        sbLIZ.append(this.geoNameId);
        sbLIZ.append(", asciiName=");
        sbLIZ.append(this.asciiName);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", localId=");
        sbLIZ.append(this.localId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AreaModel(String str, Long l, String str2, String str3, String str4) {
        this.code = str;
        this.geoNameId = l;
        this.asciiName = str2;
        this.name = str3;
        this.localId = str4;
    }
}
