package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel;

import X.AbstractC1387200mCc;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0JBW;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1488140opQ;
import X.C15YW;
import X.C15YX;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C20536115Xj;
import X.C20542115Zr;
import X.C20542215Zs;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C985403tE;
import X.EnumC1745000vVi;
import X.EnumC1879480z0c;
import X.EnumC19367010po;
import X.EnumC20542015Zq;
import X.InterfaceC0148002o;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingMissionStatus;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepStreakStatus;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMMeditationAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class STMMeditationViewModel extends AssemViewModel<C20542215Zs> {
    public static final List<Float> LLJIJIL = C1697810uHb.LJIIJJI(Float.valueOf(0.3f), Float.valueOf(0.25f), Float.valueOf(0.2f), Float.valueOf(0.15f));
    public static final int LLJILJIL = EnumC20542015Zq.BREATHING_INHALE.getValue();
    public static final int LLJILJILJ = EnumC20542015Zq.BREATHING_EXHALE.getValue();
    public static final int LLJILLL = EnumC20542015Zq.INTRO_AFTER_BREATHING.getValue();
    public final SleepHourComponentAbility LL;
    public final int LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public EnumC19367010po LLILZIL;
    public EnumC20542015Zq LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public AnonymousClass0956 LLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C20542215Zs(0);
    }

    public final void vQ2() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        this.LL.S11("meditation_delay_show");
        C15YW.LIZ.getClass();
        C15YW.LJII(3600L);
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LJIIJJI(EnumC1879480z0c.SLEEP_HOUR, EnumC1745000vVi.SKIP_FOR_1HOUR, null, null);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
        c1389890mGx.LIZ(true);
        c1389890mGx.LIZLLL(3000L);
        c1389890mGx.LJIIJ(C0JBW.LIZJ(2131845161, new Object[0]));
        c1389890mGx.LJIIJJI();
    }

    public final void wQ2() {
        if (this.LL.isShowing()) {
            long jQs2 = this.LL.Qs2();
            if (jQs2 <= 0) {
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
            c2344009Gk.LIZLLL(jQs2, "duration");
            C20684815ws.LJIILLIIL("meditation_play_time", c2344009Gk.LIZ);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LIZLLL(jQs2, "duration");
            C20684815ws.LJIILLIIL("sleep_hour_reminder_watch_duration", c2344009Gk2.LIZ);
        }
    }

    public STMMeditationViewModel(SleepHourComponentAbility sleepHourComponentAbility) {
        int i;
        long j;
        this.LL = sleepHourComponentAbility;
        C15YW.LIZ.getClass();
        if (C15YW.LIZIZ()) {
            i = 3;
        } else {
            i = 4;
        }
        this.LLILLJJLI = i;
        if (C15YW.LIZIZ()) {
            j = 1250;
        } else {
            j = 5250;
        }
        this.LLILLL = j;
        this.LLILZ = 3750L;
        this.LLILZIL = EnumC19367010po.RESUME;
        this.LLILZLL = EnumC20542015Zq.INTRO;
        this.LLJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(128));
    }

    public final void xQ2(Context context) {
        SleepStreakStatus sleepStreakStatus;
        if (context == null) {
            return;
        }
        C20536115Xj.LIZ.getClass();
        DigitalWellbeingMissionStatus digitalWellbeingMissionStatusLIZIZ = C20536115Xj.LIZIZ();
        int i = 0;
        if (digitalWellbeingMissionStatusLIZIZ != null && (sleepStreakStatus = digitalWellbeingMissionStatusLIZIZ.sleepStreakStatus) != null && Intrinsics.LJFF(sleepStreakStatus.shouldShowLastCallForStreak, Boolean.TRUE) && this.LLILZLL.getValue() < EnumC20542015Zq.INTRO_AFTER_BREATHING.getValue()) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(C0JBW.LIZJ(2131837341, new Object[0]));
            c1397580mTM.LIZIZ(C0JBW.LIZJ(2131837339, new Object[0]));
            C985403tE.LIZ(c1397580mTM, new AwS610S0100000_31(this, 320));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "sleep_meditation");
            c2344009Gk.LJIIIIZZ("popup_name", "sleepstreak_reminder");
            C20684815ws.LJIILLIIL("PrivacyDWL_popup_show", c2344009Gk.LIZ);
        } else {
            vQ2();
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        C15YX.LIZ.getClass();
        SleepHourSettings sleepHourSettingsLIZJ = C15YX.LIZJ();
        if (sleepHourSettingsLIZJ != null) {
            i = sleepHourSettingsLIZJ.popupShowTimes;
        }
        c2344009Gk2.LIZJ(i, "trigger_time");
        c2344009Gk2.LJIIIIZZ("action", "return_for_now");
        c2344009Gk2.LJIIIIZZ("version", "meditation");
        c2344009Gk2.LJIIIIZZ("reminder_type", "return_for_now");
        C20684815ws.LJIILLIIL("click_feed_sleep_hour_reminder", c2344009Gk2.LIZ);
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        c2344009Gk3.LJIIIIZZ("feed_name", "sleephour");
        c2344009Gk3.LJIIIIZZ("button_name", "return_now");
        C20684815ws.LJIILLIIL("PrivacyDWL_feed_button_click", c2344009Gk3.LIZ);
    }

    public final void yQ2(EnumC19367010po enumC19367010po) {
        C1488140opQ value;
        new AwS575S0100000_31(enumC19367010po, 354);
        this.LLILZIL = enumC19367010po;
        if (C20542115Zr.LIZ[enumC19367010po.ordinal()] == 1 || this.LLIZLLLIL) {
            STMMeditationAssem.LLJZIJLIL.getClass();
            value = STMMeditationAssem.LLLFFI.getValue();
        } else {
            STMMeditationAssem.LLJZIJLIL.getClass();
            value = STMMeditationAssem.LLLFF.getValue();
        }
        setState(new AwS610S0100000_31(value, 149));
    }
}
