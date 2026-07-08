package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class IMUserOrgAccountInfo implements Serializable {

    @C09CT("icon_key")
    public final String icon;

    @C09CT("org_account_category")
    public final String orgAccountCategory;

    @C09CT("org_account_illustration")
    public final String orgAccountIllustration;

    @C09CT("org_account_name")
    public final String orgAccountName;

    @C09CT("org_account_name_prefix")
    public final String orgAccountNamePrefix;

    @C09CT("org_account_type")
    public final int orgAccountType;

    @C09CT("associate_account")
    public final OrgAssociateAccount orgAssociateAccount;

    @C09CT("org_account_bizline")
    public final String orgBizLines;

    @C09CT("panel_header")
    public final String panelHeader;

    public IMUserOrgAccountInfo() {
        this("", "", 0, "", "", "", "", null, "");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserOrgAccountInfo(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", panelHeader=");
        sbLIZ.append(this.panelHeader);
        sbLIZ.append(", orgAccountType=");
        sbLIZ.append(this.orgAccountType);
        sbLIZ.append(", orgAccountNamePrefix=");
        sbLIZ.append(this.orgAccountNamePrefix);
        sbLIZ.append(", orgAccountName=");
        sbLIZ.append(this.orgAccountName);
        sbLIZ.append(", orgAccountCategory=");
        sbLIZ.append(this.orgAccountCategory);
        sbLIZ.append(", orgAccountIllustration=");
        sbLIZ.append(this.orgAccountIllustration);
        sbLIZ.append(", orgAssociateAccount=");
        sbLIZ.append(this.orgAssociateAccount);
        sbLIZ.append(", orgBizLines=");
        sbLIZ.append(this.orgBizLines);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMUserOrgAccountInfo(String str, String str2, int i, String str3, String str4, String str5, String str6, OrgAssociateAccount orgAssociateAccount, String str7) {
        this.icon = str;
        this.panelHeader = str2;
        this.orgAccountType = i;
        this.orgAccountNamePrefix = str3;
        this.orgAccountName = str4;
        this.orgAccountCategory = str5;
        this.orgAccountIllustration = str6;
        this.orgAssociateAccount = orgAssociateAccount;
        this.orgBizLines = str7;
    }
}
