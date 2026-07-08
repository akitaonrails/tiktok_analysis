package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0CHQ;
import X.C0L2D;
import X.C189200o6;
import X.C1910707e5;
import X.InterfaceC1910807e6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS188S0000000_3 extends C09AY implements Function0 {
    public final int $t;

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

    public static final Object invoke$0(AwS188S0000000_3 awS188S0000000_3) {
        Object c098200Yq;
        try {
            C0CHQ.LIZ().LJJIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS188S0000000_3 awS188S0000000_3) {
        InterfaceC1910807e6.LIZ.getClass();
        InterfaceC1910807e6 interfaceC1910807e6LIZ = C1910707e5.LIZ();
        if (interfaceC1910807e6LIZ != null) {
            interfaceC1910807e6LIZ.LIZIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS188S0000000_3(C0L2D c0l2d, int i) {
        super(0);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS188S0000000_3(String str, int i) {
        super(0);
        this.$t = i;
    }
}
