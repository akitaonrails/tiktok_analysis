package com.bytedance.android.livesdk.internal;

import X.C011Z;
import X.C09AJ;
import X.C0B40;
import X.C0URJ;
import X.C0W7U;
import X.C10EU;
import X.C1119850fFP;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1338270kvh;
import X.C1401820maC;
import X.C145E;
import X.C1492170ovv;
import X.C14W2;
import X.C19273110af;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C19771812Xk;
import X.C19EG;
import X.C1AF0;
import X.C1AK3;
import X.C1AKK;
import X.C1C7U;
import X.C20338414i6;
import X.C20441214yg;
import X.C2162308dZ;
import X.C2214201BlK;
import X.C2222691Bz1;
import X.C476240Ily;
import X.C786410Ut5;
import X.C794420VEi;
import X.C838410Wul;
import X.C844470XAv;
import X.InterfaceC1478005qU;
import X.InterfaceC19515111Wr;
import X.InterfaceC19772112Xn;
import Y.AfS145S0000000_31;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.LiveParams;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes32.dex */
public class Live {
    public static Set<C145E> liveSDKInitedListenerSet;
    public static volatile boolean sInitedLiveSDK;

    public static String getKYCDomain() {
        return "webcast.tiktokv.com";
    }

    public static boolean invalid() {
        return false;
    }

    public static boolean isInitedLiveSDK() {
        return true;
    }

    public static C1AKK getLiteService() {
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            C1AK3 c1ak3LIZ = C20338414i6.LIZ();
            if (c1ak3LIZ == null) {
                C20441214yg.LJ("Live", "Live getLiteService is null");
                HashMap map = new HashMap(2);
                map.put("error_msg", Log.getStackTraceString(new Throwable("")));
                C476240Ily.LIZ.LIZ(1, "ttlive_live_get_lite_service_null_error", map);
            }
            return c1ak3LIZ;
        }
        C20441214yg.LJ("Live", "cannot use LiveService in non-main process");
        if (C0B40.LIZ < 0.0d) {
            C0B40.LIZ = ThreadLocalRandom.current().nextDouble();
        }
        if (C0B40.LIZ >= ((Number) C0B40.LIZIZ.getValue()).doubleValue()) {
            return null;
        }
        HashMap map2 = new HashMap(2);
        map2.put("error_msg", Log.getStackTraceString(new Throwable("")));
        map2.put("cur_process_name", C2162308dZ.LIZ(C844470XAv.LIZ()));
        C476240Ily.LIZ.LIZ(1, "ttlive_init_non_main_process_error", map2);
        return null;
    }

    public static String getLiveWebSocketDomain() {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isBoe() ? C19273110af.LIZ().getLiveBoeWsDomain() : "webcast-ws.tiktokv.com";
    }

    public static void initDesignManager() {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI == null) {
            C0URJ c0urj = new C0URJ();
            if (c1119850fFP.LJJI == null) {
                c1119850fFP.LJJI = c0urj;
            }
        }
    }

    public static void refreshLoginState() {
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.15Lf
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ c09aj) {
                Live.lambda$refreshLoginState$0(c09aj);
            }
        }).LJL(C11S5.LJ).LJJLL(new AfS145S0000000_31(2), new AfS145S0000000_31(3));
    }

    public static void switchLocale() {
        C1AKK service;
        I18nServiceApi i18nServiceApi;
        Locale localeLJIJJLI;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null || (service = getService()) == null || (i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class)) == null || i18nServiceApi.LIZ() == null || (localeLJIJJLI = i18nServiceApi.LIZ().LJIJJLI(contextLIZ)) == null || TextUtils.isEmpty(C786410Ut5.t2(localeLJIJJLI))) {
            return;
        }
        service.onLocaleChanged(localeLJIJJLI);
    }

    public static void syncShareCookieToTarget() {
        try {
            C0W7U.LIZ(C786410Ut5.j4("https://%s/", new Object[]{getLiveDomain()}));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String getLiveDomain() {
        return C2222691Bz1.LJIIIIZZ() ? "webcast.tiktokv.com" : "webcast-va.tiktokv.com";
    }

    public static C1AKK getService() {
        boolean zLJI = MethodIDManager.LJI(196636);
        C1AKK service = getService(false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return service;
    }

    public static boolean hasTTLiveSDKInitFinish() {
        return C20338414i6.LIZ;
    }

    public static C1AKK getService(boolean z) {
        boolean zLJI = MethodIDManager.LJI(196636);
        sInitedLiveSDK = true;
        C1AK3 c1ak3LIZ = C20338414i6.LIZ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1ak3LIZ;
    }

    public static boolean hasFollowed(User user) {
        if (user != null) {
            if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isPrivateAccount(User user) {
        if (user != null && user.isSecret()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$refreshLoginState$0(C09AJ c09aj) {
        C1C7U.LIZ("Live@cdd9.refreshLoginState$1L");
        syncShareCookieToTarget();
        C1C7U.LIZIZ("Live@cdd9.refreshLoginState$1L");
    }

    public static /* synthetic */ void lambda$refreshLoginState$1(Object obj) {
        C1C7U.LIZ("Live@cdd9.refreshLoginState$2L");
        C1C7U.LIZIZ("Live@cdd9.refreshLoginState$2L");
    }

    public static /* synthetic */ void lambda$refreshLoginState$2(Throwable th) {
        C1C7U.LIZ("Live@cdd9.refreshLoginState$3L");
        C1C7U.LIZIZ("Live@cdd9.refreshLoginState$3L");
    }

    public static boolean openLiveRecordBySchema(final String str) {
        final Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return false;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (C10EU.LJIIIIZZ()) {
            C794420VEi.LIZIZ("ttlive_minor_mode_live", "", null);
        }
        if (activityLJFF instanceof C19EG) {
            C19741112Lp.LIZ.getClass();
            if (C19741112Lp.LIZLLL(activityLJFF, "android.permission.CAMERA") && C19741112Lp.LIZLLL(activityLJFF, "android.permission.RECORD_AUDIO")) {
                jumpToLive(activityLJFF, str);
                return true;
            }
            C19514711Wn.LIZLLL(activityLJFF, TokenCert.with("bpea-live_jump_to_broadcast")).LIZIZ("android.permission.CAMERA", "android.permission.RECORD_AUDIO").LIZJ(new InterfaceC19515111Wr() { // from class: X.15Ld
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                @Override // X.InterfaceC19515111Wr
                public final void LIZ(C0HWO... c0hwoArr) {
                    for (C0HWO c0hwo : c0hwoArr) {
                        if (!c0hwo.LIZ()) {
                            return;
                        }
                    }
                    Live.jumpToLive(activityLJFF, str);
                }
            });
            return true;
        }
        if (C14W2.LIZ(activityLJFF) == 0 && C838410Wul.LIZ(activityLJFF, "android.permission.RECORD_AUDIO") == 0) {
            jumpToLive(activityLJFF, str);
        } else {
            C19771812Xk.LIZJ(activityLJFF, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new InterfaceC19772112Xn() { // from class: X.15Le
                @Override // X.InterfaceC19772112Xn
                public final void LIZ(int[] iArr, String[] strArr) {
                    for (int i : iArr) {
                        if (i != 0) {
                            return;
                        }
                    }
                    Live.jumpToLive(activityLJFF, str);
                }
            });
        }
        C1AF0.LJFF(new Throwable(), "openLiveRecordBySchema");
        return true;
    }

    public static boolean showLive(User user) {
        if (user != null && user.isLive() && C1492170ovv.LIZ()) {
            if (isPrivateAccount(user)) {
                return hasFollowed(user);
            }
            return true;
        }
        return false;
    }

    public static void jumpToLive(Activity activity, String str) {
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("direct_shoot");
        builder.translationType(3);
        builder.defaultTab(2);
        builder.enterFrom(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "enter_from"));
        builder.liveParams(new LiveParams(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "source_params"), Boolean.FALSE));
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("Live", new C1401820maC(activity, builder, 0));
    }
}
