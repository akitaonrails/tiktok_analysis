package kotlin.jvm.internal;

import X.C020W;
import X.C09AY;
import X.C1207400hWc;
import X.C1207520hWo;
import X.C1207840hXK;
import X.C1207850hXL;
import X.C12QB;
import X.C849850XVn;
import X.InterfaceC1207030hW1;
import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS21S0300100_18 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S0300100_18 awS21S0300100_18) {
        String str;
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS21S0300100_18.j3;
        C1207520hWo c1207520hWo = ((C1207850hXL) awS21S0300100_18.l0).LIZIZ;
        String str2 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
        } else {
            str = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LIZJ(jCurrentTimeMillis, str, str2, true);
        ((C12QB) awS21S0300100_18.l1).LIZ();
        ((C1207840hXK) awS21S0300100_18.l2).LIZIZ.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0300100_18 awS21S0300100_18) {
        String str;
        String str2;
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Context) awS21S0300100_18.l0).getResources().getString(2131836200), false);
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        C1207520hWo c1207520hWo = (C1207520hWo) awS21S0300100_18.l1;
        String str3 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
            str3 = c1207520hWo.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - awS21S0300100_18.j3;
        C020W c020w = new C020W((Context) awS21S0300100_18.l0, (C1207520hWo) awS21S0300100_18.l1, 65);
        c1207400hWc.getClass();
        C1207400hWc.LJIILJJIL(0, jCurrentTimeMillis, str, str2, str3, c020w);
        InterfaceC1207030hW1 interfaceC1207030hW1 = (InterfaceC1207030hW1) awS21S0300100_18.l2;
        if (interfaceC1207030hW1 != null) {
            interfaceC1207030hW1.LIZIZ(1, "cancel in open settings dialog");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S0300100_18 awS21S0300100_18) {
        String str;
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Activity) awS21S0300100_18.l0).getResources().getString(2131836200), true);
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS21S0300100_18.j3;
        C1207520hWo c1207520hWo = (C1207520hWo) awS21S0300100_18.l1;
        String str2 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
        } else {
            str = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LIZJ(jCurrentTimeMillis, str, str2, false);
        InterfaceC1207030hW1 interfaceC1207030hW1 = (InterfaceC1207030hW1) awS21S0300100_18.l2;
        if (interfaceC1207030hW1 != null) {
            interfaceC1207030hW1.LIZIZ(3, "click outside to dismiss pre popup");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS21S0300100_18 awS21S0300100_18) {
        String str;
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Activity) awS21S0300100_18.l0).getResources().getString(2131836184), true);
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS21S0300100_18.j3;
        C1207520hWo c1207520hWo = (C1207520hWo) awS21S0300100_18.l1;
        String str2 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
        } else {
            str = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LIZJ(jCurrentTimeMillis, str, str2, true);
        ((Function0) awS21S0300100_18.l2).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0300100_18(long j, C12QB c12qb, C1207840hXK c1207840hXK, C1207850hXL c1207850hXL, int i) {
        super(0);
        this.$t = i;
        this.j3 = j;
        this.l0 = c1207850hXL;
        this.l1 = c12qb;
        this.l2 = c1207840hXK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0300100_18(Activity activity, long j, C1207520hWo c1207520hWo, InterfaceC1207030hW1 interfaceC1207030hW1, int i) {
        super(0);
        this.$t = i;
        this.l0 = activity;
        this.j3 = j;
        this.l1 = c1207520hWo;
        this.l2 = interfaceC1207030hW1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0300100_18(Activity activity, long j, C1207520hWo c1207520hWo, AwS56S0310000_18 awS56S0310000_18, int i) {
        super(0);
        this.$t = i;
        this.l0 = activity;
        this.j3 = j;
        this.l1 = c1207520hWo;
        this.l2 = awS56S0310000_18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0300100_18(Context context, C1207520hWo c1207520hWo, long j, InterfaceC1207030hW1 interfaceC1207030hW1, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1207520hWo;
        this.j3 = j;
        this.l2 = interfaceC1207030hW1;
    }
}
