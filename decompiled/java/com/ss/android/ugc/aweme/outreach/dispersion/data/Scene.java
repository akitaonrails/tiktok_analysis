package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Scene {

    @C09CT("list")
    public final List<String> sceneList;

    @C09CT("type")
    public final String type;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scene(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", sceneList=");
        sbLIZ.append(this.sceneList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Scene(String str, List<String> list) {
        this.type = str;
        this.sceneList = list;
    }
}
