package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PolicyBodyLinkListUPSdk implements Serializable {

    @C09CT("approve")
    public final Boolean approve;

    @C09CT("color")
    public final String color;

    @C09CT("dismiss")
    public final Boolean dismiss;

    @C09CT("extra")
    public final String extra;

    @C09CT("font")
    public final String font;

    @C09CT("link")
    public final String link;

    @C09CT("link_type")
    public final String linkType;

    @C09CT("name")
    public final String name;

    @C09CT("operation")
    public final Integer operation;

    @C09CT("upgrade")
    public final Boolean upgrade;

    public PolicyBodyLinkListUPSdk() {
        this("", "", "", Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, "", "UIText1", null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PolicyBodyLinkListUPSdk(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", linkType=");
        sbLIZ.append(this.linkType);
        sbLIZ.append(", approve=");
        sbLIZ.append(this.approve);
        sbLIZ.append(", operation=");
        sbLIZ.append(this.operation);
        sbLIZ.append(", dismiss=");
        sbLIZ.append(this.dismiss);
        sbLIZ.append(", upgrade=");
        sbLIZ.append(this.upgrade);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PolicyBodyLinkListUPSdk(String str, String str2, String str3, Boolean bool, Integer num, Boolean bool2, Boolean bool3, String str4, String str5, String str6) {
        this.name = str;
        this.link = str2;
        this.linkType = str3;
        this.approve = bool;
        this.operation = num;
        this.dismiss = bool2;
        this.upgrade = bool3;
        this.extra = str4;
        this.color = str5;
        this.font = str6;
    }
}
