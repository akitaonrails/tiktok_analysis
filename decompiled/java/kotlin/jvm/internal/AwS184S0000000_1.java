package kotlin.jvm.internal;

import X.C04CC;
import X.C09AY;
import X.C1058304Bx;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS184S0000000_1 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS184S0000000_1 awS184S0000000_1) {
        return new C04CC();
    }

    public static final Object invoke$1(AwS184S0000000_1 awS184S0000000_1) {
        return new C1058304Bx();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S0000000_1(SeaPdpViewModel seaPdpViewModel, int i) {
        super(0);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS184S0000000_1(PdpViewModel pdpViewModel, int i) {
        super(0);
        this.$t = i;
    }
}
