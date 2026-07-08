package com.ss.android.ugc.aweme.ecommerce.us.logistic.engine;

import X.AbstractC1746380vXw;
import X.C040C;
import X.C19465311Dn;
import X.EnumC969503qf;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.vm.USDeliveryPanelViewModel;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
@C040C(name = "logistics")
public final class USLogisticStrategyService extends DefaultLogisticStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new USDeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService
    /* JADX INFO: renamed from: LJFF */
    public final DeliveryPanelViewModel LIZIZ() {
        return new USDeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC969503qf getType() {
        return EnumC969503qf.US_LOGISTICS;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        if (!(abstractC1746380vXw instanceof LogisticAdapter)) {
            return;
        }
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 916), AFwS228S0000000_1.get$arr$(826), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 917), AFwS228S0000000_1.get$arr$(827), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 918), AFwS228S0000000_1.get$arr$(815), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 902), new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 904), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 906), AFwS228S0000000_1.get$arr$(823), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 914), AFwS228S0000000_1.get$arr$(824), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 915), AFwS228S0000000_1.get$arr$(825), null);
    }
}
