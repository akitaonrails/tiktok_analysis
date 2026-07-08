package com.ss.android.ugc.aweme.ecommerce.base.osp.strategy;

import X.AbstractC1002403vy;
import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C19465311Dn;
import X.C924703jR;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
@C040C(name = "payment_method")
public class DefaultPaymentStrategyService extends AbstractC1003203w6<PaymentViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public PaymentViewModel LIZIZ() {
        return (PaymentViewModel) PaymentViewModel.class.newInstance();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<PaymentViewModel> LIZJ(final LifecycleOwner lifecycleOwner) {
        return new AbstractC1002403vy<PaymentViewModel>(lifecycleOwner) { // from class: X.03w1
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        C924703jR c924703jR;
        if ((abstractC1746380vXw instanceof C924703jR) && (c924703jR = (C924703jR) abstractC1746380vXw) != null) {
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 685), new AwS580S0100000_1(c924703jR, 711), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 671), AFwS228S0000000_1.get$arr$(647), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 675), AFwS228S0000000_1.get$arr$(648), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 680), new AwS580S0100000_1(c924703jR, 683), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 686), new AwS580S0100000_1(c924703jR, 659), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 662), new AwS580S0100000_1(c924703jR, 664), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 667), new AwS580S0100000_1(c924703jR, 670), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 672), new AwS580S0100000_1(c924703jR, 674), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 677), new AwS580S0100000_1(c924703jR, 679), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 682), new AwS580S0100000_1(c924703jR, 688), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 690), AFwS228S0000000_1.get$arr$(650), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 694), new AwS580S0100000_1(c924703jR, 697), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, OppoPermissionPopupMaskDelayExp.DEFAULT), new AwS580S0100000_1(c924703jR, 703), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 705), new AwS580S0100000_1(c924703jR, 708), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 709), new AwS580S0100000_1(c924703jR, 713), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 715), AFwS228S0000000_1.get$arr$(654), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 655), new AwS580S0100000_1(c924703jR, 657), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 660), AFwS228S0000000_1.get$arr$(645), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 665), new AwS580S0100000_1(c924703jR, 668), null);
        }
    }
}
