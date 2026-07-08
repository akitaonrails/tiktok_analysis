package org.greenrobot.eventbus;

import X.C08FF;

/* JADX INFO: loaded from: classes31.dex */
public enum ThreadMode {
    POSTING,
    MAIN,
    MAIN_ORDERED,
    BACKGROUND,
    ASYNC;

    public static ThreadMode valueOf(String str) {
        return (ThreadMode) C08FF.LIZ(ThreadMode.class, str);
    }
}
