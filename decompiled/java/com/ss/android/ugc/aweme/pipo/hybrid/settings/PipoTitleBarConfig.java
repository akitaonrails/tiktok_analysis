package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTitleBarConfig {

    @C09CT("enable_lock_icon")
    public final boolean enableLockIcon;

    @C09CT("enable_sld")
    public final boolean enableSld;

    @C09CT("enable_subtitle_report")
    public final boolean enableSubTitleReport;

    @C09CT("special_tlds")
    public final List<String> specialTLDs;

    public PipoTitleBarConfig() {
        this(false, false, null, false);
    }

    public PipoTitleBarConfig(boolean z, boolean z2, List<String> list, boolean z3) {
        this.enableSld = z;
        this.enableLockIcon = z2;
        this.specialTLDs = list;
        this.enableSubTitleReport = z3;
    }
}
