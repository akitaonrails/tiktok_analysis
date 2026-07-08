package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import X.AbstractC848400XPy;
import X.C013C;
import X.C0XI4;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C1233040iBy;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C1571830r0P;
import X.C15XM;
import X.C15Y6;
import X.C15Y7;
import X.C15YE;
import X.C15YK;
import X.C15YW;
import X.C15YX;
import X.C1697810uHb;
import X.C19EG;
import X.C204684157i;
import X.C20536115Xj;
import X.C20544915aJ;
import X.C20684815ws;
import X.C2344009Gk;
import X.C247100xR;
import X.C288680BTe;
import X.C294510BgX;
import X.C297270Bkz;
import X.C593710NQj;
import X.C786410Ut5;
import X.C993903ub;
import X.DialogC1389620mGW;
import X.EnumC1779300wP2;
import X.EnumC20537615Xy;
import X.EnumC20538815Yk;
import X.InterfaceC1051730dTX;
import X.InterfaceC1586340rNo;
import X.InterfaceC20537915Yb;
import Y.ACListenerS126S0200000_24;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.experiments.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.FeedLynxOverlayConfig;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourServerDrivenConfig;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHoursAdditionalSettings;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.compliance.protection.jsb.GetDigitalWellbeingStatusMethod;
import com.ss.android.ugc.aweme.compliance.protection.jsb.GetFormattedTimeMethod;
import com.ss.android.ugc.aweme.compliance.protection.jsb.PopDigitalWellbeingVerifyViewMethod;
import com.ss.android.ugc.aweme.compliance.protection.jsb.SetDigitalWellbeingStatusMethod;
import com.ss.android.ugc.aweme.compliance.protection.timelock.RevampPasscodeUtil;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.SleepHourComponent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes32.dex */
public class ProtectionServiceImpl implements IProtectionService {
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("aweme://", "sslocal://");
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final String LJIILJJIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIIZILJ() {
        C15XM.LIZJ(null, "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final C13IQ<? extends UISlotAssem> LJJJI() {
        return C13LE.LIZ(SleepHourComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJJJJ() {
        this.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJII() {
        if (this.LIZ) {
            return false;
        }
        return LJJJLZIJ().LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJIIIZ() {
        C15YE.LIZ.getClass();
        return C15YE.LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJIL() {
        C15YW.LIZ.getClass();
        return C15YW.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJJI() {
        RevampPasscodeUtil.LIZ.getClass();
        return RevampPasscodeUtil.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final UserDetailsInfoBean LJJII() {
        C20536115Xj.LIZ.getClass();
        return C20536115Xj.LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIIJ() {
        C15YE.LIZ.getClass();
        C15YE.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJJIIZI() {
        C15YE.LIZ.getClass();
        return C15YE.LJIIJ() ? 2 : 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJJIJ() {
        C15YE.LIZ.getClass();
        EnumC20537615Xy enumC20537615XyLIZIZ = C15YE.LJ().LIZIZ();
        if (enumC20537615XyLIZIZ != EnumC20537615Xy.CHILD && enumC20537615XyLIZIZ != EnumC20537615Xy.UNLINK_LOCKED) {
            return true;
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJJIJIIJIL() {
        C15YE.LIZ.getClass();
        return C15YE.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final SleepHourConfigSettings LJJIJIL() {
        C20536115Xj.LIZ.getClass();
        return C20536115Xj.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJJJIL() {
        C15YE.LIZ.getClass();
        return C15YE.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJJJ() {
        C15YE.LIZ.getClass();
        C15YE.LIZLLL().LJIILJJIL();
        C15YE.LJ().LJIJI(null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJJJI() {
        C20536115Xj.LIZ.getClass();
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        if (sleepHourConfigSettingsLIZLLL == null || !Intrinsics.LJFF(sleepHourConfigSettingsLIZLLL.sleepHourEnabled, Boolean.TRUE)) {
            return;
        }
        C15YW.LIZ.getClass();
        C15YW.LJI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final List<ScreenTimeManagementDaySetting> LJJJJIZL() {
        C20536115Xj.LIZ.getClass();
        return C20536115Xj.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final InterfaceC1586340rNo LJJJJLI() {
        return new InterfaceC1586340rNo() { // from class: X.0rNi
            @Override // X.InterfaceC1586340rNo
            public final void LIZ(InterfaceC1617760sCU interfaceC1617760sCU, View view, C424700Gl2 c424700Gl2, View view2) {
                if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
                    C308240C6k.LIZJ(2, "ComplianceApiFragmentObserver, hide", false);
                    if (view2 != null) {
                        C2180521AVm.LIZLLL(view2, 8, C1AV3.LIZ(1, "PNS", Boolean.FALSE, "compilance_observer"));
                    }
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    try {
                        C0C64.LJIILLIIL().getClass();
                        SpecialTopicEntry specialTopicEntry = (SpecialTopicEntry) C0C64.LJJI(SpecialTopicEntry.class, "special_event_entrypoint", true);
                        if (specialTopicEntry != null && specialTopicEntry.enable && !TextUtils.isEmpty(specialTopicEntry.landingRoute) && !TextUtils.isEmpty(specialTopicEntry.iconUrl)) {
                            if (C10EU.LJIIIIZZ() && !specialTopicEntry.childViewable) {
                                return;
                            }
                            int visibility = c424700Gl2.getVisibility();
                            c424700Gl2.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, c424700Gl2);
                            C1324840ka2.LJIIJ(c424700Gl2, specialTopicEntry.iconUrl, -1, -1);
                            String strF3 = interfaceC1617760sCU.f3();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", strF3);
                            c2344009Gk.LJIIIIZZ("type", specialTopicEntry.eventName);
                            c2344009Gk.LJIIIIZZ("url", specialTopicEntry.landingRoute);
                            C20684815ws.LJIILLIIL("topic_entrance_show", c2344009Gk.LIZ);
                            C786410Ut5.z9(c424700Gl2, new ACListenerS126S0200000_24(interfaceC1617760sCU, specialTopicEntry, 44));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJJJJZI() {
        C15YE.LIZ.getClass();
        return C15YE.LJIIJ();
    }

    public static InterfaceC20537915Yb LJJJLZIJ() {
        return C297270Bkz.LIZ() ? C15Y6.LL : C15Y7.LL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final ScheduleBreakSettings LIZ() {
        return (C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LIZIZ() {
        return LJJJLZIJ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LIZJ() {
        LJJJLZIJ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJ() {
        LJJJLZIJ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJFF() {
        return LJJJLZIJ().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJIIIIZZ() {
        return LJJJLZIJ().LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIIJ() {
        LJJJLZIJ().LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIIJJI() {
        LJJJLZIJ().LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJIIL() {
        return LJJJLZIJ().LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJIILIIL() {
        return LJJJLZIJ().LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJIJJLI() {
        return LJJJLZIJ().LJJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJJIJIIJI() {
        return LJJJLZIJ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJJIL() {
        return LJJJLZIJ().LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJJJJLL() {
        return LJJJLZIJ().LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int LJJJLIIL() {
        return LJJJLZIJ().LJJI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int Ve() {
        return LJJJLZIJ().LJIIL() ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJ() {
        C593710NQj.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIFFI() {
        C247100xR.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIILL(FeedLynxOverlayConfig feedLynxOverlayConfig) {
        if (!C294510BgX.LIZ()) {
            return;
        }
        String str = feedLynxOverlayConfig.lynxSchema;
        List<String> list = LIZIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, it2.next(), true)) {
                    new AwS572S0100000_28(feedLynxOverlayConfig, 175);
                    C20544915aJ.LIZ.getClass();
                    C20544915aJ.LIZLLL(feedLynxOverlayConfig);
                    C1440005kM.LIZ(new C1571830r0P(EnumC20538815Yk.LYNX_OVERLAY, "try_show_feed_lynx"));
                    return;
                }
            }
        }
        new AwS572S0100000_28(feedLynxOverlayConfig, 174);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final List<InterfaceC1051730dTX> LJIILLIIL(C1051660dTQ c1051660dTQ) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GetDigitalWellbeingStatusMethod(c1051660dTQ, "getDigitalWellbeingStatus"));
        arrayList.add(new PopDigitalWellbeingVerifyViewMethod(c1051660dTQ, "popDigitalWellbeingVerifyView"));
        arrayList.add(new SetDigitalWellbeingStatusMethod(c1051660dTQ, "setDigitalWellbeingStatus"));
        arrayList.add(new GetFormattedTimeMethod(c1051660dTQ, "getFormattedTime"));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIJ(String str) {
        C20544915aJ.LIZ.getClass();
        C20544915aJ.LIZLLL(null);
        C1440005kM.LIZ(new C1571830r0P(EnumC20538815Yk.DISMISS, str));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIJJ(boolean z) {
        LJJJLZIJ().LJIJ(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIII(boolean z) {
        LJJJLZIJ().LJIJI(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIIJZLJL(SleepHourConfigSettings sleepHourConfigSettings) {
        C20536115Xj.LIZ.getClass();
        C20536115Xj.LJIIJJI(sleepHourConfigSettings);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIIZ(final Activity activity) {
        C15YE.LIZ.getClass();
        if (activity != null) {
            if (!C15YE.LIZ()) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(activity.getString(R.string.jb4));
                c1389890mGx.LJIIJJI();
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "general_setting");
            C20684815ws.LJIILLIIL("mute_push_notification_click", c2344009Gk.LIZ);
            final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
            dialogC1389620mGW.LJJLL(false);
            dialogC1389620mGW.LJJLJ(R.string.txr);
            dialogC1389620mGW.setCancelable(false);
            C786410Ut5.J4(dialogC1389620mGW);
            C15YE.LJIILL(new C15YK() { // from class: X.15YA
                @Override // X.C15YK
                public final void onSuccess() {
                    boolean z;
                    DoNotDisturbSettings doNotDisturbSettingsLIZ;
                    Integer num;
                    Integer num2;
                    Integer num3;
                    Integer num4;
                    Boolean bool;
                    Integer num5;
                    Integer num6;
                    Integer num7;
                    Integer num8;
                    Boolean bool2;
                    C786410Ut5.LJIIJ(dialogC1389620mGW);
                    C15YE.LIZ.getClass();
                    if (C15YE.LJ().LIZIZ() == EnumC20537615Xy.CHILD && C15YE.LJ().LJIILLIIL()) {
                        z = true;
                        doNotDisturbSettingsLIZ = C15YE.LJ().LJIJJLI();
                    } else {
                        z = false;
                        C20536115Xj.LIZ.getClass();
                        doNotDisturbSettingsLIZ = C20536115Xj.LIZ();
                    }
                    C20536115Xj.LIZ.getClass();
                    DoNotDisturbSettings doNotDisturbSettingsLJFF = C20536115Xj.LJFF();
                    C0XI4 c0xi4 = new C0XI4(DigitalWellbeingEntranceSettings.LIZ("aweme://lynxview/?channel=fe_tns_reminder&bundle=mute-notifications-page/template.js&hide_nav_bar=1&use_spark=1&wait_gecko_update=1&use_forest=1&status_bar_color=f5f5f5&status_bar_color_light=f5f5f5&status_bar_color_dark=000000&loading_bg_color=f5f5f5&loading_bg_color_light=f5f5f5&loading_bg_color_dark=000000"));
                    c0xi4.LJ("system_mute_notification_enabled", String.valueOf((doNotDisturbSettingsLJFF == null || (bool2 = doNotDisturbSettingsLJFF.pauseNotificationEnabled) == null) ? false : bool2.booleanValue()));
                    c0xi4.LIZIZ((doNotDisturbSettingsLJFF == null || (num8 = doNotDisturbSettingsLJFF.pauseNotificationStartHour) == null) ? 0 : num8.intValue(), "system_start_hour");
                    c0xi4.LIZIZ((doNotDisturbSettingsLJFF == null || (num7 = doNotDisturbSettingsLJFF.pauseNotificationStartMinute) == null) ? 0 : num7.intValue(), "system_start_minute");
                    c0xi4.LIZIZ((doNotDisturbSettingsLJFF == null || (num6 = doNotDisturbSettingsLJFF.pauseNotificationEndHour) == null) ? 0 : num6.intValue(), "system_end_hour");
                    c0xi4.LIZIZ((doNotDisturbSettingsLJFF == null || (num5 = doNotDisturbSettingsLJFF.pauseNotificationEndMinute) == null) ? 0 : num5.intValue(), "system_end_minute");
                    c0xi4.LJ("pause_notification_enabled", String.valueOf((doNotDisturbSettingsLIZ == null || (bool = doNotDisturbSettingsLIZ.pauseNotificationEnabled) == null) ? false : bool.booleanValue()));
                    c0xi4.LIZIZ((doNotDisturbSettingsLIZ == null || (num4 = doNotDisturbSettingsLIZ.pauseNotificationStartHour) == null) ? 0 : num4.intValue(), "pause_start_hour");
                    c0xi4.LIZIZ((doNotDisturbSettingsLIZ == null || (num3 = doNotDisturbSettingsLIZ.pauseNotificationStartMinute) == null) ? 0 : num3.intValue(), "pause_start_minute");
                    c0xi4.LIZIZ((doNotDisturbSettingsLIZ == null || (num2 = doNotDisturbSettingsLIZ.pauseNotificationEndHour) == null) ? 0 : num2.intValue(), "pause_end_hour");
                    c0xi4.LIZIZ((doNotDisturbSettingsLIZ == null || (num = doNotDisturbSettingsLIZ.pauseNotificationEndMinute) == null) ? 0 : num.intValue(), "pause_end_minute");
                    c0xi4.LIZIZ(z ? 0 : -1, "isParent");
                    SmartRouter.buildRoute(activity, c0xi4.LJFF()).open();
                }

                @Override // X.C15YK
                public final void onFailed(Exception exc) {
                    C786410Ut5.LJIIJ(dialogC1389620mGW);
                    C1354920lMY.LIZJ(activity, exc);
                }
            }, "");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIJLIJ(String str) {
        if (str == null) {
            return;
        }
        C15YW.LIZ.getClass();
        C15YW.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIZ(Bundle bundle) {
        String string;
        String strLIZ;
        long jLIZIZ;
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        C15YE.LIZ.getClass();
        if (validTopActivity != null) {
            if (!C15YE.LIZ()) {
                C1233040iBy c1233040iBy = new C1233040iBy(validTopActivity);
                c1233040iBy.LIZJ(validTopActivity.getString(R.string.jb4));
                c1233040iBy.LIZLLL();
                return;
            }
            C15YE.LJIILIIL(C1697810uHb.LJIILJJIL("fe_tns_screen_time_homepage", "fe_tns_screen_time_management", "fe_tns_reminder"));
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("screen_time_dashboard_lynx3", false)) {
                strLIZ = "aweme://roma_redirect/?spark_page=screen_time_dashboard_popup";
            } else {
                strLIZ = DigitalWellbeingEntranceSettings.LIZ("aweme://lynxview_popup/?channel=fe_tns_screen_time_homepage&bundle=digital-wellbeing-react/template.js&hide_nav_bar=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1");
            }
            C0XI4 c0xi4 = new C0XI4(UriProtector.parse(strLIZ).buildUpon().appendQueryParameter("height", "262").appendQueryParameter("gravity", "bottom").appendQueryParameter("show_mask", "1").appendQueryParameter("mask_bg_color", "00000080").appendQueryParameter("panel_style", "1").build().toString());
            c0xi4.LJ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            c0xi4.LJ("enter_from", string);
            C993903ub.LIZ.getClass();
            PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
            if (pnSDigitalWellbeingSDKService != null) {
                jLIZIZ = pnSDigitalWellbeingSDKService.LIZIZ();
            } else {
                jLIZIZ = 0;
            }
            c0xi4.LIZJ(jLIZIZ, "used_time");
            c0xi4.LJ("group", "digital_wellbeing");
            SmartRouter.buildRoute(validTopActivity, c0xi4.LJFF()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean LJJJJJL(final long j) throws InterruptedException {
        C15YE.LIZ.getClass();
        final C013C c013c = new C013C();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C15YE.LJI().LIZ(new C15YK() { // from class: X.15YB
            @Override // X.C15YK
            public final void onSuccess() {
                DoNotDisturbSettings doNotDisturbSettingsLIZ;
                DoNotDisturbSettings doNotDisturbSettings;
                Long l;
                Long l2;
                Integer num;
                Integer num2;
                Integer num3;
                Integer num4;
                Integer num5;
                Boolean bool;
                C20536115Xj.LIZ.getClass();
                DoNotDisturbSettings doNotDisturbSettingsLJFF = C20536115Xj.LJFF();
                if (doNotDisturbSettingsLJFF != null) {
                    C013C c013c2 = c013c;
                    long j2 = j;
                    C15YE.LIZ.getClass();
                    c013c2.element = C15YE.LJIIL(doNotDisturbSettingsLJFF, j2);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("systemMuteSettings isMuteTime: ");
                    sbLIZ.append(c013c2.element);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C15YE.LIZ.getClass();
                int iIntValue = 0;
                if (C15YE.LJ().LIZIZ() == EnumC20537615Xy.CHILD && C15YE.LJ().LJIILLIIL()) {
                    int i2 = C2187451AjH.LIZ;
                    doNotDisturbSettingsLIZ = C15YE.LJ().LJIJJLI();
                } else {
                    int i3 = C2187451AjH.LIZ;
                    doNotDisturbSettingsLIZ = C20536115Xj.LIZ();
                }
                if (doNotDisturbSettingsLIZ != null) {
                    C013C c013c3 = c013c;
                    c013c3.element = C15YE.LJIIL(doNotDisturbSettingsLIZ, j);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("doNotDisturbSettings isMuteTime: ");
                    sbLIZ2.append(c013c3.element);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
                if (sleepHourConfigSettingsLIZLLL != null && Intrinsics.LJFF(sleepHourConfigSettingsLIZLLL.sleepHourEnabled, Boolean.TRUE)) {
                    SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ = C20536115Xj.LJ();
                    if (sleepHoursAdditionalSettingsLJ == null || (num = sleepHoursAdditionalSettingsLJ.abGroup) == null || num.intValue() != 0) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("sleepTimeSettings use sleepHoursAdditionalSettings(");
                        SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ2 = C20536115Xj.LJ();
                        sbLIZ3.append(sleepHoursAdditionalSettingsLJ2 != null ? sleepHoursAdditionalSettingsLJ2.sleepHoursStartTimestamp : null);
                        sbLIZ3.append(", ");
                        SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ3 = C20536115Xj.LJ();
                        sbLIZ3.append(sleepHoursAdditionalSettingsLJ3 != null ? sleepHoursAdditionalSettingsLJ3.sleepHoursEndTimestamp : null);
                        sbLIZ3.append(')');
                        C2188811AlT.LIZIZ(sbLIZ3);
                        Calendar calendar = Calendar.getInstance();
                        SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ4 = C20536115Xj.LJ();
                        long jLongValue = 0;
                        long jLongValue2 = (sleepHoursAdditionalSettingsLJ4 == null || (l2 = sleepHoursAdditionalSettingsLJ4.sleepHoursStartTimestamp) == null) ? 0L : l2.longValue();
                        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                        calendar.setTimeInMillis(jLongValue2 * j3);
                        Calendar calendar2 = Calendar.getInstance();
                        SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ5 = C20536115Xj.LJ();
                        if (sleepHoursAdditionalSettingsLJ5 != null && (l = sleepHoursAdditionalSettingsLJ5.sleepHoursEndTimestamp) != null) {
                            jLongValue = l.longValue();
                        }
                        calendar2.setTimeInMillis(jLongValue * j3);
                        doNotDisturbSettings = new DoNotDisturbSettings(Boolean.TRUE, Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar2.get(11)), Integer.valueOf(calendar2.get(12)));
                    } else {
                        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL2 = C20536115Xj.LIZLLL();
                        Boolean boolValueOf = Boolean.valueOf((sleepHourConfigSettingsLIZLLL2 == null || (bool = sleepHourConfigSettingsLIZLLL2.sleepHourEnabled) == null) ? false : bool.booleanValue());
                        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL3 = C20536115Xj.LIZLLL();
                        Integer numValueOf = Integer.valueOf((sleepHourConfigSettingsLIZLLL3 == null || (num5 = sleepHourConfigSettingsLIZLLL3.sleepTimeStartHour) == null) ? 0 : num5.intValue());
                        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL4 = C20536115Xj.LIZLLL();
                        Integer numValueOf2 = Integer.valueOf((sleepHourConfigSettingsLIZLLL4 == null || (num4 = sleepHourConfigSettingsLIZLLL4.sleepTimeStartMinute) == null) ? 0 : num4.intValue());
                        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL5 = C20536115Xj.LIZLLL();
                        Integer numValueOf3 = Integer.valueOf((sleepHourConfigSettingsLIZLLL5 == null || (num3 = sleepHourConfigSettingsLIZLLL5.sleepTimeEndHour) == null) ? 0 : num3.intValue());
                        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL6 = C20536115Xj.LIZLLL();
                        if (sleepHourConfigSettingsLIZLLL6 != null && (num2 = sleepHourConfigSettingsLIZLLL6.sleepTimeEndMinute) != null) {
                            iIntValue = num2.intValue();
                        }
                        doNotDisturbSettings = new DoNotDisturbSettings(boolValueOf, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(iIntValue));
                    }
                    c013c.element = C15YE.LJIIL(doNotDisturbSettings, j);
                }
                countDownLatch.countDown();
            }

            @Override // X.C15YK
            public final void onFailed(Exception exc) {
                countDownLatch.countDown();
            }
        }, "");
        countDownLatch.await();
        return c013c.element;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJJJL(SleepHourServerDrivenConfig sleepHourServerDrivenConfig) {
        EnumC1779300wP2 enumC1779300wP2;
        Integer num;
        Integer num2;
        Integer num3;
        new AwS572S0100000_28(sleepHourServerDrivenConfig, 176);
        C15YW.LIZ.getClass();
        if (C294510BgX.LIZ() && !C288680BTe.LIZ()) {
            boolean zIsFirstShown = sleepHourServerDrivenConfig.isFirstShown();
            C15YX.LIZ.getClass();
            SleepHourSettings sleepHourSettingsLIZJ = C15YX.LIZJ();
            if (sleepHourSettingsLIZJ == null) {
                sleepHourSettingsLIZJ = new SleepHourSettings(true, 0L, 0, 0);
            }
            if (zIsFirstShown) {
                enumC1779300wP2 = EnumC1779300wP2.ONE_HOUR;
            } else {
                enumC1779300wP2 = EnumC1779300wP2.FIFTEEN_MINS;
            }
            C15YX.LJFF(SleepHourSettings.LIZ(sleepHourSettingsLIZJ, zIsFirstShown, 0L, 0, enumC1779300wP2.getValue(), 6));
            String strLJIIIZ = sleepHourServerDrivenConfig.startTime;
            Integer num4 = null;
            if (strLJIIIZ == null) {
                C20536115Xj.LIZ.getClass();
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
                if (sleepHourConfigSettingsLIZLLL != null) {
                    num2 = sleepHourConfigSettingsLIZLLL.sleepTimeStartHour;
                } else {
                    num2 = null;
                }
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL2 = C20536115Xj.LIZLLL();
                if (sleepHourConfigSettingsLIZLLL2 != null) {
                    num3 = sleepHourConfigSettingsLIZLLL2.sleepTimeStartMinute;
                } else {
                    num3 = null;
                }
                strLJIIIZ = C15YW.LJIIIZ(num2, num3);
            }
            C15YW.LJ = strLJIIIZ;
            String strLJIIIZ2 = sleepHourServerDrivenConfig.endTime;
            if (strLJIIIZ2 == null) {
                C20536115Xj.LIZ.getClass();
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL3 = C20536115Xj.LIZLLL();
                if (sleepHourConfigSettingsLIZLLL3 != null) {
                    num = sleepHourConfigSettingsLIZLLL3.sleepTimeEndHour;
                } else {
                    num = null;
                }
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL4 = C20536115Xj.LIZLLL();
                if (sleepHourConfigSettingsLIZLLL4 != null) {
                    num4 = sleepHourConfigSettingsLIZLLL4.sleepTimeEndMinute;
                }
                strLJIIIZ2 = C15YW.LJIIIZ(num, num4);
            }
            C15YW.LJFF = strLJIIIZ2;
            C15YW.LJIIIIZZ = true;
            new AwS575S0100000_31(sleepHourServerDrivenConfig, 1303);
            C1440005kM.LIZ(new C1571830r0P(EnumC20538815Yk.MEDITATION_VIDEO, "try_show_sleep_hour_server"));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJJJZ(List<String> list) {
        C15YE.LIZ.getClass();
        C15YE.LJIILIIL(list);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LIZLLL(int i, int i2) {
        LJJJLZIJ().LIZLLL(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJI(int i, int i2) {
        LJJJLZIJ().LJI(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJIJL(C15YK c15yk, String str) {
        C15YE.LIZ.getClass();
        C15YE.LJIILL(c15yk, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final InterfaceC1051730dTX LJJJLL(C1051660dTQ c1051660dTQ, String str) {
        switch (str.hashCode()) {
            case -1371524671:
                if (str.equals("getDigitalWellbeingStatus")) {
                    return new GetDigitalWellbeingStatusMethod(c1051660dTQ, "getDigitalWellbeingStatus");
                }
                return null;
            case -528233011:
                if (str.equals("setDigitalWellbeingStatus")) {
                    return new SetDigitalWellbeingStatusMethod(c1051660dTQ, "setDigitalWellbeingStatus");
                }
                return null;
            case -169720760:
                if (str.equals("popDigitalWellbeingVerifyView")) {
                    return new PopDigitalWellbeingVerifyViewMethod(c1051660dTQ, "popDigitalWellbeingVerifyView");
                }
                return null;
            case 1459844595:
                if (str.equals("getFormattedTime")) {
                    return new GetFormattedTimeMethod(c1051660dTQ, "getFormattedTime");
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJJJ(final Context context, final Runnable runnable, final String str) {
        C15YE.LIZ.getClass();
        if (C15YE.LJ().LIZIZ() != EnumC20537615Xy.CHILD && C15YE.LJ().LIZIZ() != EnumC20537615Xy.UNLINK_LOCKED) {
            if (C15YE.LIZLLL().LJIIL() && C15YE.LIZLLL().LJIIZILJ()) {
                C1440005kM.LIZ(new IEvent() { // from class: X.0iMR
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                C20684815ws.LJIILLIIL("time_lock_block_show", c2344009Gk.LIZ);
                C15XM.LIZJ(new C204684157i(runnable), str);
                return;
            }
            runnable.run();
            return;
        }
        C15YE.LJIILL(new C15YK(context, runnable, str) { // from class: X.15YJ
            public final /* synthetic */ Runnable LIZ;
            public final /* synthetic */ String LIZIZ;

            @Override // X.C15YK
            public final void onSuccess() {
                C15YE c15ye = C15YE.LIZ;
                Runnable runnable2 = this.LIZ;
                String str2 = this.LIZIZ;
                c15ye.getClass();
                C15YE.LIZIZ(runnable2, str2);
            }

            @Override // X.C15YK
            public final void onFailed(Exception exc) {
                C15YE c15ye = C15YE.LIZ;
                Runnable runnable2 = this.LIZ;
                String str2 = this.LIZIZ;
                c15ye.getClass();
                C15YE.LIZIZ(runnable2, str2);
            }

            {
                this.LIZ = runnable;
                this.LIZIZ = str;
            }
        }, "");
        C1440005kM.LIZ(new IEvent() { // from class: X.0iMR
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void LJIJI(C19EG c19eg, int i, boolean z, int i2, int i3, List<ScreenTimeManagementDaySetting> list) {
        LJJJLZIJ().LJJIFFI(i, z, i2, i3, list);
    }
}
