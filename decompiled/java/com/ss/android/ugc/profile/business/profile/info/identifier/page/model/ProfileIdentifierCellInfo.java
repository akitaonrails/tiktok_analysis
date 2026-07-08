package com.ss.android.ugc.profile.business.profile.info.identifier.page.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileIdentifierCellInfo extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("content")
    public final List<ProfileIdentifierCellInfoContent> content;

    @C09CT("title")
    public final String title;

    public ProfileIdentifierCellInfo() {
        this(null, null);
    }

    public final ProfileIdentifierCellInfo copy(String str, List<ProfileIdentifierCellInfoContent> list) {
        return new ProfileIdentifierCellInfo(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileIdentifierCellInfo)) {
            return false;
        }
        ProfileIdentifierCellInfo profileIdentifierCellInfo = (ProfileIdentifierCellInfo) obj;
        return Intrinsics.LJFF(this.title, profileIdentifierCellInfo.title) && Intrinsics.LJFF(this.content, profileIdentifierCellInfo.content);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ProfileIdentifierCellInfoContent> list = this.content;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileIdentifierCellInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ProfileIdentifierCellInfoContent> getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public ProfileIdentifierCellInfo(String str, List<ProfileIdentifierCellInfoContent> list) {
        this.title = str;
        this.content = list;
    }
}
