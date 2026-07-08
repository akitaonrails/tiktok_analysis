package com.bytedance.android.livesdk.model.message.tracking;

/* JADX INFO: loaded from: classes.dex */
public class EventTrackingMessage {
    public final String method;
    public final String source;

    public EventTrackingMessage(String str, boolean z) {
        this.method = str;
        if (z) {
            this.source = "remote";
        } else {
            this.source = "native";
        }
    }
}
