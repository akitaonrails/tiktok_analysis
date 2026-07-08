package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0PEM;
import X.C0VU1;
import X.C0VZ0;
import X.C0WGU;
import X.C0WGV;
import X.C0WGX;
import X.C0WZX;
import X.C10SW;
import X.C10X0;
import X.C10X2;
import X.C10X3;
import X.C10X5;
import X.C10XK;
import X.C10XM;
import X.C1150504el;
import X.C15O7;
import X.C17980072k;
import X.C1893790zNh;
import X.C19259210Wg;
import X.C19259510Wj;
import X.C19260410Ws;
import X.C19719612Di;
import X.C1DFH;
import X.C20144713rx;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2204961BRm;
import X.C2222691Bz1;
import X.C23250099c;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C817503Hh;
import X.C823050WQl;
import X.C837720Wte;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1893800zNi;
import X.InterfaceC799590VYf;
import Y.ACallableS431S0100000_28;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.interfaces.IConfigService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class InitAppsFlyer implements C0CCZ, InterfaceC799590VYf {
    public static InitAppsFlyer LLJ;
    public static final String LLJI = "XY8Lpakui8g4kBcposRgxA";
    public C10XK LLILZ;
    public C19259510Wj LLILZIL;
    public long LLILZLL;
    public final String[] LL = {"huawei_store", "samsung_store", "silution_int", "amazon_int", "apkpure", "aptoide_int", "oppo_int", "oppostore_int", "trassion_int"};
    public final String[] LLILLJJLI = {"tt_eu_ss22", "tt_mena_ss22", "tt_sea_ss22", "tt_lata_ss22", "tt_ssa_ss22", "tt_ss_ww23", "tt_ss_tablet"};
    public final String[] LLILLL = {"tiktok-preinstall_", "tiktokpreinstall_", "tiktok-preinstall", "tiktokpreinstall"};
    public String LLIZ = "";
    public String LLIZLLLIL = "";

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitAppsFlyer";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static InitAppsFlyer LJ() {
        if (LLJ == null) {
            LLJ = new InitAppsFlyer();
        }
        return LLJ;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return (!((Boolean) C17980072k.LJ.getValue()).booleanValue() || C19260410Ws.LJFF()) ? EnumC799870VZh.MAIN : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    public static String LIZ(C10XK c10xk) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gpir", c10xk.LIZJ.LIZIZ);
            jSONObject.put("referrer_click_timestamp_seconds", c10xk.LIZJ.LJ);
            jSONObject.put("referrer_click_timestamp_server_seconds", c10xk.LIZJ.LJFF);
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) throws Throwable {
        boolean z;
        boolean zLJIIJ;
        boolean z2;
        C1150504el.LIZ().LIZLLL("method_app_flyer_duration", false);
        String lowerCase = C2222691Bz1.LIZIZ().toLowerCase();
        C1893790zNh c1893790zNh = C1893790zNh.LIZ;
        InterfaceC1893800zNi interfaceC1893800zNi = new InterfaceC1893800zNi() { // from class: X.10Wh
            @Override // X.InterfaceC1893800zNi
            public final boolean isDebug() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJIILL.equals("local_test");
            }

            @Override // X.InterfaceC1893800zNi
            public final void LIZ(String str, Map<String, String> map) {
                C20684815ws.LJIILLIIL(str, map);
            }
        };
        c1893790zNh.getClass();
        C1893790zNh.LJIIIZ(lowerCase, interfaceC1893800zNi);
        C10SW.LIZ.getClass();
        C10SW.LIZLLL("task_init");
        C19259210Wg c19259210Wg = new C19259210Wg(this, context, SystemClock.uptimeMillis());
        if (C19260410Ws.LJFF()) {
            IConfigService iConfigService = (IConfigService) PluggableExtentionKt.pluggableSpi(IConfigService.class);
            if (iConfigService != null) {
                iConfigService.LIZJ();
            }
            C19260410Ws.LIZ.getClass();
            String str = Build.BRAND;
            if (!u.LJIJI("xiaomi", str, true) && !u.LJIJI("redmi", str, true)) {
                z = false;
            } else {
                z = true;
            }
            if (z && !u.LJIJI("sf", C19260410Ws.LJ(), true)) {
                zLJIIJ = C0C64.LJIILLIIL().LJIIJ("preload_uninstall_opt", ClientExpManager.preload_uninstall_opt());
            } else {
                zLJIIJ = false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C10XM(context) { // from class: X.10XB
                public final Context LIZ;

                @Override // X.C10XM
                public final boolean LIZ() {
                    return false;
                }

                {
                    this.LIZ = context;
                }

                @Override // X.C10XM
                public final C10XK LIZIZ(C10XK c10xk) {
                    long j;
                    String string;
                    String string2;
                    Cursor cursorLJJJ = null;
                    try {
                        try {
                            cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), UriProtector.parse("content://" + this.LIZ.getPackageName() + ".identifierprovider/preload_info"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+vLY/c2TsLS2R7LHc7pKGyWFAiTXBknxE62pDCst6+Myczdo0i8l+z3GJrpwM=", null));
                            if (cursorLJJJ == null) {
                                return c10xk;
                            }
                            cursorLJJJ.moveToFirst();
                            int columnIndex = cursorLJJJ.getColumnIndex("preinstall_version");
                            int columnIndex2 = cursorLJJJ.getColumnIndex("preinstall_channel");
                            int columnIndex3 = cursorLJJJ.getColumnIndex("preinstall_campaign");
                            int columnIndex4 = cursorLJJJ.getColumnIndex("first_install_time");
                            if (columnIndex4 >= 0) {
                                j = cursorLJJJ.getLong(columnIndex4);
                            } else {
                                j = 0;
                            }
                            if (Math.abs(C19260410Ws.LIZIZ() - j) > 1800000) {
                                cursorLJJJ.close();
                                return c10xk;
                            }
                            String string3 = "";
                            if (columnIndex2 < 0) {
                                string = "";
                            } else {
                                string = cursorLJJJ.getString(columnIndex2);
                            }
                            if (columnIndex3 < 0) {
                                string2 = "";
                            } else {
                                string2 = cursorLJJJ.getString(columnIndex3);
                            }
                            if (string != null && string.length() != 0) {
                                C10XH c10xh = c10xk.LIZ;
                                c10xh.LJIIJJI = 9;
                                c10xh.LIZ = string;
                                c10xh.LIZIZ = string2;
                                c10xk.LJ = true;
                                if (columnIndex < 0 || (string3 = cursorLJJJ.getString(columnIndex)) != null) {
                                    c10xk.LIZ.LIZLLL = string3;
                                }
                            } else {
                                cursorLJJJ.close();
                                return c10xk;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (cursorLJJJ != null) {
                            }
                            return c10xk;
                        }
                        cursorLJJJ.close();
                        return c10xk;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (cursorLJJJ != null) {
                            cursorLJJJ.close();
                        }
                        throw th;
                    }
                }
            });
            arrayList.add(new C10XM() { // from class: X.10XI
                @Override // X.C10XM
                public final boolean LIZ() {
                    return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0163  */
                @Override // X.C10XM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C10XK LIZIZ(X.C10XK r15) {
                    /*
                        Method dump skipped, instruction units count: 368
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C10XI.LIZIZ(X.10XK):X.10XK");
                }
            });
            arrayList.add(new C10XM() { // from class: X.1BZp
                public final List<String> LIZ = C1697810uHb.LJIIJJI("com.tmobile.dm.cm", "com.sprint.w.installer", "com.sprint.ce.updater", "com.LogiaGroup.LogiaDeck", "com.dti.cricket", "com.dti.tracfone", "com.ironsrc.aura.tmo", "com.ironsrc.aura.appmanager.tmo");
                public final List<String> LIZIZ = C1697810uHb.LJIIJJI("BR", "MX", "CO", "PE", "AR", "CL", "EC", "PA", "PY", "BO", "UY", "GT", "VE", "DO", "DM", "CR", "NI", "SV", "HN", "BZ", "GY", "GP", "MQ", "SR", "GF");

                @Override // X.C10XM
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.C10XM
                public final C10XK LIZIZ(C10XK c10xk) {
                    if (this.LIZIZ.contains(((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase())) {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : this.LIZ) {
                            C844470XAv.LIZ.getClass();
                            Context contextLIZ = C844470XAv.LIZ();
                            if (!C2093608Ic.LJ(str2)) {
                                try {
                                    if (C786410Ut5.Y3(contextLIZ.getPackageManager(), str2, 0) != null) {
                                        arrayList2.add(str2);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                        c10xk.LIZ.LJIILJJIL.addAll(arrayList2);
                        c10xk.LIZ.getClass();
                    }
                    return c10xk;
                }
            });
            new C10X2(new C10X3());
            C10X3 c10x3 = new C10X3();
            c10x3.LIZJ = this.LLILLL;
            c10x3.LIZIZ = zLJIIJ;
            c10x3.LIZLLL = this.LL;
            c10x3.LJ = this.LLILLJJLI;
            if ((u.LJIJI("xiaomi", str, true) || u.LJIJI("redmi", str, true)) && u.LJIJI("sf", C19260410Ws.LJ(), true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            c10x3.LJI = !z2;
            C19719612Di.LJJI(arrayList, c10x3.LIZ);
            c10x3.LJFF = new C10X5(this, jCurrentTimeMillis, context, c19259210Wg);
            C10X2 c10x2 = new C10X2(c10x3);
            C19259510Wj c19259510Wj = new C19259510Wj();
            this.LLILZIL = c19259510Wj;
            C844470XAv.LIZ.getClass();
            String str2 = C844470XAv.LJIILL;
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C10X0(c19259510Wj, context, str2, c10x2, null), 2);
        } else {
            LJFF(context, c19259210Wg);
            C15O7.LIZJ(new ACallableS431S0100000_28(Boolean.valueOf(Keva.getRepo("appsflyer_repo").getBoolean("is_preinstall_app", true)), 8));
        }
        C1150504el.LIZ().LJI("method_app_flyer_duration", false);
    }

    public static void LJIIIIZZ(String str, Map map) {
        if (!map.isEmpty()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            for (String str2 : map.keySet()) {
                c2344009Gk.LJFF(str2, (String) map.get(str2));
            }
            if (!map.containsKey("apk_last_update_time")) {
                c2344009Gk.LIZLLL(C19260410Ws.LIZJ(), "apk_last_update_time");
            }
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        }
    }

    public final void LJFF(Context context, AppsFlyerConversionListener appsFlyerConversionListener) throws Throwable {
        this.LLILZLL = SystemClock.uptimeMillis();
        AppsFlyerLib.getInstance().init(LLJI, appsFlyerConversionListener, context);
        if (((Boolean) C17980072k.LIZJ.getValue()).booleanValue()) {
            C823050WQl.LIZJ().execute(new ARunnableS128S0100000_28(this, 45));
        } else {
            C2344009Gk c2344009Gk = new C2344009Gk();
            C19260410Ws.LIZ.getClass();
            c2344009Gk.LJIIIIZZ("region", C19260410Ws.LIZLLL());
            C20684815ws.LJIILLIIL("af_start_init", c2344009Gk.LIZ);
        }
        try {
            C20144713rx c20144713rx = new C20144713rx(939524109);
            C837720Wte.LIZ("AppsFlyer", "setCollectIMEI", c20144713rx, new C0WGV(c20144713rx));
            C20144713rx c20144713rx2 = new C20144713rx(939524110);
            C837720Wte.LIZ("AppsFlyer", "setCollectOaid", c20144713rx2, new C0WGX(c20144713rx2));
            this.LLIZ = UUID.randomUUID().toString();
            HashMap map = new HashMap();
            map.put("ugdp_id", this.LLIZ);
            C20144713rx c20144713rx3 = new C20144713rx(939524116);
            C837720Wte.LIZ("AppsFlyer", "setAdditionalData", c20144713rx3, new C0WGU(map, c20144713rx3));
            C844470XAv.LIZ.getClass();
            if ("huaweiadsglobal_int".equalsIgnoreCase(C844470XAv.LJIILL)) {
                C2204961BRm.LLL(AppsFlyerLib.getInstance(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS/ow8O7CsWeCO0Ce+HEZNU70A", null));
            }
            if (ComplianceServiceProvider.LJI().LJJIIJZLJL()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            C19260410Ws.LIZJ = true;
            C10SW.LIZ.getClass();
            C10SW.LIZLLL("task_init_end");
            C19260410Ws.LJIILIIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C19260410Ws.LJFF()) {
            AppsFlyerLib.getInstance().subscribeForDeepLink(new DeepLinkListener() { // from class: X.10X1
                @Override // com.appsflyer.deeplink.DeepLinkListener
                public final void onDeepLinking(DeepLinkResult deepLinkResult) {
                    String deepLinkValue;
                    if (deepLinkResult.getDeepLink() != null && !((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJIJL() && (deepLinkValue = deepLinkResult.getDeepLink().getDeepLinkValue()) != null && !TextUtils.isEmpty(deepLinkValue)) {
                        try {
                            if (UriProtector.parse(deepLinkValue).isHierarchical()) {
                                this.LIZ.LLIZLLLIL = deepLinkResult.getDeepLink().getDeepLinkValue();
                                INUJUnderTakeManager.LIZ.getClass();
                                INUJUnderTakeManager iNUJUnderTakeManagerLIZ = C1589520rSw.LIZ();
                                deepLinkResult.getDeepLink().getClickEvent();
                                iNUJUnderTakeManagerLIZ.LJ();
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            });
        }
    }
}
