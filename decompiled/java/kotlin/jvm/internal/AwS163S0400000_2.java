package kotlin.jvm.internal;

import X.C05P0;
import X.C05ZJ;
import X.C09AE;
import X.C09AY;
import X.InterfaceC1369205Xm;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS163S0400000_2 extends C09AY implements Function2 {
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

    /* JADX WARN: Removed duplicated region for block: B:47:0x0192 A[PHI: r1
      0x0192: PHI (r1v9 java.lang.Float) = (r1v8 java.lang.Float), (r1v11 java.lang.Float) binds: [B:56:0x01d0, B:46:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS163S0400000_2 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS163S0400000_2.invoke$0(kotlin.jvm.internal.AwS163S0400000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS163S0400000_2 awS163S0400000_2, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((C05P0) awS163S0400000_2.l1).setValue(obj);
        if (zBooleanValue) {
            if (((Boolean) ((C05P0) awS163S0400000_2.l2).getValue()).booleanValue()) {
                ((Function0) awS163S0400000_2.l0).invoke();
                ((C05P0) awS163S0400000_2.l2).setValue(Boolean.FALSE);
            }
            ((C05P0) awS163S0400000_2.l3).setValue(Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS163S0400000_2(C05ZJ c05zj, C05ZJ c05zj2, InterfaceC1369205Xm interfaceC1369205Xm, C05P0<C09AE> c05p0, InterfaceC497601wk interfaceC497601wk) {
        super(2);
        this.$t = interfaceC497601wk;
        this.l0 = c05zj;
        this.l1 = c05zj2;
        this.l2 = interfaceC1369205Xm;
        this.l3 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS163S0400000_2(Function0 function0, Function0<Unit> function02, C05P0<String> c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(2);
        this.$t = c05p03;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = c05p0;
        this.l3 = c05p02;
    }
}
