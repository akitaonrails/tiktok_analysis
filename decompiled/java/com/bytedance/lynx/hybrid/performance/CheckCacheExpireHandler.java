package com.bytedance.lynx.hybrid.performance;

import X.C1546510qLZ;
import X.C1546540qLc;
import X.InterfaceC1105930esx;
import X.RunnableC1546520qLa;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final class CheckCacheExpireHandler extends BPEAHandler {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C1546510qLZ LL;
    public final InterfaceC1105930esx LLILLJJLI;
    public final Function1<? super InterfaceC1105930esx, Unit> LLILLL;
    public RunnableC1546520qLa LLILZ;

    public CheckCacheExpireHandler() {
        throw null;
    }

    public CheckCacheExpireHandler(C1546510qLZ c1546510qLZ, InterfaceC1105930esx interfaceC1105930esx, C1546540qLc c1546540qLc) {
        super(Looper.getMainLooper());
        this.LL = c1546510qLZ;
        this.LLILLJJLI = interfaceC1105930esx;
        this.LLILLL = c1546540qLc;
    }
}
