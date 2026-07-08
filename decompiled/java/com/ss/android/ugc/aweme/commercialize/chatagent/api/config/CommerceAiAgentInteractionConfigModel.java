package com.ss.android.ugc.aweme.commercialize.chatagent.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAiAgentInteractionConfigModel {

    @C09CT("agent_bar_close_enable")
    public final boolean agentBarCloseEnable;

    @C09CT("agent_bar_scroll_hide_enable")
    public final boolean agentBarScrollHideEnable;

    @C09CT("aweme_check_opt_enabled")
    public final boolean awemeCheckOptEnabled;

    @C09CT("haptic_duration")
    public final long hapticDuration;

    @C09CT("haptic_enabled")
    public final boolean hapticEnabled;

    @C09CT("privacy_disclaimer_enable")
    public final boolean privacyDisclaimerEnable;

    @C09CT("second_jump_enabled")
    public final boolean secondJumpEnabled;

    @C09CT("typewriter_enabled")
    public final boolean typewriterEnabled;

    public CommerceAiAgentInteractionConfigModel() {
        this(false, 100L, false, true, false, false, true, true);
    }

    public CommerceAiAgentInteractionConfigModel(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.hapticEnabled = z;
        this.hapticDuration = j;
        this.typewriterEnabled = z2;
        this.privacyDisclaimerEnable = z3;
        this.agentBarScrollHideEnable = z4;
        this.agentBarCloseEnable = z5;
        this.secondJumpEnabled = z6;
        this.awemeCheckOptEnabled = z7;
    }
}
