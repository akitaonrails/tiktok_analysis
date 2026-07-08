package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class TypingStatusConfig {

    @C09CT("display_interval")
    public final long displayInterval;

    @C09CT("send_interval")
    public final long sendInterval;

    @C09CT("send_typing_indicator")
    public final boolean sendTypingIndicator;

    public TypingStatusConfig(long j, long j2, boolean z) {
        this.displayInterval = j;
        this.sendInterval = j2;
        this.sendTypingIndicator = z;
    }
}
