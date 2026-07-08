package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.InterfaceC2217461Bqa;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadLocalCleaner {
    public static final /* synthetic */ InterfaceC2217461Bqa[] $$delegatedProperties;
    public static final ThreadLocalCleaner INSTANCE;
    public static final C01GW sInheritableThreadLocalsField$delegate;
    public static final C01GW sThreadLocalsField$delegate;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(ThreadLocalCleaner.class), "sThreadLocalsField", "getSThreadLocalsField()Ljava/lang/reflect/Field;");
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C13LE.LIZ(ThreadLocalCleaner.class), "sInheritableThreadLocalsField", "getSInheritableThreadLocalsField()Ljava/lang/reflect/Field;")};
        INSTANCE = new ThreadLocalCleaner();
        sThreadLocalsField$delegate = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(194));
        sInheritableThreadLocalsField$delegate = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(193));
    }

    private final Field getSInheritableThreadLocalsField() {
        C01GW c01gw = sInheritableThreadLocalsField$delegate;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = $$delegatedProperties;
        return (Field) c01gw.getValue();
    }

    private final Field getSThreadLocalsField() {
        C01GW c01gw = sThreadLocalsField$delegate;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = $$delegatedProperties;
        return (Field) c01gw.getValue();
    }

    public final void clear() throws IllegalAccessException {
        Field sThreadLocalsField = getSThreadLocalsField();
        if (sThreadLocalsField != null) {
            sThreadLocalsField.set(Thread.currentThread(), null);
        }
    }
}
