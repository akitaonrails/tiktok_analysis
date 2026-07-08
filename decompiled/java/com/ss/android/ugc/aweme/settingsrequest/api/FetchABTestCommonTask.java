package com.ss.android.ugc.aweme.settingsrequest.api;

import X.AbstractC19483511Kn;
import X.C08QB;
import X.C08QT;
import X.C09JN;
import X.C09RB;
import X.C0BEC;
import X.C0C5Q;
import X.C0C7U;
import X.C0CCZ;
import X.C0CJ2;
import X.C0CJ4;
import X.C0CJ5;
import X.C0CJS;
import X.C0CKZ;
import X.C0CL9;
import X.C0VSJ;
import X.C0VZ0;
import X.C0X52;
import X.C0XB4;
import X.C11NJ;
import X.C11S5;
import X.C1259804wO;
import X.C1319780kRs;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C1514430pVp;
import X.C1AF0;
import X.C202094145s;
import X.C2084808Es;
import X.C2097608Jq;
import X.C2155308cR;
import X.C2188811AlT;
import X.C2456309jt;
import X.C292560BdO;
import X.C296760BkA;
import X.C296780BkC;
import X.C311520CJa;
import X.C311600CJi;
import X.C311660CJo;
import X.C311710CJt;
import X.C311760CJy;
import X.C311990CKv;
import X.C312010CKx;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.C844470XAv;
import X.EnumC311620CJk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1487280oo2;
import X.InterfaceC19483011Ki;
import X.InterfaceC2210981Bg8;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.api.ABTestRequestBody;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import com.ss.android.ugc.aweme.settingsrequest.FetchABCDNConfig;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonTask;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.spi.HomeTabNUJService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchABTestCommonTask implements C0CCZ {
    public static volatile boolean LLILZ;
    public static volatile boolean LLILZIL;
    public static InterfaceC2210981Bg8 LLILZLL = new InterfaceC2210981Bg8() { // from class: X.0C9T
        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            if (FetchABTestCommonTask.LLILZIL) {
                return;
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new FetchABTestCommonTask(0));
            c799890VZj.LIZIZ();
            FetchABTestCommonTask.LLILZLL = null;
        }
    };
    public final int LL;
    public boolean LLILLJJLI = true;
    public final C11NJ LLILLL = new C11NJ();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchABTestCommonTask";
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

    public final void LIZ() {
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
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C296760BkA.LIZ() == 1 ? EnumC799870VZh.FIRST_WINDOW_FOCUS : C296760BkA.LIZ() == 2 ? EnumC799870VZh.BOOT_FINISH : (C296760BkA.LIZ() == 3 && C2456309jt.LIZ()) ? EnumC799870VZh.FIRST_WINDOW_FOCUS : EnumC799870VZh.BACKGROUND;
    }

    public FetchABTestCommonTask(int i) {
        this.LL = i;
    }

    public final void LJ(String str) {
        C0CKZ c0ckz = C0CKZ.LIZLLL;
        c0ckz.LJI("ab_common_request_save_config_data");
        c0ckz.LJ("ab_common_request_save_config_data_finish_to_end");
        C2155308cR.LIZ();
        ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJIILIIL(str);
        C0C5Q.LIZ = null;
    }

    public final n LJIIIIZZ(n nVar) {
        k kVarLJJIIZ;
        n nVar2 = new n();
        Set<String> setLJJIJIL = nVar.LJJIJIL();
        if (setLJJIJIL != null) {
            for (String str : setLJJIJIL) {
                if (str != null && (kVarLJJIIZ = nVar.LJJIIZ(str)) != null && (kVarLJJIIZ instanceof n)) {
                    nVar2.LJJIFFI(str, ((n) kVarLJJIIZ).LJJIIZ("val"));
                }
            }
        }
        return nVar2;
    }

    public final void LJIIIZ(String str) {
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
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(C08QB.LJIILIIL(c0vsj), AFwS232S0000000_4.get$arr$(67)));
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
        Set setLIZ = C0CJ2.LIZ();
        setLIZ.remove(str);
        C0CJ2.LJFF(setLIZ);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) throws JSONException {
        String strLJJJ;
        boolean zLJII;
        AbstractC19483511Kn<C0X52<k>> abstractC19483511KnQueryABTestCommon;
        C0CKZ c0ckz = C0CKZ.LIZLLL;
        c0ckz.LJ("ab_common_request_build");
        C311520CJa c311520CJa = C311520CJa.LIZ;
        if (!c311520CJa.LJIIIIZZ()) {
            return;
        }
        if (context == null) {
            c311520CJa.LIZJ();
            return;
        }
        C0C7U c0c7u = new C0C7U();
        c0c7u.LIZIZ().storeInt(c0c7u.LJFF, 2);
        long jNanoTime = System.nanoTime();
        boolean zLJ = C0CJ2.LJ();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C0BEC.LJ(contextLIZ)) {
            if (C311520CJa.LJII() && !((List) C311520CJa.LJFF(0).getSecond()).isEmpty()) {
                this.LLILLJJLI = false;
            }
            abstractC19483511KnQueryABTestCommon = C311760CJy.LIZIZ.LIZIZ(contextLIZ, C0CL9.LIZ());
            LIZ();
        } else {
            SettingApi settingApi = (SettingApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ("https://libra-va.tiktokv.com").create(SettingApi.class);
            String strValueOf = String.valueOf(1233);
            boolean zLJ2 = C0CJ2.LJ();
            if (zLJ2 && !LLILZ && !LLILZIL) {
                LLILZ = true;
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(LLILZLL);
            }
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            if (zLJ2 && (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null || strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() == 0 || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId))) {
                abstractC19483511KnQueryABTestCommon = null;
            } else {
                LIZ();
                LLILZIL = true;
                C0CJ2.LIZLLL().storeBoolean("is_fetch_launch", false);
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
                if (zLJ2) {
                    int iLIZ3 = C1259804wO.LIZ();
                    if (iLIZ3 != 0) {
                        if (iLIZ3 != 1) {
                            zLJII = C311520CJa.LJII();
                        } else {
                            zLJII = true;
                        }
                    } else {
                        zLJII = false;
                    }
                } else {
                    zLJII = C311520CJa.LJII();
                }
                long j = 21;
                if (zLJII) {
                    Pair pairLJFF = C311520CJa.LJFF(0);
                    if (!((List) pairLJFF.getSecond()).isEmpty()) {
                        this.LLILLJJLI = false;
                    }
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
                    abstractC19483511KnQueryABTestCommon = settingApi.queryABTestCommonByGroup(strValueOf, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, jLJ, 1, strLIZ, iLIZ, strLIZ2, strLIZ3, strLIZ4, j, strLJJJ, new ABTestRequestBody(((Number) pairLJFF.getFirst()).intValue(), (List) pairLJFF.getSecond()), 10485760);
                } else {
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
        final C311600CJi c311600CJiLIZ = C311660CJo.LIZ(this.LL, C202094145s.LJIILL, C0BEC.LJ(context), zLJ, AFwS287S0000000_4.get$arr$(14));
        if (c311600CJiLIZ != null) {
            c311600CJiLIZ.LIZLLL((System.nanoTime() - jNanoTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            if (C311520CJa.LJII()) {
                if (this.LLILLJJLI) {
                    c311600CJiLIZ.LJI = 1;
                } else {
                    c311600CJiLIZ.LJI = 2;
                }
            } else {
                c311600CJiLIZ.LJI = 0;
            }
        } else {
            c311600CJiLIZ = null;
        }
        if (abstractC19483511KnQueryABTestCommon == null) {
            if (c311600CJiLIZ != null) {
                c311600CJiLIZ.LJI(EnumC311620CJk.REQUEST_BUILD_FAILED);
                c311600CJiLIZ.LIZJ();
            }
            c311520CJa.LIZJ();
            return;
        }
        this.LLILLL.LIZ(abstractC19483511KnQueryABTestCommon.LJIJJ(C11S5.LIZ()).LJIILIIL(C11S5.LIZ()).LJIIL(new InterfaceC1487280oo2() { // from class: X.0CK4
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                int length;
                C080U next;
                String str;
                C0X52 c0x52 = (C0X52) obj;
                try {
                    length = (int) c0x52.LIZ.LJ.length();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    length = 0;
                }
                C311600CJi c311600CJi = c311600CJiLIZ;
                if (c311600CJi != null) {
                    c311600CJi.LJII();
                    c311600CJi.LJIILIIL = length;
                }
                Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ.toLowerCase(Locale.ROOT), "x-tt-logid")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C080U c080u = next;
                if (c080u != null && (str = c080u.LIZIZ) != null) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("x-tt-logid:");
                    sbLIZ.append(str);
                    C1720106oR.LJI("FetchAB/CommonRequest", C2188811AlT.LIZIZ(sbLIZ));
                    ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class);
                    if (iSettingsRequestService != null) {
                        iSettingsRequestService.LJIIJJI(C2097608Jq.LJIIJ(new Pair("commonLogId", str)));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("x-tt-logid", str);
                    String str2 = c0x52.LIZ.LIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put("url", str2);
                    ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) ServiceManager.get().getService(ISettingRequestExtraInfo.class);
                    if (iSettingRequestExtraInfo != null) {
                        iSettingRequestExtraInfo.LIZIZ(linkedHashMap);
                    }
                }
                return new C0CKM(c0x52.LIZ.LIZ, (k) c0x52.LIZIZ);
            }
        }).LJIIIZ(new InterfaceC19483011Ki() { // from class: X.0CK9
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((C0CKM) obj).LIZIZ instanceof n;
            }
        }).LJIIL(new InterfaceC1487280oo2() { // from class: X.0CK5
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0CKM c0ckm = (C0CKM) obj;
                return new C0CJY(c0ckm.LIZ, (n) c0ckm.LIZIZ);
            }
        }).LJIILJJIL(1L, new InterfaceC19483011Ki() { // from class: X.0CKG
            @Override // X.InterfaceC19483011Ki
            public final /* bridge */ /* synthetic */ boolean test(Object obj) {
                return false;
            }
        }).LJIIZILJ(new C09JN() { // from class: X.0CJZ
            /* JADX WARN: Type inference failed for: r4v1, types: [X.0CJT] */
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                C1C7U.LIZ("FetchABTestCommonTask@c5b4.run$result$5");
                final C0CJY c0cjy = (C0CJY) obj;
                try {
                    C311600CJi c311600CJi = c311600CJiLIZ;
                    if (c311600CJi != null) {
                        c311600CJi.LJIIJ = SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                    C0CKZ.LIZLLL.LJI("ab_common_request_duration");
                    final FetchABTestCommonTask fetchABTestCommonTask = this;
                    final C311600CJi c311600CJi2 = c311600CJiLIZ;
                    final Context context2 = context;
                    ?? r4 = new Runnable() { // from class: X.0CJT
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
                        /* JADX WARN: Type inference failed for: r11v0, types: [T, com.google.gson.n, java.lang.Object] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ() throws org.json.JSONException {
                            /*
                                Method dump skipped, instruction units count: 1092
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0CJT.LIZ():void");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FetchABTestCommonTask@c5b4.run$result$5$runnable$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FetchABTestCommonTask@c5b4.run$result$5$runnable$1");
                        }
                    };
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C311600CJi c311600CJi3 = c311600CJiLIZ;
                    if (c311600CJi3 != null) {
                        c311600CJi3.LJI(EnumC311620CJk.DATA_STORE_FAILED);
                        c311600CJi3.LJFF(th.toString());
                        c311600CJi3.LIZJ();
                    }
                }
                C1C7U.LIZIZ("FetchABTestCommonTask@c5b4.run$result$5");
            }
        }, new C09JN() { // from class: X.0CJn
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                C1C7U.LIZ("FetchABTestCommonTask@c5b4.run$result$6");
                Throwable th = (Throwable) obj;
                C311600CJi c311600CJi = c311600CJiLIZ;
                if (c311600CJi != null) {
                    c311600CJi.LJI(EnumC311620CJk.REQUEST_FAIL);
                    c311600CJi.LJFF(String.valueOf(th.getMessage()));
                    c311600CJi.LIZJ();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FetchABTestCommonRequest failed, is_combine = false, throwable = ");
                sbLIZ.append(th);
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
                    c2344009Gk.LJIIIIZZ("source", "1");
                    C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
                }
                C1C7U.LIZIZ("FetchABTestCommonTask@c5b4.run$result$6");
            }
        }));
        c0ckz.LJI("ab_common_request_build");
        c0ckz.LJ("ab_common_request_duration");
    }

    public final void LJFF(n nVar, final n nVar2, final Set<String> set) {
        try {
            if (C296780BkC.LIZ()) {
                if (!nVar.LJJIJIIJIL("__CDN_URL__")) {
                    Iterator it2 = C0CJ2.LIZ().iterator();
                    while (it2.hasNext()) {
                        LJIIIZ((String) it2.next());
                    }
                    return;
                }
                h hVarLJJIIZI = nVar.LJJIIZI("__CDN_URL__");
                HashMap map = new HashMap();
                int size = hVarLJJIIZI.size();
                for (int i = 0; i < size; i++) {
                    if (((q) hVarLJJIIZI.LJJIIJZLJL(i)).LL instanceof String) {
                        C0CJ5 c0cj5 = new C0CJ5(hVarLJJIIZI.LJJIIJZLJL(i).LJIL());
                        String str = c0cj5.LIZJ;
                        Object arrayList = map.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(str, arrayList);
                        }
                        ((List) arrayList).add(c0cj5);
                    }
                }
                for (String str2 : C0CJ2.LIZ()) {
                    if (!map.containsKey(str2)) {
                        LJIIIZ(str2);
                        Set setLIZ = C0CJ2.LIZ();
                        setLIZ.remove(str2);
                        C0CJ2.LJFF(setLIZ);
                    }
                }
                if (!map.isEmpty()) {
                    final HashMap map2 = new HashMap();
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        map2.put(((Map.Entry) it3.next()).getKey(), Boolean.FALSE);
                    }
                    for (final Map.Entry entry : map.entrySet()) {
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(new FetchABCDNConfig((List) entry.getValue(), new C0CJ4() { // from class: X.0C75
                            @Override // X.C0CJ4
                            public final void onFailed() {
                            }

                            @Override // X.C0CJ4
                            public final void LIZ() {
                                HashMap<String, Boolean> map3 = map2;
                                String key = entry.getKey();
                                Boolean bool = Boolean.TRUE;
                                map3.put(key, bool);
                                if (Intrinsics.LJFF(map2.get(entry.getKey()), bool)) {
                                    Collection<Boolean> collectionValues = map2.values();
                                    if (!collectionValues.isEmpty()) {
                                        Iterator<T> it4 = collectionValues.iterator();
                                        while (it4.hasNext()) {
                                            if (!Intrinsics.LJFF(it4.next(), Boolean.TRUE)) {
                                                return;
                                            }
                                        }
                                    }
                                    Set<String> set2 = set;
                                    if (set2 == null || set2.isEmpty()) {
                                        Map<String, Integer> map4 = C308300C6q.LIZ;
                                        C308300C6q.LIZJ(nVar2);
                                    } else {
                                        Map<String, Integer> map5 = C308300C6q.LIZ;
                                        C308300C6q.LIZLLL(nVar2, set);
                                    }
                                }
                            }
                        }));
                        c799890VZj.LIZIZ();
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final Map<Integer, C0CJS> LJIIJ(n nVar, n nVar2, n nVar3, boolean z) {
        if (nVar3 == null) {
            return new LinkedHashMap(C2097608Jq.LJ());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJ());
        for (Map.Entry<String, k> entry : nVar3.entrySet()) {
            try {
                n nVarLJIILIIL = entry.getValue().LJIILIIL();
                q qVarLJJIJIIJI = nVarLJIILIIL.LJJIJIIJI("type");
                if (z) {
                    q qVarLJJIJIIJI2 = nVarLJIILIIL.LJJIJIIJI("group");
                    if (qVarLJJIJIIJI2 != null && (qVarLJJIJIIJI2.LL instanceof Number)) {
                        C0CJS c0cjs = (C0CJS) linkedHashMap.get(Integer.valueOf(qVarLJJIJIIJI2.LJIIJJI()));
                        if (c0cjs == null) {
                            c0cjs = new C0CJS();
                            c0cjs.LIZ = qVarLJJIJIIJI2.LJIIJJI();
                            c0cjs.LIZJ = new LinkedHashSet();
                            linkedHashMap.put(Integer.valueOf(qVarLJJIJIIJI2.LJIIJJI()), c0cjs);
                        }
                        c0cjs.LIZJ.add(entry.getKey());
                    } else {
                        C0CJS c0cjs2 = (C0CJS) linkedHashMap.get(Integer.MAX_VALUE);
                        if (c0cjs2 == null) {
                            c0cjs2 = new C0CJS();
                            c0cjs2.LIZJ = new LinkedHashSet();
                            linkedHashMap.put(Integer.MAX_VALUE, c0cjs2);
                        }
                        c0cjs2.LIZJ.add(entry.getKey());
                    }
                } else if (qVarLJJIJIIJI != null && (qVarLJJIJIIJI.LL instanceof Number) && qVarLJJIJIIJI.LJIIJJI() == 21) {
                    nVar.LJJIFFI(entry.getKey(), nVarLJIILIIL.LJJIJIIJI("vid"));
                } else {
                    nVar2.LJJIFFI(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(th);
                sbLIZ.append("  ,cdn config key: ");
                sbLIZ.append(entry);
                sbLIZ.append(".key");
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return linkedHashMap;
    }
}
