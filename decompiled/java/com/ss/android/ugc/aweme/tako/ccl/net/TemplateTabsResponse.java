package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TemplateTabsResponse extends TakoBaseResponse {

    @C09CT("tabs")
    public final List<TemplateTabData> tabs;

    public TemplateTabsResponse() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TemplateTabsResponse) && Intrinsics.LJFF(this.tabs, ((TemplateTabsResponse) obj).tabs);
    }

    public final int hashCode() {
        return this.tabs.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTabsResponse(tabs=");
        sbLIZ.append(this.tabs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TemplateTabsResponse(List<TemplateTabData> list) {
        super(null, 0, "");
        this.tabs = list;
    }

    public TemplateTabsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
