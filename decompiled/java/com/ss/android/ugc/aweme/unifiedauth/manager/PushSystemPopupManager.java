package com.ss.android.ugc.aweme.unifiedauth.manager;

import X.AbstractC1387200mCc;
import X.AbstractC838380Wui;
import X.C01GW;
import X.C0C64;
import X.C10GR;
import X.C1387310mCn;
import X.C1388190mED;
import X.C1514430pVp;
import X.C1668306g5;
import X.C1906580ziK;
import X.C1912300zrY;
import X.C19254610Um;
import X.C19514511Wl;
import X.C19514711Wn;
import X.C19514811Wo;
import X.C1BY5;
import X.C20684815ws;
import X.C211000rc;
import X.C2188811AlT;
import X.C2214631Bm1;
import X.C2344009Gk;
import X.C238400w2;
import X.C452501pT;
import X.C688070Qyr;
import X.C786410Ut5;
import X.C815520Vyw;
import X.C818380W8m;
import X.C824390WVp;
import X.C849850XVn;
import X.InterfaceC19515111Wr;
import X.RunnableC818370W8l;
import Y.ARunnableS82S0200000_13;
import Y.AfS197S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushSystemPopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionExtraFreqCtrl4DiggExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupAgainTimingExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupExperienceProtectExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupGuideExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupSceneConfigExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupTimeThresholdExp;
import com.ss.android.ugc.aweme.unifiedauthapi.mob.PushPermissionRequestEvent;
import com.ss.android.ugc.aweme.unifiedauthapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS0S1360000_13;
import kotlin.jvm.internal.AwS70S1300000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class PushSystemPopupManager implements IPushSystemPermissionApi {
    public C818380W8m LIZ;
    public RunnableC818370W8l LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final C01GW LJ;

    public PushSystemPopupManager() {
        C1906580ziK.LIZJ().LIZ().LJJLJLI(new AfS197S0100000_28(this, 25));
        this.LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(137));
    }

    public static int LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPushPermissionPopupAgainTiming(group: ");
        PushPermissionPopupAgainTimingExp pushPermissionPopupAgainTimingExp = PushPermissionPopupAgainTimingExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupAgainTimingExp.getGroup());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        return pushPermissionPopupAgainTimingExp.getGroup();
    }

    public static boolean LJIIIIZZ() {
        long j = C1BY5.LIZ().getLong("system_push_permission_2nd_popup_last_ts", 0L);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitDailyFreqControl(lastShow: ");
        sbLIZ.append(new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(j)));
        sbLIZ.append(", hit: ");
        sbLIZ.append(C1387310mCn.LJII(j));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        return C1387310mCn.LJII(j);
    }

    public static boolean LJIIIZ() {
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
        C211000rc.LIZ("[Push-Sys]");
        if (pushPermissionPopupExperienceProtectExp.isExperimentGroup()) {
            return C1387310mCn.LJII(C1BY5.LIZ().getLong("system_push_permission_1st_nuj_popup_ts", 0L));
        }
        return false;
    }

    public static boolean LJIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hitLowCvrtScene1stLaunchCtrl(");
        sbLIZ.append(C1514430pVp.LIZLLL());
        sbLIZ.append(", ");
        PushPermissionPopupSceneConfigExp pushPermissionPopupSceneConfigExp = PushPermissionPopupSceneConfigExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupSceneConfigExp.getLowCvrtScene1stLaunchCtrl());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        return C1514430pVp.LIZLLL().booleanValue() && pushPermissionPopupSceneConfigExp.getLowCvrtScene1stLaunchCtrl();
    }

    public static boolean LJIIJJI() {
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
        C211000rc.LIZ("[Push-Sys]");
        if ((pushPermissionPopupExperienceProtectExp.getGroup() == pushPermissionPopupExperienceProtectExp.getV2() || pushPermissionPopupExperienceProtectExp.getGroup() == pushPermissionPopupExperienceProtectExp.getV3()) && C1514430pVp.LIZLLL().booleanValue()) {
            return true;
        }
        return pushPermissionPopupExperienceProtectExp.getGroup() == pushPermissionPopupExperienceProtectExp.getV4() && C1387310mCn.LJII(C1514430pVp.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi
    public final boolean LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDuringNoInAppPromptInterval4Protection(group: ");
        PushPermissionPopupExperienceProtectExp pushPermissionPopupExperienceProtectExp = PushPermissionPopupExperienceProtectExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupExperienceProtectExp.getGroup());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        return (pushPermissionPopupExperienceProtectExp.isExperimentGroup() && LJIIIIZZ()) || LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi
    public final boolean LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canShowPushPermission4Digg(exp: ");
        PushPermissionExtraFreqCtrl4DiggExp pushPermissionExtraFreqCtrl4DiggExp = PushPermissionExtraFreqCtrl4DiggExp.INSTANCE;
        sbLIZ.append(pushPermissionExtraFreqCtrl4DiggExp.addExtraControl());
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZLLL <= 0);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PushPermissionPopup");
        return !pushPermissionExtraFreqCtrl4DiggExp.addExtraControl() || this.LIZLLL <= 0;
    }

    public final boolean LJIILIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkLowCvrtSceneLimit(");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('/');
        PushPermissionPopupSceneConfigExp pushPermissionPopupSceneConfigExp = PushPermissionPopupSceneConfigExp.INSTANCE;
        sbLIZ.append(pushPermissionPopupSceneConfigExp.getLowCvrtSceneLimit());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        return pushPermissionPopupSceneConfigExp.getLowCvrtSceneLimit() < 0 || this.LIZJ < pushPermissionPopupSceneConfigExp.getLowCvrtSceneLimit();
    }

    public static boolean LJIIL(Context context) {
        if (PushPermissionPopupExperienceProtectExp.INSTANCE.inNotShowPopupInNujGroups() || Build.VERSION.SDK_INT < 33 || C1BY5.LIZ().getInt("nu_push_permission_popup_show_count", 0) > 0 || C824390WVp.LIZJ(context)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi
    public final boolean LIZLLL(Context context) {
        String storeRegionUpperCase;
        int iLJIJI;
        String clientABMockValue;
        AbstractC1387200mCc abstractC1387200mCcLJFF;
        Activity activityLIZIZ;
        if (context == null && ((abstractC1387200mCcLJFF = C1906580ziK.LJFF()) == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null || (context = C1388190mED.LIZ(activityLIZIZ)) == null)) {
            return false;
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            storeRegionUpperCase = iAccountService.getStoreRegionUpperCase();
        } else {
            storeRegionUpperCase = null;
        }
        C211000rc.LIZ("[NUJ-Push]");
        if (Intrinsics.LJFF(storeRegionUpperCase, "BR")) {
            return false;
        }
        C2214631Bm1.LIZ.getClass();
        ITtmockService iTtmockService = (ITtmockService) PluggableExtentionKt.pluggableSpi$default(ITtmockService.class, false, false, false, 14, null);
        try {
            if (iTtmockService != null && (clientABMockValue = iTtmockService.getClientABMockValue("push_auth_pre_position_config_version_v2")) != null) {
                iLJIJI = CastIntegerProtector.parseInt(clientABMockValue);
            } else {
                iLJIJI = C0C64.LJIILLIIL().LJIJI(ClientExpManager.push_auth_pre_position_config_version_v2(), "push_auth_pre_position_config_version_v2");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIJI = C0C64.LJIILLIIL().LJIJI(ClientExpManager.push_auth_pre_position_config_version_v2(), "push_auth_pre_position_config_version_v2");
        }
        if (iLJIJI == 0 || !LJIIL(context)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi
    public final void LIZJ(Activity activity, C1912300zrY c1912300zrY) {
        C211000rc.LIZ("[Push-Sys]");
        C2214631Bm1.LIZ.getClass();
        if (LJIIL(activity)) {
            if (C849850XVn.LIZIZ.LIZJ().LJJ("push")) {
                LJIILLIIL(this, activity, true, false, false, "nuj_before_consent", false, true, new AwS70S1300000_34(this, activity, c1912300zrY, 0), 16);
                return;
            } else {
                LJFF(activity, true, false, false, false, "nuj_before_consent", false, true, new AwS70S1300000_34(this, activity, c1912300zrY, 1));
                return;
            }
        }
        c1912300zrY.LIZ();
        LJIILJJIL(activity, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
    @Override // com.ss.android.ugc.aweme.unifiedauthapi.push.IPushSystemPermissionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r20, X.C19208410Cs r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.unifiedauth.manager.PushSystemPopupManager.LJ(java.lang.String, X.10Cs):void");
    }

    public final void LJIILJJIL(Context context, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(LIZLLL(context) ? 1 : 0, "expected_status");
        c2344009Gk.LIZJ(z ? 1 : 0, "shown_status");
        C20684815ws.LJIILLIIL("nuj_pre_guide_system_popup", c2344009Gk.LIZ);
    }

    public final void LJIILL(Activity activity, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideExp.withGuideAndMask(");
        sbLIZ.append(PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        if (z) {
            return;
        }
        activity.runOnUiThread(new ARunnableS82S0200000_13(activity, this, 34));
    }

    public final void LJIIZILJ(boolean z, boolean z2, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSPs(isNuj: ");
        sbLIZ.append(z);
        sbLIZ.append(", isLowCvrt: ");
        sbLIZ.append(z2);
        sbLIZ.append(", is2ndPopup: ");
        sbLIZ.append(z3);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        if (z) {
            C1BY5.LIZ().storeInt("nu_push_permission_popup_show_count", C1BY5.LIZ().getInt("nu_push_permission_popup_show_count", 0) + 1);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateSPs(isLowCvrt: ");
        sbLIZ2.append(z2);
        sbLIZ2.append(')');
        C2188811AlT.LIZIZ(sbLIZ2);
        C211000rc.LIZ("[Push-Sys]");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z2) {
            this.LIZJ++;
        }
        C1BY5.LIZ().storeInt("system_push_permission_popup_show_count", C1BY5.LIZIZ() + 1);
        if (z3) {
            C1BY5.LIZ().storeLong("system_push_permission_2nd_popup_last_ts", jCurrentTimeMillis);
        } else {
            C1BY5.LIZ().storeLong("system_push_permission_1st_nuj_popup_ts", jCurrentTimeMillis);
        }
    }

    public final void LJFF(final Activity activity, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str, final boolean z5, boolean z6, final Function1<? super Boolean, Unit> function1) {
        Activity activityLIZ;
        final boolean z7;
        String str2;
        String str3;
        String str4;
        Activity activityLIZIZ;
        if (C19254610Um.LIZIZ.LJIIJJI().LIZ() && !z6 && !((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
            C211000rc.LIZ("[Push-Sys]");
            PopupManager.LIZJ(C688070Qyr.class);
            return;
        }
        if (activity == null) {
            AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
            if (abstractC1387200mCcLJFF == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
                return;
            }
        } else {
            activityLIZ = activity;
        }
        final PushPermissionStatusEvent pushPermissionStatusEvent = new PushPermissionStatusEvent();
        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
        final boolean zR4 = C786410Ut5.r4(activityLIZ, "android.permission.POST_NOTIFICATIONS");
        if (C1BY5.LIZIZ() > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup() - shouldShowRationale: ");
        sbLIZ.append(zR4);
        sbLIZ.append(", permissionPopupShowTimes: ");
        sbLIZ.append(C1BY5.LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        boolean zWithGuideAndMask = PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask();
        String str5 = "1";
        if (new C815520Vyw(activityLIZ).LIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (!z) {
            if (z3) {
                str5 = "2";
            } else {
                str5 = "3";
            }
        }
        PushPermissionRequestEvent pushPermissionRequestEvent = new PushPermissionRequestEvent();
        pushPermissionRequestEvent.LJI(Integer.valueOf(zWithGuideAndMask ? 1 : 0), "is_with_cover");
        pushPermissionRequestEvent.LJI(str2, "out_status");
        pushPermissionRequestEvent.LJI(str5, "popup_type");
        pushPermissionRequestEvent.LJI(Integer.valueOf(zBooleanValue ? 1 : 0), "is_first_start");
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            pushPermissionRequestEvent.LJI(str4, "popup_page");
        }
        pushPermissionRequestEvent.LJI(Integer.valueOf(C1BY5.LIZIZ()), "pop_up_count");
        pushPermissionRequestEvent.LJIIIIZZ();
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        C19514811Wo c19514811Wo = C19514711Wn.LIZIZ;
        TokenCert.Companion companion = TokenCert.Companion;
        if (z) {
            str3 = "bpea-push_permission_nuj_request";
        } else {
            str3 = "bpea-push_permission_scenes";
        }
        C19514711Wn c19514711WnLIZIZ = c19514811Wo.LIZIZ(activityLIZ, companion.with(str3));
        final Activity activity2 = activityLIZ;
        final Activity activity3 = activityLIZ;
        final int i = zBooleanValue ? 1 : 0;
        C19514511Wl c19514511WlLIZ = c19514711WnLIZIZ.LIZ(new AbstractC838380Wui() { // from class: X.0W8k
            /* JADX WARN: Type inference failed for: r3v6, types: [X.0W8l, java.lang.Runnable] */
            @Override // X.AbstractC838380Wui
            public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                int i2;
                boolean z8;
                String localClassName;
                pushPermissionStatusEvent.LJI(Integer.valueOf(PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask() ? 1 : 0), "is_with_cover");
                PushPermissionStatusEvent pushPermissionStatusEvent2 = pushPermissionStatusEvent;
                if (z) {
                    i2 = 1;
                } else if (z3) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                pushPermissionStatusEvent2.LJI(Integer.valueOf(i2), "popup_type");
                String str6 = str;
                if (str6 != null) {
                    pushPermissionStatusEvent.LJI(str6, "popup_page");
                }
                pushPermissionStatusEvent.LJI(Integer.valueOf(i), "is_first_start");
                if (zR4 || !z7) {
                    C211000rc.LIZ("[Push-Sys]");
                    PushSystemPopupManager pushSystemPopupManager = this;
                    if (!z && !z3) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    pushSystemPopupManager.LJIIZILJ(z8, z4, z2);
                }
                int i3 = C0LHG.LIZ[c0hwoArr[0].LIZIZ.ordinal()];
                if (i3 != 1) {
                    String localClassName2 = null;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            pushPermissionStatusEvent.LJIILIIL("denied_permanent");
                            C211000rc.LIZ("[Push-Sys]");
                            c238400w2.element = System.currentTimeMillis();
                            if (z5) {
                                if (z7) {
                                    final WeakReference weakReference = new WeakReference(activity3);
                                    final PushSystemPopupManager pushSystemPopupManager2 = this;
                                    final boolean z9 = z;
                                    final String str7 = str;
                                    final Activity activity4 = activity;
                                    final Activity activity5 = activity3;
                                    ?? r3 = new Runnable() { // from class: X.0W8l
                                        public final void LIZ() {
                                            Activity activity6 = weakReference.get();
                                            if (activity6 != null) {
                                                boolean z10 = z9;
                                                String str8 = str7;
                                                Activity activity7 = activity4;
                                                Activity activity8 = activity5;
                                                PushSystemPopupManager pushSystemPopupManager3 = pushSystemPopupManager2;
                                                C211000rc.LIZ("[Push-Sys]");
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("showExplainBeforePermission(isNUJ(useCtx): ");
                                                sbLIZ2.append(z10);
                                                sbLIZ2.append(", popupPage: ");
                                                sbLIZ2.append(str8);
                                                sbLIZ2.append(", ctx: ");
                                                sbLIZ2.append(activity7 != null ? activity7.getLocalClassName() : null);
                                                sbLIZ2.append(", current: ");
                                                sbLIZ2.append(activity8.getLocalClassName());
                                                sbLIZ2.append(')');
                                                C2188811AlT.LIZIZ(sbLIZ2);
                                                C211000rc.LIZ("[Push-Sys]");
                                                pushSystemPopupManager3.LJIILL(activity6, !PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask());
                                            }
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("PushSystemPopupManager@7f1a.doShowCombinedPushPermissionPopup$1$1$intercept$2");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("PushSystemPopupManager@7f1a.doShowCombinedPushPermissionPopup$1$1$intercept$2");
                                        }
                                    };
                                    pushSystemPopupManager2.LIZIZ = r3;
                                    C786410Ut5.LJLIIL(PushPermissionPopupTimeThresholdExp.INSTANCE.getThresholdInMs(), C799570VYd.LIZJ(), r3);
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("showExplainBeforePermission(isNUJ(useCtx): ");
                                    sbLIZ2.append(z);
                                    sbLIZ2.append(", popupPage: ");
                                    sbLIZ2.append(str);
                                    sbLIZ2.append(", ctx: ");
                                    Activity activity6 = activity;
                                    if (activity6 != null) {
                                        localClassName = activity6.getLocalClassName();
                                    } else {
                                        localClassName = null;
                                    }
                                    sbLIZ2.append(localClassName);
                                    sbLIZ2.append(", current: ");
                                    Activity activity7 = activity3;
                                    if (activity7 != null) {
                                        localClassName2 = activity7.getLocalClassName();
                                    }
                                    sbLIZ2.append(localClassName2);
                                    sbLIZ2.append(')');
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    C211000rc.LIZ("[Push-Sys]");
                                    this.LJIILL(activity3, !r11.withGuideAndMask());
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
                    C211000rc.LIZ("[Push-Sys]");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("showExplainBeforePermission(isNUJ(useCtx): ");
                    sbLIZ3.append(z);
                    sbLIZ3.append(", popupPage: ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", ctx: ");
                    Activity activity8 = activity;
                    if (activity8 != null) {
                        localClassName2 = activity8.getLocalClassName();
                    }
                    sbLIZ3.append(localClassName2);
                    sbLIZ3.append(", current: ");
                    sbLIZ3.append(activity3.getLocalClassName());
                    sbLIZ3.append(')');
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C211000rc.LIZ("[Push-Sys]");
                    if (z5) {
                        this.LJIILL(activity3, !r11.withGuideAndMask());
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
                C211000rc.LIZ("[Push-Sys]");
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
        c19514511WlLIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0W8i
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01f3  */
            @Override // X.InterfaceC19515111Wr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C0HWO... r20) {
                /*
                    Method dump skipped, instruction units count: 678
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C818340W8i.LIZ(X.0HWO[]):void");
            }
        });
    }

    public static void LJIILLIIL(PushSystemPopupManager pushSystemPopupManager, final Activity activity, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, Function1 function1, int i) {
        String str2;
        boolean z6 = z5;
        boolean z7 = z4;
        String str3 = str;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 2) != 0) {
            z10 = false;
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        if ((i & 16) != 0) {
            z8 = false;
        }
        Function1 function12 = null;
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            z7 = true;
        }
        if ((i & 128) != 0) {
            z6 = false;
        }
        if ((i & 256) == 0) {
            function12 = function1;
        }
        pushSystemPopupManager.getClass();
        final AwS0S1360000_13 awS0S1360000_13 = new AwS0S1360000_13(pushSystemPopupManager, (PushSystemPopupManager) activity, (Activity) z10, z9, false, z8, (boolean) str3, (String) z7, z6, (boolean) function12, (Function1<? super Boolean, Unit>) 0);
        C10GR c10gr = new C10GR(activity, awS0S1360000_13) { // from class: X.0Qyr
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
                    C786410Ut5.LJLIIL(3000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0PEc
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("DismissPushPopupTask@ef0d.run");
                            try {
                                PopupManager.LIZJ(C688070Qyr.class);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("DismissPushPopupTask@ef0d.run");
                        }
                    });
                }
            }
        };
        if (z9) {
            str2 = "ug_push_second_time";
        } else {
            str2 = "ug_push_first_time";
        }
        PopupManager.LJIJ(c10gr, "push", new C1668306g5(str2));
    }
}
