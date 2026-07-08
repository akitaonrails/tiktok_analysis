package com.ss.android.ugc.tiktok.privacy.api.phl.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PrivacyHighlightsForTeensApproveInfo {

    @C09CT("business")
    public final String business;

    @C09CT("extra")
    public final String extra;

    @C09CT("operation")
    public final Integer operation;

    @C09CT("policy_version")
    public final String policyVersion;

    @C09CT("style")
    public final String style;

    public PrivacyHighlightsForTeensApproveInfo() {
        this("", null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyHighlightsForTeensApproveInfo)) {
            return false;
        }
        PrivacyHighlightsForTeensApproveInfo privacyHighlightsForTeensApproveInfo = (PrivacyHighlightsForTeensApproveInfo) obj;
        return Intrinsics.LJFF(this.business, privacyHighlightsForTeensApproveInfo.business) && Intrinsics.LJFF(this.policyVersion, privacyHighlightsForTeensApproveInfo.policyVersion) && Intrinsics.LJFF(this.style, privacyHighlightsForTeensApproveInfo.style) && Intrinsics.LJFF(this.extra, privacyHighlightsForTeensApproveInfo.extra) && Intrinsics.LJFF(this.operation, privacyHighlightsForTeensApproveInfo.operation);
    }

    public final int hashCode() {
        int iHashCode = this.business.hashCode() * 31;
        String str = this.policyVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extra;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.operation;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyHighlightsForTeensApproveInfo(business=");
        sbLIZ.append(this.business);
        sbLIZ.append(", policyVersion=");
        sbLIZ.append(this.policyVersion);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", operation=");
        sbLIZ.append(this.operation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyHighlightsForTeensApproveInfo(String str, String str2, String str3, String str4, Integer num) {
        this.business = str;
        this.policyVersion = str2;
        this.style = str3;
        this.extra = str4;
        this.operation = num;
    }
}
