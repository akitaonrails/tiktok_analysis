package com.ss.android.ugc.aweme.cct;

import X.C01GW;
import X.C0W00;
import X.C0W58;
import X.C0W59;
import X.C0WWF;
import X.C0WWG;
import X.C0WZX;
import X.C1023960ckk;
import X.C1043520dGI;
import X.C1055680dZu;
import X.C1388190mED;
import X.C1607950rwf;
import X.C1701330uNH;
import X.C1AF0;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2205841BUw;
import X.C2214201BlK;
import X.C2429209fW;
import X.C817470W4z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cct.AdCCTLogModel;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.cct.PnsIsolatedWebPagesDomainSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class OpenCCTUtils implements IOpenCCTUtils {
    public String LIZ;
    public C2205841BUw LIZIZ;
    public C817470W4z LIZJ;
    public long LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJJI;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public boolean LJIILLIIL;
    public BrowserConfig LJIIZILJ;
    public String LJIJJ;
    public boolean LJIJJLI;
    public long LIZLLL = System.currentTimeMillis();
    public long LJ = System.currentTimeMillis();
    public long LJFF = System.currentTimeMillis();
    public String LJIIJ = "";
    public int LJIIL = 1;
    public String LJIJ = CardStruct.IStatusCode.DEFAULT;
    public String LJIJI = "";
    public boolean LJIL = true;

    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    public final boolean LIZ(String str) {
        String host;
        List<String> list;
        if (str == null) {
            return false;
        }
        C01GW c01gw = PnsIsolatedWebPagesDomainSettings.LIZIZ;
        PnsIsolatedWebPagesDomainSettings.ACTConfig aCTConfig = (PnsIsolatedWebPagesDomainSettings.ACTConfig) c01gw.getValue();
        if (aCTConfig == null) {
            aCTConfig = PnsIsolatedWebPagesDomainSettings.LIZ;
        }
        if (!aCTConfig.enable || (host = UriProtector.parse(str).getHost()) == null) {
            return false;
        }
        PnsIsolatedWebPagesDomainSettings.ACTConfig aCTConfig2 = (PnsIsolatedWebPagesDomainSettings.ACTConfig) c01gw.getValue();
        if (aCTConfig2 == null || (list = aCTConfig2.pages) == null) {
            list = PnsIsolatedWebPagesDomainSettings.LIZ.pages;
        }
        return list.contains(host);
    }

    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    public final boolean LIZLLL(Aweme aweme) {
        String webUrl;
        BrowserConfig browserConfig;
        String webUrl2;
        BrowserConfig browserConfig2;
        Long creativeId;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String logExtra = null;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            webUrl = awemeRawAd2.getWebUrl();
        } else {
            webUrl = null;
        }
        sbLIZ.append(webUrl);
        sbLIZ.append("   ");
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            browserConfig = awemeRawAd.getBrowserConfig();
        } else {
            browserConfig = null;
        }
        sbLIZ.append(browserConfig);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            webUrl2 = awemeRawAd3.getWebUrl();
        } else {
            webUrl2 = null;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            browserConfig2 = awemeRawAd4.getBrowserConfig();
        } else {
            browserConfig2 = null;
        }
        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
        if (awemeRawAd5 != null) {
            creativeId = awemeRawAd5.getCreativeId();
        } else {
            creativeId = null;
        }
        String strValueOf = String.valueOf(creativeId);
        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
        if (awemeRawAd6 != null) {
            logExtra = awemeRawAd6.getLogExtra();
        }
        return LIZJ(webUrl2, browserConfig2, strValueOf, logExtra);
    }

    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    public final void LJFF(Context context) {
        try {
            C2205841BUw c2205841BUw = this.LIZIZ;
            if (c2205841BUw != null) {
                if (this.LJIILLIIL) {
                    context.unbindService(c2205841BUw);
                    this.LJIILLIIL = false;
                }
                this.LIZJ = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("cct_unbindCustomTabsService");
        }
    }

    public final void LJI(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            try {
                intent.addFlags(268435456);
                C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmrd9HhzDcdRcMlcpJ2H50=", null));
                C1055680dZu c1055680dZu = new C1055680dZu(new AdCCTLogModel(this.LJIJJ, this.LJIJI, this.LJIJJLI));
                C1043520dGI.LIZ.getClass();
                C1023960ckk c1023960ckk = C1043520dGI.LJ;
                String str2 = this.LJIILIIL;
                if (str2 == null) {
                    str2 = "";
                }
                c1055680dZu.logAd(c1023960ckk, str2, this.LJIILJJIL, null, AFwS281S0000000_34.get$arr$(3));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("cct_no_browser");
            }
        }
    }

    public final void LJII(Context context, String str, String str2) throws Throwable {
        C0W59 c0w59LIZJ;
        int i;
        int i2;
        int i3;
        int i4;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            context = activityLIZ;
        }
        try {
            C817470W4z c817470W4z = this.LIZJ;
            if (c817470W4z == null) {
                c0w59LIZJ = null;
            } else {
                c0w59LIZJ = c817470W4z.LIZJ(new C0W58() { // from class: X.1BUv
                    @Override // X.C0W58
                    public final void LIZLLL(int i5, Bundle bundle) {
                        Long l;
                        String str3 = "";
                        switch (i5) {
                            case 1:
                                IClientSecurityService iClientSecurityService = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
                                if (iClientSecurityService != null) {
                                    iClientSecurityService.LJII();
                                }
                                OpenCCTUtils openCCTUtils = this.LIZ;
                                if (openCCTUtils.LJII == 0) {
                                    openCCTUtils.LJII = System.currentTimeMillis() - this.LIZ.LJ;
                                }
                                OpenCCTUtils openCCTUtils2 = this.LIZ;
                                openCCTUtils2.LJIIJJI = false;
                                if (openCCTUtils2.LJIIIIZZ) {
                                    if (!openCCTUtils2.LJIIIZ) {
                                        openCCTUtils2.LJIIIZ = true;
                                    } else {
                                        C1055680dZu c1055680dZu = new C1055680dZu(new AdCCTLogModel(openCCTUtils2.LJIJJ, openCCTUtils2.LJIJI, openCCTUtils2.LJIJJLI));
                                        C1043520dGI.LIZ.getClass();
                                        C1023960ckk c1023960ckk = C1043520dGI.LJI;
                                        OpenCCTUtils openCCTUtils3 = this.LIZ;
                                        String str4 = openCCTUtils3.LJIILIIL;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        c1055680dZu.logAd(c1023960ckk, str4, openCCTUtils3.LJIILJJIL, null, new AwS613S0100000_34(openCCTUtils3, 136));
                                        this.LIZ.LJIIIIZZ = false;
                                        Keva.getRepo("chrome_custom_tab_repo").storeBoolean("isSuccess", true);
                                    }
                                }
                                this.LIZ.LIZLLL = System.currentTimeMillis();
                                OpenCCTUtils openCCTUtils4 = this.LIZ;
                                C1055680dZu c1055680dZu2 = new C1055680dZu(new AdCCTLogModel(openCCTUtils4.LJIJJ, openCCTUtils4.LJIJI, openCCTUtils4.LJIJJLI));
                                C1043520dGI.LIZ.getClass();
                                C1023960ckk c1023960ckk2 = C1043520dGI.LJIIIIZZ;
                                OpenCCTUtils openCCTUtils5 = this.LIZ;
                                String str5 = openCCTUtils5.LJIILIIL;
                                if (str5 != null) {
                                    str3 = str5;
                                }
                                c1055680dZu2.logAd(c1023960ckk2, str3, openCCTUtils5.LJIILJJIL, null, new AwS613S0100000_34(openCCTUtils5, 137));
                                break;
                            case 2:
                                OpenCCTUtils openCCTUtils6 = this.LIZ;
                                openCCTUtils6.LJIIJJI = true;
                                C1055680dZu c1055680dZu3 = new C1055680dZu(new AdCCTLogModel(openCCTUtils6.LJIJJ, openCCTUtils6.LJIJI, openCCTUtils6.LJIJJLI));
                                C1043520dGI.LIZ.getClass();
                                C1023960ckk c1023960ckk3 = C1043520dGI.LJIIIZ;
                                OpenCCTUtils openCCTUtils7 = this.LIZ;
                                String str6 = openCCTUtils7.LJIILIIL;
                                if (str6 != null) {
                                    str3 = str6;
                                }
                                c1055680dZu3.logAd(c1023960ckk3, str3, openCCTUtils7.LJIILJJIL, null, new AwS613S0100000_34(openCCTUtils7, 138));
                                OpenCCTUtils openCCTUtils8 = this.LIZ;
                                if (openCCTUtils8.LJIIL == 1) {
                                    openCCTUtils8.LJIIL = 0;
                                }
                                break;
                            case 3:
                                OpenCCTUtils openCCTUtils9 = this.LIZ;
                                openCCTUtils9.LJIIJJI = true;
                                C1055680dZu c1055680dZu4 = new C1055680dZu(new AdCCTLogModel(openCCTUtils9.LJIJJ, openCCTUtils9.LJIJI, openCCTUtils9.LJIJJLI));
                                C1043520dGI.LIZ.getClass();
                                C1023960ckk c1023960ckk4 = C1043520dGI.LJIIL;
                                OpenCCTUtils openCCTUtils10 = this.LIZ;
                                String str7 = openCCTUtils10.LJIILIIL;
                                if (str7 != null) {
                                    str3 = str7;
                                }
                                c1055680dZu4.logAd(c1023960ckk4, str3, openCCTUtils10.LJIILJJIL, null, new AwS613S0100000_34(openCCTUtils10, 141));
                                OpenCCTUtils openCCTUtils11 = this.LIZ;
                                if (openCCTUtils11.LJIIL == 1) {
                                    openCCTUtils11.LJIIL = 0;
                                }
                                break;
                            case 4:
                                OpenCCTUtils openCCTUtils12 = this.LIZ;
                                C1055680dZu c1055680dZu5 = new C1055680dZu(new AdCCTLogModel(openCCTUtils12.LJIJJ, openCCTUtils12.LJIJI, openCCTUtils12.LJIJJLI));
                                C1043520dGI.LIZ.getClass();
                                C1023960ckk c1023960ckk5 = C1043520dGI.LJIILIIL;
                                OpenCCTUtils openCCTUtils13 = this.LIZ;
                                String str8 = openCCTUtils13.LJIILIIL;
                                if (str8 != null) {
                                    str3 = str8;
                                }
                                c1055680dZu5.logAd(c1023960ckk5, str3, openCCTUtils13.LJIILJJIL, null, new AwS613S0100000_34(openCCTUtils13, 135));
                                break;
                            case 5:
                                Keva.getRepo("chrome_custom_tab_repo").storeLong("openCCTLastTime", System.currentTimeMillis());
                                OpenCCTUtils openCCTUtils14 = this.LIZ;
                                String str9 = openCCTUtils14.LJIILIIL;
                                if (str9 == null) {
                                    str9 = CardStruct.IStatusCode.DEFAULT;
                                }
                                openCCTUtils14.LJIJ = str9;
                                BrowserConfig browserConfig = openCCTUtils14.LJIIZILJ;
                                if (browserConfig != null && (l = browserConfig.actInternalTime) != null && l.longValue() > 0) {
                                    C1440005kM.LIZ(new C1594170raR());
                                }
                                OpenCCTUtils openCCTUtils15 = this.LIZ;
                                openCCTUtils15.LJIIL = 1;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                OpenCCTUtils openCCTUtils16 = this.LIZ;
                                openCCTUtils15.LJI = jCurrentTimeMillis - openCCTUtils16.LJFF;
                                openCCTUtils16.LJ = System.currentTimeMillis();
                                OpenCCTUtils openCCTUtils17 = this.LIZ;
                                C1055680dZu c1055680dZu6 = new C1055680dZu(new AdCCTLogModel(openCCTUtils17.LJIJJ, openCCTUtils17.LJIJI, openCCTUtils17.LJIJJLI));
                                C1043520dGI.LIZ.getClass();
                                C1023960ckk c1023960ckk6 = C1043520dGI.LIZJ;
                                OpenCCTUtils openCCTUtils18 = this.LIZ;
                                String str10 = openCCTUtils18.LJIILIIL;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                c1055680dZu6.logAd(c1023960ckk6, str10, openCCTUtils18.LJIILJJIL, null, AFwS281S0000000_34.get$arr$(59));
                                OpenCCTUtils openCCTUtils19 = this.LIZ;
                                C1055680dZu c1055680dZu7 = new C1055680dZu(new AdCCTLogModel(openCCTUtils19.LJIJJ, openCCTUtils19.LJIJI, openCCTUtils19.LJIJJLI));
                                C1023960ckk c1023960ckk7 = C1043520dGI.LIZLLL;
                                OpenCCTUtils openCCTUtils20 = this.LIZ;
                                String str11 = openCCTUtils20.LJIILIIL;
                                if (str11 != null) {
                                    str3 = str11;
                                }
                                c1055680dZu7.logAd(c1023960ckk7, str3, openCCTUtils20.LJIILJJIL, null, AFwS281S0000000_34.get$arr$(60));
                                break;
                            case 6:
                                IClientSecurityService iClientSecurityService2 = (IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class);
                                if (iClientSecurityService2 != null) {
                                    iClientSecurityService2.LJFF();
                                }
                                OpenCCTUtils openCCTUtils21 = this.LIZ;
                                C1055680dZu c1055680dZu8 = new C1055680dZu(new AdCCTLogModel(openCCTUtils21.LJIJJ, openCCTUtils21.LJIJI, openCCTUtils21.LJIJJLI));
                                C1043520dGI.LIZ.getClass();
                                C1023960ckk c1023960ckk8 = C1043520dGI.LJIIJ;
                                OpenCCTUtils openCCTUtils22 = this.LIZ;
                                String str12 = openCCTUtils22.LJIILIIL;
                                if (str12 == null) {
                                    str12 = "";
                                }
                                c1055680dZu8.logAd(c1023960ckk8, str12, openCCTUtils22.LJIILJJIL, null, new AwS613S0100000_34(openCCTUtils22, 139));
                                OpenCCTUtils openCCTUtils23 = this.LIZ;
                                if (!openCCTUtils23.LJIIJJI) {
                                    C1055680dZu c1055680dZu9 = new C1055680dZu(new AdCCTLogModel(openCCTUtils23.LJIJJ, openCCTUtils23.LJIJI, openCCTUtils23.LJIJJLI));
                                    C1023960ckk c1023960ckk9 = C1043520dGI.LJIIJJI;
                                    OpenCCTUtils openCCTUtils24 = this.LIZ;
                                    String str13 = openCCTUtils24.LJIILIIL;
                                    if (str13 != null) {
                                        str3 = str13;
                                    }
                                    c1055680dZu9.logAd(c1023960ckk9, str3, openCCTUtils24.LJIILJJIL, null, new AwS613S0100000_34(openCCTUtils24, 140));
                                }
                                this.LIZ.LJIIL = 1;
                                break;
                        }
                    }
                });
            }
            C0WWG c0wwg = new C0WWG(c0w59LIZJ);
            if (this.LJIL) {
                i = R.anim.fv;
                i2 = R.anim.g0;
            } else {
                i = R.anim.fq;
                i2 = R.anim.g4;
            }
            c0wwg.LIZJ = C1607950rwf.LIZIZ(i, i2, context).LJFF();
            if (this.LJIL) {
                i3 = R.anim.ft;
                i4 = R.anim.g2;
            } else {
                i3 = R.anim.fx;
                i4 = R.anim.fy;
            }
            c0wwg.LIZ.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C1607950rwf.LIZIZ(i3, i4, context).LJFF());
            C0WWF c0wwfLIZ = c0wwg.LIZ();
            if (str2 != null) {
                C2429209fW.LIZ().appendDataFlowId(c0wwfLIZ.LIZ, str2);
            }
            c0wwfLIZ.LIZ(context, UriProtector.parse(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("cct_customTabsIntent_launchUrl");
            LJI(context, str);
        }
    }

    public final boolean LJIIIIZZ(String str, BrowserConfig browserConfig, String str2) {
        Integer num;
        if (str == null || str.length() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        if (LIZ(str)) {
            return true;
        }
        if (browserConfig == null || (num = browserConfig.useAndroidCustomTab) == null || num.intValue() != 1) {
            return false;
        }
        Long l = browserConfig.actInternalTime;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0 && (Keva.getRepo("chrome_custom_tab_repo").getLong("openCCTLastTime", 0L) + jLongValue > System.currentTimeMillis() || Intrinsics.LJFF(this.LJIJ, str2))) {
                return false;
            }
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return false;
        }
        if (!TextUtils.isEmpty(C0W00.LIZ(activityLJFF, str))) {
            return true;
        }
        if (!Keva.getRepo("chrome_custom_tab_repo").getBoolean("hadLogNoCCT", false)) {
            C1055680dZu c1055680dZu = new C1055680dZu(new AdCCTLogModel(this.LJIJJ, this.LJIJI, this.LJIJJLI));
            C1043520dGI.LIZ.getClass();
            C1023960ckk c1023960ckk = C1043520dGI.LJFF;
            String str3 = this.LJIILIIL;
            if (str3 == null) {
                str3 = "";
            }
            c1055680dZu.logAd(c1023960ckk, str3, this.LJIILJJIL, null, AFwS281S0000000_34.get$arr$(6));
            Keva.getRepo("chrome_custom_tab_repo").storeBoolean("hadLogNoCCT", true);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    public final boolean LIZJ(String str, BrowserConfig browserConfig, String str2, String str3) {
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        this.LJIILIIL = str2;
        this.LJIILJJIL = str3;
        return LJIIIIZZ(str, browserConfig, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[PHI: r4
      0x004a: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v6 java.lang.String) binds: [B:25:0x0047, B:12:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e A[PHI: r4 r5
      0x004e: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v5 java.lang.String), (r4v5 java.lang.String) binds: [B:28:0x004b, B:15:0x0024, B:17:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r5v1 com.ss.android.ugc.aweme.feed.model.BrowserConfig) = 
      (r5v0 com.ss.android.ugc.aweme.feed.model.BrowserConfig)
      (r5v4 com.ss.android.ugc.aweme.feed.model.BrowserConfig)
      (r5v4 com.ss.android.ugc.aweme.feed.model.BrowserConfig)
     binds: [B:28:0x004b, B:15:0x0024, B:17:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.content.Context r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            boolean r0 = r1.LIZLLL(r14)
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r7 = 0
            if (r14 == 0) goto L46
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r14.getAwemeRawAd()
            if (r0 == 0) goto L46
            java.lang.String r4 = r0.getWebUrl()
        L16:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r14.getAwemeRawAd()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.BrowserConfig r5 = r0.getBrowserConfig()
        L20:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r14.getAwemeRawAd()
            if (r0 == 0) goto L4e
            java.lang.Long r0 = r0.getCreativeId()
            if (r0 == 0) goto L4e
            java.lang.String r6 = r0.toString()
        L30:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r14.getAwemeRawAd()
            if (r0 == 0) goto L3a
            java.lang.String r7 = r0.getLogExtra()
        L3a:
            r9 = 0
            r10 = 1
            r11 = 0
            r3 = r16
            r8 = r15
            r2 = r13
            boolean r0 = r1.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L46:
            r4 = r7
            if (r14 == 0) goto L4a
            goto L16
        L4a:
            r5 = r7
            if (r14 == 0) goto L4e
            goto L20
        L4e:
            r6 = r7
            if (r14 == 0) goto L3a
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cct.OpenCCTUtils.LJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194  */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.1BUx] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.0W50, X.1BUw] */
    @Override // com.ss.android.ugc.aweme.cct.IOpenCCTUtils
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(final android.content.Context r19, int r20, java.lang.String r21, com.ss.android.ugc.aweme.feed.model.BrowserConfig r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, final java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cct.OpenCCTUtils.LIZIZ(android.content.Context, int, java.lang.String, com.ss.android.ugc.aweme.feed.model.BrowserConfig, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):boolean");
    }
}
