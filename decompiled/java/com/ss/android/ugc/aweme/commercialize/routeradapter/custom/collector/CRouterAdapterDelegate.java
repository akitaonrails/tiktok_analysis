package com.ss.android.ugc.aweme.commercialize.routeradapter.custom.collector;

import X.AbstractC1021000cfy;
import X.AbstractC1025460cnA;
import X.AbstractC1025500cnE;
import X.AbstractC1025510cnF;
import X.AbstractC1025700cnY;
import X.AbstractC1026640cp4;
import X.AbstractC1026880cpS;
import X.C01GW;
import X.C09JN;
import X.C1017070cZd;
import X.C1021060cg4;
import X.C1022030chd;
import X.C1022230chx;
import X.C1022250chz;
import X.C1022820ciu;
import X.C1025340cmy;
import X.C1025390cn3;
import X.C1025430cn7;
import X.C1025520cnG;
import X.C1025540cnI;
import X.C1025630cnR;
import X.C1025660cnU;
import X.C1025670cnV;
import X.C1025690cnX;
import X.C1025770cnf;
import X.C1025790cnh;
import X.C1025810cnj;
import X.C1025820cnk;
import X.C1025830cnl;
import X.C1025880cnq;
import X.C1026920cpW;
import X.C13LP;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C1954807lC;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2201691BEx;
import X.C2344809Gs;
import X.C452501pT;
import X.EnumC1025640cnS;
import X.EnumC1026700cpA;
import X.EnumC1027330cqB;
import X.InterfaceC1017820caq;
import X.InterfaceC1021030cg1;
import X.InterfaceC1025850cnn;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils;
import com.ss.android.ugc.aweme.cct.IOpenCCTUtils;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterDeeplinkModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterLynxModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterQuickActionModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.log.IAdWebLogService;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.minis.api.MinisRawAdInfo;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterAdapterDelegate implements ICRouterAdapterDelegate {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(146));

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final int LJI() {
        return 73;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final List<InterfaceC1021030cg1> LJIIZILJ() {
        final boolean z = true;
        final boolean z2 = false;
        return C1697810uHb.LJIILJJIL(new AbstractC1021000cfy(z) { // from class: X.0cfu
            public final boolean LIZJ;
            public final IAdPhotoModeService LIZLLL = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);

            {
                this.LIZJ = z;
            }

            /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
            
                if (r1 != null) goto L34;
             */
            @Override // X.InterfaceC1021030cg1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1021060cg4 LIZ(X.C1021010cfz r12) {
                /*
                    Method dump skipped, instruction units count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1020960cfu.LIZ(X.0cfz):X.0cg4");
            }

            @Override // X.InterfaceC1021030cg1
            public final boolean LIZIZ(C1021020cg0 c1021020cg0) {
                Object obj;
                Aweme aweme;
                Object obj2;
                Map<String, Object> map;
                String str;
                String str2;
                C1026760cpG c1026760cpG = c1021020cg0.LIZIZ.LIZJ;
                Aweme aweme2 = null;
                if (c1026760cpG != null && (map = c1026760cpG.LIZ) != null) {
                    Object obj3 = map.get("component_type");
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    if (Intrinsics.LJFF(obj3, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType())) {
                        Object obj4 = map.get("anole_click_jump_web_url");
                        if (obj4 instanceof String) {
                            str = (String) obj4;
                        } else {
                            str = null;
                        }
                        Object obj5 = map.get("anole_click_jump_open_url");
                        if (obj5 instanceof String) {
                            str2 = (String) obj5;
                        } else {
                            str2 = null;
                        }
                        if ((str != null && !a0.LJJJIL(str)) || (str2 != null && !a0.LJJJIL(str2))) {
                            return true;
                        }
                    }
                }
                if (this.LIZJ) {
                    return false;
                }
                C1025880cnq c1025880cnq = c1021020cg0.LIZ;
                if (c1025880cnq != null) {
                    obj = c1025880cnq.LIZJ;
                } else {
                    obj = null;
                }
                if (obj instanceof Aweme) {
                    aweme = (Aweme) obj;
                } else {
                    aweme = null;
                }
                if (this.LIZLLL.LJII(aweme) || Intrinsics.LJFF(c1021020cg0.LIZIZ.LIZIZ, "carousel_full_clickable")) {
                    return true;
                }
                if (!((ICRouterAdapterService) ServiceManager.get().getService(ICRouterAdapterService.class)).LIZ(c1021020cg0.LIZIZ.LJFF)) {
                    return false;
                }
                C1025880cnq c1025880cnq2 = c1021020cg0.LIZ;
                if (c1025880cnq2 != null) {
                    obj2 = c1025880cnq2.LIZJ;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Aweme) {
                    aweme2 = (Aweme) obj2;
                }
                if (!C1017070cZd.LJLLLL(aweme2)) {
                    return false;
                }
                return true;
            }

            public static C1021060cg4 LJFF(C1021010cfz c1021010cfz, CRouterCoreModel cRouterCoreModel) {
                AbstractC1025510cnF abstractC1025510cnFLJ = c1021010cfz.LIZLLL;
                if (abstractC1025510cnFLJ == null) {
                    abstractC1025510cnFLJ = AbstractC1021000cfy.LJ();
                }
                Map linkedHashMap = c1021010cfz.LJ;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                return new C1021060cg4(cRouterCoreModel, abstractC1025510cnFLJ, (Map<String, Object>) linkedHashMap);
            }
        }, new AbstractC1021000cfy() { // from class: X.0cfw
            @Override // X.InterfaceC1021030cg1
            public final C1021060cg4 LIZ(C1021010cfz c1021010cfz) {
                Object obj;
                AwemeRawAd awemeRawAd;
                C1025880cnq c1025880cnq = c1021010cfz.LIZ;
                String webUrl = null;
                if (c1025880cnq != null) {
                    obj = c1025880cnq.LIZLLL;
                } else {
                    obj = null;
                }
                if (obj instanceof AwemeRawAd) {
                    awemeRawAd = (AwemeRawAd) obj;
                } else {
                    awemeRawAd = null;
                }
                if (awemeRawAd != null) {
                    webUrl = awemeRawAd.getWebUrl();
                }
                CRouterCoreModel cRouterCoreModel = new CRouterCoreModel(null, 0, null, null, new CRouterDeeplinkModel(webUrl), null, null);
                AbstractC1025510cnF abstractC1025510cnFLJ = c1021010cfz.LIZLLL;
                if (abstractC1025510cnFLJ == null) {
                    abstractC1025510cnFLJ = AbstractC1021000cfy.LJ();
                }
                Map linkedHashMap = c1021010cfz.LJ;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                return new C1021060cg4(cRouterCoreModel, abstractC1025510cnFLJ, (Map<String, Object>) linkedHashMap);
            }

            @Override // X.InterfaceC1021030cg1
            public final boolean LIZIZ(C1021020cg0 c1021020cg0) {
                Object obj;
                AwemeRawAd awemeRawAd;
                String webUrl;
                C1025880cnq c1025880cnq = c1021020cg0.LIZ;
                Aweme aweme = null;
                if (c1025880cnq != null) {
                    obj = c1025880cnq.LIZJ;
                } else {
                    obj = null;
                }
                if (obj instanceof Aweme) {
                    aweme = (Aweme) obj;
                }
                if (!C707230Rof.LIZLLL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null || !u.LJJIIJZLJL(webUrl, "aweme://webview", false)) {
                    return false;
                }
                return true;
            }
        }, new AbstractC1021000cfy() { // from class: X.0cfv
            public C1017230cZt LIZJ;

            @Override // X.InterfaceC1021030cg1
            public final C1021060cg4 LIZ(C1021010cfz c1021010cfz) {
                CRouterCoreModel cRouterCoreModelLIZJ = LIZJ(AbstractC1021000cfy.LIZLLL(c1021010cfz.LIZ));
                Map linkedHashMap = c1021010cfz.LJ;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                C1017230cZt c1017230cZt = this.LIZJ;
                if (c1017230cZt != null) {
                    if (!C2105908Mv.LIZ(c1017230cZt.LIZLLL)) {
                        cRouterCoreModelLIZJ.setDeeplinkModel(null);
                        cRouterCoreModelLIZJ.setLynxModel(new CRouterLynxModel(c1017230cZt.LIZLLL, null, null, 0, 0));
                        cRouterCoreModelLIZJ.setWebModel(new CRouterWebModel(null, null, false, false, 0, null));
                        linkedHashMap.put("product_url", c1017230cZt.LIZLLL);
                        Map<String, Object> map = c1017230cZt.LIZJ;
                        if (map != null) {
                            linkedHashMap.put("product_id", map.get("productId"));
                            linkedHashMap.put("product_counts", map.get("productIndex"));
                        }
                    } else {
                        String str = c1017230cZt.LIZ;
                        if ((!a0.LJJJIL(str)) && str != null) {
                            cRouterCoreModelLIZJ.setDeeplinkModel(null);
                            CRouterWebModel webModel = cRouterCoreModelLIZJ.getWebModel();
                            if (webModel != null) {
                                webModel.setUrl(str);
                            }
                            cRouterCoreModelLIZJ.setLynxModel(new CRouterLynxModel(null, null, null, 0, 0));
                            linkedHashMap.put("product_url", str);
                            Map<String, Object> map2 = c1017230cZt.LIZJ;
                            if (map2 != null) {
                                linkedHashMap.put("product_id", map2.get("productId"));
                                linkedHashMap.put("product_counts", map2.get("productIndex"));
                            }
                        }
                    }
                }
                AbstractC1025510cnF abstractC1025510cnFLJ = c1021010cfz.LIZLLL;
                if (abstractC1025510cnFLJ == null) {
                    abstractC1025510cnFLJ = AbstractC1021000cfy.LJ();
                }
                return new C1021060cg4(cRouterCoreModelLIZJ, abstractC1025510cnFLJ, (Map<String, Object>) linkedHashMap);
            }

            @Override // X.InterfaceC1021030cg1
            public final boolean LIZIZ(C1021020cg0 c1021020cg0) {
                C1017230cZt c1017230cZtLIZ;
                boolean z3;
                C1017200cZq c1017200cZqLJIL;
                InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) this.LIZ.getValue()).LIZIZ().LJ();
                if (interfaceC1008930cMVLJ != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null) {
                    c1017230cZtLIZ = c1017200cZqLJIL.LIZ(AbstractC1021000cfy.LIZLLL(c1021020cg0.LIZ));
                } else {
                    c1017230cZtLIZ = null;
                }
                this.LIZJ = c1017230cZtLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("intercept(),aiaJumpData = ");
                sbLIZ.append(this.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (this.LIZJ == null) {
                    return false;
                }
                int i = c1021020cg0.LIZIZ.LJFF;
                if (i != 2 && i != 40 && i != 64 && i != 39) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("hitClickFrom(),clickFrom = ");
                sbLIZ2.append(i);
                sbLIZ2.append(", hit clickFrom result = ");
                sbLIZ2.append(z3);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (!z3) {
                    return false;
                }
                return true;
            }
        }, new AbstractC1021000cfy() { // from class: X.0cfx
            @Override // X.InterfaceC1021030cg1
            public final C1021060cg4 LIZ(C1021010cfz c1021010cfz) {
                String creativeIdStr;
                AwemeRawAd awemeRawAdLIZLLL = AbstractC1021000cfy.LIZLLL(c1021010cfz.LIZ);
                if (awemeRawAdLIZLLL != null) {
                    creativeIdStr = awemeRawAdLIZLLL.getCreativeIdStr();
                } else {
                    creativeIdStr = null;
                }
                String strValueOf = String.valueOf(creativeIdStr);
                CRouterCoreModel cRouterCoreModelLIZJ = LIZJ(AbstractC1021000cfy.LIZLLL(c1021010cfz.LIZ));
                CRouterWebModel webModel = cRouterCoreModelLIZJ.getWebModel();
                if (webModel != null) {
                    webModel.setUrl(c1021010cfz.LIZJ.getRealMiddlePageUrl(strValueOf));
                }
                AbstractC1025510cnF abstractC1025510cnFLJ = c1021010cfz.LIZLLL;
                if (abstractC1025510cnFLJ == null) {
                    abstractC1025510cnFLJ = AbstractC1021000cfy.LJ();
                }
                return new C1021060cg4(cRouterCoreModelLIZJ, abstractC1025510cnFLJ, 4);
            }

            @Override // X.InterfaceC1021030cg1
            public final boolean LIZIZ(C1021020cg0 c1021020cg0) {
                Object obj;
                if (c1021020cg0.LIZIZ.LIZ == EnumC345560Dgg.TYPE_SLIDE_FOLLOW) {
                    ICRouterMainDelegate iCRouterMainDelegate = c1021020cg0.LIZJ;
                    C1025880cnq c1025880cnq = c1021020cg0.LIZ;
                    Aweme aweme = null;
                    if (c1025880cnq != null) {
                        obj = c1025880cnq.LIZJ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Aweme) {
                        aweme = (Aweme) obj;
                    }
                    if (iCRouterMainDelegate.shouldShowAdRealMiddlePage(aweme)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }, new AbstractC1021000cfy(z2) { // from class: X.0cfu
            public final boolean LIZJ;
            public final IAdPhotoModeService LIZLLL = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);

            {
                this.LIZJ = z2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
            
                if (r1 != null) goto L34;
             */
            @Override // X.InterfaceC1021030cg1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1021060cg4 LIZ(X.C1021010cfz r12) {
                /*
                    Method dump skipped, instruction units count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1020960cfu.LIZ(X.0cfz):X.0cg4");
            }

            @Override // X.InterfaceC1021030cg1
            public final boolean LIZIZ(C1021020cg0 c1021020cg0) {
                Object obj;
                Aweme aweme;
                Object obj2;
                Map<String, Object> map;
                String str;
                String str2;
                C1026760cpG c1026760cpG = c1021020cg0.LIZIZ.LIZJ;
                Aweme aweme2 = null;
                if (c1026760cpG != null && (map = c1026760cpG.LIZ) != null) {
                    Object obj3 = map.get("component_type");
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    if (Intrinsics.LJFF(obj3, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType())) {
                        Object obj4 = map.get("anole_click_jump_web_url");
                        if (obj4 instanceof String) {
                            str = (String) obj4;
                        } else {
                            str = null;
                        }
                        Object obj5 = map.get("anole_click_jump_open_url");
                        if (obj5 instanceof String) {
                            str2 = (String) obj5;
                        } else {
                            str2 = null;
                        }
                        if ((str != null && !a0.LJJJIL(str)) || (str2 != null && !a0.LJJJIL(str2))) {
                            return true;
                        }
                    }
                }
                if (this.LIZJ) {
                    return false;
                }
                C1025880cnq c1025880cnq = c1021020cg0.LIZ;
                if (c1025880cnq != null) {
                    obj = c1025880cnq.LIZJ;
                } else {
                    obj = null;
                }
                if (obj instanceof Aweme) {
                    aweme = (Aweme) obj;
                } else {
                    aweme = null;
                }
                if (this.LIZLLL.LJII(aweme) || Intrinsics.LJFF(c1021020cg0.LIZIZ.LIZIZ, "carousel_full_clickable")) {
                    return true;
                }
                if (!((ICRouterAdapterService) ServiceManager.get().getService(ICRouterAdapterService.class)).LIZ(c1021020cg0.LIZIZ.LJFF)) {
                    return false;
                }
                C1025880cnq c1025880cnq2 = c1021020cg0.LIZ;
                if (c1025880cnq2 != null) {
                    obj2 = c1025880cnq2.LIZJ;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Aweme) {
                    aweme2 = (Aweme) obj2;
                }
                if (!C1017070cZd.LJLLLL(aweme2)) {
                    return false;
                }
                return true;
            }

            public static C1021060cg4 LJFF(C1021010cfz c1021010cfz, CRouterCoreModel cRouterCoreModel) {
                AbstractC1025510cnF abstractC1025510cnFLJ = c1021010cfz.LIZLLL;
                if (abstractC1025510cnFLJ == null) {
                    abstractC1025510cnFLJ = AbstractC1021000cfy.LJ();
                }
                Map linkedHashMap = c1021010cfz.LJ;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                return new C1021060cg4(cRouterCoreModel, abstractC1025510cnFLJ, (Map<String, Object>) linkedHashMap);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final int LJIJ() {
        return 39;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final int LJJIFFI() {
        return 64;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJJIII() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final List<AbstractC1025500cnE> LJJIIZI() {
        return C1697810uHb.LJIILJJIL(new AbstractC1025460cnA() { // from class: X.0cn6
            public final IFeedVideoShrinkService LIZ = (IFeedVideoShrinkService) ServiceManager.get().getService(IFeedVideoShrinkService.class);

            /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
            @Override // X.AbstractC1025500cnE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1025430cn7 LIZ(X.C1025480cnC r12) {
                /*
                    r11 = this;
                    java.lang.Object r1 = r12.LIZLLL
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
                    r10 = 0
                    if (r0 == 0) goto L85
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
                    if (r1 == 0) goto L86
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
                    if (r0 == 0) goto L86
                    com.ss.android.ugc.aweme.feed.model.LandingPageConfig r0 = r0.getLandingPageConfig()
                    if (r0 == 0) goto L86
                    java.lang.Integer r0 = r0.sheetRatio
                    if (r0 == 0) goto L86
                    int r0 = r0.intValue()
                L1f:
                    float r5 = (float) r0
                    r0 = 1120403456(0x42c80000, float:100.0)
                    float r5 = r5 / r0
                    com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService r0 = r11.LIZ
                    X.0d4b r0 = r0.LLJLL()
                    r6 = 0
                    r4 = 1
                    if (r1 == 0) goto L83
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
                    if (r1 == 0) goto L83
                    boolean r1 = X.C1017180cZo.LJJIIJZLJL(r1)
                    if (r1 != r4) goto L83
                    java.lang.Class<com.ss.android.ugc.aweme.landpage.IAdTuxSheetLandPageService> r5 = com.ss.android.ugc.aweme.landpage.IAdTuxSheetLandPageService.class
                    r9 = 14
                    r7 = r6
                    r8 = r6
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
                    com.ss.android.ugc.aweme.landpage.IAdTuxSheetLandPageService r0 = (com.ss.android.ugc.aweme.landpage.IAdTuxSheetLandPageService) r0
                    if (r0 == 0) goto L81
                    X.0cuO r0 = r0.LIZ()
                L4b:
                    r5 = 1065353216(0x3f800000, float:1.0)
                    java.lang.String r3 = "watch_while_loading"
                L4f:
                    X.0cn7 r2 = X.AbstractC1025460cnA.LIZJ(r12)
                    X.0cnB r1 = new X.0cnB
                    r1.<init>(r5)
                    r1.LIZIZ = r6
                    r1.LIZJ = r6
                    r1.LIZLLL = r4
                    r1.LJFF = r4
                    r1.LJ = r4
                    r1.LJI = r0
                    X.01GW r0 = X.C0BBX.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    r1.LJII = r0
                    r1.LJIIIIZZ = r3
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                    r1.LJIIIZ = r0
                    r0 = 125(0x7d, float:1.75E-43)
                    X.0cn7 r0 = X.C1025430cn7.LIZIZ(r2, r1, r10, r0)
                    return r0
                L81:
                    r0 = r10
                    goto L4b
                L83:
                    r3 = r10
                    goto L4f
                L85:
                    r1 = r10
                L86:
                    r0 = 60
                    goto L1f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1025420cn6.LIZ(X.0cnC):X.0cn7");
            }

            @Override // X.AbstractC1025500cnE
            public final boolean LIZIZ(C1025480cnC c1025480cnC) {
                Aweme aweme;
                AwemeRawAd awemeRawAd;
                Integer num;
                AwemeRawAd awemeRawAd2;
                LandingPageConfig landingPageConfig;
                Integer num2;
                AwemeRawAd awemeRawAd3;
                LandingPageConfig landingPageConfig2;
                Object obj = c1025480cnC.LIZLLL;
                String type = null;
                if (obj instanceof Aweme) {
                    aweme = (Aweme) obj;
                } else {
                    aweme = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldHandle: aweme -> ");
                sbLIZ.append(System.identityHashCode(aweme));
                sbLIZ.append(",\nawemeRawAd -> ");
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                sbLIZ.append(System.identityHashCode(awemeRawAd));
                sbLIZ.append(",\nwebWatchWhileLoadingType -> ");
                if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && (landingPageConfig2 = awemeRawAd3.getLandingPageConfig()) != null) {
                    num = landingPageConfig2.webWatchWhileLoadingType;
                } else {
                    num = null;
                }
                sbLIZ.append(num);
                C1022620cia.LIZ("WatchWhileLoadingHandler", C2188811AlT.LIZIZ(sbLIZ));
                if (!(AbstractC1025460cnA.LIZJ(c1025480cnC).LIZJ instanceof C1025680cnW) || aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd2.getLandingPageConfig()) == null || (num2 = landingPageConfig.webWatchWhileLoadingType) == null || num2.intValue() != 1) {
                    return false;
                }
                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                if (awemeRawAd4 != null) {
                    type = awemeRawAd4.getType();
                }
                if (!Intrinsics.LJFF(type, "web") || !this.LIZ.I3()) {
                    return false;
                }
                C1025520cnG c1025520cnG = c1025480cnC.LIZIZ;
                if (c1025520cnG.LJFF == 1000) {
                    if (!this.LIZ.LLLF(c1025520cnG.LIZLLL)) {
                        return false;
                    }
                } else if (!this.LIZ.LLJZ(c1025480cnC.LIZIZ.LJFF)) {
                    return false;
                }
                IAdLandPageSurveyService iAdLandPageSurveyService = (IAdLandPageSurveyService) PluggableExtentionKt.pluggableSpi$default(IAdLandPageSurveyService.class, false, false, false, 14, null);
                if (iAdLandPageSurveyService != null && iAdLandPageSurveyService.LJFF(aweme.getAwemeRawAd())) {
                    return false;
                }
                return true;
            }
        }, new AbstractC1025460cnA() { // from class: X.0cn8
            @Override // X.AbstractC1025500cnE
            public final C1025430cn7 LIZ(C1025480cnC c1025480cnC) {
                EnumC1036160d4Q enumC1036160d4Q;
                if (c1025480cnC.LIZIZ.LJFF == 1000) {
                    enumC1036160d4Q = EnumC1036160d4Q.FROM_CUSTOM;
                } else {
                    enumC1036160d4Q = EnumC1036160d4Q.DEFAULT;
                }
                return C1025430cn7.LIZIZ(AbstractC1025460cnA.LIZJ(c1025480cnC), null, enumC1036160d4Q, 123);
            }

            @Override // X.AbstractC1025500cnE
            public final boolean LIZIZ(C1025480cnC c1025480cnC) {
                if (AbstractC1025460cnA.LIZJ(c1025480cnC).LIZLLL != EnumC1036160d4Q.DEFAULT) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final int LJJIJIIJI() {
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final int LJJIJL() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final int LJJIJLIJ() {
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LIZLLL() {
        IBOCFrequencyControlUtils iBOCFrequencyControlUtils = (IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi$default(IBOCFrequencyControlUtils.class, false, false, false, 14, null);
        if (iBOCFrequencyControlUtils != null) {
            iBOCFrequencyControlUtils.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final AbstractC1025510cnF LJIJI() {
        return new C1025430cn7(null, null, null, null, 127);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LIZIZ() {
        return DmNoticeProxyImpl.LIZJ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LIZ(String str) {
        IOpenCCTUtils iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null);
        if (iOpenCCTUtils == null || !iOpenCCTUtils.LIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJIIIZ(Object obj) {
        AwemeRawAd awemeRawAd;
        if ((obj instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) obj) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SendTrackProxy.track() = ");
            sbLIZ.append("click");
            C2188811AlT.LIZIZ(sbLIZ);
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AwS630S0100000_16(awemeRawAd, 92);
            C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJIIJ(Object obj) {
        AwemeRawAd awemeRawAd;
        if ((obj instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) obj) != null) {
            C1025340cmy.LIZIZ.LIZ = awemeRawAd;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJIIJJI(AbstractC1026880cpS abstractC1026880cpS) {
        C1025790cnh c1025790cnh;
        Object obj;
        AwemeRawAd awemeRawAd;
        C1025880cnq c1025880cnq;
        QuickActionModel quickActionModelLIZIZ = null;
        if (abstractC1026880cpS instanceof C1025790cnh) {
            c1025790cnh = (C1025790cnh) abstractC1026880cpS;
        } else {
            c1025790cnh = null;
        }
        if (c1025790cnh == null) {
            return false;
        }
        C1025790cnh c1025790cnh2 = (C1025790cnh) abstractC1026880cpS;
        if (c1025790cnh2 != null && (c1025880cnq = c1025790cnh2.LIZ) != null) {
            obj = c1025880cnq.LIZLLL;
        } else {
            obj = null;
        }
        if (!(obj instanceof AwemeRawAd) || (awemeRawAd = (AwemeRawAd) obj) == null) {
            return false;
        }
        CRouterQuickActionModel cRouterQuickActionModel = c1025790cnh.LJIIIZ;
        if (cRouterQuickActionModel != null) {
            quickActionModelLIZIZ = C1025540cnI.LIZIZ(cRouterQuickActionModel);
        }
        C1025520cnG c1025520cnG = c1025790cnh.LIZIZ;
        int i = c1025520cnG.LJFF;
        String str = c1025520cnG.LIZLLL;
        IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
        if (iShopifySkuCheckoutService == null) {
            return false;
        }
        return iShopifySkuCheckoutService.LIZ(awemeRawAd, quickActionModelLIZIZ, i, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJIIL(String str) {
        return C1022030chd.LJIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJIILJJIL(Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            return C1017070cZd.LL(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final String LJIL(Integer num) {
        Integer numLIZ = C1025770cnf.LIZ(num, EnumC1027330cqB.WEBJUMP);
        if (numLIZ != null) {
            return numLIZ.toString();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJJ(Throwable th) {
        C2344809Gs.LJI(th);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJJIJIL(Object obj) {
        Aweme aweme;
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
            return C1017070cZd.LLJLLIL(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final <T extends AbstractC1026880cpS> AbstractC1026640cp4<?> LJIIIIZZ(String str, T t) {
        C1025790cnh c1025790cnh;
        C1022250chz c1022250chz;
        C1025810cnj c1025810cnj;
        int iHashCode = str.hashCode();
        if (iHashCode != 104010) {
            if (iHashCode != 3322092) {
                if (iHashCode == 3337239 && str.equals("lynx") && (t instanceof C1025810cnj) && (c1025810cnj = (C1025810cnj) t) != null) {
                    C1025820cnk c1025820cnk = new C1025820cnk(c1025810cnj);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getCustomProcessor(), type = lynx, processor = ");
                    sbLIZ.append(c1025820cnk);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return c1025820cnk;
                }
            } else if (str.equals("live") && (t instanceof C1022250chz) && (c1022250chz = (C1022250chz) t) != null) {
                C1022230chx c1022230chx = new C1022230chx(c1022250chz);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getCustomProcessor(), type = LIVE_TYPE, processor = ");
                sbLIZ2.append(c1022230chx);
                C2188811AlT.LIZIZ(sbLIZ2);
                return c1022230chx;
            }
        } else if (str.equals("iab") && (t instanceof C1025790cnh) && (c1025790cnh = (C1025790cnh) t) != null) {
            C1025830cnl c1025830cnl = new C1025830cnl(c1025790cnh);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getCustomProcessor(), type = IAB, processor = ");
            sbLIZ3.append(c1025830cnl);
            C2188811AlT.LIZIZ(sbLIZ3);
            return c1025830cnl;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJIILL(Intent intent, EnumC1025640cnS enumC1025640cnS) {
        int i;
        int i2 = C1025630cnR.LIZ[enumC1025640cnS.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = 1207969296;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = 1207965953;
                }
            } else {
                i = 1207964162;
            }
        } else {
            i = 1207964161;
        }
        ((ISandboxService) ServiceManager.get().getService(ISandboxService.class)).appendDataFlowId(intent, i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final List<EnumC1026700cpA> LJJI(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
        Aweme aweme;
        HashSet hashSet = new HashSet();
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils != null) {
            Object obj = c1025880cnq.LIZJ;
            if (obj instanceof Aweme) {
                aweme = (Aweme) obj;
            } else {
                aweme = null;
            }
            if (iAdWebUtils.bv(aweme, c1025520cnG.LJ, c1025520cnG.LIZLLL, false)) {
                hashSet.add(EnumC1026700cpA.BOC);
            }
        }
        return C13LP.LLIIII(hashSet);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final AbstractC1026880cpS LJJIIJ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
        return new C1022250chz(c1025880cnq, c1025520cnG);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJJIIJZLJL(int i, Object obj) {
        AwemeRawAd awemeRawAd;
        ICommerceService iCommerceService;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        if (obj != null && (obj instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) obj) != null && (iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null)) != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) != null && interfaceC1017820caqLJIILIIL.LJIIIZ(awemeRawAd)) {
            interfaceC1017820caqLJIILIIL.LJIIIIZZ(awemeRawAd).LJIJJLI(0, null, 1003, Integer.valueOf(i));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final String LJIILIIL(int i, Object obj, String str) {
        Aweme aweme;
        IFeedAdShoppingService iFeedAdShoppingService;
        boolean z;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (iFeedAdShoppingService = (IFeedAdShoppingService) PluggableExtentionKt.pluggableSpi$default(IFeedAdShoppingService.class, false, false, false, 14, null)) == null) {
            return str;
        }
        if (i == 87) {
            z = true;
        } else {
            z = false;
        }
        return iFeedAdShoppingService.LIZIZ(aweme, str, null, z);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJIJJLI(int i, Object obj, String str) {
        AwemeRawAd awemeRawAd;
        IShopifySkuCheckoutService iShopifySkuCheckoutService;
        if (obj instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) obj;
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd == null || (iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null)) == null) {
            return false;
        }
        return iShopifySkuCheckoutService.LIZ(awemeRawAd, awemeRawAd.getQuickActionModel(), i, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LIZJ(final String str, final String str2, final String str3, final String str4) {
        if (!((IAdWebLogService) this.LIZ.getValue()).LJFF()) {
            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0cn2
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CRouterAdapterDelegate@d843.logStayPage$1");
                    if (!((C606810Nr5) obj).LIZIZ) {
                        ((IAdWebLogService) this.LL.LIZ.getValue()).LJII().LIZJ(str, str2, str3, str4);
                    }
                    C1C7U.LIZIZ("CRouterAdapterDelegate@d843.logStayPage$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final AbstractC1026880cpS LJ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, C1021060cg4 c1021060cg4, C1026920cpW c1026920cpW) {
        C1025430cn7 c1025430cn7;
        Aweme aweme;
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        NativeSiteConfig nativeSiteConfig;
        String str3;
        int lynxShowStyle;
        String lynxScheme;
        C1025390cn3 c1025390cn3;
        AbstractC1025700cnY abstractC1025700cnY;
        C1025390cn3 c1025390cn32;
        C1025390cn3 c1025390cn33;
        AbstractC1025510cnF abstractC1025510cnF = c1021060cg4.LIZIZ;
        String lynxCustomData = null;
        if ((abstractC1025510cnF instanceof C1025430cn7) && (c1025430cn7 = (C1025430cn7) abstractC1025510cnF) != null) {
            Object obj = c1025880cnq.LIZJ;
            if (obj instanceof Aweme) {
                aweme = (Aweme) obj;
            } else {
                aweme = null;
            }
            if (c1026920cpW != null && (c1025390cn33 = c1026920cpW.LIZLLL) != null) {
                str = c1025390cn33.LJIIIZ;
            } else {
                str = null;
            }
            NonAdWebModel nonAdWebModel = c1025430cn7.LJFF;
            if (c1026920cpW != null && (c1025390cn32 = c1026920cpW.LIZLLL) != null) {
                str2 = c1025390cn32.LJIIJ;
            } else {
                str2 = null;
            }
            AdlpExtraModel adlpExtraModelLIZ = C1025540cnI.LIZ(aweme, c1025520cnG, str, nonAdWebModel, str2, null, null);
            int lynxLandingStyle = 0;
            if (c1025520cnG.LJIIJ) {
                if (c1026920cpW != null && (c1025390cn3 = c1026920cpW.LIZLLL) != null) {
                    String str4 = c1026920cpW.LIZ;
                    String str5 = c1025390cn3.LJII;
                    int i = c1025390cn3.LIZIZ;
                    AbstractC1025700cnY abstractC1025700cnY2 = c1025430cn7.LIZIZ;
                    if (c1025390cn3.LJIIIIZZ) {
                        abstractC1025700cnY = C1025670cnV.LIZIZ;
                    } else {
                        abstractC1025700cnY = abstractC1025700cnY2;
                        if (c1025390cn3.LJ == 1) {
                            C1025660cnU c1025660cnU = new C1025660cnU();
                            C1025390cn3 c1025390cn34 = c1026920cpW.LIZLLL;
                            if (c1025390cn34 != null) {
                                lynxLandingStyle = c1025390cn34.LJFF;
                            }
                            c1025660cnU.LIZIZ = lynxLandingStyle;
                            c1025660cnU.LIZJ = new InterfaceC1025850cnn() { // from class: X.0cn4
                                @Override // X.InterfaceC1025850cnn
                                public final void LIZ() {
                                    C1483410ohn.LJLJJI().LJIILLIIL();
                                }

                                @Override // X.InterfaceC1025850cnn
                                public final void LIZIZ() {
                                    C1483410ohn.LJLJJI().LIZ();
                                }
                            };
                            abstractC1025700cnY = c1025660cnU;
                        }
                    }
                    return new C1025810cnj(c1025880cnq, c1025520cnG, str4, str5, i, adlpExtraModelLIZ, abstractC1025700cnY, c1025430cn7.LIZLLL, true);
                }
            } else {
                CRouterCoreModel cRouterCoreModel = c1021060cg4.LIZ;
                if (cRouterCoreModel != null) {
                    CRouterLynxModel lynxModel = cRouterCoreModel.getLynxModel();
                    if (lynxModel != null) {
                        lynxShowStyle = lynxModel.getLynxShowStyle();
                    } else {
                        lynxShowStyle = 0;
                    }
                    AbstractC1025700cnY abstractC1025700cnYLIZ = C1025690cnX.LIZ(lynxShowStyle, c1025430cn7.LIZIZ);
                    CRouterLynxModel lynxModel2 = cRouterCoreModel.getLynxModel();
                    if (lynxModel2 != null && (lynxScheme = lynxModel2.getLynxScheme()) != null) {
                        CRouterLynxModel lynxModel3 = cRouterCoreModel.getLynxModel();
                        if (lynxModel3 != null) {
                            lynxCustomData = lynxModel3.getLynxCustomData();
                        }
                        CRouterLynxModel lynxModel4 = cRouterCoreModel.getLynxModel();
                        if (lynxModel4 != null) {
                            lynxLandingStyle = lynxModel4.getLynxLandingStyle();
                        }
                        return new C1025810cnj(c1025880cnq, c1025520cnG, lynxScheme, lynxCustomData, lynxLandingStyle, adlpExtraModelLIZ, abstractC1025700cnYLIZ, c1025430cn7.LIZLLL, false);
                    }
                } else {
                    Object obj2 = c1025880cnq.LIZLLL;
                    if ((obj2 instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) obj2) != null && (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) != null && (str3 = nativeSiteConfig.lynxScheme) != null) {
                        return new C1025810cnj(c1025880cnq, c1025520cnG, str3, awemeRawAd.getNativeSiteCustomData(), awemeRawAd.getNativeSiteConfig().lynxLandingStyle, adlpExtraModelLIZ, c1025430cn7.LIZIZ, c1025430cn7.LIZLLL, false);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJFF(String str, String str2, String str3, String str4) {
        ((IAdWebLogService) this.LIZ.getValue()).LJII().LIZIZ(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final String LJII(int i, Context context, Object obj, String str) {
        Aweme aweme;
        String strLJIJJLI;
        IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null);
        if (iEcUgVSAService != null) {
            if (obj instanceof Aweme) {
                aweme = (Aweme) obj;
            } else {
                aweme = null;
            }
            iEcUgVSAService.LJIIJ(context, aweme, i);
            if (iEcUgVSAService.LJFF(str) && (strLJIJJLI = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJJLI(str, null)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("inAppCloseLoopNativeCardClick(),currentUrl = ");
                sbLIZ.append(strLJIJJLI);
                C2188811AlT.LIZIZ(sbLIZ);
                return strLJIJJLI;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJIJJ(Object obj, CRouterQuickActionModel cRouterQuickActionModel, int i, String str) {
        AwemeRawAd awemeRawAd;
        QuickActionModel quickActionModelLIZIZ = null;
        if (obj instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) obj;
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd == null) {
            return false;
        }
        if (cRouterQuickActionModel != null) {
            quickActionModelLIZIZ = C1025540cnI.LIZIZ(cRouterQuickActionModel);
        }
        IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
        if (iShopifySkuCheckoutService == null) {
            return false;
        }
        return iShopifySkuCheckoutService.LIZ(awemeRawAd, quickActionModelLIZIZ, i, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJJII(String str, BrowserConfig browserConfig, String str2, String str3) {
        return ((IOpenCCTUtils) ServiceManager.get().getService(IOpenCCTUtils.class)).LIZJ(str, C1025540cnI.LIZJ(browserConfig), str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5 A[PHI: r3
      0x00c5: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v7 java.lang.String) binds: [B:54:0x00c1, B:20:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1026880cpS LJJIJIIJIL(X.C1025880cnq r30, X.C1025520cnG r31, X.C1021060cg4 r32, X.C1026920cpW r33) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.routeradapter.custom.collector.CRouterAdapterDelegate.LJJIJIIJIL(X.0cnq, X.0cnG, X.0cg4, X.0cpW):X.0cpS");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final void LJIILLIIL(String str, String str2, String str3, CommonAdData commonAdData, Map map) {
        if (commonAdData == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendAdLogInternal(), tag = ");
        sbLIZ.append(str);
        sbLIZ.append(", label = ");
        sbLIZ.append(str2);
        sbLIZ.append(", refer = ");
        sbLIZ.append(str3);
        sbLIZ.append(" ,adExtraData = ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, str2, commonAdData);
        c1022820ciuLIZLLL.LIZJ(str3, "refer");
        c1022820ciuLIZLLL.LIZ(map);
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final String LJJIIZ(Integer num, String str, String str2, Long l, String str3) {
        return ((IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)).LJIILL(str, str2, new MinisRawAdInfo(l, num, str3));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate
    public final boolean LJJIJ(Context context, int i, String str, BrowserConfig browserConfig, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        return ((IOpenCCTUtils) ServiceManager.get().getService(IOpenCCTUtils.class)).LIZIZ(context, i, str, C1025540cnI.LIZJ(browserConfig), str2, str3, str4, z, z2, str5);
    }
}
