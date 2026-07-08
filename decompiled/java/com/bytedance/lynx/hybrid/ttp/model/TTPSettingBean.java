package com.bytedance.lynx.hybrid.ttp.model;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPSettingBean {

    @C09CT("enabled")
    public final boolean enable;

    @C09CT("enable_ttnet_native")
    public final boolean enableTTNetNative;

    @C09CT("url")
    public final UrlRules url;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TTPSettingBean() {
        boolean z = false;
        this(z, z, null, 7, 0 == true ? 1 : 0);
    }

    public TTPSettingBean(boolean z, boolean z2, UrlRules urlRules) {
        this.enable = z;
        this.enableTTNetNative = z2;
        this.url = urlRules;
    }

    public /* synthetic */ TTPSettingBean(boolean z, boolean z2, UrlRules urlRules, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new UrlRules(null, null, 3, null) : urlRules);
    }
}
