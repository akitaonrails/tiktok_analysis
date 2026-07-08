package com.bytedance.hybrid.spark.security.web_js.setting;

import X.C08CX;
import X.C09CT;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class JSInjectGlobalConfig {

    @C09CT("blockList")
    public final Set<String> blockList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("finishInjectors")
    public final Set<String> finishInjectors;

    @C09CT("inlineInjectors")
    public final Set<String> inlineInjectors;

    @C09CT("manualInjectors")
    public final Set<String> manualInjectors;

    @C09CT("startInjectors")
    public final Set<String> startInjectors;

    public JSInjectGlobalConfig() {
        this(null, null, null, null, null, false, 63, null);
    }

    public final boolean LIZ(String str) {
        Iterator<String> it2 = this.blockList.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public JSInjectGlobalConfig(Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5, boolean z) {
        this.startInjectors = set;
        this.finishInjectors = set2;
        this.inlineInjectors = set3;
        this.manualInjectors = set4;
        this.blockList = set5;
        this.enable = z;
    }

    public JSInjectGlobalConfig(Set set, Set set2, Set set3, Set set4, Set set5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? C08CX.INSTANCE : set3, (i & 8) != 0 ? C08CX.INSTANCE : set4, (i & 16) != 0 ? C08CX.INSTANCE : set5, (i & 32) != 0 ? false : z);
    }
}
