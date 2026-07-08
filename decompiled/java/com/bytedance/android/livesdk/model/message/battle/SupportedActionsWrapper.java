package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SupportedActionsWrapper {

    @C09CT("key")
    public Long actionType;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("value")
    public Boolean f39switch;

    public SupportedActionsWrapper() {
        this(null, null);
    }

    public SupportedActionsWrapper(Long l, Boolean bool) {
        this.actionType = l;
        this.f39switch = bool;
    }
}
