package com.bytedance.tt.reliability.queuemonitor.model;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum QueueType {
    MESSAGE_QUEUE,
    THREAD_POOL;

    public static QueueType valueOf(String str) {
        return (QueueType) C08FF.LIZ(QueueType.class, str);
    }
}
