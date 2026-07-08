package kotlin.jvm.internal;

import X.C049H;
import X.C09AY;
import X.C123100dR;
import X.C1748720vbi;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS14S1110000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS14S1110000_1 awS14S1110000_1) {
        if (awS14S1110000_1.z2) {
            SmartRouter.buildRoute(((MiniOspFragment) awS14S1110000_1.l1).getContext(), awS14S1110000_1.s0).open();
            TuxNavBar tuxNavBar = ((MiniOspFragment) awS14S1110000_1.l1).LLILZLL;
            if (tuxNavBar != null) {
                C1748720vbi.LIZLLL(tuxNavBar, new C049H(), new AwS580S0100000_1((MiniOspFragment) awS14S1110000_1.l1, 125));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S1110000_1 awS14S1110000_1) {
        if (awS14S1110000_1.z2) {
            SmartRouter.buildRoute(((PaymentFragment) awS14S1110000_1.l1).getContext(), awS14S1110000_1.s0).open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS14S1110000_1 awS14S1110000_1) {
        CCDCAddCardHalfFragment cCDCAddCardHalfFragmentOo;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ccdc_bind_error_settings", true) && !awS14S1110000_1.z2 && C123100dR.LIZ(awS14S1110000_1.s0) && (cCDCAddCardHalfFragmentOo = ((CCDCAddCardAssem) awS14S1110000_1.l1).Oo()) != null) {
            cCDCAddCardHalfFragmentOo.cS();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1110000_1(boolean z, MiniOspFragment miniOspFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l1 = miniOspFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1110000_1(boolean z, PaymentFragment paymentFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l1 = paymentFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S1110000_1(boolean z, String str, CCDCAddCardAssem cCDCAddCardAssem, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.s0 = str;
        this.l1 = cCDCAddCardAssem;
    }
}
