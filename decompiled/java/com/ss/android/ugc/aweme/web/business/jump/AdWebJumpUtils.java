package com.ss.android.ugc.aweme.web.business.jump;

import X.C098200Yq;
import X.C0A1U;
import X.C0C64;
import X.C0N1S;
import X.C0WZX;
import X.C1028260crg;
import X.C1028270crh;
import X.C1029270ctJ;
import X.C1030680cva;
import X.C1035880d3y;
import X.C1035990d49;
import X.C1037700d6u;
import X.C1038980d8y;
import X.C1039260d9Q;
import X.C1039270d9R;
import X.C1039440d9i;
import X.C1039580d9w;
import X.C1040740dBo;
import X.C1041360dCo;
import X.C1054200dXW;
import X.C1073980e3Q;
import X.C1073990e3R;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520380pfQ;
import X.C1520640pfq;
import X.C1533950q1J;
import X.C15438062q;
import X.C1701330uNH;
import X.C189200o6;
import X.C1906580ziK;
import X.C2093608Ic;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2429209fW;
import X.C2429609fa;
import X.C257030A5l;
import X.C786410Ut5;
import X.C815740VzI;
import X.C822610WOt;
import X.C824330WVj;
import X.C844470XAv;
import X.InterfaceC1036110d4L;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.ad.gp.service.ICommerceGooglePlayService;
import com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig;
import com.ss.android.ugc.aweme.ad.service.ILandingPageInterceptService;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebJumpUtils {
    public static final int $stable = 0;
    public static final AdWebJumpUtils INSTANCE = new AdWebJumpUtils();

    public final List<String> getApplinkJumpAllowList() {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("commerce_iab_ulink_path_config", ".onelink.me/");
        return Intrinsics.LJFF(strLJI, "") ? C13BV.INSTANCE : a0.LJJLIIIJILLIZJL(strLJI, new String[]{","}, 0, 6);
    }

    private final List<String> getAutoJumpAllowList(boolean z) {
        if (z) {
            AdLandingPageConfig adLandingPageConfigLIZIZ = C1037700d6u.LIZIZ();
            if (adLandingPageConfigLIZIZ == null) {
                return null;
            }
            return adLandingPageConfigLIZIZ.getSplashAdAutoJumpAllowList();
        }
        AdLandingPageConfig adLandingPageConfigLIZIZ2 = C1037700d6u.LIZIZ();
        if (adLandingPageConfigLIZIZ2 == null) {
            return null;
        }
        return adLandingPageConfigLIZIZ2.autoJumpAllowList;
    }

    private final String getDomainWithPath(String str) {
        String path;
        try {
            Uri uri = UriProtector.parse(str);
            String authority = uri.getAuthority();
            if (authority == null || (path = uri.getPath()) == null) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(authority);
            sbLIZ.append(path);
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final boolean handlePassBackPageInfo(String str) {
        if (str == null) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (!TextUtils.equals(uri.getScheme(), "bytedance") || !TextUtils.equals(uri.getHost(), "adPageHtmlContent")) {
            return false;
        }
        return true;
    }

    private final boolean isSelfScheme(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (Intrinsics.LJFF("sslocal", str)) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snssdk");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJIIJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C2093608Ic.LJ(strLIZIZ) || !Intrinsics.LJFF(strLIZIZ, str)) {
            return false;
        }
        return true;
    }

    private final String tryConvertScheme(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str;
        }
        try {
            String scheme = UriProtector.parse(str).getScheme();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snssdk");
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LJIIJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (Intrinsics.LJFF("sslocal", scheme) || Intrinsics.LJFF("localsdk", scheme)) {
                str = u.LJJIFFI(str, scheme, strLIZIZ, false);
                return str;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str;
    }

    public final String commerceUrlFilter(String str) {
        if (!TextUtils.isEmpty(str) && a0.LJJIIZI(str, "__back_url__", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snssdk");
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LJIIJ);
            sbLIZ.append("://adx");
            return u.LJJIFFI(str, "__back_url__", Uri.encode(C2188811AlT.LIZIZ(sbLIZ)), false);
        }
        return str;
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWI11ZdgCe8xQQq4zlX", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final boolean handleOpenUrl(Context context, String str) throws Throwable {
        PackageManager packageManager;
        Uri uri = UriProtector.parse(str);
        String scheme = uri.getScheme();
        if (isSelfScheme(scheme)) {
            Intent intent = new Intent();
            intent.setClassName(context, ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIIIJ("AdWebJumpUtils#handleOpenUrl"));
            intent.setData(uri);
            intent.putExtra("is_from_self", true);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207964161);
            try {
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(uri);
        if (C2162308dZ.LJ(context, intent2)) {
            intent2.putExtra("open_url", str);
            JSONObject jSONObject = new JSONObject();
            C1520640pfq.LJIILIIL("openUrl", str, jSONObject);
            Activity activityLIZ = C1388190mED.LIZ(context);
            List listLJJJJZ = null;
            if (activityLIZ != null && (packageManager = activityLIZ.getPackageManager()) != null) {
                listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent2, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWI11ZdgCe8xQQq4zlX", null));
            }
            C1520640pfq.LJIILJJIL(jSONObject, "intentActivities", listLJJJJZ);
            C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
            C1520360pfO c1520360pfO = new C1520360pfO("jump_other_app_through_olg_logic");
            c1520360pfO.LIZIZ = "sparkTrace";
            c1520360pfO.LIZLLL = jSONObject;
            C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
            c1520380pfQ.getClass();
            C1520380pfQ.LIZ(c1520350pfNLIZ);
            C2429209fW.LIZ().appendDataFlowId(intent2, 1207964161);
            try {
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent2);
                return true;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        Intent intent3 = new Intent("com.ss.android.sdk." + scheme);
        if (scheme != null && u.LJJIIJZLJL(scheme, "snssdk", false) && C2162308dZ.LJ(context, intent3)) {
            intent3.putExtra("open_url", str);
            C2429209fW.LIZ().appendDataFlowId(intent3, 1207964161);
            try {
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent3);
                return true;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        return false;
    }

    private final boolean isDomainPathInConfigList(String str, List<String> list) {
        String domainWithPath;
        if (list.isEmpty() || str == null || (domainWithPath = getDomainWithPath(str)) == null || list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if ((!a0.LJJJIL(str2)) && a0.LJJIIZI(domainWithPath, str2, false)) {
                return true;
            }
        }
        return false;
    }

    private final boolean startActivityExternal(Intent intent, Context context) throws Throwable {
        Activity activityLIZ;
        PackageManager packageManager;
        ActivityInfo activityInfoResolveActivityInfo;
        if (intent == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (packageManager = activityLIZ.getPackageManager()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        ComponentName component = intent.getComponent();
        String strLJJIJIL = null;
        if (component != null) {
            strLJJIJIL = C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWI11ZdgCe8xQQq4zlX", null));
        }
        if (Intrinsics.LJFF(packageName, strLJJIJIL) || (activityInfoResolveActivityInfo = intent.resolveActivityInfo(packageManager, 65536)) == null || !activityInfoResolveActivityInfo.exported) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("android.intent.action.CHOOSER");
        hashSet.add("android.intent.action.SEND");
        hashSet.add("android.intent.action.SEND_MULTIPLE");
        hashSet.add("android.media.action.IMAGE_CAPTURE");
        hashSet.add("android.media.action.IMAGE_CAPTURE_SECURE");
        hashSet.add("android.media.action.VIDEO_CAPTURE");
        if (C13LP.LJJJJ(intent.getAction(), hashSet)) {
            return false;
        }
        C2429209fW.LIZ().appendDataFlowId(intent, 1207964161);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
        return true;
    }

    private final boolean topViewJumpHttp(C1035880d3y c1035880d3y, boolean z) {
        if (!C1030680cva.LJIIL(c1035880d3y.getAwemeRawAd()) || z) {
            return true;
        }
        return false;
    }

    public final boolean handleApkFile(Context context, String str) {
        String path;
        if (context == null || TextUtils.isEmpty(str) || (path = UriProtector.parse(str).getPath()) == null || path.length() == 0 || !u.LJIIZILJ(path, ".apk", false)) {
            return false;
        }
        String string = context.getString(2131826352);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        return true;
    }

    private final boolean allowList(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return false;
        }
        if (!a0.LJJIIZI(str3, ":", false)) {
            return TextUtils.equals(str2, str3);
        }
        return u.LJJIIJZLJL(str, str3, false);
    }

    private final boolean shouldInterceptByShopifyCheckout(WebView webView, C1039440d9i c1039440d9i, String str) {
        if (c1039440d9i.LJJIIJZLJL(str)) {
            return true;
        }
        if (Intrinsics.LJFF(C1039270d9R.LIZ().removeNonCheckoutUa, Boolean.TRUE)) {
            C1041360dCo c1041360dCo = C1041360dCo.LIZ;
            C1039580d9w c1039580d9wLJJIIZ = c1039440d9i.LJJIIZ();
            c1041360dCo.getClass();
            return C1041360dCo.LJFF(webView, c1039580d9wLJJIIZ);
        }
        return false;
    }

    public final boolean startAdsAppActivity(Context context, String str, String str2) {
        if (context == null) {
            return false;
        }
        if (!C2093608Ic.LJ(str)) {
            return handleOpenUrl(context, str);
        }
        if (!C2093608Ic.LJ(str2) && C2162308dZ.LJFF(context, str2)) {
            Intent intentLIZIZ = C2162308dZ.LIZIZ(context, str2);
            C2429209fW.LIZ().appendDataFlowId(intentLIZIZ, 1207964161);
            try {
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intentLIZIZ);
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    private final boolean blockJump(boolean z, boolean z2, boolean z3, AdLandingPageConfig adLandingPageConfig) {
        if (adLandingPageConfig != null) {
            if (!z2 || !adLandingPageConfig.isJumpControlEnabled() || z || z3) {
                return false;
            }
            return true;
        }
        if (!z2 || z || z3) {
            return false;
        }
        return true;
    }

    private final boolean isCurrentUriAllowed(String str, String str2, String str3, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        if (str2 == null) {
            str2 = UriProtector.parse(str).getScheme();
        }
        if (TextUtils.equals(str2, "sslocal")) {
            return true;
        }
        if (!TextUtils.isEmpty(str3)) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str3, it2.next())) {
                    return true;
                }
            }
        }
        Iterator<String> it3 = list.iterator();
        while (it3.hasNext()) {
            if (allowList(str, str2, it3.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean interceptToOpenGooglePlayMiniCard(Context context, InterfaceC1036110d4L interfaceC1036110d4L, AwemeRawAd awemeRawAd, Uri uri, boolean z) {
        C1040740dBo c1040740dBo;
        if (C1073980e3Q.LLILZIL || interfaceC1036110d4L == null) {
            return false;
        }
        ICommerceGooglePlayService iCommerceGooglePlayService = (ICommerceGooglePlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceGooglePlayService.class, false, false, false, 14, null);
        C1054200dXW c1054200dXWLIZIZ = null;
        c1035880d3y = null;
        C1035880d3y c1035880d3y = null;
        if (iCommerceGooglePlayService != null) {
            C0N1S c0n1s = C0N1S.LANDING_AD;
            new C1028260crg(c0n1s);
            if ((interfaceC1036110d4L instanceof C1040740dBo) && (c1040740dBo = (C1040740dBo) interfaceC1036110d4L) != null) {
                c1035880d3y = c1040740dBo.LL;
            }
            c1054200dXWLIZIZ = iCommerceGooglePlayService.LIZIZ(new C1028270crh(c0n1s, c1035880d3y, z));
        }
        ILandingPageInterceptService iLandingPageInterceptService = (ILandingPageInterceptService) PluggableExtentionKt.pluggableSpi$default(ILandingPageInterceptService.class, false, false, false, 14, null);
        if (iLandingPageInterceptService == null) {
            return false;
        }
        return iLandingPageInterceptService.LIZ(context, awemeRawAd, uri, z, c1054200dXWLIZIZ);
    }

    private final boolean interceptToOpenGooglePlayMiniCard(Context context, InterfaceC1036110d4L interfaceC1036110d4L, AwemeRawAd awemeRawAd, String str, boolean z) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(interceptToOpenGooglePlayMiniCard(context, interfaceC1036110d4L, awemeRawAd, UriProtector.parse(str), z));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    private final boolean inAllowList(C1035880d3y c1035880d3y, String str, String str2, String str3, AdLandingPageConfig adLandingPageConfig, AwemeRawAd awemeRawAd) {
        List<String> list;
        boolean zLJIIL = C1030680cva.LJIIL(c1035880d3y.getAwemeRawAd());
        List<String> iabAutoJumpAllowList = null;
        if (adLandingPageConfig != null) {
            list = adLandingPageConfig.clickJumpAllowList;
        } else {
            list = null;
        }
        if (isCurrentUriAllowed(str, str2, str3, list) || isCurrentUriAllowed(str, str2, str3, getAutoJumpAllowList(zLJIIL))) {
            return true;
        }
        if (!zLJIIL && C0C64.LJIILLIIL().LJIIIZ(31744, "ad_web_auto_jump_all_schema", true, false)) {
            return true;
        }
        if (awemeRawAd != null) {
            iabAutoJumpAllowList = awemeRawAd.getIabAutoJumpAllowList();
        }
        if (isCurrentUriAllowed(str, str2, str3, iabAutoJumpAllowList)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0453 A[PHI: r3
      0x0453: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:224:0x0450, B:217:0x043a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x045f A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0189  */
    /* JADX WARN: Type inference failed for: r6v13, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean filterUrl(android.webkit.WebView r41, java.lang.String r42, X.C1039440d9i r43, boolean r44, java.lang.String r45, X.InterfaceC1631620sYq<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r46) {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.business.jump.AdWebJumpUtils.filterUrl(android.webkit.WebView, java.lang.String, X.0d9i, boolean, java.lang.String, X.0sYq):boolean");
    }

    private final boolean handleTwoJumpWithIntentOrMarket(InterfaceC1036110d4L interfaceC1036110d4L, AwemeRawAd awemeRawAd, Uri uri, String str, boolean z, String str2, WebView webView) throws Throwable {
        Intent uri2;
        boolean z2;
        String strLJJIJIL;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        PackageManager packageManager;
        Activity activityLIZ;
        String lowerCase;
        ComponentName component;
        String str3 = str2;
        if (C1906580ziK.LJI() || uri == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return false;
        }
        Context context = webView.getContext();
        String str4 = "";
        if (Intrinsics.LJFF("market", str)) {
            boolean zInterceptToOpenGooglePlayMiniCard = interceptToOpenGooglePlayMiniCard(context, interfaceC1036110d4L, awemeRawAd, uri, z);
            C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
            if (str3 != null) {
                str4 = str3;
            }
            boolean zLIZ = C815740VzI.LIZ(context, uri);
            c1029270ctJ.getClass();
            int iLIZ = C1029270ctJ.LIZ(true, zLIZ);
            Boolean bool = Boolean.FALSE;
            c1029270ctJ.getClass();
            C1029270ctJ.LIZIZ(interfaceC1036110d4L, str4, z, iLIZ, bool, zInterceptToOpenGooglePlayMiniCard);
            if (zInterceptToOpenGooglePlayMiniCard) {
                return true;
            }
            C2429609fa.LIZ.getClass();
            C2429609fa.LIZ(uri, webView);
            return true;
        }
        if (!Intrinsics.LJFF("intent", str) || !z) {
            return false;
        }
        String str5 = null;
        try {
            uri2 = Intent.parseUri(str3, 1);
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            uri2 = null;
        }
        boolean zInterceptToOpenGooglePlayMiniCard2 = interceptToOpenGooglePlayMiniCard(context, interfaceC1036110d4L, awemeRawAd, str3, z);
        if (context != null && uri2 != null) {
            List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), uri2, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWc8HtaxjveSA==", null));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJZ, 10));
            Iterator it2 = listLJJJJZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ResolveInfo) it2.next()).activityInfo.packageName);
            }
            z2 = !arrayList.isEmpty();
        } else {
            z2 = false;
        }
        C1029270ctJ c1029270ctJ2 = C1029270ctJ.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c1029270ctJ2.getClass();
        int iLIZ2 = C1029270ctJ.LIZ(true, z2);
        Boolean bool2 = Boolean.FALSE;
        c1029270ctJ2.getClass();
        C1029270ctJ.LIZIZ(interfaceC1036110d4L, str3, z, iLIZ2, bool2, zInterceptToOpenGooglePlayMiniCard2);
        if (zInterceptToOpenGooglePlayMiniCard2) {
            return true;
        }
        String packageName = webView.getContext().getPackageName();
        if (uri2 != null && (component = uri2.getComponent()) != null) {
            strLJJIJIL = C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWI11ZdgCe8xQQq4zlX", null));
        } else {
            strLJJIJIL = null;
        }
        if (Intrinsics.LJFF(packageName, strLJJIJIL)) {
            return false;
        }
        if (startActivityExternal(uri2, webView.getContext())) {
            return true;
        }
        if (uri2 != null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(uri2, "browser_fallback_url");
        } else {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = null;
        }
        if (((Boolean) C257030A5l.LIZ.getValue()).booleanValue()) {
            if (C1533950q1J.LJ(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra) && !C1035990d49.LJI(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                Uri uri3 = UriProtector.parse(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                boolean zInterceptToOpenGooglePlayMiniCard3 = interceptToOpenGooglePlayMiniCard(context, interfaceC1036110d4L, awemeRawAd, uri3, z);
                boolean zLIZ2 = C815740VzI.LIZ(context, UriProtector.parse(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra));
                if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
                    str4 = strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
                }
                int iLIZ3 = C1029270ctJ.LIZ(true, zLIZ2);
                Boolean bool3 = Boolean.FALSE;
                c1029270ctJ2.getClass();
                C1029270ctJ.LIZIZ(interfaceC1036110d4L, str4, z, iLIZ3, bool3, zInterceptToOpenGooglePlayMiniCard3);
                if (zInterceptToOpenGooglePlayMiniCard3) {
                    return true;
                }
                String scheme = uri3.getScheme();
                if (scheme != null) {
                    lowerCase = scheme.toLowerCase(Locale.getDefault());
                } else {
                    lowerCase = null;
                }
                if (Intrinsics.LJFF("market", lowerCase)) {
                    C2429609fa.LIZ.getClass();
                    C2429609fa.LIZ(uri3, webView);
                    return true;
                }
                if (C815740VzI.LIZ(context, uri3)) {
                    startAdsAppActivity(context, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, null);
                    return true;
                }
                return false;
            }
            if (!C1533950q1J.LJ(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                return false;
            }
            C786410Ut5.ue(webView, String.valueOf(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra));
            return true;
        }
        Context context2 = webView.getContext();
        if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
            packageManager = activityLIZ.getPackageManager();
        } else {
            packageManager = null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        ICrossPlatformLegacyService iCrossPlatformLegacyService = (ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class);
        C2429609fa.LIZ.getClass();
        if (uri2 != null && iCrossPlatformLegacyService.LIZLLL(webView.getContext())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("market://details?id=");
            sbLIZ.append(uri2.getPackage());
            intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            if (packageManager != null && intent.resolveActivity(packageManager) != null) {
                uri2.addFlags(268435456);
                C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
                try {
                    Context context3 = webView.getContext();
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context3, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context3);
                    C2204961BRm.LJJJJJL(context3, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWI11ZdgCe8xRYOwjBIWILb", null));
                    return true;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return true;
                }
            }
        }
        if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null && C1035990d49.LJI(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            C786410Ut5.ue(webView, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            return true;
        }
        C2429609fa.LIZ.getClass();
        if (!iCrossPlatformLegacyService.LIZLLL(webView.getContext())) {
            Context context4 = webView.getContext();
            if (uri2 != null) {
                str5 = uri2.getPackage();
            }
            return iCrossPlatformLegacyService.LJIILJJIL(context4, str5);
        }
        return false;
    }

    private final boolean handleOneJumpWithIntent(InterfaceC1036110d4L interfaceC1036110d4L, String str, boolean z, String str2, WebView webView, AdLandingPageConfig adLandingPageConfig, boolean z2, C1035880d3y c1035880d3y) {
        Intent uri;
        String str3;
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !Intrinsics.LJFF("intent", str) || z) {
            return false;
        }
        Uri data = null;
        try {
            uri = Intent.parseUri(str2, 1);
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            uri = null;
        }
        if (uri == null) {
            str3 = null;
        } else {
            data = uri.getData();
            str3 = uri.getPackage();
        }
        if (handleIntentUrl(data, str3, false, webView, adLandingPageConfig, z2, false, c1035880d3y, interfaceC1036110d4L)) {
            return true;
        }
        if (uri == null || (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(uri, "browser_fallback_url")) == null || strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.length() == 0) {
            return false;
        }
        return handleIntentUrl(UriProtector.parse(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_web_business_jump_AdWebJumpUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra), null, false, webView, adLandingPageConfig, z2, true, c1035880d3y, interfaceC1036110d4L);
    }

    private final void reportHDT(String str, Uri uri, boolean z, boolean z2, boolean z3, Context context, String str2, InterfaceC1036110d4L interfaceC1036110d4L) {
        String string;
        List<String> list;
        if (str == null || str.length() == 0 || uri == null || z || z2 || C1035990d49.LJI(str) || !C2162308dZ.LJ(context, new Intent("android.intent.action.VIEW", UriProtector.parse(str)))) {
            return;
        }
        List<String> autoJumpAllowList = getAutoJumpAllowList(z3);
        String string2 = null;
        if (autoJumpAllowList != null) {
            string = autoJumpAllowList.toString();
        } else {
            string = null;
        }
        AdLandingPageConfig adLandingPageConfigLIZIZ = C1037700d6u.LIZIZ();
        if (adLandingPageConfigLIZIZ != null && (list = adLandingPageConfigLIZIZ.clickJumpAllowList) != null) {
            string2 = list.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The landing page in feed jumps to the third-party app which is controlled by allowlist. \n Jump schema: ");
        sbLIZ.append(str);
        sbLIZ.append(" \n Allowlist: ");
        sbLIZ.append(string);
        sbLIZ.append(' ');
        sbLIZ.append(string2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z3) {
            C822610WOt.LIZ(new C824330WVj(20002, str));
        } else {
            C822610WOt.LIZ(new C824330WVj(20001, str));
        }
    }

    private final boolean handleIntentUrl(Uri uri, String str, boolean z, WebView webView, AdLandingPageConfig adLandingPageConfig, boolean z2, boolean z3, C1035880d3y c1035880d3y, InterfaceC1036110d4L interfaceC1036110d4L) throws Throwable {
        String string;
        String lowerCase;
        if (C1906580ziK.LJI() || uri == null || (string = uri.toString()) == null || c1035880d3y == null) {
            return false;
        }
        Context context = webView.getContext();
        String scheme = uri.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.getDefault());
        } else {
            lowerCase = null;
        }
        if (!blockJump(inAllowList(c1035880d3y, string, lowerCase, str, adLandingPageConfig, c1035880d3y.getAwemeRawAd()), z2, z, adLandingPageConfig) && !C1035990d49.LJI(string)) {
            boolean zInterceptToOpenGooglePlayMiniCard = interceptToOpenGooglePlayMiniCard(context, interfaceC1036110d4L, c1035880d3y.getAwemeRawAd(), uri, z);
            boolean zLIZ = C815740VzI.LIZ(context, UriProtector.parse(string));
            if (!z && zLIZ && C0A1U.LIZ()) {
                C1073990e3R.LIZ(context, new C1038980d8y(interfaceC1036110d4L, string, z, zLIZ, zInterceptToOpenGooglePlayMiniCard), new C1039260d9Q(context, string, str, zInterceptToOpenGooglePlayMiniCard), new AwS165S1100000_16(interfaceC1036110d4L, string, 22));
                return true;
            }
            C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
            c1029270ctJ.getClass();
            int iLIZ = C1029270ctJ.LIZ(true, zLIZ);
            Boolean bool = Boolean.FALSE;
            c1029270ctJ.getClass();
            C1029270ctJ.LIZIZ(interfaceC1036110d4L, string, z, iLIZ, bool, zInterceptToOpenGooglePlayMiniCard);
            if (zInterceptToOpenGooglePlayMiniCard) {
                return true;
            }
            if (Intrinsics.LJFF("market", lowerCase)) {
                C2429609fa.LIZ.getClass();
                C2429609fa.LIZ(uri, webView);
                return true;
            }
            if (!C815740VzI.LIZ(context, UriProtector.parse(string))) {
                return false;
            }
            startAdsAppActivity(context, string, str);
            return true;
        }
        if (z3 && C1035990d49.LJI(string) && !TextUtils.isEmpty(string)) {
            C786410Ut5.ue(webView, string);
            return true;
        }
        return false;
    }
}
