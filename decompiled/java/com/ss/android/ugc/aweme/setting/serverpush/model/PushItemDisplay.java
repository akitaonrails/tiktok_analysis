package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes32.dex */
public final class PushItemDisplay {

    @C09CT("display_type")
    public final int displayType = 1;

    @C09CT("icon_android")
    public final String icon = "";

    @C09CT("title")
    public final String title = "";

    @C09CT("description")
    public final String description = "";

    public final boolean LIZ() {
        if (this.icon.length() <= 0) {
            return false;
        }
        int i = this.displayType;
        return i % 10 >= 6 || i % 10 == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushItemDisplay(displayType=");
        sbLIZ.append(this.displayType);
        sbLIZ.append(", icon='");
        sbLIZ.append(this.icon);
        sbLIZ.append("', title='");
        sbLIZ.append(this.title);
        sbLIZ.append("', description='");
        sbLIZ.append(this.description);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
