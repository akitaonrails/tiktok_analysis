package kotlin.jvm.internal;

import X.C09AY;
import X.C1029270ctJ;
import X.C1040740dBo;
import X.InterfaceC1036110d4L;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS2S1220000_16 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

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

    public static final Object invoke$0(AwS2S1220000_16 awS2S1220000_16) {
        C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS2S1220000_16.l1;
        String str = awS2S1220000_16.s0;
        if (str == null) {
            str = "";
        }
        boolean z = awS2S1220000_16.z3;
        c1029270ctJ.getClass();
        C1029270ctJ.LIZIZ(interfaceC1036110d4L, str, z, C1029270ctJ.LIZ(true, true), (Boolean) awS2S1220000_16.l2, awS2S1220000_16.z4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1220000_16 awS2S1220000_16) {
        C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) awS2S1220000_16.l1;
        String str = awS2S1220000_16.s0;
        if (str == null) {
            str = "";
        }
        boolean z = awS2S1220000_16.z3;
        c1029270ctJ.getClass();
        C1029270ctJ.LIZIZ(interfaceC1036110d4L, str, z, C1029270ctJ.LIZ(true, true), (Boolean) awS2S1220000_16.l2, awS2S1220000_16.z4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1220000_16(InterfaceC1036110d4L interfaceC1036110d4L, String str, boolean z, Boolean bool, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC1036110d4L;
        this.s0 = str;
        this.z3 = z;
        this.l2 = bool;
        this.z4 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1220000_16(C1040740dBo c1040740dBo, String str, boolean z, Boolean bool, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1040740dBo;
        this.s0 = str;
        this.z3 = z;
        this.l2 = bool;
        this.z4 = z2;
    }
}
