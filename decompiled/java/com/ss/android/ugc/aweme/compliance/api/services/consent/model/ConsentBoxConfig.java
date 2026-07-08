package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ConsentBoxConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("body")
    public final String body;

    @C09CT("body_link_list")
    public final List<InlineLink> bodyLinkList;

    @C09CT("business")
    public final String business;

    @C09CT("buttons")
    public final Map<String, String> buttons;

    @C09CT("policy_version")
    public final String policyVersion;

    @C09CT("title")
    public final String title;

    public ConsentBoxConfig() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentBoxConfig)) {
            return false;
        }
        ConsentBoxConfig consentBoxConfig = (ConsentBoxConfig) obj;
        return Intrinsics.LJFF(this.business, consentBoxConfig.business) && Intrinsics.LJFF(this.policyVersion, consentBoxConfig.policyVersion) && Intrinsics.LJFF(this.title, consentBoxConfig.title) && Intrinsics.LJFF(this.body, consentBoxConfig.body) && Intrinsics.LJFF(this.bodyLinkList, consentBoxConfig.bodyLinkList) && Intrinsics.LJFF(this.buttons, consentBoxConfig.buttons);
    }

    public int hashCode() {
        String str = this.business;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.policyVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.body;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<InlineLink> list = this.bodyLinkList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.buttons;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsentBoxConfig(business=");
        sbLIZ.append(this.business);
        sbLIZ.append(", policyVersion=");
        sbLIZ.append(this.policyVersion);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", body=");
        sbLIZ.append(this.body);
        sbLIZ.append(", bodyLinkList=");
        sbLIZ.append(this.bodyLinkList);
        sbLIZ.append(", buttons=");
        sbLIZ.append(this.buttons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ConsentBoxConfig(String str, String str2, String str3, String str4, List<InlineLink> list, Map<String, String> map) {
        this.business = str;
        this.policyVersion = str2;
        this.title = str3;
        this.body = str4;
        this.bodyLinkList = list;
        this.buttons = map;
    }
}
