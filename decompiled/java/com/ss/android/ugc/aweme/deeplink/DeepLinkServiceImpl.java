package com.ss.android.ugc.aweme.deeplink;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C07HJ;
import X.C07HK;
import X.C098200Yq;
import X.C0AC4;
import X.C0AGR;
import X.C0B5I;
import X.C0B5N;
import X.C0B5S;
import X.C0B5U;
import X.C0BK8;
import X.C0C64;
import X.C0CO2;
import X.C0CQC;
import X.C0WZX;
import X.C0X96;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C10Y9;
import X.C10YA;
import X.C10YB;
import X.C10YP;
import X.C10Z1;
import X.C11JF;
import X.C1234680iEc;
import X.C1400380mXs;
import X.C1514430pVp;
import X.C1554960qZC;
import X.C189200o6;
import X.C19262710Xp;
import X.C19263710Xz;
import X.C19263810Ya;
import X.C19264210Ye;
import X.C19264310Yf;
import X.C19264410Yg;
import X.C19264910Yl;
import X.C1936507iF;
import X.C1953307kx;
import X.C1962707mT;
import X.C1970107nf;
import X.C1991807rA;
import X.C1AF0;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C2455409jk;
import X.C275880Ara;
import X.C276930AtH;
import X.C277000AtO;
import X.C277180Atg;
import X.C282380B4y;
import X.C786410Ut5;
import X.C844470XAv;
import X.C847090XKx;
import X.C848610XQt;
import X.C854720Xfy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1603190roz;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.provider.impl.GScope;
import com.bytedance.touchpoint.api.service.ICrossPlatformModuleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public class DeepLinkServiceImpl implements IDeepLinkService {
    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJIJ() {
        C19263810Ya.LIZ = null;
        C19263810Ya.LIZIZ = false;
        C19263810Ya.LIZLLL = null;
        C11JF c11jf = C19263810Ya.LIZJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJLI() {
        boolean zLIZ = true;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("ug_disable_opt_insert_feed_for_shortlink", true);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return zLIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJLIIIJJI() {
        C10YP.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJIL() {
        Activity activityLJFF;
        Set set;
        C847090XKx.LIZ.getClass();
        if (((Keva) C847090XKx.LIZIZ.getValue()).getBoolean("keva_deeplink_hack_has_mob", false) || (activityLJFF = C2214201BlK.LJFF()) == null) {
            return;
        }
        PackageManager packageManager = activityLJFF.getPackageManager();
        Intent intent = new Intent();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("tiktok://", new LinkedHashSet()), new Pair("musically://", new LinkedHashSet()), new Pair("snssdk1180://", new LinkedHashSet()), new Pair("snssdk1233://", new LinkedHashSet()));
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJIIJ;
        for (String str : linkedHashMap.keySet()) {
            try {
                intent.setData(UriProtector.parse(str));
                Iterator it2 = C2204961BRm.LJJJJZ(packageManager, intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkga2yAVyZ/cssBXSGYk3UkaU", null)).iterator();
                while (it2.hasNext()) {
                    String str2 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                    if (str2 != null && !C847090XKx.LIZJ.contains(str2) && (set = (Set) linkedHashMap.get(str)) != null) {
                        set.add(str2);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (mapLJIIJ != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapLJIIJ.entrySet()) {
                if (!((Collection) entry.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap2.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("package_map", linkedHashMap2);
            C2344009Gk c2344009Gk = new C2344009Gk();
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                c2344009Gk.LJ(entry2.getValue(), (String) entry2.getKey());
            }
            ((Keva) C847090XKx.LIZIZ.getValue()).storeBoolean("keva_deeplink_hack_has_mob", true);
            C20684815ws.LJIILLIIL("deeplink_hack_info", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJ() {
        C19263710Xz.LJ("TerminalNode");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJI() {
        return ((Boolean) C0B5N.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJLL() {
        C07HJ.LIZ.getClass();
        return C07HJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final int LJJLIIIJL() {
        return ((Number) C0CO2.LIZIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLJLI() {
        return ((Boolean) C0B5U.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLL() {
        C19263710Xz.LIZ.getClass();
        return Intrinsics.LJFF(C19263710Xz.LJIIIZ, "short_to_long");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJZ() {
        C01GW c01gw = C0AGR.LIZ;
        return ((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJL() {
        return ((Boolean) C0B5S.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIFFI() {
        return C0BK8.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final long LJJIII() {
        return C19264310Yf.LIZ().maxTimeLimit;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisableExecuteByGpReferralExperiment: ");
        C01GW c01gw = C0B5I.LIZ;
        sbLIZ.append(((Boolean) c01gw.getValue()).booleanValue());
        C2188811AlT.LIZIZ(sbLIZ);
        return ((Boolean) c01gw.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIJL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisableSetDeeplinkValueExperiment: ");
        C01GW c01gw = C282380B4y.LIZ;
        sbLIZ.append(((Boolean) c01gw.getValue()).booleanValue());
        C2188811AlT.LIZIZ(sbLIZ);
        return ((Boolean) c01gw.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJJL() {
        return !C10Y9.LIZJ() || Intrinsics.LJFF(C19263710Xz.LJIIL, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJLZIJ() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_collect_deeplink_traffic_hack", true) != 1) {
            return false;
        }
        C847090XKx.LIZ.getClass();
        return !((Keva) C847090XKx.LIZIZ.getValue()).getBoolean("keva_deeplink_hack_has_mob", false) && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJILLIZJL() {
        return C19264310Yf.LIZ().isEnable;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJLIIIJJIZ() {
        Class<? extends Activity> homePageInflateActivityClass;
        String name;
        if (!C07HK.LIZ() || !C10YP.LIZ.getValue().getBoolean("keva_applink_hook_enable", false)) {
            return AppLinkHandlerV2.class.getName();
        }
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) PluggableExtentionKt.pluggableSpi$default(HomePageUIFrameService.class, false, false, false, 14, null);
        return (homePageUIFrameService == null || (homePageInflateActivityClass = homePageUIFrameService.getHomePageInflateActivityClass()) == null || (name = homePageInflateActivityClass.getName()) == null) ? "" : name;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJLLLLLLLZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("deeplink_webview_back_to_main_page", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJJLIIJ() {
        if (!C07HK.LIZ() || !C10YP.LIZ.getValue().getBoolean("keva_applink_hook_enable", false)) {
            return AppLinkHandlerV2.class;
        }
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) PluggableExtentionKt.pluggableSpi$default(HomePageUIFrameService.class, false, false, false, 14, null);
        if (homePageUIFrameService != null) {
            return homePageUIFrameService.getHomePageInflateActivityClass();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final int LJLIL() {
        return C19264310Yf.LIZ().maxRecordSize;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String getCustomScheme() {
        return C10Z1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean isAppHot() {
        return C10Y9.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJJJJ() {
        return "snssdk";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJLL() {
        return C10YP.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final long LJJJLIIL() {
        return C19263710Xz.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJ(String str) {
        if (!C2093608Ic.LJ(str)) {
            try {
                String scheme = UriProtector.parse(str).getScheme();
                String strLIZ = C10Z1.LIZ();
                if (Intrinsics.LJFF("sslocal", scheme) || Intrinsics.LJFF("localsdk", scheme)) {
                    str = u.LJJIFFI(str, scheme, strLIZ, false);
                    return str;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJI(String str) {
        if (!C2093608Ic.LJ(str)) {
            if (!Intrinsics.LJFF("sslocal", str)) {
                String strLIZ = C10Z1.LIZ();
                if (!C2093608Ic.LJ(strLIZ) && Intrinsics.LJFF(strLIZ, str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJII(Context context) {
        return context instanceof DeepLinkActivityV2;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIIJZLJL(Activity activity) {
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null && iDeepLinkService.LJLIIIL(activity)) {
            if (C10Y9.LIZJ() && !Intrinsics.LJFF(C19263710Xz.LJIIL, Boolean.TRUE)) {
                return false;
            }
            return true;
        }
        if (!C1400380mXs.LIZ().LIZ && !activity.isTaskRoot()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJIIZ(Context context) {
        String stringExtra;
        if (context instanceof DeepLinkActivityV2) {
            try {
                stringExtra = ((BaseActivity) context).getIntent().getStringExtra("from_notification_uuid");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIIZI(String str) {
        return C10Z1.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJIJIIJI(Uri uri) {
        C1953307kx.LIZ.getClass();
        return C1953307kx.LIZJ(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Map<String, String> LJJIJLIJ(String str) {
        HashMap map = new HashMap();
        for (String str2 : a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6)) {
            if (a0.LJJIIZI(str2, "=", false)) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{"="}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() > 1) {
                    map.put(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                }
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIZ(String str) {
        if (str == null) {
            return false;
        }
        C01GW c01gw = C19264410Yg.LIZ;
        boolean zContains = ((Set) c01gw.getValue()).contains(str);
        if (!zContains) {
            return zContains;
        }
        ((Set) c01gw.getValue()).remove(str);
        return zContains;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJI(BaseActivity baseActivity) {
        if (C07HK.LIZ()) {
            if (C10YP.LIZJ) {
                C10YP.LIZJ = false;
                if (((Boolean) C0AC4.LIZ.getValue()).booleanValue()) {
                    return;
                }
            }
            if (C1514430pVp.LIZLLL().booleanValue()) {
                return;
            }
            C01GW<Keva> c01gw = C10YP.LIZ;
            if (c01gw.getValue().getBoolean("keva_applink_hook_enable", false) || !C2455409jk.LIZ(baseActivity, "com.ss.android.ugc.aweme.splash.ApplinkHookActivity", "com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2")) {
                return;
            }
            c01gw.getValue().storeBoolean("keva_applink_hook_enable", true);
            return;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("reset_applink_activity_alias_setting", false)) {
                return;
            }
            C01GW<Keva> c01gw2 = C10YP.LIZ;
            if (!c01gw2.getValue().getBoolean("keva_applink_hook_enable", false) || !C2455409jk.LIZ(baseActivity, "com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2", "com.ss.android.ugc.aweme.splash.ApplinkHookActivity")) {
                return;
            }
            c01gw2.getValue().storeBoolean("keva_applink_hook_enable", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJIZL(Intent intent) {
        C19263710Xz.LIZ.getClass();
        C19263710Xz.LIZ(intent);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJJL(Aweme aweme) {
        String str;
        boolean z;
        if (aweme == null || ((Number) C0AGR.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        C1234680iEc c1234680iEc = null;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "ug_deeplink_insert_feed_swipe_up_key", C1234680iEc.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1234680iEc = (C1234680iEc) interfaceC1555100qZQLIZIZ.getSource()) == null || (str = c1234680iEc.LL) == null) {
            str = "";
        }
        if (c1234680iEc != null) {
            z = c1234680iEc.LLILZ;
        } else {
            z = false;
        }
        if (!Intrinsics.LJFF(str, aweme.getAid()) || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJZ(String str) {
        C0X96.LIZ.getClass();
        boolean zLJJIIJZLJL = false;
        try {
            Uri uri = UriProtector.parse(str);
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(host);
            sbLIZ.append(path);
            zLJJIIJZLJL = u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "aweme/detail/", false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(zLJJIIJZLJL);
            sbLIZ2.append(' ');
            sbLIZ2.append(host);
            sbLIZ2.append(path);
            C2188811AlT.LIZIZ(sbLIZ2);
            return zLJJIIJZLJL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLJJIIJZLJL;
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJLIIIIJ(String str) {
        C19263710Xz.LJFF(str);
        return DeepLinkActivityV2.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJLJLI(Uri uri) {
        if (uri != null && uri.isHierarchical() && Intrinsics.LJFF(uri.getScheme(), "https")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJZZI(Uri uri) {
        return C19262710Xp.LIZIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJLI(String str) {
        C19263710Xz.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJLIIIL(Activity activity) {
        return activity instanceof InterfaceC1603190roz;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJLIIL(String str) {
        boolean z;
        C10YA.LIZ.getClass();
        try {
            if (C10YA.LIZJ(UriProtector.parse(str))) {
                return C10YA.LJ(str);
            }
            return C10YA.LIZLLL(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (((Boolean) C275880Ara.LIZ.getValue()).booleanValue()) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("transUrlToLong: ");
                    sbLIZ.append(str);
                    C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
                    return "";
                }
                return "";
            }
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Uri LJLJI(Uri uri) {
        return new C10YB().LIZ(uri, null);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final Class<? extends Activity> LJLJJI(String str) {
        C19263710Xz.LJFF(str);
        return DeepLinkActivityV2.class;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJIJIIJIL(Aweme aweme, String str) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1234680iEc c1234680iEc;
        boolean z;
        if (aweme == null || Intrinsics.LJFF(str, "trigger_time_play_completed") || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "ug_deeplink_insert_feed_swipe_up_key", C1234680iEc.class, null)) == null || (c1234680iEc = (C1234680iEc) interfaceC1555100qZQLIZIZ.getSource()) == null || !c1234680iEc.LLILZ) {
            return false;
        }
        C01GW c01gw = C0AGR.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
            z = false;
        } else {
            z = true;
        }
        if (Intrinsics.LJFF(str, "trigger_time_play_completed") || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJJIL(String str, String str2) {
        return C10Y9.LIZLLL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJL(boolean z, Uri uri) {
        String host;
        ICrossPlatformModuleService iCrossPlatformModuleService;
        String path;
        if (!z) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = "";
        if (uri == null || (host = uri.getHost()) == null) {
            host = "";
        }
        sbLIZ.append(host);
        if (uri != null && (path = uri.getPath()) != null) {
            str = path;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (u.LJJIIJZLJL(strLIZIZ, "aweme/detail/", false)) {
            return C1970107nf.LIZ(uri);
        }
        if (!u.LJJIIJZLJL(strLIZIZ, "notification", false) && !u.LJJIIJZLJL(strLIZIZ, "friends_tab", false)) {
            if (u.LJJIIJZLJL(strLIZIZ, "chat/", false)) {
                return ((Boolean) C277000AtO.LIZ.getValue()).booleanValue();
            }
            if (uri == null || (iCrossPlatformModuleService = (ICrossPlatformModuleService) PluggableExtentionKt.pluggableSpi$default(ICrossPlatformModuleService.class, false, false, false, 14, null)) == null || !iCrossPlatformModuleService.LIZ(uri)) {
                return false;
            }
            return ((Boolean) C276930AtH.LIZ.getValue()).booleanValue();
        }
        return ((Boolean) C277180Atg.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIL(String str, String str2) {
        return C10Y9.LJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLJ(Activity activity, C1962707mT c1962707mT) {
        Uri data;
        Intent intent = activity.getIntent();
        if (intent != null) {
            data = intent.getData();
        } else {
            data = null;
        }
        if (C848610XQt.LIZIZ(data)) {
            C848610XQt.LIZJ(activity, "from_app_link", c1962707mT);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String LJJZZIII(String str, Map map) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            String str2 = (String) map.get(str);
            if (str2 == null) {
                str2 = "";
            }
            c098200Yq = URLDecoder.decode(str2, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = "";
        }
        String str3 = (String) c098200Yq;
        if (Intrinsics.LJFF(str, "af_dp")) {
            try {
                c098200Yq2 = UriProtector.parse(str3);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Uri uri = (Uri) c098200Yq2;
            if (uri == null || uri.getScheme() == null) {
                return "";
            }
        }
        return str3;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJLILLLLZI(String str, String str2) {
        C19264210Ye.LIZ.onNext(new C19264910Yl(str));
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJIJIL(Activity activity, String str, C1962707mT c1962707mT) {
        ILoginService iLoginServiceLIZJ;
        C0CQC c0cqc = C0CQC.LIZ;
        c0cqc.getClass();
        C0CQC.LIZIZ.put("require_login", Long.valueOf(SystemClock.elapsedRealtime()));
        if (((activity instanceof DeepLinkActivityV2) || (c1962707mT != null && c1962707mT.LIZ)) && ((Boolean) C1936507iF.LIZ.getValue()).booleanValue()) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                C786410Ut5.re(Toast.makeText(activity, "show login in host", 0));
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_fullscreen_dialog", true);
            bundle.putBoolean("is_skippable_dialog", false);
            bundle.putBoolean("need_callback", true);
            bundle.putBoolean("is_disable_animation", true);
            C854720Xfy c854720Xfy = new C854720Xfy(activity, 4);
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZIZ = "deeplink";
            c0xqs.LIZ = activity;
            c0xqs.LJ = c854720Xfy;
            c0xqs.LIZLLL = bundle;
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null && (iLoginServiceLIZJ = iAccountService.LIZJ()) != null) {
                C0CQC.LIZ(c0cqc);
                iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
                return;
            }
            return;
        }
        C848610XQt.LIZJ(activity, str, c1962707mT);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJ(android.content.Context r19, android.content.Intent r20, java.lang.String r21) {
        /*
            r18 = this;
            android.app.Activity r2 = X.C085T.LIZ(r19)
            r13 = 0
            if (r2 != 0) goto L8
            return r13
        L8:
            r3 = r21
            int r1 = r3.hashCode()
            r0 = -794493806(0xffffffffd0a4fc92, float:-2.2144127E10)
            if (r1 == r0) goto L5a
            r0 = 96432(0x178b0, float:1.3513E-40)
            if (r1 == r0) goto L45
            r0 = 3343801(0x3305b9, float:4.685663E-39)
            if (r1 != r0) goto L88
            java.lang.String r0 = "main"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L88
            X.01GW r0 = X.C257500A7g.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L31:
            if (r0 == 0) goto L88
            java.lang.Class<com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService> r12 = com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService.class
            r16 = 14
            r7 = 0
            r14 = r13
            r15 = r13
            r17 = r7
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService r1 = (com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService) r1
            if (r1 != 0) goto L6f
            return r13
        L45:
            java.lang.String r0 = "ads"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L88
            X.01GW r0 = X.C257480A7e.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L31
        L5a:
            java.lang.String r0 = "appBase"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L88
            X.01GW r0 = X.C257490A7f.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L31
        L6f:
            java.lang.String r0 = "saf_in_app_deeplink"
            r1.LIZ(r0)
            X.07mT r3 = new X.07mT
            r4 = 1
            java.lang.String r6 = "saf_in_app_deeplink"
            r12 = 248(0xf8, float:3.48E-43)
            r5 = r20
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.LIZIZ(r2, r5, r13, r3)
            return r4
        L88:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl.LJJJ(android.content.Context, android.content.Intent, java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJZ(int i, Uri uri, String str) {
        C19263710Xz.LIZLLL(i, uri, "Transfer");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJLI(int i, String str, String str2) {
        C19263710Xz.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("awemeId", str);
        c2344009Gk.LJIIIIZZ("ugdp_id", str2);
        c2344009Gk.LIZJ(i, "type");
        C20684815ws.LJIILLIIL("intercept_insert_feed", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean LJJLIIIJ(Context context, String str, String str2) {
        C1991807rA.LIZ().getClass();
        return C1991807rA.LIZIZ(context, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void LJJJJZI(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        int i;
        C1953307kx.LIZ.getClass();
        int i2 = 0;
        if (!C1953307kx.LIZLLL(str2) && !C1953307kx.LIZLLL(str3)) {
            if (C1953307kx.LIZLLL(str) && Intrinsics.LJFF(str4, "1") && z2) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
            i2 = 1;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i2, "af_success");
        c2344009Gk.LIZJ(i, "gp_success");
        c2344009Gk.LJIIIIZZ("ugdp_id", str5);
        c2344009Gk.LJIIIIZZ("utm_source", str6);
        c2344009Gk.LIZJ(z ? 1 : 0, "deep_link_value");
        C20684815ws.LJIILLIIL("sharing_gp_referer", c2344009Gk.LIZ);
        if (i == 1) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("ugdp_id", str5);
            c2344009Gk2.LJIIIIZZ("url", str);
            c2344009Gk2.LJIIIIZZ("utm_source", str6);
            c2344009Gk2.LIZJ(z ? 1 : 0, "deep_link_value");
            C20684815ws.LJIILLIIL("gp_conversation_success", c2344009Gk2.LIZ);
        }
    }
}
