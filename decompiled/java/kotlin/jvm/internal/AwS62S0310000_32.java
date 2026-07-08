package kotlin.jvm.internal;

import X.C09AY;
import X.C1558360qeg;
import X.C1558520qew;
import X.C18UI;
import X.C18VZ;
import X.C19EG;
import X.C21155517qb;
import X.C21295618Vm;
import X.EnumC21295018Vg;
import X.InterfaceC21154317qP;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.mixmall.retreat.ECMixMallRetreatAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS62S0310000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS62S0310000_32 awS62S0310000_32) {
        C21295618Vm.LIZ().clear();
        ((C18VZ) awS62S0310000_32.l0).y7("no_auth", (C18UI) awS62S0310000_32.l1);
        if (awS62S0310000_32.z3) {
            ((C18VZ) awS62S0310000_32.l0).S6(true, EnumC21295018Vg.UI_ACTION_OPEN_DEFAULT);
        }
        ((Function0) awS62S0310000_32.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS62S0310000_32 awS62S0310000_32) {
        ECMixMallRetreatAbility eCMixMallRetreatAbility;
        C19EG activity = ((C21155517qb) awS62S0310000_32.l0).LIZ.LJ.getActivity();
        final FrameLayout frameLayout = (FrameLayout) awS62S0310000_32.l2;
        final InterfaceC21154317qP interfaceC21154317qP = (InterfaceC21154317qP) awS62S0310000_32.l1;
        final C21155517qb c21155517qb = (C21155517qb) awS62S0310000_32.l0;
        final boolean z = awS62S0310000_32.z3;
        Runnable runnable = new Runnable() { // from class: X.17pd
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EcMixMallPopupTaskPool@9eff.nextTask$block$1$1");
                try {
                    if (frameLayout.getParent() != null) {
                        interfaceC21154317qP.LJFF(c21155517qb.LJ, frameLayout, z);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EcMixMallPopupTaskPool@9eff.nextTask$block$1$1");
            }
        };
        if (activity != null && (eCMixMallRetreatAbility = (ECMixMallRetreatAbility) C1558520qew.LIZ(C1558360qeg.LJI(activity, null), ECMixMallRetreatAbility.class, null)) != null) {
            eCMixMallRetreatAbility.Kw1(runnable, "popup_view");
        } else {
            runnable.run();
        }
        ((C21155517qb) awS62S0310000_32.l0).LJII = (InterfaceC21154317qP) awS62S0310000_32.l1;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S0310000_32(C18VZ c18vz, C18VZ c18vz2, C18UI c18ui, boolean z, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c18vz;
        this.l1 = c18vz2;
        this.z3 = c18ui;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S0310000_32(FrameLayout frameLayout, C21155517qb c21155517qb, InterfaceC21154317qP interfaceC21154317qP, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c21155517qb;
        this.l1 = interfaceC21154317qP;
        this.l2 = frameLayout;
        this.z3 = z;
    }
}
