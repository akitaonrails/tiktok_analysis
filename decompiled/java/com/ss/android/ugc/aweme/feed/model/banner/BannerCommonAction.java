package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerCommonAction implements Serializable {

    @C09CT("icon")
    public String icon;

    @C09CT("schema")
    public String schema;

    @C09CT("text")
    public String text;

    public BannerCommonAction() {
        this("", "", null);
    }

    public final BannerCommonAction copy(String str, String str2, String str3) {
        return new BannerCommonAction(str, str2, str3);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerCommonAction(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setText(String str) {
        this.text = str;
    }

    public BannerCommonAction(String str, String str2, String str3) {
        this.schema = str;
        this.text = str2;
        this.icon = str3;
    }
}
