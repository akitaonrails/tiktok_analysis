package com.ss.android.ugc.tiktok.samsungfinder;

import X.C0CQO;
import X.C0WI7;
import X.C0WIE;
import X.C0WIH;
import X.C0WIS;
import X.C0WIU;
import X.C0WIZ;
import X.C0WZX;
import X.C0X35;
import X.C11JF;
import X.C11S5;
import X.C13LP;
import X.C20684815ws;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C267600AeE;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import X.C837870Wtt;
import X.C844470XAv;
import Y.ARunnableS82S0200000_13;
import Y.AfS40S1200000_13;
import Y.AfS46S1100000_13;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class SamsungSearchTikTokBrowserService extends MediaBrowserServiceCompat {
    public MediaSessionCompat LLIZLLLIL;
    public C11JF LLJ;
    public String LLJI = "";

    @Override // android.app.Service
    public final void onDestroy() {
        MediaSessionCompat mediaSessionCompat = this.LLIZLLLIL;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.LJ();
        }
        C11JF c11jf = this.LLJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        super.onDestroy();
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public final void onCreate() {
        super.onCreate();
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "SamsungSearchTikTokBrowserService", null, null);
        mediaSessionCompat.LJI(new MediaSessionCompat.Callback() { // from class: X.0WIF
        }, null);
        MediaSessionCompat.Token token = mediaSessionCompat.LIZ.LIZIZ;
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.LLILZLL != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.LLILZLL = token;
        C0WIU c0wiu = this.LL;
        c0wiu.LIZLLL.LLILZIL.LIZ(new ARunnableS82S0200000_13(c0wiu, token, 4));
        this.LLIZLLLIL = mediaSessionCompat;
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final C0WIH LIZIZ(String str) {
        String strLJJLIIIJ;
        ArrayList arrayList;
        if (!C0WI7.LIZIZ.contains(str)) {
            String str2 = C0X35.LJII;
            if (Keva.getRepo("ColdBootHelper").getLong(str2, 0L) > 0) {
                C786410Ut5.LJLIIL(Keva.getRepo("ColdBootHelper").getLong(str2, 0L), new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.09dU
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SamsungSearchTikTokBrowserService@d2ae.onGetRoot$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SamsungSearchTikTokBrowserService@d2ae.onGetRoot$1");
                    }

                    public static void LIZ() {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null) {
                            Activity activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                            if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                                return;
                            }
                        }
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if ((abstractC1387200mCcLJ == null || abstractC1387200mCcLJ.LIZLLL() == null) && C1906580ziK.LJI()) {
                            Application applicationLIZ = C1BWL.LIZ();
                            if (applicationLIZ != null) {
                                try {
                                    ActivityManager activityManager = (ActivityManager) applicationLIZ.getSystemService(ActivityManager.class);
                                    if (activityManager != null) {
                                        for (ActivityManager.RunningServiceInfo runningServiceInfo : C2204961BRm.LJIIIIZZ(activityManager, 100, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuA/z3N4wkEe68wdH2+WBE=", null))) {
                                            if (runningServiceInfo.pid == Process.myPid() && !runningServiceInfo.foreground) {
                                                try {
                                                    applicationLIZ.stopService(new Intent().setComponent(new ComponentName(applicationLIZ.getPackageName(), C2204961BRm.LJJIJIIJIL(runningServiceInfo.service, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuA/z3N4wkEe68wdH2+WBE=", null)))));
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                            Process.killProcess(Process.myPid());
                        }
                    }
                });
            }
            return null;
        }
        PackageManager packageManager = getPackageManager();
        if (str != null) {
            int i = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    SigningInfo signingInfo = C786410Ut5.Y3(packageManager, str, 134217728).signingInfo;
                    if (signingInfo != null) {
                        if (signingInfo.hasMultipleSigners()) {
                            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                            arrayList = new ArrayList(apkContentsSigners.length);
                            int length = apkContentsSigners.length;
                            while (i < length) {
                                arrayList.add(C0WI7.LIZ(apkContentsSigners[i]));
                                i++;
                            }
                        } else {
                            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            arrayList = new ArrayList(signingCertificateHistory.length);
                            int length2 = signingCertificateHistory.length;
                            while (i < length2) {
                                arrayList.add(C0WI7.LIZ(signingCertificateHistory[i]));
                                i++;
                            }
                        }
                        strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                strLJJLIIIJ = "";
            } else {
                try {
                    Signature[] signatureArr = C786410Ut5.Y3(packageManager, str, 64).signatures;
                    if (signatureArr != null) {
                        arrayList = new ArrayList(signatureArr.length);
                        int length3 = signatureArr.length;
                        while (i < length3) {
                            arrayList.add(C0WI7.LIZ(signatureArr[i]));
                            i++;
                        }
                        strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                strLJJLIIIJ = "";
            }
        } else {
            strLJJLIIIJ = "";
        }
        this.LLJI = strLJJLIIIJ;
        return new C0WIH("snssdk1233://search?keyword=%s&enter_method=click&enter_from=samsung_search&enter_from_sub=app_outside", null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZJ(C0WIS c0wis) {
        c0wis.LIZLLL(null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZLLL(C0WIZ c0wiz, String str) throws Throwable {
        String strLLLLLIL;
        AdvertisingIdClient.Info infoLIZIZ;
        C0WIE.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("oem_name", "samsung");
        c2344009Gk.LJIIIIZZ("oem_country", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase());
        c2344009Gk.LJIIIIZZ("query", str);
        C20684815ws.LJIILLIIL("oem_search", c2344009Gk.LIZ);
        c0wiz.LIZ();
        boolean z = false;
        if (!((Boolean) C267600AeE.LIZ.getValue()).booleanValue()) {
            C0WIE.LIZ(str, "function_disabled");
        } else if (!C0WI7.LIZ.contains(this.LLJI.toLowerCase(Locale.ROOT))) {
            C0WIE.LIZ(str, "wrong_signature");
        } else if (((ITpcConsentService) ServiceManager.get().getService(ITpcConsentService.class)).LJ()) {
            C0WIE.LIZ(str, "consent_not_passed");
        } else if (((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false)) {
            C0WIE.LIZ(str, "not_login");
        } else {
            z = true;
        }
        if (!z) {
            c0wiz.LIZLLL(null);
        }
        SamsungSearchApi.LIZ.getClass();
        try {
            C844470XAv.LIZ.getClass();
            infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (infoLIZIZ != null) {
            strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS7YpLdyTyrGsJ68iw1VvDD88TVkbkGqCXiF3ZLzxg=", null));
            if (strLLLLLIL == null) {
                strLLLLLIL = "";
            }
        } else {
            strLLLLLIL = "";
        }
        this.LLJ = (C11JF) C0CQO.LIZIZ.getVideos(strLLLLLIL, str, 103005, 20).LJL(C11S5.LIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS40S1200000_13(this, c0wiz, str, 13), new AfS46S1100000_13(c0wiz, str, 12));
    }
}
