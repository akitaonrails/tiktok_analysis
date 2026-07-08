package com.ss.android.ugc.aweme.feed.spi;

import X.C08TN;
import X.C0BAC;
import X.C0BX7;
import X.C0DMM;
import X.C0ROI;
import X.C0S4U;
import X.C0SUC;
import X.C0WYJ;
import X.C0XQ7;
import X.C1052140dUC;
import X.C10IT;
import X.C123100dR;
import X.C1379120lza;
import X.C1389910mGz;
import X.C1393750mNB;
import X.C1398490mUp;
import X.C1440005kM;
import X.C1584320rKY;
import X.C1590220rU4;
import X.C1590320rUE;
import X.C1591860rWi;
import X.C1593900ra0;
import X.C15O7;
import X.C1602700roC;
import X.C1616490sAR;
import X.C19EG;
import X.C20660315sv;
import X.C20661615t8;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2421209eE;
import X.C278120AvC;
import X.C289760BXi;
import X.C300620BqO;
import X.C343710Ddh;
import X.C483280IxK;
import X.C587860N3w;
import X.C608450Ntj;
import X.C608890NuR;
import X.C617900OLk;
import X.C729510SjV;
import X.C733570Sq3;
import X.C736500Sum;
import X.C747010TRz;
import X.C849920XVu;
import X.CallableC608440Nti;
import X.InterfaceC1393680mN4;
import X.InterfaceC1603190roz;
import X.InterfaceC20658015sY;
import X.RunnableC1601200rlm;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.referral.FeedBannerAwemeHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class CommonFeedServiceImpl implements FeedCommonService {
    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIILLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LIZ() {
        C1602700roC c1602700roC = C1602700roC.LIZ;
        if (C0BX7.LIZ()) {
            return;
        }
        C1602700roC c1602700roC2 = C1602700roC.LIZ;
        Keva keva = C1602700roC.LIZIZ;
        c1602700roC2.getClass();
        keva.storeLong(C1602700roC.LIZ("nu_vv_count"), keva.getLong(C1602700roC.LIZ("nu_vv_count"), 0L) + 1);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LIZLLL() {
        C1440005kM.LIZ(new C736500Sum());
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJII() {
        C1602700roC.LIZ.getClass();
        if (C0BX7.LIZ()) {
            return;
        }
        C1602700roC.LIZJ();
        C1602700roC.LIZJ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIIIIZZ() {
        Activity activityLIZ;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C1590220rU4.LIZ.getClass();
        if (C300620BqO.LIZ() && (activityLIZ = C2421209eE.LIZ()) != null && (activityLIZ instanceof C19EG)) {
            C19EG c19eg = (C19EG) activityLIZ;
            String strWg = C343710Ddh.LIZ(c19eg).Wg();
            if (Intrinsics.LJFF(strWg, "HOME")) {
                if (!(activityLIZ instanceof InterfaceC1603190roz) || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                    return;
                } else {
                    strWg = homeTabAbilityLIZ.Vn0(true);
                }
            }
            if (strWg != null) {
                C1584320rKY.LIZ.getClass();
                C1590220rU4.LIZ(new C1590320rUE(System.currentTimeMillis(), C1584320rKY.LJI(strWg), (String) C1584320rKY.LIZIZ(c19eg, strWg).getFirst(), "goback_sidebar"), "sidebar");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIIL() {
        C1602700roC.LIZ.getClass();
        if (C0BX7.LIZ()) {
            return;
        }
        C1602700roC.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIJ() {
        for (FeedBannerAwemeHelper feedBannerAwemeHelper : FeedBannerAwemeHelper.LIZLLL.getValue().values()) {
            feedBannerAwemeHelper.LIZIZ();
            feedBannerAwemeHelper.LIZIZ.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIL() {
        RunnableC1601200rlm runnableC1601200rlm = Feed0VVManager.LJIIIZ;
        if (runnableC1601200rlm != null) {
            runnableC1601200rlm.run();
            Feed0VVManager.LJIIIZ = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dUC] */
    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final C1052140dUC LJJIII() {
        return new InterfaceC1393680mN4() { // from class: X.0dUC
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                C1052130dUB c1052130dUB = new C1052130dUB(interfaceC1392640mLO.LIZIZ());
                ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c1052130dUB, EnumC700430Rdh.POSITIVE);
                return c1052130dUB;
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                if (z && i == EnumC1430380nKG.ANCHOR_TICKETMASTER.getTYPE()) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJIIJ() {
        C1440005kM.LIZ(new C483280IxK());
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJIIJZLJL() {
        C1602700roC.LIZ.getClass();
        C0BX7.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mNB] */
    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final C1393750mNB LJJIJ() {
        return new InterfaceC1393680mN4() { // from class: X.0mNB
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                C1393840mNK c1393840mNK = new C1393840mNK(interfaceC1392640mLO.LIZIZ());
                ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c1393840mNK, EnumC700430Rdh.POSITIVE);
                return c1393840mNK;
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                if (z && i == EnumC1430380nKG.CAPCUT.getTYPE()) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final String LJJIJIIJIL() {
        C1593900ra0.LIZ.getClass();
        OutreachRecordData outreachRecordData = new OutreachRecordData("", "", "", "", "", "", "");
        C1593900ra0.LIZJ(outreachRecordData);
        if (C123100dR.LIZ(outreachRecordData.getEnterFrom())) {
            return outreachRecordData.getEnterFrom();
        }
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        String scene = outreachRecordData.getScene();
        c1584320rKY.getClass();
        return C1584320rKY.LJFF(scene);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJI() {
        return PopupManager.LJ() instanceof C747010TRz;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJIIIZ() {
        return C289760BXi.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIJJ() {
        C08TN.LIZ().LJ("feed_service_store", false);
        C08TN.LIZ().LJ("feed_service_store_step1", false);
        C849920XVu c849920XVu = C849920XVu.LIZ;
        Keva keva = C849920XVu.LIZLLL;
        c849920XVu.getClass();
        keva.storeInt(C849920XVu.LIZ("new_user_dialog_clean_cold_start_count"), keva.getInt(C849920XVu.LIZ("new_user_dialog_clean_cold_start_count"), 0) + 1);
        long j = keva.getLong(C849920XVu.LIZ("new_user_dialog_clean_first_launch_time"), 0L);
        if (j == 0) {
            keva.storeLong(C849920XVu.LIZ("new_user_dialog_clean_first_launch_time"), System.currentTimeMillis());
        } else if (j + TimeUnit.DAYS.toMillis(1L) < System.currentTimeMillis()) {
            keva.storeInt(C849920XVu.LIZ("new_user_cold_start_after_first_launch"), keva.getInt(C849920XVu.LIZ("new_user_cold_start_after_first_launch"), 0) + 1);
        }
        C08TN.LIZ().LJI("feed_service_store_step1");
        C08TN.LIZ().LJ("feed_service_store_step2", false);
        C1602700roC.LIZ.getClass();
        C1602700roC.LJ();
        C08TN.LIZ().LJI("feed_service_store_step2");
        C08TN.LIZ().LJI("feed_service_store");
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final C1389910mGz LJ(Fragment fragment) {
        C1389910mGz c1389910mGzWQ2 = ((BottomToastVM) ViewModelProviders.of(fragment).get(BottomToastVM.class)).wQ2();
        if (c1389910mGzWQ2 == null) {
            return null;
        }
        return c1389910mGzWQ2;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final long LJFF(Context context) {
        return C0WYJ.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJIIJJI(Aweme aweme) {
        boolean z;
        boolean z2;
        if (C1591860rWi.LIZIZ(aweme) && C1591860rWi.LIZJ(aweme) && !C729510SjV.LJJIJIL(aweme) && C278120AvC.LIZ(aweme) && !C10IT.LJIIJJI(aweme) && !((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C3().LJIILL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (!C1591860rWi.LIZIZ(aweme) && aweme.getVideoControl() != null && aweme.getVideoControl().showProgressBar == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIILIIL(String str) {
        C849920XVu.LIZ.getClass();
        Keva keva = C849920XVu.LIZLLL;
        String string = keva.getString("new_user_dialog_clean_first_login_sec", "");
        if (!TextUtils.isEmpty(str) && string.equals(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new_user_dialog_clean_cold_start_count");
            sbLIZ.append(str);
            int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("new_user_dialog_clean_first_launch_time");
            sbLIZ2.append(str);
            long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("new_user_cold_start_after_first_launch");
            sbLIZ3.append(str);
            int i2 = keva.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0);
            keva.storeInt("new_user_dialog_clean_cold_start_count", i);
            keva.storeLong("new_user_dialog_clean_first_launch_time", j);
            keva.storeInt("new_user_cold_start_after_first_launch", i2);
        }
        C1602700roC.LIZ.getClass();
        if (!C0BX7.LIZ()) {
            C1602700roC.LIZLLL();
            C1602700roC.LIZJ = System.currentTimeMillis();
            if (str != null) {
                Keva keva2 = C1602700roC.LIZIZ;
                String string2 = keva2.getString("nu_popup_clean_first_login_sec", "");
                if (!TextUtils.isEmpty(str) && Intrinsics.LJFF(str, string2)) {
                    int i3 = keva2.getInt(C1602700roC.LIZIZ("nu_dialog_clean_cold_start_count", str), 0);
                    int i4 = keva2.getInt(C1602700roC.LIZIZ("nu_active_day", str), 0);
                    String string3 = keva2.getString(C1602700roC.LIZIZ("nu_last_active_day", str), "");
                    long j2 = keva2.getLong(C1602700roC.LIZIZ("nu_vv_count", str), 0L);
                    float f = keva2.getFloat(C1602700roC.LIZIZ("nu_last_session_stay_time", str), 0.0f);
                    int i5 = keva2.getInt(C1602700roC.LIZIZ("nu_popup_time_window_status", str), 0);
                    int i6 = keva2.getInt(C1602700roC.LIZIZ("nu_popup_vv_window_status", str), 0);
                    keva2.storeInt("nu_dialog_clean_cold_start_count", i3);
                    keva2.storeInt("nu_active_day", i4);
                    keva2.storeString("nu_last_active_day", string3);
                    keva2.storeLong("nu_vv_count", j2);
                    keva2.storeFloat("nu_last_session_stay_time", f);
                    keva2.storeInt("nu_popup_time_window_status", i5);
                    keva2.storeInt("nu_popup_vv_window_status", i6);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIJI(Aweme aweme) {
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.setItems(Collections.singletonList(aweme));
        C587860N3w.LIZ(feedItemList);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIJJLI(List list) {
        C608450Ntj.LIZ.getClass();
        if (list != null) {
            C15O7.LIZIZ(new CallableC608440Nti(list, "homepage_follow"), C20684815ws.LJFF(), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJ(boolean z) {
        C733570Sq3.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJJIFFI(String str) {
        String str2 = str;
        C849920XVu.LIZ.getClass();
        Keva keva = C849920XVu.LIZLLL;
        String string = keva.getString("new_user_dialog_clean_first_login_sec", "");
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ().isLogin() && !TextUtils.isEmpty(str2) && (string.equals(str2) || TextUtils.isEmpty(string))) {
            int i = keva.getInt("new_user_dialog_clean_cold_start_count", 0);
            long j = keva.getLong("new_user_dialog_clean_first_launch_time", System.currentTimeMillis());
            int i2 = keva.getInt("new_user_cold_start_after_first_launch", 0);
            keva.storeInt(C849920XVu.LIZ("new_user_dialog_clean_cold_start_count"), i);
            keva.storeLong(C849920XVu.LIZ("new_user_dialog_clean_first_launch_time"), j);
            keva.storeInt(C849920XVu.LIZ("new_user_cold_start_after_first_launch"), i2);
        }
        if (TextUtils.isEmpty(keva.getString("new_user_dialog_clean_first_login_sec", ""))) {
            keva.storeString("new_user_dialog_clean_first_login_sec", str2);
        }
        C1602700roC.LIZ.getClass();
        if (!C0BX7.LIZ()) {
            if (str2 != null) {
                Keva keva2 = C1602700roC.LIZIZ;
                String string2 = keva2.getString("nu_popup_clean_first_login_sec", "");
                C0XQ7.LJ();
                if (C0XQ7.LIZ.LJIIJ().isLogin()) {
                    if (!TextUtils.isEmpty(str2) && (string2.equals(str2) || TextUtils.isEmpty(string2))) {
                        int i3 = keva2.getInt("nu_dialog_clean_cold_start_count", 0);
                        int i4 = keva2.getInt("nu_active_day", 0);
                        String string3 = keva2.getString("nu_last_active_day", "");
                        long j2 = keva2.getLong("nu_vv_count", 0L);
                        float f = keva2.getFloat("nu_last_session_stay_time", 0.0f);
                        int i5 = keva2.getInt("nu_popup_time_window_status", 0);
                        int i6 = keva2.getInt("nu_popup_vv_window_status", 0);
                        keva2.storeInt(C1602700roC.LIZIZ("nu_dialog_clean_cold_start_count", str2), i3);
                        keva2.storeInt(C1602700roC.LIZIZ("nu_active_day", str2), i4);
                        keva2.storeString(C1602700roC.LIZIZ("nu_last_active_day", str2), string3);
                        keva2.storeLong(C1602700roC.LIZIZ("nu_vv_count", str2), j2);
                        keva2.storeFloat(C1602700roC.LIZIZ("nu_last_session_stay_time", str2), f);
                        keva2.storeInt(C1602700roC.LIZIZ("nu_popup_time_window_status", str2), i5);
                        keva2.storeInt(C1602700roC.LIZIZ("nu_popup_vv_window_status", str2), i6);
                    }
                    if (!string2.equals(str2) && !TextUtils.isEmpty(string2)) {
                        C1602700roC.LJ();
                    }
                }
            }
            C1602700roC.LIZJ = System.currentTimeMillis();
            Keva keva3 = C1602700roC.LIZIZ;
            if (TextUtils.isEmpty(keva3.getString("nu_popup_clean_first_login_sec", ""))) {
                if (str2 == null) {
                    str2 = "";
                }
                keva3.storeString("nu_popup_clean_first_login_sec", str2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJII(Aweme aweme) {
        return C1616490sAR.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIIZ(AmeBaseFragment ameBaseFragment) {
        return ameBaseFragment instanceof BaseFeedListFragment;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIJIIJI(Object obj) {
        return obj instanceof FeedItemList;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJIILL(Aweme aweme, String str) {
        String aid;
        Set<String> set = C608890NuR.LIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if ((aid == null || !C608890NuR.LIZIZ.contains(aid)) && !C608890NuR.LIZLLL(aweme, str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final int LJJI(Context context, Aweme aweme) {
        boolean z;
        boolean z2;
        if (context == null) {
            return 0;
        }
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
        boolean zIsFromEffectDiscover = c2189821An6LIZ.isFromEffectDiscover();
        boolean zIsHideMusicText = c2189821An6LIZ.isHideMusicText();
        if (aweme != null) {
            z = aweme.isPaidContent;
        } else {
            z = false;
        }
        boolean z3 = !z;
        int i = BubbleListAssem.LLLI;
        boolean zLIZJ = C0ROI.LIZJ(c2189821An6LIZ, aweme, c2189821An6LIZ.isMyProfile(), c2189821An6LIZ.getPageType(), c2189821An6LIZ.getEventType());
        if (C1398490mUp.LIZ.leftStrategy == 0 && ((Number) C0BAC.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!zIsHideMusicText) {
            if (zIsFromEffectDiscover) {
                return 0;
            }
            c2189821An6LIZ.getEventType();
            if (C1398490mUp.LIZIZ(aweme, context, null) || !z3 || z2 || zLIZJ) {
                return 0;
            }
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIIZILJ(Context context, Aweme aweme, String str) {
        new C617900OLk(context, aweme, str, "click_share_button").LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final boolean LJJIIZI(Aweme aweme, String str, String str2) {
        if (str != null) {
            C1379120lza.LIZ.getClass();
            if (C1379120lza.LIZIZ(str)) {
                C1379120lza.LIZ.getClass();
                if (C1379120lza.LIZJ(aweme, str2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIIJ(Fragment fragment, String str, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super Boolean, Unit> function13) {
        if (fragment instanceof InterfaceC20658015sY) {
            PopupManager.LJIJI(new C20661615t8((InterfaceC20658015sY) fragment, null, fragment, str, function0, function1, function12, function13, 2), true);
        } else {
            PopupManager.LJIJI(new C20661615t8(C20660315sv.LL, null, fragment, str, function0, function1, function12, function13, 2), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.FeedCommonService
    public final void LJIILJJIL(C19EG c19eg, String str, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super Boolean, Unit> function13) {
        if (c19eg instanceof InterfaceC20658015sY) {
            PopupManager.LJIJI(new C20661615t8((InterfaceC20658015sY) c19eg, c19eg, null, str, function0, function1, function12, function13, 4), true);
        } else {
            PopupManager.LJIJI(new C20661615t8(C20660315sv.LL, c19eg, null, str, function0, function1, function12, function13, 4), true);
        }
    }
}
