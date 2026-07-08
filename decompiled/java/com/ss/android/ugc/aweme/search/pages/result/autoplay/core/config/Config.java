package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.config;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes11.dex */
public final class Config {

    @C09CT("enable_pre_create")
    public final boolean enablePreCreate;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("enable_prepare")
    public final boolean enablePrepare;

    @C09CT("pre_create_seconds")
    public final int preCreateSeconds;

    @C09CT("preload_seconds")
    public final int preloadSeconds;

    public Config() {
        this(false, 5, false, 15, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(enablePreCreate=");
        sbLIZ.append(this.enablePreCreate);
        sbLIZ.append(", preCreateSeconds=");
        sbLIZ.append(this.preCreateSeconds);
        sbLIZ.append(", enablePreload=");
        sbLIZ.append(this.enablePreload);
        sbLIZ.append(", preloadSeconds=");
        sbLIZ.append(this.preloadSeconds);
        sbLIZ.append(", enablePrepare=");
        sbLIZ.append(this.enablePrepare);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Config(boolean z, int i, boolean z2, int i2, boolean z3) {
        this.enablePreCreate = z;
        this.preCreateSeconds = i;
        this.enablePreload = z2;
        this.preloadSeconds = i2;
        this.enablePrepare = z3;
    }
}
