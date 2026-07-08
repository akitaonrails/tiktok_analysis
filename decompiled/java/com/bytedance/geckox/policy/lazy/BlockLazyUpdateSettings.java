package com.bytedance.geckox.policy.lazy;

import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class BlockLazyUpdateSettings {
    public final List<String> allowlist;
    public final boolean enabled;

    public BlockLazyUpdateSettings() {
        this(false, null, 3, null);
    }

    public BlockLazyUpdateSettings(boolean z, List<String> list) {
        this.enabled = z;
        this.allowlist = list;
    }

    public BlockLazyUpdateSettings(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
