package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IsolatedWebPagesModel extends BaseGovernanceModel {

    @C09CT("pages")
    public final Map<String, String> pages;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IsolatedWebPagesModel) && Intrinsics.LJFF(this.pages, ((IsolatedWebPagesModel) obj).pages);
    }

    public final int hashCode() {
        return this.pages.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IsolatedWebPagesModel(pages=");
        sbLIZ.append(this.pages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IsolatedWebPagesModel() {
        this(C2097608Jq.LJ());
    }

    public IsolatedWebPagesModel(Map<String, String> map) {
        super(null, false, false, false, false);
        this.pages = map;
    }
}
