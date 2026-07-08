package com.bytedance.ies.ugc.aweme.network;

import X.AbstractC1515100pWu;
import X.C034S;
import X.C0BVK;
import X.C0W1S;
import X.C0XM1;
import X.C1120604Zw;
import X.C1152680g6M;
import X.C1256140inE;
import X.C1499850p8J;
import X.C1515200pX4;
import X.C1AQS;
import X.C20645086x;
import X.C806950Vl7;
import X.C815100VyG;
import X.InterfaceC1904907d9;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartnerGroup;
import com.bytedance.ies.ugc.aweme.network.interceptor.PnSIsolationZoneInterceptor;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.ss.android.account.token.TTTokenInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.IECNetworkSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceBusinessService;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.interceptor.ImageHeaderInterceptor;
import com.ss.android.ugc.aweme.net.agblock.AGBlockingNetworkInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.CommonParamsCheckInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.TTNetworkContextInterceptor;
import com.ss.android.ugc.aweme.net.partner.GlobalRetryHandler;
import com.ss.android.ugc.aweme.net.partner.PreloadCacheHandler;
import com.ss.android.ugc.aweme.net.partner.RequestFilterHandler;
import com.ss.android.ugc.aweme.opt.BackendApiCallerOptInterceptor;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class TTNetworkKitDepend extends AbstractC1515100pWu {
    @Override // X.AbstractC1515100pWu
    public final void LIZLLL(C1499850p8J c1499850p8J, C1515200pX4 c1515200pX4) {
        IECommerceBusinessService iECommerceBusinessService;
        InterfaceC1904907d9 commonParamsInterceptor;
        String name;
        if (!c1499850p8J.LIZJ) {
            int i = c1499850p8J.LJIIIZ;
            if (i > 0) {
                c1499850p8J.LIZIZ(new GlobalRetryHandler(i));
            }
            c1499850p8J.LIZIZ(new PreloadCacheHandler(c1499850p8J.LJII));
            c1499850p8J.LIZIZ(RequestFilterHandler.LIZ);
            NetworkPartnerGroup networkPartnerGroup = C0XM1.LIZ().LJIILL.LIZ.LJIILL;
            networkPartnerGroup.getClass();
            NetworkPartnerGroup networkPartnerGroup2 = new NetworkPartnerGroup();
            networkPartnerGroup2.LIZJ(networkPartnerGroup);
            networkPartnerGroup2.LIZJ(c1499850p8J.LJIIIIZZ);
            c1515200pX4.LIZJ(new NetworkPartnerGroup.PartnerInterceptor(networkPartnerGroup2));
            boolean z = true;
            if (((Number) C0BVK.LIZ.getValue()).intValue() > 0) {
                c1515200pX4.LIZJ(AGBlockingNetworkInterceptor.LL);
            }
            if (!C1256140inE.LIZ(C0XM1.LIZ().LJII)) {
                Iterator it2 = ((ArrayList) C0XM1.LIZ().LJII).iterator();
                while (it2.hasNext()) {
                    c1515200pX4.LIZJ((InterfaceC1904907d9) it2.next());
                }
            }
            if (C20645086x.LIZIZ.LIZJ()) {
                c1515200pX4.LIZJ(new BackendApiCallerOptInterceptor());
            }
            if (C806950Vl7.LIZIZ.LIZLLL()) {
                c1515200pX4.LIZJ(new TTNetworkContextInterceptor());
            }
            if (C0W1S.LIZIZ.isEnable()) {
                c1515200pX4.LIZJ(new ImageHeaderInterceptor());
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceBusinessService = (IECommerceBusinessService) PluggableExtentionKt.pluggableSpi$default(IECNetworkSaasService.class, false, false, false, 14, null);
                if (iECommerceBusinessService == null) {
                    z = false;
                }
                String name2 = IECNetworkSaasService.class.getName();
                if (iECommerceBusinessService != null) {
                    name = iECommerceBusinessService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 2, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceBusinessService = (IECommerceBusinessService) C1120604Zw.LIZJ.LIZLLL(IECNetworkSaasService.class);
            }
            IECNetworkSaasService iECNetworkSaasService = (IECNetworkSaasService) iECommerceBusinessService;
            if (iECNetworkSaasService != null && (commonParamsInterceptor = iECNetworkSaasService.getCommonParamsInterceptor()) != null) {
                c1515200pX4.LIZJ(commonParamsInterceptor);
            }
            if (!((Boolean) C1152680g6M.LIZIZ.getValue()).booleanValue()) {
                c1515200pX4.LIZJ(new TTTokenInterceptor());
            }
            ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi(ISpecActService.class);
            if (iSpecActService != null) {
                if (iSpecActService.LIZLLL() != null) {
                    c1515200pX4.LIZJ(iSpecActService.LIZLLL());
                }
                if (iSpecActService.LJIILLIIL() != null) {
                    c1515200pX4.LIZJ(iSpecActService.LJIILLIIL());
                }
                if (iSpecActService.LJFF() != null) {
                    Iterator<InterfaceC1904907d9> it3 = iSpecActService.LJFF().iterator();
                    while (it3.hasNext()) {
                        c1515200pX4.LIZJ(it3.next());
                    }
                }
            }
            ColdBootPushStartupExperiment.NetworkPendingInterceptor networkPendingInterceptor = C815100VyG.LIZ;
            if (networkPendingInterceptor.LLILLJJLI) {
                c1515200pX4.LIZJ(networkPendingInterceptor);
            }
            Iterator<InterfaceC1904907d9> it4 = c1499850p8J.LIZLLL.iterator();
            while (it4.hasNext()) {
                c1515200pX4.LIZJ(it4.next());
            }
        }
        c1515200pX4.LIZJ(new SsInterceptor());
        c1515200pX4.LIZJ(new TTNetInitInterceptor());
        Integer num = c1499850p8J.LJIIJ;
        if (num != null) {
            c1515200pX4.LIZJ(new PnSIsolationZoneInterceptor(num.intValue(), c1499850p8J.LJIIJJI));
        }
        if (!c1499850p8J.LIZJ) {
            c1515200pX4.LIZJ(new CommonParamsCheckInterceptor());
        }
    }
}
