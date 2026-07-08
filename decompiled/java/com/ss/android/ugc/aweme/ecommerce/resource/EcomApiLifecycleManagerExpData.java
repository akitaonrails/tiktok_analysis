package com.ss.android.ugc.aweme.ecommerce.resource;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomApiLifecycleManagerExpData {

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("scenes")
    public final List<EcomApiLifecycleScene> scenes;

    public EcomApiLifecycleManagerExpData() {
        this(false, null, 3, null);
    }

    public EcomApiLifecycleManagerExpData(boolean z, List<EcomApiLifecycleScene> list) {
        this.isEnabled = z;
        this.scenes = list;
    }

    public EcomApiLifecycleManagerExpData(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
