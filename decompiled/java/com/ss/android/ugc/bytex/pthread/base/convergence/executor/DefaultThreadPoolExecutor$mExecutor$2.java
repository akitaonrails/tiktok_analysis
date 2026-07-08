package com.ss.android.ugc.bytex.pthread.base.convergence.executor;

import X.C09AY;
import X.C822650WOx;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class DefaultThreadPoolExecutor$mExecutor$2 extends C09AY implements Function0<ThreadPoolExecutor> {
    public DefaultThreadPoolExecutor$mExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ThreadPoolExecutor invoke() {
        return new C822650WOx(0, Integer.MAX_VALUE, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue(), Executors.defaultThreadFactory());
    }
}
