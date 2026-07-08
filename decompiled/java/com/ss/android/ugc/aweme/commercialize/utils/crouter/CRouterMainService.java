package com.ss.android.ugc.aweme.commercialize.utils.crouter;

import X.AbstractC1025070cmX;
import X.AnonymousClass0757;
import X.C04TD;
import X.C08RU;
import X.C0SPE;
import X.C1000210c8R;
import X.C1012040cRW;
import X.C1016550cYn;
import X.C1017070cZd;
import X.C1017200cZq;
import X.C1017230cZt;
import X.C1017520caM;
import X.C1017550caP;
import X.C1021860chM;
import X.C1021940chU;
import X.C1022820ciu;
import X.C1024900cmG;
import X.C1029220ctE;
import X.C1034340d1U;
import X.C1037010d5n;
import X.C1041940dDk;
import X.C1054780dYS;
import X.C1336205Ku;
import X.C1388190mED;
import X.C1440005kM;
import X.C1668706g9;
import X.C1744706sP;
import X.C19EG;
import X.C2184171Adz;
import X.C289890BXv;
import X.C294500BgW;
import X.C690450R6l;
import X.C730040SkM;
import X.C844470XAv;
import X.EnumC1001040c9m;
import X.InterfaceC1008930cMV;
import X.InterfaceC1017820caq;
import X.InterfaceC1026970cpb;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterQuickActionModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterMainService implements ICRouterMainDelegate {
    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final int LIZLLL() {
        return 2131824738;
    }

    public static ICRouterMainDelegate LJJIIZ() {
        Object objLIZ = C04TD.LIZ(ICRouterMainDelegate.class, false);
        if (objLIZ != null) {
            return (ICRouterMainDelegate) objLIZ;
        }
        if (C04TD.LLLJIL == null) {
            synchronized (ICRouterMainDelegate.class) {
                if (C04TD.LLLJIL == null) {
                    C04TD.LLLJIL = new CRouterMainService();
                }
            }
        }
        return C04TD.LLLJIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final InterfaceC1026970cpb LJIJJ() {
        return new InterfaceC1026970cpb() { // from class: X.0cpy
            @Override // X.InterfaceC1026970cpb
            public final long LJFF() {
                long j = C1BN8.LIZ().LIZ.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLastTimeEnterBackground: ");
                sbLIZ.append(j);
                C2188811AlT.LIZIZ(sbLIZ);
                return j;
            }

            @Override // X.InterfaceC1026970cpb
            public final boolean isAppBackground() {
                boolean z = C1BN8.LIZ().LIZ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isAppBackground status: ");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                return z;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final int LJJI() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final int LJJIIJ() {
        return ((Number) AnonymousClass0757.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final void LIZ(String str) {
        C730040SkM.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LIZIZ(int i) {
        return AbstractC1025070cmX.LJIIJJI(i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LIZJ(String str) {
        return AbstractC1025070cmX.LJIILIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final String LJ(int i) {
        C1012040cRW.LIZIZ().LJIIIIZZ = i;
        return AbstractC1025070cmX.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJFF(int i) {
        return C1021860chM.LJJIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIIIZ(int i) {
        if (!C1021860chM.LJJIZ(i) && i != 40) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final String LJIILIIL(Object obj) {
        AwemeRawAd awemeRawAd;
        C1017200cZq c1017200cZqLJIL;
        C1017230cZt c1017230cZtLIZ;
        String str;
        if (!(obj instanceof AwemeRawAd) || (awemeRawAd = (AwemeRawAd) obj) == null) {
            return null;
        }
        InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
        if (interfaceC1008930cMVLJ != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null && (c1017230cZtLIZ = c1017200cZqLJIL.LIZ(awemeRawAd)) != null && (str = c1017230cZtLIZ.LIZ) != null && (!a0.LJJJIL(str))) {
            return str;
        }
        return awemeRawAd.getWebUrl();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIJJLI(int i) {
        return AbstractC1025070cmX.LJIIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final String LJIL(int i) {
        return AbstractC1025070cmX.LJII(i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final String getRealMiddlePageUrl(String str) {
        C1017520caM c1017520caMLIZ = C1016550cYn.LIZ(str);
        if (c1017520caMLIZ == null) {
            return null;
        }
        return c1017520caMLIZ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean shouldShowAdRealMiddlePage(Aweme aweme) {
        if ((aweme instanceof Aweme) && aweme != null) {
            return C1016550cYn.LJ(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJI(Object obj, String str) {
        Aweme aweme;
        IBOCFrequencyControlUtils iBOCFrequencyControlUtils;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        if (aweme == null || (iBOCFrequencyControlUtils = (IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi$default(IBOCFrequencyControlUtils.class, false, false, false, 14, null)) == null) {
            return false;
        }
        return iBOCFrequencyControlUtils.LJFF(aweme.getAwemeRawAd(), str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIIJ(Context context, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            return C1017550caP.LIZ(context, aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final void LJIIJJI(Context context, String str) {
        IMainService iMainService;
        C0SPE c0spe = new C0SPE(context.hashCode());
        c0spe.LIZJ = str;
        c0spe.LIZLLL = true;
        if ((context instanceof C19EG) && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null)) != null) {
            iMainService.isMainActivity((C19EG) context);
        }
        C1440005kM.LIZ(new C690450R6l("homepage_hot"));
        C1440005kM.LIZ(c0spe);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final void LJIILJJIL(int i, Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            AbstractC1025070cmX.LJJIIJZLJL(i, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJJIFFI(Context context, String str) {
        return C1041940dDk.LIZJ(context, str, null, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final String LJJIII(Object obj, String str) {
        Aweme aweme;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        String str2 = "";
        if (aweme == null) {
            return "";
        }
        ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).N0();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String aid = aweme.getAid();
        if (aid != null) {
            str2 = aid;
        }
        return C1037010d5n.LJIIJJI(awemeRawAd, str, str2, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final String LJJIIJZLJL(Bundle bundle, String str) {
        return C08RU.LIZ(bundle, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIIIIZZ(Context context, int i, Object obj) {
        Aweme aweme;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        if (aweme == null) {
            return false;
        }
        EnterChatParams enterChatParamsLJIIIIZZ = AbstractC1025070cmX.LJIIIIZZ(context, aweme, i);
        if (C1017070cZd.LLI(aweme) && ((Number) C289890BXv.LIZ.getValue()).intValue() > -1) {
            C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJI().LIZIZ(new C1744706sP(EnumC1001040c9m.CLICK_ENTRANCE, AwemeExtKt.getAuthorUid(aweme), aweme));
        }
        return C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParamsLJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIIL(Context context, int i, Object obj) {
        Aweme aweme;
        ISamsungPageService iSamsungPageService;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        if (aweme == null || (iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi$default(ISamsungPageService.class, false, false, false, 14, null)) == null || !iSamsungPageService.LIZ(context, aweme, i)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIILL(Context context, int i, Object obj) {
        Aweme aweme;
        ICommerceService iCommerceService;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        if (aweme == null || (iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null)) == null || (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) == null || (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) == null || !interfaceC1017820caqLJIILIIL.LIZ(context, aweme, i)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIJI(Context context, String str, String str2) {
        return C1024900cmG.LJFF(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJJII(Context context, Object obj, int i) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            return C1024900cmG.LJII(context, i, null, aweme, false, false);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final void LJII(Object obj, Integer num, String str, Context context) {
        AwemeRawAd awemeRawAd;
        if (C294500BgW.LIZ()) {
            C1034340d1U c1034340d1ULIZ = C1034340d1U.LIZLLL.LIZ();
            if (obj instanceof AwemeRawAd) {
                awemeRawAd = (AwemeRawAd) obj;
            } else {
                awemeRawAd = null;
            }
            c1034340d1ULIZ.LIZ("draw_ad", new C1029220ctE(awemeRawAd, "", null, null), num, str, context);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIILLIIL(Context context, Object obj, String str, String str2) {
        Aweme aweme;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && (obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (activityLIZ instanceof C19EG)) {
            C1440005kM.LIZ(new C1000210c8R(false));
            TuxActionSheet tuxActionSheetLJIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIL(context, aweme, str, str2);
            if (tuxActionSheetLJIL != null) {
                tuxActionSheetLJIL.show(((C19EG) activityLIZ).getSupportFragmentManager(), (String) null);
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "othershow", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ("call_banner", "refer");
                c1022820ciuLIZLLL.LJII();
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final boolean LJIIZILJ(int i, Context context, Object obj, String str) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            return C1021940chU.LIZIZ(context, i, str, aweme, false, C1021860chM.LJJJ(i, aweme));
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final String LJIJ(Object obj, Context context, Boolean bool, Boolean bool2, String str) {
        AwemeRawAd awemeRawAd;
        IAdLynxLandPageUtils adLynxLandPageUtil = C1054780dYS.LIZIZ.getAdLynxLandPageUtil();
        if (obj instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) obj;
        } else {
            awemeRawAd = null;
        }
        return adLynxLandPageUtil.LJI(awemeRawAd, context, bool, bool2, str, null, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate
    public final void LJJ(Context context, String str, Object obj, CRouterQuickActionModel cRouterQuickActionModel, String str2) {
        Aweme aweme;
        String shopifyPid;
        String str3 = str2;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            if (cRouterQuickActionModel == null || (shopifyPid = cRouterQuickActionModel.getShopifyPid()) == null) {
                shopifyPid = "";
            }
            IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
            if (iShopifySkuCheckoutService != null) {
                if (str3 == null) {
                    str3 = "feed_sku_checkout";
                }
                iShopifySkuCheckoutService.LIZJ(c19egLIZIZ, aweme, str, shopifyPid, str3);
            }
        }
    }
}
