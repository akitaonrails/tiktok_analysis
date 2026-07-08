package com.ss.android.ugc.aweme.ecommerce.network;

import X.C034S;
import X.C1120604Zw;
import X.C1AQS;
import X.C20476080k;
import X.C2131308Wp;
import X.C2188811AlT;
import X.C679350Qkn;
import X.C813210VvD;
import X.InterfaceC911603hK;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ecommerce.network.EcomNetworkInterceptorSwitch;
import com.ss.android.ugc.aweme.ecommerce.network.config.EcLynxNetReuseConfig;
import com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkBystander;
import com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkHandler;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomNetworkPartnerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS263S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomNetworkPartnerService implements IEcomNetworkPartnerService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomNetworkPartnerService
    public final List<NetworkPartner> LIZ() {
        IECommerceHostService iECommerceHostService;
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomNetworkPartnerService.getNetworkPartners() enable=");
        sbLIZ.append(C20476080k.LIZIZ.getValue());
        sbLIZ.append(", apiNotEmpty=");
        sbLIZ.append(!C2131308Wp.LIZ().isEmpty());
        C2188811AlT.LIZIZ(sbLIZ);
        arrayList.add(ECAPIInterceptorNetworkBystander.LIZ);
        arrayList.add(new ECAPIInterceptorNetworkHandler(false));
        if (!EcomRequestHeaderConfig.LIZIZ.isEmpty() || !EcomRequestHeaderConfig.LIZJ.isEmpty()) {
            arrayList.add(new EcomRequestHeaderHandler());
        }
        arrayList.add(EcomPbRequestHandler.LIZ);
        arrayList.add(new EcomPbRequestBystander());
        if (C679350Qkn.LIZIZ) {
            arrayList.add(EcomApiLifecycleManager.LIZ);
        }
        EcomNetworkInterceptorSwitch.EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel = EcomNetworkInterceptorSwitch.LIZ;
        if (ecomNetworkInterceptorSwitchModel.f60switch) {
            arrayList.add(EcommerceBystander.LIZ);
            if (ecomNetworkInterceptorSwitchModel.f60switch && ecomNetworkInterceptorSwitchModel.switchStream) {
                C813210VvD.LIZ().addObserver(new EcomStreamMonitorObserver());
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                if (rootPageMonitor != null) {
                    rootPageMonitor.LJI(AFwS263S0000000_23.get$arr$(27));
                }
            }
        }
        arrayList.add(new EcomResponseHandler());
        EcLynxNetReuseConfig.LIZ.getClass();
        if (!EcLynxNetReuseConfig.LIZLLL.isEmpty()) {
            arrayList.add(new EcLynxNetReuseHandler());
        }
        Iterator it2 = ServiceManager.get().getServices(IEcomResponseHandler.class).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }
}
