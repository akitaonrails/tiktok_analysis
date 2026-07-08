package com.ss.android.ugc.aweme.im.streak.impl.monitor;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class LynxPanelDelayCallbackData {

    @C09CT("panel_dimiss")
    public final long panelDismiss;

    @C09CT("panel_show_sceen")
    public final long panelShowScreen;

    @C09CT("uuid")
    public final String uuid;

    public LynxPanelDelayCallbackData() {
        this("", 0L, 0L);
    }

    public LynxPanelDelayCallbackData(String str, long j, long j2) {
        this.uuid = str;
        this.panelShowScreen = j;
        this.panelDismiss = j2;
    }
}
