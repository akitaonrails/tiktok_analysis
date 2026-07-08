package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostViolationException extends Exception {
    public final PerceptionMessage perceptionMessage;

    public final PerceptionMessage getPerceptionMessage() {
        return this.perceptionMessage;
    }

    public MultiCoHostViolationException(PerceptionMessage perceptionMessage) {
        this.perceptionMessage = perceptionMessage;
    }
}
