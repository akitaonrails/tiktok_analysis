package com.bytedance.bpea.core.checker;

import X.C825940Wae;
import X.C838000Wu6;
import X.C838010Wu7;
import X.C838030Wu9;
import X.C838040WuA;
import X.InterfaceC838120WuI;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class CorePowerProvider implements InterfaceC838120WuI {
    public static final CorePowerProvider INSTANCE = new CorePowerProvider();

    @Override // X.InterfaceC838120WuI
    public C838040WuA check(C825940Wae c825940Wae, Function1<? super C838040WuA, ? extends Object> function1) {
        C838030Wu9 c838030Wu9 = C838000Wu6.LIZ;
        return (C838040WuA) C838000Wu6.LIZIZ(c825940Wae, "MainCheck", null, new C838010Wu7(c825940Wae, function1));
    }
}
