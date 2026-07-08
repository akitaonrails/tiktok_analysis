package com.ss.android.ugc.aweme.ecommerce.base.osp.strategy;

import X.AbstractC1746380vXw;
import X.C040C;
import X.C19465311Dn;
import X.C924703jR;
import X.EnumC969503qf;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
@C040C(name = "payment_method")
public final class USPaymentStrategyService extends DefaultPaymentStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService
    /* JADX INFO: renamed from: LJFF */
    public final PaymentViewModel LIZIZ() {
        return (PaymentViewModel) PaymentViewModel.class.newInstance();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final /* bridge */ /* synthetic */ ViewModel LIZIZ() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.US_PAYMENT_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        C924703jR c924703jR;
        if ((abstractC1746380vXw instanceof C924703jR) && (c924703jR = (C924703jR) abstractC1746380vXw) != null) {
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 712), new AwS580S0100000_1(c924703jR, 676), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 692), AFwS228S0000000_1.get$arr$(651), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 696), new AwS580S0100000_1(c924703jR, 699), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 702), new AwS580S0100000_1(c924703jR, 704), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 707), new AwS580S0100000_1(c924703jR, 689), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 691), new AwS580S0100000_1(c924703jR, 693), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 695), new AwS580S0100000_1(c924703jR, 698), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 701), AFwS228S0000000_1.get$arr$(652), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 706), AFwS228S0000000_1.get$arr$(653), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 710), new AwS580S0100000_1(c924703jR, 714), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 716), new AwS580S0100000_1(c924703jR, 656), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 658), new AwS580S0100000_1(c924703jR, 661), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 663), new AwS580S0100000_1(c924703jR, 666), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 669), AFwS228S0000000_1.get$arr$(646), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 673), new AwS580S0100000_1(c924703jR, 678), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 681), new AwS580S0100000_1(c924703jR, 684), null);
            c19465311Dn.LJFF(new AwS580S0100000_1(c924703jR, 687), AFwS228S0000000_1.get$arr$(649), null);
        }
    }
}
