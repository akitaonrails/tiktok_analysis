package com.ss.android.ugc.aweme.minis.service;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C08S3;
import X.C09V3;
import X.C0C64;
import X.C0CSU;
import X.C0XQ7;
import X.C1006570cIh;
import X.C1007030cJR;
import X.C1007120cJa;
import X.C1227904rF;
import X.C123100dR;
import X.C13LP;
import X.C1529420pu0;
import X.C1529600puI;
import X.C15438062q;
import X.C1549060qPg;
import X.C1720106oR;
import X.C1842220y2W;
import X.C1869270yk9;
import X.C1918407fK;
import X.C19343310lz;
import X.C1943007jI;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189341AmK;
import X.C2194311AuL;
import X.C2195221Avo;
import X.C2196211AxP;
import X.C2196701AyC;
import X.C2196731AyF;
import X.C2196871AyT;
import X.C2197221Az2;
import X.C23250099c;
import X.C2344009Gk;
import X.C297050Bkd;
import X.C452501pT;
import X.C844470XAv;
import X.EnumC1222620hvA;
import X.InterfaceC1037660d6q;
import X.InterfaceC1057480dco;
import X.InterfaceC1057490dcp;
import X.InterfaceC1541990qEH;
import X.InterfaceC215300sJ;
import X.InterfaceC2196861AyS;
import X.InterfaceC2196941Aya;
import X.InterfaceC497601wk;
import X.InterfaceC713890RzP;
import X.InterfaceC815880VzW;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.minis.api.MinisRawAdInfo;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.exp.MinisPreloadConfig;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.minis.performance.video.MinisVideoPreloadFetcher;
import com.ss.android.ugc.aweme.minis.route.MinisTokenRouteAction;
import com.ss.android.ugc.aweme.minis.settings.MinisPerfConfigSettings;
import com.ss.android.ugc.aweme.services.IMainService;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public class MinisServiceImpl implements IMinisApiService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(90));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(89));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(91));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(88));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(87));

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public boolean LJJIIJZLJL() {
        return this instanceof CoinMinisServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final InterfaceC1057480dco LIZIZ() {
        return (InterfaceC1057480dco) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final InterfaceC1057490dcp LIZJ() {
        return (InterfaceC1057490dcp) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final InterfaceC215300sJ LJIIJJI() {
        return (InterfaceC215300sJ) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final InterfaceC815880VzW LJJI() {
        return new InterfaceC815880VzW() { // from class: X.0mQR
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC815880VzW
            public final C0WHU LIZIZ() {
                return null;
            }

            @Override // X.InterfaceC815880VzW
            public final String LIZJ() {
                return "home_screen_icon_minis";
            }

            @Override // X.InterfaceC815880VzW
            public final boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC815880VzW
            public final String getType() {
                return "minis";
            }

            @Override // X.InterfaceC815880VzW
            public final boolean isEnable() {
                return true;
            }

            @Override // X.InterfaceC815880VzW
            public final List<String> LIZ() {
                String str;
                Pair pair;
                C1395660mQG.LIZ.getClass();
                SchemaParserData schemaParserData = C2195221Avo.LJII;
                String str2 = "";
                if (schemaParserData == null || (str = schemaParserData.schemaUrl) == null) {
                    str = "";
                }
                if (schemaParserData != null) {
                    String string = schemaParserData.schemaUrl;
                    C13BV<String> c13bv = C13BV.INSTANCE;
                    if (!(string == null || string.length() == 0)) {
                        try {
                            Uri uri = UriProtector.parse(string);
                            Uri.Builder builderPath = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
                            for (String str3 : c13bv) {
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3);
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                    builderPath.appendQueryParameter(str3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                }
                            }
                            String fragment = uri.getFragment();
                            if (!(fragment == null || fragment.length() == 0)) {
                                builderPath.fragment(fragment);
                            }
                            string = builderPath.build().toString();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (string == null || string.length() == 0) {
                        int i = C2187451AjH.LIZ;
                    } else {
                        TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData.tiktokMinisParams;
                        String strEncode = null;
                        TiktokMinisQueryParams tiktokMinisQueryParams2 = tiktokMinisQueryParams != null ? new TiktokMinisQueryParams(tiktokMinisQueryParams.ttmgInitModule, tiktokMinisQueryParams.enterFrom, tiktokMinisQueryParams.minisName, tiktokMinisQueryParams.minisIconUrl, tiktokMinisQueryParams.minisCategory, tiktokMinisQueryParams.logExtra, tiktokMinisQueryParams.adSignalParams) : null;
                        if (tiktokMinisQueryParams2 == null) {
                            tiktokMinisQueryParams2 = new TiktokMinisQueryParams(null, null, null, null, null, null, null);
                        }
                        tiktokMinisQueryParams2.enterFrom = "desktop_shortcut";
                        tiktokMinisQueryParams2.logExtra = null;
                        tiktokMinisQueryParams2.adSignalParams = null;
                        C1227904rF.LIZ.getClass();
                        String strLJI = C1227904rF.LJI(tiktokMinisQueryParams2);
                        if (C123100dR.LIZ(strLJI)) {
                            try {
                                strEncode = URLEncoder.encode(strLJI, "UTF-8");
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                strEncode = strLJI;
                            }
                        }
                        if (strEncode != null) {
                            string = C1943007jI.LIZ(string, "_tiktok_minis_params", strEncode);
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getUrlWithoutThirdPartyParams, url:");
                            sbLIZ.append(string);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        String str4 = schemaParserData.pathWithOutParams;
                        if (str4 != null && string != null) {
                            if (!(str4.length() == 0)) {
                                if (a0.LJJIIZI(string, "?", false)) {
                                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{"?"}, 2, 2);
                                    pair = new Pair(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1));
                                } else {
                                    pair = new Pair(string, "");
                                }
                                String str5 = (String) pair.getFirst();
                                String str6 = (String) pair.getSecond();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append('/');
                                sbLIZ2.append(str4);
                                sbLIZ2.append("(?=/|$)");
                                string = new Regex(C2188811AlT.LIZIZ(sbLIZ2)).replace(str5, "");
                                if (str6.length() > 0) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(string);
                                    sbLIZ3.append('?');
                                    sbLIZ3.append(str6);
                                    string = C2188811AlT.LIZIZ(sbLIZ3);
                                }
                            }
                        }
                    }
                    if (string != null) {
                        str2 = string;
                    }
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getSchemaUrlWithOutSchema, schemaUrl:");
                sbLIZ4.append(str);
                sbLIZ4.append(", targetUrl:");
                sbLIZ4.append(str2);
                C2188811AlT.LIZIZ(sbLIZ4);
                return Collections.singletonList(str2);
            }

            @Override // X.InterfaceC815880VzW
            public final String LIZLLL() {
                C1395660mQG.LIZ.getClass();
                return C1395660mQG.LIZ();
            }

            @Override // X.InterfaceC815880VzW
            public final String LJFF() {
                String str;
                C1395660mQG.LIZ.getClass();
                MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                if (minisMetaResp == null || (str = minisMetaResp.iconUrl) == null) {
                    str = "";
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMinisIconUrl, iconUrl:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return str;
            }

            @Override // X.InterfaceC815880VzW
            public final String LJ(Context context) {
                String str;
                C1395660mQG.LIZ.getClass();
                MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                if (minisMetaResp == null || (str = minisMetaResp.name) == null) {
                    str = "";
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMinisName, name:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("label, name:");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                return str;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final boolean LJJIFFI() {
        boolean z = C19343310lz.LIZ;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "minis_profile_entry_education_enabled", true) == 1) {
            int i = Keva.getRepo("repo_minis_auto_open_profile_more").getInt("minis_auto_open_profile_more_count", 0);
            z = i < 3;
            Keva.getRepo("repo_minis_auto_open_profile_more").storeInt("minis_auto_open_profile_more_count", i + 1);
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final InterfaceC713890RzP LJJIII() {
        return (InterfaceC713890RzP) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final InterfaceC2196861AyS xm() {
        return (InterfaceC2196861AyS) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJJIIJ() {
        boolean z = C19343310lz.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LIZ(Map<String, String> map) {
        C2196701AyC.LIZ.getClass();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map2.put("is_red_dot_shown", Integer.valueOf(C19343310lz.LIZIZ ? 1 : 0));
        map2.put("is_revisit_guidance_popup_shown", Integer.valueOf(C19343310lz.LIZ ? 1 : 0));
        if (C19343310lz.LIZ) {
            map2.put("popup_type", "words");
        }
        map2.put("is_minis_revisit_edu", 0);
        map2.put("click_action", "click_enter_center");
        C2196701AyC.LJJIFFI(map2, map);
        C08S3.LIZLLL("minis_profile_entrance_click", map2, map3, null);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final boolean LJFF(Fragment fragment) {
        InterfaceC1541990qEH kitView;
        WebKitView webKitView;
        InterfaceC1541990qEH kitView2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        boolean zLJJIII = false;
        if (fragment instanceof MinisFragment) {
            MinisFragment minisFragment = (MinisFragment) fragment;
            minisFragment.getClass();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInterceptBackPress, fragment:");
            sbLIZ.append(fragment);
            C2188811AlT.LIZIZ(sbLIZ);
            if (minisFragment.hS() != null) {
                if (minisFragment.LLJLLIL == null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = minisFragment.LLJ) != null) {
                    zLJJIII = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIII();
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = minisFragment.LLJ;
                Boolean boolValueOf = null;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView();
                } else {
                    kitView = null;
                }
                if (kitView instanceof WebKitView) {
                    webKitView = (WebKitView) kitView;
                } else {
                    webKitView = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onInterceptBackPress, isWebGoBack:");
                sbLIZ2.append(zLJJIII);
                sbLIZ2.append(", minisLoadError:");
                sbLIZ2.append(minisFragment.LLJLLIL);
                sbLIZ2.append(", getKitView:");
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = minisFragment.LLJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                    kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView();
                } else {
                    kitView2 = null;
                }
                sbLIZ2.append(kitView2);
                sbLIZ2.append(", webview canGoBack:");
                if (webKitView != null) {
                    boolValueOf = Boolean.valueOf(webKitView.canGoBack());
                }
                sbLIZ2.append(boolValueOf);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return zLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJII(List list) {
        SchemaParserData schemaParserData;
        String str;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadAll, schemaList:");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        C2189341AmK c2189341AmK = C2189341AmK.LIZ;
        List<SchemaParserData> listLIZ = C1869270yk9.LIZ(list);
        c2189341AmK.getClass();
        if (listLIZ != null) {
            C844470XAv.LIZ.getClass();
            C2189341AmK.LIZ(C844470XAv.LIZ());
            if (((Number) C297050Bkd.LIZ.getValue()).intValue() == 1) {
                SchemaParserData schemaParserData2 = (SchemaParserData) C13LP.LJJJLL(listLIZ);
                if (schemaParserData2 != null) {
                    C1529600puI c1529600puI = C1529600puI.LIZ;
                    long j = ((MinisPreloadConfig) C2189341AmK.LJ.getValue()).delayPreloadTriggerDuration;
                    c1529600puI.getClass();
                    C1529600puI.LJIIIIZZ(schemaParserData2, j, null);
                }
                if (listLIZ.size() > 1) {
                    C2189341AmK.LIZIZ(C13LP.LJJJJIZL(listLIZ, 1), AFwS281S0000000_34.get$arr$(41));
                }
            } else {
                C2189341AmK.LIZIZ(listLIZ, new AwS602S0100000_23(listLIZ, (List<SchemaParserData>) 34));
            }
            boolean z = MinisPerfConfigSettings.LIZ().mainFramePreloadEnable;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preloadMainFrameByScene, value:");
            sbLIZ2.append(MinisPerfConfigSettings.LIZ());
            C2188811AlT.LIZIZ(sbLIZ2);
            if (z) {
                for (SchemaParserData schemaParserData3 : listLIZ) {
                    if (schemaParserData3.clientKey != null) {
                        C1549060qPg.LIZIZ(schemaParserData3);
                        C1549060qPg.LIZ(schemaParserData3);
                    }
                }
            }
            boolean z2 = MinisPerfConfigSettings.LIZ().videoPreloadEnable;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("preloadVideoResourceByScene, value:");
            sbLIZ3.append(MinisPerfConfigSettings.LIZ());
            C2188811AlT.LIZIZ(sbLIZ3);
            if (z2 && (schemaParserData = (SchemaParserData) C13LP.LJJJLL(listLIZ)) != null && (str = schemaParserData.videoResourcePreloadUrl) != null && str.length() != 0) {
                MinisVideoPreloadFetcher.Companion.getClass();
                C1529420pu0.LIZ(schemaParserData);
                C844470XAv.LIZ.getClass();
                C09V3.LIZ(C844470XAv.LIZ(), schemaParserData);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIIJ(Map<String, String> map) {
        C2196701AyC.LIZ.getClass();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map2.put("is_red_dot_shown", Integer.valueOf(C19343310lz.LIZIZ ? 1 : 0));
        map2.put("is_revisit_guidance_popup_shown", Integer.valueOf(C19343310lz.LIZ ? 1 : 0));
        if (C19343310lz.LIZ) {
            map2.put("popup_type", "words");
        }
        map2.put("is_minis_revisit_edu", 0);
        C2196701AyC.LJJIFFI(map2, map);
        C08S3.LIZLLL("minis_profile_entrance_show", map2, map3, null);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIIL(boolean z) {
        boolean z2 = C19343310lz.LIZ;
        C19343310lz.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final String LJIIZILJ(Uri uri) {
        MinisTokenRouteAction.Companion.getClass();
        return C1918407fK.LIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIJI(Fragment fragment) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initPage, fragment:");
        sbLIZ.append(fragment);
        C2188811AlT.LIZIZ(sbLIZ);
        if (fragment instanceof MinisFragment) {
            ((MinisFragment) fragment).rS();
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIJJ(boolean z) {
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        C2196701AyC.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_data_privacy_non_data_shared_page_show", map);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIJJLI(Fragment fragment) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisAdsVideoSlideOut, fragment:");
        sbLIZ.append(fragment);
        C2188811AlT.LIZIZ(sbLIZ);
        if (fragment instanceof MinisFragment) {
            MinisFragment minisFragment = (MinisFragment) fragment;
            minisFragment.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onMinisAdsVideoSlideOut, fragment:");
            sbLIZ2.append(minisFragment);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (minisFragment.hS() != null) {
                C2196211AxP c2196211AxP = minisFragment.LLLIILIL;
                Window window = minisFragment.getWindow();
                c2196211AxP.getClass();
                if (window != null) {
                    window.clearFlags(8192);
                }
                minisFragment.LLLIIL = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final Map<String, String> LJJII(String str) {
        Map<String, ? extends Object> map;
        try {
            Uri uri = UriProtector.parse(str);
            SchemaParserData schemaParserData = new SchemaParserData(0);
            schemaParserData.LJIIL(uri);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData.tiktokMinisParams;
            if (tiktokMinisQueryParams != null) {
                map = tiktokMinisQueryParams.logExtra;
            } else {
                map = null;
            }
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && value != null) {
                        linkedHashMap.put(key, value.toString());
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final Pair<String, String> LJJIIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i = C2187451AjH.LIZ;
            return null;
        }
        Uri uri = UriProtector.parse(str);
        if (uri == null) {
            int i2 = C2187451AjH.LIZ;
            return null;
        }
        SchemaParserData schemaParserData = new SchemaParserData(0);
        schemaParserData.LJIIL(uri);
        String str2 = schemaParserData.clientKey;
        if (str2 == null) {
            str2 = "";
        }
        return new Pair<>(str2, schemaParserData.LJFF());
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void init(Context context) {
        int i = C2187451AjH.LIZ;
        C2189341AmK.LIZ.getClass();
        C2189341AmK.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final boolean LIZLLL(BaseActivity baseActivity, Uri uri) {
        boolean z;
        if (!C1006570cIh.LIZ().enabled) {
            return false;
        }
        if (baseActivity == null) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "client_key");
        String str = "";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "content_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "token");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0 && str.length() != 0) {
            C0CSU.LIZ.getClass();
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("launch, clientKey:");
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            sbLIZ.append(", contentId:");
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            sbLIZ.append(", token:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("launch entry clientKey=");
            sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            sbLIZ2.append(" contentId=");
            sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1007120cJa.LIZ();
            IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
            if (iMainService == null || !iMainService.isAppHot()) {
                C1007120cJa.LIZ();
                SmartRouter.buildRoute(baseActivity, "//main").open();
            }
            C23250099c.LIZLLL((InterfaceC497601wk) C0CSU.LIZIZ.getValue(), null, null, new C1007030cJR(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, baseActivity, null), 3);
            return true;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleMinisInstantPlayPreviewQrScan, invalid params, clientKey:");
        sbLIZ3.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        sbLIZ3.append(", contentId:");
        sbLIZ3.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        sbLIZ3.append(", token:");
        sbLIZ3.append(str);
        C2188811AlT.LIZIZ(sbLIZ3);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJI(Fragment fragment, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisFragmentVisible, fragment:");
        sbLIZ.append(fragment);
        sbLIZ.append(", visible:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (fragment instanceof MinisFragment) {
            ((MinisFragment) fragment).yS(fragment, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final String LJIIIIZZ(String str, String str2) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str2.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                try {
                    Uri uri = UriProtector.parse(str);
                    SchemaParserData schemaParserData = new SchemaParserData(0);
                    schemaParserData.LJIIL(uri);
                    return schemaParserData.LJIILJJIL(str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("appendAnchorClickIdToSchema, exception:");
                    sbLIZ.append(e);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIIIZ(BaseActivity baseActivity, Uri uri) {
        String str;
        String strDecode;
        Object obj;
        String encodedQuery = uri.getEncodedQuery();
        String str2 = "";
        if (encodedQuery == null) {
            str = "";
            strDecode = "";
        } else {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(encodedQuery, new String[]{"&"}, 0, 6);
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                Object obj2 = ListProtector.get(listLJJLIIIJILLIZJL2, 0);
                if (listLJJLIIIJILLIZJL2.size() <= 1) {
                    obj = "";
                } else {
                    obj = ListProtector.get(listLJJLIIIJILLIZJL2, 1);
                }
                Pair pair = new Pair(obj2, obj);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            String str3 = (String) linkedHashMap.get("client_key");
            if (str3 == null) {
                str3 = "";
            }
            if (C2197221Az2.LIZ(str3)) {
                String str4 = (String) linkedHashMap.get("runtimeUrl");
                if (str4 == null) {
                    str4 = "";
                }
                try {
                    strDecode = URLDecoder.decode(str4, "utf-8");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strDecode = "";
                }
                String str5 = (String) linkedHashMap.get("minisUrl");
                if (str5 != null) {
                    str2 = str5;
                }
                str = str2;
                str2 = str3;
            } else {
                str = (String) linkedHashMap.get("url");
                if (str == null) {
                    str = "";
                }
                strDecode = "";
                str2 = str3;
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMinisAppDebugLinkQrScan, clientKey:");
        sbLIZ.append(str2);
        sbLIZ.append(", debugRuntimeUrl:");
        sbLIZ.append(strDecode);
        sbLIZ.append(", url:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aweme://minis/");
        sbLIZ2.append(str2);
        sbLIZ2.append("/debug;url=");
        sbLIZ2.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleMinisAppDebugLinkQrScan, newUri:");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(", url:");
        sbLIZ3.append(str);
        C2188811AlT.LIZIZ(sbLIZ3);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(baseActivity, strLIZIZ);
        smartRouteBuildRoute.withParam("client_key", str2);
        smartRouteBuildRoute.withParam("runtime_url", strDecode);
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final String LJIILIIL(String str, String str2) {
        Map map;
        Map<String, Map<String, Map<String, String>>> map2 = C2194311AuL.LLILLL;
        Map map3 = (Map) ((LinkedHashMap) C2194311AuL.LLILLL).get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (map3 != null && (map = (Map) map3.get(str)) != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIJ(C2344009Gk c2344009Gk, String str) {
        Map<String, String> mapLIZLLL;
        C2196701AyC.LIZ.getClass();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ(str, map);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJ(Activity activity, Uri uri, boolean z) {
        if (Intrinsics.LJFF(uri.getHost(), "minis_krypton")) {
            SmartRouter.buildRoute(activity, "//minis_krypton").open();
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMinisSnsDeepLink, isAppHot:");
        sbLIZ.append(z);
        sbLIZ.append(", uri:");
        sbLIZ.append(uri);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            SmartRouter.buildRoute(activity, "//main").open();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, uri.buildUpon().scheme("").build().toString());
        smartRouteBuildRoute.withParam("enter_method", "minis_link");
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final String LJIILL(String str, String str2, MinisRawAdInfo minisRawAdInfo) {
        if (str != null && str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            SchemaParserData schemaParserData = new SchemaParserData(0);
            schemaParserData.LJIIL(uri);
            TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData.tiktokMinisParams;
            if (tiktokMinisQueryParams != null) {
                tiktokMinisQueryParams.enterFrom = str2;
                tiktokMinisQueryParams.adSignalParams = minisRawAdInfo;
            }
            String strValueOf = schemaParserData.schemaUrl;
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(tiktokMinisQueryParams);
            if (strLJI != null) {
                strValueOf = String.valueOf(C1943007jI.LJI(schemaParserData.schemaUri, strLJI));
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getNewSchemaUrl, currentSchemaUrl:");
            sbLIZ.append(str);
            sbLIZ.append(", customAdsCustomEnterFrom:");
            sbLIZ.append(str2);
            sbLIZ.append(", result:");
            sbLIZ.append(strValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            return strValueOf;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getNewSchemaUrl, currentSchemaUrl:empty, customAdsCustomEnterFrom:");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        return str;
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final void LJIILLIIL(Uri uri, String str, BaseActivity baseActivity) {
        MinisTokenRouteAction.Companion.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMinisAppLinkQrScan, token:");
        sbLIZ.append(str);
        sbLIZ.append(", uri:");
        sbLIZ.append(uri);
        C2188811AlT.LIZIZ(sbLIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(baseActivity, "//minis_internal/token");
        smartRouteBuildRoute.withParam("minis_token", str);
        smartRouteBuildRoute.withParam("minis_scene", "scan_qr");
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final boolean LJIL(BaseActivity baseActivity, Uri uri, boolean z) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 3) {
            return false;
        }
        if ((Intrinsics.LJFF(ListProtector.get(pathSegments, 0), "ttmg") || Intrinsics.LJFF(ListProtector.get(pathSegments, 0), "ttms")) && Intrinsics.LJFF(ListProtector.get(pathSegments, 1), "dev")) {
            String str = (String) ListProtector.get(pathSegments, 2);
            if (C123100dR.LIZ(str)) {
                String query = uri.getQuery();
                StringBuilder sb = new StringBuilder();
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://minis/");
                    sbLIZ.append(str);
                    sbLIZ.append("/native_debug_flag;url=");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("aweme://minis/");
                    sbLIZ2.append(str);
                    sbLIZ2.append("/minis_debug_flag;url=");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (query != null && query.length() != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('?');
                    sbLIZ3.append(query);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(baseActivity, sb.toString());
                smartRouteBuildRoute.withParam("client_key", str);
                smartRouteBuildRoute.open();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(X.C1024540clg r5, X.EnumC2196771AyJ r6, java.util.List r7) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.service.MinisServiceImpl.LJJ(X.0clg, X.1AyJ, java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMinisApiService
    public final Fragment LJIILJJIL(String str, Integer num, Integer num2, InterfaceC2196941Aya interfaceC2196941Aya, InterfaceC1037660d6q interfaceC1037660d6q) {
        Object obj = C1842220y2W.LIZ;
        if (str != null && str.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Uri uri = UriProtector.parse(str);
            SchemaParserData schemaParserData = new SchemaParserData(0);
            schemaParserData.LJIIL(uri);
            String str2 = schemaParserData.host;
            if (!"minis".equals(str2)) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMinisFragment, host:");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                return null;
            }
            try {
                C1842220y2W.LIZJ(schemaParserData);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("minis-MinisFragmentRoute", "trackBurstAndReportIfNeeded failed, swallowed", th);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C2196871AyT c2196871AyT = C2196731AyF.LIZ;
            C2196731AyF c2196731AyF = C2196731AyF.LIZIZ;
            if (c2196731AyF == null) {
                synchronized (c2196871AyT) {
                    try {
                        c2196731AyF = C2196731AyF.LIZIZ;
                        if (c2196731AyF == null) {
                            c2196731AyF = new C2196731AyF();
                            C2196731AyF.LIZIZ = c2196731AyF;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
            MinisFragment minisFragmentLIZ = C2196731AyF.LIZ(c2196731AyF, schemaParserData, null, null, num, num2, 4);
            minisFragmentLIZ.LLLIZZ = interfaceC2196941Aya;
            minisFragmentLIZ.getClass();
            minisFragmentLIZ.LLLJ = jCurrentTimeMillis2;
            return minisFragmentLIZ;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getMinisFragment, schemaUrl:");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        return null;
    }
}
