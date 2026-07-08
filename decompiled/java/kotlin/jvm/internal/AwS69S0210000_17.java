package kotlin.jvm.internal;

import X.AbstractC1139430fkz;
import X.C09AY;
import X.C1098200egU;
import X.C1098290egd;
import X.C1136560fgM;
import X.C1145980fvY;
import X.C1146090fvj;
import X.C118300cf;
import X.EnumC994430bz7;
import X.InterfaceC1631630sYr;
import com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS69S0210000_17 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS69S0210000_17 awS69S0210000_17, Object obj) {
        ((MiddleTouchWidget) awS69S0210000_17.l0).L1((C1098200egU) awS69S0210000_17.l1, null, Integer.valueOf(((Number) obj).intValue()), awS69S0210000_17.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS69S0210000_17 awS69S0210000_17, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS69S0210000_17.l0;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke((C1098290egd) awS69S0210000_17.l1, Integer.valueOf(iIntValue), "frequency_controlled", Boolean.valueOf(awS69S0210000_17.z2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS69S0210000_17 awS69S0210000_17, Object obj) {
        return C1145980fvY.LIZ((C1145980fvY) obj, null, null, new C1146090fvj((EnumC994430bz7) awS69S0210000_17.l0, ((C118300cf) awS69S0210000_17.l1).element, false, awS69S0210000_17.z2, false), false, 11);
    }

    public static final Object invoke$3(AwS69S0210000_17 awS69S0210000_17, Object obj) {
        ((C1136560fgM) awS69S0210000_17.l0).LIZJ().LJ(false, false, awS69S0210000_17.z2);
        ((AbstractC1139430fkz) awS69S0210000_17.l1).LJIIJ(302);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S0210000_17(EnumC994430bz7 enumC994430bz7, C118300cf c118300cf, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC994430bz7;
        this.l1 = c118300cf;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S0210000_17(C1136560fgM c1136560fgM, AbstractC1139430fkz abstractC1139430fkz, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1136560fgM;
        this.z2 = z;
        this.l1 = abstractC1139430fkz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS69S0210000_17(InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1631630sYr<? super C1098290egd, ? super Integer, ? super String, ? super Boolean, Unit> interfaceC1631630sYr2, C1098290egd c1098290egd, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = interfaceC1631630sYr;
        this.l1 = interfaceC1631630sYr2;
        this.z2 = c1098290egd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S0210000_17(MiddleTouchWidget middleTouchWidget, C1098200egU c1098200egU, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = middleTouchWidget;
        this.l1 = c1098200egU;
        this.z2 = z;
    }
}
