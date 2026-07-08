package com.bytedance.pumbaa.hybrid.governance.jsinjection.settings;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class JsInjectionBlackListConfig extends BaseGovernanceModel {

    @C09CT("black_list")
    public final List<BlackItem> blackList;

    public JsInjectionBlackListConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsInjectionBlackListConfig) && Intrinsics.LJFF(this.blackList, ((JsInjectionBlackListConfig) obj).blackList);
    }

    public final int hashCode() {
        List<BlackItem> list = this.blackList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsInjectionBlackListConfig(blackList=");
        sbLIZ.append(this.blackList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsInjectionBlackListConfig(List<BlackItem> list) {
        super(null, false, false, false, false);
        this.blackList = list;
    }
}
