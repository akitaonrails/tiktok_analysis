package com.bytedance.pumbaa.hybrid.governance.jsi;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdPartyJSIItem {

    @C09CT("allowList")
    public final List<String> allowList;

    @C09CT("jsiMethod")
    public final String jsiMethod;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyJSIItem)) {
            return false;
        }
        ThirdPartyJSIItem thirdPartyJSIItem = (ThirdPartyJSIItem) obj;
        return Intrinsics.LJFF(this.jsiMethod, thirdPartyJSIItem.jsiMethod) && Intrinsics.LJFF(this.allowList, thirdPartyJSIItem.allowList);
    }

    public ThirdPartyJSIItem() {
        this("", new ArrayList());
    }

    public ThirdPartyJSIItem(String str, List<String> list) {
        this.jsiMethod = str;
        this.allowList = list;
    }
}
