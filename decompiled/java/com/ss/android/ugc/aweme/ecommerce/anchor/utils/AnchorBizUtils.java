package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.AnonymousClass0317;
import X.AnonymousClass0431;
import X.C01GW;
import X.C034S;
import X.C03IT;
import X.C03RE;
import X.C043Y;
import X.C04HG;
import X.C08HX;
import X.C0C64;
import X.C0HBS;
import X.C0ID1;
import X.C0NOH;
import X.C0NOI;
import X.C0NOL;
import X.C0WZX;
import X.C1013003xg;
import X.C10355043d;
import X.C1120604Zw;
import X.C1121904a9;
import X.C115500cD;
import X.C1326790kdB;
import X.C1326840kdG;
import X.C1331670kl3;
import X.C1334210kp9;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C13LE;
import X.C13LP;
import X.C1507790pL7;
import X.C15438062q;
import X.C15MV;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1735020vFc;
import X.C1741890vQh;
import X.C1743690vTb;
import X.C1766860w4y;
import X.C18N0;
import X.C18NA;
import X.C18O4;
import X.C18OW;
import X.C18QY;
import X.C1942307jB;
import X.C19EG;
import X.C1AQS;
import X.C2011207uI;
import X.C20295114b7;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C212258184q;
import X.C212334187o;
import X.C212335187p;
import X.C212337187r;
import X.C21271218Mc;
import X.C21271918Mj;
import X.C21272618Mq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C259800zU;
import X.C418440Gaw;
import X.C424610Gkt;
import X.C426160GnO;
import X.C497820Jfg;
import X.C770702zh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817503Hh;
import X.C919503ib;
import X.C957203og;
import X.EnumC1430380nKG;
import X.EnumC1769850w9n;
import X.EnumC19366010pe;
import X.EnumC590000NCc;
import X.InterfaceC1392640mLO;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcVideoAnchorPanelActivity;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcAnchorDisableDeleteAppendInPublishConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcAnchorToShopSettings;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrefixInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.model.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartUiConfig;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelCountdown;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorLayoutPriority;
import com.ss.android.ugc.aweme.feed.model.AnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS493S0200000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorBizUtils {
    public static final AnchorBizUtils LIZ = new AnchorBizUtils();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("coupon_id", "coupon_type_id", "coupon_type_info", "coupon_cost_role");

    public static List LJIILLIIL() {
        return C1697810uHb.LJ(Integer.valueOf(EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE()), Integer.valueOf(EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE()));
    }

    public static List LJIIZILJ() {
        return C1697810uHb.LJ(Integer.valueOf(EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE()));
    }

    public static boolean LJJLIIIJJIZ(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2 && i2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static List LJIILL() {
        ArrayList arrayList = new ArrayList();
        LIZ.getClass();
        arrayList.addAll(LJIILLIIL());
        arrayList.addAll(LJIIZILJ());
        return arrayList;
    }

    public static boolean LJIILJJIL() {
        if (!LJJJJZ()) {
            return false;
        }
        C21272618Mq.LIZ.getClass();
        EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig = (EcStickerCategorySetting.EcStickerCategoryConfig) C0C64.LJIILLIIL().LJJII(EcStickerCategorySetting.EcStickerCategoryConfig.class, EcStickerCategorySetting.LIZ, "ecom_sticker_category", true);
        return ecStickerCategoryConfig != null && ecStickerCategoryConfig.enableGuide && ecStickerCategoryConfig.enableCategory && !C20295114b7.LIZ().getBoolean(LJJIIJZLJL(), false);
    }

    public static String LJJIIJ() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ecom_sticker_category_should_anchor_");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJJIIJZLJL() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ecom_sticker_bubble_has_been_shown_");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJJJJZ() {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAnchorDependencyService.class.getName(), anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        return ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).containAnchors(LJIILL());
    }

    public static int LJIIIZ(Context context) {
        return (C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
    }

    public static boolean LJIIJJI(PromotionLabel promotionLabel) {
        List<PromotionProperty> list;
        if (promotionLabel != null && (list = promotionLabel.extraProperty) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionProperty promotionProperty : list) {
                if (Intrinsics.LJFF(promotionProperty.propertyName, "emphasize_name")) {
                    arrayList.add(promotionProperty);
                }
            }
            PromotionProperty promotionProperty2 = (PromotionProperty) C13LP.LJJJLL(arrayList);
            if (promotionProperty2 != null && promotionProperty2.propertyValue != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0047 A[EDGE_INSN: B:83:0x0047->B:17:0x0047 BREAK  A[LOOP:0: B:5:0x000b->B:86:0x000b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21275818Nw LJIJJLI(com.ss.android.ugc.aweme.feed.model.Aweme r16) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJIJJLI(com.ss.android.ugc.aweme.feed.model.Aweme):X.18Nw");
    }

    public static String LJIL(List list) {
        String strLJJLIIIJ;
        if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS278S0000000_32.get$arr$(32), 30)) == null) {
            return "";
        }
        return strLJJLIIIJ;
    }

    public static Boolean LJJI(Aweme aweme) {
        String anchorsExtras;
        AnchorsExtras anchorsExtras2;
        AnchorLayoutPriority anchorLayoutPriority;
        Integer num;
        boolean z;
        Type type;
        if (aweme != null && (anchorsExtras = aweme.getAnchorsExtras()) != null) {
            boolean z2 = true;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    type = new TypeToken<AnchorsExtras>() { // from class: X.18O9
                    }.getType();
                } else {
                    type = C2371409Qy.LIZJ(C13LE.LJII(AnchorsExtras.class));
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, anchorsExtras, type);
                if (!(objFromJson instanceof AnchorsExtras)) {
                    objFromJson = null;
                }
                anchorsExtras2 = (AnchorsExtras) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                anchorsExtras2 = null;
            }
            if (anchorsExtras2 != null && (anchorLayoutPriority = anchorsExtras2.getAnchorLayoutPriority()) != null && (num = anchorLayoutPriority.prefix) != null) {
                int iIntValue = num.intValue();
                Integer num2 = anchorLayoutPriority.suffix;
                if (num2 != null) {
                    if (num2.intValue() >= iIntValue) {
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIFFI(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L5b
            java.lang.String r3 = r5.getAnchorsExtras()
            if (r3 == 0) goto L5b
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L42
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L42
            r0.getClass()     // Catch: com.google.gson.s -> L42
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L42
            if (r0 == 0) goto L1e
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L42
            r0 = 1
            if (r1 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            goto L2c
        L22:
            X.18OG r0 = new X.18OG     // Catch: com.google.gson.s -> L42
            r0.<init>()     // Catch: com.google.gson.s -> L42
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L42
            goto L36
        L2c:
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L42
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L42
        L36:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r3, r0)     // Catch: com.google.gson.s -> L42
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L42
            if (r0 != 0) goto L3f
            r1 = r4
        L3f:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L42
            goto L47
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r4
        L47:
            if (r1 == 0) goto L5b
            com.ss.android.ugc.aweme.feed.model.ECAnchorInfo r1 = r1.getEcAnchorInfo()
            if (r1 == 0) goto L5b
            boolean r0 = LJJJLL(r5)
            if (r0 == 0) goto L58
            java.lang.String r0 = r1.adsAnchorTag
            return r0
        L58:
            java.lang.String r0 = r1.anchorTag
            return r0
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJIFFI(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static String LJJII(String str) {
        String strLJIL = null;
        try {
            String strLIZ = C2011207uI.LIZ(UriProtector.parse(str), "visitReportParams");
            if (strLIZ == null) {
                return null;
            }
            new p();
            k kVarLJJIIZ = p.LIZJ(strLIZ).LJIILIIL().LJJIIZ("chain_key");
            if (kVarLJJIIZ == null) {
                return null;
            }
            strLJIL = kVarLJJIIZ.LJIL();
            return strLJIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIL;
        }
    }

    public static String LJJIII(C21271218Mc c21271218Mc) {
        if (c21271218Mc.LJII == 2) {
            long j = c21271218Mc.LIZ;
            if (j > 86400000) {
                return "gt_24";
            }
            if (j > 3600000) {
                return "in_24";
            }
            if (j > 0) {
                return "in_1";
            }
            return "no_countdown";
        }
        return "no_countdown";
    }

    public static AnchorCommonStruct LJJIIZ(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            LIZ.getClass();
            if (LJIILLIIL().contains(Integer.valueOf(((AnchorCommonStruct) next).getType()))) {
                obj = next;
                break;
            }
        }
        return (AnchorCommonStruct) obj;
    }

    public static Integer LJJIJIIJI(ProductListModel productListModel) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        int followStatus;
        String name;
        String str = productListModel.authorUid;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        if (Intrinsics.LJFF(str, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
            return null;
        }
        User user = productListModel.author;
        if (user != null) {
            followStatus = user.getFollowStatus();
        } else {
            followStatus = -1;
        }
        return Integer.valueOf(followStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJJIJIIJIL(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r2 = 0
            if (r4 == 0) goto L4a
            java.lang.String r4 = r4.getAnchorsExtras()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4a
            com.google.gson.Gson r3 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            r0.getClass()     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            if (r0 == 0) goto L1e
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            r0 = 1
            if (r1 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            goto L2c
        L22:
            X.18M1 r0 = new X.18M1     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            r0.<init>()     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            goto L36
        L2c:
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
        L36:
            java.lang.Object r1 = r3.LJIIIIZZ(r4, r0)     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            if (r0 != 0) goto L3f
            r1 = r2
        L3f:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L42 java.lang.Throwable -> L54
            goto L47
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L54
            r1 = r2
        L47:
            if (r1 == 0) goto L4a
            goto L4c
        L4a:
            r1 = r2
            goto L50
        L4c:
            java.util.Map r1 = r1.getImageProductMap()     // Catch: java.lang.Throwable -> L54
        L50:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L54
            goto L60
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L60:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L67
            r2 = r1
        L67:
            java.util.Map r2 = (java.util.Map) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJIJIIJIL(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.Map");
    }

    public static String LJJIJIL(AnchorProductInfo anchorProductInfo) {
        String str = "";
        if (C770702zh.LIZ(anchorProductInfo.elasticUrl)) {
            String str2 = anchorProductInfo.elasticUrl;
            if (str2 != null) {
                str = str2;
            }
            C1334210kp9.LIZIZ(str, EnumC1769850w9n.VIDEO_MULTI_ANCHOR_PRODUCT_LARGE, null, null, false, false, null, null);
            return str;
        }
        if (C770702zh.LIZ(anchorProductInfo.coverUrl)) {
            String str3 = anchorProductInfo.coverUrl;
            if (str3 != null) {
                str = str3;
            }
            C1334210kp9.LIZIZ(str, EnumC1769850w9n.VIDEO_MULTI_ANCHOR_PRODUCT_LARGE, null, null, false, false, null, null);
            return str;
        }
        return null;
    }

    public static String LJJIJL(Aweme aweme) {
        AnchorPrefixInfo anchorPrefixInfo;
        String str;
        AnchorProductInfo anchorProductInfo = (AnchorProductInfo) C13LP.LJJJLL(LJJZZI(aweme));
        if (anchorProductInfo != null && (anchorPrefixInfo = anchorProductInfo.anchorPrefixInfo) != null && (str = anchorPrefixInfo.anchorPrefixText) != null) {
            return str;
        }
        return LJJIFFI(aweme);
    }

    public static String LJJIL(PromotionLabel promotionLabel) {
        Map<String, Object> map;
        Object obj;
        if (promotionLabel == null || (map = promotionLabel.daInfo) == null || (obj = map.get("activity_name")) == null) {
            return null;
        }
        return obj.toString();
    }

    public static Map LJJIZ(VideoProductDaInfo videoProductDaInfo) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        if (videoProductDaInfo != null && (str = videoProductDaInfo.logoDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIJ.size()));
            Iterator<T> it2 = mapLJIIJ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return new LinkedHashMap(linkedHashMap);
        }
        return null;
    }

    public static Map LJJJ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            Object obj = map.get("campaign_id");
            if (obj != null) {
                linkedHashMap.put("campaign_id", obj);
            }
            Object obj2 = map.get("campaign_user_tag");
            if (obj2 != null) {
                linkedHashMap.put("campaign_type", obj2);
            }
            Object obj3 = map.get("campaign_channel");
            if (obj3 != null) {
                linkedHashMap.put("campaign_channel", obj3);
            }
            Object obj4 = map.get("coupon_type");
            if (obj4 != null) {
                linkedHashMap.put("coupon_type", obj4);
            }
            Object obj5 = map.get("coupon_type_info");
            if (obj5 != null) {
                linkedHashMap.put("coupon_type_info", obj5);
            }
            Object obj6 = map.get("coupon_id");
            if (obj6 != null) {
                linkedHashMap.put("coupon_id", obj6);
            }
            Object obj7 = map.get("coupon_type_id");
            if (obj7 != null) {
                linkedHashMap.put("coupon_type_id", obj7);
            }
            Object obj8 = map.get("coupon_id");
            if (obj8 != null) {
                linkedHashMap.put("coupon_id", obj8);
            }
            Object obj9 = map.get("coupon_cost_role");
            if (obj9 != null) {
                linkedHashMap.put("coupon_cost_role", obj9);
            }
            Object obj10 = map.get("rights_cnt");
            if (obj10 != null) {
                linkedHashMap.put("rights_cnt", obj10);
            }
            Object obj11 = map.get("rights_content");
            if (obj11 != null) {
                linkedHashMap.put("rights_content", obj11);
            }
        }
        return linkedHashMap;
    }

    public static C15MV LJJJJJL(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = ((AnchorProductInfoModel) it2.next()).extraData.productStatus;
            int value = EnumC19366010pe.PRODUCT_STATUS_DOWN.getValue();
            if (num == null || num.intValue() != value) {
                return C15MV.OTHER;
            }
        }
        return C15MV.REGION_UNAVAILABLE;
    }

    public static boolean LJJJJLI(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                LIZ.getClass();
                if (LJJLIIIIJ(anchorCommonStruct)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LJJJJZI(AwemePruningModel awemePruningModel) {
        if (awemePruningModel != null) {
            return Intrinsics.LJFF(awemePruningModel.isAd(), Boolean.TRUE);
        }
        return false;
    }

    public static boolean LJJJLIIL(ProductListModel productListModel) {
        if (productListModel != null) {
            return Intrinsics.LJFF(productListModel.isAd(), Boolean.TRUE);
        }
        return false;
    }

    public static boolean LJJJLL(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return true;
        }
        return false;
    }

    public static boolean LJJJLZIJ(List list) {
        Integer num;
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnchorProductInfo anchorProductInfo = ((AnchorProductInfoModel) it2.next()).extraData;
                if (anchorProductInfo == null || (num = anchorProductInfo.platform) == null || num.intValue() != 5) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJJJZ(ProductListModel productListModel) {
        List<AnchorCommonStruct> list;
        if (productListModel != null && (list = productListModel.anchors) != null && (!list.isEmpty())) {
            if (list.isEmpty()) {
                return true;
            }
            for (AnchorCommonStruct anchorCommonStruct : list) {
                LIZ.getClass();
                if (!LJJLIIIIJ(anchorCommonStruct)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LJJL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null && (!anchors.isEmpty())) {
            if (anchors.isEmpty()) {
                return true;
            }
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                LIZ.getClass();
                if (!LJJLIIIIJ(anchorCommonStruct)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LJJLI(String str) {
        Object obj;
        List<String> list;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ == null || (obj = mapLJIIJ.get("source_from")) == null) {
            return false;
        }
        C01GW c01gw = C18O4.LIZIZ;
        Boolean bool = ((EcAnchorDisableDeleteAppendInPublishConfig) c01gw.getValue()).enable;
        if (bool == null || !bool.booleanValue() || (list = ((EcAnchorDisableDeleteAppendInPublishConfig) c01gw.getValue()).sourceFrom) == null || !C13LP.LJJJJ(obj, list)) {
            return false;
        }
        return true;
    }

    public static boolean LJJLIIIIJ(AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct != null) {
            if (anchorCommonStruct.getType() == 35 || anchorCommonStruct.getType() == 6 || anchorCommonStruct.getType() == 33) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJJLIIIJ(Aweme aweme) {
        HashMap<String, Object> mapLJIIJ;
        if (aweme == null || (mapLJIIJ = C1741890vQh.LJIIJ(aweme.getAnchorsExtras())) == null || !Intrinsics.LJFF(mapLJIIJ.get("is_ec_video"), 1) || aweme.isAd()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJLIIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = 0
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L45
            java.lang.String r4 = r6.getAnchorsExtras()     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L45
            com.google.gson.Gson r1 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            r0.getClass()     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            if (r0 == 0) goto L31
            boolean r0 = r0.LJII     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            if (r0 != r2) goto L31
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
        L28:
            java.lang.Object r1 = r1.LJIIIIZZ(r4, r0)     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            if (r0 != 0) goto L3c
            goto L3b
        L31:
            X.18Oi r0 = new X.18Oi     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            r0.<init>()     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            goto L28
        L3b:
            r1 = r3
        L3c:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L41 java.lang.Throwable -> L4f
            if (r1 == 0) goto L45
            goto L47
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
        L45:
            r1 = r3
            goto L4b
        L47:
            java.lang.Integer r1 = r1.getImageProductStyle()     // Catch: java.lang.Throwable -> L4f
        L4b:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4f
            goto L5b
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L5b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L62
            r3 = r1
        L62:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L6d
            int r0 = r3.intValue()
            if (r0 != r2) goto L6d
            r5 = 1
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJLIIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static List LJJZ(Aweme aweme) {
        boolean z;
        EcommerceInfo ecommerceInfo;
        AnchorCommonStruct anchorCommonStruct;
        String extra;
        AnchorProductInfo anchorProductInfo;
        boolean z2;
        Type type;
        if (aweme != null && aweme.isAd()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || (ecommerceInfo = awemeRawAd.getEcommerceInfo()) == null || (anchorCommonStruct = ecommerceInfo.reviewsTabAnchor) == null || (extra = anchorCommonStruct.getExtra()) == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(extra);
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = JSONArrayProtectorUtils.getJSONObject(jSONArray, i).optString("extra");
                try {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            type = C2371409Qy.LIZJ(C13LE.LJ(AnchorProductInfo.class));
                        } else {
                            type = new TypeToken<AnchorProductInfo>() { // from class: X.18OH
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strOptString, type);
                        if (!(objLJIIIIZZ instanceof AnchorProductInfo)) {
                            objLJIIIIZZ = null;
                        }
                        anchorProductInfo = (AnchorProductInfo) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        anchorProductInfo = null;
                    }
                    if (anchorProductInfo == null) {
                        anchorProductInfo = new AnchorProductInfo(null, null, null, null, 0, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    anchorProductInfo = new AnchorProductInfo(null, null, null, null, 0, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                }
                Long l = anchorProductInfo.productId;
                if (l != null && !linkedHashSet.contains(l)) {
                    arrayList.add(anchorProductInfo);
                    linkedHashSet.add(l);
                }
            }
            return arrayList;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    public static List LJJZZI(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null) {
            anchors = aweme.getAnchors();
        } else {
            anchors = null;
        }
        List listLJJZZIII = LJJZZIII(LJJIIZ(anchors), false);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJZZIII, 10));
        Iterator it2 = listLJJZZIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AnchorProductInfoModel) it2.next()).extraData);
        }
        return new ArrayList(arrayList);
    }

    public static void LJII(C18N0 c18n0, VideoProductDaInfo videoProductDaInfo) {
        HashMap<String, Object> mapLJIIJ;
        String str = videoProductDaInfo.logoDaInfo;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIJ.size()));
            Iterator<T> it2 = mapLJIIJ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            c18n0.LJJZZIII = linkedHashMap;
        }
    }

    public static void LJIIIIZZ(C18N0 c18n0, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        c18n0.LJLIIIL = linkedHashMap;
    }

    public static boolean LJIIL(Context context, AnchorProductInfoModel anchorProductInfoModel) {
        Integer num = anchorProductInfoModel.extraData.productStatus;
        int value = EnumC19366010pe.PRODUCT_STATUS_DOWN.getValue();
        if (num != null && num.intValue() == value) {
            LJLIIL(context, anchorProductInfoModel.extraData.unavailableText);
            return false;
        }
        return true;
    }

    public static void LJIILIIL(Aweme aweme, final Function0 function0) throws JSONException {
        String aid;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        JSONObject jSONObject = new JSONObject();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        JSONObject jSONObjectPut = jSONObject.put("video_id", aid);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        PitayaCoreFactory.getCore(String.valueOf(((IApplicationDependencyService) iECommerceHostService).getAppId())).runTask("gecc_video_anchor_panel_preload", new PTYTaskData(jSONObjectPut), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils$clientAIForALPPreRequest$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z2, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) throws JSONException {
                boolean z3;
                JSONObject params;
                String strLJIIIIZZ;
                HashMap<String, Object> mapLJIIJ;
                Function0<Unit> function02;
                JSONObject params2;
                if (pTYTaskData != null && (params2 = pTYTaskData.getParams()) != null) {
                    z3 = JSONObjectProtectorUtils.getBoolean(params2, "pre_request");
                } else {
                    z3 = false;
                }
                if (z2 && z3 && (function02 = function0) != null) {
                    function02.invoke();
                }
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject2 = new JSONObject();
                if (pTYError != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pTYError)) != null && (mapLJIIJ = C1741890vQh.LJIIJ(strLJIIIIZZ)) != null) {
                    for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
                    for (Map.Entry entry2 : ((LinkedHashMap) C08HX.LJ(params)).entrySet()) {
                        jSONObject2.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("rd_tiktokec_video_alp_prerequest_client_ai", jSONObject2);
            }
        });
    }

    public static Pair LJIJI(String str, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PromotionLabel promotionLabel = (PromotionLabel) it2.next();
            List<PromotionProperty> list2 = promotionLabel.extraProperty;
            if (list2 != null) {
                for (PromotionProperty promotionProperty : list2) {
                    if (Intrinsics.LJFF(promotionProperty.propertyName, str) && Intrinsics.LJFF(promotionProperty.propertyValue, "1")) {
                        arrayList.add(promotionLabel);
                        break;
                    }
                }
            }
            arrayList2.add(promotionLabel);
        }
        return new Pair(arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJIJJ(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJIJJ(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData, boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel LJJIIZI(java.util.List r6, boolean r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L4c
            if (r6 == 0) goto L4b
            java.util.Iterator r7 = r6.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r6 = r7.next()
            r2 = r6
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r2 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r2
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r1 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r1.getClass()
            if (r2 == 0) goto L9
            java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty> r1 = r2.extraProperty
            if (r1 == 0) goto L9
            java.util.Iterator r5 = r1.iterator()
        L25:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9
            java.lang.Object r4 = r5.next()
            r3 = r4
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty r3 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty) r3
            java.lang.String r2 = r3.propertyName
            java.lang.String r1 = "strengthen_label"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r1 == 0) goto L25
            java.lang.String r2 = "1"
            java.lang.String r1 = r3.propertyValue
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 == 0) goto L25
            if (r4 == 0) goto L9
            r0 = r6
        L49:
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r0 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r0
        L4b:
            return r0
        L4c:
            if (r6 == 0) goto L4b
            java.lang.Object r0 = X.C13LP.LJJJLL(r6)
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r0 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJIIZI(java.util.List, boolean):com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel");
    }

    public static Map LJJIJ(String str, Map map) {
        C21271218Mc c21271218Mc;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (c21271218Mc = (C21271218Mc) ((LinkedHashMap) map).get(str)) != null) {
            LIZ.getClass();
            if (c21271218Mc.LJII == 2) {
                str2 = "on_sale";
            } else {
                str2 = "";
            }
            linkedHashMap.put("flashsale_status", str2);
            linkedHashMap.put("countdown_type", LJJIII(c21271218Mc));
        }
        return linkedHashMap;
    }

    public static String LJJIJLIJ(AnchorProductInfoModel anchorProductInfoModel, boolean z) {
        if (C770702zh.LIZ(anchorProductInfoModel.extraData.videoAnchorTitle)) {
            return anchorProductInfoModel.extraData.videoAnchorTitle;
        }
        if (C770702zh.LIZ(anchorProductInfoModel.extraData.elasticTitle) && !z) {
            return anchorProductInfoModel.extraData.elasticTitle;
        }
        return anchorProductInfoModel.extraData.title;
    }

    public static int LJJJI(int i, Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 2) {
                if (i > 2) {
                    return 2;
                }
                return 1;
            }
            return num.intValue();
        }
        return 0;
    }

    public static String LJJJIL(AnchorProductInfo anchorProductInfo, SkuItem skuItem) {
        SkuSupply skuSupply;
        SkuItem skuItem2;
        if (Intrinsics.LJFF(anchorProductInfo.isPlatformProduct(), Boolean.TRUE)) {
            List<SkuItem> list = anchorProductInfo.skus;
            if (list != null && (skuItem2 = (SkuItem) C13LP.LJJJLL(list)) != null && skuItem2.skuSupply != null) {
                List<SkuItem> list2 = anchorProductInfo.skus;
                if (list2 == null) {
                    return null;
                }
                skuItem = (SkuItem) C13LP.LJJJLL(list2);
            }
            if (skuItem == null || (skuSupply = skuItem.skuSupply) == null) {
                return null;
            }
            return skuSupply.productId;
        }
        Long l = anchorProductInfo.productId;
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    public static String LJJJJ(AnchorProductInfo anchorProductInfo, SkuItem skuItem) {
        SkuSupply skuSupply;
        SkuItem skuItem2;
        if (Intrinsics.LJFF(anchorProductInfo.isPlatformProduct(), Boolean.TRUE)) {
            List<SkuItem> list = anchorProductInfo.skus;
            if (list != null && (skuItem2 = (SkuItem) C13LP.LJJJLL(list)) != null && skuItem2.skuSupply != null) {
                List<SkuItem> list2 = anchorProductInfo.skus;
                if (list2 == null) {
                    return null;
                }
                skuItem = (SkuItem) C13LP.LJJJLL(list2);
            }
            if (skuItem == null || (skuSupply = skuItem.skuSupply) == null) {
                return null;
            }
            return skuSupply.sellerId;
        }
        return anchorProductInfo.sellerId;
    }

    public static String LJJJJI(SkuItem skuItem, Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            SkuSupply skuSupply = skuItem.skuSupply;
            if (skuSupply != null) {
                return skuSupply.skuId;
            }
            return null;
        }
        return skuItem.skuId;
    }

    public static List LJJJJIZL(AnchorProductInfo anchorProductInfo, List list) {
        List<SkuItem> list2;
        SkuItem skuItem;
        if (Intrinsics.LJFF(anchorProductInfo.isPlatformProduct(), Boolean.TRUE) && (list2 = anchorProductInfo.skus) != null && (skuItem = (SkuItem) C13LP.LJJJLL(list2)) != null && skuItem.skuSupply != null) {
            return anchorProductInfo.skus;
        }
        return list;
    }

    public static String LJJJJJ(AnchorProductInfo anchorProductInfo, Integer num) {
        int i;
        EnumC1769850w9n enumC1769850w9n;
        String strLJFF;
        if (num != null && num.intValue() == 0) {
            i = C18OW.LIZ().lowImageSize;
        } else if (num == null || num.intValue() == 1) {
            i = C18OW.LIZ().middleImageSize;
        } else {
            i = C18OW.LIZ().middleImageSize;
        }
        if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 1)) {
            if (num.intValue() == 2) {
                enumC1769850w9n = EnumC1769850w9n.VIDEO_MULTI_ANCHOR_PRODUCT_LARGE;
            } else {
                enumC1769850w9n = EnumC1769850w9n.VIDEO_MULTI_ANCHOR_PRODUCT_SMALL;
            }
        } else {
            enumC1769850w9n = EnumC1769850w9n.VIDEO_MULTI_ANCHOR;
        }
        if (num != null && num.intValue() == 2) {
            strLJFF = LJJIJIL(anchorProductInfo);
        } else {
            strLJFF = "";
            if (C770702zh.LIZ(anchorProductInfo.elasticUrl)) {
                String str = anchorProductInfo.elasticUrl;
                if (str != null) {
                    strLJFF = str;
                }
                try {
                    strLJFF = C1743690vTb.LJFF(i, i, strLJFF);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1334210kp9.LIZIZ(strLJFF, enumC1769850w9n, null, null, false, false, null, null);
            } else if (C770702zh.LIZ(anchorProductInfo.coverUrl)) {
                String str2 = anchorProductInfo.coverUrl;
                if (str2 != null) {
                    strLJFF = str2;
                }
                try {
                    strLJFF = C1743690vTb.LJFF(i, i, strLJFF);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C1334210kp9.LIZIZ(strLJFF, enumC1769850w9n, null, null, false, false, null, null);
            } else {
                strLJFF = null;
            }
        }
        if (strLJFF == null) {
            return null;
        }
        return C1326840kdG.LIZ.LIZLLL(strLJFF, false).LIZ;
    }

    public static boolean LJJLIIIJILLIZJL(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C21272618Mq.LIZ.getClass();
        EcAnchorToShopSettings.EcAnchorToShopModel ecAnchorToShopModel = EcAnchorToShopSettings.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcAnchorToShopSettings.EcAnchorToShopModel ecAnchorToShopModel2 = EcAnchorToShopSettings.LIZ;
        EcAnchorToShopSettings.EcAnchorToShopModel ecAnchorToShopModel3 = (EcAnchorToShopSettings.EcAnchorToShopModel) settingsManagerLIZLLL.LJIIIIZZ("ec_anchor_to_shop", EcAnchorToShopSettings.EcAnchorToShopModel.class, ecAnchorToShopModel2);
        if (ecAnchorToShopModel3 != null) {
            ecAnchorToShopModel2 = ecAnchorToShopModel3;
        }
        if (!ecAnchorToShopModel2.enableAnchorToShop) {
            C21271918Mj.LIZ.getClass();
            C21271918Mj.LJI(false, -1, "anchor_to_shop_experiment_disable", str, null, z);
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (!C13LP.LJJJJ(uri.getHost(), ecAnchorToShopModel2.hostWhiteList)) {
            C21271918Mj.LIZ.getClass();
            C21271918Mj.LJI(false, -2, "host_not_in_whitelist", str, null, z);
            return false;
        }
        String strLIZIZ = C1942307jB.LIZIZ(uri, "af_dp");
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            List<String> list = ecAnchorToShopModel2.pathWhiteList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!(!a0.LJJIIZI(strLIZIZ, it2.next(), false))) {
                        if (!SmartRouter.canOpen(strLIZIZ)) {
                            C21271918Mj.LIZ.getClass();
                            C21271918Mj.LJI(false, -5, "schema_can_not_open", str, strLIZIZ, z);
                            return false;
                        }
                        C21271918Mj.LIZ.getClass();
                        C21271918Mj.LJI(true, null, null, str, strLIZIZ, z);
                        return true;
                    }
                }
            }
            C21271918Mj.LIZ.getClass();
            C21271918Mj.LJI(false, -3, "path_not_in_whitelist", str, strLIZIZ, z);
            return false;
        }
        C21271918Mj.LIZ.getClass();
        C21271918Mj.LJI(false, -4, "af_dp_get_fail", str, null, z);
        return false;
    }

    public static Map LJJLIIJ(List list, Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (list == null) {
            return linkedHashMap;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((PromotionSticker) it2.next()).daInfo);
        }
        C115500cD.LIZ(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJJZZIII(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r71, boolean r72) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJZZIII(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, boolean):java.util.List");
    }

    public static void LJLIIL(Context context, String str) {
        if ((str == null || a0.LJJJIL(str)) && (str = context.getString(2131845266)) == null) {
            str = "";
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LIZ(C19EG c19eg, Intent intent, Bundle bundle) throws Throwable {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_2");
        C1701330uNH.LIZ(intent, c19eg);
        C2204961BRm.LLJJJIL(c19eg, intent, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnulYORVpbFWluc10bpsTafqhySmBpb3VmmunS4=", null));
    }

    public static void LIZLLL(Context context, List list, C426160GnO c426160GnO) {
        if (c426160GnO == null || list.isEmpty()) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, c426160GnO);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PromotionLabel promotionLabel = (PromotionLabel) it2.next();
            C212335187p c212335187p = C212335187p.LIZ;
            C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, null);
            c212335187p.getClass();
            c426160GnO.addView(C212335187p.LIZIZ(context, c212337187rLIZ));
        }
    }

    public static void LJ(Map map, C18N0 c18n0, String str) {
        C21271218Mc c21271218Mc;
        String str2;
        if (map != null && (c21271218Mc = (C21271218Mc) ((LinkedHashMap) map).get(str)) != null) {
            AnchorBizUtils anchorBizUtils = LIZ;
            if (c18n0 != null) {
                anchorBizUtils.getClass();
                if (c21271218Mc.LJII == 2) {
                    str2 = "on_sale";
                } else {
                    str2 = "";
                }
                c18n0.LJJJJLI = str2;
                anchorBizUtils.getClass();
                c18n0.LJJJJL = LJJIII(c21271218Mc);
                return;
            }
            anchorBizUtils.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C18N0 r4, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r5, java.util.Map r6) {
        /*
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r0 = r5.extraData
            java.lang.Long r0 = r0.productId
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = r6
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r1)
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo r2 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo) r2
            boolean r1 = r6.containsKey(r1)
            r0 = 1
            r3 = 0
            if (r1 != r0) goto L4f
            if (r2 == 0) goto L4f
            java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel> r2 = r2.promotionLabels
            if (r2 == 0) goto L4f
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r1 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r3)
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r0 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r0
            r1.getClass()
            boolean r0 = LJIIJJI(r0)
            if (r0 != 0) goto L4f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r3)
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r0 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r0
            java.lang.Integer r0 = r0.defaultStyle
            if (r0 == 0) goto L4f
            int r1 = r0.intValue()
            r0 = 10
            if (r1 != r0) goto L4f
            java.lang.String r0 = "1"
        L4c:
            r4.LJJLIIIIJ = r0
            return
        L4f:
            java.lang.String r0 = "0"
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJFF(X.18N0, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.util.Map r4, X.C18N0 r5, java.lang.String r6) {
        /*
            if (r4 == 0) goto L24
            java.lang.Object r1 = r4.get(r6)
            X.0NOH r1 = (X.C0NOH) r1
            if (r1 == 0) goto L24
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r0.getClass()
            if (r5 == 0) goto L24
            boolean r0 = r1.LIZIZ()
            if (r0 == 0) goto L38
            long r3 = r1.LIZ
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L25
            java.lang.String r0 = "gt_24"
        L22:
            r5.LJJJJL = r0
        L24:
            return
        L25:
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            java.lang.String r0 = "in_24"
            goto L22
        L2f:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L38
            java.lang.String r0 = "in_1"
            goto L22
        L38:
            java.lang.String r0 = "no_countdown"
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJI(java.util.Map, X.18N0, java.lang.String):void");
    }

    public static String LJJ(String str, String str2, HashMap map) {
        String str3;
        String str4;
        if (map != null) {
            str3 = (String) map.get("track_id");
        } else {
            str3 = null;
        }
        if (C770702zh.LIZ(str3)) {
            return str3;
        }
        if (map == null || (str4 = (String) map.get("request_id")) == null) {
            str4 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        return C03RE.LIZ(str4, str2, str);
    }

    public static void LJJJJL(Context context, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance_info", str2);
        linkedHashMap.put("page_name", "video");
        linkedHashMap.put("previous_page", "video");
        C1735020vFc.LIZ.getClass();
        String strLJIIIIZZ = C1735020vFc.LJIIIIZZ(str, "trackParams", linkedHashMap);
        if (C770702zh.LIZ(strLJIIIIZZ)) {
            SmartRouter.buildRoute(context, strLJIIIIZZ).open();
        }
    }

    public static boolean LJJJJLL(int i, boolean[] zArr, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 > i2) {
                break;
            }
            int i5 = 2;
            if (i != 0 && (i == 1 || (i == 2 && i4 == 0))) {
                i5 = 1;
            }
            i3 += i5;
            if (i3 > i2) {
                if (i4 >= 0 && i4 <= zArr.length - 1) {
                    return zArr[i4];
                }
            } else {
                i4++;
            }
        }
        return false;
    }

    public static void LJLIIIL(Context context, Aweme aweme, AnchorProductInfoModel anchorProductInfoModel) {
        String str;
        String aid;
        String aid2;
        String authorUid;
        Integer num = anchorProductInfoModel.type;
        String authorUid2 = null;
        if (num != null && num.intValue() == 33) {
            if (LJJLIIIJILLIZJL(anchorProductInfoModel.extraData.finalUrl, false)) {
                str = anchorProductInfoModel.extraData.finalUrl;
            } else {
                str = anchorProductInfoModel.extraData.detailUrl;
            }
            AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
            String str2 = anchorProductInfo.detailUrl;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = anchorProductInfo.finalUrl;
            if (aweme != null) {
                aid2 = aweme.getAid();
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                aid2 = null;
                authorUid = null;
            }
            if (!LJJLL(context, str2, str3, aid2, authorUid)) {
                LJIIJ(anchorProductInfoModel, true, "video_comment_single_anchor", true);
            }
        } else {
            str = null;
        }
        Integer num2 = anchorProductInfoModel.type;
        if (num2 != null && num2.intValue() == 6) {
            str = anchorProductInfoModel.schema;
            String str4 = anchorProductInfoModel.extraData.finalUrl;
            if (aweme != null) {
                aid = aweme.getAid();
                authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            } else {
                aid = null;
            }
            LJJLL(context, str, str4, aid, authorUid2);
        }
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIZILJ(context, str);
    }

    public static void LJIIJ(AnchorProductInfoModel anchorProductInfoModel, boolean z, String str, boolean z2) {
        Integer num = anchorProductInfoModel.extraData.productStatus;
        int value = EnumC590000NCc.ProductStatusDown.getValue();
        if (num != null && num.intValue() == value) {
            C18NA.LIZ.getClass();
            C18NA.LIZLLL(true, 5002, "product unavailable", str, z2, null);
            return;
        }
        String str2 = anchorProductInfoModel.extraData.schema;
        if (str2 != null && str2.length() != 0) {
            C18NA c18na = C18NA.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("is_thirty_part", Boolean.valueOf(z));
            c18na.getClass();
            C18NA.LIZLLL(true, 5004, "route fail", str, z2, linkedHashMap);
            return;
        }
        C18NA.LIZ.getClass();
        C18NA.LIZLLL(true, 5003, "data unavailable", str, z2, null);
    }

    public static void LJIJ(C424610Gkt c424610Gkt, AnchorProductInfoModel anchorProductInfoModel, String str, boolean z) {
        Integer num = anchorProductInfoModel.type;
        int type = EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE();
        if (num != null && num.intValue() == type) {
            try {
                AnchorBizUtils anchorBizUtils = LIZ;
                AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
                anchorBizUtils.getClass();
                String strLJJIJIL = LJJIJIL(anchorProductInfo);
                if (strLJJIJIL != null && strLJJIJIL.length() != 0) {
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C0HBS(str, z, anchorProductInfoModel, c424610Gkt, null), 3);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJJLIIIJL(GImage gImage, SmartImageView smartImageView, Function1 function1, Function0 function0) {
        C03IT c03it;
        if (gImage != null) {
            List<String> thumbUrls = gImage.getThumbUrls();
            if (thumbUrls != null && !thumbUrls.isEmpty()) {
                c03it = new C03IT(gImage.getThumbUrls());
            } else {
                c03it = new C03IT(gImage.getUrls());
            }
        } else {
            c03it = null;
        }
        LJJLIIIJLLLLLLLZ(c03it, smartImageView, function1, function0);
    }

    public static void LJJLIIIJLJLI(Image image, SmartImageView smartImageView, Function1 function1, Function0 function0) {
        C03IT thumbFirstImageUrlModel;
        if (image != null) {
            thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel();
        } else {
            thumbFirstImageUrlModel = null;
        }
        LJJLIIIJLLLLLLLZ(thumbFirstImageUrlModel, smartImageView, function1, function0);
    }

    public static void LJJLIIIJLLLLLLLZ(C03IT c03it, SmartImageView smartImageView, Function1 function1, Function0 function0) {
        if (c03it == null && function0 != null) {
            function0.invoke();
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
        c1331670kl3LIZLLL.LJJ(smartImageView);
        c1331670kl3LIZLLL.LJIIJ(new C0ID1(function1, function0, 0));
    }

    public static void LJLI(Context context, ProductListModel productListModel, String str, AnchorProductInfoModel anchorProductInfoModel) {
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num = anchorProductInfoModel.type;
        String str6 = null;
        if (num != null && num.intValue() == 33) {
            if (LJJLIIIJILLIZJL(anchorProductInfoModel.extraData.finalUrl, false)) {
                str2 = anchorProductInfoModel.extraData.finalUrl;
            } else {
                str2 = anchorProductInfoModel.extraData.detailUrl;
            }
            AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
            String str7 = anchorProductInfo.detailUrl;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = anchorProductInfo.finalUrl;
            if (productListModel != null) {
                str4 = productListModel.aid;
                str5 = productListModel.authorUid;
            } else {
                str4 = null;
                str5 = null;
            }
            if (!LJJLL(context, str7, str8, str4, str5)) {
                LJIIJ(anchorProductInfoModel, true, str, true);
            }
        } else {
            str2 = null;
        }
        Integer num2 = anchorProductInfoModel.type;
        if (num2 != null && num2.intValue() == 6) {
            str2 = anchorProductInfoModel.schema;
            String str9 = anchorProductInfoModel.extraData.finalUrl;
            if (productListModel != null) {
                str3 = productListModel.aid;
                str6 = productListModel.authorUid;
            } else {
                str3 = null;
            }
            LJJLL(context, str2, str9, str3, str6);
        }
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIZILJ(context, str2);
    }

    public static void LJLIL(int i, boolean[] zArr, int i2, PromotionInfo promotionInfo) {
        List<PromotionLabel> list;
        int i3 = 0;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = 2;
            if (i != 0 && (i == 1 || (i == 2 && i4 == 0))) {
                i5 = 1;
            }
            i3 += i5;
            if (i3 > i2) {
                if (i4 >= 0 && i4 < zArr.length && promotionInfo != null && (list = promotionInfo.euComplianceLabels) != null) {
                    for (PromotionLabel promotionLabel : list) {
                        if (C212258184q.LIZLLL(promotionLabel)) {
                            if (promotionLabel != null) {
                                if (promotionLabel.icon != null || (promotionLabel != null && promotionLabel.text != null)) {
                                    zArr[i4] = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return;
            }
            i4++;
        }
    }

    public static boolean LJJLL(Context context, String str, String str2, String str3, String str4) {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (LJJLIIIJILLIZJL(str2, true)) {
            String strLIZIZ = C1942307jB.LIZIZ(UriProtector.parse(str2), "af_dp");
            if (strLIZIZ == null) {
                return false;
            }
            String strLIZ = C919503ib.LIZ(strLIZIZ, C2097608Jq.LJIIIIZZ(new Pair("item_id", str3), new Pair("author_id", str4)));
            if (str3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append("&item_id=");
                sbLIZ.append(str3);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZIZ2 != null) {
                    strLIZ = strLIZIZ2;
                }
            }
            if (str4 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZ);
                sbLIZ2.append("&author_id=");
                sbLIZ2.append(str4);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                if (strLIZIZ3 != null) {
                    strLIZ = strLIZIZ3;
                }
            }
            SmartRouter.buildRoute(context, strLIZ).open();
            return SmartRouter.canOpen(strLIZ);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAdDependencyService.class.getName();
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        return ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).openAdWebUrl(context, str, "");
    }

    public static void LJJLIL(C19EG c19eg, ProductListModel productListModel, String str, AnchorPanelConfig anchorPanelConfig, InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        Aweme awemeLJJLIIIJJIZ;
        boolean z2;
        String name;
        int size;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2;
        Aweme awemeLJJLIIIJJIZ2;
        boolean z3;
        String name2;
        Aweme awemeLJJLIIIJJIZ3;
        List<AnchorCommonStruct> anchors;
        if (anchorPanelConfig != null && anchorPanelConfig.panelFullScreen) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String strValueOf = productListModel.aid;
            if (strValueOf == null) {
                strValueOf = String.valueOf(System.currentTimeMillis());
            }
            AwemeRawAd awemeRawAd = productListModel.awemeRawAd;
            if (awemeRawAd == null || awemeRawAd.getEcommerceClickAnchors() == null) {
                ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJI(productListModel, strValueOf);
            }
            anchorPanelConfig.setEnablePromotionBanner(false);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "anchorStruct", anchorCommonStruct);
            bundle.putBoolean("useBubbleIcon", false);
            if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ3 = interfaceC1392640mLO.LJJLIIIJJIZ()) != null && (anchors = awemeLJJLIIIJJIZ3.getAnchors()) != null) {
                size = anchors.size();
            } else {
                size = 0;
            }
            bundle.putInt("anchorCount", size);
            bundle.putLong("clickTime", System.currentTimeMillis());
            C786410Ut5.LJJIZ(bundle, "panelConfig", anchorPanelConfig);
            C786410Ut5.LJJJI("productListModelCacheKey", strValueOf, bundle);
            C786410Ut5.LJJJI("source_btm_token", str, bundle);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            intent.setClass(c19eg, EcVideoAnchorPanelActivity.class);
            intent.setFlags(276824064);
            try {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name3 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 != null) {
                        name2 = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2.getClass().getName();
                    } else {
                        name2 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                IAdDependencyService iAdDependencyService = (IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin2;
                if (interfaceC1392640mLO != null) {
                    awemeLJJLIIIJJIZ2 = interfaceC1392640mLO.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ2 = null;
                }
                iAdDependencyService.getShoppingCoupon(awemeLJJLIIIJJIZ2, null);
                LIZ(c19eg, intent, ActivityOptions.makeSceneTransitionAnimation(c19eg, new android.util.Pair[0]).toBundle());
                return;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IAdDependencyService.class.getName();
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        IAdDependencyService iAdDependencyService2 = (IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        iAdDependencyService2.getShoppingCoupon(awemeLJJLIIIJJIZ, null);
        LJJLJ(c19eg, productListModel, str, anchorPanelConfig, interfaceC1392640mLO, anchorCommonStruct);
    }

    public static void LJJLJ(C19EG c19eg, ProductListModel productListModel, String str, AnchorPanelConfig anchorPanelConfig, InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct) {
        int size;
        boolean z;
        float f;
        List<AnchorProductInfoModel> list = productListModel.products;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (anchorPanelConfig == null) {
            anchorPanelConfig = productListModel.panelConfig;
        }
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = new ECommerceAnchorPanelFragment();
        eCommerceAnchorPanelFragment.LLJILJILJ = interfaceC1392640mLO;
        Bundle bundle = new Bundle();
        if (anchorCommonStruct != null) {
            C786410Ut5.LJJIZ(bundle, "anchorStruct", anchorCommonStruct);
        }
        C786410Ut5.LJJIZ(bundle, "productListModel", productListModel);
        if (str != null && str.length() != 0) {
            C786410Ut5.LJJJI("source_btm_token", str, bundle);
        }
        bundle.putBoolean("useBubbleIcon", false);
        bundle.putLong("clickTime", System.currentTimeMillis());
        C786410Ut5.LJJIZ(bundle, "panelConfig", anchorPanelConfig);
        eCommerceAnchorPanelFragment.setArguments(bundle);
        int iLJJJI = LJJJI(size, Integer.valueOf(anchorPanelConfig.panelStyle));
        if (anchorPanelConfig.enableMaybeYouLike || (iLJJJI == 0 ? size > 4 : !(iLJJJI == 1 ? size <= 1 : iLJJJI == 2 && size <= 1))) {
            z = true;
        } else {
            z = false;
        }
        float f2 = c19eg.getResources().getDisplayMetrics().heightPixels;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_ec_panel_should_limit_to_73_max_height", false)) {
            f = 0.73f;
        } else {
            f = 0.85f;
        }
        float f3 = f2 * f;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        if (z) {
            c1390920mIc.LIZ.LLJJL = (int) f3;
        }
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = eCommerceAnchorPanelFragment;
        tuxSheet.LLILLJJLI = eCommerceAnchorPanelFragment;
        tuxSheet.LLJLLL = true;
        tuxSheet.LLJLL = false;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "ECommerceAnchorPanelFragment");
        ECommerceAnchorPanelFragment.LLLLIILL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.187o] */
    public static void LIZIZ(Context context, String str, PromotionLabel promotionLabel, ViewGroup viewGroup, Map map, long j, long j2) {
        C0NOI c0noiLIZIZ;
        C259800zU c259800zU = new C259800zU();
        LabelCountdown labelCountdown = promotionLabel.countdown;
        if (labelCountdown == null) {
            return;
        }
        if (map != null) {
            Object c0noh = map.get(str);
            if (c0noh == null) {
                c0noh = new C0NOH();
                map.put(str, c0noh);
            }
            C0NOH c0noh2 = (C0NOH) c0noh;
            if (c0noh2 != null && (c0noiLIZIZ = C0NOL.LIZIZ(j2, j, labelCountdown.startTime, labelCountdown.endTime)) != null) {
                c0noh2.LIZLLL(c0noiLIZIZ);
                if (c0noh2.LIZJ == 2) {
                    C212335187p c212335187p = C212335187p.LIZ;
                    C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, null);
                    c212335187p.getClass();
                    ?? LIZ2 = C212335187p.LIZ(context, c212337187rLIZ);
                    LIZ2.setPromotionText(promotionLabel.text);
                    c0noh2.LIZ(new AwS493S0200000_32(c0noh2, (C212334187o) LIZ2, 0));
                    C0NOH.LJ(c0noh2);
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("count down first show state = ");
                    sbLIZ.append(c0noh2.LIZJ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LJ(strLIZIZ);
                    LIZ2.setCountDownText(c0noh2.LIZ);
                    c259800zU.element = LIZ2;
                } else {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("count down remaining time is more than one day");
                }
            }
        }
        T t = c259800zU.element;
        if (t != 0 && viewGroup != null) {
            viewGroup.addView((View) t, new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))));
        }
    }

    public static void LIZJ(Context context, String str, PromotionLabel promotionLabel, C426160GnO c426160GnO, List list, LinearLayout linearLayout, Map map, long j, long j2) {
        String str2;
        Long lLJIILIIL;
        if (LJIIJJI(promotionLabel)) {
            C786410Ut5.LJZL(0, linearLayout);
            C212335187p c212335187p = C212335187p.LIZ;
            C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, null);
            c212335187p.getClass();
            linearLayout.addView(C212335187p.LIZIZ(context, c212337187rLIZ));
            C786410Ut5.LLZLLLL(c426160GnO, 8);
            return;
        }
        C786410Ut5.LJZL(8, linearLayout);
        ArrayList<PromotionLabel> arrayList = (ArrayList) list;
        arrayList.add(promotionLabel);
        C786410Ut5.LJLLLLLL(0, c426160GnO);
        for (PromotionLabel promotionLabel2 : arrayList) {
            LabelCountdown labelCountdown = promotionLabel2.countdown;
            if (labelCountdown != null && (str2 = labelCountdown.endTime) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null && lLJIILIIL.longValue() > 0) {
                LIZ.getClass();
                LIZIZ(context, str, promotionLabel2, c426160GnO, map, j, j2);
            } else {
                C212335187p c212335187p2 = C212335187p.LIZ;
                C212337187r c212337187rLIZ2 = C18QY.LIZ(promotionLabel2, context, null);
                c212335187p2.getClass();
                c426160GnO.addView(C212335187p.LIZIZ(context, c212337187rLIZ2));
            }
        }
    }

    public static void LJL(View view, AnchorProductInfo anchorProductInfo, SkuItem skuItem, String str, String str2, HashMap map, Map map2, SkuPanelParam skuPanelParam, Map map3, final Function0 function0) {
        PlatformLinkInfo platformLinkInfo;
        String strLJJJJI;
        String strLJIIIIZZ;
        String str3;
        String string;
        Object obj = null;
        if (Intrinsics.LJFF(anchorProductInfo.isPlatformProduct(), Boolean.TRUE)) {
            if (skuItem != null) {
                str3 = skuItem.skuId;
            } else {
                str3 = null;
            }
            Long l = anchorProductInfo.productId;
            if (l != null) {
                string = l.toString();
            } else {
                string = null;
            }
            platformLinkInfo = new PlatformLinkInfo(str3, string, anchorProductInfo.sellerId);
        } else {
            platformLinkInfo = null;
        }
        String strLJJJIL = LJJJIL(anchorProductInfo, skuItem);
        String str4 = "";
        if (strLJJJIL == null) {
            strLJJJIL = "";
        }
        String strLJJJJ = LJJJJ(anchorProductInfo, skuItem);
        if (strLJJJJ != null) {
            str4 = strLJJJJ;
        }
        if (skuItem != null) {
            strLJJJJI = LJJJJI(skuItem, anchorProductInfo.isPlatformProduct());
        } else {
            strLJJJJI = null;
        }
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        if (pageSourceInfoLJ != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
        } else {
            strLJIIIIZZ = null;
        }
        C04HG c04hg = C04HG.LJI;
        String strLIZIZ = C957203og.LIZIZ(str2, view, map);
        Pair[] pairArr = new Pair[3];
        IPdpStarter.LIZ.getClass();
        pairArr[0] = new Pair("source", Integer.valueOf(C1013003xg.LIZ(map)));
        Object obj2 = map.get("author_id");
        if (obj2 instanceof String) {
            obj = obj2;
        }
        pairArr[1] = new Pair("kol_id", obj);
        pairArr[2] = new Pair("traffic_source_list", map.get("traffic_source_list"));
        ((ICartService) ServiceManager.get().getService(ICartService.class)).LIZLLL(view, new C043Y(new AddToCartRequestParam(strLJJJIL, str4, strLJJJJI, 1, 6, strLJIIIIZZ, str, strLIZIZ, C2097608Jq.LJIIIIZZ(pairArr), null, platformLinkInfo, null, null, null, null), new C10355043d(map2, C2097608Jq.LJ()), true, skuPanelParam, new AddToCartUiConfig(true, true, 500L, 114, Boolean.FALSE), view), new AnonymousClass0431() { // from class: X.18Nu
            @Override // X.AnonymousClass0431
            public final void LIZIZ() {
            }

            @Override // X.AnonymousClass0431
            public final void LIZJ() {
            }

            @Override // X.AnonymousClass0431
            public final EnterCartParam LIZLLL() {
                return null;
            }

            @Override // X.AnonymousClass0431
            public final void LJ() {
            }

            @Override // X.AnonymousClass0431
            public final View LJFF() {
                return null;
            }

            @Override // X.AnonymousClass0431
            public final C043Y LJI() {
                return null;
            }

            @Override // X.AnonymousClass0431
            public final void LIZ(C10372043u c10372043u) {
                function0.invoke();
            }
        }, true, new EnterCartParam(map3));
    }
}
