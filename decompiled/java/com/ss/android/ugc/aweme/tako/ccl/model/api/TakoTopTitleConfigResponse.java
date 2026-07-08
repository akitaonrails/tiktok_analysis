package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoTopTitleConfigResponse extends TakoBaseResponse {

    @C09CT("nav_bar_list")
    public final List<NewActionBarItem> navBarList;

    public TakoTopTitleConfigResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoTopTitleConfigResponse) && Intrinsics.LJFF(this.navBarList, ((TakoTopTitleConfigResponse) obj).navBarList);
    }

    public final int hashCode() {
        List<NewActionBarItem> list = this.navBarList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoTopTitleConfigResponse(navBarList=");
        sbLIZ.append(this.navBarList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoTopTitleConfigResponse(List<NewActionBarItem> list) {
        super(null, 0, "");
        this.navBarList = list;
    }

    public TakoTopTitleConfigResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
