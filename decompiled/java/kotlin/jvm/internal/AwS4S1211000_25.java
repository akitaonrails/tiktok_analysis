package kotlin.jvm.internal;

import X.AbstractC19875512pd;
import X.C09AY;
import X.C1669600tY6;
import X.C1684070tvR;
import X.C1684090tvT;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS4S1211000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS4S1211000_25 awS4S1211000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669600tY6.LIZJ((InterfaceC1685750ty9) awS4S1211000_25.l1, awS4S1211000_25.s0, awS4S1211000_25.z3, (Function0) awS4S1211000_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S1211000_25.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1211000_25 awS4S1211000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1684070tvR.LIZ((Context) awS4S1211000_25.l1, awS4S1211000_25.s0, awS4S1211000_25.z3, (AbstractC19875512pd) awS4S1211000_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S1211000_25.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S1211000_25(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, String str, boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$t = i;
        this.l1 = interfaceC1685750ty9;
        this.s0 = interfaceC1685750ty92;
        this.z3 = str;
        this.l2 = z;
        this.i4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S1211000_25(Context context, Context context2, String str, boolean z, AbstractC19875512pd<C1684090tvT<?>> abstractC19875512pd, int i) {
        super(2);
        this.$t = i;
        this.l1 = context;
        this.s0 = context2;
        this.z3 = str;
        this.l2 = z;
        this.i4 = abstractC19875512pd;
    }
}
