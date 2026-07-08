package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class KrConsentCheckbox implements Serializable {
    public static final int $stable = 0;

    @C09CT("business")
    public final String business;

    @C09CT("content")
    public final String content;

    @C09CT("detail")
    public final String detail;

    @C09CT("detail_url")
    public final String detailUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("optional")
    public final boolean optional;

    @C09CT("policy_version")
    public final String policyVersion;

    public KrConsentCheckbox() {
        this(null, null, null, false, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KrConsentCheckbox)) {
            return false;
        }
        KrConsentCheckbox krConsentCheckbox = (KrConsentCheckbox) obj;
        return Intrinsics.LJFF(this.content, krConsentCheckbox.content) && Intrinsics.LJFF(this.detailUrl, krConsentCheckbox.detailUrl) && Intrinsics.LJFF(this.detail, krConsentCheckbox.detail) && this.optional == krConsentCheckbox.optional && Intrinsics.LJFF(this.business, krConsentCheckbox.business) && Intrinsics.LJFF(this.policyVersion, krConsentCheckbox.policyVersion) && Intrinsics.LJFF(this.id, krConsentCheckbox.id);
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.detailUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detail;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.optional)) * 31;
        String str4 = this.business;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.policyVersion;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.id;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KrConsentCheckbox(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", detailUrl=");
        sbLIZ.append(this.detailUrl);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(", optional=");
        sbLIZ.append(this.optional);
        sbLIZ.append(", business=");
        sbLIZ.append(this.business);
        sbLIZ.append(", policyVersion=");
        sbLIZ.append(this.policyVersion);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KrConsentCheckbox(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.content = str;
        this.detailUrl = str2;
        this.detail = str3;
        this.optional = z;
        this.business = str4;
        this.policyVersion = str5;
        this.id = str6;
    }
}
