package com.bytedance.android.livesdk.model.message.tracking;

import X.AbstractC1136060ffY;

/* JADX INFO: loaded from: classes.dex */
public class IdReasonMessage extends IdMessage {
    public final String reason;

    public static IdReasonMessage from(AbstractC1136060ffY abstractC1136060ffY, String str) {
        return new IdReasonMessage(abstractC1136060ffY.getMessageType().getWsMethod(), abstractC1136060ffY.isLocalInsertMsg, abstractC1136060ffY.getMessageId(), str);
    }

    public IdReasonMessage(String str, boolean z, long j, String str2) {
        super(str, z, j);
        this.reason = str2;
    }
}
