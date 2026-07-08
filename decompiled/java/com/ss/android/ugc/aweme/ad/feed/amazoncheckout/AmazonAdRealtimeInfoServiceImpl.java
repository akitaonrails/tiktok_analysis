package com.ss.android.ugc.aweme.ad.feed.amazoncheckout;

import X.C04TD;
import X.C1022820ciu;
import X.C13LP;
import X.C2184171Adz;
import X.C7740030o;
import X.C786410Ut5;
import X.C844470XAv;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyleModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonProductDetailsModel;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonAdRealtimeInfoServiceImpl implements IAmazonAdRealtimeInfoService {
    public static IAmazonAdRealtimeInfoService LJ() {
        Object objLIZ = C04TD.LIZ(IAmazonAdRealtimeInfoService.class, false);
        if (objLIZ != null) {
            return (IAmazonAdRealtimeInfoService) objLIZ;
        }
        if (C04TD.LJLL == null) {
            synchronized (IAmazonAdRealtimeInfoService.class) {
                if (C04TD.LJLL == null) {
                    C04TD.LJLL = new AmazonAdRealtimeInfoServiceImpl();
                }
            }
        }
        return C04TD.LJLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1005060cGG
            if (r0 == 0) goto L23
            r4 = r10
            X.0cGG r4 = (X.C1005060cGG) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L31
            if (r0 != r3) goto L29
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel r9 = r4.LL
            goto L82
        L23:
            X.0cGG r4 = new X.0cGG
            r4.<init>(r8, r10)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            if (r9 == 0) goto L3b
            java.util.List r6 = r9.getAsins()     // Catch: java.lang.Exception -> L95
            goto L3c
        L3b:
            r6 = r7
        L3c:
            if (r9 == 0) goto L43
            boolean r1 = r9.getEnableBWAPaServing()     // Catch: java.lang.Exception -> L95
            goto L44
        L43:
            r1 = 0
        L44:
            if (r9 == 0) goto L47
            goto L49
        L47:
            r0 = r7
            goto L4d
        L49:
            java.lang.String r0 = r9.getExtra()     // Catch: java.lang.Exception -> L95
        L4d:
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealTimeInfoRequest r2 = new com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealTimeInfoRequest     // Catch: java.lang.Exception -> L95
            r2.<init>(r6, r1, r0)     // Catch: java.lang.Exception -> L95
            X.0cGH r0 = com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonCheckoutProductInfoApi.LIZ     // Catch: java.lang.Exception -> L95
            r0.getClass()     // Catch: java.lang.Exception -> L95
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L95
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r0 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            java.lang.Object r1 = r1.getService(r0)     // Catch: java.lang.Exception -> L95
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = X.C1005070cGH.LIZIZ     // Catch: java.lang.Exception -> L95
            X.0p8J r0 = r1.createBuilder(r0)     // Catch: java.lang.Exception -> L95
            com.bytedance.ies.ugc.aweme.network.TTRetrofit r0 = r0.build()     // Catch: java.lang.Exception -> L95
            java.lang.Class<com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonCheckoutProductInfoApi> r1 = com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonCheckoutProductInfoApi.class
            com.bytedance.retrofit2.Retrofit r0 = r0.retrofit     // Catch: java.lang.Exception -> L95
            java.lang.Object r0 = r0.LIZ(r1)     // Catch: java.lang.Exception -> L95
            com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonCheckoutProductInfoApi r0 = (com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonCheckoutProductInfoApi) r0     // Catch: java.lang.Exception -> L95
            r4.LL = r9     // Catch: java.lang.Exception -> L95
            r4.LLILZ = r3     // Catch: java.lang.Exception -> L95
            java.lang.Object r1 = r0.getAmazonCheckoutAdCardInfoSuspend(r2, r4)     // Catch: java.lang.Exception -> L95
            if (r1 != r5) goto L85
            return r5
        L82:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L95
        L85:
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse r1 = (com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse) r1     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L8e
            java.util.List r0 = r1.getProductList()     // Catch: java.lang.Exception -> L95
            goto L8f
        L8e:
            r0 = r7
        L8f:
            if (r9 == 0) goto L94
            r9.setAmazonProductDetails(r0)     // Catch: java.lang.Exception -> L95
        L94:
            return r1
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl.LIZ(com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService
    public final void LIZIZ(AmazonAdRealtimeInfoResult amazonAdRealtimeInfoResult, Aweme aweme) {
        AmazonCheckoutAdModel amazonCheckoutData;
        List<AmazonProductDetailsModel> list;
        String strLJJLIIIJ;
        boolean z;
        List<AmazonProductDetailsModel> list2;
        List<String> asins;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str = null;
        if (awemeRawAd != null) {
            amazonCheckoutData = awemeRawAd.getAmazonCheckoutData();
        } else {
            amazonCheckoutData = null;
        }
        Gson gson = C7740030o.LIZ().getGson();
        if (amazonAdRealtimeInfoResult != null) {
            list = amazonAdRealtimeInfoResult.productList;
        } else {
            list = null;
        }
        String json = GsonProtectorUtils.toJson(gson, list);
        if (amazonCheckoutData == null || (asins = amazonCheckoutData.getAsins()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(asins, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        C844470XAv.LIZ.getClass();
        String string = C786410Ut5.e3(C844470XAv.LIZ()).toString();
        if (amazonAdRealtimeInfoResult != null && (list2 = amazonAdRealtimeInfoResult.productList) != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "bwa_realtime_getinfo_fail", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(strLJJLIIIJ, "product_id");
            c1022820ciuLIZLLL.LIZIZ(json, "bwa_price");
            c1022820ciuLIZLLL.LIZIZ(string, "network_status");
            if (amazonAdRealtimeInfoResult != null) {
                str = amazonAdRealtimeInfoResult.errorCode;
            }
            c1022820ciuLIZLLL.LIZIZ(String.valueOf(str), "error_code");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "bwa_realtime_getinfo_success", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL2.LIZIZ(strLJJLIIIJ, "product_id");
        c1022820ciuLIZLLL2.LIZIZ(json, "bwa_price");
        c1022820ciuLIZLLL2.LJII();
    }

    public static JSONObject LIZLLL(Boolean bool, AmazonCtaButtonStyleModel amazonCtaButtonStyleModel, List list) throws JSONException {
        if (bool != null && amazonCtaButtonStyleModel != null && list != null) {
            Gson gson = C7740030o.LIZ().getGson();
            String json = GsonProtectorUtils.toJson(gson, list);
            String json2 = GsonProtectorUtils.toJson(gson, amazonCtaButtonStyleModel);
            JSONArray jSONArray = new JSONArray(json);
            JSONObject jSONObject = new JSONObject(json2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("amazon_product_details", jSONArray);
            jSONObject2.put("cta_button_text", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("data", jSONObject2);
            jSONObject3.put("isAmazonAd", bool.booleanValue());
            return jSONObject3;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // com.ss.android.ugc.aweme.commercialize.service.IAmazonAdRealtimeInfoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r12, com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult> r14) {
        /*
            r11 = this;
            r6 = r12
            boolean r0 = r14 instanceof X.C1005050cGF
            if (r0 == 0) goto L28
            r5 = r14
            X.0cGF r5 = (X.C1005050cGF) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L13:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel r13 = r5.LLILLJJLI
            java.lang.Object r6 = r5.LL
            java.lang.String r6 = (java.lang.String) r6
            goto L5b
        L28:
            X.0cGF r5 = new X.0cGF
            r5.<init>(r11, r14)
            goto L13
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r4)
            if (r13 == 0) goto L40
            java.util.List r9 = r13.getAmazonProductDetails()     // Catch: java.lang.Exception -> La4
            goto L41
        L40:
            r9 = r2
        L41:
            if (r9 == 0) goto L4b
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Exception -> La4
            if (r0 != 0) goto L4b
            r0 = 0
            goto L4c
        L4b:
            r0 = 1
        L4c:
            if (r0 == 0) goto L90
            r5.LL = r6     // Catch: java.lang.Exception -> La4
            r5.LLILLJJLI = r13     // Catch: java.lang.Exception -> La4
            r5.LLILZIL = r1     // Catch: java.lang.Exception -> La4
            java.lang.Object r4 = r11.LIZ(r13, r5)     // Catch: java.lang.Exception -> La4
            if (r4 != r3) goto L5e
            return r3
        L5b:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> La4
        L5e:
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse r4 = (com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResponse) r4     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto L67
            java.util.List r9 = r4.getProductList()     // Catch: java.lang.Exception -> La4
            goto L68
        L67:
            r9 = r2
        L68:
            if (r13 == 0) goto L6b
            goto L6d
        L6b:
            r10 = r2
            goto L71
        L6d:
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyleModel r10 = r13.getCtaButtonStyle()     // Catch: java.lang.Exception -> La4
        L71:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> La4
            org.json.JSONObject r8 = LIZLLL(r0, r10, r9)     // Catch: java.lang.Exception -> La4
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult r5 = new com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto L8d
            int r0 = r4.getStatusCode()     // Catch: java.lang.Exception -> La4
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> La4
        L85:
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> La4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La4
            goto L8f
        L8d:
            r0 = r2
            goto L85
        L8f:
            return r5
        L90:
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyleModel r10 = r13.getCtaButtonStyle()     // Catch: java.lang.Exception -> La4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> La4
            org.json.JSONObject r8 = LIZLLL(r0, r10, r9)     // Catch: java.lang.Exception -> La4
            com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult r5 = new com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonAdRealtimeInfoResult     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = "0"
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La4
            return r5
        La4:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.amazoncheckout.AmazonAdRealtimeInfoServiceImpl.LIZJ(java.lang.String, com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel, X.05Vn):java.lang.Object");
    }
}
