package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SchoolPopupConfig implements Serializable {

    @C09CT("action_desc")
    public String actionDesc;

    @C09CT("benefit_desc")
    public String benefitDesc;

    @C09CT("social_proof")
    public String socialProof;

    @C09CT("title")
    public String title;

    @C09CT("verify_desc")
    public String verifyDesc;

    public SchoolPopupConfig() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolPopupConfig)) {
            return false;
        }
        SchoolPopupConfig schoolPopupConfig = (SchoolPopupConfig) obj;
        return Intrinsics.LJFF(this.title, schoolPopupConfig.title) && Intrinsics.LJFF(this.socialProof, schoolPopupConfig.socialProof) && Intrinsics.LJFF(this.verifyDesc, schoolPopupConfig.verifyDesc) && Intrinsics.LJFF(this.benefitDesc, schoolPopupConfig.benefitDesc) && Intrinsics.LJFF(this.actionDesc, schoolPopupConfig.actionDesc);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.socialProof;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verifyDesc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.benefitDesc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionDesc;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolPopupConfig(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", socialProof=");
        sbLIZ.append(this.socialProof);
        sbLIZ.append(", verifyDesc=");
        sbLIZ.append(this.verifyDesc);
        sbLIZ.append(", benefitDesc=");
        sbLIZ.append(this.benefitDesc);
        sbLIZ.append(", actionDesc=");
        sbLIZ.append(this.actionDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SchoolPopupConfig(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.socialProof = str2;
        this.verifyDesc = str3;
        this.benefitDesc = str4;
        this.actionDesc = str5;
    }
}
