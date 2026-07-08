package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class ApplogAllowKeysModel {

    @C09CT("allow_keys")
    public final List<String> allowKeys;

    @C09CT("__audit_meta__")
    public final Map<String, String> auditMeta;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("kids_allow_keys")
    public final List<String> kidsAllowKeys;

    public ApplogAllowKeysModel() {
        this(false, null, null, null, 15, null);
    }

    public ApplogAllowKeysModel(boolean z, List<String> list, List<String> list2, Map<String, String> map) {
        this.enable = z;
        this.allowKeys = list;
        this.kidsAllowKeys = list2;
        this.auditMeta = map;
    }

    public ApplogAllowKeysModel(boolean z, List list, List list2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? null : map);
    }
}
