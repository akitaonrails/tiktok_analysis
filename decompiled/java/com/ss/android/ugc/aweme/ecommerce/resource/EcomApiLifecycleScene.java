package com.ss.android.ugc.aweme.ecommerce.resource;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomApiLifecycleScene {

    @C09CT("api_paths_to_cancel")
    public final List<String> apiPathsToCancel;

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("name")
    public final String name;

    @C09CT("network_threshold_to_cancel")
    public final int networkThresholdToCancel;

    public EcomApiLifecycleScene() {
        this(null, false, null, 0, 15, null);
    }

    public EcomApiLifecycleScene(String str, boolean z, List<String> list, int i) {
        this.name = str;
        this.isEnabled = z;
        this.apiPathsToCancel = list;
        this.networkThresholdToCancel = i;
    }

    public EcomApiLifecycleScene(String str, boolean z, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? -10 : i);
    }
}
