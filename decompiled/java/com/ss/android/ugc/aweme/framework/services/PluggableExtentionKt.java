package com.ss.android.ugc.aweme.framework.services;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PluggableExtentionKt {
    public static final <S> S pluggableSpi(Class<S> cls) {
        return (S) pluggableSpi$default(cls, false, false, false, 14, null);
    }

    public static final <S> S pluggableSpi(Class<S> cls, boolean z) {
        return (S) pluggableSpi$default(cls, z, false, false, 12, null);
    }

    public static final <S> S pluggableSpi(Class<S> cls, boolean z, boolean z2) {
        return (S) pluggableSpi$default(cls, z, z2, false, 8, null);
    }

    public static final <S> S pluggableSpi() {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static final <SERVICE> SERVICE requiredSpi() {
        ServiceManager.get();
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static final <S> S pluggableSpiForReal(Class<S> cls) {
        return (S) pluggableSpi$default(cls, false, false, true, 6, null);
    }

    public static final <S> S pluggableSpi(Class<S> cls, boolean z, boolean z2, boolean z3) {
        return (S) ServiceManager.get().getService(cls, z, z2, z3);
    }

    public static /* synthetic */ Object pluggableSpi$default(Class cls, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = ServiceManager.get().enableDynamicProxyDefault;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return pluggableSpi(cls, z, z2, z3);
    }
}
