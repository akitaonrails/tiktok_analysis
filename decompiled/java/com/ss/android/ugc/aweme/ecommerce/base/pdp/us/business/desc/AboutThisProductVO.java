package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AboutThisProductVO {

    @C09CT("content")
    public final List<AboutThisProductContentItem> contentList;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("expand_by_default")
    public final boolean expandByDefault;

    @C09CT("header")
    public final AboutThisProductHeader header;

    public AboutThisProductVO() {
        this(null, null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutThisProductVO)) {
            return false;
        }
        AboutThisProductVO aboutThisProductVO = (AboutThisProductVO) obj;
        return Intrinsics.LJFF(this.contentList, aboutThisProductVO.contentList) && Intrinsics.LJFF(this.header, aboutThisProductVO.header) && this.expandByDefault == aboutThisProductVO.expandByDefault && Intrinsics.LJFF(this.daInfo, aboutThisProductVO.daInfo);
    }

    public final int hashCode() {
        List<AboutThisProductContentItem> list = this.contentList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AboutThisProductHeader aboutThisProductHeader = this.header;
        int iHashCode2 = (((iHashCode + (aboutThisProductHeader == null ? 0 : aboutThisProductHeader.hashCode())) * 31) + C786410Ut5.Z2(this.expandByDefault)) * 31;
        String str = this.daInfo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AboutThisProductVO(contentList=");
        sbLIZ.append(this.contentList);
        sbLIZ.append(", header=");
        sbLIZ.append(this.header);
        sbLIZ.append(", expandByDefault=");
        sbLIZ.append(this.expandByDefault);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AboutThisProductVO(List<AboutThisProductContentItem> list, AboutThisProductHeader aboutThisProductHeader, boolean z, String str) {
        this.contentList = list;
        this.header = aboutThisProductHeader;
        this.expandByDefault = z;
        this.daInfo = str;
    }
}
