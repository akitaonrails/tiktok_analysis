package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class ApmBodyHeaderAllowKeysModel {

    @C09CT("addition_allow_keys")
    public final List<String> additionAllowKeys;

    @C09CT("global_interceptor_enable")
    public final boolean globalInterceptorEnable;

    @C09CT("enable")
    public final boolean isEnable;

    @C09CT("spec_enable")
    public final boolean isSpecEnable;

    @C09CT("__audit_meta__")
    public final Map<String, String> specInfo;

    public ApmBodyHeaderAllowKeysModel() {
        this(false, false, null, false, null, 31, null);
    }

    public ApmBodyHeaderAllowKeysModel(boolean z, boolean z2, List<String> list, boolean z3, Map<String, String> map) {
        this.isEnable = z;
        this.globalInterceptorEnable = z2;
        this.additionAllowKeys = list;
        this.isSpecEnable = z3;
        this.specInfo = map;
    }

    public ApmBodyHeaderAllowKeysModel(boolean z, boolean z2, List list, boolean z3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) == 0 ? z3 : false, (i & 16) != 0 ? C2097608Jq.LJ() : map);
    }
}
