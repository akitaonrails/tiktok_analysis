package kotlin.jvm.internal;

import X.C09AY;
import X.C1619720sFe;
import X.C1785140wYS;
import X.InterfaceC1897260zTI;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS111S1000000_27 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return this.s0;
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$1(AwS111S1000000_27 awS111S1000000_27) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", awS111S1000000_27.s0);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("byte_sync_event", linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS111S1000000_27 awS111S1000000_27) {
        return Boolean.valueOf(C1785140wYS.LIZLLL(awS111S1000000_27.s0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS111S1000000_27(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
