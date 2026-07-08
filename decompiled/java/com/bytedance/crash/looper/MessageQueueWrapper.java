package com.bytedance.crash.looper;

import android.os.Looper;
import android.os.MessageQueue;

/* JADX INFO: loaded from: classes14.dex */
public class MessageQueueWrapper {
    public static MessageQueue LIZ;

    public static MessageQueue LIZ() {
        if (LIZ == null) {
            Looper mainLooper = Looper.getMainLooper();
            LIZ = mainLooper == null ? null : mainLooper == Looper.myLooper() ? Looper.myQueue() : mainLooper.getQueue();
        }
        return LIZ;
    }
}
