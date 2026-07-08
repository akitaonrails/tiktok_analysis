package com.ss.android.ugc.aweme;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.AbstractDialogInterfaceC1397690mTX;
import X.C01GW;
import X.C054G;
import X.C0PEM;
import X.C0TIJ;
import X.C0TIK;
import X.C0TIL;
import X.C0XQ7;
import X.C1072350e0n;
import X.C1073210e2B;
import X.C1217120hmI;
import X.C1388190mED;
import X.C1389930mH1;
import X.C1390180mHQ;
import X.C1390190mHR;
import X.C1390210mHT;
import X.C1390220mHU;
import X.C1390230mHV;
import X.C1390240mHW;
import X.C1390260mHY;
import X.C1390330mHf;
import X.C1390540mI0;
import X.C1390550mI1;
import X.C1390590mI5;
import X.C1390620mI8;
import X.C1390630mI9;
import X.C1390640mIA;
import X.C1390650mIB;
import X.C1390660mIC;
import X.C1390700mIG;
import X.C1391850mK7;
import X.C13LP;
import X.C1514430pVp;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C1976907ol;
import X.C2105908Mv;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C258410AAt;
import X.C340801Ty;
import X.C452501pT;
import X.C805380Via;
import X.EnumC1073320e2M;
import X.EnumC1390310mHd;
import X.EnumC1390600mI6;
import X.InterfaceC1264610j0t;
import X.InterfaceC1294060jmO;
import X.InterfaceC1589330rSd;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.data.PopupMonitorConfig;
import com.ss.android.ugc.aweme.data.SocialAuthPopupControlAB;
import com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB;
import com.ss.android.ugc.aweme.experiment.Rules;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PopupMonitorServiceImpl implements InterfaceC1589330rSd {
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static final PopupMonitorServiceImpl LIZ = new PopupMonitorServiceImpl();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final Keva LIZJ = Keva.getRepo("popup_control_repo");
    public static EnumC1390600mI6 LJI = EnumC1390600mI6.LL;
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C1390640mIA());
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public static final List<String> LJIIJJI = C1697810uHb.LJIIJJI("compliance_appeal_popup", "disturbing_sticker_warning_popup", "stem_feed_desc_pop", "search_swipe_guide_masklayer", "camera_widget_guide", "swipe_up_guide_mask", "global_personalized_ad", "share_after_post_popup", "inbox_activity_status_init_pop", "publish_page", "google_one_tap_popup_refector");
    public static final C01GW LJIIL = C452501pT.LIZIZ(new C0TIK());
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(new C0TIL());
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(new C0TIJ());
    public static final List<String> LJIILL = C1697810uHb.LJIILJJIL("keybord_filter");

    @Override // X.InterfaceC1589330rSd
    public final void resume() {
        LJII = true;
        if (LJJIL()) {
            C1390650mIB.LIZ.getClass();
        }
    }

    public static boolean LJJIL() {
        return LJI == EnumC1390600mI6.LLILLJJLI;
    }

    public static void LJJJJJ() {
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--monitor stop(), inActivePeriod: ");
        sbLIZ.append(C1390550mI1.LIZ());
        sbLIZ.append(", isInFirst ");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(" VV: ");
        sbLIZ.append(C1390550mI1.LIZIZ(LIZLLL));
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        C1391850mK7.LJI = null;
        LJI = EnumC1390600mI6.LLILLL;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LIZ() {
        LJFF++;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LIZLLL() {
        C1217120hmI.LIZ.getClass();
        C1217120hmI.LJI++;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJ() {
        C1217120hmI.LIZ.getClass();
        Keva keva = C1217120hmI.LIZIZ;
        if (keva.getLong(C1217120hmI.LIZ("first_cold_start_time"), 0L) == 0) {
            keva.storeLong(C1217120hmI.LIZ("first_cold_start_time"), System.currentTimeMillis());
        }
        if (LJIIJ.compareAndSet(false, true)) {
            keva.storeInt(C1217120hmI.LIZ("total_cold_start_count"), keva.getInt(C1217120hmI.LIZ("total_cold_start_count"), 0) + 1);
        }
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJI() {
        C1217120hmI.LIZ.getClass();
        C1217120hmI.LJ.storeBoolean(C0XQ7.LJFF().getCurUserId(), true);
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJII() {
        C1217120hmI c1217120hmI = C1217120hmI.LIZ;
        boolean z = LJII;
        c1217120hmI.getClass();
        C01GW c01gw = SocialAuthPopupControlAB.LIZIZ;
        if (((SocialAuthPopupControlAB.SocialAuthControlConfig) c01gw.getValue()).group != 1 || !z || C1217120hmI.LJI < ((SocialAuthPopupControlAB.SocialAuthControlConfig) c01gw.getValue()).delay_vv || !C1217120hmI.LIZIZ()) {
            return false;
        }
        C1217120hmI.LJFF.put(C1217120hmI.LIZ("has_block_onboarding_auth_popup"), Boolean.FALSE);
        return true;
    }

    @Override // X.InterfaceC1589330rSd
    public final long LJIIIIZZ() {
        return LIZJ.getLong(LJJIJIL("keva_first_block_time"), 0L);
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJIIJ() {
        C23250099c.LIZLLL(LIZIZ, null, null, new C340801Ty(new Runnable() { // from class: X.0mI4
            public static void LIZ() {
                C1390590mI5 c1390590mI5 = (C1390590mI5) C13LP.LJJJLIIL(PopupManager.LJIIIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recordLastSessionPopupInAppBackground: ");
                sbLIZ.append(c1390590mI5);
                sbLIZ.append(" hash=");
                sbLIZ.append(c1390590mI5 != null ? c1390590mI5.hashCode() : 0);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c1390590mI5 == null || c1390590mI5.LIZLLL != -1) {
                    return;
                }
                PopupMonitorServiceImpl.LIZ.getClass();
                c1390590mI5.LJI = ((IScreenshotService) PopupMonitorServiceImpl.LJIIIZ.getValue()).LJIIIIZZ().get("group_id");
                c1390590mI5.LIZLLL = System.currentTimeMillis();
                PopupMonitorServiceImpl.LIZJ.storeString("last_session_record_data", GsonProtectorUtils.toJson(new Gson(), c1390590mI5));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PopupMonitorServiceImpl@8747.recordLastSessionPopupInAppBackground$task$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.recordLastSessionPopupInAppBackground$task$1");
            }
        }, null), 3);
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJIIJJI() {
        return LIZJ.getBoolean(LJJIJIL("onboarding_in_no_user_swipe_guide"), false);
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJIIL() {
        return ((SocialAuthPopupControlAB.SocialAuthControlConfig) SocialAuthPopupControlAB.LIZIZ.getValue()).group == 2;
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJIILIIL() {
        return ((SocialAuthPopupControlAB.SocialAuthControlConfig) SocialAuthPopupControlAB.LIZIZ.getValue()).group != 0;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJIILJJIL() {
        C1217120hmI.LIZ.getClass();
        String curUserId = C0XQ7.LJFF().getCurUserId();
        Keva keva = C1217120hmI.LIZLLL;
        keva.storeInt(curUserId, keva.getInt(curUserId, 0) + 1);
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJIILL() {
        C1217120hmI.LIZ.getClass();
        C01GW c01gw = SocialAuthPopupControlAB.LIZIZ;
        if (((SocialAuthPopupControlAB.SocialAuthControlConfig) c01gw.getValue()).group == 0) {
            return false;
        }
        if (((SocialAuthPopupControlAB.SocialAuthControlConfig) c01gw.getValue()).group == 1) {
            C1217120hmI.LJFF.put(C1217120hmI.LIZ("has_block_onboarding_auth_popup"), Boolean.TRUE);
        }
        return true;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJIIZILJ() {
        C1390650mIB.LIZ.getClass();
        if (LJI != EnumC1390600mI6.LL) {
            return;
        }
        C23250099c.LIZLLL(LIZIZ, null, null, new C1390540mI0(null), 3);
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJIJ() {
        C1217120hmI.LIZ.getClass();
        return C1217120hmI.LJ.getBoolean(C0XQ7.LJFF().getCurUserId(), false);
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJIJJ() {
        Keva keva = LIZJ;
        String string = keva.getString("last_session_record_data", "");
        if (string.length() > 0) {
            C1390590mI5 c1390590mI5 = (C1390590mI5) GsonProtectorUtils.fromJson(new Gson(), string, C1390590mI5.class);
            if (!c1390590mI5.LJ && !C2105908Mv.LIZ(c1390590mI5.LIZ)) {
                long j = c1390590mI5.LIZLLL - c1390590mI5.LIZJ;
                if (j > 0) {
                    C1390650mIB c1390650mIB = C1390650mIB.LIZ;
                    String str = c1390590mI5.LIZ;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = c1390590mI5.LIZIZ;
                    String str3 = str2 != null ? str2 : "";
                    String str4 = c1390590mI5.LJFF;
                    if (str4 == null) {
                        str4 = "other";
                    }
                    c1390650mIB.getClass();
                    C1390650mIB.LIZLLL(j, str, str3, str4);
                }
            }
            keva.erase("last_session_record_data");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // X.InterfaceC1589330rSd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI() {
        /*
            r7 = this;
            X.0hmI r0 = X.C1217120hmI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB$NewUserAuthDelayExpConfig r0 = com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB.LIZ()
            boolean r0 = r0.enabled
            r6 = 0
            if (r0 == 0) goto L33
            boolean r0 = com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB.LIZIZ()
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            com.bytedance.keva.Keva r0 = X.C1217120hmI.LIZLLL
            int r1 = r0.getInt(r1, r6)
            com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB$NewUserAuthDelayExpConfig r0 = com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB.LIZ()
            int r0 = r0.delay_vv
            if (r1 < r0) goto L34
        L2c:
            boolean r0 = r7.LJIJ()
            if (r0 != 0) goto L33
            r6 = 1
        L33:
            return r6
        L34:
            com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB$NewUserAuthDelayExpConfig r0 = com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB.LIZ()
            int r0 = r0.delay_cold_start
            if (r0 == 0) goto L51
            com.bytedance.keva.Keva r1 = X.C1217120hmI.LIZIZ
            java.lang.String r0 = "total_cold_start_count"
            java.lang.String r0 = X.C1217120hmI.LIZ(r0)
            int r1 = r1.getInt(r0, r6)
            com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB$NewUserAuthDelayExpConfig r0 = com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB.LIZ()
            int r0 = r0.delay_cold_start
            if (r1 <= r0) goto L51
            goto L2c
        L51:
            com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB$NewUserAuthDelayExpConfig r0 = com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB.LIZ()
            int r0 = r0.delay_day
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB$NewUserAuthDelayExpConfig r0 = com.ss.android.ugc.aweme.data.SocialAuthPopupNewUserOptimizeAB.LIZ()
            int r5 = r0.delay_day
            com.bytedance.keva.Keva r3 = X.C1217120hmI.LIZIZ
            java.lang.String r0 = "first_cold_start_time"
            java.lang.String r2 = X.C1217120hmI.LIZ(r0)
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 / r0
            long r1 = (long) r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LJIJJLI():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r6.LIZLLL) < (r5 * com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig.DEFAULT)) goto L13;
     */
    @Override // X.InterfaceC1589330rSd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.String> LJIL() {
        /*
            r9 = this;
            java.util.concurrent.ConcurrentLinkedDeque<X.0mI5> r0 = com.bytedance.poplayer.core.PopupManager.LJIIIZ
            java.lang.Object r6 = X.C13LP.LJJJLIIL(r0)
            X.0mI5 r6 = (X.C1390590mI5) r6
            r7 = -1
            if (r6 == 0) goto L7d
            long r1 = r6.LIZLLL
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L38
            java.util.List<java.lang.String> r1 = com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LJIIJJI
            java.lang.String r0 = r6.LIZ
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.data.UGPopupRefactorExpData r0 = X.C1390630mI9.LIZ()
            int r5 = r0.limitTime
        L22:
            long r3 = r6.LIZLLL
            long r1 = r6.LIZJ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L7d
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r6.LIZLLL
            long r3 = r3 - r0
            int r0 = r5 * 1000
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7d
        L38:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r2 = ""
            if (r6 == 0) goto L45
            java.lang.String r1 = r6.LIZ
            if (r1 != 0) goto L46
        L45:
            r1 = r2
        L46:
            java.lang.String r0 = "popup_element_label"
            r4.put(r0, r1)
            if (r6 == 0) goto L52
            java.lang.String r0 = r6.LIZIZ
            if (r0 == 0) goto L52
            r2 = r0
        L52:
            java.lang.String r0 = "trigger_id"
            r4.put(r0, r2)
            com.ss.android.ugc.aweme.PopupMonitorServiceImpl r0 = com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LIZ
            r0.getClass()
            if (r6 != 0) goto L6a
            r2 = 0
        L60:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "popup_duration"
            r4.put(r0, r1)
            return r4
        L6a:
            long r2 = r6.LIZLLL
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L78
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.LIZJ
        L76:
            long r2 = r2 - r0
            goto L60
        L78:
            long r0 = r6.LIZJ
            goto L76
        L7b:
            r5 = 2
            goto L22
        L7d:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LJIL():java.util.HashMap");
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJJIFFI() {
        C1217120hmI.LIZ.getClass();
        C1217120hmI.LJI = 0;
        C1217120hmI.LJII.clear();
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJJII() {
        C1217120hmI c1217120hmI = C1217120hmI.LIZ;
        boolean z = LJII;
        c1217120hmI.getClass();
        if (((SocialAuthPopupControlAB.SocialAuthControlConfig) SocialAuthPopupControlAB.LIZIZ.getValue()).group == 1 && z) {
            if (C1217120hmI.LIZIZ()) {
                C1217120hmI.LJII.clear();
            } else {
                Iterator<Integer> it2 = C1217120hmI.LJII.iterator();
                while (it2.hasNext()) {
                    int iIntValue = it2.next().intValue();
                    if (C1217120hmI.LJI >= ((SocialAuthPopupControlAB.SocialAuthControlConfig) SocialAuthPopupControlAB.LIZIZ.getValue()).delay_vv + iIntValue) {
                        C1217120hmI.LJII.remove(Integer.valueOf(iIntValue));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJJIII() {
        LIZJ.storeBoolean(LJJIJIL("onboarding_in_no_user_swipe_guide"), true);
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJJIIJ() {
        C1217120hmI.LIZ.getClass();
        C01GW c01gw = SocialAuthPopupControlAB.LIZIZ;
        if (((SocialAuthPopupControlAB.SocialAuthControlConfig) c01gw.getValue()).group == 0) {
            return false;
        }
        if (((SocialAuthPopupControlAB.SocialAuthControlConfig) c01gw.getValue()).group == 2) {
            Keva keva = C1217120hmI.LIZJ;
            if (keva.getLong(C1217120hmI.LIZ("keva_first_block_time"), 0L) == 0) {
                keva.storeLong(C1217120hmI.LIZ("keva_first_block_time"), System.currentTimeMillis());
            }
        }
        InterfaceC1264610j0t interfaceC1264610j0tLIZJ = C1072350e0n.LIZJ(EnumC1073320e2M.FYP, AFwS259S0000000_21.get$arr$(148));
        if (interfaceC1264610j0tLIZJ == null || !((C1073210e2B) interfaceC1264610j0tLIZJ).check()) {
            return false;
        }
        if (((SocialAuthPopupControlAB.SocialAuthControlConfig) c01gw.getValue()).group == 1 && !C1217120hmI.LIZIZ()) {
            ArrayList<Integer> arrayList = C1217120hmI.LJII;
            if (!arrayList.contains(Integer.valueOf(C1217120hmI.LJI))) {
                arrayList.add(Integer.valueOf(C1217120hmI.LJI));
            }
        }
        return true;
    }

    @Override // X.InterfaceC1589330rSd
    public final List<Rules> LJJIJ() {
        return ((SocialAuthPopupControlAB.SocialAuthControlConfig) SocialAuthPopupControlAB.LIZIZ.getValue()).exp_rules;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJJIJIIJIL() {
        LJIIJ.set(false);
    }

    public static C1390660mIC LJJIJL() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
        int i = LJ;
        int i2 = LIZLLL;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        String simpleName = (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) ? "unknown" : activityLIZ.getClass().getSimpleName();
        PopupMonitorConfig popupMonitorConfig = C1390550mI1.LIZ;
        return new C1390660mIC(zIsLogin ? 1 : 0, i2, i, (int) (((System.currentTimeMillis() - C1514430pVp.LIZ()) / ((long) 86400000)) + 1), LJII ? 1 : 0, C1390550mI1.LIZIZ(LIZLLL) ? 1 : 0, simpleName, C1390550mI1.LIZ() ? 1 : 0);
    }

    public static boolean LJJJJI() {
        if (!LJJIL()) {
            return false;
        }
        PopupMonitorConfig popupMonitorConfig = C1390550mI1.LIZ;
        int i = LIZLLL;
        if (C1390550mI1.LIZLLL(false) || !C1390550mI1.LIZIZ(i)) {
            return false;
        }
        if (!LJII && !LJIIIIZZ) {
            return false;
        }
        LJIIIIZZ = false;
        return true;
    }

    public static boolean LJJJJIZL() {
        if (!LJJIL()) {
            return false;
        }
        if (!C1390550mI1.LIZLLL(false)) {
            return true;
        }
        LJJJJJ();
        C1390650mIB.LIZ.getClass();
        C1390650mIB.LIZJ();
        return false;
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LIZJ() {
        return SocialAuthPopupNewUserOptimizeAB.LIZ().enabled;
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJJIJIIJI() {
        return SocialAuthPopupNewUserOptimizeAB.LIZIZ();
    }

    @Override // X.InterfaceC1589330rSd
    public final int LJJIIZI() {
        return LJFF;
    }

    public static String LJJIJIL(String str) {
        String curSecUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ().isLogin()) {
            curSecUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId();
        } else {
            curSecUserId = "";
        }
        sbLIZ.append(curSecUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[PHI: r5
      0x001b: PHI (r5v4 ??) = (r5v7 ??), (r5v8 ??) binds: [B:10:0x0019, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.0MBf] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static java.lang.String LJJIJLIJ(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.PopupMonitorServiceImpl.LJJIJLIJ(android.content.Context):java.lang.String");
    }

    public static void LJJIZ(Fragment fragment) {
        if (!LJJJJIZL()) {
            return;
        }
        C01GW c01gw = LJIILJJIL;
        if (((Map) c01gw.getValue()).containsKey(Integer.valueOf(fragment.hashCode()))) {
            ((Map) c01gw.getValue()).remove(Integer.valueOf(fragment.hashCode()));
            return;
        }
        if (C13LP.LJJJJ(((LinkedHashMap) C1391850mK7.LJFF).get(Integer.valueOf(fragment.hashCode())), LJIILL)) {
            return;
        }
        C1390660mIC c1390660mICLJJIJL = LJJIJL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dialogFragment-");
        sbLIZ.append(fragment);
        C1389930mH1 c1389930mH1 = new C1389930mH1(C2188811AlT.LIZIZ(sbLIZ), "dialog_fragment");
        if (!(fragment instanceof BaseSheet)) {
            ((Map) c01gw.getValue()).put(Integer.valueOf(fragment.hashCode()), 1);
        }
        C23250099c.LIZLLL(LIZIZ, null, null, new C1390220mHU(fragment, c1389930mH1, c1390660mICLJJIJL, null), 3);
    }

    public static void LJJJ(Dialog dialog) {
        if (!LJJJJIZL()) {
            return;
        }
        C1390660mIC c1390660mICLJJIJL = LJJIJL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dialog-");
        sbLIZ.append(dialog);
        C23250099c.LIZLLL(LIZIZ, null, null, new C1390260mHY(dialog, c1390660mICLJJIJL, new C1389930mH1(C2188811AlT.LIZIZ(sbLIZ), "dialog"), null), 3);
    }

    public static void LJJJI(PopupWindow popupWindow) {
        if (!LJJJJIZL()) {
            return;
        }
        C1390660mIC c1390660mICLJJIJL = LJJIJL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupWindow-");
        sbLIZ.append(popupWindow);
        C23250099c.LIZLLL(LIZIZ, null, null, new C1390210mHT(popupWindow, new C1389930mH1(C2188811AlT.LIZIZ(sbLIZ), "popup_window"), c1390660mICLJJIJL, null), 3);
    }

    public static void LJJJIL(AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX) {
        if (!LJJJJIZL()) {
            return;
        }
        C1390660mIC c1390660mICLJJIJL = LJJIJL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxDialog-");
        sbLIZ.append(abstractDialogInterfaceC1397690mTX);
        C23250099c.LIZLLL(LIZIZ, null, null, new C1390190mHR(abstractDialogInterfaceC1397690mTX, new C1389930mH1(C2188811AlT.LIZIZ(sbLIZ), "tux_dialog"), c1390660mICLJJIJL, null), 3);
    }

    public static void LJJJJ(Object obj) {
        if (!LJJJJIZL()) {
            return;
        }
        C1390650mIB.LIZ.getClass();
        ((Map) LJIIL.getValue()).put(Integer.valueOf(obj.hashCode()), 1);
    }

    @Override // X.InterfaceC1589330rSd
    public final void LIZIZ(View view) {
        if (LJJIL() && LJJJJIZL()) {
            C1390660mIC c1390660mICLJJIJL = LJJIJL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MaskLayer-");
            sbLIZ.append(view);
            C23250099c.LIZLLL(LIZIZ, null, null, new C1390180mHQ(view, new C1389930mH1(C2188811AlT.LIZIZ(sbLIZ), "mask_layer"), c1390660mICLJJIJL, null), 3);
        }
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJFF(String str) {
        if (!LJJIL()) {
            return;
        }
        C1390660mIC c1390660mICLJJIJL = LJJIJL();
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        EnumC1390310mHd enumC1390310mHd = EnumC1390310mHd.POPUP;
        c1390650mIB.getClass();
        C1390650mIB.LJFF(str, enumC1390310mHd, c1390660mICLJJIJL, "", 1, "");
    }

    @Override // X.InterfaceC1589330rSd
    public final String LJIIIZ(Context context) {
        boolean z;
        try {
            if (((Boolean) C258410AAt.LIZ.getValue()).booleanValue()) {
                String strLJJIJLIJ = LJJIJLIJ(context);
                if (Intrinsics.LJFF(strLJJIJLIJ, "other") && (strLJJIJLIJ = ((IScreenshotService) LJIIIZ.getValue()).LJIIIIZZ().get("enter_from")) == null) {
                    strLJJIJLIJ = "other";
                }
                if (strLJJIJLIJ.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return "other";
                }
                return strLJJIJLIJ;
            }
            String str = ((IScreenshotService) LJIIIZ.getValue()).LJIIIIZZ().get("enter_from");
            if (str == null) {
                str = "other";
            }
            if (Intrinsics.LJFF(str, "other")) {
                return LJJIJLIJ(context);
            }
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C805380Via.LIZJ(e, "popup_get_enter_from");
            return "other";
        }
    }

    @Override // X.InterfaceC1589330rSd
    public final boolean LJJ(String str) {
        if (LJIIJJI.contains(str)) {
            if (C1390630mI9.LIZ().exp != 1 || C1390630mI9.LIZ().popupId.contains(str)) {
                return false;
            }
            return true;
        }
        str.length();
        return true;
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJJIIZ(int i) {
        if (!LJJIL()) {
            return;
        }
        if (i == 0) {
            LIZLLL++;
        }
        LJ++;
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--onVideoChange(), fyp vv:");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(", total vv:");
        sbLIZ.append(LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        if (C1390550mI1.LIZLLL(false)) {
            LJJJJJ();
            c1390650mIB.getClass();
            C1390650mIB.LIZJ();
        }
    }

    @Override // X.InterfaceC1589330rSd
    public final void pause(boolean z) {
        LJII = false;
        if (!LJJIL()) {
            return;
        }
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--pause(), needExtraChecking: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        if (z) {
            LJIIIIZZ = true;
        }
    }

    public static final class PopupMonitorSmartRouterInterceptor implements IInterceptor {
        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            return true;
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
            return C1976907ol.LIZ(this, routeIntent);
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            PopupMonitorServiceImpl.LIZ.getClass();
            C23250099c.LIZLLL(PopupMonitorServiceImpl.LIZIZ, null, null, new C1390330mHf(routeIntent, PopupMonitorServiceImpl.LJJIJL(), null), 3);
            return false;
        }
    }

    public static void LJJJJJL(Object obj, C1390660mIC c1390660mIC) {
        String str = (String) ((LinkedHashMap) C1391850mK7.LJFF).get(Integer.valueOf(obj.hashCode()));
        if (str == null) {
            C1390650mIB c1390650mIB = C1390650mIB.LIZ;
            c1390650mIB.getClass();
            EnumC1390310mHd enumC1390310mHd = EnumC1390310mHd.POPUP;
            c1390650mIB.getClass();
            C1390650mIB.LJFF("unknown", enumC1390310mHd, c1390660mIC, "", 1, "");
            return;
        }
        C1390650mIB c1390650mIB2 = C1390650mIB.LIZ;
        EnumC1390310mHd enumC1390310mHd2 = EnumC1390310mHd.POPUP;
        c1390650mIB2.getClass();
        C1390650mIB.LJFF(str, enumC1390310mHd2, c1390660mIC, "", 1, "");
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJJI(C1390700mIG c1390700mIG, Context context) {
        C23250099c.LIZLLL(LIZIZ, null, null, new C1390620mI8(c1390700mIG, context, null), 3);
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJIILLIIL(long j, String str, String str2) {
        long j2;
        C1390590mI5 next;
        String str3;
        if (LJIIJJI.contains(str)) {
            j2 = C1390630mI9.LIZ().reportDelayTime;
        } else {
            j2 = 1000;
        }
        if (j >= j2) {
            Iterator<C1390590mI5> it2 = PopupManager.LJIIIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C1390590mI5 c1390590mI5 = next;
                    if (Intrinsics.LJFF(c1390590mI5.LIZ, str) && Intrinsics.LJFF(c1390590mI5.LIZIZ, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1390590mI5 c1390590mI52 = next;
            if (c1390590mI52 == null || (str3 = c1390590mI52.LJFF) == null) {
                str3 = "";
            }
            C1390650mIB.LIZ.getClass();
            C1390650mIB.LIZLLL(j, str, str2, str3);
            if (c1390590mI52 != null) {
                c1390590mI52.LIZLLL = System.currentTimeMillis();
            }
        }
    }

    @Override // X.InterfaceC1589330rSd
    @InterfaceC1294060jmO
    public final void LJIJI(String str, String str2, boolean z) {
        if (LJJJJIZL() && C1390550mI1.LIZ.isClickEnabled) {
            C1390660mIC c1390660mICLJJIJL = LJJIJL();
            C23250099c.LIZLLL(LIZIZ, null, null, new C1390230mHV(str, z, new C1389930mH1("PopupClick", "popup_click"), str2, c1390660mICLJJIJL, null), 3);
        }
    }

    @Override // X.InterfaceC1589330rSd
    public final void LJJIIJZLJL(String str, String str2, String str3, boolean z) {
        C23250099c.LIZLLL(LIZIZ, null, null, new C1390240mHW(str, z, str3, LJJIJL(), str2, null), 3);
    }
}
