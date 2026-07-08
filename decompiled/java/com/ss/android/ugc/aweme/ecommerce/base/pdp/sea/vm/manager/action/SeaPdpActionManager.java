package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.action;

import X.C098200Yq;
import X.C1071004Gu;
import X.C12846050y;
import X.C189200o6;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.SeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpActionManager implements ISeaPdpActionManager {
    public final InterfaceC665370Q7z LL;
    public final SeaPdpFragment LLILLJJLI;
    public final Lifecycle LLILLL;
    public final ISeaPdpCommunicationService LLILZ;

    public SeaPdpActionManager(InterfaceC665370Q7z interfaceC665370Q7z, SeaPdpFragment seaPdpFragment, Lifecycle lifecycle, SeaPdpCommunicationService seaPdpCommunicationService, PageStateContext pageStateContext) {
        Unit unit;
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = seaPdpFragment;
        this.LLILLL = lifecycle;
        this.LLILZ = seaPdpCommunicationService;
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaContainerStoreTempState", new AwS570S0100000_26(this, 1433));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaContainerStoreResidentState", new AwS570S0100000_26(this, 1444));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaContainerRefresh", AFwS215S0000000_26.get$arr$(462));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaContainerPreload", new AwS570S0100000_26(this, 1427));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaTrackBffEvent", new AwS570S0100000_26(this, 1429));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaTrackEvent", new AwS570S0100000_26(this, 1431));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaMynaRegisterPageEvent", AFwS212S0000000_23.get$arr$(214));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaMynaRemovePageEvent", AFwS212S0000000_23.get$arr$(215));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaPublishPageEvent", new AwS570S0100000_26(this, 1435));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaMynaRegisterBDXBridgeEvent", AFwS212S0000000_23.get$arr$(209));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaMynaRemoveBDXBridgeEvent", AFwS212S0000000_23.get$arr$(210));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaPublishBDXBridgeEvent", AFwS212S0000000_23.get$arr$(211));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaUpdateStateContext", new AwS570S0100000_26(this, 1423));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaMynaSubscribeStateContext", AFwS212S0000000_23.get$arr$(212));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaMynaUnsubscribeStateContext", AFwS212S0000000_23.get$arr$(213));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaUpdateTrackParams", new AwS570S0100000_26(this, 1426));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaUpdateCommonParams", new AwS570S0100000_26(this, 1428));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaUpdateCoreBizParams", new AwS570S0100000_26(this, 1430));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaOpenSchema", new AwS570S0100000_26(this, 1432));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaScrollToModule", new AwS570S0100000_26(this, 1434));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaOpenSkuPanel", new AwS570S0100000_26(this, 1436));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaOpenPaymentPanel", new AwS570S0100000_26(this, 1437));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaOpenReviewPage", new AwS570S0100000_26(this, 1438));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaDelayExecute", AFwS212S0000000_23.get$arr$(216));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaDestroyBottomMynaBanner", new AwS570S0100000_26(this, 1439));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaSetPitayaListenerOn", new AwS570S0100000_26(this, 1440));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaBuildBTMToken", new AwS570S0100000_26(this, 1441));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaDynamicService", new AwS570S0100000_26(this, 1442));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaSaveMemoryCache", new AwS570S0100000_26(this, 1443));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaRemoveNode", new AwS570S0100000_26(this, 1445));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaRequest", AFwS212S0000000_23.get$arr$(217));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaBDXBridgeSetStorage", AFwS215S0000000_26.get$arr$(463));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaBottomBarShopClick", new AwS570S0100000_26(this, 1418));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaBottomBarChatClick", new AwS570S0100000_26(this, 1419));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaBottomBarAddToCartClick", new AwS570S0100000_26(this, 1420));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaBottomBarBuyNowClick", new AwS570S0100000_26(this, 1421));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaOrderSubmitPrefetch", new AwS570S0100000_26(this, 1422));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaBuildBTMReportParams", new AwS570S0100000_26(this, 1424));
        seaPdpCommunicationService.Pd(interfaceC665370Q7z, "pdpSeaClosePdp", new AwS570S0100000_26(this, 1425));
        try {
            n nVarLIZJ = C1071004Gu.LIZJ();
            if (nVarLIZJ != null) {
                PageStateContext.LIZLLL(pageStateContext, "ab_params", C12846050y.LIZ(nVarLIZJ));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            this.LLILLL.addObserver(new SeaPdpActionManager$initLifecycle$1$1(this));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
