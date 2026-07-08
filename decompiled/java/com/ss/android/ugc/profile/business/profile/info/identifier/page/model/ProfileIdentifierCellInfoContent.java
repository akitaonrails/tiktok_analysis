package com.ss.android.ugc.profile.business.profile.info.identifier.page.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileIdentifierCellInfoContent extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("text")
    public final String text;

    public ProfileIdentifierCellInfoContent() {
        this(null, null);
    }

    public final ProfileIdentifierCellInfoContent copy(String str, String str2) {
        return new ProfileIdentifierCellInfoContent(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileIdentifierCellInfoContent)) {
            return false;
        }
        ProfileIdentifierCellInfoContent profileIdentifierCellInfoContent = (ProfileIdentifierCellInfoContent) obj;
        return Intrinsics.LJFF(this.subtitle, profileIdentifierCellInfoContent.subtitle) && Intrinsics.LJFF(this.text, profileIdentifierCellInfoContent.text);
    }

    public int hashCode() {
        String str = this.subtitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileIdentifierCellInfoContent(subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getText() {
        return this.text;
    }

    public ProfileIdentifierCellInfoContent(String str, String str2) {
        this.subtitle = str;
        this.text = str2;
    }
}
