package com.ss.android.ugc.aweme.legoImp;

import X.C04TD;
import X.C0BFD;
import X.C0C64;
import X.C0CCZ;
import X.C0CN5;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1393680mN4;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import com.ss.android.ugc.aweme.anchor.service.CustomAnchorViewServicImpl;
import com.ss.android.ugc.aweme.anchor.service.ICustomAnchorViewService;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService;
import com.ss.android.ugc.aweme.commercialize.model.feed.anchor.AnchorInfoStruct;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.experiment.IPaidContentAnchorService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import com.ss.android.ugc.tiktok.anchor.StickerCustomAnchorViewServiceImpl;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class CustomAnchorInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CustomAnchorInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LIZ() {
        ICustomAnchorViewService iCustomAnchorViewService;
        Object objLIZ = C04TD.LIZ(ICustomAnchorViewService.class, false);
        if (objLIZ != null) {
            iCustomAnchorViewService = (ICustomAnchorViewService) objLIZ;
        } else {
            if (C04TD.LLFF == null) {
                synchronized (ICustomAnchorViewService.class) {
                    if (C04TD.LLFF == null) {
                        C04TD.LLFF = new CustomAnchorViewServicImpl();
                    }
                }
            }
            iCustomAnchorViewService = C04TD.LLFF;
        }
        InterfaceC1393680mN4 interfaceC1393680mN4LIZ = ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).LIZ();
        if (interfaceC1393680mN4LIZ != null) {
            iCustomAnchorViewService.LIZ(interfaceC1393680mN4LIZ);
        }
        InterfaceC1393680mN4 interfaceC1393680mN4LJIIJ = ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).LJIIJ();
        if (interfaceC1393680mN4LJIIJ != null) {
            iCustomAnchorViewService.LIZ(interfaceC1393680mN4LJIIJ);
        }
        InterfaceC1393680mN4 interfaceC1393680mN4LIZIZ = ((IEcommerceAnchorOuterService) ServiceManager.get().getService(IEcommerceAnchorOuterService.class)).LIZIZ();
        if (interfaceC1393680mN4LIZIZ != null) {
            iCustomAnchorViewService.LIZ(interfaceC1393680mN4LIZIZ);
        }
        iCustomAnchorViewService.LIZ(((IPoiService) ServiceManager.get().getService(IPoiService.class)).LLIIIILZ());
        iCustomAnchorViewService.LIZ(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJIJ());
        iCustomAnchorViewService.LIZ(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJIII());
        iCustomAnchorViewService.LIZ(((IShoppingAdsService) ServiceManager.get().getService(IShoppingAdsService.class)).LJI());
        Object objLIZ2 = C04TD.LIZ(IPaidContentAnchorService.class, false);
        iCustomAnchorViewService.LIZ((objLIZ2 != null ? (IPaidContentAnchorService) objLIZ2 : new PaidContentAnchorService()).LIZ());
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "improve_effect_anchor", true) != 0) {
            iCustomAnchorViewService.LIZ(StickerCustomAnchorViewServiceImpl.LIZIZ().LIZ());
        }
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJII().getClass();
        iCustomAnchorViewService.LIZ(new InterfaceC1393680mN4() { // from class: X.0cvI
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                C1050120dQw c1050120dQw = new C1050120dQw(interfaceC1392640mLO.LIZIZ());
                ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c1050120dQw, EnumC700430Rdh.POSITIVE);
                return c1050120dQw;
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                AwemeRawAd awemeRawAd;
                AnchorInfoStruct anchorAdInfo;
                Integer styleType;
                if (!z || i != EnumC1430380nKG.ADS_ANCHOR.getTYPE() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anchorAdInfo = awemeRawAd.getAnchorAdInfo()) == null || (styleType = anchorAdInfo.getStyleType()) == null || styleType.intValue() != 1) {
                    return false;
                }
                return true;
            }
        });
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().customAnchorInitTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long j = C0BFD.LIZ;
        if (j != -1) {
            C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS119S0100000_19(this, context, 79));
        } else {
            LIZ();
        }
    }
}
