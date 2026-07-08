package kotlin.jvm.internal;

import X.C09AY;
import X.C23250099c;
import X.C881203cQ;
import X.C897703f5;
import X.C906803gY;
import X.InterfaceC911103hF;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class AwS49S0310000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS49S0310000_1 awS49S0310000_1) {
        InterfaceC911103hF interfaceC911103hF = ((C897703f5) awS49S0310000_1.l0).LJIILJJIL;
        if (interfaceC911103hF != null) {
            interfaceC911103hF.LIZIZ();
        }
        if (awS49S0310000_1.z3) {
            ((Function0) awS49S0310000_1.l1).invoke();
            Function1 function1 = (Function1) awS49S0310000_1.l2;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS49S0310000_1 awS49S0310000_1) {
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) awS49S0310000_1.l0;
        cCDCAddCardViewModel.VQ2((PaymentInfo) awS49S0310000_1.l1, cCDCAddCardViewModel.JQ2(), (List) awS49S0310000_1.l2, awS49S0310000_1.z3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS49S0310000_1 awS49S0310000_1) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((CCDCAddCardViewModel) awS49S0310000_1.l0), null, null, new C881203cQ((Function2) awS49S0310000_1.l1, awS49S0310000_1.z3, (PaymentInfo) awS49S0310000_1.l2, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS49S0310000_1(C897703f5 c897703f5, boolean z, C906803gY c906803gY, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = c897703f5;
        this.z3 = z;
        this.l1 = c906803gY;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS49S0310000_1(CCDCAddCardViewModel cCDCAddCardViewModel, CCDCAddCardViewModel cCDCAddCardViewModel2, PaymentInfo paymentInfo, List<PaymentElement> list, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = cCDCAddCardViewModel;
        this.l1 = cCDCAddCardViewModel2;
        this.l2 = paymentInfo;
        this.z3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS49S0310000_1(CCDCAddCardViewModel cCDCAddCardViewModel, CCDCAddCardViewModel cCDCAddCardViewModel2, Function2<? super Boolean, ? super PaymentInfo, Unit> function2, boolean z, PaymentInfo paymentInfo) {
        super(0);
        this.$t = paymentInfo;
        this.l0 = cCDCAddCardViewModel;
        this.l1 = cCDCAddCardViewModel2;
        this.z3 = function2;
        this.l2 = z;
    }
}
