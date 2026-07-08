package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public class CreateHighLightResult {

    @C09CT("fragment_id")
    public long fragmentId;

    @C09CT("fragment_id_str")
    public String fragmentIdStr;

    @C09CT("title")
    public String title;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateHighLightResult{fragmentId=");
        sbLIZ.append(this.fragmentId);
        sbLIZ.append(", fragmentIdStr='");
        sbLIZ.append(this.fragmentIdStr);
        sbLIZ.append('\'');
        sbLIZ.append(", title='");
        sbLIZ.append(this.title);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
