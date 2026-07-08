package com.ss.android.ugc.aweme.autofill.iab;

import X.AbstractC1539010q9T;
import X.AbstractC1893000zMQ;
import X.C1068900dvE;
import X.C1068950dvJ;
import X.C1068970dvL;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1887007aG;
import X.C1976907ol;
import X.C2429209fW;
import X.InterfaceC1541510qDV;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.autofill.settings.OpenAutofillSettingsSettings;
import com.ss.android.ugc.aweme.autofill.settings.TtopAutoFillUserAgentSetting;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.ttopruntime.experiment.TTOPSparkRuntimeConfigSettings;
import com.ss.android.ugc.aweme.opensdkservice.IOpenIABService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class TtopAutofillInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        String host2 = null;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        if (!TextUtils.equals(host, "open_platform_webview")) {
            if (routeIntent != null) {
                host2 = routeIntent.getHost();
            }
            if (!TextUtils.equals(host2, "open_autofill_webview")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        String stringExtra;
        List<String> list;
        Matcher matcher;
        Matcher matcher2;
        if (context == null || routeIntent == null || (extra = routeIntent.getExtra()) == null) {
            return false;
        }
        try {
            String stringExtra2 = extra.getStringExtra("url");
            if (stringExtra2 != null) {
                String strDecode = Uri.decode(stringExtra2);
                try {
                    stringExtra = extra.getStringExtra("request_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                C1068900dvE.LIZ.getClass();
                C1068900dvE.LIZIZ = stringExtra;
                String string = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", strDecode).appendQueryParameter("use_spark", "1").toString();
                C1068950dvJ c1068950dvJ = new C1068950dvJ(OpenAutofillSettingsSettings.LIZ().allowedDomains, stringExtra, OpenAutofillSettingsSettings.LIZ().ttopDFIDCheckEnabled, null, 8);
                IOpenIABService iOpenIABService = (IOpenIABService) ServiceManager.get().getService(IOpenIABService.class);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.bid = "ttop_iab";
                sparkContext.LJJLIIJ(string);
                sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402685961"));
                sparkContext.bizCert = new ThirdPartyBizCert(402685961);
                sparkContext.LJJL("show_web_url", true);
                sparkContext.LJJLIIIJLLLLLLLZ(new AbstractC1893000zMQ() { // from class: X.0DaI
                    public TuxNavBar LL;
                    public String LLILLJJLI = "";
                    public final HashMap<Integer, String> LLILLL = new HashMap<>();
                    public C1250250idj LLILZ;

                    @Override // X.InterfaceC1892990zMP
                    public final void LJIILL(int i) {
                    }

                    @Override // X.InterfaceC1892990zMP
                    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
                    }

                    public final String LIZIZ(int i) {
                        HashMap<Integer, String> map = this.LLILLL;
                        Integer numValueOf = Integer.valueOf(i);
                        String strLJI = map.get(numValueOf);
                        if (strLJI == null) {
                            strLJI = C20642515q3.LJI(i);
                            map.put(numValueOf, strLJI);
                        }
                        return strLJI;
                    }

                    @Override // X.InterfaceC1892990zMP
                    public final View LJFF(Context context2) {
                        View viewSd = C786410Ut5.Sd(R.layout.s2, C786410Ut5.ne(context2), null);
                        this.LL = (TuxNavBar) viewSd.findViewById(R.id.bfv);
                        C0OM1 c0om1 = new C0OM1();
                        C1251150ifB c1251150ifB = new C1251150ifB();
                        c1251150ifB.LIZLLL();
                        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
                        c1251150ifB.LIZIZ = LIZIZ(2131840883);
                        c1251150ifB.LJIIIIZZ = LIZIZ(2131840883);
                        c0om1.LJ(c1251150ifB);
                        C1251150ifB c1251150ifB2 = new C1251150ifB();
                        c1251150ifB2.LIZLLL();
                        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
                        c1251150ifB2.LIZIZ = LIZIZ(2131823353);
                        c1251150ifB2.LJIIIIZZ = LIZIZ(2131823353);
                        c1251150ifB2.LJI = false;
                        c0om1.LIZIZ(c1251150ifB2);
                        TuxNavBar tuxNavBar = this.LL;
                        if (tuxNavBar != null) {
                            tuxNavBar.setNavActions(c0om1);
                            tuxNavBar.LJIIZILJ(true);
                        }
                        return viewSd;
                    }

                    @Override // X.InterfaceC1892990zMP
                    public final void LJJJI(int i) {
                        TuxNavBar tuxNavBar = this.LL;
                        if (tuxNavBar != null) {
                            tuxNavBar.setNavBackground(i);
                        }
                    }

                    @Override // X.InterfaceC1892990zMP
                    public final void LJJJJ(boolean z) {
                        View viewLJII = null;
                        if (z) {
                            TuxNavBar tuxNavBar = this.LL;
                            if (tuxNavBar != null) {
                                viewLJII = tuxNavBar.LJII(LIZIZ(2131823353));
                            }
                            C12ES.LJIILL(0, viewLJII);
                            return;
                        }
                        TuxNavBar tuxNavBar2 = this.LL;
                        if (tuxNavBar2 != null) {
                            viewLJII = tuxNavBar2.LJII(LIZIZ(2131823353));
                        }
                        C12ES.LJIILL(8, viewLJII);
                    }

                    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
                    public final void LJJLIIIJ(boolean z) {
                        if (z) {
                            C12ES.LJIILL(0, this.LL);
                        } else {
                            C12ES.LJIILL(8, this.LL);
                        }
                    }

                    @Override // X.InterfaceC1892990zMP
                    public final void setBackClickListener(View.OnClickListener onClickListener) {
                        View viewLJII;
                        TuxNavBar tuxNavBar = this.LL;
                        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII(LIZIZ(2131840883))) != null) {
                            C786410Ut5.I7(onClickListener, viewLJII);
                        }
                    }

                    @Override // X.InterfaceC1892990zMP
                    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
                        View viewLJII;
                        TuxNavBar tuxNavBar = this.LL;
                        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII(LIZIZ(2131823353))) != null) {
                            C786410Ut5.I7(onClickListener, viewLJII);
                        }
                    }

                    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
                    public final void setSubTitle(String str) {
                        this.LLILLJJLI = str;
                        if (this.LLILZ == null) {
                            this.LLILZ = new C1250250idj();
                        }
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(LIZIZ(2131826823), new Regex("^https://").replace(this.LLILLJJLI, "")), "", null, null, 0, null, null, 62);
                        C1250250idj c1250250idj = this.LLILZ;
                        if (c1250250idj != null) {
                            c1250250idj.LIZLLL = strLJJLIIIJ;
                            TuxNavBar tuxNavBar = this.LL;
                            if (tuxNavBar != null) {
                                tuxNavBar.LJIJJ(c1250250idj);
                            }
                        }
                    }

                    @Override // X.InterfaceC1892990zMP
                    public final void setTitle(String str) {
                        if (this.LLILZ == null) {
                            this.LLILZ = new C1250250idj();
                        }
                        C1250250idj c1250250idj = this.LLILZ;
                        if (c1250250idj != null) {
                            c1250250idj.LIZJ = str;
                            TuxNavBar tuxNavBar = this.LL;
                            if (tuxNavBar != null) {
                                tuxNavBar.LJIJJ(c1250250idj);
                            }
                        }
                    }
                });
                HashMap map = new HashMap();
                TtopAutoFillUserAgentSetting.UaSettingsModel uaSettingsModel = TtopAutoFillUserAgentSetting.LIZ;
                try {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    TtopAutoFillUserAgentSetting.UaSettingsModel uaSettingsModel2 = TtopAutoFillUserAgentSetting.LIZ;
                    TtopAutoFillUserAgentSetting.UaSettingsModel uaSettingsModel3 = (TtopAutoFillUserAgentSetting.UaSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("ttop_iab_custom_user_agent", TtopAutoFillUserAgentSetting.UaSettingsModel.class, uaSettingsModel2);
                    if (uaSettingsModel3 == null || (list = uaSettingsModel3.allowedDomains) == null) {
                        list = uaSettingsModel2.allowedDomains;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    list = TtopAutoFillUserAgentSetting.LIZ.allowedDomains;
                }
                Iterator<String> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    if (!map.containsKey(next)) {
                        map.put(next, PatternProtector.compile(next));
                    }
                    Pattern pattern = (Pattern) map.get(next);
                    if (pattern != null && (matcher2 = pattern.matcher(strDecode)) != null && matcher2.find()) {
                        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0qMc
                            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                                C1537910q7h c1537910q7h;
                                Uri uriLIZ;
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                                if (interfaceC1531560pxS instanceof C1541480qDS) {
                                    ((C1541480qDS) interfaceC1531560pxS).LJ = new InterfaceC1541760qDu() { // from class: X.0qMd
                                        @Override // X.InterfaceC1541760qDu
                                        public final void LIZ(WebSettings webSettings, WebKitView webKitView) {
                                            Locale localeLJIJJLI;
                                            I18nManagerServiceApi i18nManagerServiceApiLIZ;
                                            getClass();
                                            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                                            if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (localeLJIJJLI = i18nManagerServiceApiLIZ.LJIJJLI(C1383370m6R.LIZ)) == null) {
                                                localeLJIJJLI = Locale.getDefault();
                                            }
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Mozilla/5.0 (Linux; Android ");
                                            sbLIZ.append(Build.VERSION.RELEASE);
                                            sbLIZ.append("; ");
                                            sbLIZ.append(Build.MODEL);
                                            sbLIZ.append(") ");
                                            C844470XAv.LIZ.getClass();
                                            String str = C844470XAv.LJ;
                                            String str2 = null;
                                            if (str == null) {
                                                str = null;
                                            }
                                            sbLIZ.append(str);
                                            sbLIZ.append('_');
                                            sbLIZ.append(C844470XAv.LJ());
                                            sbLIZ.append(" AppVersion/");
                                            sbLIZ.append(C844470XAv.LIZJ());
                                            sbLIZ.append(" JsSdk/2.0 Channel/");
                                            sbLIZ.append(C844470XAv.LJIILL);
                                            sbLIZ.append(" ByteLocale/");
                                            sbLIZ.append(localeLJIJJLI);
                                            sbLIZ.append(" App/");
                                            String str3 = C844470XAv.LJ;
                                            if (str3 != null) {
                                                str2 = str3;
                                            }
                                            sbLIZ.append(str2);
                                            sbLIZ.append(" Region/");
                                            sbLIZ.append(C2222691Bz1.LIZ());
                                            sbLIZ.append(" BytedanceWebview/d8a21c6");
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            WebSettings settings = webKitView.getSettings();
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("Safari/604.1");
                                            sbLIZ2.append(' ');
                                            sbLIZ2.append(strLIZIZ);
                                            C786410Ut5.se(settings, C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                    };
                                }
                                if ((interfaceC1531560pxS instanceof C1537910q7h) && (uriLIZ = (c1537910q7h = (C1537910q7h) interfaceC1531560pxS).LIZ()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZ, "initial_data")) != null) {
                                    C1067460dsu c1067460dsuLIZIZ = C1067320dsg.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                    c1067460dsuLIZIZ.LIZ("initial_data", new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                                    c1537910q7h.LJIJJLI(c1067460dsuLIZIZ);
                                }
                            }
                        });
                        break;
                    }
                }
                iOpenIABService.LIZIZ(sparkContext, c1068950dvJ);
                Iterator<String> it3 = TTOPSparkRuntimeConfigSettings.LIZ().ttopAllowList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String next2 = it3.next();
                    HashMap<String, Pattern> map2 = C1887007aG.LIZ;
                    if (!map2.containsKey(next2)) {
                        map2.put(next2, PatternProtector.compile(next2));
                    }
                    Pattern pattern2 = map2.get(next2);
                    if (pattern2 != null && (matcher = pattern2.matcher(strDecode)) != null && matcher.find()) {
                        sparkContext.LJJ(InterfaceC1541510qDV.class, new C1068970dvL());
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("Spark_Cookie_Manager_Enable", true)) {
                            sparkContext.LJJJLZIJ(1, "clean_cookie_when_account_change");
                        }
                    }
                }
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                return true;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        return false;
    }
}
