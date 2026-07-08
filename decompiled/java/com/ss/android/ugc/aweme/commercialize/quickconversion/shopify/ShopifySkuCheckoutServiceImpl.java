package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify;

import X.C07PI;
import X.C0DF0;
import X.C0PEM;
import X.C1022820ciu;
import X.C123100dR;
import X.C1304960k3y;
import X.C1316005Da;
import X.C1316105Db;
import X.C1316405De;
import X.C14CR;
import X.C14CS;
import X.C14CT;
import X.C14CV;
import X.C1841490y1L;
import X.C20225914Cb;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C785410UrT;
import X.DialogC1389620mGW;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutJsProductDetail;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS39S2200000_16;
import kotlin.jvm.internal.AwS42S1400000_30;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutServiceImpl implements IShopifySkuCheckoutService {
    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService
    public final C14CS LJ() {
        return C14CS.LIZ;
    }

    public static void LJIIJ(C20225914Cb c20225914Cb) {
        Integer num = c20225914Cb.LIZ;
        Integer num2 = c20225914Cb.LIZIZ;
        String str = c20225914Cb.LIZJ;
        AwemeRawAd awemeRawAd = c20225914Cb.LIZLLL;
        String str2 = c20225914Cb.LJ;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "sku_checkout_fallback", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(num, "reasonType");
        c1022820ciuLIZLLL.LIZIZ(str, "sku_enter_from");
        c1022820ciuLIZLLL.LIZIZ(num2, "skuType");
        c1022820ciuLIZLLL.LIZIZ(str2, "pdp_url");
        c1022820ciuLIZLLL.LJII();
    }

    public static void LJIIJJI(DialogC1389620mGW dialogC1389620mGW) {
        if (dialogC1389620mGW != null) {
            try {
                if (dialogC1389620mGW.isShowing()) {
                    dialogC1389620mGW.dismiss();
                    C785410UrT.LIZ(dialogC1389620mGW);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[PHI: r1
      0x003d: PHI (r1v3 androidx.fragment.app.Fragment) = (r1v2 androidx.fragment.app.Fragment), (r1v0 androidx.fragment.app.Fragment) binds: [B:16:0x003b, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(android.content.Context r3, com.bytedance.tux.sheet.sheet.TuxSheet r4) {
        /*
            X.19EG r0 = X.C1388190mED.LIZIZ(r3)
            if (r0 == 0) goto L4f
            androidx.fragment.app.FragmentManager r3 = r0.getSupportFragmentManager()
            if (r3 == 0) goto L4f
            if (r4 != 0) goto Lf
            return
        Lf:
            java.lang.String r2 = "shopify_sku_checkout_sheet"
            androidx.fragment.app.Fragment r1 = r3.LJJJJZI(r2)
            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheet
            if (r0 == 0) goto L1b
            if (r1 != 0) goto L3d
        L1b:
            boolean r0 = r3.LJJJJL()     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L27
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L27
            goto L33
        L27:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L33:
            androidx.fragment.app.Fragment r1 = r3.LJJJJZI(r2)
            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheet
            if (r0 == 0) goto L45
            if (r1 == 0) goto L45
        L3d:
            boolean r1 = r1.isAdded()
            r0 = 1
            if (r1 != r0) goto L45
            return
        L45:
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto L4c
            return
        L4c:
            r4.show(r3, r2)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ShopifySkuCheckoutServiceImpl.LJIIL(android.content.Context, com.bytedance.tux.sheet.sheet.TuxSheet):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService
    public final void LJFF(String str, String str2) {
        if (str != null && str.length() != 0) {
            C1316405De.LIZIZ.remove(str);
        }
        if (str2 != null && str2.length() != 0) {
            C1316405De.LIZ.remove(str2);
        }
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            C1316405De.LIZIZ.clear();
            C1316405De.LIZ.clear();
        }
        C14CR.LIZ.clear();
        C14CR.LIZIZ.clear();
    }

    public static void LJI(Context context, Aweme aweme, String str) {
        C0DF0.LIZ(context, aweme, str, null, "sku_checkout_fallback");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService
    public final void LIZLLL(AwemeRawAd awemeRawAd, String str, String str2) {
        String str3;
        if (str == null || awemeRawAd == null) {
            return;
        }
        if (C123100dR.LIZ(str2)) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if (str3.length() != 0 && C1316405De.LIZIZ.get(str3) != null) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1316105Db(awemeRawAd, "preload", C1304960k3y.LIZIZ(str), str, str2, null), 3);
            return;
        }
        if (C123100dR.LIZ(str)) {
            if (str.length() != 0 && C1316405De.LIZ.get(str) != null) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1316005Da(awemeRawAd, C1304960k3y.LIZIZ(str), "preload", C1304960k3y.LIZJ(str), str, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService
    public final boolean LIZ(AwemeRawAd awemeRawAd, QuickActionModel quickActionModel, int i, String str) {
        Integer quickActionType;
        Integer quickActionType2;
        Integer quickActionType3;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        boolean z;
        boolean z2;
        if (awemeRawAd.isGlobalEnableQuickAction() && quickActionModel != null && (((quickActionType2 = quickActionModel.getQuickActionType()) != null && quickActionType2.intValue() == 1) || ((quickActionType3 = quickActionModel.getQuickActionType()) != null && quickActionType3.intValue() == 3))) {
            ArrayList<String> arrayList3 = C07PI.LIZ;
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                arrayList = C07PI.LIZ;
                ArrayList<String> arrayList4 = (ArrayList) settingsManagerLIZLLL.LJIIIIZZ("sku_checkout_refer_block_list", ArrayList.class, arrayList);
                if (arrayList4 != null) {
                    arrayList = arrayList4;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                arrayList = C07PI.LIZ;
            }
            ArrayList<String> arrayList5 = C1841490y1L.LIZ;
            try {
                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                arrayList2 = C1841490y1L.LIZ;
                ArrayList<String> arrayList6 = (ArrayList) settingsManagerLIZLLL2.LJIIIIZZ("sku_checkout_click_from_allow_list", ArrayList.class, arrayList2);
                if (arrayList6 != null) {
                    arrayList2 = arrayList6;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                arrayList2 = C1841490y1L.LIZ;
            }
            if (!arrayList.isEmpty() && arrayList.contains(str)) {
                z = false;
            } else {
                z = true;
            }
            if (!arrayList2.isEmpty() && !arrayList2.contains(String.valueOf(i))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isGlobalEnableQuickAction: ");
        sbLIZ.append(awemeRawAd.isGlobalEnableQuickAction());
        sbLIZ.append(", quickActionType: ");
        if (quickActionModel != null) {
            quickActionType = quickActionModel.getQuickActionType();
        } else {
            quickActionType = null;
        }
        sbLIZ.append(quickActionType);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0169 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.content.Context r25, com.ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ShopifySkuCheckoutServiceImpl.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static void LJIIIZ(Context context, String str, String str2, String str3, Aweme aweme, Boolean bool) {
        AwemeRawAd awemeRawAd = null;
        IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
        if (iShopifySkuCheckoutService != null && iShopifySkuCheckoutService.LJ() != null) {
            AwemeRawAd awemeRawAd2 = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            String strLJ = C14CS.LJ(str, 1, str2, awemeRawAd);
            C14CV.LIZIZ(1, aweme, str3, str, strLJ);
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                C0DF0.LIZ(context, aweme, strLJ, str, "sku_checkout");
                return;
            }
            LJI(context, aweme, str);
            if (aweme != null) {
                awemeRawAd2 = aweme.getAwemeRawAd();
            }
            LJIIJ(new C20225914Cb(3, 1, str3, awemeRawAd2, str));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public final void LJII(Context context, String str, String str2, Aweme aweme, boolean z, ShopifySkuCheckoutJsProductDetail shopifySkuCheckoutJsProductDetail) {
        AwemeRawAd awemeRawAd;
        if (shopifySkuCheckoutJsProductDetail.isMultiOption) {
            C14CV.LIZIZ(2, aweme, str2, str, "");
            String str3 = shopifySkuCheckoutJsProductDetail.productId;
            IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
            if (iShopifySkuCheckoutService != null && iShopifySkuCheckoutService.LJ() != null) {
                C259800zU c259800zU = new C259800zU();
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                ?? LIZJ = C14CS.LIZJ(context, str, str2, awemeRawAd, Boolean.valueOf(z), str3, new AwS39S2200000_16(context, aweme, str2, str, 1), new AwS585S0100000_6(c259800zU, (C259800zU<TuxSheet>) 298), AFwS219S0000000_30.get$arr$(245), AFwS274S0000000_30.get$arr$(267), new AwS42S1400000_30(c259800zU, this, context, aweme, str, 1));
                c259800zU.element = LIZJ;
                LJIIL(context, LIZJ);
                return;
            }
            return;
        }
        LJIIIZ(context, str, shopifySkuCheckoutJsProductDetail.variantId, str2, aweme, Boolean.valueOf(shopifySkuCheckoutJsProductDetail.available));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f0 A[PHI: r9
      0x02f0: PHI (r9v11 java.lang.String) = (r9v10 java.lang.String), (r9v13 java.lang.String), (r9v13 java.lang.String) binds: [B:198:0x02ed, B:173:0x0294, B:175:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0308 A[PHI: r0
      0x0308: PHI (r0v17 com.google.gson.n) = (r0v16 com.google.gson.n), (r0v25 com.google.gson.n), (r0v25 com.google.gson.n), (r0v25 com.google.gson.n) binds: [B:207:0x0304, B:126:0x01f8, B:128:0x0200, B:130:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x031b A[PHI: r23
      0x031b: PHI (r23v1 java.lang.String) = (r23v0 java.lang.String), (r23v6 java.lang.String) binds: [B:214:0x0317, B:103:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0320 A[PHI: r1 r23
      0x0320: PHI (r1v9 java.lang.String) = (r1v8 java.lang.String), (r1v27 java.lang.String) binds: [B:217:0x031c, B:106:0x01aa] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r23v2 java.lang.String) = (r23v1 java.lang.String), (r23v5 java.lang.String) binds: [B:217:0x031c, B:106:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x032a A[PHI: r33
      0x032a: PHI (r33v1 java.lang.String) = (r33v0 java.lang.String), (r33v3 java.lang.String), (r33v3 java.lang.String) binds: [B:221:0x0326, B:94:0x017e, B:96:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x033c A[PHI: r29
      0x033c: PHI (r29v1 java.lang.String) = (r29v0 java.lang.String), (r29v4 java.lang.String) binds: [B:227:0x0338, B:69:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0348 A[PHI: r4
      0x0348: PHI (r4v2 com.google.gson.n) = (r4v1 com.google.gson.n), (r4v13 com.google.gson.n), (r4v13 com.google.gson.n) binds: [B:233:0x0344, B:60:0x010e, B:62:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x048d A[PHI: r40
      0x048d: PHI (r40v2 java.lang.String) = (r40v1 java.lang.String), (r40v4 java.lang.String) binds: [B:313:0x0489, B:275:0x03ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x049f A[PHI: r9
      0x049f: PHI (r9v3 boolean) = (r9v2 boolean), (r9v7 boolean) binds: [B:242:0x035e, B:244:0x0366] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04a5 A[PHI: r9 r36
      0x04a5: PHI (r9v4 boolean) = (r9v3 boolean), (r9v6 boolean) binds: [B:321:0x04a1, B:247:0x0372] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r36v1 java.lang.String) = (r36v0 java.lang.String), (r36v3 java.lang.String) binds: [B:321:0x04a1, B:247:0x0372] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018c  */
    @Override // com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.sheet.sheet.TuxSheet LIZIZ(android.content.Context r51, com.ss.android.ugc.aweme.feed.model.Aweme r52, com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel r53, java.lang.String r54, java.lang.String r55, kotlin.jvm.internal.AwS382S0200000_16 r56, kotlin.jvm.internal.AwS382S0200000_16 r57) {
        /*
            Method dump skipped, instruction units count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ShopifySkuCheckoutServiceImpl.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel, java.lang.String, java.lang.String, kotlin.jvm.internal.AwS382S0200000_16, kotlin.jvm.internal.AwS382S0200000_16):com.bytedance.tux.sheet.sheet.TuxSheet");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public final void LJIIIIZZ(Context context, String str, String str2, Aweme aweme, boolean z, C14CT c14ct, ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData) {
        boolean z2;
        if (c14ct != null && c14ct.LIZ(shopifySkuCheckoutProductDetailData)) {
            z2 = true;
        } else {
            z2 = false;
        }
        AwemeRawAd awemeRawAd = null;
        if (z2) {
            String variantId = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant.getVariantId();
            if (variantId != null) {
                LJIIIZ(context, str, variantId, str2, aweme, shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant.getAvailable());
                return;
            }
            LJI(context, aweme, str);
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            LJIIJ(new C20225914Cb(2, 1, str2, awemeRawAd, str));
            return;
        }
        C14CV.LIZIZ(2, aweme, str2, str, "");
        IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
        if (iShopifySkuCheckoutService == null || iShopifySkuCheckoutService.LJ() == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        ?? LIZIZ = C14CS.LIZIZ(context, str, str2, awemeRawAd, Boolean.valueOf(z), shopifySkuCheckoutProductDetailData, new AwS39S2200000_16(context, aweme, str2, str, 0), new AwS585S0100000_6(c259800zU, (C259800zU<TuxSheet>) 297), AFwS219S0000000_30.get$arr$(244), AFwS274S0000000_30.get$arr$(266), new AwS42S1400000_30(c259800zU, this, context, aweme, str, 0));
        c259800zU.element = LIZIZ;
        LJIIL(context, LIZIZ);
    }
}
