package com.ss.android.ugc.aweme.web.utils;

import X.AbstractC1028360crq;
import X.AbstractC1043220dFo;
import X.C04S6;
import X.C08HX;
import X.C098200Yq;
import X.C0C64;
import X.C0PEM;
import X.C0WOV;
import X.C1001830cB3;
import X.C1002480cC6;
import X.C1002490cC7;
import X.C1014230cV3;
import X.C1017070cZd;
import X.C1017180cZo;
import X.C1017200cZq;
import X.C1017230cZt;
import X.C1017520caM;
import X.C1025720cna;
import X.C1026310coX;
import X.C1026350cob;
import X.C1028100crQ;
import X.C1028380crs;
import X.C1029740cu4;
import X.C1030680cva;
import X.C1035690d3f;
import X.C1035740d3k;
import X.C1035770d3n;
import X.C1035790d3p;
import X.C1035800d3q;
import X.C1035840d3u;
import X.C1035880d3y;
import X.C1035890d3z;
import X.C1035900d40;
import X.C1035910d41;
import X.C1035920d42;
import X.C1035930d43;
import X.C1035990d49;
import X.C1037010d5n;
import X.C1037200d66;
import X.C1037210d67;
import X.C1037380d6O;
import X.C1039440d9i;
import X.C1040110dAn;
import X.C1040450dBL;
import X.C1040460dBM;
import X.C1042040dDu;
import X.C1042680dEw;
import X.C1047720dN4;
import X.C1051290dSp;
import X.C1061730djf;
import X.C1067990dtl;
import X.C1069080dvW;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1533900q1E;
import X.C1544770qIl;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C1EKI;
import X.C1ET2;
import X.C2188811AlT;
import X.C2266801Dny;
import X.C23250099c;
import X.C266560AcY;
import X.C275520Ar0;
import X.C291640Bbu;
import X.C397901gf;
import X.C416901jj;
import X.C786410Ut5;
import X.C793770VBv;
import X.C805380Via;
import X.C817503Hh;
import X.EnumC1000680c9C;
import X.EnumC1027220cq0;
import X.EnumC1036160d4Q;
import X.EnumC1036690d5H;
import X.EnumC1037150d61;
import X.EnumC1039490d9n;
import X.InterfaceC1008930cMV;
import X.InterfaceC1017210cZr;
import X.InterfaceC1030370cv5;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036110d4L;
import X.InterfaceC1036270d4b;
import X.InterfaceC1040070dAj;
import X.InterfaceC1541990qEH;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.crash.Npth;
import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cct.IOpenCCTUtils;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebMultiTabModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebRecordingModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.FailMsgModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.pip.IAdWebPipService;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.AdWebSparkService;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.model.JumpTargetPageConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FinalJumpTargetPageConfig;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.log.IAdWebLogService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import com.ss.android.ugc.aweme.web.experiment.AdLandPageSSPOptSettingV2Model;
import com.ss.android.ugc.aweme.web.experiment.OptIABLoadFailExp;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import defpackage.h8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebUtils implements IAdWebUtils {
    public static WeakReference<Fragment> LIZIZ;
    public long LIZ = System.currentTimeMillis();

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void ev() {
        LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final String dp() {
        return C1014230cV3.LIZ("iab_loading_format_dynamic");
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void Yu() {
        this.LIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void Zu() {
        InterfaceC1017210cZr interfaceC1017210cZr = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class);
        if (interfaceC1017210cZr != null) {
            interfaceC1017210cZr.a01();
        }
    }

    public static Pair LIZJ(AwemeRawAd awemeRawAd) {
        JumpTargetPageConfig jumpTargetPageConfig;
        String clickPosition;
        List<Object> listLIZLLL;
        if (awemeRawAd != null) {
            try {
                AdStyleActionModel adStyleActionModel = awemeRawAd.getAdStyleActionModel();
                if (adStyleActionModel != null && (jumpTargetPageConfig = adStyleActionModel.jumpTargetPageConfig) != null && (clickPosition = jumpTargetPageConfig.getClickPosition()) != null) {
                    JSONObject jSONObject = new JSONObject(clickPosition);
                    JSONArray jSONArrayNames = jSONObject.names();
                    if (jSONArrayNames != null) {
                        listLIZLLL = C08HX.LIZLLL(jSONArrayNames);
                    } else {
                        listLIZLLL = null;
                    }
                    return new Pair(jSONObject, listLIZLLL);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static void LJ(C1035880d3y c1035880d3y) {
        String creativeIdStr;
        c1035880d3y.getResourceModel().setPrefetchTaskMonitor(new InterfaceC1040070dAj() { // from class: X.0d3l
            public volatile AtomicBoolean LIZ = new AtomicBoolean(false);
            public final AtomicInteger LIZIZ = new AtomicInteger(0);

            @Override // X.InterfaceC1040070dAj
            public final void clear() {
                this.LIZ.set(false);
                this.LIZIZ.set(0);
            }

            @Override // X.InterfaceC1040070dAj
            public final void start() {
                this.LIZ.set(true);
            }
        });
        Forest forest = AdWebViewInterceptorService.LIZIZ().LIZ().LIZ;
        C1035900d40 resourceModel = c1035880d3y.getResourceModel();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWeb-");
        sbLIZ.append(UUID.randomUUID());
        C1533900q1E c1533900q1E = new C1533900q1E(forest, C2188811AlT.LIZIZ(sbLIZ), false, 4);
        try {
            c1533900q1E.LJIILJJIL.put("lp_refer", c1035880d3y.getRefer());
            c1533900q1E.LJIILJJIL.put("web_url", c1035880d3y.getUrl());
            JSONObject jSONObject = c1533900q1E.LJIILJJIL;
            AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd != null) {
                creativeIdStr = awemeRawAd.getCreativeIdStr();
            } else {
                creativeIdStr = null;
            }
            jSONObject.put("creative_id", creativeIdStr);
            JSONObject jSONObject2 = c1533900q1E.LJIILJJIL;
            String requestId = c1035880d3y.getRequestId();
            if (requestId == null) {
                requestId = "";
            }
            jSONObject2.put("request_id", requestId);
            c1533900q1E.LJIILJJIL.put("landing_page_style", c1035880d3y.isNineScreen());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        resourceModel.setResourceGroup(c1533900q1E);
    }

    public static void LJFF(C1035880d3y c1035880d3y) {
        String str;
        boolean zIsEnableWebGoogleLogin;
        if (C1030680cva.LJIIL(c1035880d3y.getAwemeRawAd())) {
            str = "splash";
        } else {
            str = "feed";
        }
        ICommerceLandPageService iCommerceLandPageServiceLIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ();
        String url = c1035880d3y.getUrl();
        if (url == null) {
            url = "";
        }
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd != null) {
            zIsEnableWebGoogleLogin = awemeRawAd.isEnableWebGoogleLogin();
        } else {
            zIsEnableWebGoogleLogin = false;
        }
        iCommerceLandPageServiceLIZ.vE0(url, c1035880d3y, zIsEnableWebGoogleLogin, c1035880d3y.getAwemeRawAd(), str, "", c1035880d3y.getRequestId());
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
        String str;
        C1067990dtl.LIZ.getClass();
        if (((Boolean) C1EKI.LIZJ.getValue()).booleanValue()) {
            String containerID = interfaceC1034470d1h.getContainerID();
            SparkContext sparkContext = C1067990dtl.LJIILLIIL;
            if (sparkContext != null) {
                str = sparkContext.containerId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(containerID, str)) {
                C1067990dtl.LJIILLIIL = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean Wu(AwemeRawAd awemeRawAd) {
        if (!((Boolean) C04S6.LIZ.getValue()).booleanValue() || awemeRawAd == null) {
            return false;
        }
        if (!C1017180cZo.LJJIJIIJI(awemeRawAd) && awemeRawAd.getLeftSlideMiddlePageModel() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[PHI: r1
      0x003a: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:20:0x0038, B:16:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Xu(X.C1026310coX r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L46
            X.0crQ r0 = r4.getPopUpCustomConfig()
            if (r0 == 0) goto L46
            java.lang.Boolean r1 = r0.getUseSpecifiedUrl()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        L12:
            r2 = 0
            r1 = 1
            if (r0 != 0) goto L41
            if (r4 == 0) goto L48
            boolean r0 = r4.isFromJsb()
            if (r0 == r1) goto L41
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig r0 = r0.getNativeSiteConfig()
            if (r0 == 0) goto L2e
            java.lang.String r1 = r0.lynxScheme
            if (r1 != 0) goto L3a
        L2e:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
            if (r0 == 0) goto L48
            java.lang.String r1 = r0.getWebUrl()
        L38:
            if (r1 == 0) goto L48
        L3a:
            int r0 = r1.length()
            if (r0 == 0) goto L48
            return r1
        L41:
            java.lang.String r1 = r4.getCustomUrl()
            goto L38
        L46:
            r0 = 0
            goto L12
        L48:
            java.lang.String r0 = "AdLandingPagePopUpImpl getUrl is null"
            X.C2344809Gs.LJ(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.utils.AdWebUtils.Xu(X.0coX):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final String cv(String str) {
        if (str != null) {
            if (str.length() != 0) {
                Uri uri = UriProtector.parse(str);
                if (!uri.isHierarchical()) {
                    return str;
                }
                return C416901jj.LIZJ(uri, C1697810uHb.LJIIJJI("iab_source", "iab_click_time", "landPageShowType")).toString();
            }
            return str;
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void hv(AwemeRawAd awemeRawAd) {
        String creativeIdStr;
        if (awemeRawAd != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
            h8.a.LIZ(creativeIdStr).LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean nr(C1035880d3y c1035880d3y) {
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        if (interfaceC1030370cv5 == null || !interfaceC1030370cv5.nr(c1035880d3y)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean nv(String str) {
        C1017520caM c1017520caMSW0;
        InterfaceC1017210cZr interfaceC1017210cZr = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class);
        if (interfaceC1017210cZr == null || (c1017520caMSW0 = interfaceC1017210cZr.SW0(str)) == null) {
            return false;
        }
        if ((!c1017520caMSW0.LIZIZ && C0C64.LJIILLIIL().LJIJ(31744, 0, "iab_mid_page_banner_style", true) != 0) || !c1017520caMSW0.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final String tv(WebView webView) {
        Object c098200Yq;
        Object obj;
        if (webView == null) {
            return "";
        }
        Object obj2 = null;
        try {
            HashMap<String, Object> extraInfo = WebViewMonitorHelper.getInstance().getExtraInfo(webView);
            if (extraInfo != null) {
                obj = extraInfo.get("navigation_id");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                c098200Yq = (String) obj;
            } else {
                c098200Yq = null;
            }
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        String str = (String) obj2;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void uv(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        String url;
        if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && Intrinsics.LJFF(landingPageConfig.shouldAddUserInteractionRecord, Boolean.TRUE)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c1035880d3y == null || (url = c1035880d3y.getUrl()) == null) {
                url = "";
            }
            linkedHashMap.put("url", url);
            linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
            long jCurrentTimeMillis = System.currentTimeMillis();
            new C1061730djf();
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(linkedHashMap), "ad_webview_close"));
        }
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void Ou(SparkContext sparkContext, Context context) {
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().Ou(sparkContext, context);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final C1035880d3y Ru(AwemeRawAd awemeRawAd, C1035740d3k c1035740d3k) {
        int iIntValue;
        boolean zR42;
        boolean z;
        AwemeRawAd awemeRawAd2;
        NonAdWebModel nonAdWebModel;
        Boolean hideNavBar;
        Integer anchorType;
        Integer numIsPseudoAd = null;
        String initialData = null;
        C1035930d43 c1035930d43LIZIZ = null;
        C1035880d3y c1035880d3y = new C1035880d3y(null, null, null, null, Boolean.FALSE, null, null, null, null, false, false, false, 0, null, CardStruct.IStatusCode.DEFAULT, UUID.randomUUID().toString(), 0, false, System.currentTimeMillis(), "", null, null, null, null, 1, -1, "", "", true, false, false, false, false, null, null, false, false, false, false, false, new C1035890d3z(false, false, false, false, EnumC1037150d61.VISIBLE, EnumC1039490d9n.DEFAULT_SESSION_START, Collections.synchronizedList(new ArrayList()), null, null, false, null, null), 0, 0, null, false, 0, false, false, null, null, null, 1, false, 1, null, 0, 0, System.currentTimeMillis(), 0L, 0L, 0, 0.0f, 0, false, 0, 0, 0, -1, -1, 1, false, 100, true, false, null, false, false, false, false, 0, null, false, false, false, false, true, false, true, false, new C1035910d41(0L, 0L, -1, false), new C1035920d42(EnumC1036690d5H.NORMAL, false), new AdWebRecordingModel(new AtomicInteger(0), new AtomicLong(0L), new AtomicLong(0L), new AtomicBoolean(false)), 0L, -1, false, null, null, new C1035900d40(new ConcurrentHashMap(), null, null, new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicLong(0L)), 0, 0, 1, 0, null, null, false, 0L, false, null, null, false, false, 0, null, null, new PaymentModel(null, null, null, null, null, 0, null), null, null, null, new ArrayList(), new AdWebMultiTabModel(0, 0, 0, 0, 0, 0, 0, 0), false, 0.0f, true, false, false, false, new FailMsgModel(null, 1, 0), false, null, null, 0, false);
        c1035880d3y.setUrl(sv(awemeRawAd, c1035740d3k.url, c1035740d3k.source, c1035740d3k.landpageShowType));
        c1035880d3y.setTitle(c1035740d3k.title);
        c1035880d3y.setCommerceEnterFrom(c1035740d3k.commerceEnterFrom);
        NonAdWebModel nonAdWebModel2 = c1035880d3y.getNonAdWebModel();
        String originalWebUrl = null;
        if (nonAdWebModel2 != null) {
            numIsPseudoAd = nonAdWebModel2.isPseudoAd();
        }
        c1035880d3y.setPseudoAd(numIsPseudoAd);
        NonAdWebModel nonAdWebModel3 = c1035880d3y.getNonAdWebModel();
        if (nonAdWebModel3 != null && (anchorType = nonAdWebModel3.getAnchorType()) != null) {
            iIntValue = anchorType.intValue();
        } else {
            iIntValue = 0;
        }
        c1035880d3y.setAnchorType(iIntValue);
        NonAdWebModel nonAdWebModel4 = c1035880d3y.getNonAdWebModel();
        if (nonAdWebModel4 != null) {
            initialData = nonAdWebModel4.getInitialData();
        }
        c1035880d3y.setInitialData(initialData);
        c1035880d3y.setRefer(c1035740d3k.refer);
        boolean z2 = true;
        if (Intrinsics.LJFF(c1035740d3k.refer, "background_ad_auto_endlayer_screenshot")) {
            c1035880d3y.setPreviewMode(true);
        } else if (Intrinsics.LJFF(c1035740d3k.refer, "feed_ai_pdp_background_open")) {
            c1035880d3y.setFeedBackgroundLoadMode(true);
        }
        c1035880d3y.setForbidJump(c1035740d3k.forbidJump);
        c1035880d3y.setUseWebUrl(c1035740d3k.useWebUrl);
        c1035880d3y.setFromJsb(c1035740d3k.isFromJsb());
        c1035880d3y.setFromTransparentStatusBarPage(c1035740d3k.fromTransparentStatusBarPage);
        c1035880d3y.setContainerId(c1035740d3k.containerId);
        c1035880d3y.setForceShowNavBar(c1035740d3k.forceShowNavBar);
        c1035880d3y.setAwemeRawAd(awemeRawAd);
        c1035880d3y.setAuthorAvatar(c1035740d3k.authorAvatar);
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        if (interfaceC1030370cv5 != null) {
            zR42 = interfaceC1030370cv5.r42(c1035880d3y.getAwemeRawAd());
        } else {
            zR42 = false;
        }
        c1035880d3y.setEnableReuseWeb(zR42);
        c1035880d3y.setAwemeId(c1035740d3k.awemeId);
        c1035880d3y.setAwemeAuthorUid(c1035740d3k.awemeAuthorUid);
        c1035880d3y.setRequestId(c1035740d3k.requestId);
        c1035880d3y.setDisableImmersionBar(c1035740d3k.disableImmersionBar);
        c1035880d3y.setSessionId(UUID.randomUUID().toString());
        LJ(c1035880d3y);
        c1035880d3y.setBocRuleMatcher(new C1042040dDu(c1035880d3y));
        IAdWebPipService iAdWebPipService = (IAdWebPipService) PluggableExtentionKt.pluggableSpi$default(IAdWebPipService.class, false, false, false, 14, null);
        if (iAdWebPipService != null) {
            c1035930d43LIZIZ = iAdWebPipService.LIZIZ(c1035880d3y, c1035740d3k.clickFrom);
        }
        c1035880d3y.setWebPipModel(c1035930d43LIZIZ);
        try {
            Uri uri = UriProtector.parse(c1035880d3y.getUrl());
            c1035880d3y.setHideNavBar(uri.getBooleanQueryParameter("hide_nav_bar", false));
            c1035880d3y.setHideTitleBar(uri.getBooleanQueryParameter("hide_title_bar", false));
            c1035880d3y.setTransStatusBar(uri.getBooleanQueryParameter("trans_status_bar", false));
            c1035880d3y.getAdCommonData().setInstantPage(uri.getBooleanQueryParameter("is_instant_page", false));
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "has_adinfojson");
            String str = "";
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            c1035880d3y.setHasAdInfoJson(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "adinfojson");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            }
            c1035880d3y.setAdInfoJson(str);
            if (!c1035880d3y.getHideTitleBar() && !c1035880d3y.getHideNavBar() && ((nonAdWebModel = c1035880d3y.getNonAdWebModel()) == null || (hideNavBar = nonAdWebModel.getHideNavBar()) == null || !hideNavBar.booleanValue())) {
                z = false;
            } else {
                z = true;
            }
            c1035880d3y.setHideNavBar(z);
            c1035880d3y.setHideTitleBar(c1035880d3y.getHideNavBar());
            if (!c1035880d3y.getHideNavBar() || c1035880d3y.getForceShowNavBar()) {
                z2 = false;
            }
            c1035880d3y.setHideNavBar(z2);
            if (C1037200d66.LIZLLL(c1035880d3y.getAwemeRawAd()) || C1037200d66.LJ(c1035880d3y.getAwemeRawAd())) {
                if (!c1035880d3y.isFromJsb() && (awemeRawAd2 = c1035880d3y.getAwemeRawAd()) != null && Intrinsics.LJFF(awemeRawAd2.isServerRedirection(), Boolean.TRUE)) {
                    AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        originalWebUrl = awemeRawAd3.getOriginalWebUrl();
                    }
                    uri = UriProtector.parse(originalWebUrl);
                }
                c1035880d3y.setUtmParams(C1037200d66.LJI(uri));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        c1035880d3y.setReportAdExtraData(c1035740d3k.reportAdExtraData);
        AiAgentConfig aiAgentConfigLIZ = c1035740d3k.aiAgentConfig;
        if (aiAgentConfigLIZ == null) {
            aiAgentConfigLIZ = C1035990d49.LIZ(c1035880d3y);
        }
        c1035880d3y.setAiAgentConfig(aiAgentConfigLIZ);
        return c1035880d3y;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean Su(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        IAdWebUtils iAdWebUtils;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isDisableLeftSlideFollow() || !C1017070cZd.LL(aweme) || (iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null)) == null || !iAdWebUtils.bv(aweme, str, "slide", false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final FinalJumpTargetPageConfig Uu(AwemeRawAd awemeRawAd, String str) {
        boolean z;
        boolean z2;
        String strValueOf;
        String strValueOf2;
        boolean z3;
        String strOptString;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (awemeRawAd != null && C1017180cZo.LJJIJIIJI(awemeRawAd)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            Pair pairLIZJ = LIZJ(awemeRawAd);
            if (pairLIZJ == null || ((List) pairLIZJ.getSecond()) == null) {
                return null;
            }
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str2 = "other";
            if (z2) {
                strValueOf = "other";
            } else {
                List list = (List) pairLIZJ.getSecond();
                if (list == null) {
                    strValueOf = "other";
                } else {
                    strValueOf = "other";
                    for (Object obj : list) {
                        if (u.LJJIIJZLJL(str, String.valueOf(obj), false)) {
                            strValueOf = String.valueOf(obj);
                        }
                    }
                }
                List list2 = (List) pairLIZJ.getSecond();
                if (list2 != null && list2.contains(strValueOf)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                List list3 = (List) pairLIZJ.getSecond();
                if (list3 == null || !list3.contains("other")) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z4) {
                    if (!z5) {
                        return null;
                    }
                    strValueOf = "other";
                }
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) pairLIZJ.getFirst()).optJSONObject(strValueOf);
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            if (str != null && str.length() != 0) {
                JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
                if (jSONArrayNames == null) {
                    strValueOf2 = "other";
                } else {
                    strValueOf2 = "other";
                    for (Object obj2 : (ArrayList) C08HX.LIZLLL(jSONArrayNames)) {
                        if (u.LJIIZILJ(str, String.valueOf(obj2), false)) {
                            strValueOf2 = String.valueOf(obj2);
                        }
                    }
                }
                JSONArray jSONArrayNames2 = jSONObjectOptJSONObject.names();
                if (jSONArrayNames2 != null && ((ArrayList) C08HX.LIZLLL(jSONArrayNames2)).contains(strValueOf2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                JSONArray jSONArrayNames3 = jSONObjectOptJSONObject.names();
                if (jSONArrayNames3 == null || !((ArrayList) C08HX.LIZLLL(jSONArrayNames3)).contains("other")) {
                    z6 = false;
                }
                if (!z3) {
                    if (!z6) {
                        Gson gson = new Gson();
                        JSONObject jSONObjectOptJSONObject2 = ((JSONObject) pairLIZJ.getFirst()).optJSONObject("other");
                        if (jSONObjectOptJSONObject2 != null) {
                            strOptString = jSONObjectOptJSONObject2.optString("other");
                        } else {
                            strOptString = null;
                        }
                        return (FinalJumpTargetPageConfig) gson.LJII(strOptString, FinalJumpTargetPageConfig.class);
                    }
                } else {
                    str2 = strValueOf2;
                }
            }
            return (FinalJumpTargetPageConfig) new Gson().LJII(jSONObjectOptJSONObject.optString(str2), FinalJumpTargetPageConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean iv(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        Integer num;
        if (aweme == null || aweme.getAwemeRawAd() == null || C1017070cZd.LL(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && C1017180cZo.LJJIJIIJI(awemeRawAd2)) {
            FinalJumpTargetPageConfig finalJumpTargetPageConfigUu = Uu(aweme.getAwemeRawAd(), str);
            if (finalJumpTargetPageConfigUu == null || finalJumpTargetPageConfigUu.getLandingPageBottomBarType() != 1) {
                return false;
            }
            return true;
        }
        if ((!TextUtils.equals(str, C1026350cob.LIZLLL(40)) && !TextUtils.equals(str, C1026350cob.LIZLLL(39)) && !TextUtils.equals(str, C1026350cob.LIZLLL(64))) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null || (num = landingPageConfig.landingPageBottomBarType) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final Fragment jv(C19EG c19eg, Aweme aweme) {
        String webUrl;
        String webTitle;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1008930cMV interfaceC1008930cMVLJ;
        C1017200cZq c1017200cZqLJIL;
        C1017230cZt c1017230cZtLIZ;
        UrlModel urlModelLJ = null;
        if (c19eg == null || aweme == null) {
            return null;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
            webUrl = "";
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 == null || (webTitle = awemeRawAd2.getWebTitle()) == null) {
            webTitle = "";
        }
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        String requestId = aweme.getRequestId();
        IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils != null) {
            urlModelLJ = iAdWebUIUtils.LJ(aweme.getAuthor());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        C1035740d3k c1035740d3k = new C1035740d3k(webUrl, 1, webTitle, "", "", true, "click", false, 0, C2188811AlT.LIZIZ(sbLIZ), false, false, aid, authorUid, requestId, urlModelLJ, true, null, null, null);
        c1035740d3k.setRefer("background_ad_auto_endlayer_screenshot");
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) PluggableExtentionKt.pluggableSpi$default(IAdLandPagePreloadService.class, false, false, false, 14, null);
        if (iAdLandPagePreloadService != null && iAdLandPagePreloadService.N0() != null) {
            String str = c1035740d3k.url;
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            String strLJIIJJI = C1037010d5n.LJIIJJI(awemeRawAd3, str, aid2, true);
            if (strLJIIJJI != null) {
                c1035740d3k.setContainerId(strLJIIJJI);
            }
        }
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1008930cMVLJ = iFeedServiceLIZIZ.LJ()) != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null && (c1017230cZtLIZ = c1017200cZqLJIL.LIZ(aweme.getAwemeRawAd())) != null) {
            c1035740d3k.setUrl(c1017230cZtLIZ.LIZ);
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils != null) {
            return iAdWebUtils.fv(c19eg, aweme, c1035740d3k, EnumC1027220cq0.NORMAL, null);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final C1035690d3f lv(Context context, C1035880d3y c1035880d3y) {
        C1037010d5n.LIZ.getClass();
        return new C1035690d3f(context, C1037010d5n.LJIILL(c1035880d3y), C1037010d5n.LJIIL(c1035880d3y));
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final String p0(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).p0(str, str2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean q0(String str, String str2) {
        return ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).q0(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final String vv(C1035880d3y c1035880d3y, String str) {
        String strLIZ = C1037210d67.LIZ(str, c1035880d3y, false, true, null);
        if (strLIZ == null) {
            return "";
        }
        return strLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0380  */
    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1035880d3y wv(int r160, X.C1026310coX r161) {
        /*
            Method dump skipped, instruction units count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.utils.AdWebUtils.wv(int, X.0coX):X.0d3y");
    }

    public static String LIZ(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (str3.length() != 0) {
                    z3 = false;
                }
                if (!z3) {
                    try {
                        Uri uri = UriProtector.parse(str);
                        if (!UriProtector.getQueryParameterNames(uri).contains(str2)) {
                            Uri.Builder builderBuildUpon = uri.buildUpon();
                            builderBuildUpon.appendQueryParameter(str2, str3);
                            return builderBuildUpon.build().toString();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('(');
                        sbLIZ.append(str2);
                        sbLIZ.append("=[^&]*)");
                        Regex regex = new Regex(C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append('=');
                        sbLIZ2.append(str3);
                        return regex.replaceFirst(str, C2188811AlT.LIZIZ(sbLIZ2));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return str;
    }

    public static void LIZLLL(FrameLayout frameLayout, InterfaceC1034470d1h interfaceC1034470d1h, Function1 function1) {
        if (frameLayout.getVisibility() != 8) {
            C786410Ut5.LJZ(8, frameLayout);
            if (interfaceC1034470d1h != null) {
                interfaceC1034470d1h.LLLIL(null);
            }
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void Qu(WebView webView, AwemeRawAd awemeRawAd, final String str) {
        if (webView != null) {
            C1040110dAn c1040110dAn = C1040110dAn.LL;
            try {
                if (!C1035800d3q.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("window.__autoFillCallback__(");
                    sbLIZ.append(str);
                    sbLIZ.append(",true)");
                    webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), new ValueCallback() { // from class: X.0d3o
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                        }
                    });
                } else {
                    C1544770qIl.LIZ(webView, new AbstractC1043220dFo() { // from class: X.0d3r
                        @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                        public final String LJFF(Uri uri, WebView webView2) {
                            return str;
                        }
                    });
                }
                new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, awemeRawAd, AFwS252S0000000_16.get$arr$(744));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "unknown_error";
                }
                new C1040460dBM(new Object[0]).logAd(C1040450dBL.LIZ, awemeRawAd, new AwS67S1000000_16(message, 51));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean Tu(Aweme aweme, String str, String str2) {
        C1037380d6O.LIZ.getClass();
        return C1037380d6O.LJFF(aweme, str, str2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006f  */
    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.FinalJumpTargetPageConfig Vu(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.utils.AdWebUtils.Vu(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.feed.model.FinalJumpTargetPageConfig");
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final String gv(String str, AwemeRawAd awemeRawAd, Map<String, String> map) {
        C1035880d3y c1035880d3y = new C1035880d3y(awemeRawAd, null, null, null, Boolean.FALSE, null, null, null, null, false, false, false, 0, null, CardStruct.IStatusCode.DEFAULT, UUID.randomUUID().toString(), 0, false, System.currentTimeMillis(), "", null, null, null, null, 1, -1, "", "", true, false, false, false, false, null, null, false, false, false, false, false, new C1035890d3z(false, false, false, false, EnumC1037150d61.VISIBLE, EnumC1039490d9n.DEFAULT_SESSION_START, Collections.synchronizedList(new ArrayList()), null, null, false, null, null), 0, 0, null, false, 0, false, false, null, null, null, 1, false, 1, null, 0, 0, System.currentTimeMillis(), 0L, 0L, 0, 0.0f, 0, false, 0, 0, 0, -1, -1, 1, false, 100, true, false, null, false, false, false, false, 0, null, false, false, false, false, true, false, true, false, new C1035910d41(0L, 0L, -1, false), new C1035920d42(EnumC1036690d5H.NORMAL, false), new AdWebRecordingModel(new AtomicInteger(0), new AtomicLong(0L), new AtomicLong(0L), new AtomicBoolean(false)), 0L, -1, false, null, null, new C1035900d40(new ConcurrentHashMap(), null, null, new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicLong(0L)), 0, 0, 1, 0, null, map, false, 0L, false, null, null, false, false, 0, null, null, new PaymentModel(null, null, null, null, null, 0, null), null, null, null, new ArrayList(), new AdWebMultiTabModel(0, 0, 0, 0, 0, 0, 0, 0), false, 0.0f, true, false, false, false, new FailMsgModel(null, 1, 0), false, null, null, 0, false);
        return C1037200d66.LIZ(vv(c1035880d3y, str), c1035880d3y, "boc", false, true);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final void kv(Activity activity, C1035880d3y c1035880d3y, Function1 function1) {
        Boolean slideFromBottom;
        ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Yu();
        boolean zBooleanValue = false;
        Fragment fragmentLIZIZ = LIZIZ(activity, c1035880d3y, null, false, null);
        Intrinsics.LJFF(c1035880d3y.getCommerceEnterFrom(), "comment_ad");
        NonAdWebModel nonAdWebModel = c1035880d3y.getNonAdWebModel();
        if (nonAdWebModel != null && (slideFromBottom = nonAdWebModel.getSlideFromBottom()) != null) {
            zBooleanValue = slideFromBottom.booleanValue();
        }
        pv(true, activity, fragmentLIZIZ, Boolean.valueOf(zBooleanValue), null, 0, true, true, true, null, function1);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final JSONObject rv(AwemeRawAd awemeRawAd, String str, JSONObject jSONObject) throws JSONException {
        LandingPageConfig landingPageConfig;
        if (awemeRawAd != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && Intrinsics.LJFF(landingPageConfig.shouldAddUserInteractionRecord, Boolean.TRUE)) {
            jSONObject.put("iab_click_time", String.valueOf(this.LIZ));
            jSONObject.put("iab_source", str);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean av(SparkContext sparkContext, C1035880d3y c1035880d3y, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        String creativeIdStr;
        String creativeIdStr2;
        InterfaceC1036110d4L interfaceC1036110d4L;
        int iIntValue;
        C1ET2 c1et2;
        if (OptIABLoadFailExp.LIZJ && (interfaceC1541990qEH instanceof WebKitView) && (c1et2 = (C1ET2) interfaceC1541990qEH) != null) {
            C2266801Dny.LIZ(c1et2.getSettings());
        }
        String str2 = "";
        if (c1035880d3y != null) {
            if (!c1035880d3y.isPreviewMode()) {
                C1067990dtl.LIZ.getClass();
                try {
                    if (C1035790d3p.LIZ()) {
                        boolean zAutofillEnable = c1035880d3y.autofillEnable();
                        Integer numIsAutofillNoneffective = c1035880d3y.isAutofillNoneffective();
                        if (numIsAutofillNoneffective != null) {
                            iIntValue = numIsAutofillNoneffective.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (C1067990dtl.LJII(iIntValue, null, zAutofillEnable)) {
                            if (C0C64.LJIILLIIL().LJIIIZ(31744, "commerce_iframe_inject_first_page_disable_v3", true, false)) {
                                C1047720dN4 c1047720dN4 = C1047720dN4.LIZ;
                                C1544770qIl.LIZJ(C1047720dN4.LIZIZ(c1035880d3y, ""));
                                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1002490cC7(interfaceC1541990qEH, c1035880d3y, null), 2);
                            } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "commerce_iframe_autofill_thread_optimize_enable_v2", true, false)) {
                                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1002480cC6(interfaceC1541990qEH, c1035880d3y, null), 2);
                            } else {
                                C1067990dtl.LJJIJ(interfaceC1541990qEH, c1035880d3y);
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
            String url = c1035880d3y.getUrl();
            if (url != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && landingPageConfig.strictUsePureLink && ((u.LJJIIJZLJL(str, "http://", true) || u.LJJIIJZLJL(str, "https://", true)) && !c1035880d3y.getOnLoadUrlCheck())) {
                c1035880d3y.setOnLoadUrlCheck(true);
                int i = !Intrinsics.LJFF(str, c1035880d3y.getUrl()) ? 1 : 0;
                int i2 = i ^ 1;
                if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                    interfaceC1036110d4L.LJJJJL(i2, str);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("stage", 1);
                    jSONObject.put("origin_url", url);
                    jSONObject.put("current_url", str);
                    AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        creativeIdStr2 = awemeRawAd2.getCreativeIdStr();
                    } else {
                        creativeIdStr2 = null;
                    }
                    jSONObject.put("creative_id", creativeIdStr2);
                    jSONObject.put("is_success", i2);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                String strJ3 = C786410Ut5.J3(jSONObject);
                C793770VBv.LJII("tt_hybrid_commerce_url_modification", jSONObject, null, null);
                if (i != 0) {
                    if (((Boolean) C266560AcY.LIZ.getValue()).booleanValue()) {
                        HashMap map = new HashMap();
                        map.put("origin_url", url);
                        map.put("current_url", str);
                        AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
                        if (awemeRawAd3 != null && (creativeIdStr = awemeRawAd3.getCreativeIdStr()) != null) {
                            str2 = creativeIdStr;
                        }
                        map.put("creative_id", str2);
                        Npth.reportBizException("iab", new Throwable(strJ3), strJ3, (Map<String, String>) map, true);
                        return true;
                    }
                    C805380Via.LJFF("LaunchProtectException", strJ3, new Throwable(strJ3));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final boolean bv(Aweme aweme, String str, String str2, boolean z) {
        String webUrl;
        AwemeRawAd awemeRawAd;
        C1037380d6O.LIZ.getClass();
        IOpenCCTUtils iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null);
        if (iOpenCCTUtils != null) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                webUrl = awemeRawAd.getWebUrl();
            } else {
                webUrl = null;
            }
            if (iOpenCCTUtils.LIZ(webUrl)) {
                return false;
            }
        }
        return C1037380d6O.LJFF(aweme, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final C1035880d3y ov(Aweme aweme, AnchorCommonStruct anchorCommonStruct, C1035740d3k c1035740d3k, NonAdWebModel nonAdWebModel) {
        AwemeRawAd awemeRawAdLJJIJL;
        int i;
        boolean z;
        AwemeRawAd awemeRawAd;
        String originalWebUrl;
        NonAdWebModel nonAdWebModel2;
        Boolean hideNavBar;
        C1035880d3y c1035880d3y = new C1035880d3y(null, null, null, null, Boolean.FALSE, null, null, null, null, false, false, false, 0, null, CardStruct.IStatusCode.DEFAULT, UUID.randomUUID().toString(), 0, false, System.currentTimeMillis(), "", null, null, null, null, 1, -1, "", "", true, false, false, false, false, null, null, false, false, false, false, false, new C1035890d3z(false, false, false, false, EnumC1037150d61.VISIBLE, EnumC1039490d9n.DEFAULT_SESSION_START, Collections.synchronizedList(new ArrayList()), null, null, false, null, null), 0, 0, null, false, 0, false, false, null, null, null, 1, false, 1, null, 0, 0, System.currentTimeMillis(), 0L, 0L, 0, 0.0f, 0, false, 0, 0, 0, -1, -1, 1, false, 100, true, false, null, false, false, false, false, 0, null, false, false, false, false, true, false, true, false, new C1035910d41(0L, 0L, -1, false), new C1035920d42(EnumC1036690d5H.NORMAL, false), new AdWebRecordingModel(new AtomicInteger(0), new AtomicLong(0L), new AtomicLong(0L), new AtomicBoolean(false)), 0L, -1, false, null, null, new C1035900d40(new ConcurrentHashMap(), null, null, new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicLong(0L)), 0, 0, 1, 0, null, null, false, 0L, false, null, null, false, false, 0, null, null, new PaymentModel(null, null, null, null, null, 0, null), null, null, null, new ArrayList(), new AdWebMultiTabModel(0, 0, 0, 0, 0, 0, 0, 0), false, 0.0f, true, false, false, false, new FailMsgModel(null, 1, 0), false, null, null, 0, false);
        c1035880d3y.setUrl(c1035740d3k.url);
        c1035880d3y.setTitle(anchorCommonStruct.getKeyword());
        c1035880d3y.setCommerceEnterFrom(c1035740d3k.commerceEnterFrom);
        c1035880d3y.setRefer(c1035740d3k.refer);
        c1035880d3y.setForbidJump(c1035740d3k.forbidJump);
        c1035880d3y.setUseWebUrl(c1035740d3k.useWebUrl);
        c1035880d3y.setFromJsb(c1035740d3k.isFromJsb());
        c1035880d3y.setContainerId(c1035740d3k.containerId);
        c1035880d3y.setForceShowNavBar(c1035740d3k.forceShowNavBar);
        boolean z2 = true;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            awemeRawAdLJJIJL = C1017070cZd.LJJIJLIJ(aweme);
        } else {
            awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
        }
        c1035880d3y.setAwemeRawAd(awemeRawAdLJJIJL);
        c1035880d3y.setAuthorAvatar(c1035740d3k.authorAvatar);
        c1035880d3y.setAwemeId(c1035740d3k.awemeId);
        c1035880d3y.setAwemeAuthorUid(c1035740d3k.awemeAuthorUid);
        c1035880d3y.setRequestId(c1035740d3k.requestId);
        if (C1017070cZd.LLILII(aweme)) {
            i = 1;
        } else {
            i = 0;
        }
        c1035880d3y.setPseudoAd(i);
        c1035880d3y.setAnchorType(anchorCommonStruct.getType());
        c1035880d3y.setNonAdWebModel(nonAdWebModel);
        c1035880d3y.setInitialData(nonAdWebModel.getInitialData());
        c1035880d3y.setSessionId(UUID.randomUUID().toString());
        try {
            Uri uri = UriProtector.parse(c1035880d3y.getUrl());
            c1035880d3y.setHideNavBar(uri.getBooleanQueryParameter("hide_nav_bar", false));
            c1035880d3y.setHideTitleBar(uri.getBooleanQueryParameter("hide_title_bar", false));
            c1035880d3y.setTransStatusBar(uri.getBooleanQueryParameter("trans_status_bar", false));
            c1035880d3y.getAdCommonData().setInstantPage(uri.getBooleanQueryParameter("is_instant_page", false));
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "has_adinfojson");
            String str = "";
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            c1035880d3y.setHasAdInfoJson(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "adinfojson");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            }
            c1035880d3y.setAdInfoJson(str);
            if (!c1035880d3y.getHideTitleBar() && !c1035880d3y.getHideNavBar() && ((nonAdWebModel2 = c1035880d3y.getNonAdWebModel()) == null || (hideNavBar = nonAdWebModel2.getHideNavBar()) == null || !hideNavBar.booleanValue())) {
                z = false;
            } else {
                z = true;
            }
            c1035880d3y.setHideNavBar(z);
            c1035880d3y.setHideTitleBar(c1035880d3y.getHideNavBar());
            if (!c1035880d3y.getHideNavBar() || c1035880d3y.getForceShowNavBar()) {
                z2 = false;
            }
            c1035880d3y.setHideNavBar(z2);
            if (C1037200d66.LIZLLL(c1035880d3y.getAwemeRawAd()) || C1037200d66.LJ(c1035880d3y.getAwemeRawAd())) {
                if (!c1035880d3y.isFromJsb() && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && Intrinsics.LJFF(awemeRawAd.isServerRedirection(), Boolean.TRUE)) {
                    AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        originalWebUrl = awemeRawAd2.getOriginalWebUrl();
                    } else {
                        originalWebUrl = null;
                    }
                    uri = UriProtector.parse(originalWebUrl);
                }
                c1035880d3y.setUtmParams(C1037200d66.LJI(uri));
                return c1035880d3y;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return c1035880d3y;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final C1069080dvW qv(Context context, boolean z, String str, boolean z2) {
        if ((!nv(str) || !z) && !C291640Bbu.LIZ() && !z2) {
            return null;
        }
        return new C1069080dvW(context);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final String sv(AwemeRawAd awemeRawAd, String str, String str2, int i) {
        LandingPageConfig landingPageConfig;
        LandingPageConfig landingPageConfig2;
        if (str != null) {
            if (str.length() != 0) {
                if (awemeRawAd == null || (((landingPageConfig = awemeRawAd.getLandingPageConfig()) != null && landingPageConfig.strictUsePureLink) || (landingPageConfig2 = awemeRawAd.getLandingPageConfig()) == null || !Intrinsics.LJFF(landingPageConfig2.shouldAddUserInteractionRecord, Boolean.TRUE) || !UriProtector.parse(str).isHierarchical())) {
                    if (str != null) {
                        return str;
                    }
                } else {
                    if (C1037210d67.LIZJ(UriProtector.parse(str).getHost())) {
                        return str;
                    }
                    return LIZ(LIZ(LIZ(str, "iab_click_time", String.valueOf(this.LIZ)), "iab_source", str2), "landPageShowType", String.valueOf(i));
                }
            } else {
                return str;
            }
        }
        return "";
    }

    public static Fragment LIZIZ(Context context, C1035880d3y c1035880d3y, ARunnableS109S0100000_9 aRunnableS109S0100000_9, boolean z, InterfaceC1036270d4b interfaceC1036270d4b) {
        String creativeIdStr;
        String logExtra;
        String string;
        Integer numValueOf;
        Integer numValueOf2;
        Long groupId;
        C1037010d5n.LIZ.getClass();
        C1035690d3f c1035690d3f = new C1035690d3f(context, C1037010d5n.LJIILL(c1035880d3y), C1037010d5n.LJIIL(c1035880d3y));
        C1051290dSp c1051290dSp = new C1051290dSp(EnumC1000680c9C.ONLY_RENDER, "", 0, false, null, new C1035770d3n(c1035880d3y.getUrl(), new Bundle(), c1035880d3y, C1014230cV3.LIZ("landing_page_3p"), new C1039440d9i()), false, false, 444);
        IAdHybridContainerManager iAdHybridContainerManager = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
        C0WOV c0wov = C0WOV.WEB;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        AwemeRawAd awemeRawAd3 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd3 != null && (groupId = awemeRawAd3.getGroupId()) != null) {
            string = groupId.toString();
        } else {
            string = null;
        }
        AwemeRawAd awemeRawAd4 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            numValueOf = Integer.valueOf(awemeRawAd4.getChargeType());
        } else {
            numValueOf = null;
        }
        AwemeRawAd awemeRawAd5 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd5 != null) {
            numValueOf2 = Integer.valueOf(awemeRawAd5.getSystemOrigin());
        } else {
            numValueOf2 = null;
        }
        AbstractC1028360crq abstractC1028360crqLIZLLL = iAdHybridContainerManager.LIZLLL(new C1028380crs("landing_page_1p", c0wov, context, new C1029740cu4(creativeIdStr, logExtra, string, numValueOf, numValueOf2, null, false, 96)), c1051290dSp);
        if (!((Boolean) C275520Ar0.LIZ.getValue()).booleanValue()) {
            LJFF(c1035880d3y);
        } else if (c1035880d3y.getCreateScene() != EnumC1027220cq0.ON_AWEME_CHANGE.getIntV()) {
            C1035840d3u.LIZ.getClass();
            if (((AdLandPageSSPOptSettingV2Model) C1035840d3u.LIZJ.getValue()).enableOptimizeOnSlide) {
                LJFF(c1035880d3y);
            }
        }
        abstractC1028360crqLIZLLL.LJIJI(c1035690d3f);
        abstractC1028360crqLIZLLL.LJIILLIIL(c1035690d3f);
        InterfaceC1034470d1h interfaceC1034470d1hLJI = abstractC1028360crqLIZLLL.LJI(c1051290dSp, z, null);
        if (interfaceC1034470d1hLJI != null) {
            interfaceC1034470d1hLJI.r(interfaceC1036270d4b);
            if (aRunnableS109S0100000_9 != null) {
                interfaceC1034470d1hLJI.LLJI(new ARunnableS109S0100000_9((Object) aRunnableS109S0100000_9, 226));
            }
        } else {
            interfaceC1034470d1hLJI = null;
        }
        if (!(interfaceC1034470d1hLJI instanceof Fragment)) {
            return null;
        }
        return (Fragment) interfaceC1034470d1hLJI;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final Fragment dv(Context context, C1035880d3y c1035880d3y, String str, String str2, ARunnableS116S0100000_16 aRunnableS116S0100000_16) {
        AwemeRawAd awemeRawAd;
        UrlModel authorAvatar;
        String title;
        String commerceEnterFrom;
        String refer;
        String awemeId;
        String awemeAuthorUid;
        boolean forbidJump;
        int useWebUrl;
        String requestId;
        String sessionId;
        int iIsNineScreen;
        boolean zIsFromJsb;
        String extraInfo;
        boolean zR42;
        int firstPage;
        int preloadStatus;
        String hasAdInfoJson;
        boolean hideNavBar;
        boolean hideTitleBar;
        boolean transStatusBar;
        boolean zIsPreRender;
        boolean cameraGranted;
        boolean forceShowNavBar;
        String creativeIdStr;
        String logExtra;
        String string;
        Integer numValueOf;
        String creativeIdStr2;
        String logExtra2;
        Long groupId;
        String adInfoJson;
        AwemeRawAd awemeRawAd2 = null;
        String currentUrl = null;
        Integer numValueOf2 = null;
        String creativeIdStr3 = null;
        C1035880d3y c1035880d3y2 = new C1035880d3y(null, null, null, null, Boolean.FALSE, null, null, null, null, false, false, false, 0, null, CardStruct.IStatusCode.DEFAULT, UUID.randomUUID().toString(), 0, false, System.currentTimeMillis(), "", null, null, null, null, 1, -1, "", "", true, false, false, false, false, null, null, false, false, false, false, false, new C1035890d3z(false, false, false, false, EnumC1037150d61.VISIBLE, EnumC1039490d9n.DEFAULT_SESSION_START, Collections.synchronizedList(new ArrayList()), null, null, false, null, null), 0, 0, null, false, 0, false, false, null, null, null, 1, false, 1, null, 0, 0, System.currentTimeMillis(), 0L, 0L, 0, 0.0f, 0, false, 0, 0, 0, -1, -1, 1, false, 100, true, false, null, false, false, false, false, 0, null, false, false, false, false, true, false, true, false, new C1035910d41(0L, 0L, -1, false), new C1035920d42(EnumC1036690d5H.NORMAL, false), new AdWebRecordingModel(new AtomicInteger(0), new AtomicLong(0L), new AtomicLong(0L), new AtomicBoolean(false)), 0L, -1, false, null, null, new C1035900d40(new ConcurrentHashMap(), null, null, new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicLong(0L)), 0, 0, 1, 0, null, null, false, 0L, false, null, null, false, false, 0, null, null, new PaymentModel(null, null, null, null, null, 0, null), null, null, null, new ArrayList(), new AdWebMultiTabModel(0, 0, 0, 0, 0, 0, 0, 0), false, 0.0f, true, false, false, false, new FailMsgModel(null, 1, 0), false, null, null, 0, false);
        String logExtra3 = null;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1035880d3y2.setAwemeRawAd(awemeRawAd);
        if (c1035880d3y != null) {
            authorAvatar = c1035880d3y.getAuthorAvatar();
        } else {
            authorAvatar = null;
        }
        c1035880d3y2.setAuthorAvatar(authorAvatar);
        if (c1035880d3y != null) {
            title = c1035880d3y.getTitle();
        } else {
            title = null;
        }
        c1035880d3y2.setTitle(title);
        ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Yu();
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        if (c1035880d3y != null) {
            awemeRawAd2 = c1035880d3y.getAwemeRawAd();
        }
        c1035880d3y2.setUrl(iAdWebUtils.sv(awemeRawAd2, str2, "click", 0));
        if (c1035880d3y != null) {
            commerceEnterFrom = c1035880d3y.getCommerceEnterFrom();
        } else {
            commerceEnterFrom = null;
        }
        c1035880d3y2.setCommerceEnterFrom(commerceEnterFrom);
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        c1035880d3y2.setRefer(refer);
        if (c1035880d3y != null) {
            awemeId = c1035880d3y.getAwemeId();
        } else {
            awemeId = null;
        }
        c1035880d3y2.setAwemeId(awemeId);
        if (c1035880d3y != null) {
            awemeAuthorUid = c1035880d3y.getAwemeAuthorUid();
        } else {
            awemeAuthorUid = null;
        }
        c1035880d3y2.setAwemeAuthorUid(awemeAuthorUid);
        if (c1035880d3y != null) {
            forbidJump = c1035880d3y.getForbidJump();
        } else {
            forbidJump = false;
        }
        c1035880d3y2.setForbidJump(forbidJump);
        if (c1035880d3y != null) {
            useWebUrl = c1035880d3y.getUseWebUrl();
        } else {
            useWebUrl = 0;
        }
        c1035880d3y2.setUseWebUrl(useWebUrl);
        if (c1035880d3y != null) {
            requestId = c1035880d3y.getRequestId();
        } else {
            requestId = null;
        }
        c1035880d3y2.setRequestId(requestId);
        if (c1035880d3y == null || (sessionId = c1035880d3y.getSessionId()) == null) {
            sessionId = CardStruct.IStatusCode.DEFAULT;
        }
        c1035880d3y2.setSessionId(sessionId);
        if (c1035880d3y != null) {
            iIsNineScreen = c1035880d3y.isNineScreen();
        } else {
            iIsNineScreen = 0;
        }
        c1035880d3y2.setNineScreen(iIsNineScreen);
        if (c1035880d3y != null) {
            zIsFromJsb = c1035880d3y.isFromJsb();
        } else {
            zIsFromJsb = false;
        }
        c1035880d3y2.setFromJsb(zIsFromJsb);
        c1035880d3y2.setWebInitTime(System.currentTimeMillis());
        String str3 = "";
        if (c1035880d3y == null || (extraInfo = c1035880d3y.getExtraInfo()) == null) {
            extraInfo = "";
        }
        c1035880d3y2.setExtraInfo(extraInfo);
        if (c1035880d3y != null) {
            currentUrl = c1035880d3y.getCurrentUrl();
        }
        c1035880d3y2.setCurrentUrl(currentUrl);
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        if (interfaceC1030370cv5 != null) {
            zR42 = interfaceC1030370cv5.r42(c1035880d3y2.getAwemeRawAd());
        } else {
            zR42 = false;
        }
        c1035880d3y2.setEnableReuseWeb(zR42);
        boolean shouldClearHistory = true;
        if (c1035880d3y != null) {
            firstPage = c1035880d3y.getFirstPage();
        } else {
            firstPage = 1;
        }
        c1035880d3y2.setFirstPage(firstPage);
        if (c1035880d3y != null) {
            preloadStatus = c1035880d3y.getPreloadStatus();
        } else {
            preloadStatus = -1;
        }
        c1035880d3y2.setPreloadStatus(preloadStatus);
        if (c1035880d3y == null || (hasAdInfoJson = c1035880d3y.getHasAdInfoJson()) == null) {
            hasAdInfoJson = "";
        }
        c1035880d3y2.setHasAdInfoJson(hasAdInfoJson);
        if (c1035880d3y != null && (adInfoJson = c1035880d3y.getAdInfoJson()) != null) {
            str3 = adInfoJson;
        }
        c1035880d3y2.setAdInfoJson(str3);
        if (c1035880d3y != null) {
            shouldClearHistory = c1035880d3y.getShouldClearHistory();
        }
        c1035880d3y2.setShouldClearHistory(shouldClearHistory);
        if (c1035880d3y != null) {
            hideNavBar = c1035880d3y.getHideNavBar();
        } else {
            hideNavBar = false;
        }
        c1035880d3y2.setHideNavBar(hideNavBar);
        if (c1035880d3y != null) {
            hideTitleBar = c1035880d3y.getHideTitleBar();
        } else {
            hideTitleBar = false;
        }
        c1035880d3y2.setHideTitleBar(hideTitleBar);
        if (c1035880d3y != null) {
            transStatusBar = c1035880d3y.getTransStatusBar();
        } else {
            transStatusBar = false;
        }
        c1035880d3y2.setTransStatusBar(transStatusBar);
        if (c1035880d3y != null) {
            zIsPreRender = c1035880d3y.isPreRender();
        } else {
            zIsPreRender = false;
        }
        c1035880d3y2.setPreRender(zIsPreRender);
        if (c1035880d3y != null) {
            cameraGranted = c1035880d3y.getCameraGranted();
        } else {
            cameraGranted = false;
        }
        c1035880d3y2.setCameraGranted(cameraGranted);
        if (c1035880d3y != null) {
            forceShowNavBar = c1035880d3y.getForceShowNavBar();
        } else {
            forceShowNavBar = false;
        }
        c1035880d3y2.setForceShowNavBar(forceShowNavBar);
        LJ(c1035880d3y2);
        c1035880d3y2.setBocRuleMatcher(new C1042040dDu(c1035880d3y2));
        C1035690d3f c1035690d3fLv = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).lv(context, c1035880d3y2);
        c1035690d3fLv.LLJI(aRunnableS116S0100000_16);
        C1051290dSp c1051290dSp = new C1051290dSp(EnumC1000680c9C.ONLY_RENDER, "", 0, false, null, new C1035770d3n(str, new Bundle(), c1035880d3y2, C1014230cV3.LIZ("landing_page_3p"), new C1039440d9i()), false, false, 444);
        IAdHybridContainerManager iAdHybridContainerManager = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
        C0WOV c0wov = C0WOV.WEB;
        AwemeRawAd awemeRawAd3 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            creativeIdStr = awemeRawAd3.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        AwemeRawAd awemeRawAd4 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            logExtra = awemeRawAd4.getLogExtra();
        } else {
            logExtra = null;
        }
        AwemeRawAd awemeRawAd5 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd5 != null && (groupId = awemeRawAd5.getGroupId()) != null) {
            string = groupId.toString();
        } else {
            string = null;
        }
        AwemeRawAd awemeRawAd6 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd6 != null) {
            numValueOf = Integer.valueOf(awemeRawAd6.getChargeType());
        } else {
            numValueOf = null;
        }
        AwemeRawAd awemeRawAd7 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd7 != null) {
            numValueOf2 = Integer.valueOf(awemeRawAd7.getSystemOrigin());
        }
        AbstractC1028360crq abstractC1028360crqLIZLLL = iAdHybridContainerManager.LIZLLL(new C1028380crs("landing_page_1p", c0wov, context, new C1029740cu4(creativeIdStr, logExtra, string, numValueOf, numValueOf2, null, false, 96)), c1051290dSp);
        abstractC1028360crqLIZLLL.LJIJI(c1035690d3fLv);
        abstractC1028360crqLIZLLL.LJIILLIIL(c1035690d3fLv);
        Object objLJI = abstractC1028360crqLIZLLL.LJI(c1051290dSp, false, null);
        IAdWebLogService iAdWebLogServiceLJIIIZ = AdWebLogService.LJIIIZ();
        AwemeRawAd awemeRawAd8 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd8 != null) {
            creativeIdStr2 = awemeRawAd8.getCreativeIdStr();
        } else {
            creativeIdStr2 = null;
        }
        AwemeRawAd awemeRawAd9 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd9 != null) {
            logExtra2 = awemeRawAd9.getLogExtra();
        } else {
            logExtra2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jump url ");
        sbLIZ.append(str);
        iAdWebLogServiceLJIIIZ.LIZIZ(creativeIdStr2, logExtra2, C2188811AlT.LIZIZ(sbLIZ));
        if (objLJI != null) {
            return (Fragment) objLJI;
        }
        IAdWebLogService iAdWebLogServiceLJIIIZ2 = AdWebLogService.LJIIIZ();
        AwemeRawAd awemeRawAd10 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd10 != null) {
            creativeIdStr3 = awemeRawAd10.getCreativeIdStr();
        }
        AwemeRawAd awemeRawAd11 = c1035880d3y2.getAwemeRawAd();
        if (awemeRawAd11 != null) {
            logExtra3 = awemeRawAd11.getLogExtra();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("url ");
        sbLIZ2.append(str);
        sbLIZ2.append(' ');
        sbLIZ2.append(abstractC1028360crqLIZLLL.LJIIIZ());
        iAdWebLogServiceLJIIIZ2.LIZIZ(creativeIdStr3, logExtra3, C2188811AlT.LIZIZ(sbLIZ2));
        return AdWebSparkService.LIZJ().LIZ(context, str, C1014230cV3.LIZ("landing_page_3p"), new Bundle(), c1035880d3y2, new C1039440d9i(), c1035690d3fLv, c1035690d3fLv);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final Fragment fv(Context context, Aweme aweme, C1035740d3k c1035740d3k, EnumC1027220cq0 enumC1027220cq0, ARunnableS109S0100000_9 aRunnableS109S0100000_9) {
        ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Yu();
        C1037010d5n c1037010d5n = C1037010d5n.LIZ;
        String strV = enumC1027220cq0.getStrV();
        c1037010d5n.getClass();
        System.currentTimeMillis();
        C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
        C1042680dEw.LIZ.getClass();
        c1001830cB3.log(C1042680dEw.LJIIJ, new AwS67S1000000_16(strV, 27));
        C1035880d3y c1035880d3yRu = Ru(aweme.getAwemeRawAd(), c1035740d3k);
        c1035880d3yRu.setCreateScene(enumC1027220cq0.getIntV());
        return LIZIZ(context, c1035880d3yRu, aRunnableS109S0100000_9, true, null);
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    public final Fragment mv(C19EG c19eg, C1026310coX c1026310coX, boolean z, EnumC1036160d4Q enumC1036160d4Q, int i, InterfaceC1036270d4b interfaceC1036270d4b, boolean z2) {
        C1025720cna tuxSheetConfig;
        C1025720cna tuxSheetConfig2;
        C1025720cna tuxSheetConfig3;
        C1035880d3y c1035880d3yWv = wv(i, c1026310coX);
        C1037010d5n c1037010d5n = C1037010d5n.LIZ;
        String url = c1035880d3yWv.getUrl();
        AwemeRawAd awemeRawAd = c1035880d3yWv.getAwemeRawAd();
        String awemeId = c1035880d3yWv.getAwemeId();
        if (awemeId == null) {
            awemeId = "";
        }
        String strLJIIJJI = C1037010d5n.LJIIJJI(awemeRawAd, url, awemeId, true);
        if (strLJIIJJI != null) {
            c1035880d3yWv.setContainerId(strLJIIJJI);
        }
        c1035880d3yWv.setUseNewStyle(true);
        if (!z && (c1026310coX.getTuxSheetConfig() == null || (tuxSheetConfig = c1026310coX.getTuxSheetConfig()) == null || Integer.valueOf(tuxSheetConfig.variant) == null || (((tuxSheetConfig2 = c1026310coX.getTuxSheetConfig()) != null && tuxSheetConfig2.variant == 3) || ((tuxSheetConfig3 = c1026310coX.getTuxSheetConfig()) != null && tuxSheetConfig3.variant == 2)))) {
            c1035880d3yWv.setSheetVariantFullScreen(true);
        }
        c1035880d3yWv.setFullScreen(z);
        c1035880d3yWv.setNineScreen(!z ? 1 : 0);
        c1035880d3yWv.setSceneWhenUseNativeHeaderStyle(enumC1036160d4Q.name());
        c1035880d3yWv.getAdCommonData().setWebViewVisible(EnumC1037150d61.VISIBLE);
        C1028100crQ popUpCustomConfig = c1026310coX.getPopUpCustomConfig();
        if (popUpCustomConfig != null && popUpCustomConfig.isDirectOpenLandingPage()) {
            c1035880d3yWv.setHideNavBar(true);
            c1035880d3yWv.setHideTitleBar(true);
        }
        Fragment fragmentLIZIZ = LIZIZ(new C1361400lX0(c19eg, C1385040m98.LIZLLL(c19eg)), c1035880d3yWv, null, z2, interfaceC1036270d4b);
        if (fragmentLIZIZ == null) {
            return new Fragment();
        }
        return fragmentLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    @Override // com.ss.android.ugc.aweme.web.service.IAdWebUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pv(boolean r25, final android.app.Activity r26, final androidx.fragment.app.Fragment r27, java.lang.Boolean r28, android.widget.FrameLayout r29, int r30, final boolean r31, final boolean r32, boolean r33, final kotlin.jvm.functions.Function1 r34, final kotlin.jvm.functions.Function1 r35) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.utils.AdWebUtils.pv(boolean, android.app.Activity, androidx.fragment.app.Fragment, java.lang.Boolean, android.widget.FrameLayout, int, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }
}
