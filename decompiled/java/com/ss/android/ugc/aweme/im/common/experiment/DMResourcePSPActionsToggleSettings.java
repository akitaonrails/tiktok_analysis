package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class DMResourcePSPActionsToggleSettings {

    @C09CT("enable_might_enter_chat")
    public final boolean enableMightEnterChat;

    @C09CT("enable_might_enter_inbox")
    public final boolean enableMightEnterInbox;

    @C09CT("enable_network")
    public final boolean enableNetwork;

    @C09CT("enable_performance_opt")
    public final boolean enablePerformanceOpt;

    @C09CT("enable_scp_request")
    public final boolean enableSCPRequest;

    public DMResourcePSPActionsToggleSettings() {
        this(false, false, false, false, false);
    }

    public DMResourcePSPActionsToggleSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableSCPRequest = z;
        this.enableNetwork = z2;
        this.enablePerformanceOpt = z3;
        this.enableMightEnterChat = z4;
        this.enableMightEnterInbox = z5;
    }
}
