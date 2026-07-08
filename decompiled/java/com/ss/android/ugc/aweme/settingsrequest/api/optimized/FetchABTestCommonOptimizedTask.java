package com.ss.android.ugc.aweme.settingsrequest.api.optimized;

import X.AbstractC19483511Kn;
import X.C08QB;
import X.C08QT;
import X.C09RB;
import X.C0C7T;
import X.C0C7W;
import X.C0C7X;
import X.C0CCZ;
import X.C0CJ1;
import X.C0CJ2;
import X.C0CJW;
import X.C0CKZ;
import X.C0CL9;
import X.C0VSJ;
import X.C0VZ0;
import X.C0X52;
import X.C0XB4;
import X.C11NJ;
import X.C11S5;
import X.C1319780kRs;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C1514430pVp;
import X.C202094145s;
import X.C2084808Es;
import X.C2188811AlT;
import X.C2456309jt;
import X.C259800zU;
import X.C292560BdO;
import X.C296760BkA;
import X.C296780BkC;
import X.C308400C7a;
import X.C311520CJa;
import X.C311590CJh;
import X.C311710CJt;
import X.C311990CKv;
import X.C312010CKx;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC311630CJl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1487280oo2;
import X.InterfaceC19483011Ki;
import X.InterfaceC2210981Bg8;
import X.InterfaceC2661011f;
import Y.AfS102S0300000_4;
import Y.AkS322S0200000_4;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.api.ABTestRequestBody;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedTask;
import com.ss.android.ugc.aweme.spi.HomeTabNUJService;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchABTestCommonOptimizedTask implements C0CCZ {
    public static volatile boolean LLILZLL;
    public static volatile boolean LLIZ;
    public static InterfaceC2210981Bg8 LLIZLLLIL = new InterfaceC2210981Bg8() { // from class: X.0C7z
        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            if (FetchABTestCommonOptimizedTask.LLIZ) {
                return;
            }
            if (C0C76.LIZ() != null) {
                C0C76.LIZ().isOpen();
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new FetchABTestCommonOptimizedTask(0, new C0C7T()));
            c799890VZj.LIZIZ();
            FetchABTestCommonOptimizedTask.LLIZLLLIL = null;
        }
    };
    public final int LL;
    public final C0C7T LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILLL = true;
    public final C11NJ LLILZIL = new C11NJ();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchABTestCommonOptimizedTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C296760BkA.LIZ() == 1 ? EnumC799870VZh.FIRST_WINDOW_FOCUS : C296760BkA.LIZ() == 2 ? EnumC799870VZh.BOOT_FINISH : (C296760BkA.LIZ() == 3 && C2456309jt.LIZ()) ? EnumC799870VZh.FIRST_WINDOW_FOCUS : EnumC799870VZh.BACKGROUND;
    }

    public final void LJ(String str) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(contextLIZ).getPath());
        sbLIZ.append('/');
        sbLIZ.append(C2084808Es.LIZ("cdn_file"));
        sbLIZ.append('/');
        sbLIZ.append(C2084808Es.LIZ(str));
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(C08QB.LJIILIIL(c0vsj), AFwS232S0000000_4.get$arr$(70)));
            while (c08qt.hasNext()) {
                File file = (File) c08qt.next();
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        Set<String> setLIZ = this.LLILLJJLI.LJFF.LIZ();
        setLIZ.remove(str);
        C0CJ1 c0cj1 = this.LLILLJJLI.LJFF;
        ((Keva) c0cj1.LJFF.getValue()).storeStringSet(c0cj1.LIZLLL, setLIZ);
    }

    /* JADX WARN: Type inference failed for: r1v30, types: [T, X.0C7W] */
    /* JADX WARN: Type inference failed for: r1v31, types: [T, X.0C7W] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, X.0C7W] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws JSONException {
        SettingApi settingApi;
        String strLJJJ;
        int i;
        AbstractC19483511Kn<C0X52<k>> abstractC19483511KnQueryABTestCommon;
        int i2;
        boolean z;
        InterfaceC2661011f interfaceC2661011fLIZ;
        C0CJW.LIZLLL.LJI(SystemClock.uptimeMillis() - C202094145s.LJIILL, "ab_common_request_build");
        C0CKZ.LIZLLL.LJ("ab_common_request_build");
        if (!C311520CJa.LIZ.LJIIIIZZ()) {
            return;
        }
        C0CJ2.LIZLLL().storeInt("fetch_request_type", 2);
        long jNanoTime = System.nanoTime();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ("https://libra-va.tiktokv.com")) != null) {
            settingApi = (SettingApi) interfaceC2661011fLIZ.create(SettingApi.class);
        } else {
            settingApi = null;
        }
        String strValueOf = String.valueOf(1233);
        C0CJ1 c0cj1 = this.LLILLJJLI.LJFF;
        boolean z2 = ((Keva) c0cj1.LJFF.getValue()).getBoolean(c0cj1.LIZ, true);
        this.LLILZ = z2;
        if (z2 && !LLILZLL && !LLIZ) {
            LLILZLL = true;
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(LLIZLLLIL);
        }
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (this.LLILZ && (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null || strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() == 0 || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId))) {
            i = 1;
            abstractC19483511KnQueryABTestCommon = null;
        } else {
            try {
                if (C1514430pVp.LIZLLL().booleanValue()) {
                    IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
                    if (iEcUgNewInstallService != null) {
                        iEcUgNewInstallService.LJ();
                    }
                    HomeTabNUJService homeTabNUJService = (HomeTabNUJService) PluggableExtentionKt.pluggableSpi$default(HomeTabNUJService.class, false, false, false, 14, null);
                    if (homeTabNUJService != null) {
                        homeTabNUJService.LIZ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            LLIZ = true;
            C0CJ1 c0cj12 = this.LLILLJJLI.LJFF;
            ((Keva) c0cj12.LJFF.getValue()).storeBoolean(c0cj12.LIZ, false);
            int iLIZ = C1319780kRs.LIZ(contextLIZ);
            String strLIZ = C312010CKx.LIZ();
            C292560BdO.LJ();
            String[] strArrLJII = C292560BdO.LJII();
            int iLIZ2 = C311710CJt.LIZ();
            if (iLIZ2 <= 0) {
                strLJJJ = "";
            } else if (strArrLJII.length > iLIZ2) {
                strLJJJ = C13LP.LJJLIIIJ(C13LQ.LJJL(strArrLJII, C13LZ.LJIILJJIL(0, iLIZ2)), ",", null, null, 0, null, null, 62);
            } else {
                strLJJJ = C13LQ.LJJJ(strArrLJII, ",", null, null, null, 62);
            }
            C311520CJa c311520CJa = C311520CJa.LIZ;
            c311520CJa.getClass();
            long j = 21;
            if (C311520CJa.LJII()) {
                C0C7X c0c7xLIZIZ = C0C7T.LIZIZ(this.LLILLJJLI, 0);
                if (c0c7xLIZIZ != null) {
                    this.LLILLL = false;
                }
                if (settingApi != null) {
                    C844470XAv.LIZ.getClass();
                    long jLJ = C844470XAv.LJ();
                    String strLIZ2 = C0CL9.LIZ();
                    String strLIZ3 = C0XB4.LIZ(contextLIZ);
                    String strLIZ4 = C311990CKv.LIZ();
                    if (!C296780BkC.LIZ()) {
                        j = 5;
                    }
                    c311520CJa.getClass();
                    if (C311520CJa.LJII()) {
                        j |= 32;
                    }
                    if (c0c7xLIZIZ != null) {
                        i2 = c0c7xLIZIZ.LIZ;
                        List<String> list = c0c7xLIZIZ.LIZIZ;
                        if (list == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
                        }
                        ABTestRequestBody aBTestRequestBody = new ABTestRequestBody(i2, listLLIIII);
                        i = 1;
                        abstractC19483511KnQueryABTestCommon = settingApi.queryABTestCommonByGroup(strValueOf, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, jLJ, 1, strLIZ, iLIZ, strLIZ2, strLIZ3, strLIZ4, j, strLJJJ, aBTestRequestBody, 10485760);
                    } else {
                        i2 = 256;
                    }
                    List listLLIIII = C13BV.INSTANCE;
                    ABTestRequestBody aBTestRequestBody2 = new ABTestRequestBody(i2, listLLIIII);
                    i = 1;
                    abstractC19483511KnQueryABTestCommon = settingApi.queryABTestCommonByGroup(strValueOf, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, jLJ, 1, strLIZ, iLIZ, strLIZ2, strLIZ3, strLIZ4, j, strLJJJ, aBTestRequestBody2, 10485760);
                }
                i = 1;
                abstractC19483511KnQueryABTestCommon = null;
            } else {
                i = 1;
                if (settingApi == null) {
                    abstractC19483511KnQueryABTestCommon = null;
                } else {
                    C844470XAv.LIZ.getClass();
                    long jLJ2 = C844470XAv.LJ();
                    String strLIZ5 = C0CL9.LIZ();
                    String strLIZ6 = C0XB4.LIZ(contextLIZ);
                    String strLIZ7 = C311990CKv.LIZ();
                    if (!C296780BkC.LIZ()) {
                        j = 5;
                    }
                    c311520CJa.getClass();
                    if (C311520CJa.LJII()) {
                        j |= 32;
                    }
                    abstractC19483511KnQueryABTestCommon = settingApi.queryABTestCommon(strValueOf, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, jLJ2, 1, strLIZ, iLIZ, strLIZ5, strLIZ6, strLIZ7, j, strLJJJ, 10485760);
                }
            }
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C0C7W.GET_ALL_UPDATE;
        int i3 = this.LL;
        long j2 = C202094145s.LJIILL;
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService != null && iAppContextService.isAppBackground() == i) {
            z = true;
        } else {
            z = false;
        }
        C311590CJh c311590CJhLIZ = C308400C7a.LIZ(i3, j2, z, this.LLILZ, AFwS287S0000000_4.get$arr$(17));
        if (c311590CJhLIZ != null) {
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            c311590CJhLIZ.LJII = jNanoTime2 / j3;
            c311590CJhLIZ.LJJIJ = SystemClock.elapsedRealtimeNanos() / j3;
            C311520CJa.LIZ.getClass();
            if (C311520CJa.LJII()) {
                if (this.LLILLL) {
                    c311590CJhLIZ.LJI = i;
                    c259800zU.element = C0C7W.POST_ALL_UPDATE;
                } else {
                    c311590CJhLIZ.LJI = 2;
                    c259800zU.element = C0C7W.POST_INCREMENT_UPDATE;
                }
            } else {
                c311590CJhLIZ.LJI = 0;
            }
        } else {
            c311590CJhLIZ = null;
        }
        if (abstractC19483511KnQueryABTestCommon == null) {
            if (c311590CJhLIZ != null) {
                c311590CJhLIZ.LJ(EnumC311630CJl.REQUEST_BUILD_FAILED);
                c311590CJhLIZ.LIZIZ();
            }
            C311520CJa.LIZ.LIZJ();
            return;
        }
        this.LLILZIL.LIZ(abstractC19483511KnQueryABTestCommon.LJIJJ(C11S5.LIZ()).LJIILIIL(C11S5.LIZ()).LJIIL(new AkS322S0200000_4(c311590CJhLIZ, this, 1)).LJIIIZ(new InterfaceC19483011Ki() { // from class: X.0CKB
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((C0CKM) obj).LIZIZ instanceof n;
            }
        }).LJIIL(new InterfaceC1487280oo2() { // from class: X.0CK7
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0CKM c0ckm = (C0CKM) obj;
                return new C0CJY(c0ckm.LIZ, (n) c0ckm.LIZIZ);
            }
        }).LJIILJJIL(1L, new InterfaceC19483011Ki() { // from class: X.0CKI
            @Override // X.InterfaceC19483011Ki
            public final /* bridge */ /* synthetic */ boolean test(Object obj) {
                return false;
            }
        }).LJIIZILJ(new AfS102S0300000_4(this, c311590CJhLIZ, c259800zU, 7), new AfS102S0300000_4(c311590CJhLIZ, this, context, 8)));
        C0CKZ c0ckz = C0CKZ.LIZLLL;
        c0ckz.LJI("ab_common_request_build");
        c0ckz.LJ("ab_common_request_duration");
    }

    public FetchABTestCommonOptimizedTask(int i, C0C7T c0c7t) {
        this.LL = i;
        this.LLILLJJLI = c0c7t;
    }

    public final n LIZ(n nVar, n nVar2) {
        k kVarLJJIIZ;
        n nVar3 = new n();
        Set<String> setLJJIJIL = nVar.LJJIJIL();
        if (setLJJIJIL != null) {
            for (String str : setLJJIJIL) {
                if (str != null && (kVarLJJIIZ = nVar.LJJIIZ(str)) != null && (kVarLJJIIZ instanceof n)) {
                    n nVar4 = (n) kVarLJJIIZ;
                    nVar3.LJJIFFI(str, nVar4.LJJIIZ("val"));
                    q qVarLJJIJIIJI = nVar4.LJJIJIIJI("type");
                    if (qVarLJJIJIIJI != null && (qVarLJJIJIIJI.LL instanceof Number) && qVarLJJIJIIJI.LJIIJJI() == 21) {
                        nVar2.LJJIFFI(str, nVar4.LJJIJIIJI("vid"));
                    }
                }
            }
        }
        return nVar3;
    }
}
