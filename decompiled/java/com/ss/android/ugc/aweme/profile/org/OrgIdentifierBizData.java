package com.ss.android.ugc.aweme.profile.org;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class OrgIdentifierBizData extends BizBaseData {

    @C09CT("associate_account_header")
    public final String associateAccountHeader;

    @C09CT("associate_account_info")
    public final AssociateAccountInfo associateAccountInfo;

    @C09CT("org_account_category")
    public final String orgAccountCategory;

    @C09CT("org_account_illustration")
    public final String orgAccountIllustration;

    @C09CT("org_account_name")
    public final String orgAccountName;

    @C09CT("org_account_conversion_trial_tag")
    public final Integer orgAccountTrialTag;

    @C09CT("tt_account_type")
    public final Integer orgAccountType;

    @C09CT("panel_header")
    public final String panelHeader;

    @C09CT("panel_icon")
    public final PanelIcon panelIcon;

    public OrgIdentifierBizData() {
        this(0, null, null, null, null, null, null, null, 0);
    }

    public final OrgIdentifierBizData copy(Integer num, String str, String str2, String str3, PanelIcon panelIcon, String str4, AssociateAccountInfo associateAccountInfo, String str5, Integer num2) {
        return new OrgIdentifierBizData(num, str, str2, str3, panelIcon, str4, associateAccountInfo, str5, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrgIdentifierBizData)) {
            return false;
        }
        OrgIdentifierBizData orgIdentifierBizData = (OrgIdentifierBizData) obj;
        return Intrinsics.LJFF(this.orgAccountType, orgIdentifierBizData.orgAccountType) && Intrinsics.LJFF(this.panelHeader, orgIdentifierBizData.panelHeader) && Intrinsics.LJFF(this.orgAccountName, orgIdentifierBizData.orgAccountName) && Intrinsics.LJFF(this.orgAccountCategory, orgIdentifierBizData.orgAccountCategory) && Intrinsics.LJFF(this.panelIcon, orgIdentifierBizData.panelIcon) && Intrinsics.LJFF(this.associateAccountHeader, orgIdentifierBizData.associateAccountHeader) && Intrinsics.LJFF(this.associateAccountInfo, orgIdentifierBizData.associateAccountInfo) && Intrinsics.LJFF(this.orgAccountIllustration, orgIdentifierBizData.orgAccountIllustration) && Intrinsics.LJFF(this.orgAccountTrialTag, orgIdentifierBizData.orgAccountTrialTag);
    }

    public int hashCode() {
        Integer num = this.orgAccountType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.panelHeader;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orgAccountName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orgAccountCategory;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PanelIcon panelIcon = this.panelIcon;
        int iHashCode5 = (iHashCode4 + (panelIcon == null ? 0 : panelIcon.hashCode())) * 31;
        String str4 = this.associateAccountHeader;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AssociateAccountInfo associateAccountInfo = this.associateAccountInfo;
        int iHashCode7 = (iHashCode6 + (associateAccountInfo == null ? 0 : associateAccountInfo.hashCode())) * 31;
        String str5 = this.orgAccountIllustration;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.orgAccountTrialTag;
        return iHashCode8 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrgIdentifierBizData(orgAccountType=");
        sbLIZ.append(this.orgAccountType);
        sbLIZ.append(", panelHeader=");
        sbLIZ.append(this.panelHeader);
        sbLIZ.append(", orgAccountName=");
        sbLIZ.append(this.orgAccountName);
        sbLIZ.append(", orgAccountCategory=");
        sbLIZ.append(this.orgAccountCategory);
        sbLIZ.append(", panelIcon=");
        sbLIZ.append(this.panelIcon);
        sbLIZ.append(", associateAccountHeader=");
        sbLIZ.append(this.associateAccountHeader);
        sbLIZ.append(", associateAccountInfo=");
        sbLIZ.append(this.associateAccountInfo);
        sbLIZ.append(", orgAccountIllustration=");
        sbLIZ.append(this.orgAccountIllustration);
        sbLIZ.append(", orgAccountTrialTag=");
        sbLIZ.append(this.orgAccountTrialTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAssociateAccountHeader() {
        return this.associateAccountHeader;
    }

    public final AssociateAccountInfo getAssociateAccountInfo() {
        return this.associateAccountInfo;
    }

    public final String getOrgAccountCategory() {
        return this.orgAccountCategory;
    }

    public final String getOrgAccountIllustration() {
        return this.orgAccountIllustration;
    }

    public final String getOrgAccountName() {
        return this.orgAccountName;
    }

    public final Integer getOrgAccountTrialTag() {
        return this.orgAccountTrialTag;
    }

    public final Integer getOrgAccountType() {
        return this.orgAccountType;
    }

    public final String getPanelHeader() {
        return this.panelHeader;
    }

    public final PanelIcon getPanelIcon() {
        return this.panelIcon;
    }

    public OrgIdentifierBizData(Integer num, String str, String str2, String str3, PanelIcon panelIcon, String str4, AssociateAccountInfo associateAccountInfo, String str5, Integer num2) {
        this.orgAccountType = num;
        this.panelHeader = str;
        this.orgAccountName = str2;
        this.orgAccountCategory = str3;
        this.panelIcon = panelIcon;
        this.associateAccountHeader = str4;
        this.associateAccountInfo = associateAccountInfo;
        this.orgAccountIllustration = str5;
        this.orgAccountTrialTag = num2;
    }
}
