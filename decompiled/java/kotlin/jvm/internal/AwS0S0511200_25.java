package kotlin.jvm.internal;

import X.C09AY;
import X.C1690370u5b;
import X.C1690980u6a;
import X.EnumC1684030tvN;
import X.InterfaceC1666960tTq;
import X.InterfaceC1682270tsX;
import X.InterfaceC1690470u5l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0511200_25 extends C09AY implements Function1 {
    public final int $t;
    public int i6;
    public long j7;
    public long j8;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

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

    public static final Object invoke$0(AwS0S0511200_25 awS0S0511200_25, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC1690470u5l interfaceC1690470u5l = (InterfaceC1690470u5l) awS0S0511200_25.l0;
        return C1690370u5b.LIZ(interfaceC1690470u5l, iIntValue, awS0S0511200_25.j7, (C1690980u6a) awS0S0511200_25.l1, awS0S0511200_25.j8, (EnumC1684030tvN) awS0S0511200_25.l2, (InterfaceC1666960tTq) awS0S0511200_25.l3, (InterfaceC1682270tsX) awS0S0511200_25.l4, interfaceC1690470u5l.getLayoutDirection(), awS0S0511200_25.z5, awS0S0511200_25.i6);
    }

    public static final Object invoke$1(AwS0S0511200_25 awS0S0511200_25, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC1690470u5l interfaceC1690470u5l = (InterfaceC1690470u5l) awS0S0511200_25.l0;
        return C1690370u5b.LIZ(interfaceC1690470u5l, iIntValue, awS0S0511200_25.j7, (C1690980u6a) awS0S0511200_25.l1, awS0S0511200_25.j8, (EnumC1684030tvN) awS0S0511200_25.l2, (InterfaceC1666960tTq) awS0S0511200_25.l3, (InterfaceC1682270tsX) awS0S0511200_25.l4, interfaceC1690470u5l.getLayoutDirection(), awS0S0511200_25.z5, awS0S0511200_25.i6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0511200_25(InterfaceC1690470u5l interfaceC1690470u5l, long j, C1690980u6a c1690980u6a, long j2, EnumC1684030tvN enumC1684030tvN, InterfaceC1666960tTq interfaceC1666960tTq, InterfaceC1682270tsX interfaceC1682270tsX, boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC1690470u5l;
        this.j7 = j;
        this.l1 = c1690980u6a;
        this.j8 = j2;
        this.l2 = enumC1684030tvN;
        this.l3 = interfaceC1666960tTq;
        this.l4 = interfaceC1682270tsX;
        this.z5 = z;
        this.i6 = i;
    }
}
