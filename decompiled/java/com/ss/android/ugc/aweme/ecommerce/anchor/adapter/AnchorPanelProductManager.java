package com.ss.android.ugc.aweme.ecommerce.anchor.adapter;

import X.AbstractC1056160dag;
import X.AnonymousClass0317;
import X.C034S;
import X.C06MM;
import X.C0HBB;
import X.C0HBC;
import X.C0NOH;
import X.C0PEM;
import X.C1120604Zw;
import X.C1388190mED;
import X.C1421105hJ;
import X.C1743690vTb;
import X.C188A;
import X.C18LA;
import X.C18LI;
import X.C18MZ;
import X.C18N0;
import X.C18OR;
import X.C19EG;
import X.C1AQS;
import X.C1DFH;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C212258184q;
import X.C21271018Ma;
import X.C21271218Mc;
import X.C21271418Me;
import X.C21271918Mj;
import X.C21272018Mk;
import X.C21272218Mm;
import X.C21272518Mp;
import X.C23250099c;
import X.C291260BbI;
import X.C743702vL;
import X.C770702zh;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import X.EnumC19366010pe;
import X.InterfaceC1865670yeL;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.PanelPerformanceMetrics;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.ECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS11S1301000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorPanelProductManager {
    public final Context LIZ;
    public final ProductListModel LIZIZ;
    public final AnchorPanelConfig LIZJ;
    public final boolean LIZLLL;
    public final IECommerceAnchorService LJ;
    public final String LJFF;
    public final Map<String, String> LJI;
    public final List<AnchorProductInfoModel> LJII;
    public final Map<String, String> LJIIIIZZ;
    public final List<Integer> LJIIIZ;
    public final List<Integer> LJIIJ;
    public final HashSet<Integer> LJIIJJI;
    public final InterfaceC1865670yeL LJIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public Map<String, C21271218Mc> LJIJI;
    public Map<String, C0NOH> LJIJJ;
    public int LJIILIIL = -1;
    public Map<String, List<PromotionLabel>> LJIIZILJ = new LinkedHashMap();
    public final PanelPerformanceMetrics LJIJ = new PanelPerformanceMetrics(0, false, true);

    public final String LIZJ(String str) {
        if (this.LJIIIIZZ.containsKey(str)) {
            return String.valueOf(this.LJIIIIZZ.get(str));
        }
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel = this.LIZIZ;
        String str2 = productListModel.aid;
        HashMap<String, String> map = productListModel.mobParams;
        anchorBizUtils.getClass();
        String strLJJ = AnchorBizUtils.LJJ(str, str2, map);
        this.LJIIIIZZ.put(str, strLJJ);
        return strLJJ;
    }

    public static List LIZIZ(AnchorProductInfoModel anchorProductInfoModel, C21271018Ma c21271018Ma) {
        List<SkuItem> list;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
        if (c21271018Ma != null) {
            list = c21271018Ma.LJIJI;
        } else {
            list = null;
        }
        anchorBizUtils.getClass();
        return AnchorBizUtils.LJJJJIZL(anchorProductInfo, list);
    }

    public final void LJI(int i, C0HBC c0hbc) {
        AnonymousClass0317 anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin;
        String name;
        if (i == 0 && this.LJIJ.isPromotionInfoFirstBind()) {
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIJ.getAnchorClickTime();
            boolean z = false;
            boolean zIsPromotionInfoFromCache = this.LJIJ.isPromotionInfoFromCache();
            String str = this.LJFF;
            ProductListModel productListModel = this.LIZIZ;
            String str2 = productListModel.eventType;
            Boolean boolValueOf = Boolean.valueOf(productListModel.panelConfig.panelFullScreen);
            ProductListModel productListModel2 = this.LIZIZ;
            boolean z2 = !this.LIZLLL;
            c21271918Mj.getClass();
            C21271918Mj.LJJIFFI(0, 0, jCurrentTimeMillis, productListModel2, boolValueOf, str, str2, false, zIsPromotionInfoFromCache, z2);
            this.LJIJ.setPromotionInfoFirstBind(false);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin = ECDiversionDependencyService.createIECDiversionDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IECDiversionDependencyService.class.getName();
                if (anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECDiversionDependencyService.class);
            }
            ((IECDiversionDependencyService) anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin).onPopupFragmentRenderCompleted(C1388190mED.LIZ(this.LIZ), this.LIZIZ.trackParams);
            if (c0hbc != null && C291260BbI.LIZ()) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c0hbc.LIZ);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0HBB(c0hbc, null), 2);
            }
        }
    }

    public final void LJIIIIZZ(AnchorProductInfoModel anchorProductInfoModel, String str) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        Lifecycle lifecycle;
        boolean z;
        String name;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Context context = this.LIZ;
        String str2 = anchorProductInfoModel.extraData.finalUrl;
        ProductListModel productListModel = this.LIZIZ;
        String str3 = productListModel.aid;
        String str4 = productListModel.authorUid;
        anchorBizUtils.getClass();
        if (AnchorBizUtils.LJJLL(context, str, str2, str3, str4)) {
            C21271918Mj.LJJIIJ(C21271918Mj.LIZ, this.LIZIZ, anchorProductInfoModel.extraData, "actual", "", 0, 48);
        } else {
            AnchorBizUtils.LJIIJ(anchorProductInfoModel, true, this.LIZIZ.eventType, false);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).subscribeBulletProductStayTime(this.LJIIL);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ != null && (lifecycle = c19egLIZIZ.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager$openThirdPartyPage$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                        C1AQS.LIZJ(jElapsedRealtime2, 1, IBusinessDependencyService.class.getName(), anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
                    }
                    ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2).unsubscribeBulletProductStayTime(this.LL.LJIIL);
                }
            });
        }
    }

    public final void LJ(int i, C21271018Ma c21271018Ma, AnchorProductInfoModel anchorProductInfoModel) {
        String string;
        PromotionLabel promotionLabel;
        PromotionInfo promotionInfo;
        List<PromotionLabel> list;
        PromotionLabel next;
        if (!this.LJIIJJI.contains(Integer.valueOf(i))) {
            Long l = anchorProductInfoModel.extraData.productId;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            if (c21271018Ma != null && (promotionInfo = c21271018Ma.LJI) != null && (list = promotionInfo.euComplianceLabels) != null) {
                Iterator<PromotionLabel> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (C212258184q.LIZLLL(next)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                promotionLabel = next;
            } else {
                promotionLabel = null;
            }
            ProductListModel productListModel = this.LIZIZ;
            String strLJJ = C21272218Mm.LJJ(anchorProductInfoModel, productListModel, productListModel.eventType, this.LJFF, LIZJ(string), true, null, null);
            if (promotionLabel != null) {
                if (promotionLabel.icon != null) {
                    C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                    String strLIZ = C212258184q.LIZ(promotionLabel);
                    c21271918Mj.getClass();
                    C21271918Mj.LJIILJJIL(strLJJ, strLIZ, string);
                }
                if (promotionLabel != null && promotionLabel.text != null) {
                    C21271918Mj c21271918Mj2 = C21271918Mj.LIZ;
                    String strLIZIZ = C212258184q.LIZIZ(promotionLabel);
                    c21271918Mj2.getClass();
                    C21271918Mj.LJIILJJIL(strLJJ, strLIZIZ, string);
                }
            }
            this.LJIIJJI.add(Integer.valueOf(i));
        }
    }

    public final Map<String, Object> LIZLLL(AnchorProductInfoModel anchorProductInfoModel, String str, boolean z, C21271018Ma c21271018Ma) {
        String string;
        String string2;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List<PromotionSticker> list;
        PromotionInfo promotionInfo;
        Map<String, Object> map;
        C21271218Mc c21271218Mc;
        String str9;
        PromotionInfo promotionInfo2;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PromotionInfo promotionInfo3;
        PromotionProductPrice promotionProductPrice2;
        SinglePriceItem singlePriceItem2;
        PromotionInfo promotionInfo4;
        PromotionProductPrice promotionProductPrice3;
        SinglePriceItem singlePriceItem3;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        AwemeRawAd awemeRawAd;
        Long adId;
        AwemeRawAd awemeRawAd2;
        Long creativeId;
        String strLIZJ = LIZJ(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "video");
        linkedHashMap.put("previous_page", "video");
        String str10 = this.LIZIZ.authorUid;
        String str11 = "";
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("author_id", str10);
        linkedHashMap.put("product_id", str);
        linkedHashMap.put("product_source", String.valueOf(anchorProductInfoModel.extraData.platform));
        linkedHashMap.put("source", String.valueOf(anchorProductInfoModel.extraData.source));
        ProductListModel productListModel = this.LIZIZ;
        linkedHashMap.put("entrance_info", C21272218Mm.LJJ(anchorProductInfoModel, productListModel, productListModel.eventType, this.LJFF, strLIZJ, this.LIZLLL, this.LJI, null));
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel2 = this.LIZIZ;
        anchorBizUtils.getClass();
        linkedHashMap.put("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel2) ? 1 : 0));
        if (!AnchorBizUtils.LJJJLIIL(this.LIZIZ) || (awemeRawAd2 = this.LIZIZ.awemeRawAd) == null || (creativeId = awemeRawAd2.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("creative_id", string);
        if (!AnchorBizUtils.LJJJLIIL(this.LIZIZ) || (awemeRawAd = this.LIZIZ.awemeRawAd) == null || (adId = awemeRawAd.getAdId()) == null || (string2 = adId.toString()) == null) {
            string2 = "";
        }
        linkedHashMap.put("ad_id", string2);
        String str12 = this.LIZIZ.authorUid;
        int size = 0;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
            iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        linkedHashMap.put("is_self", Integer.valueOf(Intrinsics.LJFF(str12, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IAnchorDependencyService.class.getName();
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
            iECommerceHostService2 = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        Integer followStatus = ((IAnchorDependencyService) iECommerceHostService2).getFollowStatus(this.LIZIZ.aweme);
        if (followStatus != null) {
            linkedHashMap.put("follow_status", Integer.valueOf(followStatus.intValue()));
        }
        linkedHashMap.put("source_page_type", "video");
        linkedHashMap.put("source_button", "add_to_cart");
        linkedHashMap.put("cart_form", "add_to_cart");
        String str13 = this.LIZIZ.aid;
        if (str13 == null) {
            str13 = "";
        }
        linkedHashMap.put("source_content_id", str13);
        String str14 = this.LIZIZ.eventType;
        if (str14 == null) {
            str14 = "";
        }
        linkedHashMap.put("enter_from_info", str14);
        Integer num = anchorProductInfoModel.extraData.productStatus;
        int value = EnumC19366010pe.PRODUCT_STATUS_ON_SALES.getValue();
        String str15 = "1";
        if (num != null && num.intValue() == value) {
            str2 = "1";
        } else {
            int value2 = EnumC19366010pe.PRODUCT_STATUS_STOCK.getValue();
            if (num != null && num.intValue() == value2) {
                str2 = "2";
            } else {
                str2 = "3";
            }
        }
        linkedHashMap.put("product_type", str2);
        if (c21271018Ma == null || (str3 = c21271018Ma.LJ) == null) {
            str3 = "";
        }
        linkedHashMap.put("original_price", str3);
        if (c21271018Ma == null || (str4 = c21271018Ma.LIZJ) == null) {
            str4 = "";
        }
        linkedHashMap.put("sale_price", str4);
        String str16 = this.LJI.get("search_entrance");
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("search_entrance", str16);
        linkedHashMap.put("entrance_form", this.LJFF);
        if (c21271018Ma == null || (promotionInfo4 = c21271018Ma.LJI) == null || (promotionProductPrice3 = promotionInfo4.productPrice) == null || (singlePriceItem3 = promotionProductPrice3.minPrice) == null || (str5 = singlePriceItem3.originPriceDecimal) == null) {
            str5 = "";
        }
        linkedHashMap.put("original_price_value", str5);
        if (c21271018Ma == null || (promotionInfo3 = c21271018Ma.LJI) == null || (promotionProductPrice2 = promotionInfo3.productPrice) == null || (singlePriceItem2 = promotionProductPrice2.minPrice) == null || (str6 = singlePriceItem2.salePriceDecimal) == null) {
            str6 = "";
        }
        linkedHashMap.put("sale_price_value", str6);
        if (c21271018Ma == null || (promotionInfo2 = c21271018Ma.LJI) == null || (promotionProductPrice = promotionInfo2.productPrice) == null || (singlePriceItem = promotionProductPrice.minPrice) == null || (str7 = singlePriceItem.currencyName) == null) {
            str7 = "";
        }
        linkedHashMap.put("currency", str7);
        linkedHashMap.put("video_shopping_list_style", Integer.valueOf(this.LIZJ.panelStyle));
        Map<String, C21271218Mc> map2 = this.LJIJI;
        if (map2 != null && (c21271218Mc = (C21271218Mc) ((LinkedHashMap) map2).get(str)) != null) {
            if (c21271218Mc.LJII != 2) {
                str9 = "";
            } else {
                str9 = "on_sale";
            }
            linkedHashMap.put("flashsale_status", str9);
            linkedHashMap.put("countdown_type", AnchorBizUtils.LJJIII(c21271218Mc));
        }
        if (c21271018Ma != null && (map = c21271018Ma.LJIIIZ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (z) {
            str8 = "unable_to_cart";
        } else {
            str8 = "able_to_cart";
        }
        linkedHashMap.put("button_type", str8);
        List listLIZIZ = LIZIZ(anchorProductInfoModel, c21271018Ma);
        if (listLIZIZ == null || listLIZIZ.size() != 1) {
            str15 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_single_sku", str15);
        String str17 = this.LIZIZ.eventType;
        if (str17 == null) {
            str17 = "";
        }
        linkedHashMap.put("enter_from_info", str17);
        Integer num2 = anchorProductInfoModel.extraData.bizType;
        if (num2 == null) {
            num2 = "";
        }
        linkedHashMap.put("biz_type", num2);
        String str18 = this.LIZIZ.requestId;
        if (str18 != null) {
            str11 = str18;
        }
        linkedHashMap.put("request_id", str11);
        List listLIZIZ2 = LIZIZ(anchorProductInfoModel, c21271018Ma);
        if (listLIZIZ2 != null) {
            size = listLIZIZ2.size();
        }
        linkedHashMap.put("saleable_sku_num", Integer.valueOf(size));
        AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
        if (c21271018Ma != null && (promotionInfo = c21271018Ma.LJI) != null) {
            list = promotionInfo.promotionStickers;
        } else {
            list = null;
        }
        anchorBizUtils2.getClass();
        linkedHashMap.putAll(AnchorBizUtils.LJJLIIJ(list, null));
        return linkedHashMap;
    }

    public static void LJFF(AnchorPanelProductManager anchorPanelProductManager, int i, View view, AnchorProductInfoModel anchorProductInfoModel, C21271018Ma c21271018Ma) {
        Integer num;
        String string;
        String string2;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        Integer num2;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        boolean z;
        String name;
        boolean z2;
        String name2;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        String strCurrency;
        String string3;
        String strCurrency2;
        String string4;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        PromotionProductPrice promotionProductPrice2;
        SinglePriceItem singlePriceItem2;
        boolean z3;
        String name3;
        if (!anchorPanelProductManager.LJIIIZ.contains(Integer.valueOf(i))) {
            if (!anchorPanelProductManager.LJIIIZ.contains(Integer.valueOf(i))) {
                anchorPanelProductManager.LJIIIZ.add(Integer.valueOf(i));
            }
            String strValueOf = String.valueOf(anchorProductInfoModel.extraData.productId);
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            ProductListModel productListModel = anchorPanelProductManager.LIZIZ;
            String str = productListModel.aid;
            HashMap<String, String> map = productListModel.mobParams;
            anchorBizUtils.getClass();
            String strLJJ = AnchorBizUtils.LJJ(strValueOf, str, map);
            if (!anchorPanelProductManager.LJIIIIZZ.containsKey(strLJJ)) {
                anchorPanelProductManager.LJIIIIZZ.put(strValueOf, strLJJ);
            }
            if (AnchorBizUtils.LJJJLIIL(anchorPanelProductManager.LIZIZ)) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name4 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name3 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name4, name3, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("landing_ad", "landing_page_product_show", anchorPanelProductManager.LIZIZ.awemeRawAd);
                abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
                abstractC1056160dagOnAdEvent.LIZIZ.put("productId", strValueOf);
                abstractC1056160dagOnAdEvent.LIZIZ.put("localProductIndex", Integer.valueOf(i + 1));
                abstractC1056160dagOnAdEvent.LIZIZ.put("area", "sectionList");
                PromotionInfo promotionInfo = c21271018Ma.LJI;
                if (promotionInfo != null && (promotionProductPrice2 = promotionInfo.productPrice) != null && (singlePriceItem2 = promotionProductPrice2.minPrice) != null) {
                    strCurrency = singlePriceItem2.currency();
                } else {
                    strCurrency = null;
                }
                String str2 = c21271018Ma.LIZJ;
                if (TextUtils.isEmpty(str2)) {
                    string3 = null;
                } else {
                    n nVar = new n();
                    nVar.LJJIIJ("currency", strCurrency);
                    nVar.LJJIIJ("price", str2);
                    string3 = nVar.toString();
                }
                abstractC1056160dagOnAdEvent.LIZIZ.put("salePrice", string3);
                PromotionInfo promotionInfo2 = c21271018Ma.LJI;
                if (promotionInfo2 != null && (promotionProductPrice = promotionInfo2.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                    strCurrency2 = singlePriceItem.currency();
                } else {
                    strCurrency2 = null;
                }
                String str3 = c21271018Ma.LJ;
                if (TextUtils.isEmpty(str3)) {
                    string4 = null;
                } else {
                    n nVar2 = new n();
                    nVar2.LJJIIJ("currency", strCurrency2);
                    nVar2.LJJIIJ("price", str3);
                    string4 = nVar2.toString();
                }
                abstractC1056160dagOnAdEvent.LIZIZ.put("originPrice", string4);
                abstractC1056160dagOnAdEvent.LIZIZ.put("platform", "native");
                abstractC1056160dagOnAdEvent.LIZIZ();
            }
            Map linkedHashMap = new LinkedHashMap();
            if (view != null) {
                linkedHashMap = C18LA.LIZJ(view, C18LA.LIZIZ(anchorPanelProductManager.LIZJ.panelStyle, i, "c7828.d9074_iplaceholder"));
            }
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            ProductListModel productListModel2 = anchorPanelProductManager.LIZIZ;
            String str4 = anchorPanelProductManager.LJFF;
            boolean z4 = anchorPanelProductManager.LIZLLL;
            int i2 = anchorPanelProductManager.LIZJ.panelStyle;
            List listLIZIZ = LIZIZ(anchorProductInfoModel, c21271018Ma);
            AwS11S1301000_32 awS11S1301000_32 = new AwS11S1301000_32(i, anchorPanelProductManager, c21271018Ma, anchorProductInfoModel, strValueOf, 1);
            c21271918Mj.getClass();
            ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
            C18N0 c18n0 = new C18N0();
            c18n0.LJIJI = "TEMAI";
            c18n0.LIZJ = productListModel2.aid;
            Integer num3 = 1;
            int iValueOf = 0;
            if (AnchorBizUtils.LJJJLIIL(productListModel2)) {
                num = num3;
            } else {
                num = 0;
            }
            c18n0.LJIJJLI = num;
            if (AnchorBizUtils.LJJJLIIL(productListModel2) && (awemeRawAd2 = productListModel2.awemeRawAd) != null && (adId = awemeRawAd2.getAdId()) != null) {
                string = adId.toString();
            } else {
                string = null;
            }
            c18n0.LJIL = string;
            if (AnchorBizUtils.LJJJLIIL(productListModel2) && (awemeRawAd = productListModel2.awemeRawAd) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                string2 = creativeId.toString();
            } else {
                string2 = null;
            }
            c18n0.LJJ = string2;
            c18n0.LIZLLL = productListModel2.authorUid;
            c18n0.LJ = productListModel2.requestId;
            String str5 = productListModel2.eventType;
            if (str5 == null) {
                str5 = "";
            }
            c18n0.LIZIZ = str5;
            c18n0.LJIIJJI = "video_cart_tag";
            c18n0.LJIILJJIL = String.valueOf(anchorProductInfoModel.extraData.platform);
            AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
            c18n0.LJIIL = anchorProductInfo.source;
            c18n0.LJIILIIL = anchorProductInfo.sourceFrom;
            c18n0.LJIILLIIL = String.valueOf(anchorProductInfo.productId);
            C21272018Mk.LIZ.getClass();
            c18n0.LJJIIJ = C21272018Mk.LJIIJJI(anchorProductInfoModel);
            String str6 = productListModel2.authorUid;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name5 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            if (Intrinsics.LJFF(str6, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
                num2 = num3;
            } else {
                num2 = 0;
            }
            c18n0.LJIIZILJ = num2;
            c18n0.LJIJ = "no";
            c18n0.LJIJJ = String.valueOf(i + 1);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name6 = IAnchorDependencyService.class.getName();
                if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
            }
            c18n0.LJJII = ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).getFollowStatus(productListModel2.aweme);
            c18n0.LJJJI = strLJJ;
            String str7 = "video";
            c18n0.LJJJIL = "video";
            String str8 = productListModel2.entranceForm;
            if (str8 == null) {
                str8 = str4;
            }
            c18n0.LJJI = str8;
            String str9 = productListModel2.pageName;
            if (str9 != null) {
                str7 = str9;
            }
            c18n0.LJJIFFI = str7;
            Integer numValueOf = null;
            c18n0.LJI = C21272218Mm.LJJ(anchorProductInfoModel, productListModel2, productListModel2.eventType, str4, strLJJ, z4, null, null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(C21272218Mm.LJIILLIIL(productListModel2, "tiktokec_product_show", c18n0.LIZIZ));
            linkedHashMap2.putAll(linkedHashMap);
            HashMap<String, String> map2 = productListModel2.mobParams;
            if (map2 != null) {
                map2.put("track_id", strLJJ);
            }
            HashMap<String, String> map3 = productListModel2.mobParams;
            if (map3 != null) {
                for (Map.Entry<String, String> entry : map3.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
            C18LI c18li = C18LI.LIZ;
            Aweme aweme = productListModel2.aweme;
            c18li.getClass();
            linkedHashMap2.putAll(C18LI.LIZJ(aweme));
            Map mapLJJIFFI = C21272018Mk.LJJIFFI(C21272018Mk.LIZ, productListModel2.aweme, null, 2);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJJIFFI.size()));
            for (Map.Entry entry2 : ((LinkedHashMap) mapLJJIFFI).entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue().toString());
            }
            linkedHashMap2.putAll(linkedHashMap3);
            C21272018Mk c21272018Mk = C21272018Mk.LIZ;
            AnchorProductInfo anchorProductInfo2 = anchorProductInfoModel.extraData;
            c21272018Mk.getClass();
            Map mapLJIJJ = C21272018Mk.LJIJJ(anchorProductInfo2, listLIZIZ);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIJJ.size()));
            for (Map.Entry entry3 : ((LinkedHashMap) mapLJIJJ).entrySet()) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue().toString());
            }
            linkedHashMap2.putAll(linkedHashMap4);
            c18n0.LIZ = linkedHashMap2;
            c18n0.LJJIL = C21272218Mm.LJIJ(anchorProductInfoModel.extra);
            Integer num4 = anchorProductInfoModel.extraData.productStatus;
            int value = EnumC19366010pe.PRODUCT_STATUS_DOWN.getValue();
            if (num4 != null && num4.intValue() == value) {
                c18n0.LJJIZ = C188A.PRODUCT_NOT_AVAILABLE.getValue();
            } else {
                c18n0.LJJIZ = C188A.PRODUCT_AVAILABLE.getValue();
            }
            c18n0.LJJLIIIJ = "2";
            c18n0.LJJJJZI = Integer.valueOf(i2);
            AnchorBizUtils.LIZ.getClass();
            if (!AnchorBizUtils.LJJJZ(productListModel2)) {
                num3 = 0;
            }
            c18n0.LJJJJIZL = num3;
            List<AnchorProductInfoModel> list = productListModel2.products;
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            }
            c18n0.LJJIJIL = numValueOf;
            String str10 = productListModel2.enterListForm;
            if (str10 == null) {
                str10 = "";
            }
            c18n0.LJFF = str10;
            if (Intrinsics.LJFF(productListModel2.isPhotoMode(), Boolean.TRUE)) {
                c18n0.LJJLJ = 150;
                Aweme aweme2 = productListModel2.aweme;
                if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    iValueOf = Integer.valueOf(imageList.size());
                }
                c18n0.LJJLJLI = iValueOf;
            } else {
                c18n0.LJJLJ = 0;
            }
            awS11S1301000_32.invoke(c18n0);
            iCommerceServiceLIZ.logCommerceEvents("tiktokec_product_show", c18n0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r24v6 */
    public final void LIZ(View view, int i, final AnchorProductInfoModel anchorProductInfoModel, C21271018Ma c21271018Ma, String str) throws JSONException {
        boolean z;
        ?? r21;
        String str2;
        Integer num;
        String string;
        String string2;
        Integer num2;
        IECommerceHostService iECommerceHostService;
        Integer num3;
        Integer numValueOf;
        IECommerceHostService iECommerceHostService2;
        AwemeRawAd awemeRawAdLIZ;
        boolean z2;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        boolean z3;
        String name;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        String str3;
        boolean z4;
        String strValueOf;
        int iLJLLJ;
        boolean z5;
        Map<String, String> map;
        PromotionInfo promotionInfo;
        PromotionProductPrice promotionProductPrice;
        SinglePriceItem singlePriceItem;
        Integer num4;
        AnchorPanelConfig anchorPanelConfig;
        C21272518Mp.LIZ.getClass();
        C21272518Mp.LIZIZ = false;
        boolean zLIZ = C770702zh.LIZ(anchorProductInfoModel.extraData.schema);
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        C21271918Mj.LJJIIJ(c21271918Mj, this.LIZIZ, anchorProductInfoModel.extraData, "pre", "", this.LIZJ.panelStyle, 32);
        this.LJIILIIL = i;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Context context = this.LIZ;
        anchorBizUtils.getClass();
        if (!AnchorBizUtils.LJIIL(context, anchorProductInfoModel)) {
            return;
        }
        String strValueOf2 = String.valueOf(anchorProductInfoModel.extraData.productId);
        String strLIZJ = LIZJ(strValueOf2);
        ProductListModel productListModel = this.LIZIZ;
        if (AnchorBizUtils.LJJLIIIJJIZ(this.LIZJ.panelStyle, i) || (productListModel != null && (anchorPanelConfig = productListModel.panelConfig) != null && anchorPanelConfig.panelFullScreen)) {
            z = true;
        } else {
            z = false;
        }
        if (zLIZ) {
            Integer num5 = anchorProductInfoModel.type;
            int type = EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num5 != null && num5.intValue() == type && (num4 = anchorProductInfoModel.extraData.platform) != null && num4.intValue() == 100) {
                Activity activityLIZ = C06MM.LIZ(this.LIZ);
                ProductListModel productListModel2 = this.LIZIZ;
                C21272218Mm.LJJIJIIJIL(activityLIZ, anchorProductInfoModel, productListModel2, productListModel2.eventType, this.LJFF, strLIZJ, this.LIZLLL);
                r21 = 1;
            } else {
                ProductListModel productListModel3 = this.LIZIZ;
                String strLJJIIZ = C21272218Mm.LJJIIZ(anchorProductInfoModel, productListModel3, z, productListModel3.eventType, this.LJFF, strLIZJ, this.LIZLLL);
                HashMap<String, String> map2 = this.LIZIZ.mobParams;
                if (map2 == null || (str3 = map2.get("request_id")) == null) {
                    str3 = "";
                }
                Bundle bundle = new Bundle();
                if (strLIZJ.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    C786410Ut5.LJJJI("track_id", strLIZJ, bundle);
                }
                if (str3.length() > 0) {
                    C786410Ut5.LJJJI("request_id", str3, bundle);
                }
                bundle.putBoolean("video_anchor", true);
                C786410Ut5.LJJJI("title", String.valueOf(anchorProductInfoModel.extraData.title), bundle);
                if (c21271018Ma != null && (promotionInfo = c21271018Ma.LJI) != null && (promotionProductPrice = promotionInfo.productPrice) != null && (singlePriceItem = promotionProductPrice.minPrice) != null) {
                    strValueOf = C743702vL.LIZLLL(singlePriceItem);
                } else {
                    strValueOf = String.valueOf(anchorProductInfoModel.extraData.formatPrice);
                }
                C786410Ut5.LJJJI("price", strValueOf, bundle);
                IECommerceAnchorService iECommerceAnchorService = this.LJ;
                if (iECommerceAnchorService != null) {
                    iLJLLJ = iECommerceAnchorService.LJLLJ();
                } else {
                    iLJLLJ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                }
                String strLJFF = anchorProductInfoModel.extraData.coverUrl;
                if (strLJFF == null) {
                    strLJFF = "";
                }
                try {
                    strLJFF = C1743690vTb.LJFF(iLJLLJ, iLJLLJ, strLJFF);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C786410Ut5.LJJJI("cover", strLJFF, bundle);
                C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, String.valueOf(anchorProductInfoModel.extraData.productId), bundle);
                String strLIZIZ = C18LA.LIZIZ(this.LIZJ.panelStyle, i, "c7828.d9074_iplaceholder");
                BcmStandardTrack bcmStandardTrack = anchorProductInfoModel.extraData.bcmStandardTrack;
                if (bcmStandardTrack != null) {
                    map = bcmStandardTrack.chainParam;
                    z5 = true;
                } else {
                    z5 = true;
                    map = null;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C06MM.LIZ(this.LIZ), C18LA.LJFF(view, strLJJIIZ, strLIZIZ, map));
                smartRouteBuildRoute.withParam(bundle);
                smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.18Md
                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onActionResult(Object obj) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final /* synthetic */ void onEmpty() {
                        C1951107kb.LIZ(this);
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onIntercept(String str4) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onMatched(String str4) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onMissed(String str4) {
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final /* synthetic */ void onOpen(Intent intent) {
                        C1951107kb.LIZIZ(this, intent);
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onSuccess(Intent intent) {
                        C21271918Mj c21271918Mj2 = C21271918Mj.LIZ;
                        AnchorPanelProductManager anchorPanelProductManager = this.LIZ;
                        C21271918Mj.LJJIIJ(c21271918Mj2, anchorPanelProductManager.LIZIZ, anchorProductInfoModel.extraData, "route", "", anchorPanelProductManager.LIZJ.panelStyle, 32);
                    }

                    @Override // com.bytedance.router.OpenResultCallback
                    public final void onFail(String str4, String str5) {
                        String str6 = str5;
                        C21271918Mj c21271918Mj2 = C21271918Mj.LIZ;
                        AnchorPanelProductManager anchorPanelProductManager = this.LIZ;
                        ProductListModel productListModel4 = anchorPanelProductManager.LIZIZ;
                        AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
                        if (str6 == null) {
                            str6 = "-1";
                        }
                        C21271918Mj.LJJIIJ(c21271918Mj2, productListModel4, anchorProductInfo, "route", str6, anchorPanelProductManager.LIZJ.panelStyle, 32);
                        AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
                        AnchorProductInfoModel anchorProductInfoModel2 = anchorProductInfoModel;
                        String str7 = this.LIZ.LIZIZ.eventType;
                        anchorBizUtils2.getClass();
                        AnchorBizUtils.LJIIJ(anchorProductInfoModel2, false, str7, false);
                    }
                });
                smartRouteBuildRoute.open();
                r21 = z5;
            }
        } else {
            r21 = 1;
            r21 = 1;
            Integer num6 = anchorProductInfoModel.type;
            int type2 = EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num6 != null && num6.intValue() == type2) {
                if (AnchorBizUtils.LJJLIIIJILLIZJL(anchorProductInfoModel.extraData.finalUrl, false)) {
                    str2 = anchorProductInfoModel.extraData.finalUrl;
                } else {
                    str2 = anchorProductInfoModel.extraData.detailUrl;
                }
                String str4 = anchorProductInfoModel.extraData.detailUrl;
                if (str4 == null) {
                    str4 = "";
                }
                LJIIIIZZ(anchorProductInfoModel, str4);
            } else {
                Integer num7 = anchorProductInfoModel.type;
                int type3 = EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE();
                if (num7 != null && num7.intValue() == type3) {
                    str2 = anchorProductInfoModel.schema;
                    LJIIIIZZ(anchorProductInfoModel, str2);
                } else {
                    str2 = null;
                }
            }
            IECommerceAnchorService iECommerceAnchorService2 = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
            if (iECommerceAnchorService2 != null) {
                iECommerceAnchorService2.LJIIZILJ(C06MM.LIZ(this.LIZ), str2);
            }
        }
        Map mapLIZJ = C18LA.LIZJ(view, C18LA.LIZIZ(this.LIZJ.panelStyle, i, "c7828.d9074_iplaceholder"));
        String str5 = this.LJFF;
        C21271918Mj.LJIL(anchorProductInfoModel, this.LIZIZ);
        ProductListModel productListModel4 = this.LIZIZ;
        C21271918Mj.LJIJI(c21271918Mj, r21, productListModel4.eventType, productListModel4.aweme, null, anchorProductInfoModel, new ArrayList(this.LJII), "video_anchor", 8);
        ProductListModel productListModel5 = this.LIZIZ;
        boolean z6 = this.LIZLLL;
        int i2 = this.LIZJ.panelStyle;
        List listLIZIZ = LIZIZ(anchorProductInfoModel, c21271018Ma);
        AwS11S1301000_32 awS11S1301000_32 = new AwS11S1301000_32(i, this, c21271018Ma, anchorProductInfoModel, strValueOf2, 0);
        ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
        C18N0 c18n0 = new C18N0();
        c18n0.LJIJI = "TEMAI";
        c18n0.LIZJ = productListModel5.aid;
        boolean zLJJJLIIL = AnchorBizUtils.LJJJLIIL(productListModel5);
        Integer numValueOf2 = Integer.valueOf((int) r21);
        int iValueOf = 0;
        if (zLJJJLIIL) {
            num = numValueOf2;
        } else {
            num = 0;
        }
        c18n0.LJIJJLI = num;
        if (!AnchorBizUtils.LJJJLIIL(productListModel5) || (awemeRawAd2 = productListModel5.awemeRawAd) == null || (adId = awemeRawAd2.getAdId()) == null || (string = adId.toString()) == null) {
            string = "";
        }
        c18n0.LJIL = string;
        if (!AnchorBizUtils.LJJJLIIL(productListModel5) || (awemeRawAd = productListModel5.awemeRawAd) == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string2 = creativeId.toString()) == null) {
            string2 = "";
        }
        c18n0.LJJ = string2;
        if (AnchorBizUtils.LJJJLIIL(productListModel5)) {
            num2 = numValueOf2;
        } else {
            num2 = 0;
        }
        c18n0.LJIJJLI = num2;
        c18n0.LIZLLL = productListModel5.authorUid;
        c18n0.LJ = productListModel5.requestId;
        String str6 = productListModel5.eventType;
        if (str6 == null) {
            str6 = "";
        }
        c18n0.LIZIZ = str6;
        c18n0.LJIIJJI = "video_cart_tag";
        c18n0.LJIILJJIL = String.valueOf(anchorProductInfoModel.extraData.platform);
        AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
        c18n0.LJIILIIL = anchorProductInfo.sourceFrom;
        c18n0.LJIIL = anchorProductInfo.source;
        c18n0.LJIILLIIL = String.valueOf(anchorProductInfo.productId);
        C21272018Mk.LIZ.getClass();
        c18n0.LJJIIJ = C21272018Mk.LJIIJJI(anchorProductInfoModel);
        String str7 = productListModel5.authorUid;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, r21 == true ? 1 : 0, name2, name, z3);
            iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        if (Intrinsics.LJFF(str7, ((IAccountDependencyService) iECommerceHostService).getUserId())) {
            num3 = numValueOf2;
        } else {
            num3 = 0;
        }
        c18n0.LJIIZILJ = num3;
        c18n0.LJIJ = "no";
        c18n0.LJIJJ = String.valueOf(i + 1);
        c18n0.LJJII = AnchorBizUtils.LJJIJIIJI(productListModel5);
        String str8 = productListModel5.entranceForm;
        if (str8 == null) {
            str8 = str5;
        }
        c18n0.LJJI = str8;
        String str9 = productListModel5.pageName;
        if (str9 == null) {
            str9 = "video";
        }
        c18n0.LJJIFFI = str9;
        c18n0.LJJJI = strLIZJ;
        c18n0.LJJJIL = "video";
        c18n0.LJJJJ = str;
        c18n0.LJI = C21272218Mm.LJIL(anchorProductInfoModel, productListModel5.aweme, productListModel5.eventType, str5, strLIZJ, z6);
        c18n0.LJJLIIIJ = "2";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C21272218Mm.LJIILL(productListModel5.aweme, "tiktokec_product_click", c18n0.LIZIZ, productListModel5.mobParams));
        HashMap<String, String> map3 = productListModel5.mobParams;
        if (map3 != null) {
            map3.put("track_id", strLIZJ);
        }
        HashMap<String, String> map4 = productListModel5.mobParams;
        if (map4 != null) {
            for (Map.Entry<String, String> entry : map4.entrySet()) {
                if (C770702zh.LIZIZ(entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        linkedHashMap.putAll(mapLIZJ);
        C18LI c18li = C18LI.LIZ;
        Aweme aweme = productListModel5.aweme;
        c18li.getClass();
        linkedHashMap.putAll(C18LI.LIZJ(aweme));
        String name3 = null;
        Map mapLJJIFFI = C21272018Mk.LJJIFFI(C21272018Mk.LIZ, productListModel5.aweme, null, 2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJJIFFI.size()));
        for (Map.Entry entry2 : ((LinkedHashMap) mapLJJIFFI).entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        linkedHashMap.putAll(linkedHashMap2);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        AnchorProductInfo anchorProductInfo2 = anchorProductInfoModel.extraData;
        c21272018Mk.getClass();
        Map mapLJIJJ = C21272018Mk.LJIJJ(anchorProductInfo2, listLIZIZ);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIJJ.size()));
        for (Map.Entry entry3 : ((LinkedHashMap) mapLJIJJ).entrySet()) {
            linkedHashMap3.put(entry3.getKey(), entry3.getValue().toString());
        }
        linkedHashMap.putAll(linkedHashMap3);
        c18n0.LIZ = linkedHashMap;
        awS11S1301000_32.invoke(c18n0);
        c18n0.LJJIL = C21272218Mm.LJIJ(anchorProductInfoModel.extra);
        c18n0.LJJJJZI = Integer.valueOf(i2);
        AnchorBizUtils.LIZ.getClass();
        if (!AnchorBizUtils.LJJJZ(productListModel5)) {
            numValueOf2 = 0;
        }
        c18n0.LJJJJIZL = numValueOf2;
        List<AnchorProductInfoModel> list = productListModel5.products;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        c18n0.LJJIJIL = numValueOf;
        String str10 = productListModel5.enterListForm;
        if (str10 == null) {
            str10 = "";
        }
        c18n0.LJFF = str10;
        if (Intrinsics.LJFF(productListModel5.isPhotoMode(), Boolean.TRUE)) {
            c18n0.LJJLJ = 150;
            Aweme aweme2 = productListModel5.aweme;
            if (aweme2 != null && (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                iValueOf = Integer.valueOf(imageList.size());
            }
            c18n0.LJJLJLI = iValueOf;
        } else {
            c18n0.LJJLJ = 0;
        }
        iCommerceServiceLIZ.logCommerceEvents("tiktokec_product_click", c18n0);
        if (AnchorBizUtils.LJJJLIIL(this.LIZIZ) || C21271418Me.LIZIZ(this.LIZIZ.aweme)) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                IAdDependencyService iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name4 = IAdDependencyService.class.getName();
                if (iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin != null) {
                    name3 = iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, r21, name4, name3, z2);
                iECommerceHostService2 = iAdDependencyServiceCreateIAdDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            IAdDependencyService iAdDependencyService = (IAdDependencyService) iECommerceHostService2;
            if (!C21271418Me.LIZIZ(this.LIZIZ.aweme)) {
                awemeRawAdLIZ = this.LIZIZ.awemeRawAd;
            } else {
                awemeRawAdLIZ = C21271418Me.LIZ(this.LIZIZ.aweme);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = iAdDependencyService.onAdEvent("anchor_detail", "otherclick", awemeRawAdLIZ);
            abstractC1056160dagOnAdEvent.LIZIZ.put("localProductIndex", Integer.valueOf(i));
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "shop_anchor");
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        ProductListModel productListModel6 = this.LIZIZ;
        String str11 = productListModel6.aid;
        String str12 = productListModel6.authorUid;
        Long l = anchorProductInfoModel.extraData.productId;
        c21272518Mp.getClass();
        C21272518Mp.LJIIL(l, str11, str12);
    }

    public final void LJII(String str, Long l, Boolean bool, int i, Boolean bool2, String str2) {
        if (!this.LJIILJJIL) {
            return;
        }
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        ProductListModel productListModel = this.LIZIZ;
        int i2 = this.LIZJ.panelStyle;
        c21271918Mj.getClass();
        Boolean bool3 = Boolean.TRUE;
        C1421105hJ.LIZLLL("rd_tiktokec_video_shopping_list_render", new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("enter_from", productListModel.eventType), new Pair("author_id", productListModel.authorUid), new Pair("product_id", str), new Pair("item_order", String.valueOf(i + 1)), new Pair("group_id", productListModel.aid), new Pair("is_success", Integer.valueOf(Intrinsics.LJFF(bool, bool3) ? 1 : 0)), new Pair("click_to_show_duration", String.valueOf(l)), new Pair("image_url", str2), new Pair("use_cache", Integer.valueOf(Intrinsics.LJFF(bool2, bool3) ? 1 : 0)), new Pair("video_shopping_list_style", Integer.valueOf(i2)), new Pair("is_full_page", Integer.valueOf(productListModel.panelConfig.panelFullScreen ? 1 : 0)));
    }

    public AnchorPanelProductManager(Context context, ProductListModel productListModel, AnchorPanelConfig anchorPanelConfig, boolean z, IECommerceAnchorService iECommerceAnchorService, String str, Map map, List list, Map map2, List list2, List list3, HashSet hashSet, C18MZ c18mz) {
        this.LIZ = context;
        this.LIZIZ = productListModel;
        this.LIZJ = anchorPanelConfig;
        this.LIZLLL = z;
        this.LJ = iECommerceAnchorService;
        this.LJFF = str;
        this.LJI = map;
        this.LJII = list;
        this.LJIIIIZZ = map2;
        this.LJIIIZ = list2;
        this.LJIIJ = list3;
        this.LJIIJJI = hashSet;
        this.LJIIL = c18mz;
    }
}
