package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LinkInfo {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("name")
    public final String name;

    @C09CT("url_list")
    public final List<String> urlList;

    public LinkInfo() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkInfo)) {
            return false;
        }
        LinkInfo linkInfo = (LinkInfo) obj;
        return Intrinsics.LJFF(this.urlList, linkInfo.urlList) && Intrinsics.LJFF(this.actionType, linkInfo.actionType) && Intrinsics.LJFF(this.name, linkInfo.name);
    }

    public final int hashCode() {
        List<String> list = this.urlList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.actionType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.name;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkInfo(urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LinkInfo(List<String> list, Integer num, String str) {
        this.urlList = list;
        this.actionType = num;
        this.name = str;
    }

    public LinkInfo(List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
