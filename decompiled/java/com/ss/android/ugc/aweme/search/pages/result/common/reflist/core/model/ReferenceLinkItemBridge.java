package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ReferenceLinkItemBridge implements Serializable {

    @C09CT("icon_uri")
    public final String icon;

    @C09CT("link_url")
    public final String link;

    @C09CT("name")
    public final String name;

    @C09CT("summary")
    public final String snippet;

    @C09CT("title")
    public final String title;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferenceLinkItemBridge(link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", snippet=");
        sbLIZ.append(this.snippet);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReferenceLinkItemBridge() {
        this("", "", "", "", "");
    }

    public ReferenceLinkItemBridge(String str, String str2, String str3, String str4, String str5) {
        this.link = str;
        this.name = str2;
        this.title = str3;
        this.snippet = str4;
        this.icon = str5;
    }
}
