package kotlin.jvm.internal;

import X.C09AY;
import X.C20337914i1;
import X.C465900IOu;
import X.C766270U4b;
import X.C784440Upu;
import X.C927560aFG;
import X.C927580aFI;
import X.C932090aMZ;
import X.C932160aMg;
import X.C971370bNv;
import X.EnumC930180aJU;
import X.InterfaceC772190UQv;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS36S0310000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS36S0310000_15 awS36S0310000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            if (awS36S0310000_15.z3) {
                ((SwitchLayoutPanelController) awS36S0310000_15.l0).LJIIJ(new AwS559S0100000_15((Function0) awS36S0310000_15.l2, (Function0<Unit>) 1065));
            } else {
                ((SwitchLayoutPanelController) awS36S0310000_15.l0).LJIIIIZZ((EnumC930180aJU) awS36S0310000_15.l1, (Function0) awS36S0310000_15.l2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S0310000_15 awS36S0310000_15, Object obj) {
        C932090aMZ c932090aMZ = (C932090aMZ) awS36S0310000_15.l0;
        boolean z = awS36S0310000_15.z3;
        c932090aMZ.getClass();
        boolean z2 = false;
        if (C927560aFG.LIZJ()) {
            C766270U4b.LIZLLL(2131851254);
            C927580aFI.LIZIZ();
        } else if (z && c932090aMZ.LIZIZ.invoke().booleanValue()) {
            C932160aMg.LJIIIIZZ("icon");
            C20337914i1<Integer> c20337914i1 = InterfaceC772190UQv.c3;
            Integer numLIZ = c20337914i1.LIZ();
            if (numLIZ != null && numLIZ.intValue() == 1) {
                C766270U4b.LIZLLL(2131841010);
                c20337914i1.LJ(0);
            } else {
                C766270U4b.LIZLLL(2131841734);
                c20337914i1.LJ(1);
            }
            C784440Upu.LIZ().LIZIZ(new C465900IOu(2));
        }
        View view = (View) awS36S0310000_15.l1;
        Integer numLIZ2 = InterfaceC772190UQv.c3.LIZ();
        if (numLIZ2 != null && numLIZ2.intValue() == 1) {
            z2 = true;
        }
        C971370bNv.LIZIZ(view, 2131840800, 2131840816, z2);
        Function0 function0 = (Function0) awS36S0310000_15.l2;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0310000_15(C932090aMZ c932090aMZ, C932090aMZ c932090aMZ2, boolean z, View view, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c932090aMZ;
        this.z3 = c932090aMZ2;
        this.l1 = z;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0310000_15(boolean z, boolean z2, SwitchLayoutPanelController switchLayoutPanelController, EnumC930180aJU enumC930180aJU, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = switchLayoutPanelController;
        this.l2 = enumC930180aJU;
    }
}
