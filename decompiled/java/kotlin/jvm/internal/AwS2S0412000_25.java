package kotlin.jvm.internal;

import X.AbstractC1689250u3n;
import X.AbstractC1689280u3q;
import X.C05P1;
import X.C05VF;
import X.C09AY;
import X.C1614390s73;
import X.C1670770tZz;
import X.C1675460thY;
import X.C1682210tsR;
import X.C1687320u0g;
import X.C1689210u3j;
import X.C1689420u44;
import X.C341440Da2;
import X.EnumC1670920taE;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1682240tsU;
import X.InterfaceC1685750ty9;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS2S0412000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0412000_25 awS2S0412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1682210tsR.LIZ((C05P1) awS2S0412000_25.l0, (InterfaceC1682240tsU) awS2S0412000_25.l1, (C05VF) awS2S0412000_25.l2, awS2S0412000_25.z4, (InterfaceC1685750ty9) awS2S0412000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0412000_25.i5 | 1), awS2S0412000_25.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0412000_25 awS2S0412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689210u3j.LJI((AbstractC1689250u3n) awS2S0412000_25.l0, (Function1) awS2S0412000_25.l1, (Function1) awS2S0412000_25.l2, (Function1) awS2S0412000_25.l3, awS2S0412000_25.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0412000_25.i5 | 1), awS2S0412000_25.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S0412000_25 awS2S0412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670770tZz.LIZ((EnumC1670920taE) awS2S0412000_25.l0, awS2S0412000_25.z4, (InterfaceC1685750ty9) awS2S0412000_25.l1, (Function0) awS2S0412000_25.l2, (InterfaceC1631620sYq) awS2S0412000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0412000_25.i5 | 1), awS2S0412000_25.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S0412000_25 awS2S0412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675460thY.LIZLLL((Context) awS2S0412000_25.l0, (C1614390s73) awS2S0412000_25.l1, (Function0) awS2S0412000_25.l2, awS2S0412000_25.z4, (InterfaceC1685750ty9) awS2S0412000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS2S0412000_25.i5 | 1), awS2S0412000_25.i6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0412000_25(C05P1 c05p1, C05P1<C1687320u0g> c05p12, InterfaceC1682240tsU interfaceC1682240tsU, C05VF c05vf, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c05p1;
        this.l1 = c05p12;
        this.l2 = interfaceC1682240tsU;
        this.z4 = c05vf;
        this.l3 = z;
        this.i5 = interfaceC1685750ty9;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0412000_25(EnumC1670920taE enumC1670920taE, EnumC1670920taE enumC1670920taE2, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, InterfaceC1631620sYq<? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = enumC1670920taE;
        this.z4 = enumC1670920taE2;
        this.l1 = z;
        this.l2 = interfaceC1685750ty9;
        this.l3 = function0;
        this.i5 = interfaceC1631620sYq;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0412000_25(AbstractC1689250u3n abstractC1689250u3n, AbstractC1689250u3n abstractC1689250u3n2, Function1<? super C1689420u44, Unit> function1, Function1<? super AbstractC1689280u3q, Unit> function12, Function1<? super AbstractC1689280u3q, Unit> function13, boolean z, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = abstractC1689250u3n;
        this.l1 = abstractC1689250u3n2;
        this.l2 = function1;
        this.l3 = function12;
        this.z4 = function13;
        this.i5 = z ? 1 : 0;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0412000_25(Context context, Context context2, C1614390s73 c1614390s73, Function0<Unit> function0, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c1614390s73;
        this.z4 = function0;
        this.l3 = z;
        this.i5 = interfaceC1685750ty9;
        this.i6 = i;
    }
}
