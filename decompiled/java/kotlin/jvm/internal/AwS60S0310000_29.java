package kotlin.jvm.internal;

import X.C09AY;
import X.C19471611Fy;
import X.C19530011b0;
import X.C19530211b2;
import X.C786410Ut5;
import X.InterfaceC19526511aR;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS60S0310000_29 extends C09AY implements Function0 {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS60S0310000_29 r16) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS60S0310000_29.invoke$0(kotlin.jvm.internal.AwS60S0310000_29):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS60S0310000_29 awS60S0310000_29) {
        TuxIconView tuxIconView = ((C19471611Fy) awS60S0310000_29.l0).LLIZLLLIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        if (!awS60S0310000_29.z3) {
            ((Function1) awS60S0310000_29.l1).invoke((TuxIconView) awS60S0310000_29.l2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS60S0310000_29(C19471611Fy c19471611Fy, C19471611Fy c19471611Fy2, boolean z, Function1<? super View, Unit> function1, TuxIconView tuxIconView) {
        super(0);
        this.$t = tuxIconView;
        this.l0 = c19471611Fy;
        this.z3 = c19471611Fy2;
        this.l1 = z;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S0310000_29(C19530011b0 c19530011b0, boolean z, C19530211b2 c19530211b2, InterfaceC19526511aR interfaceC19526511aR, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19530011b0;
        this.z3 = z;
        this.l1 = c19530211b2;
        this.l2 = interfaceC19526511aR;
    }
}
