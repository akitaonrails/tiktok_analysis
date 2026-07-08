package com.bytedance.crash.looper;

import X.InterfaceC20666087s;
import android.os.Message;
import java.io.File;

/* JADX INFO: loaded from: classes14.dex */
public interface MessageObserver extends InterfaceC20666087s {
    void dumpMessages(File file);

    @Override // X.InterfaceC20666087s
    /* synthetic */ void messageDispatchStarting(String str);

    @Override // X.InterfaceC20666087s
    /* synthetic */ void messageDispatched(String str, Message message);

    void start();

    void stop();
}
