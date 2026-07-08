package com.bytedance.android.livesdk.model.message.tracking;

import X.AbstractC1136060ffY;

/* JADX INFO: loaded from: classes.dex */
public class IdMessage extends EventTrackingMessage {
    public final long messageId;

    public static IdMessage from(AbstractC1136060ffY abstractC1136060ffY) {
        return new IdMessage(abstractC1136060ffY.getMessageType().getWsMethod(), !abstractC1136060ffY.isLocalInsertMsg, abstractC1136060ffY.getMessageId());
    }

    public IdMessage(String str, boolean z, long j) {
        super(str, z);
        this.messageId = j;
    }
}
