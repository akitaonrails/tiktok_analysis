package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C1871630ynx;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes29.dex */
public interface IHostThreadPoolExecutorDepend {
    public static final C1871630ynx Companion = new Object() { // from class: X.0ynx
    };

    ExecutorService getNormalThreadExecutor();

    int requestConcurrentNumber();
}
