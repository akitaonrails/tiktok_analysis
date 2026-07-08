package kotlin.jvm.internal;

import X.AnonymousClass1407;
import X.C09AY;
import X.C13BV;
import com.ss.android.ugc.aweme.tako.ccl.net.GetIncrementalMsgResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS56S0000100_30 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

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

    public static final Object invoke$0(AwS56S0000100_30 awS56S0000100_30) {
        return new GetIncrementalMsgResponse(C13BV.INSTANCE, awS56S0000100_30.j0, false, false, 8, null);
    }

    public static final Object invoke$1(AwS56S0000100_30 awS56S0000100_30) {
        AnonymousClass1407 anonymousClass1407 = AnonymousClass1407.LIZ;
        long j = awS56S0000100_30.j0;
        anonymousClass1407.getClass();
        AnonymousClass1407.LIZJ(j, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0000100_30(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
