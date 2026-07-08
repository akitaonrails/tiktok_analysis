package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum StreamRemoveReason {
    STREAM_REMOVE_REASON_UNPUBLISH(0),
    STREAM_REMOVE_REASON_PUBLISH_FAILED(1),
    STREAM_REMOVE_REASON_KEEP_LIVE_FAILED(2),
    STREAM_REMOVE_REASON_CLIENT_DISCONNECTED(3),
    STREAM_REMOVE_REASON_REPUBLISH(4),
    STREAM_REMOVE_REASON_OTHER(5),
    STREAM_REMOVE_REASON_PUBLISH_PRIVILEGE_TOKEN_EXPIRED(6);

    public final int value;

    public int value() {
        return this.value;
    }

    public static StreamRemoveReason fromId(int i) {
        for (StreamRemoveReason streamRemoveReason : values()) {
            if (streamRemoveReason.value() == i) {
                return streamRemoveReason;
            }
        }
        return STREAM_REMOVE_REASON_UNPUBLISH;
    }

    public static StreamRemoveReason valueOf(String str) {
        return (StreamRemoveReason) C08FF.LIZ(StreamRemoveReason.class, str);
    }

    StreamRemoveReason(int i) {
        this.value = i;
    }
}
