package com.bytedance.ies.android.base.runtime.depend;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes35.dex */
public interface IThreadPoolExecutorDepend {
    ExecutorService getCPUThreadExecutor();

    ExecutorService getIOThreadExecutor();

    ExecutorService getNormalThreadExecutor();
}
