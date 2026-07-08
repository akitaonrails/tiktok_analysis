package kotlin.jvm.internal;

import X.C09AY;
import X.C0D6E;
import X.C0D6J;
import X.C0D6M;
import X.C1834780xqW;
import X.C323870Cmn;
import X.C491001vg;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS9S0100200_4 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

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

    public static final Object invoke$0(AwS9S0100200_4 awS9S0100200_4, Object obj) {
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, new C491001vg(new C323870Cmn(awS9S0100200_4.j1, awS9S0100200_4.j2, "Download music failed.", (Throwable) awS9S0100200_4.l0)), null, null, null, null, null, null, 520191);
    }

    public static final Object invoke$1(AwS9S0100200_4 awS9S0100200_4, Object obj) {
        CheckoutSession resolvedCheckoutSession;
        C0D6J checkoutState;
        LocalOrderWrapper localOrderWrapper = (LocalOrderWrapper) obj;
        ((C0D6E) awS9S0100200_4.l0).getClass();
        boolean z = false;
        if ((Intrinsics.LJFF(localOrderWrapper.state, C0D6M.INSTANCE) || ((resolvedCheckoutSession = localOrderWrapper.getResolvedCheckoutSession()) != null && (checkoutState = resolvedCheckoutSession.getCheckoutState()) != null && checkoutState != C0D6J.COMPLETED)) && localOrderWrapper.getCreateAtTime() > 0 && awS9S0100200_4.j1 - localOrderWrapper.getCreateAtTime() >= awS9S0100200_4.j2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0100200_4(long j, long j2, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.j2 = j2;
        this.l0 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0100200_4(C0D6E c0d6e, long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0d6e;
        this.j1 = j;
        this.j2 = j2;
    }
}
