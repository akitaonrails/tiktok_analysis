package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes5.dex */
public final class ThreadGroupUtils {
    public static final /* synthetic */ InterfaceC2217461Bqa[] $$delegatedProperties;
    public static final ThreadGroupUtils INSTANCE;
    public static final ThreadGroup cacheThreadGroup;
    public static final C01GW internalThreadGroup$delegate;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(ThreadGroupUtils.class), "internalThreadGroup", "getInternalThreadGroup()Ljava/lang/ThreadGroup;");
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS};
        ThreadGroupUtils threadGroupUtils = new ThreadGroupUtils();
        INSTANCE = threadGroupUtils;
        internalThreadGroup$delegate = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(192));
        cacheThreadGroup = threadGroupUtils.getInternalThreadGroup();
    }

    private final ThreadGroup getInternalThreadGroup() {
        C01GW c01gw = internalThreadGroup$delegate;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = $$delegatedProperties;
        return (ThreadGroup) c01gw.getValue();
    }

    public final ThreadGroup getCacheThreadGroup() {
        return cacheThreadGroup;
    }
}
