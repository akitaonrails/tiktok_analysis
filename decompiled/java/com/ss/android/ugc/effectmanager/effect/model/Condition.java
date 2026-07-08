package com.ss.android.ugc.effectmanager.effect.model;

import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Condition implements Serializable {
    public final String asset_id;
    public final String panel_key;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Condition(asset_id=");
        sbLIZ.append(this.asset_id);
        sbLIZ.append(", panel_key=");
        sbLIZ.append(this.panel_key);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Condition(String str, String str2) {
        this.asset_id = str;
        this.panel_key = str2;
    }
}
