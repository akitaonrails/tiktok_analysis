package kotlin.jvm.internal;

import X.C09AY;
import X.C13DN;
import X.C13DO;
import X.C13GF;
import X.C13IQ;
import X.C13Z4;
import X.C13ZT;
import X.C1685320txS;
import X.C634190Ou9;
import X.C634850OvD;
import X.InterfaceC1680500tpg;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes10.dex */
public class AwS168S0400000_9 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS168S0400000_9 awS168S0400000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            UiComposableAssem uiComposableAssem = (UiComposableAssem) awS168S0400000_9.l0;
            C13DN<LifecycleOwner> c13dn = C13GF.LIZ;
            UiComposableAssem uiComposableAssem2 = (UiComposableAssem) awS168S0400000_9.l0;
            uiComposableAssem2.getActualLifecycleOwner();
            C13ZT.LIZIZ(new C13DO[]{C1685320txS.LIZ.LIZJ(uiComposableAssem), c13dn.LIZJ(uiComposableAssem2)}, C13Z4.LIZJ(-1325222258, new AwS168S0400000_9((View) awS168S0400000_9.l1, (Function0) awS168S0400000_9.l3, (C13IQ) awS168S0400000_9.l2, (UiComposableAssem) awS168S0400000_9.l0, 1), interfaceC1680500tpg), interfaceC1680500tpg, 56);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS168S0400000_9 awS168S0400000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C634850OvD.LIZ((ComposeView) ((View) awS168S0400000_9.l0), ((UiComposableAssem) awS168S0400000_9.l1).getVAssemScope(), C13Z4.LIZJ(657317820, new C634190Ou9((UiComposableAssem) awS168S0400000_9.l1, (C13IQ) awS168S0400000_9.l2, (Function0) awS168S0400000_9.l3), interfaceC1680500tpg), interfaceC1680500tpg, 392, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0400000_9(View view, Function0 function0, C13IQ c13iq, UiComposableAssem uiComposableAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = uiComposableAssem;
        this.l2 = c13iq;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS168S0400000_9(View view, AwS553S0100000_9 awS553S0100000_9, C13IQ c13iq, UiComposableAssem uiComposableAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = uiComposableAssem;
        this.l1 = view;
        this.l2 = c13iq;
        this.l3 = awS553S0100000_9;
    }
}
