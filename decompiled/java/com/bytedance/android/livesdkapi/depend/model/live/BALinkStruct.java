package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class BALinkStruct implements Serializable {

    @C09CT("ba_link_data")
    public String baLinkData;

    @C09CT("ba_link_permission")
    public int baLinkPermission;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BALinkStruct{baLinkPermission=");
        sbLIZ.append(this.baLinkPermission);
        sbLIZ.append(", baLinkData='");
        sbLIZ.append(this.baLinkData);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getBaLinkData() {
        return this.baLinkData;
    }

    public int getBaLinkPermission() {
        return this.baLinkPermission;
    }

    public void setBaLinkData(String str) {
        this.baLinkData = str;
    }

    public void setBaLinkPermission(int i) {
        this.baLinkPermission = i;
    }
}
