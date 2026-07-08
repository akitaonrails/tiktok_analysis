package com.bytedance.android.livesdk.model.message.tracking;

/* JADX INFO: loaded from: classes.dex */
public class ReasonMessage extends EventTrackingMessage {
    public final String reason;

    public ReasonMessage(String str, boolean z, String str2) {
        super(str, z);
        this.reason = str2;
    }

    public static ReasonMessage from(String str, boolean z, String str2) {
        return new ReasonMessage(str, z, str2);
    }
}
