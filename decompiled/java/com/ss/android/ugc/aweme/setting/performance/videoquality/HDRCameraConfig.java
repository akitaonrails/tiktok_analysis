package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public final class HDRCameraConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("tab_allowlist")
    public final Set<String> includeTab;

    public HDRCameraConfig() {
        this(false, null, 3, null);
    }

    public HDRCameraConfig(boolean z, Set<String> set) {
        this.enable = z;
        this.includeTab = set;
    }

    public HDRCameraConfig(boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C08CX.INSTANCE : set);
    }
}
