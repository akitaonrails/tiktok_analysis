package kotlin.jvm.internal;

import X.C09AY;
import X.C1502810pD5;
import X.EnumC1502800pD4;
import X.InterfaceC1502770pD1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS74S0210000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS74S0210000_23 awS74S0210000_23, Object obj) {
        EnumC1502800pD4 enumC1502800pD4;
        C1502810pD5 c1502810pD5 = (C1502810pD5) obj;
        c1502810pD5.LIZ = (InterfaceC1502770pD1) awS74S0210000_23.l0;
        c1502810pD5.LIZIZ = (T) awS74S0210000_23.l1;
        if (awS74S0210000_23.z2) {
            enumC1502800pD4 = EnumC1502800pD4.GREATER_THAN;
        } else {
            enumC1502800pD4 = EnumC1502800pD4.GREATER_THAN_OR_EQUAL_TO;
        }
        c1502810pD5.LIZJ = enumC1502800pD4;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS74S0210000_23 awS74S0210000_23, Object obj) {
        EnumC1502800pD4 enumC1502800pD4;
        C1502810pD5 c1502810pD5 = (C1502810pD5) obj;
        c1502810pD5.LIZ = (InterfaceC1502770pD1) awS74S0210000_23.l0;
        c1502810pD5.LIZIZ = (T) awS74S0210000_23.l1;
        if (awS74S0210000_23.z2) {
            enumC1502800pD4 = EnumC1502800pD4.LESS_THAN;
        } else {
            enumC1502800pD4 = EnumC1502800pD4.LESS_THAN_OR_EQUAL_TO;
        }
        c1502810pD5.LIZJ = enumC1502800pD4;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS74S0210000_23 awS74S0210000_23, Object obj) {
        EnumC1502800pD4 enumC1502800pD4;
        C1502810pD5 c1502810pD5 = (C1502810pD5) obj;
        c1502810pD5.LIZ = (InterfaceC1502770pD1) awS74S0210000_23.l0;
        c1502810pD5.LIZIZ = (T) awS74S0210000_23.l1;
        if (awS74S0210000_23.z2) {
            enumC1502800pD4 = EnumC1502800pD4.GREATER_THAN;
        } else {
            enumC1502800pD4 = EnumC1502800pD4.GREATER_THAN_OR_EQUAL_TO;
        }
        c1502810pD5.LIZJ = enumC1502800pD4;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS74S0210000_23 awS74S0210000_23, Object obj) {
        EnumC1502800pD4 enumC1502800pD4;
        C1502810pD5 c1502810pD5 = (C1502810pD5) obj;
        c1502810pD5.LIZ = (InterfaceC1502770pD1) awS74S0210000_23.l0;
        c1502810pD5.LIZIZ = (T) awS74S0210000_23.l1;
        if (awS74S0210000_23.z2) {
            enumC1502800pD4 = EnumC1502800pD4.LESS_THAN;
        } else {
            enumC1502800pD4 = EnumC1502800pD4.LESS_THAN_OR_EQUAL_TO;
        }
        c1502810pD5.LIZJ = enumC1502800pD4;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS74S0210000_23(InterfaceC1502770pD1 interfaceC1502770pD1, InterfaceC1502770pD1<Object> interfaceC1502770pD12, Object obj, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = interfaceC1502770pD1;
        this.l1 = interfaceC1502770pD12;
        this.z2 = obj;
    }
}
