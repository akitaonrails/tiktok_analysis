package kotlin.jvm.internal;

import X.C05P0;
import X.C05P1;
import X.C05TC;
import X.C09AY;
import X.C109F;
import X.C109I;
import X.C1389105c9;
import X.C1678560tmY;
import X.C1690080u58;
import X.C191984108w;
import X.C23118094a;
import X.C23250099c;
import X.EnumC1360305Ub;
import X.EnumC1678550tmX;
import X.InterfaceC1728106pj;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import android.content.Context;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS87S0210000_2 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS87S0210000_2 awS87S0210000_2) {
        boolean z = true;
        if (!((Boolean) ((C05P1) awS87S0210000_2.l0).getValue()).booleanValue() || ((C05P1) awS87S0210000_2.l1).getValue() != C05TC.HIDE_AWEME || awS87S0210000_2.z2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS87S0210000_2 awS87S0210000_2) {
        if (awS87S0210000_2.z2 && ((C1678560tmY) awS87S0210000_2.l0).LIZ.LIZLLL.invoke(EnumC1678550tmX.Closed).booleanValue()) {
            C23250099c.LIZLLL((InterfaceC497601wk) awS87S0210000_2.l1, null, null, new C1389105c9((C1678560tmY) awS87S0210000_2.l0, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS87S0210000_2 awS87S0210000_2) {
        ((C191984108w) awS87S0210000_2.l0).LIZIZ(null, ((C109I) awS87S0210000_2.l1).LLILLJJLI.LIZLLL, awS87S0210000_2.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS87S0210000_2 awS87S0210000_2) {
        ((C191984108w) awS87S0210000_2.l0).LIZIZ(null, ((C109F) awS87S0210000_2.l1).LLILLJJLI.LIZLLL, awS87S0210000_2.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS87S0210000_2 awS87S0210000_2) {
        if (awS87S0210000_2.z2) {
            ((Function1) awS87S0210000_2.l0).invoke(Boolean.FALSE);
        } else {
            Function0 function0 = (Function0) awS87S0210000_2.l1;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS87S0210000_2 awS87S0210000_2) {
        boolean z;
        if (awS87S0210000_2.z2 && ((C1690080u58) awS87S0210000_2.l0).LJIIIZ().LJII().isEmpty()) {
            return Boolean.TRUE;
        }
        int iLJII = ((C1690080u58) awS87S0210000_2.l0).LJII();
        Integer num = (Integer) ((C05P1) awS87S0210000_2.l1).getValue();
        if (num != null && iLJII == num.intValue() && ((C1690080u58) awS87S0210000_2.l0).LJIIIIZZ() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS87S0210000_2 awS87S0210000_2) {
        if (!awS87S0210000_2.z2) {
            C23118094a.LJ(((InterfaceC497601wk) awS87S0210000_2.l0).getCoroutineContext());
            ((Function1) awS87S0210000_2.l1).invoke(EnumC1360305Ub.SCALING);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS87S0210000_2 awS87S0210000_2) {
        if (awS87S0210000_2.z2) {
            ((InterfaceC1728106pj) awS87S0210000_2.l0).LIZIZ(null, null);
        } else {
            ((InterfaceC1728106pj) awS87S0210000_2.l0).LIZ((Context) awS87S0210000_2.l1, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS87S0210000_2 awS87S0210000_2) {
        ((FeedSkylightListViewModel) awS87S0210000_2.l0).TQ2((List) awS87S0210000_2.l1, true);
        if (awS87S0210000_2.z2) {
            ((FeedSkylightListViewModel) awS87S0210000_2.l0).UQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS87S0210000_2 awS87S0210000_2) {
        ((FeedSkylightListViewModel) awS87S0210000_2.l0).TQ2((List) awS87S0210000_2.l1, true);
        if (awS87S0210000_2.z2) {
            ((FeedSkylightListViewModel) awS87S0210000_2.l0).UQ2();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S0210000_2(C191984108w c191984108w, C109F c109f, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c191984108w;
        this.l1 = c109f;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S0210000_2(C191984108w c191984108w, C109I c109i, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c191984108w;
        this.l1 = c109i;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S0210000_2(FeedSkylightListViewModel feedSkylightListViewModel, FeedSkylightListViewModel feedSkylightListViewModel2, List<? extends InterfaceC1891350zJl> list, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = feedSkylightListViewModel;
        this.l1 = feedSkylightListViewModel2;
        this.z2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S0210000_2(boolean z, boolean z2, InterfaceC497601wk interfaceC497601wk, Function1<? super EnumC1360305Ub, Unit> function1) {
        super(0);
        this.$t = function1;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = interfaceC497601wk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S0210000_2(boolean z, C05P0 c05p0, C05P0 c05p02, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c05p0;
        this.l1 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S0210000_2(boolean z, InterfaceC1728106pj interfaceC1728106pj, Context context, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = interfaceC1728106pj;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S0210000_2(boolean z, C1678560tmY c1678560tmY, InterfaceC497601wk interfaceC497601wk, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c1678560tmY;
        this.l1 = interfaceC497601wk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS87S0210000_2(boolean z, boolean z2, C1690080u58 c1690080u58, C05P1<Integer> c05p1) {
        super(0);
        this.$t = c05p1;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = c1690080u58;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S0210000_2(boolean z, Function0 function0, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = function1;
        this.l1 = function0;
    }
}
