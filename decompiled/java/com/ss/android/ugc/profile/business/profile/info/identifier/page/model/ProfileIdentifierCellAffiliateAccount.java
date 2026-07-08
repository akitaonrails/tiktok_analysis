package com.ss.android.ugc.profile.business.profile.info.identifier.page.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.org.AssociateAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileIdentifierCellAffiliateAccount extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("associate_account_info")
    public final AssociateAccountInfo associateAccountInfo;

    @C09CT("title")
    public final String title;

    public ProfileIdentifierCellAffiliateAccount() {
        this(null, null);
    }

    public final ProfileIdentifierCellAffiliateAccount copy(String str, AssociateAccountInfo associateAccountInfo) {
        return new ProfileIdentifierCellAffiliateAccount(str, associateAccountInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileIdentifierCellAffiliateAccount)) {
            return false;
        }
        ProfileIdentifierCellAffiliateAccount profileIdentifierCellAffiliateAccount = (ProfileIdentifierCellAffiliateAccount) obj;
        return Intrinsics.LJFF(this.title, profileIdentifierCellAffiliateAccount.title) && Intrinsics.LJFF(this.associateAccountInfo, profileIdentifierCellAffiliateAccount.associateAccountInfo);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AssociateAccountInfo associateAccountInfo = this.associateAccountInfo;
        return iHashCode + (associateAccountInfo != null ? associateAccountInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileIdentifierCellAffiliateAccount(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", associateAccountInfo=");
        sbLIZ.append(this.associateAccountInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AssociateAccountInfo getAssociateAccountInfo() {
        return this.associateAccountInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public ProfileIdentifierCellAffiliateAccount(String str, AssociateAccountInfo associateAccountInfo) {
        this.title = str;
        this.associateAccountInfo = associateAccountInfo;
    }
}
