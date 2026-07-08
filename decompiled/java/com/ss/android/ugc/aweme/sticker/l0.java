package com.ss.android.ugc.aweme.sticker;

import X.C01GW;
import X.C1622820sKe;
import X.C1625440sOs;
import X.C452501pT;
import X.InterfaceC1623680sM2;
import X.InterfaceC1625410sOp;
import X.InterfaceC1625470sOv;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class l0 implements InterfaceC1623680sM2 {
    public static final int LLILZIL = 8;
    public final InterfaceC1625410sOp LL;
    public final InterfaceC1625470sOv LLILLJJLI;
    public final Function1<Effect, Boolean> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(215));

    private final Bundle LIZIZ() {
        return (Bundle) this.LLILZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1625470sOv interfaceC1625470sOv, Function1<? super Effect, Boolean> function1) {
        this.LL = interfaceC1625410sOp;
        this.LLILLJJLI = interfaceC1625470sOv;
        this.LLILLL = function1;
    }

    @Override // X.InterfaceC1623680sM2
    public void Nc1(C1625440sOs c1625440sOs, Function0<Unit> function0, Function0<Unit> function02) {
        Effect effectLJI = this.LLILLJJLI.LJI();
        if (effectLJI != null && this.LLILLL.invoke(effectLJI).booleanValue()) {
            this.LL.LIZJ(C1622820sKe.LIZ(null, LIZIZ(), 1));
        }
        function0.invoke();
        this.LL.LIZJ(c1625440sOs);
        function02.invoke();
    }
}
