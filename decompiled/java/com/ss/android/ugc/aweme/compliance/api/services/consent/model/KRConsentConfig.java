package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class KRConsentConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("agree_all")
    public final String agreeAll;

    @C09CT("business")
    public final String business;

    @C09CT("button")
    public final String button;

    @C09CT("checkboxes")
    public final List<KrConsentCheckbox> checkboxes;

    @C09CT("desc")
    public final String desc;

    @C09CT("policy_version")
    public final String policyVersion;

    @C09CT("title")
    public final String title;

    public KRConsentConfig() {
        this(null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KRConsentConfig)) {
            return false;
        }
        KRConsentConfig kRConsentConfig = (KRConsentConfig) obj;
        return Intrinsics.LJFF(this.business, kRConsentConfig.business) && Intrinsics.LJFF(this.policyVersion, kRConsentConfig.policyVersion) && Intrinsics.LJFF(this.title, kRConsentConfig.title) && Intrinsics.LJFF(this.desc, kRConsentConfig.desc) && Intrinsics.LJFF(this.button, kRConsentConfig.button) && Intrinsics.LJFF(this.agreeAll, kRConsentConfig.agreeAll) && Intrinsics.LJFF(this.checkboxes, kRConsentConfig.checkboxes);
    }

    public int hashCode() {
        String str = this.business;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.policyVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.button;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agreeAll;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<KrConsentCheckbox> list = this.checkboxes;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KRConsentConfig(business=");
        sbLIZ.append(this.business);
        sbLIZ.append(", policyVersion=");
        sbLIZ.append(this.policyVersion);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", agreeAll=");
        sbLIZ.append(this.agreeAll);
        sbLIZ.append(", checkboxes=");
        sbLIZ.append(this.checkboxes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KRConsentConfig(String str, String str2, String str3, String str4, String str5, String str6, List<KrConsentCheckbox> list) {
        this.business = str;
        this.policyVersion = str2;
        this.title = str3;
        this.desc = str4;
        this.button = str5;
        this.agreeAll = str6;
        this.checkboxes = list;
    }
}
