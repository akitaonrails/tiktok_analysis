package com.ss.android.ugc.bytex.pthread.base.proxy;

import X.C09AY;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadProxy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class PthreadThread$mThreadProxy$2 extends C09AY implements Function0<ThreadProxy> {
    public final /* synthetic */ PthreadThread this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PthreadThread$mThreadProxy$2(PthreadThread pthreadThread) {
        super(0);
        this.this$0 = pthreadThread;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ThreadProxy invoke() {
        if (SuperThreadPool.INSTANCE.isEnable(1)) {
            return new ThreadProxy(this.this$0, false);
        }
        return null;
    }
}
