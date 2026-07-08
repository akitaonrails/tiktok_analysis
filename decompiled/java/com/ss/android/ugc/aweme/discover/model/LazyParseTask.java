package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC2337209Du;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public interface LazyParseTask<T extends InterfaceC2337209Du> {
    Callable<T> getLazyParseCallable();

    void setLazyParseCallable(Callable<T> callable);
}
