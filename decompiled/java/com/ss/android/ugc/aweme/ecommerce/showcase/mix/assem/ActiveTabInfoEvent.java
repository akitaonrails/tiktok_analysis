package com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixPostEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ActiveTabInfoEvent extends BaseMixPostEvent {

    @C09CT("list_name")
    public final String listName;

    @C09CT("list_num")
    public final String listNum;

    @C09CT("list_set")
    public final String listSet;

    @C09CT("page_id")
    public final String pageId;

    @C09CT("list_index_type")
    public final Long type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveTabInfoEvent)) {
            return false;
        }
        ActiveTabInfoEvent activeTabInfoEvent = (ActiveTabInfoEvent) obj;
        return Intrinsics.LJFF(this.pageId, activeTabInfoEvent.pageId) && Intrinsics.LJFF(this.listName, activeTabInfoEvent.listName) && Intrinsics.LJFF(this.listNum, activeTabInfoEvent.listNum) && Intrinsics.LJFF(this.listSet, activeTabInfoEvent.listSet) && Intrinsics.LJFF(this.type, activeTabInfoEvent.type);
    }

    public final int hashCode() {
        String str = this.pageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.listName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.listNum;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.listSet;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.type;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveTabInfoEvent(pageId=");
        sbLIZ.append(this.pageId);
        sbLIZ.append(", listName=");
        sbLIZ.append(this.listName);
        sbLIZ.append(", listNum=");
        sbLIZ.append(this.listNum);
        sbLIZ.append(", listSet=");
        sbLIZ.append(this.listSet);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActiveTabInfoEvent(String str, String str2, String str3, String str4, Long l) {
        this.pageId = str;
        this.listName = str2;
        this.listNum = str3;
        this.listSet = str4;
        this.type = l;
    }
}
