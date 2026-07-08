package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class PushSelectedSubPage {

    @C09CT("description")
    public final String description = "Turn on push notification from:";

    @C09CT("select_list")
    public final List<PushSelectedSubPageItem> options = new ArrayList();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushSelectedSubPage(description='");
        sbLIZ.append(this.description);
        sbLIZ.append("', options=");
        sbLIZ.append(this.options);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
