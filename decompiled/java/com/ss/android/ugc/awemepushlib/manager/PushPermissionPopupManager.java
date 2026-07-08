package com.ss.android.ugc.awemepushlib.manager;

import X.AbstractC838380Wui;
import X.C01GW;
import X.C09JN;
import X.C0O2O;
import X.C10GR;
import X.C1387310mCn;
import X.C1514430pVp;
import X.C1668306g5;
import X.C1913960zuE;
import X.C19254610Um;
import X.C19514511Wl;
import X.C19514711Wn;
import X.C19514811Wo;
import X.C1BWL;
import X.C1BY5;
import X.C2108208Ns;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C238400w2;
import X.C452501pT;
import X.C688090Qyt;
import X.C751570Tdz;
import X.C786410Ut5;
import X.C814850Vxr;
import X.C815520Vyw;
import X.C818390W8n;
import X.C824390WVp;
import X.C849850XVn;
import X.EnumC612200Nzm;
import X.InterfaceC1914010zuJ;
import X.InterfaceC19515111Wr;
import Y.ARunnableS0S1310000_13;
import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionExtraFreqCtrl4DiggExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupAgainTimingExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupExperienceProtectExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupGuideExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupSceneConfigExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupTimeThresholdExp;
import com.ss.android.ugc.aweme.unifiedauthapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import java.text.SimpleDateFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS0S1360000_13;
import kotlin.jvm.internal.AwS148S1100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class PushPermissionPopupManager implements IPushPermissionApi, C0O2O {
    public final C01GW LL;
    public C818390W8n LLILLJJLI;
    public ARunnableS0S1310000_13 LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    public static boolean LJJ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitLowCvrtScene1stLaunchCtrl(");
        sbLIZ.append(C1514430pVp.LIZLLL());
        sbLIZ.append(", ");
        PushPermissionPopupSceneConfigExp pushPermissionPopupSceneConfigExp = PushPermissionPopupSceneConfigExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupSceneConfigExp.getLowCvrtScene1stLaunchCtrl());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return C1514430pVp.LIZLLL().booleanValue() && pushPermissionPopupSceneConfigExp.getLowCvrtScene1stLaunchCtrl();
    }

    public static boolean LJJI() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitNo2ndBefore1st4Protection(group: ");
        PushPermissionPopupExperienceProtectExp pushPermissionPopupExperienceProtectExp = PushPermissionPopupExperienceProtectExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupExperienceProtectExp.getGroup());
        sbLIZ.append(", 1st launch: ");
        sbLIZ.append(C1514430pVp.LIZLLL());
        sbLIZ.append(", 1st day: ");
        sbLIZ.append(C1387310mCn.LJII(C1514430pVp.LIZ()));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if ((pushPermissionPopupExperienceProtectExp.getGroup() == pushPermissionPopupExperienceProtectExp.getV2() || pushPermissionPopupExperienceProtectExp.getGroup() == pushPermissionPopupExperienceProtectExp.getV3()) && C1514430pVp.LIZLLL().booleanValue()) {
            return true;
        }
        return pushPermissionPopupExperienceProtectExp.getGroup() == pushPermissionPopupExperienceProtectExp.getV4() && C1387310mCn.LJII(C1514430pVp.LIZ());
    }

    public static boolean LJJIFFI() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("noColdBoot4Protection(group: ");
        PushPermissionPopupExperienceProtectExp pushPermissionPopupExperienceProtectExp = PushPermissionPopupExperienceProtectExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupExperienceProtectExp.getGroup());
        sbLIZ.append(", 1st launch: ");
        sbLIZ.append(C1514430pVp.LIZLLL());
        sbLIZ.append(", 1st day: ");
        sbLIZ.append(C1387310mCn.LJII(C1514430pVp.LIZ()));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        int group = pushPermissionPopupExperienceProtectExp.getGroup();
        if (group == pushPermissionPopupExperienceProtectExp.getV2()) {
            return C1514430pVp.LIZLLL().booleanValue();
        }
        if (group == pushPermissionPopupExperienceProtectExp.getV3() || group != pushPermissionPopupExperienceProtectExp.getV4()) {
            return false;
        }
        return C1387310mCn.LJII(C1514430pVp.LIZ());
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDuringNoInAppPromptInterval4Protection(group: ");
        PushPermissionPopupExperienceProtectExp pushPermissionPopupExperienceProtectExp = PushPermissionPopupExperienceProtectExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupExperienceProtectExp.getGroup());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return (pushPermissionPopupExperienceProtectExp.isExperimentGroup() && LJIJI()) || LIZLLL();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LJ() {
        this.LLILZIL++;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("increaseLowCvrtScenePopupCount(");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final int LJIIL() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPushPermissionPopupAgainTiming(group: ");
        PushPermissionPopupAgainTimingExp pushPermissionPopupAgainTimingExp = PushPermissionPopupAgainTimingExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupAgainTimingExp.getGroup());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return pushPermissionPopupAgainTimingExp.getGroup();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final int LJIILLIIL() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPushPermissionPopupFeedVVThreshold(");
        PushPermissionPopupSceneConfigExp pushPermissionPopupSceneConfigExp = PushPermissionPopupSceneConfigExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupSceneConfigExp.getFeedVVThreshold());
        sbLIZ.append(", group: ");
        PushPermissionPopupExperienceProtectExp pushPermissionPopupExperienceProtectExp = PushPermissionPopupExperienceProtectExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupExperienceProtectExp.getGroup());
        sbLIZ.append(", 1st launch: ");
        sbLIZ.append(C1514430pVp.LIZLLL());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (pushPermissionPopupExperienceProtectExp.getGroup() == pushPermissionPopupExperienceProtectExp.getV2()) {
            if (C1514430pVp.LIZLLL().booleanValue()) {
                return 8;
            }
        } else if (pushPermissionPopupExperienceProtectExp.isExperimentGroup() && C1514430pVp.LIZLLL().booleanValue()) {
            return -1;
        }
        return pushPermissionPopupSceneConfigExp.getFeedVVThreshold();
    }

    public final boolean LJJII() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkLowCvrtSceneLimit(");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('/');
        PushPermissionPopupSceneConfigExp pushPermissionPopupSceneConfigExp = PushPermissionPopupSceneConfigExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupSceneConfigExp.getLowCvrtSceneLimit());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return pushPermissionPopupSceneConfigExp.getLowCvrtSceneLimit() < 0 || this.LLILZIL < pushPermissionPopupSceneConfigExp.getLowCvrtSceneLimit();
    }

    public PushPermissionPopupManager() {
        ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber(this);
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.057G
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PushPermissionPopupManager@8bac.<init>$1");
                if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                    int i = C2187451AjH.LIZ;
                    this.LL.LLILZIL = 0;
                } else {
                    int i2 = C2187451AjH.LIZ;
                }
                C1C7U.LIZIZ("PushPermissionPopupManager@8bac.<init>$1");
            }
        });
        this.LL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(169));
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShowPushPermission4Digg(exp: ");
        PushPermissionExtraFreqCtrl4DiggExp pushPermissionExtraFreqCtrl4DiggExp = PushPermissionExtraFreqCtrl4DiggExp.INSTANCE;
        sbLIZ.append(pushPermissionExtraFreqCtrl4DiggExp.addExtraControl());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILZLL <= 0);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return !pushPermissionExtraFreqCtrl4DiggExp.addExtraControl() || this.LLILZLL <= 0;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitDailyFreqControl4Protection(group: ");
        PushPermissionPopupExperienceProtectExp pushPermissionPopupExperienceProtectExp = PushPermissionPopupExperienceProtectExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupExperienceProtectExp.getGroup());
        sbLIZ.append(", ts: ");
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(C1BY5.LIZ().getLong("system_push_permission_1st_nuj_popup_ts", 0L))));
        sbLIZ.append(", hit: ");
        sbLIZ.append(pushPermissionPopupExperienceProtectExp.isExperimentGroup() && C1387310mCn.LJII(C1BY5.LIZ().getLong("system_push_permission_1st_nuj_popup_ts", 0L)));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (pushPermissionPopupExperienceProtectExp.isExperimentGroup()) {
            return C1387310mCn.LJII(C1BY5.LIZ().getLong("system_push_permission_1st_nuj_popup_ts", 0L));
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final int LJI() {
        return C1BY5.LIZIZ();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitLowCvrtSceneControl(hit1stLaunch: ");
        sbLIZ.append(LJJ());
        sbLIZ.append(", hitLimit: ");
        sbLIZ.append(!LJJII());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return LJJ() || !LJJII();
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LJIIJJI() {
        C1BY5.LIZ().erase("nu_push_permission_popup_show_count");
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LJIJI() {
        long j = C1BY5.LIZ().getLong("system_push_permission_2nd_popup_last_ts", 0L);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("-3 hitDailyFreqControl(lastShow: ");
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(j)));
        sbLIZ.append(", hit: ");
        sbLIZ.append(C1387310mCn.LJII(j));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        return C1387310mCn.LJII(j);
    }

    public final boolean LJIL() {
        int iLJIIL = LJIIL();
        PushPermissionPopupAgainTimingExp pushPermissionPopupAgainTimingExp = PushPermissionPopupAgainTimingExp.INSTANCE;
        if (iLJIIL != pushPermissionPopupAgainTimingExp.getDEFAULT() || C1BY5.LIZ().getInt("nu_push_permission_popup_show_count", 0) <= 0) {
            return LJIIL() != pushPermissionPopupAgainTimingExp.getDEFAULT() && C1BY5.LIZIZ() >= 2;
        }
        return true;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LIZJ(long j) {
        if (System.currentTimeMillis() - this.LLILZ <= j) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LJFF(Context context) {
        if (PushPermissionPopupExperienceProtectExp.INSTANCE.inNotShowPopupInNujGroups() || Build.VERSION.SDK_INT < 33 || C1BY5.LIZ().getInt("nu_push_permission_popup_show_count", 0) > 0 || C824390WVp.LIZJ(context)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LJIIIIZZ(Context context) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needShowPushPermissionPopupOnColdBoot(noColdBoot4Protection: ");
        sbLIZ.append(LJJIFFI());
        sbLIZ.append(", hasReachColdBootPushPermissionShowTimes: ");
        sbLIZ.append(LJIL());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJJIFFI() || Build.VERSION.SDK_INT < 33 || LJIL() || C824390WVp.LIZJ(context)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILJJIL(android.content.Context r6) {
        /*
            r5 = this;
            boolean r0 = LJJI()
            r4 = 0
            if (r0 != 0) goto L3f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r3 = 1
            if (r1 < r0) goto L3f
            java.lang.Boolean r0 = X.C1514430pVp.LIZLLL()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
            int r1 = r5.LJIIL()
            com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupAgainTimingExp r2 = com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupAgainTimingExp.INSTANCE
            int r0 = r2.getV1()
            if (r1 == r0) goto L3f
            int r1 = r5.LJIIL()
            int r0 = r2.getV2()
            if (r1 == r0) goto L3f
            int r1 = r5.LJIIL()
            int r0 = r2.getV3()
            if (r1 == r0) goto L3f
        L38:
            boolean r0 = X.C824390WVp.LIZJ(r6)
            if (r0 != 0) goto L3f
            return r3
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager.LJIILJJIL(android.content.Context):boolean");
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final boolean LJIJ(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && ((LJIIL() == 1 || LJIIL() == 2) && !C824390WVp.LIZJ(context))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LJIILL(long j, boolean z) {
        C1BY5.LIZ().storeInt("system_push_permission_popup_show_count", C1BY5.LIZIZ() + 1);
        if (z) {
            C1BY5.LIZ().storeLong("system_push_permission_2nd_popup_last_ts", j);
        } else {
            C1BY5.LIZ().storeLong("system_push_permission_1st_nuj_popup_ts", j);
        }
    }

    public final void LJJIII(Activity activity, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideExp.withGuideAndMask(");
        sbLIZ.append(PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            return;
        }
        activity.runOnUiThread(new ARunnableS82S0200000_13(activity, this, 39));
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LJII(Activity activity, boolean z, C1913960zuE c1913960zuE) {
        Activity validTopActivity = activity;
        int i = C2187451AjH.LIZ;
        if (validTopActivity == null) {
            validTopActivity = ActivityStack.getValidTopActivity();
        }
        if (LJIIIIZZ(validTopActivity)) {
            if (!LJIIIZ() && !LJIJI() && !LIZLLL()) {
                if (C849850XVn.LIZIZ.LIZJ().LJJ("push")) {
                    LJJIIJ(this, validTopActivity, false, true, true, true, "launch_app_finish", z, false, new AwS613S0100000_34(c1913960zuE, 68), 128);
                    return;
                } else {
                    LJIJJ(validTopActivity, false, true, true, true, "launch_app_finish", z, false, new AwS613S0100000_34(c1913960zuE, 69));
                    return;
                }
            }
            c1913960zuE.LIZIZ();
            return;
        }
        c1913960zuE.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.app.Activity r20, java.lang.String r21, X.InterfaceC1914010zuJ r22) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager.LJIIJ(android.app.Activity, java.lang.String, X.0zuJ):void");
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LJIILIIL(Activity activity, String str, InterfaceC1914010zuJ interfaceC1914010zuJ) {
        int i = C2187451AjH.LIZ;
        if (LJIJ(C1BWL.LIZ())) {
            if (!LJIJI() && !LIZLLL()) {
                if (C849850XVn.LIZIZ.LIZJ().LJJ("push")) {
                    LJJIIJ(this, activity, true, true, false, false, str, false, false, new AwS148S1100000_34(str, interfaceC1914010zuJ, 9), 208);
                    return;
                } else {
                    LJIJJ(activity, true, true, false, false, str, true, false, new AwS148S1100000_34(str, interfaceC1914010zuJ, 10));
                    return;
                }
            }
            if (interfaceC1914010zuJ == null) {
                return;
            }
            interfaceC1914010zuJ.LIZIZ();
            return;
        }
        if (interfaceC1914010zuJ == null) {
            return;
        }
        interfaceC1914010zuJ.LIZ();
    }

    public final void LJJIIJZLJL(boolean z, boolean z2, boolean z3) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSPs(isNuj: ");
        sbLIZ.append(z);
        sbLIZ.append(", isLowCvrt: ");
        sbLIZ.append(z2);
        sbLIZ.append(", is2ndPopup: ");
        sbLIZ.append(z3);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            C1BY5.LIZ().storeInt("nu_push_permission_popup_show_count", C1BY5.LIZ().getInt("nu_push_permission_popup_show_count", 0) + 1);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateSPs(isLowCvrt: ");
        sbLIZ2.append(z2);
        sbLIZ2.append(')');
        C2188811AlT.LIZIZ(sbLIZ2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILZ = jCurrentTimeMillis;
        if (z2) {
            this.LLILZIL++;
        }
        LJIILL(jCurrentTimeMillis, z3);
    }

    @Override // X.C0O2O
    public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        if (enumC612200Nzm == EnumC612200Nzm.MUTATION && z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C751570Tdz((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class), null), 3);
        }
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, bool.booleanValue(), enumC612200Nzm);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushPermissionApi
    public final void LJIIZILJ(Activity activity, String str, boolean z, boolean z2, InterfaceC1914010zuJ interfaceC1914010zuJ) {
        int i = C2187451AjH.LIZ;
        if (LJFF(activity)) {
            if (C849850XVn.LIZIZ.LIZJ().LJJ("push")) {
                LJJIIJ(this, activity, true, false, false, false, str, z2, z, new AwS148S1100000_34(str, interfaceC1914010zuJ, 7), 16);
                return;
            } else {
                LJIJJ(activity, true, false, false, false, str, z2, z, new AwS148S1100000_34(str, interfaceC1914010zuJ, 8));
                return;
            }
        }
        if (interfaceC1914010zuJ == null) {
            return;
        }
        interfaceC1914010zuJ.LIZ();
    }

    public final void LJIJJ(final Activity activity, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str, final boolean z5, boolean z6, final Function1<? super Boolean, Unit> function1) {
        Activity validTopActivity;
        final boolean z7;
        String str2;
        String str3;
        if (C19254610Um.LIZIZ.LJIIJJI().LIZ() && !z6 && !((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
            int i = C2187451AjH.LIZ;
            PopupManager.LIZJ(C688090Qyt.class);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (activity == null) {
            validTopActivity = ActivityStack.getValidTopActivity();
        } else {
            validTopActivity = activity;
        }
        final PushPermissionStatusEvent pushPermissionStatusEvent = new PushPermissionStatusEvent();
        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
        if (validTopActivity != null) {
            final boolean zR4 = C786410Ut5.r4(validTopActivity, "android.permission.POST_NOTIFICATIONS");
            if (C1BY5.LIZIZ() > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doShowCombinedPushPermissionPopup() - shouldShowRationale: ");
            sbLIZ.append(zR4);
            sbLIZ.append(", permissionPopupShowTimes: ");
            sbLIZ.append(C1BY5.LIZIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            boolean zWithGuideAndMask = PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask();
            String str4 = "1";
            if (new C815520Vyw(validTopActivity).LIZ()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            if (!z) {
                if (z3) {
                    str4 = "2";
                } else {
                    str4 = "3";
                }
            }
            C814850Vxr.LJII(zWithGuideAndMask ? 1 : 0, zBooleanValue ? 1 : 0, str2, str4, str);
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = System.currentTimeMillis();
            C19514811Wo c19514811Wo = C19514711Wn.LIZIZ;
            TokenCert.Companion companion = TokenCert.Companion;
            if (z) {
                str3 = "bpea-push_permission_nuj_request";
            } else {
                str3 = "bpea-push_permission_scenes";
            }
            C19514711Wn c19514711WnLIZIZ = c19514811Wo.LIZIZ(validTopActivity, companion.with(str3));
            final Activity activity2 = validTopActivity;
            final Activity activity3 = validTopActivity;
            final int i3 = zBooleanValue ? 1 : 0;
            C19514511Wl c19514511WlLIZ = c19514711WnLIZIZ.LIZ(new AbstractC838380Wui() { // from class: X.0W8j
                @Override // X.AbstractC838380Wui
                public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                    int i4;
                    boolean z8;
                    String localClassName;
                    pushPermissionStatusEvent.LJI(Integer.valueOf(PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask() ? 1 : 0), "is_with_cover");
                    PushPermissionStatusEvent pushPermissionStatusEvent2 = pushPermissionStatusEvent;
                    if (z) {
                        i4 = 1;
                    } else if (z3) {
                        i4 = 2;
                    } else {
                        i4 = 3;
                    }
                    pushPermissionStatusEvent2.LJI(Integer.valueOf(i4), "popup_type");
                    String str5 = str;
                    if (str5 != null) {
                        pushPermissionStatusEvent.LJI(str5, "popup_page");
                    }
                    pushPermissionStatusEvent.LJI(Integer.valueOf(i3), "is_first_start");
                    if (zR4 || !z7) {
                        int i5 = C2187451AjH.LIZ;
                        PushPermissionPopupManager pushPermissionPopupManager = this;
                        if (!z && !z3) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        pushPermissionPopupManager.LJJIIJZLJL(z8, z4, z2);
                    }
                    int i6 = C0LHH.LIZ[c0hwoArr[0].LIZIZ.ordinal()];
                    if (i6 != 1) {
                        String localClassName2 = null;
                        if (i6 != 2) {
                            if (i6 == 3) {
                                pushPermissionStatusEvent.LJIILIIL("denied_permanent");
                                int i7 = C2187451AjH.LIZ;
                                c238400w2.element = System.currentTimeMillis();
                                if (z5) {
                                    if (z7) {
                                        PushPermissionPopupManager pushPermissionPopupManager2 = this;
                                        ARunnableS0S1310000_13 aRunnableS0S1310000_13 = new ARunnableS0S1310000_13(z, str, activity, activity3, pushPermissionPopupManager2, 0);
                                        pushPermissionPopupManager2.LLILLL = aRunnableS0S1310000_13;
                                        C786410Ut5.LJLIIL(PushPermissionPopupTimeThresholdExp.INSTANCE.getThresholdInMs(), C799570VYd.LIZJ(), aRunnableS0S1310000_13);
                                    } else {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("showExplainBeforePermission(isNUJ(useCtx): ");
                                        sbLIZ2.append(z);
                                        sbLIZ2.append(", popupPage: ");
                                        sbLIZ2.append(str);
                                        sbLIZ2.append(", ctx: ");
                                        Activity activity4 = activity;
                                        if (activity4 != null) {
                                            localClassName = activity4.getLocalClassName();
                                        } else {
                                            localClassName = null;
                                        }
                                        sbLIZ2.append(localClassName);
                                        sbLIZ2.append(", current: ");
                                        Activity activity5 = activity3;
                                        if (activity5 != null) {
                                            localClassName2 = activity5.getLocalClassName();
                                        }
                                        sbLIZ2.append(localClassName2);
                                        sbLIZ2.append(')');
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                        this.LJJIII(activity3, !r10.withGuideAndMask());
                                    }
                                }
                                if (c19514611Wm != null) {
                                    c19514611Wm.LIZJ();
                                    return;
                                }
                                Function1<Boolean, Unit> function12 = function1;
                                if (function12 == null) {
                                    return;
                                }
                                function12.invoke(Boolean.FALSE);
                                return;
                            }
                            throw new C1954807lC();
                        }
                        pushPermissionStatusEvent.LJIILIIL("this_operation_not_permitted");
                        int i8 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("showExplainBeforePermission(isNUJ(useCtx): ");
                        sbLIZ3.append(z);
                        sbLIZ3.append(", popupPage: ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(", ctx: ");
                        Activity activity6 = activity;
                        if (activity6 != null) {
                            localClassName2 = activity6.getLocalClassName();
                        }
                        sbLIZ3.append(localClassName2);
                        sbLIZ3.append(", current: ");
                        sbLIZ3.append(activity3.getLocalClassName());
                        sbLIZ3.append(')');
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (z5) {
                            this.LJJIII(activity3, !r10.withGuideAndMask());
                        }
                        if (c19514611Wm != null) {
                            c19514611Wm.LIZJ();
                            return;
                        }
                        Function1<Boolean, Unit> function13 = function1;
                        if (function13 == null) {
                            return;
                        }
                        function13.invoke(Boolean.FALSE);
                        return;
                    }
                    pushPermissionStatusEvent.LJIILIIL("granted");
                    int i9 = C2187451AjH.LIZ;
                    if (c19514611Wm != null) {
                        c19514611Wm.LIZIZ();
                        return;
                    }
                    Function1<Boolean, Unit> function14 = function1;
                    if (function14 == null) {
                        return;
                    }
                    function14.invoke(Boolean.FALSE);
                }
            });
            c19514511WlLIZ.LIZIZ("android.permission.POST_NOTIFICATIONS");
            final boolean z8 = z7;
            c19514511WlLIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0W8h
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x01e1  */
                @Override // X.InterfaceC19515111Wr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C0HWO... r19) {
                    /*
                        Method dump skipped, instruction units count: 647
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C818330W8h.LIZ(X.0HWO[]):void");
                }
            });
            return;
        }
        if (function1 == null) {
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public static void LJJIIJ(PushPermissionPopupManager pushPermissionPopupManager, final Activity activity, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, Function1 function1, int i) {
        String str2;
        boolean z7 = z6;
        boolean z8 = z5;
        String str3 = str;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        boolean z12 = z;
        if ((i & 2) != 0) {
            z12 = false;
        }
        if ((i & 4) != 0) {
            z11 = false;
        }
        if ((i & 8) != 0) {
            z10 = false;
        }
        if ((i & 16) != 0) {
            z9 = false;
        }
        Function1 function12 = null;
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            z8 = true;
        }
        if ((i & 128) != 0) {
            z7 = false;
        }
        if ((i & 256) == 0) {
            function12 = function1;
        }
        pushPermissionPopupManager.getClass();
        final AwS0S1360000_13 awS0S1360000_13 = new AwS0S1360000_13(pushPermissionPopupManager, (PushPermissionPopupManager) activity, (Activity) z12, z11, z10, z9, (boolean) str3, (String) z8, z7, (boolean) function12, (Function1<? super Boolean, Unit>) 1);
        C10GR c10gr = new C10GR(activity, awS0S1360000_13) { // from class: X.0Qyt
            public final Activity LL;
            public final Function1<C20656615sK, Unit> LLILLJJLI;

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                Activity activity2 = this.LL;
                if (activity2 instanceof C19EG) {
                    C688080Qys.LIZ(activity2, null, (LifecycleOwner) activity2);
                }
                return null;
            }

            {
                this.LL = activity;
                this.LLILLJJLI = awS0S1360000_13;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                this.LLILLJJLI.invoke(c20656615sK);
                if (((Boolean) C283420B8y.LIZ.getValue()).booleanValue()) {
                    C786410Ut5.LJLIIL(3000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0Qyu
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("DismissPushPopupTask@48fe.run");
                            try {
                                PopupManager.LIZJ(C688090Qyt.class);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("DismissPushPopupTask@48fe.run");
                        }
                    });
                }
            }
        };
        if (z11) {
            str2 = "ug_push_second_time";
        } else {
            str2 = "ug_push_first_time";
        }
        PopupManager.LJIJ(c10gr, "push", new C1668306g5(str2));
    }
}
