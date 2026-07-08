package com.ss.android.ugc.aweme.ecommerce.base.delivery.engine;

import X.AbstractC1002403vy;
import X.AbstractC1003203w6;
import X.AbstractC1746380vXw;
import X.C040C;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
@C040C(name = "logistics")
public class DefaultLogisticStrategyService extends AbstractC1003203w6<DeliveryPanelViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public DeliveryPanelViewModel LIZIZ() {
        return new DeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC969503qf getType() {
        return EnumC969503qf.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC1002303vx<DeliveryPanelViewModel> LIZJ(final LifecycleOwner lifecycleOwner) {
        return new AbstractC1002403vy<DeliveryPanelViewModel>(lifecycleOwner) { // from class: X.03vz
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn) {
        if (!(abstractC1746380vXw instanceof LogisticAdapter)) {
            return;
        }
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 889), AFwS228S0000000_1.get$arr$(810), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 895), AFwS228S0000000_1.get$arr$(811), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 896), AFwS228S0000000_1.get$arr$(812), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 897), AFwS228S0000000_1.get$arr$(802), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 882), AFwS228S0000000_1.get$arr$(803), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 883), new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 884), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 885), AFwS228S0000000_1.get$arr$(804), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 886), AFwS228S0000000_1.get$arr$(805), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 887), AFwS228S0000000_1.get$arr$(806), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 888), AFwS228S0000000_1.get$arr$(807), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 890), AFwS228S0000000_1.get$arr$(StrategyCenter.ENABLE_SMART_SERVICE), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 891), AFwS228S0000000_1.get$arr$(809), null);
        c19465311Dn.LJFF(new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 892), new AwS580S0100000_1(abstractC1746380vXw, (AbstractC1746380vXw<Object>) 894), null);
    }
}
