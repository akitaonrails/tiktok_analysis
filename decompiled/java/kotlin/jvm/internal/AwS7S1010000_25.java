package kotlin.jvm.internal;

import X.C09AY;
import X.C1687320u0g;
import X.C1696490uFT;
import X.C1696500uFU;
import X.InterfaceC1692460u8y;
import X.InterfaceC2217461Bqa;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS7S1010000_25 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AwS7S1010000_25 awS7S1010000_25, Object obj) {
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        if (awS7S1010000_25.z1) {
            String str = awS7S1010000_25.s0;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
            interfaceC1692460u8y.LIZJ(C1696500uFU.LJJIJL, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S1010000_25 awS7S1010000_25, Object obj) {
        C1687320u0g c1687320u0g = (C1687320u0g) obj;
        String str = awS7S1010000_25.s0;
        boolean z = false;
        if (awS7S1010000_25.z1 && str.length() > 0) {
            z = true;
        }
        return C1687320u0g.LIZ(c1687320u0g, null, str, z, null, 0, null, 57);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1010000_25(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1010000_25(boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.s0 = str;
    }
}
