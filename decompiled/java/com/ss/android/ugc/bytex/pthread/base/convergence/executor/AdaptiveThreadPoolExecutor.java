package com.ss.android.ugc.bytex.pthread.base.convergence.executor;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AwS43S0102000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class AdaptiveThreadPoolExecutor implements IExecutor {
    public static final /* synthetic */ InterfaceC2217461Bqa[] $$delegatedProperties;
    public final DredgeHandler mDredgeHandler;
    public final C01GW mExecutor$delegate;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(AdaptiveThreadPoolExecutor.class), "mExecutor", "getMExecutor()Ljava/util/concurrent/ThreadPoolExecutor;");
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AdaptiveThreadPoolExecutor(int i, int i2, DredgeHandler dredgeHandler) {
        this.mDredgeHandler = dredgeHandler;
        this.mExecutor$delegate = C452501pT.LIZIZ(new AwS43S0102000_13(this, i, i2, 1));
    }

    private final ThreadPoolExecutor getMExecutor() {
        C01GW c01gw = this.mExecutor$delegate;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = $$delegatedProperties;
        return (ThreadPoolExecutor) c01gw.getValue();
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.executor.IExecutor
    public void execute(Runnable runnable) {
        getMExecutor().execute(runnable);
        this.mDredgeHandler.requestDredgePrepare();
    }

    public final int getCorePoolSize() {
        return getMExecutor().getCorePoolSize();
    }

    public final int getMaxPoolSize() {
        return getMExecutor().getMaximumPoolSize();
    }

    public final void setCorePoolSize(int i) {
        getMExecutor().setCorePoolSize(i);
    }

    public final void setMaxPoolSize(int i) {
        getMExecutor().setMaximumPoolSize(i);
    }
}
