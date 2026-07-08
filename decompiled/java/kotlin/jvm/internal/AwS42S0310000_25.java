package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.C020W;
import X.C05P0;
import X.C09AY;
import X.C0MAE;
import X.C1670740tZw;
import X.C1670750tZx;
import X.C1675860tiC;
import X.C1685400txa;
import X.C1690020u52;
import X.C1695220uDQ;
import X.C1695230uDR;
import X.C19719212De;
import X.C5183020f;
import X.InterfaceC1669010tX9;
import X.InterfaceC1680820tqC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS42S0310000_25 extends C09AY implements Function1 {
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
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS42S0310000_25 awS42S0310000_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        if (((Boolean) ((Function0) awS42S0310000_25.l0).invoke()).booleanValue()) {
            if (awS42S0310000_25.z3) {
                InterfaceC1680820tqC interfaceC1680820tqC = (InterfaceC1680820tqC) awS42S0310000_25.l1;
                C1685400txa c1685400txa = (C1685400txa) awS42S0310000_25.l2;
                long jLJIJI = interfaceC1669010tX9.LJIJI();
                C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
                long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
                c1695230uDRLJLJI.LIZ().save();
                try {
                    c1695230uDRLJLJI.LIZ.LIZ(-1.0f, 1.0f, jLJIJI);
                    C1675860tiC.LJFF(interfaceC1669010tX9, interfaceC1680820tqC, c1685400txa, 46);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZIZ);
                    throw th;
                }
            } else {
                C1675860tiC.LJFF(interfaceC1669010tX9, (InterfaceC1680820tqC) awS42S0310000_25.l1, (C1685400txa) awS42S0310000_25.l2, 46);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS42S0310000_25 awS42S0310000_25, Object obj) {
        List list = (List) awS42S0310000_25.l0;
        ((C0MAE) obj).LIZJ(list.size(), new C020W(AFwS303S0000000_19.get$arr$(38), list, 58), new C5183020f(list, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 217), new C19719212De(-1091073711, new C1670740tZw(list, awS42S0310000_25.z3, (HashSet) awS42S0310000_25.l1, (Function1) awS42S0310000_25.l2), true));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS42S0310000_25 awS42S0310000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AwS76S0210000_25 awS76S0210000_25 = new AwS76S0210000_25((List) awS42S0310000_25.l1, (List<C1690020u52>) awS42S0310000_25.l2, (List<C1690020u52>) awS42S0310000_25.z3, true);
        abstractC1683310tuD.LIZ = true;
        awS76S0210000_25.invoke(abstractC1683310tuD);
        abstractC1683310tuD.LIZ = false;
        ((C05P0) awS42S0310000_25.l0).getValue();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS42S0310000_25 awS42S0310000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AwS76S0210000_25 awS76S0210000_25 = new AwS76S0210000_25((List) awS42S0310000_25.l1, (List<C1690020u52>) awS42S0310000_25.l2, (List<C1690020u52>) awS42S0310000_25.z3, true);
        abstractC1683310tuD.LIZ = true;
        awS76S0210000_25.invoke(abstractC1683310tuD);
        abstractC1683310tuD.LIZ = false;
        ((C05P0) awS42S0310000_25.l0).getValue();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S0310000_25(C05P0 c05p0, C05P0<Unit> c05p02, List<C1690020u52> list, List<C1690020u52> list2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = list;
        this.z3 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S0310000_25(List list, List<? extends List<C1670750tZx>> list2, boolean z, HashSet<Long> hashSet, Function1<? super Long, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = list;
        this.z3 = list2;
        this.l1 = z;
        this.l2 = hashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0310000_25(Function0 function0, boolean z, InterfaceC1680820tqC interfaceC1680820tqC, C1695220uDQ c1695220uDQ, int i) {
        super(1);
        this.$t = i;
        this.l0 = function0;
        this.z3 = z;
        this.l1 = interfaceC1680820tqC;
        this.l2 = c1695220uDQ;
    }
}
