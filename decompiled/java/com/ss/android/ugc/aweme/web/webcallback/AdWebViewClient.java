package com.ss.android.ugc.aweme.web.webcallback;

import X.C01GW;
import X.C054G;
import X.C098200Yq;
import X.C0AU0;
import X.C0WT9;
import X.C1035880d3y;
import X.C1035890d3z;
import X.C1035990d49;
import X.C1039440d9i;
import X.C1039550d9t;
import X.C1039700dA8;
import X.C1039720dAA;
import X.C1039770dAF;
import X.C1039790dAH;
import X.C1039800dAI;
import X.C1039870dAP;
import X.C1039930dAV;
import X.C1039980dAa;
import X.C1039990dAb;
import X.C1040040dAg;
import X.C1040050dAh;
import X.C1040210dAx;
import X.C1040230dAz;
import X.C1040320dB8;
import X.C1040580dBY;
import X.C1040740dBo;
import X.C1040750dBp;
import X.C1042260dEG;
import X.C1042450dEZ;
import X.C1043510dGH;
import X.C1051120dSY;
import X.C1053550dWT;
import X.C1054340dXk;
import X.C1054420dXs;
import X.C1128504bD;
import X.C123100dR;
import X.C1308910kAL;
import X.C13LE;
import X.C1807670x8n;
import X.C189200o6;
import X.C1948707kD;
import X.C1E1P;
import X.C1E1Q;
import X.C1E1R;
import X.C1E1T;
import X.C20515215Pi;
import X.C21167617sY;
import X.C217500sf;
import X.C2188811AlT;
import X.C2215608mA;
import X.C2217381BqS;
import X.C2265561Dly;
import X.C257700A8a;
import X.C259800zU;
import X.C306010Bz5;
import X.C444910HcX;
import X.C786410Ut5;
import X.EnumC1039530d9r;
import X.InterfaceC1035480d3K;
import X.InterfaceC1036190d4T;
import X.InterfaceC1036210d4V;
import X.InterfaceC1038430d85;
import X.InterfaceC1054310dXh;
import X.InterfaceC2206021BVo;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.ProgressButtonStage;
import com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService;
import com.ss.android.ugc.aweme.checkout.CheckoutBtnState;
import com.ss.android.ugc.aweme.checkout.ShopifyCheckoutMessageBridge;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutTokenResponse;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.FailMsgModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.experiment.IABResponseErrorChecklistExp;
import com.ss.android.ugc.aweme.web.performance.WebResourcesLoadReportSwitchModel;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import defpackage.b9;
import defpackage.h8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS23S2200000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS5S2400000_16;
import kotlin.jvm.internal.AwS7S1001000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebViewClient implements InterfaceC2206021BVo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final int $stable;
    public static final C1040040dAg Companion;
    public final C1039440d9i adWebViewExtension;
    public volatile C1053550dWT backend_getAdWebHistoryManagerLcom_ss_android_ugc_aweme_history_AdWebHistoryManager;
    public boolean checkedFailList;
    public List<String> failMsgCheckList;
    public final C21167617sY adWebHistoryManager$delegate = C21167617sY.LIZ;
    public List<JSONObject> failResponseCheckList = new ArrayList();
    public Map<String, JSONObject> failResponseCheckMap = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0dAg] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdWebViewClient.class, "adWebHistoryManager", "getAdWebHistoryManager()Lcom/ss/android/ugc/aweme/history/AdWebHistoryManager;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS};
        Companion = new Object() { // from class: X.0dAg
        };
        $stable = 8;
    }

    private final C1053550dWT getAdWebHistoryManager() {
        C1053550dWT c1053550dWT = this.backend_getAdWebHistoryManagerLcom_ss_android_ugc_aweme_history_AdWebHistoryManager;
        if (c1053550dWT == null) {
            synchronized (this) {
                c1053550dWT = this.backend_getAdWebHistoryManagerLcom_ss_android_ugc_aweme_history_AdWebHistoryManager;
                if (c1053550dWT == null) {
                    C1053550dWT c1053550dWT2 = (C1053550dWT) C1807670x8n.LJJJJI();
                    this.backend_getAdWebHistoryManagerLcom_ss_android_ugc_aweme_history_AdWebHistoryManager = c1053550dWT2;
                    return c1053550dWT2;
                }
            }
        }
        return c1053550dWT;
    }

    private final void handleFail() {
        String string;
        if (this.checkedFailList) {
            return;
        }
        this.checkedFailList = true;
        try {
            C01GW c01gw = IABResponseErrorChecklistExp.LIZIZ;
            List<String> list = ((IABResponseErrorChecklistExp.IABResponseErrorChecklist) c01gw.getValue()).checkList;
            this.failMsgCheckList = ((IABResponseErrorChecklistExp.IABResponseErrorChecklist) c01gw.getValue()).msgCheckList;
            if (list != null && !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    this.failResponseCheckList.add(new JSONObject(it2.next()));
                }
            }
            if (true ^ this.failResponseCheckList.isEmpty()) {
                for (JSONObject jSONObject : this.failResponseCheckList) {
                    JSONArray jSONArrayNames = jSONObject.names();
                    if (jSONArrayNames != null && (string = JSONArrayProtectorUtils.getString(jSONArrayNames, 0)) != null) {
                        this.failResponseCheckMap.put(string, new JSONObject(jSONObject.optString(string)));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public AdWebViewClient(C1039440d9i c1039440d9i) {
        this.adWebViewExtension = c1039440d9i;
    }

    private final void updateFailModel(C1035880d3y c1035880d3y, String str) {
        String str2;
        int i;
        String str3 = null;
        if (c1035880d3y != null) {
            FailMsgModel failMsgModel = c1035880d3y.getFailMsgModel();
            if (failMsgModel != null) {
                str2 = failMsgModel.name;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                FailMsgModel failMsgModel2 = c1035880d3y.getFailMsgModel();
                if (failMsgModel2 != null) {
                    str3 = failMsgModel2.name;
                }
                if (Intrinsics.LJFF(str3, str)) {
                    FailMsgModel failMsgModel3 = c1035880d3y.getFailMsgModel();
                    if (failMsgModel3 != null) {
                        FailMsgModel failMsgModel4 = c1035880d3y.getFailMsgModel();
                        if (failMsgModel4 != null) {
                            i = failMsgModel4.consecutiveTimes;
                        } else {
                            i = 0;
                        }
                        failMsgModel3.setConsecutiveTimes(i + 1);
                        return;
                    }
                    return;
                }
            } else if (c1035880d3y == null) {
                return;
            }
            FailMsgModel failMsgModel5 = c1035880d3y.getFailMsgModel();
            if (failMsgModel5 != null) {
                failMsgModel5.setName(str);
            }
            FailMsgModel failMsgModel6 = c1035880d3y.getFailMsgModel();
            if (failMsgModel6 != null) {
                failMsgModel6.setFirstPage(c1035880d3y.getFirstPage());
            }
            FailMsgModel failMsgModel7 = c1035880d3y.getFailMsgModel();
            if (failMsgModel7 == null) {
                return;
            }
            failMsgModel7.setConsecutiveTimes(1);
        }
    }

    @Override // X.InterfaceC2206021BVo
    public void onPageCommitVisible(WebView webView, String str) {
        String currentUrl;
        String refer;
        ICommerceLandPageService iCommerceLandPageServiceLIZ;
        InterfaceC1036190d4T interfaceC1036190d4T;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageCommitVisible: request focus currentUrl=");
        C1035880d3y c1035880d3y = this.adWebViewExtension.LIZ;
        Object c098200Yq = null;
        if (c1035880d3y != null) {
            currentUrl = c1035880d3y.getCurrentUrl();
        } else {
            currentUrl = null;
        }
        sbLIZ.append(currentUrl);
        sbLIZ.append(" refer=");
        C1035880d3y c1035880d3y2 = this.adWebViewExtension.LIZ;
        if (c1035880d3y2 != null) {
            refer = c1035880d3y2.getRefer();
        } else {
            refer = null;
        }
        sbLIZ.append(refer);
        C2188811AlT.LIZIZ(sbLIZ);
        SparkContext sparkContext = this.adWebViewExtension.LIZIZ;
        if (sparkContext != null && (interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext.LJFF(InterfaceC1036190d4T.class)) != null) {
            interfaceC1036190d4T.LJIIJ();
        }
        this.adWebViewExtension.LJJIJIIJI(webView, "onPageCommitVisible");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("progressType", "onPageCommitVisible");
            jSONObject.put("iab_load_progress_update", jSONObject2);
            ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
            if (iCommerceService != null && (iCommerceLandPageServiceLIZ = iCommerceService.LIZ()) != null) {
                iCommerceLandPageServiceLIZ.Ox0(jSONObject, this.adWebViewExtension.LIZIZ);
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC2206021BVo
    public void onPageFinished(WebView webView, String str) {
        C1040740dBo c1040740dBo;
        InterfaceC1038430d85 interfaceC1038430d85;
        AwemeRawAd awemeRawAd;
        FeatureCenterModel feature;
        boolean z;
        int iIntValue;
        InterfaceC1036190d4T interfaceC1036190d4T;
        InterfaceC1036190d4T interfaceC1036190d4T2;
        SparkContext sparkContext = this.adWebViewExtension.LIZIZ;
        if (sparkContext != null && (interfaceC1036190d4T2 = (InterfaceC1036190d4T) sparkContext.LJFF(InterfaceC1036190d4T.class)) != null) {
            interfaceC1036190d4T2.setPullRefreshPageLoading(false);
        }
        SparkContext sparkContext2 = this.adWebViewExtension.LIZIZ;
        if (sparkContext2 != null && (interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext2.LJFF(InterfaceC1036190d4T.class)) != null) {
            interfaceC1036190d4T.LJIILIIL();
        }
        C1035880d3y c1035880d3y = this.adWebViewExtension.LIZ;
        boolean z2 = true;
        if (c1035880d3y != null) {
            c1035880d3y.setLoadFinish(true);
        }
        C1039440d9i c1039440d9i = this.adWebViewExtension;
        c1039440d9i.getClass();
        C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
        C054G c054g = c1039440d9i.LJJII;
        C1035880d3y c1035880d3y2 = c1039440d9i.LIZ;
        c1042450dEZ.getClass();
        if (c1035880d3y2 != null && webView != null && str != null && C1042450dEZ.LIZLLL(c1035880d3y2) && !c1035880d3y2.getRecordingModel().isInjectJs().get()) {
            c1035880d3y2.getRecordingModel().isInjectJs().set(true);
            C1042450dEZ.LIZJ(webView, c1035880d3y2, c054g, str, "load_finish");
        }
        C1040320dB8 c1040320dB8 = C1040320dB8.LIZ;
        C1035880d3y c1035880d3y3 = c1039440d9i.LIZ;
        c1040320dB8.getClass();
        if (webView != null && c1035880d3y3 != null && (awemeRawAd = c1035880d3y3.getAwemeRawAd()) != null && (feature = awemeRawAd.getFeature()) != null && Intrinsics.LJFF(feature.iabRecordingNotice, Boolean.TRUE) && ((Boolean) C306010Bz5.LIZ.getValue()).booleanValue()) {
            if (C1042260dEG.LIZ().enable && C1035990d49.LIZJ(awemeRawAd.getFeature())) {
                z = true;
            } else {
                z = false;
            }
            boolean zLIZLLL = C1042450dEZ.LIZLLL(c1035880d3y3);
            if ((z || zLIZLLL) && !Keva.getRepo("RecordingOneTimeNotice").getBoolean("has_notify", false)) {
                Context context = webView.getContext();
                if (context != null) {
                    C20515215Pi c20515215Pi = new C20515215Pi(webView);
                    c20515215Pi.LIZ.LIZIZ = 3000L;
                    String string = context.getString(2131845870);
                    String string2 = context.getString(2131845874);
                    String string3 = context.getString(2131845869);
                    String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(string, "{privacy_policy}", string2, false), "{ads_and_your_data}", string3, false);
                    C444910HcX c444910HcX = new C444910HcX(strLJJIFFI);
                    c444910HcX.LIZ(61);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(iIntValue), 0, c444910HcX.length(), 33);
                    int iLJJJ = a0.LJJJ(strLJJIFFI, string2, 0, false, 6);
                    if (iLJJJ != -1) {
                        C1040320dB8.LIZIZ(c444910HcX, iLJJJ, string2.length() + iLJJJ, context, new AwS595S0100000_16(c1035880d3y3, 124));
                    }
                    int iLJJJ2 = a0.LJJJ(strLJJIFFI, string3, 0, false, 6);
                    if (iLJJJ2 != -1) {
                        C1040320dB8.LIZIZ(c444910HcX, iLJJJ2, string3.length() + iLJJJ2, context, new AwS595S0100000_16(c1035880d3y3, 125));
                    }
                    c20515215Pi.LIZ.LJFF = c444910HcX;
                    c20515215Pi.LIZ.LJIILJJIL = new AwS595S0100000_16(c1035880d3y3, 375);
                    c20515215Pi.LIZLLL();
                    z2 = true;
                    new AdWebEventLogger(c1035880d3y3).logAd(C1039870dAP.LIZ, c1035880d3y3.getAwemeRawAd());
                }
                Keva.getRepo("RecordingOneTimeNotice").storeBoolean("has_notify", z2);
            }
        }
        InterfaceC1036210d4V interfaceC1036210d4V = c1039440d9i.LJIIIIZZ;
        if (interfaceC1036210d4V != null) {
            interfaceC1036210d4V.LJ();
        }
        SparkContext sparkContext3 = this.adWebViewExtension.LIZIZ;
        if (sparkContext3 != null && (interfaceC1038430d85 = (InterfaceC1038430d85) sparkContext3.LJFF(InterfaceC1038430d85.class)) != null) {
            interfaceC1038430d85.LIZ(C1039990dAb.LIZIZ);
        }
        if (!C1039700dA8.LJII(this.adWebViewExtension.LIZ) && !C1035990d49.LJFF(str) && str != null && (c1040740dBo = this.adWebViewExtension.LIZLLL) != null) {
            AwS132S1200000_16 awS132S1200000_16 = new AwS132S1200000_16(this, webView, str, 4);
            AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(this, webView, str, 34);
            if (!Intrinsics.LJFF(str, c1040740dBo.LLJI) && C1040740dBo.LJJLIIIJ(str) && C1040740dBo.LJJLIIIJ(c1040740dBo.LLJI) && ((Boolean) C0AU0.LIZ.getValue()).booleanValue()) {
                String str2 = c1040740dBo.LLJI;
                try {
                    Uri uri = UriProtector.parse(str);
                    Uri uri2 = UriProtector.parse(str2);
                    if (Intrinsics.LJFF(uri.getScheme(), uri2.getScheme()) && Intrinsics.LJFF(uri.getHost(), uri2.getHost())) {
                        if (Intrinsics.LJFF(uri.getPath(), uri2.getPath())) {
                            c1040740dBo.LJJZ(str);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (!Intrinsics.LJFF(c1040740dBo.LLJI, str)) {
                awS417S0200000_16.invoke();
            } else {
                c1040740dBo.LJJZZI(awS132S1200000_16, webView);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0238 A[EDGE_INSN: B:127:0x022c->B:128:0x0238 BREAK  A[LOOP:0: B:120:0x0202->B:188:0x0202]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0275 A[PHI: r13
      0x0275: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:157:0x0295, B:147:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ea  */
    @Override // X.InterfaceC2206021BVo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r28, android.webkit.WebResourceRequest r29) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [X.0dCq] */
    public final void handleShopifyCheckoutUrlLoad(final WebView webView, String str, WebResourceRequest webResourceRequest) {
        String strLJIILJJIL;
        boolean zLJFF;
        h8.b bVar;
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        long jLongValue;
        AwemeRawAd awemeRawAd2;
        LandingPageConfig landingPageConfig;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        View checkoutComponent;
        WebSettings settings;
        ShopifyCheckoutEntity shopifyData;
        String strLIZ = str;
        final C1039440d9i c1039440d9i = this.adWebViewExtension;
        C1035880d3y c1035880d3y = c1039440d9i.LIZ;
        c1039440d9i.LJJIIZ().LIZIZ = strLIZ;
        C1040740dBo c1040740dBo = c1039440d9i.LIZLLL;
        Boolean boolValueOf = null;
        if (c1040740dBo != null && C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
            AwemeRawAd awemeRawAd3 = c1040740dBo.LL.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                shopifyData = awemeRawAd3.getShopifyData();
            } else {
                shopifyData = null;
            }
            AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1040740dBo.LL);
            C1043510dGH.LIZ.getClass();
            adWebEventLogger.logAd(C1043510dGH.LJJIJ, c1040740dBo.LL.getRealCreativeIdStr(), c1040740dBo.LL.getRealLogExtra(), null, new AwS382S0200000_16(shopifyData, c1040740dBo, 30));
        }
        InterfaceC1036210d4V interfaceC1036210d4V = c1039440d9i.LJIIIIZZ;
        if (interfaceC1036210d4V != null && (checkoutComponent = interfaceC1036210d4V.getCheckoutComponent()) != null && (checkoutComponent instanceof C1054420dXs)) {
            final C1054420dXs c1054420dXs = (C1054420dXs) checkoutComponent;
            c1054420dXs.setAdWebLogManager(c1039440d9i.LIZLLL);
            C1054340dXk c1054340dXk = c1039440d9i.LJJI;
            if (c1054340dXk == null) {
                c1054340dXk = new C1054340dXk(webView, c1054420dXs, Boolean.valueOf(((Boolean) C257700A8a.LIZ.getValue()).booleanValue()), new InterfaceC1054310dXh() { // from class: X.0dCq
                    @Override // X.InterfaceC1054310dXh
                    public final void LIZJ() {
                        C1023960ckk c1023960ckk;
                        boolean z = c1039440d9i.LJJIIZ().LIZLLL == ProgressButtonStage.Review;
                        C1040740dBo c1040740dBo2 = c1039440d9i.LIZLLL;
                        if (c1040740dBo2 != null) {
                            Boolean boolValueOf2 = Boolean.valueOf(z);
                            if (C1040740dBo.LJJLIIIIJ(c1040740dBo2.LL)) {
                                AwemeRawAd awemeRawAd4 = c1040740dBo2.LL.getAwemeRawAd();
                                ShopifyCheckoutEntity shopifyData2 = awemeRawAd4 != null ? awemeRawAd4.getShopifyData() : null;
                                if (Intrinsics.LJFF(boolValueOf2, Boolean.TRUE)) {
                                    C1043510dGH.LIZ.getClass();
                                    c1023960ckk = C1043510dGH.LJJIZ;
                                } else {
                                    C1043510dGH.LIZ.getClass();
                                    c1023960ckk = C1043510dGH.LJJIL;
                                }
                                new AdWebEventLogger(c1040740dBo2.LL).logAd(c1023960ckk, c1040740dBo2.LL.getRealCreativeIdStr(), c1040740dBo2.LL.getRealLogExtra(), null, new AwS382S0200000_16(shopifyData2, c1040740dBo2, 31));
                            }
                        }
                    }

                    @Override // X.InterfaceC1054310dXh
                    public final void LIZ(String str2) {
                        ShopifyCheckoutEntity shopifyData2;
                        String str3 = c1039440d9i.LJJIIZ().LJ;
                        C1040740dBo c1040740dBo2 = c1039440d9i.LIZLLL;
                        if (c1040740dBo2 != null && C1040740dBo.LJJLIIIIJ(c1040740dBo2.LL)) {
                            AwemeRawAd awemeRawAd4 = c1040740dBo2.LL.getAwemeRawAd();
                            if (awemeRawAd4 != null) {
                                shopifyData2 = awemeRawAd4.getShopifyData();
                            } else {
                                shopifyData2 = null;
                            }
                            AdWebEventLogger adWebEventLogger2 = new AdWebEventLogger(c1040740dBo2.LL);
                            C1043510dGH.LIZ.getClass();
                            adWebEventLogger2.logAd(C1043510dGH.LJJIJLIJ, c1040740dBo2.LL.getRealCreativeIdStr(), c1040740dBo2.LL.getRealLogExtra(), null, new AwS23S2200000_16(shopifyData2, c1040740dBo2, str2, str3, 2));
                        }
                    }

                    @Override // X.InterfaceC1054310dXh
                    public final void LIZIZ(ProgressButtonStage progressButtonStage, String str2) {
                        boolean z;
                        SparkContext sparkContext;
                        InterfaceC1041400dCs interfaceC1041400dCs;
                        ShopifyCheckoutEntity shopifyData2;
                        C1023960ckk c1023960ckk;
                        if (progressButtonStage == ProgressButtonStage.Review) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str3 = c1039440d9i.LJJIIZ().LJ;
                        C1040740dBo c1040740dBo2 = c1039440d9i.LIZLLL;
                        if (c1040740dBo2 != null && C1040740dBo.LJJLIIIIJ(c1040740dBo2.LL)) {
                            AwemeRawAd awemeRawAd4 = c1040740dBo2.LL.getAwemeRawAd();
                            if (awemeRawAd4 != null) {
                                shopifyData2 = awemeRawAd4.getShopifyData();
                            } else {
                                shopifyData2 = null;
                            }
                            if (z) {
                                C1043510dGH.LIZ.getClass();
                                c1023960ckk = C1043510dGH.LJJIJIL;
                            } else {
                                C1043510dGH.LIZ.getClass();
                                c1023960ckk = C1043510dGH.LJJIJL;
                            }
                            new AdWebEventLogger(c1040740dBo2.LL).logAd(c1023960ckk, c1040740dBo2.LL.getRealCreativeIdStr(), c1040740dBo2.LL.getRealLogExtra(), null, new AwS23S2200000_16(shopifyData2, c1040740dBo2, str2, str3, 1));
                        }
                        if (!z && (sparkContext = c1039440d9i.LIZIZ) != null && (interfaceC1041400dCs = (InterfaceC1041400dCs) sparkContext.LJFF(InterfaceC1041400dCs.class)) != null) {
                            interfaceC1041400dCs.LIZLLL(null);
                        }
                    }

                    @Override // X.InterfaceC1054310dXh
                    public final void LIZLLL(CheckoutBtnState checkoutBtnState, ProgressButtonStage progressButtonStage) {
                        c1039440d9i.LJJIIZ().LIZLLL = progressButtonStage;
                        c1054420dXs.LJ(checkoutBtnState, progressButtonStage);
                    }

                    @Override // X.InterfaceC1054310dXh
                    public final void LJI(String str2, String str3, CartInfo cartInfo) {
                        ShopifyCheckoutEntity shopifyData2;
                        c1039440d9i.LJJIIZ().LJ = str3;
                        c1054420dXs.LJFF(cartInfo);
                        C1040740dBo c1040740dBo2 = c1039440d9i.LIZLLL;
                        if (c1040740dBo2 != null && C1040740dBo.LJJLIIIIJ(c1040740dBo2.LL)) {
                            AwemeRawAd awemeRawAd4 = c1040740dBo2.LL.getAwemeRawAd();
                            if (awemeRawAd4 != null) {
                                shopifyData2 = awemeRawAd4.getShopifyData();
                            } else {
                                shopifyData2 = null;
                            }
                            AdWebEventLogger adWebEventLogger2 = new AdWebEventLogger(c1040740dBo2.LL);
                            C1043510dGH.LIZ.getClass();
                            adWebEventLogger2.logAd(C1043510dGH.LJJJI, c1040740dBo2.LL.getRealCreativeIdStr(), c1040740dBo2.LL.getRealLogExtra(), null, new AwS23S2200000_16(shopifyData2, c1040740dBo2, str2, str3, 3));
                        }
                    }

                    @Override // X.InterfaceC1054310dXh
                    public final void LJII(Integer num, Integer num2, String str2) {
                        C1041370dCp c1041370dCp = new C1041370dCp(num, num2, str2);
                        C1041360dCo c1041360dCo = C1041360dCo.LIZ;
                        WebView webView2 = webView;
                        C1039580d9w c1039580d9wLJJIIZ = c1039440d9i.LJJIIZ();
                        C1039440d9i c1039440d9i2 = c1039440d9i;
                        C1035880d3y c1035880d3y2 = c1039440d9i2.LIZ;
                        C1040740dBo c1040740dBo2 = c1039440d9i2.LIZLLL;
                        c1041360dCo.getClass();
                        C1041360dCo.LIZJ(webView2, c1039580d9wLJJIIZ, c1035880d3y2, c1040740dBo2, c1041370dCp);
                    }

                    @Override // X.InterfaceC1054310dXh
                    public final void LJFF(Integer num, Integer num2, String str2, String str3) {
                        ShopifyCheckoutEntity shopifyData2;
                        C1040740dBo c1040740dBo2 = c1039440d9i.LIZLLL;
                        if (c1040740dBo2 != null && C1040740dBo.LJJLIIIIJ(c1040740dBo2.LL)) {
                            AwemeRawAd awemeRawAd4 = c1040740dBo2.LL.getAwemeRawAd();
                            if (awemeRawAd4 != null) {
                                shopifyData2 = awemeRawAd4.getShopifyData();
                            } else {
                                shopifyData2 = null;
                            }
                            AdWebEventLogger adWebEventLogger2 = new AdWebEventLogger(c1040740dBo2.LL);
                            C1043510dGH.LIZ.getClass();
                            adWebEventLogger2.logAd(C1043510dGH.LJJIJIIJIL, c1040740dBo2.LL.getRealCreativeIdStr(), c1040740dBo2.LL.getRealLogExtra(), null, new AwS5S2400000_16(shopifyData2, c1040740dBo2, num, num2, str2, str3, 0));
                        }
                    }

                    @Override // X.InterfaceC1054310dXh
                    public final void LJ(String str2, String str3, String str4, String str5, String str6) {
                        ShopifyCheckoutEntity shopifyData2;
                        C1040740dBo c1040740dBo2 = c1039440d9i.LIZLLL;
                        if (c1040740dBo2 != null && C1040740dBo.LJJLIIIIJ(c1040740dBo2.LL)) {
                            AwemeRawAd awemeRawAd4 = c1040740dBo2.LL.getAwemeRawAd();
                            if (awemeRawAd4 != null) {
                                shopifyData2 = awemeRawAd4.getShopifyData();
                            } else {
                                shopifyData2 = null;
                            }
                            AdWebEventLogger adWebEventLogger2 = new AdWebEventLogger(c1040740dBo2.LL);
                            C1043510dGH.LIZ.getClass();
                            adWebEventLogger2.logAd(C1043510dGH.LJJJ, c1040740dBo2.LL.getRealCreativeIdStr(), c1040740dBo2.LL.getRealLogExtra(), null, new C1041390dCr(shopifyData2, c1040740dBo2, str4, str2, str3, str5, str6));
                        }
                    }
                });
                c1039440d9i.LJJI = c1054340dXk;
            }
            String userAgentString = webView.getSettings().getUserAgentString();
            String strLIZ2 = C1128504bD.LIZ();
            c1039440d9i.LJJIIZ().LIZJ = C1128504bD.LIZ();
            if (!a0.LJJIIZI(userAgentString, strLIZ2, false)) {
                C1039800dAI c1039800dAI = c1054340dXk.LJ;
                c1039800dAI.getClass();
                new ShopifyCheckoutMessageBridge(c1039800dAI.LIZ, c1039800dAI.LIZLLL);
                C1051120dSY c1051120dSY = c1039800dAI.LIZJ;
                c1051120dSY.LIZJ = new C1040050dAh(c1039800dAI.LIZIZ);
                String strLIZ3 = C1128504bD.LIZ();
                String str2 = c1051120dSY.LIZIZ;
                if (str2 == null || !a0.LJJIIZI(str2, strLIZ3, false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1051120dSY.LIZIZ);
                    sbLIZ.append(' ');
                    sbLIZ.append(strLIZ3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    WebView webView2 = c1051120dSY.LIZ;
                    if (webView2 != null && (settings = webView2.getSettings()) != null) {
                        C786410Ut5.se(settings, strLIZIZ);
                    }
                }
            }
        }
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C1948707kD.LIZ().getApplicationContext())) == null) {
            strLJIILJJIL = "";
        }
        C1039720dAA c1039720dAA = this.adWebViewExtension.LJJIFFI;
        if (c1039720dAA != null) {
            zLJFF = Intrinsics.LJFF(c1039720dAA.LIZJ, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (c1035880d3y != null && (awemeRawAd2 = c1035880d3y.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd2.getLandingPageConfig()) != null) {
            boolValueOf = Boolean.valueOf(landingPageConfig.strictUsePureLink);
        }
        if (zLJFF && !Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            strLIZ = C2215608mA.LIZ(strLIZ, "local", strLJIILJJIL);
        }
        if (zLJFF) {
            bVar = h8.b.C0038b.LIZ;
        } else {
            bVar = h8.b.a.LIZ;
        }
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
            h8 h8VarLIZ = h8.a.LIZ(creativeIdStr);
            C1040230dAz c1040230dAz = new C1040230dAz(webView, zLJFF, webResourceRequest, strLIZ, this, c1035880d3y);
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            ShopifyCheckoutTokenResponse shopifyCheckoutTokenResponse = h8VarLIZ.LLILLL;
            if (shopifyCheckoutTokenResponse != null) {
                Long l = shopifyCheckoutTokenResponse.expireAtTimeStamp;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue > jCurrentTimeMillis) {
                    c1040230dAz.invoke(new b9(h8.LIZ(bVar, h8VarLIZ.LLILLL)));
                    return;
                }
            }
            h8VarLIZ.LIZIZ(new AwS225S0300000_16(c1040230dAz, h8VarLIZ, bVar, 11));
            return;
        }
        C786410Ut5.ue(webView, strLIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x04f8, code lost:
    
        if (r0 != null) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0194  */
    @Override // X.InterfaceC2206021BVo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageStarted(android.webkit.WebView r27, java.lang.String r28, android.graphics.Bitmap r29) {
        /*
            Method dump skipped, instruction units count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override // X.InterfaceC2206021BVo
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string;
        String string2;
        CharSequence description;
        String string3;
        String string4;
        CharSequence description2;
        if (webResourceRequest == null) {
            return;
        }
        Integer numValueOf = null;
        if (!webResourceRequest.isForMainFrame()) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                string3 = url.toString();
            } else {
                string3 = null;
            }
            if (webResourceError != null && (description2 = webResourceError.getDescription()) != null) {
                string4 = description2.toString();
            } else {
                string4 = null;
                if (webResourceError != null) {
                }
                handleReceivedResourcesError(webView, string3, string4, numValueOf, false);
                return;
            }
            numValueOf = Integer.valueOf(webResourceError.getErrorCode());
            handleReceivedResourcesError(webView, string3, string4, numValueOf, false);
            return;
        }
        Uri url2 = webResourceRequest.getUrl();
        if (url2 != null) {
            string = url2.toString();
        } else {
            string = null;
        }
        if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
            string2 = description.toString();
        } else {
            string2 = null;
            if (webResourceError != null) {
            }
            handleReceivedError(webView, string, string2, numValueOf, null);
        }
        numValueOf = Integer.valueOf(webResourceError.getErrorCode());
        handleReceivedError(webView, string, string2, numValueOf, null);
    }

    @Override // X.InterfaceC2206021BVo
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String string;
        String reasonPhrase;
        String string2;
        String reasonPhrase2;
        if (webResourceRequest == null) {
            return;
        }
        Integer numValueOf = null;
        if (!webResourceRequest.isForMainFrame()) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                string2 = url.toString();
            } else {
                string2 = null;
            }
            if (webResourceResponse != null) {
                reasonPhrase2 = webResourceResponse.getReasonPhrase();
                numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
            } else {
                reasonPhrase2 = null;
            }
            handleReceivedResourcesError(webView, string2, reasonPhrase2, numValueOf, true);
            return;
        }
        if (!webResourceRequest.isForMainFrame()) {
            return;
        }
        Uri url2 = webResourceRequest.getUrl();
        if (url2 != null) {
            string = url2.toString();
        } else {
            string = null;
        }
        if (webResourceResponse != null) {
            reasonPhrase = webResourceResponse.getReasonPhrase();
            numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
        } else {
            reasonPhrase = null;
        }
        handleReceivedError(webView, string, reasonPhrase, numValueOf, webResourceResponse);
    }

    @Override // X.InterfaceC2206021BVo
    public boolean onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Integer numValueOf;
        String url;
        int primaryError;
        SslCertificate certificate;
        C1035880d3y c1035880d3y = this.adWebViewExtension.LIZ;
        if (c1035880d3y != null && c1035880d3y.getIgnoreSslErrorOnce()) {
            C1035880d3y c1035880d3y2 = this.adWebViewExtension.LIZ;
            if (c1035880d3y2 != null) {
                c1035880d3y2.setIgnoreSslErrorOnce(false);
            }
            if (sslErrorHandler != null) {
                sslErrorHandler.proceed();
            }
            return true;
        }
        String string = null;
        if (sslError != null) {
            numValueOf = Integer.valueOf(sslError.getPrimaryError());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && (numValueOf.intValue() != 3 ? !(numValueOf == null || (numValueOf.intValue() != 0 ? numValueOf == null || (numValueOf.intValue() != 1 ? numValueOf.intValue() != 2 ? numValueOf.intValue() != 4 ? numValueOf.intValue() != 5 || (C217500sf.LIZ() & 32) == 0 : (C217500sf.LIZ() & 16) == 0 : (C217500sf.LIZ() & 8) == 0 : (C217500sf.LIZ() & 4) == 0) : (C217500sf.LIZ() & 2) == 0)) : (C217500sf.LIZ() & 1) != 0)) {
            if (sslErrorHandler != null) {
                sslErrorHandler.proceed();
            }
            return true;
        }
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        if (sslError != null && (certificate = sslError.getCertificate()) != null) {
            string = certificate.toString();
        }
        if (sslError != null) {
            primaryError = sslError.getPrimaryError();
        } else {
            primaryError = 9999;
        }
        handleReceivedError(webView, url, string, Integer.valueOf(primaryError), null);
        return false;
    }

    private final void checkBocRule(C1035880d3y c1035880d3y, String str, String str2, WebView webView) {
        InterfaceC1035480d3K bocRuleMatcher;
        String str3 = this.adWebViewExtension.LJJIII.LIZIZ;
        if (c1035880d3y != null && (bocRuleMatcher = c1035880d3y.getBocRuleMatcher()) != null) {
            bocRuleMatcher.LIZ(this.adWebViewExtension.LIZIZ, str, str2, webView, str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c8  */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.1DXV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean innerShouldOverrideUrlLoading(android.webkit.WebView r28, final java.lang.String r29, android.webkit.WebResourceRequest r30, java.lang.Boolean r31) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient.innerShouldOverrideUrlLoading(android.webkit.WebView, java.lang.String, android.webkit.WebResourceRequest, java.lang.Boolean):boolean");
    }

    @Override // X.InterfaceC2206021BVo
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        handleReceivedError(webView, str2, str, Integer.valueOf(i), null);
    }

    @Override // X.InterfaceC2206021BVo
    public boolean shouldOverrideUrlLoading(WebView webView, String str, WebResourceRequest webResourceRequest, Boolean bool) {
        String str2;
        boolean zInnerShouldOverrideUrlLoading = innerShouldOverrideUrlLoading(webView, str, webResourceRequest, bool);
        if (!zInnerShouldOverrideUrlLoading) {
            this.adWebViewExtension.LJJIII.LIZ(str, EnumC1039530d9r.SHOULD_OVERRIDE_URL_LOADING, webView);
            C1035880d3y c1035880d3y = this.adWebViewExtension.LIZ;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            checkBocRule(c1035880d3y, str2, "load_url", webView);
            C0WT9.LIZ.getClass();
            C0WT9.LIZLLL(str);
        }
        return zInnerShouldOverrideUrlLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, java.lang.String] */
    private final void handleReceivedError(WebView webView, String str, String str2, Integer num, WebResourceResponse webResourceResponse) {
        int iIntValue;
        boolean z;
        C1035890d3z adCommonData;
        int i;
        FeatureCenterModel feature;
        String str3;
        Map<String, String> responseHeaders;
        InterfaceC1038430d85 interfaceC1038430d85;
        InterfaceC1036190d4T interfaceC1036190d4T;
        String str4 = "";
        SparkContext sparkContext = this.adWebViewExtension.LIZIZ;
        if (sparkContext != null && (interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext.LJFF(InterfaceC1036190d4T.class)) != null) {
            interfaceC1036190d4T.setPullRefreshPageLoading(false);
        }
        if (webView != null && str != null) {
            C1039440d9i c1039440d9i = this.adWebViewExtension;
            C1035880d3y c1035880d3y = c1039440d9i.LIZ;
            SparkContext sparkContext2 = c1039440d9i.LIZIZ;
            if (sparkContext2 != null && (interfaceC1038430d85 = (InterfaceC1038430d85) sparkContext2.LJFF(InterfaceC1038430d85.class)) != null) {
                interfaceC1038430d85.LIZ(C1039980dAa.LIZIZ);
            }
            if (C1035990d49.LJFF(str)) {
                return;
            }
            handleFail();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 999999;
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = str2;
            List<String> list = this.failMsgCheckList;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    if (str2 != 0 && a0.LJJIIZI(str2, next, false)) {
                        updateFailModel(c1035880d3y, next);
                        break;
                    }
                }
            }
            Long l = null;
            try {
                if (!this.failResponseCheckMap.isEmpty()) {
                    Iterator<Map.Entry<String, JSONObject>> it3 = this.failResponseCheckMap.entrySet().iterator();
                    String str5 = "";
                    while (true) {
                        try {
                            if (it3.hasNext()) {
                                Map.Entry<String, JSONObject> next2 = it3.next();
                                String key = next2.getKey();
                                JSONObject value = next2.getValue();
                                try {
                                    Iterator<String> itKeys = value.keys();
                                    while (itKeys.hasNext()) {
                                        String next3 = itKeys.next();
                                        if (webResourceResponse != null && (responseHeaders = webResourceResponse.getResponseHeaders()) != null) {
                                            str3 = responseHeaders.get(next3);
                                        } else {
                                            str3 = null;
                                        }
                                        if (!Intrinsics.LJFF(str3, value.optString(next3))) {
                                            key = "";
                                        }
                                    }
                                    if (!C123100dR.LIZ(key)) {
                                        str5 = key;
                                    } else {
                                        str4 = key;
                                        break;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    str4 = key;
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } else {
                                str4 = str5;
                                break;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str4 = str5;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (C123100dR.LIZ(str4)) {
                updateFailModel(c1035880d3y, str4);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) c259800zU.element);
                sbLIZ.append(' ');
                sbLIZ.append(str4);
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
            }
            C1040740dBo c1040740dBo = this.adWebViewExtension.LIZLLL;
            if (c1040740dBo != null) {
                String str6 = (String) c259800zU.element;
                C1039790dAH c1039790dAH = new C1039790dAH(this, webView, str, iIntValue, c259800zU);
                if (!Intrinsics.LJFF(str, c1040740dBo.LLJI)) {
                    c1040740dBo.LLJJ = false;
                }
                if (c1040740dBo.LLJJ) {
                    if (C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
                        new AdWebEventLogger(c1040740dBo.LL).logAd(C2265561Dly.LIZ, c1040740dBo.LL.getAwemeRawAd(), new AwS7S1001000_16(iIntValue, str6, 4));
                    }
                    z = true;
                } else {
                    c1040740dBo.LLJJIJI = new C1040210dAx(str);
                    long jCurrentTimeMillis = System.currentTimeMillis() - c1040740dBo.LL.getWebInitTime();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - c1040740dBo.LLJILJILJ;
                    z = true;
                    c1040740dBo.LJJZZIII(webView, false, Integer.valueOf(iIntValue), str6, Integer.valueOf(c1040740dBo.LLJJIJIL));
                    AwemeRawAd awemeRawAd = c1040740dBo.LL.getAwemeRawAd();
                    if (awemeRawAd != null && (feature = awemeRawAd.getFeature()) != null) {
                        l = feature.pricingType;
                    }
                    if (C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
                        c1040740dBo.LL.getWebLoadStatusModel().setLoadingStatus(2);
                        c1040740dBo.LLILZIL = !c1040740dBo.LLILZ ? 1 : 0;
                        new AdWebEventLogger(c1040740dBo.LL).logAd(C1E1P.LIZ, c1040740dBo.LL.getRealCreativeIdStr(), c1040740dBo.LL.getRealLogExtra(), null, new C1E1Q(c1040740dBo, webView, jCurrentTimeMillis, jCurrentTimeMillis2, str6, iIntValue, l));
                        c1040740dBo.LLILZ = true;
                    }
                    if (C1040740dBo.LJJLIIIJILLIZJL(c1040740dBo.LL)) {
                        C1040580dBY c1040580dBY = new C1040580dBY(c1040740dBo.LL);
                        C1040750dBp.LIZ.getClass();
                        c1040580dBY.log(C1040750dBp.LJFF, new C1039770dAF(c1040740dBo, jCurrentTimeMillis, jCurrentTimeMillis2, str6, iIntValue, webView));
                        c1040740dBo.LLILZ = true;
                        i = 2;
                        c1040740dBo.LL.getWebLoadStatusModel().setLoadingStatus(2);
                    } else {
                        i = 2;
                    }
                    c1039790dAH.invoke();
                    C1039550d9t.LIZIZ = c1040740dBo.LL;
                    C1039550d9t.LIZJ = c1040740dBo.LLILLL;
                    C1039550d9t.LIZLLL = i;
                    C1039550d9t.LJ = c1040740dBo.LLJI;
                    C1039550d9t.LJFF = Integer.valueOf(c1040740dBo.LLJJIJIL);
                    c1040740dBo.LL.setHadLog(Boolean.TRUE);
                    c1040740dBo.LLJJ = true;
                    c1040740dBo.LL.setHasPageStart(0);
                }
            } else {
                z = true;
            }
            if (c1035880d3y != null && (adCommonData = c1035880d3y.getAdCommonData()) != null) {
                adCommonData.setHasLoadFinishOrError(z);
            }
        }
    }

    private final void handleReceivedResourcesError(WebView webView, String str, String str2, Integer num, boolean z) {
        int iIntValue;
        Long l;
        FeatureCenterModel feature;
        C1035890d3z adCommonData;
        if (webView == null || str == null || C1035990d49.LJFF(str)) {
            return;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 999999;
        }
        if (z) {
            WebResourcesLoadReportSwitchModel webResourcesLoadReportSwitchModelLIZ = C1039930dAV.LIZ();
            if (webResourcesLoadReportSwitchModelLIZ.enableResourcesNativeHttpErrorReport) {
                if (webResourcesLoadReportSwitchModelLIZ.nativeHttpErrorSamplingRate != 0 && System.currentTimeMillis() % ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= webResourcesLoadReportSwitchModelLIZ.nativeHttpErrorSamplingRate) {
                    return;
                }
            } else {
                return;
            }
        } else {
            WebResourcesLoadReportSwitchModel webResourcesLoadReportSwitchModelLIZ2 = C1039930dAV.LIZ();
            if (!webResourcesLoadReportSwitchModelLIZ2.enableResourcesNativeNetErrorReport || webResourcesLoadReportSwitchModelLIZ2.nativeNetErrorSamplingRate == 0 || System.currentTimeMillis() % ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= webResourcesLoadReportSwitchModelLIZ2.nativeNetErrorSamplingRate) {
                return;
            }
        }
        C1035880d3y c1035880d3y = this.adWebViewExtension.LIZ;
        if (c1035880d3y != null && (adCommonData = c1035880d3y.getAdCommonData()) != null) {
            adCommonData.setHasLoadFinishOrError(true);
        }
        C1040740dBo c1040740dBo = this.adWebViewExtension.LIZLLL;
        if (c1040740dBo != null && C1040740dBo.LJJLIIIIJ(c1040740dBo.LL)) {
            c1040740dBo.LL.getWebLoadStatusModel().setLoadingStatus(2);
            c1040740dBo.LLILZIL = !c1040740dBo.LLILZ ? 1 : 0;
            long jCurrentTimeMillis = System.currentTimeMillis() - c1040740dBo.LLJILJILJ;
            AwemeRawAd awemeRawAd = c1040740dBo.LL.getAwemeRawAd();
            if (awemeRawAd != null && (feature = awemeRawAd.getFeature()) != null) {
                l = feature.pricingType;
            } else {
                l = null;
            }
            new AdWebEventLogger(c1040740dBo.LL).logAd(C1E1T.LIZ, c1040740dBo.LL.getRealCreativeIdStr(), c1040740dBo.LL.getRealLogExtra(), null, new C1E1R(z ? 1 : 0, jCurrentTimeMillis, c1040740dBo, webView, str2, iIntValue, l));
        }
    }
}
