package com.ss.android.ugc.aweme.services;

import X.C04QR;
import X.C098200Yq;
import X.C0PEM;
import X.C0UPN;
import X.C1383370m6R;
import X.C1446350nk1;
import X.C1648390szt;
import X.C1653320t7q;
import X.C1653340t7s;
import X.C1653450t83;
import X.C1653460t84;
import X.C1653500t88;
import X.C1654960tAU;
import X.C189200o6;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C274970Aq7;
import X.C277940Auu;
import X.C300070BpV;
import X.C312180CLo;
import X.C784080UpK;
import X.EnumC1647570syZ;
import X.InterfaceC1648020szI;
import X.InterfaceC1653190t7d;
import X.InterfaceC1655090tAh;
import X.InterfaceC784090UpL;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.LivePermissionApply;
import com.ss.android.ugc.aweme.LiveScenario;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import m2m.a;

/* JADX INFO: loaded from: classes26.dex */
public final class DMTBottomTabIntegrationServiceImplDiff {
    public static final DMTBottomTabIntegrationServiceImplDiff INSTANCE = new DMTBottomTabIntegrationServiceImplDiff();
    public static final C1653450t83 liveTabPopUpKeva = new C1653450t83();
    public static long startToShowLiveTabTimeStamp;

    public final void setLiveTabKeva() {
        C1653450t83 c1653450t83 = liveTabPopUpKeva;
        c1653450t83.LIZLLL(false);
        InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
        C1654960tAU.LIZLLL(false);
        String currentUserID = o.LJIIZILJ.getCurrentUserID();
        Keva keva = c1653450t83.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("never_go_live_flag_value_as_zero");
        sbLIZ.append(currentUserID);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    private final void logLiveTabNotShow(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("no_live_tab_reason", str);
        C20684815ws.LJIILLIIL("livesdk_shoot_no_live_tab_reason", c2344009Gk.LIZ);
    }

    private final void reportLiveTabNotShow(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJJJLL()) {
            logLiveTabNotShow("is_stitch_mode");
            return;
        }
        C1446350nk1.LIZ.getClass();
        if (C1446350nk1.LJFF(shortVideoContext)) {
            logLiveTabNotShow("is_from_draft_lightening");
            return;
        }
        if (C1446350nk1.LJIIIIZZ(shortVideoContext)) {
            logLiveTabNotShow("is_from_upload_lightening");
            return;
        }
        if (C1446350nk1.LJII(shortVideoContext)) {
            logLiveTabNotShow("is_from_new_photo_draft");
            return;
        }
        if (shortVideoContext.LJJLL()) {
            logLiveTabNotShow("support_duet_module");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(shortVideoContext.shootWay);
        sbLIZ.append(" not support live");
        logLiveTabNotShow(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String getInviterId(ShortVideoContext shortVideoContext) {
        boolean z;
        k kVarLJJIIZ;
        String str = shortVideoContext.liveSourceParams;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    new p();
                    n nVarLJIILIIL = p.LIZJ(shortVideoContext.liveSourceParams).LJIILIIL();
                    if (nVarLJIILIIL.LJJIJIIJIL("mt_co_host_offlive_inviter_id") && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("mt_co_host_offlive_inviter_id")) != null && !(kVarLJJIIZ instanceof m)) {
                        return kVarLJJIIZ.LJIL();
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return "";
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public final boolean showPlaybookBanner(ShortVideoContext shortVideoContext) {
        k kVarLJJIIZ;
        String str = shortVideoContext.liveSourceParams;
        if (str != null && str.length() != 0) {
            try {
                new p();
                n nVarLJIILIIL = p.LIZJ(shortVideoContext.liveSourceParams).LJIILIIL();
                if (nVarLJIILIIL.LJJIJIIJIL("show_playbook_banner") && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("show_playbook_banner")) != null && !(kVarLJJIIZ instanceof m)) {
                    return Intrinsics.LJFF(kVarLJJIIZ.LJIL(), "1");
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return false;
    }

    public final void tryShowPopupInLiveTab(C1DRG c1drg) {
        liveTabPopUpKeva.LIZLLL(true);
        InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
        C1654960tAU.LIZLLL(true);
        ((InterfaceC1648020szI) c1drg.LJII(InterfaceC1648020szI.class, null)).tryShowPopupForLiveTab();
    }

    public final int getRealLiveIndex(InterfaceC1648020szI interfaceC1648020szI, int i) {
        if (((Number) C277940Auu.LIZ.getValue()).intValue() == 2) {
            EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.RECORD_SPLIT_LIGHTENING;
            if (interfaceC1648020szI.getIndexByTag(enumC1647570syZ.getTag()) != -1) {
                return interfaceC1648020szI.getIndexByTag(enumC1647570syZ.getTag());
            }
            return i;
        }
        return i;
    }

    public final void requestLiveStreamingPermission(final C1DRG c1drg, final C1648390szt c1648390szt) {
        InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
        InterfaceC784090UpL interfaceC784090UpL = new InterfaceC784090UpL() { // from class: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff.requestLiveStreamingPermission.1
            @Override // X.InterfaceC784090UpL
            public void onFailed(Throwable th) {
                if (DMTBottomTabIntegrationServiceImplDiff.liveTabPopUpKeva.LIZJ()) {
                    DMTBottomTabIntegrationServiceImplDiff.INSTANCE.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, -2, false);
                }
            }

            public void onSuccess(boolean z, LiveScenario liveScenario, LivePermissionApply livePermissionApply, boolean z2, boolean z3, Map<String, String> map) {
                C312180CLo.LIZIZ(z);
                if (z) {
                    C1653500t88.LIZ = 3;
                    InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) c1drg.LJII(InterfaceC1648020szI.class, null);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addLiveTabInternal:");
                    sbLIZ.append(interfaceC1648020szI.isValid());
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (!interfaceC1648020szI.isValid()) {
                        DMTBottomTabIntegrationServiceImplDiff.INSTANCE.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, -7, false);
                        return;
                    }
                    C1653340t7s.LIZ = z3 ? 1 : 0;
                    C1653340t7s.LJFF.putAll(map);
                    DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff = DMTBottomTabIntegrationServiceImplDiff.INSTANCE;
                    String inviterId = dMTBottomTabIntegrationServiceImplDiff.getInviterId(c1648390szt.LIZIZ);
                    boolean zShowPlaybookBanner = dMTBottomTabIntegrationServiceImplDiff.showPlaybookBanner(c1648390szt.LIZIZ);
                    boolean zAddLiveTab = dMTBottomTabIntegrationServiceImplDiff.addLiveTab(interfaceC1648020szI, c1drg, z2, c1648390szt.LJ, inviterId, zShowPlaybookBanner);
                    o.LJIILL.getClass();
                    if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LIZ() && !zAddLiveTab) {
                        InterfaceC1655090tAh interfaceC1655090tAh2 = o.LJIILL;
                        C1654960tAU.LIZJ(inviterId, zShowPlaybookBanner, null);
                    }
                    o.LJIILL.getClass();
                    if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIIIZ()) {
                        dMTBottomTabIntegrationServiceImplDiff.setLiveTabKeva();
                        return;
                    } else {
                        if (!zAddLiveTab) {
                            dMTBottomTabIntegrationServiceImplDiff.tryShowPopupInLiveTab(c1drg);
                            return;
                        }
                        return;
                    }
                }
                DMTBottomTabIntegrationServiceImplDiff.INSTANCE.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - DMTBottomTabIntegrationServiceImplDiff.startToShowLiveTabTimeStamp, -1, z2);
            }

            @Override // X.InterfaceC784090UpL
            public /* bridge */ /* synthetic */ void onSuccess(Boolean bool, LiveScenario liveScenario, LivePermissionApply livePermissionApply, Boolean bool2, Boolean bool3, Map map) {
                onSuccess(bool.booleanValue(), liveScenario, livePermissionApply, bool2.booleanValue(), bool3.booleanValue(), (Map<String, String>) map);
            }
        };
        String str = C1653340t7s.LIZIZ;
        interfaceC1655090tAh.getClass();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIILIIL(new C784080UpK(interfaceC784090UpL), "shoot", str, null);
    }

    private final void tryShowPopupForLiveWhenFirstTimeInternal(final C1DRG c1drg, String str, boolean z) {
        InterfaceC1655090tAh interfaceC1655090tAh = o.LJIILL;
        C1654960tAU.LIZJ(str, z, new C0UPN() { // from class: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff.tryShowPopupForLiveWhenFirstTimeInternal.1
            @Override // X.C0UPN
            public void onFailed(Throwable th) {
            }

            @Override // X.C0UPN
            public void onSuccess(Integer num) {
                if (num != null && num.intValue() == 1) {
                    DMTBottomTabIntegrationServiceImplDiff.INSTANCE.tryShowPopupInLiveTab(c1drg);
                } else {
                    DMTBottomTabIntegrationServiceImplDiff.INSTANCE.setLiveTabKeva();
                }
            }
        });
    }

    public final List<InterfaceC1653190t7d> addLiveModule(C1DRG c1drg, List<InterfaceC1653190t7d> list, C1648390szt c1648390szt) {
        startToShowLiveTabTimeStamp = SystemClock.elapsedRealtime();
        String str = c1648390szt.LIZIZ.shootWay;
        if (str == null) {
            str = "";
        }
        C1653340t7s.LIZIZ = str;
        if (((Boolean) C274970Aq7.LIZ.getValue()).booleanValue() && !C04QR.LIZ(C1383370m6R.LJIILIIL(), true)) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff.logLiveTabNotShow("lyrax_plugin_not_ready");
            dMTBottomTabIntegrationServiceImplDiff.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, -12, false);
            C1653320t7q.LIZ.getClass();
            C1653320t7q.LIZ(213, "addLiveModule");
            return list;
        }
        if (o.LJIIZILJ.LIZ()) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff2 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff2.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, -5, false);
            dMTBottomTabIntegrationServiceImplDiff2.logLiveTabNotShow("child_model_not_show");
            C1653320t7q.LIZ.getClass();
            C1653320t7q.LIZ(201, "addLiveModule");
            return list;
        }
        o.LJIILL.getClass();
        if (!AVServiceProxyImpl.needLiveInRecordInner()) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff3 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff3.logLiveTabNotShow("not_login_or_x86");
            dMTBottomTabIntegrationServiceImplDiff3.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, -8, false);
            C1653320t7q.LIZ.getClass();
            C1653320t7q.LIZ(202, "addLiveModule");
            return list;
        }
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4() == null) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff4 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff4.logLiveTabNotShow("live_is_null");
            dMTBottomTabIntegrationServiceImplDiff4.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, -9, false);
            C1653320t7q.LIZ.getClass();
            C1653320t7q.LIZ(203, "addLiveModule");
            return list;
        }
        int i = c1648390szt.LIZIZ.tabs;
        if (i != 0 && (i & 8) != 8) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff5 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff5.logLiveTabNotShow("no_live_mask");
            dMTBottomTabIntegrationServiceImplDiff5.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, -10, false);
            C1653320t7q.LIZ.getClass();
            C1653320t7q.LIZ(204, "addLiveModule");
            return list;
        }
        if (!c1648390szt.LIZ.invoke().booleanValue()) {
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff6 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff6.reportLiveTabNotShow(c1648390szt.LIZIZ);
            dMTBottomTabIntegrationServiceImplDiff6.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, -11, false);
            C1653320t7q.LIZ.getClass();
            C1653320t7q.LIZ(205, "addLiveModule");
            C312180CLo.LIZIZ(false);
            return list;
        }
        if (!C1653460t84.LIZ() && c1648390szt.LIZIZ.onlyShowLiveTab) {
            C1653500t88.LIZ = 0;
            if (c1648390szt.LIZ.invoke().booleanValue() && !c1648390szt.LIZIZ.onlyShowLiveTab) {
                C1653500t88.LIZ = 1;
            }
            if (!c1648390szt.LIZ.invoke().booleanValue() && c1648390szt.LIZIZ.onlyShowLiveTab) {
                C1653500t88.LIZ = 2;
            }
            list.add(new a(c1drg));
            DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff7 = INSTANCE;
            dMTBottomTabIntegrationServiceImplDiff7.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, 1, false);
            if (!liveTabPopUpKeva.LIZ()) {
                dMTBottomTabIntegrationServiceImplDiff7.tryShowPopupForLiveWhenFirstTimeInternal(c1drg, dMTBottomTabIntegrationServiceImplDiff7.getInviterId(c1648390szt.LIZIZ), dMTBottomTabIntegrationServiceImplDiff7.showPlaybookBanner(c1648390szt.LIZIZ));
            }
            o.LJIILL.getClass();
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIIL();
            return list;
        }
        if (C300070BpV.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$2(c1drg, c1648390szt, null), 3);
            return list;
        }
        INSTANCE.requestLiveStreamingPermission(c1drg, c1648390szt);
        return list;
    }

    public final void logGoLiveTabShowMetric(long j, int i, boolean z) {
        if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZLLL(0.1d, "livesdk_go_live_tab_show_performance")) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZJ(i, "show_status_code");
        c2344009Gk.LJ(Boolean.valueOf(z), "show_from_retry_podcast");
        C20684815ws.LJIILLIIL("livesdk_go_live_tab_show_performance", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean addLiveTabInNeedChangeTab(final X.InterfaceC1648020szI r13, final kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r14, final X.C1DRG r15, final boolean r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff.addLiveTabInNeedChangeTab(X.0szI, kotlin.jvm.functions.Function1, X.1DRG, boolean, java.lang.String, boolean):boolean");
    }

    public final boolean addLiveTab(InterfaceC1648020szI interfaceC1648020szI, C1DRG c1drg, boolean z, Function1<? super Integer, Integer> function1, String str, boolean z2) {
        if (C1653460t84.LIZ()) {
            return addLiveTabInNeedChangeTab(interfaceC1648020szI, function1, c1drg, z, str, z2);
        }
        String currentBottomTag = interfaceC1648020szI.getCurrentBottomTag();
        DMTBottomTabIntegrationServiceImplDiff dMTBottomTabIntegrationServiceImplDiff = INSTANCE;
        interfaceC1648020szI.addLiveBottomTab(dMTBottomTabIntegrationServiceImplDiff.getRealLiveIndex(interfaceC1648020szI, function1.invoke(Integer.valueOf(interfaceC1648020szI.bottomTabSize())).intValue()), new a(c1drg), 0);
        interfaceC1648020szI.resetToCurTab(currentBottomTag);
        dMTBottomTabIntegrationServiceImplDiff.logGoLiveTabShowMetric(SystemClock.elapsedRealtime() - startToShowLiveTabTimeStamp, 1, z);
        return false;
    }
}
