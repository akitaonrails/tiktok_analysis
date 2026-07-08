package com.ss.android.ugc.aweme.compliance.protection.antiaddiction;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0PEM;
import X.C0XI4;
import X.C0XQ7;
import X.C118300cf;
import X.C1305970k5b;
import X.C1389890mGx;
import X.C1391420mJQ;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1440005kM;
import X.C14EU;
import X.C1524805y2;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1563520qn0;
import X.C15O7;
import X.C15XT;
import X.C15XU;
import X.C15XV;
import X.C15YD;
import X.C15YE;
import X.C15YW;
import X.C1735430vGH;
import X.C1865300ydk;
import X.C1BNA;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2487409ou;
import X.C297270Bkz;
import X.C306540Bzw;
import X.C340180DVg;
import X.C452501pT;
import X.C484220Iyq;
import X.C486550J6f;
import X.C521630Kcz;
import X.C622680Oba;
import X.C844470XAv;
import X.C985403tE;
import X.C993903ub;
import X.EnumC20537615Xy;
import X.InterfaceC1735440vGI;
import X.InterfaceC19392410tu;
import X.InterfaceC20537915Yb;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.experiments.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.compliance.protection.timelock.RevampPasscodeUtil;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.android.ugc.tiktok.pns.IScreenTimeService;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS92S1000000_7;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class ScreenTimeCalcAndTimer implements C1BNA {
    public static boolean LLJIJIL;
    public C1735430vGH LL;
    public C1735430vGH LLILLJJLI;
    public C1735430vGH LLILLL;
    public C1735430vGH LLILZ;
    public boolean LLILZIL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final Intent LLJI;
    public int LLILZLL = 1;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(116));

    /* JADX INFO: loaded from: classes29.dex */
    public interface AppDiffProtocol {
        public static final C1865300ydk LIZ = C1865300ydk.LIZ;

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer.AppDiffProtocol
            public final void LIZ() {
            }

            @Override // com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer.AppDiffProtocol
            public final void LIZIZ() {
            }
        }

        void LIZ();

        void LIZIZ();
    }

    public final void LIZLLL() {
        AppDiffProtocol.LIZ.getClass();
        C1865300ydk.LIZ().LIZ();
    }

    public ScreenTimeCalcAndTimer() {
        IComplianceDebugService iComplianceDebugService = (IComplianceDebugService) ServiceManager.get().getService(IComplianceDebugService.class);
        if (iComplianceDebugService != null) {
            iComplianceDebugService.LIZJ();
        }
        this.LLJI = null;
        ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIILIIL(new InterfaceC19392410tu() { // from class: X.15XO
            @Override // X.InterfaceC19392410tu
            public final void LIZ() {
            }

            @Override // X.InterfaceC19392410tu
            public final void LIZIZ() {
                if (C306540Bzw.LIZ()) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("enable_screentime_management_sdk_dashboard", false)) {
                        ((IScreenTimeService) ServiceManager.get().getService(IScreenTimeService.class)).LIZLLL();
                    }
                }
            }
        });
    }

    public static C15YD LIZJ() {
        return C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ;
    }

    @Override // X.C1BNA
    public final void LIZ() {
        C622680Oba.LIZJ(this);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            AppDiffProtocol.LIZ.getClass();
            C1865300ydk.LIZ().LIZIZ();
            return;
        }
        C1735430vGH c1735430vGH = this.LLILLL;
        if (c1735430vGH == null || !c1735430vGH.LIZJ()) {
            this.LLILLL = new C1735430vGH(600000L, 600000L, new InterfaceC1735440vGI() { // from class: X.15XP
                @Override // X.InterfaceC1735440vGI
                public final void LJJI(long j) {
                }

                @Override // X.InterfaceC1735440vGI
                public final void onStart() {
                }

                @Override // X.InterfaceC1735440vGI
                public final void LIZLLL() {
                    ScreenTimeCalcAndTimer screenTimeCalcAndTimer = this.LL;
                    screenTimeCalcAndTimer.LLIZLLLIL = true;
                    if (!screenTimeCalcAndTimer.LLIZ) {
                        screenTimeCalcAndTimer.LJ(2);
                        return;
                    }
                    long jLIZ = ((long) C07MU.LIZ()) * 1000;
                    long jLIZ2 = ((long) C07MU.LIZ()) * 1000;
                    final ScreenTimeCalcAndTimer screenTimeCalcAndTimer2 = this.LL;
                    screenTimeCalcAndTimer.LLILZ = new C1735430vGH(jLIZ, jLIZ2, new InterfaceC1735440vGI() { // from class: X.15XQ
                        @Override // X.InterfaceC1735440vGI
                        public final void LJJI(long j) {
                        }

                        @Override // X.InterfaceC1735440vGI
                        public final void LIZLLL() {
                            ScreenTimeCalcAndTimer screenTimeCalcAndTimer3 = screenTimeCalcAndTimer2;
                            screenTimeCalcAndTimer3.LLIZLLLIL = true;
                            screenTimeCalcAndTimer3.LJ(2);
                        }

                        @Override // X.InterfaceC1735440vGI
                        public final void onStart() {
                            Intent intent = screenTimeCalcAndTimer2.LLJI;
                            if (intent != null) {
                                C844470XAv.LIZ.getClass();
                                C786410Ut5.s3(C844470XAv.LIZ(), intent);
                            }
                        }
                    });
                    C1735430vGH c1735430vGH2 = this.LL.LLILZ;
                    if (c1735430vGH2 != null) {
                        c1735430vGH2.LJFF();
                    }
                }
            });
        }
        C1735430vGH c1735430vGH2 = this.LLILLJJLI;
        if (c1735430vGH2 == null || !c1735430vGH2.LIZJ()) {
            LIZLLL();
        }
        LJ(0);
    }

    @Override // X.C1BNA
    public final void LIZIZ() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            AppDiffProtocol.LIZ.getClass();
            C1865300ydk.LIZ().LIZIZ();
            return;
        }
        this.LLIZLLLIL = false;
        C622680Oba.LIZLLL(this);
        Intent intent = this.LLJI;
        if (intent != null) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ().stopService(intent);
        }
        C1735430vGH c1735430vGH = this.LL;
        if (c1735430vGH != null) {
            c1735430vGH.LIZ();
        }
        C1735430vGH c1735430vGH2 = this.LLILZ;
        if (c1735430vGH2 != null) {
            c1735430vGH2.LIZ();
        }
        C1735430vGH c1735430vGH3 = this.LLILLL;
        if (c1735430vGH3 != null) {
            c1735430vGH3.LIZ();
        }
        C1735430vGH c1735430vGH4 = this.LLILLJJLI;
        if (c1735430vGH4 != null) {
            c1735430vGH4.LIZ();
        }
        RevampPasscodeUtil.LIZ.getClass();
        RevampPasscodeUtil.LIZJ = false;
        this.LLILZIL = false;
        this.LLILZLL = 0;
    }

    public final void LJ(int i) {
        String strLIZIZ;
        if (i != 0) {
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            LLJIJIL = false;
                            C1735430vGH c1735430vGH = this.LLILLL;
                            if (c1735430vGH != null) {
                                c1735430vGH.LJFF();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C1735430vGH c1735430vGH2 = this.LL;
                    if (c1735430vGH2 != null) {
                        c1735430vGH2.LIZ();
                    }
                    LLJIJIL = false;
                    return;
                }
                Intent intent = this.LLJI;
                if (intent != null) {
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ().stopService(intent);
                }
                RevampPasscodeUtil.LIZ.getClass();
                if (RevampPasscodeUtil.LIZJ || RevampPasscodeUtil.LIZIZ || LLJIJIL) {
                    return;
                }
                C15YE.LIZ.getClass();
                if (C15YE.LJII() != 0) {
                    C118300cf c118300cf = new C118300cf();
                    EnumC20537615Xy enumC20537615XyLIZIZ = LIZJ().LIZIZ();
                    EnumC20537615Xy enumC20537615Xy = EnumC20537615Xy.CHILD;
                    if (enumC20537615XyLIZIZ == enumC20537615Xy || LIZJ().LIZIZ() == EnumC20537615Xy.UNLINK_LOCKED) {
                        if (LIZJ().LJII() > 0) {
                            i2 = 1;
                        }
                        c118300cf.element = i2;
                    }
                    if ((LIZJ().LIZIZ() == enumC20537615Xy || LIZJ().LIZIZ() == EnumC20537615Xy.UNLINK_LOCKED) && LIZJ().LJII() > 0) {
                        Activity validTopActivity = ActivityStack.getValidTopActivity();
                        if (validTopActivity != null) {
                            C1397580mTM c1397580mTM = new C1397580mTM(validTopActivity);
                            c1397580mTM.LJI(validTopActivity.getString(2131847038));
                            String string = validTopActivity.getString(2131847037, Integer.valueOf(C15YE.LJII()));
                            String string2 = validTopActivity.getString(2131834384);
                            StringBuilder sb = new StringBuilder(string);
                            sb.append("\n\n");
                            sb.append(string2);
                            c1397580mTM.LIZIZ(sb);
                            C985403tE.LIZ(c1397580mTM, new AwS236S0300000_27(validTopActivity, this, c118300cf, 30));
                            C993903ub.LIZ.getClass();
                            C340180DVg.LIZ(c1397580mTM, C993903ub.LIZ(R.drawable.sg, validTopActivity), 0, 6);
                            c1397580mTM.LJII = false;
                            new C1397510mTF(c1397580mTM).LIZLLL();
                            LLJIJIL = true;
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                            c2344009Gk.LIZJ(c118300cf.element, "is_fp_teen");
                            C20684815ws.LJIILLIIL("screen_time_breaks_popup", c2344009Gk.LIZ);
                        }
                    } else {
                        Activity validTopActivity2 = ActivityStack.getValidTopActivity();
                        if (validTopActivity2 != null) {
                            C1397580mTM c1397580mTM2 = new C1397580mTM(validTopActivity2);
                            c1397580mTM2.LJI(validTopActivity2.getString(2131847038));
                            c1397580mTM2.LIZIZ(validTopActivity2.getString(2131847037, Integer.valueOf(C15YE.LJII())));
                            C1391420mJQ c1391420mJQ = new C1391420mJQ(validTopActivity2);
                            c1391420mJQ.LIZJ(true);
                            c1391420mJQ.LIZLLL(validTopActivity2.getString(2131847034));
                            c1391420mJQ.LJ(new AwS378S0200000_12(validTopActivity2, this, 81));
                            c1397580mTM2.LJIIJJI = c1391420mJQ;
                            C985403tE.LIZ(c1397580mTM2, new AwS236S0300000_27(validTopActivity2, this, c118300cf, 31));
                            C993903ub.LIZ.getClass();
                            C340180DVg.LIZ(c1397580mTM2, C993903ub.LIZ(R.drawable.sg, validTopActivity2), 0, 6);
                            new C1397510mTF(c1397580mTM2).LIZLLL();
                            LLJIJIL = true;
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                            c2344009Gk2.LIZJ(c118300cf.element, "is_fp_teen");
                            C20684815ws.LJIILLIIL("screen_time_breaks_popup", c2344009Gk2.LIZ);
                            C2344009Gk c2344009Gk3 = new C2344009Gk();
                            if (this.LLILZIL) {
                                strLIZIZ = "ScreenTimeBreaksSnoozeStrategy";
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("ScreenTimeBreaksShowStrategy_");
                                sbLIZ.append(this.LLILZLL);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            c2344009Gk3.LJIIIIZZ("strategy_key", strLIZIZ);
                            C20684815ws.LJIILLIIL("pnsscreensdk_stb_popup_show", c2344009Gk3.LIZ);
                            if (this.LLILZLL == 1) {
                                this.LLILZLL = 0;
                            }
                        }
                    }
                }
                this.LLIZLLLIL = false;
                LJ(3);
                return;
            }
            C1735430vGH c1735430vGH3 = this.LL;
            if (c1735430vGH3 == null) {
                return;
            }
            c1735430vGH3.LJFF();
            return;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C306540Bzw.LIZ()) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1305970k5b(this, null), 3);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDramaNujPassed(C15XV c15xv) {
        C1735430vGH c1735430vGH = this.LLILLJJLI;
        if (c1735430vGH != null) {
            c1735430vGH.LIZ();
        }
        if (!C0XQ7.LJFF().isLogin()) {
            LIZLLL();
        } else {
            this.LLILLJJLI = null;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String strOptString;
        try {
            if (TextUtils.equals("update_screen_time_breaks", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                String string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "screen_time_breaks");
                String string2 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "session_duration_type");
                String string3 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "session_duration_source");
                ((InterfaceC20537915Yb) this.LLJ.getValue()).LIZLLL(CastIntegerProtector.parseInt(string), CastIntegerProtector.parseInt(string2));
                if (CastIntegerProtector.parseInt(string3) == 1) {
                    C1440005kM.LIZ(new C15XT(CastIntegerProtector.parseInt(string)));
                }
            }
            if (TextUtils.equals("open_screen_time_for_minor", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                C1389890mGx c1389890mGx = new C1389890mGx(validTopActivity);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJ(validTopActivity.getString(2131847031));
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJJI();
            }
            if (TextUtils.equals("show_edited_sleep_time_toast", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                if (C306540Bzw.LIZ()) {
                    return;
                } else {
                    C15O7.LIZIZ(new Callable() { // from class: X.0JF5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("ScreenTimeCalcAndTimer@a85d.onJsBroadCastEvent$1");
                            Activity validTopActivity2 = ActivityStack.getValidTopActivity();
                            C1389890mGx c1389890mGx2 = new C1389890mGx(validTopActivity2);
                            c1389890mGx2.LIZ(true);
                            c1389890mGx2.LJIIJ(validTopActivity2.getString(2131838135));
                            c1389890mGx2.LJFF(R.raw.icon_tick_fill_small);
                            c1389890mGx2.LJII(R.attr.a0i);
                            c1389890mGx2.LJIIJJI();
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("ScreenTimeCalcAndTimer@a85d.onJsBroadCastEvent$1");
                            return unit;
                        }
                    }, C15O7.LJIIIIZZ, null);
                }
            }
            if (TextUtils.equals("show_edited_quiet_time_toast", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                C1524805y2.LIZIZ(0L, AFwS193S0000000_7.get$arr$(109));
                C15YW.LIZ.getClass();
                C15YW.LJI();
            }
            if (TextUtils.equals("screen_time_intro_page_close", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) && ((AccountUserService) C0XQ7.LJFF()).LIZ()) {
                C0XI4 c0xi4 = new C0XI4("aweme://lynxview_popup/?channel=fe_tns_screen_time_homepage&bundle=kids-schedule-breaks-component/template.js&hide_nav_bar=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1&height=400&gravity=bottom&show_mask=1&mask_bg_color=00000080&panel_style=1");
                c0xi4.LIZIZ(((InterfaceC20537915Yb) this.LLJ.getValue()).LJIIIZ(), "screen_time_breaks");
                c0xi4.LIZIZ(((InterfaceC20537915Yb) this.LLJ.getValue()).LJIIIIZZ(), "session_duration_type");
                c0xi4.LIZIZ(0, "is_learn_more_visible");
                c0xi4.LIZIZ(1, "is_from_screen_time_settings");
                new PthreadTimer("ScreenTimeCalcAndTimer").schedule(new C521630Kcz(c0xi4, 0), 500L);
            }
            if (TextUtils.equals("show_stm_toast", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) && (strOptString = JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data").optString("toast_msg")) != null && strOptString.length() != 0) {
                C1524805y2.LIZIZ(0L, new AwS92S1000000_7(strOptString, 0));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginEvent(C486550J6f c486550J6f) {
        C1735430vGH c1735430vGH = this.LL;
        if (c1735430vGH != null) {
            c1735430vGH.LIZ();
        }
        C1735430vGH c1735430vGH2 = this.LLILLL;
        if (c1735430vGH2 != null) {
            c1735430vGH2.LIZ();
        }
        C1735430vGH c1735430vGH3 = this.LLILZ;
        if (c1735430vGH3 != null) {
            c1735430vGH3.LIZ();
        }
        C1735430vGH c1735430vGH4 = this.LLILLJJLI;
        if (c1735430vGH4 != null) {
            c1735430vGH4.LIZ();
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            LIZLLL();
        } else {
            this.LLILLJJLI = null;
        }
        LJ(0);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceivedVideoEvent(C1563520qn0 c1563520qn0) {
        this.LLIZ = c1563520qn0.LIZ;
        C15YW.LIZ.getClass();
        C15YW.LJI();
        C2487409ou.LIZLLL(500L, new Runnable() { // from class: X.15XN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ScreenTimeCalcAndTimer@a85d.onReceivedVideoEvent$1");
                try {
                    ScreenTimeCalcAndTimer screenTimeCalcAndTimer = this.LL;
                    if (screenTimeCalcAndTimer.LLIZLLLIL) {
                        screenTimeCalcAndTimer.LJ(2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ScreenTimeCalcAndTimer@a85d.onReceivedVideoEvent$1");
            }
        });
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onScreenTimeChanged(C15XT c15xt) {
        LJ(0);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShowScreenTimeForMinor(C15XU c15xu) {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return;
        }
        C0XI4 c0xi4 = new C0XI4(DigitalWellbeingEntranceSettings.LIZ("aweme://lynxview_popup/?channel=fe_tns_screen_time_management&bundle=show-minor-screen-time-page/template.js&dynamic=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1&self_adaptive_height=1&transition_animation=bottom&wait_gecko_update=1&block_back_press=1&mask_bg_color=00000080&show_mask=1"));
        c0xi4.LJ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLJFF = c0xi4.LJFF();
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLJFF);
        c1537900q7g.getClass();
        new C1541950qED(activityLJFF, sparkContext).LIZIZ();
    }
}
