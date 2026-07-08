package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowFixConfig {

    @C09CT("fix_async_bind")
    public final boolean fixAsyncBind;

    @C09CT("opt")
    public final boolean opt;

    @C09CT("trigger_fix")
    public final boolean triggerFix;

    public ShowFixConfig() {
        this(true, true, true);
    }

    public ShowFixConfig(boolean z, boolean z2, boolean z3) {
        this.triggerFix = z;
        this.opt = z2;
        this.fixAsyncBind = z3;
    }
}
