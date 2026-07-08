package com.ss.android.ugc.aweme;

import X.C00AW;
import X.C01GW;
import X.C0J3A;
import X.C0XPD;
import X.C1209980ham;
import X.C1361050lWR;
import X.C1361160lWc;
import X.C1383760m74;
import X.C1387310mCn;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1591860rWi;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C2547409ya;
import X.C418440Gaw;
import X.C452501pT;
import X.C622680Oba;
import X.C692470REf;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C726210SeB;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7836034g;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC255700yp;
import X.EnumC726190Se9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC726170Se7;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.DanmakuProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuCreateEntranceAssem extends BaseCellSlotComponent<DanmakuCreateEntranceAssem> implements InterfaceC726170Se7, DanmakuProtocol, DanmakuEntranceAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public EnumC726190Se9 LLLF;
    public final C01GW LLLFF;
    public boolean LLLFFI;
    public final AwS565S0100000_21 LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuCreateEntranceAssem.class, "danmakuVM", "getDanmakuVM()Lcom/ss/android/ugc/aweme/core/DanmakuViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DanmakuCreateEntranceAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 79), null, AFwS259S0000000_21.get$arr$(35));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(36));
        this.LLJZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 76));
        this.LLLF = EnumC726190Se9.HIDE;
        this.LLLFF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 77));
        this.LLLFFI = true;
        this.LLLFZ = new AwS565S0100000_21(this, 78);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.biz;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -49398551) {
            return null;
        }
        return this;
    }

    public final DanmakuContinuallyPlayViewModel Bp() {
        return (DanmakuContinuallyPlayViewModel) this.LLLFF.getValue();
    }

    public final DanmakuViewModel Ep() {
        return (DanmakuViewModel) this.LLJLLIL.getValue(this, LLLI[0]);
    }

    @Override // X.InterfaceC726170Se7
    public final boolean M9() {
        C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        return c1383760m74.LJJIIJZLJL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
    }

    @Override // com.ss.android.ugc.aweme.DanmakuEntranceAbility
    public final boolean cO2() {
        return this.LLLF == EnumC726190Se9.SHOW_FULL_ENTRANCE;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        DanmakuCompatibleReportAndLoginViewModel danmakuCompatibleReportAndLoginViewModel = (DanmakuCompatibleReportAndLoginViewModel) this.LLJZ.getValue();
        if (danmakuCompatibleReportAndLoginViewModel == null || !danmakuCompatibleReportAndLoginViewModel.LLILLL) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        String str = danmakuCompatibleReportAndLoginViewModel.LLILZLL;
        if (str == null) {
            str = "";
        }
        String str2 = danmakuCompatibleReportAndLoginViewModel.LLIZ;
        C0XPD.LIZIZ(c19egLIZ, str, str2 != null ? str2 : "", danmakuCompatibleReportAndLoginViewModel.LLIZLLLIL, null);
        danmakuCompatibleReportAndLoginViewModel.LL = null;
        danmakuCompatibleReportAndLoginViewModel.LLILLJJLI = false;
        danmakuCompatibleReportAndLoginViewModel.LLILLL = false;
        danmakuCompatibleReportAndLoginViewModel.LLILZ = null;
        danmakuCompatibleReportAndLoginViewModel.LLILZIL = null;
        danmakuCompatibleReportAndLoginViewModel.LLILZLL = null;
        danmakuCompatibleReportAndLoginViewModel.LLIZ = null;
        danmakuCompatibleReportAndLoginViewModel.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC726170Se7
    public final void rl() {
        int i;
        C1361050lWR.LIZ.getClass();
        if (!C1361160lWc.LIZ() || C1361050lWR.LIZIZ) {
            return;
        }
        C1361050lWR.LIZIZ = true;
        if (C1387310mCn.LJFF(C1361160lWc.LIZIZ().getLong("danmaku_last_active_timestamp", -1L)) || (i = C1361160lWc.LIZIZ().getInt("danmaku_active_day_count_number", 0)) > C2547409ya.LIZ) {
            return;
        }
        C1361160lWc.LIZIZ().storeInt("danmaku_active_day_count_number", i + 1);
        C1361160lWc.LIZIZ().storeLong("danmaku_last_active_timestamp", System.currentTimeMillis());
    }

    @Override // X.InterfaceC726170Se7
    public final boolean xd() {
        C1361050lWR.LIZ.getClass();
        return C1361050lWR.LIZIZ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        Ep().CQ2(true, false, null, null);
        if (C692470REf.LIZ()) {
            return;
        }
        Ep().EQ2(EnumC255700yp.IS_NOT_LANDSCAPE);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DanmakuProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Ep().unBind();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC726170Se7
    public final C00AW getPriority() {
        return C00AW.DANMAKU;
    }

    public final void Fp(boolean z) {
        Aweme aweme;
        Object obj;
        VideoItemParams item;
        Aweme aweme2;
        C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
        VideoItemParams item2 = Ep().getItem();
        Object obj2 = null;
        if (item2 != null) {
            aweme = item2.getAweme();
        } else {
            aweme = null;
        }
        if (!c1383760m74.LJJIFFI(aweme)) {
            return;
        }
        if (z || !C1361160lWc.LIZJ() || ((item = Ep().getItem()) != null && (aweme2 = item.getAweme()) != null && aweme2.isHasDanmaku())) {
            if (c1383760m74.LJJIIZ() && !z) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                if (((VideoItemParams) obj).currentPosition <= 0) {
                    if (c724270Sb3 != null) {
                        obj2 = c724270Sb3.LL;
                    }
                    if (Intrinsics.LJFF(((VideoItemParams) obj2).mEventType, "homepage_hot")) {
                        new SafeHandler(C724240Sb0.LJI(this)).postDelayed(new ARunnableS121S0100000_21(this, 16), Mp4ScreenVideoLoadTimeout.CONTROL);
                        return;
                    }
                }
            }
            DanmakuViewModel danmakuViewModelEp = Ep();
            danmakuViewModelEp.getClass();
            danmakuViewModelEp.setState(AFwS259S0000000_21.get$arr$(319));
        }
    }

    @Override // X.InterfaceC726170Se7
    public final void f6(EnumC726190Se9 enumC726190Se9) {
        int i = C726210SeB.LIZ[enumC726190Se9.ordinal()];
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                if (i == 3) {
                    View view = this.LLJZIJLIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    View view2 = this.LLL;
                    if (view2 != null) {
                        C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), view2);
                    }
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                    DanmakuContinuallyPlayViewModel danmakuContinuallyPlayViewModelBp = Bp();
                    if (danmakuContinuallyPlayViewModelBp != null) {
                        z = danmakuContinuallyPlayViewModelBp.LLJIJIL;
                    }
                    Fp(z);
                } else {
                    throw new C1954807lC();
                }
            } else {
                View view3 = this.LLJZIJLIL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
                View view4 = this.LLL;
                if (view4 != null) {
                    C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view4);
                }
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                DanmakuContinuallyPlayViewModel danmakuContinuallyPlayViewModelBp2 = Bp();
                if (danmakuContinuallyPlayViewModelBp2 != null) {
                    z = danmakuContinuallyPlayViewModelBp2.LLJIJIL;
                }
                Fp(z);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
        this.LLLF = enumC726190Se9;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onChangeVideoDanmakuPrivacy(C1209980ham c1209980ham) {
        Object obj;
        Context context;
        Activity activityLIZJ;
        if (c1209980ham.LIZ != 8) {
            return;
        }
        String aid = c1209980ham.LIZJ.getAid();
        boolean z = true;
        if (aid != null && aid.length() != 0) {
            String aid2 = c1209980ham.LIZJ.getAid();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(aid2, ((VideoItemParams) obj).getAweme().getAid()) && (context = getContext()) != null && (activityLIZJ = C0J3A.LIZJ(context)) != null) {
                int iIdentityHashCode = System.identityHashCode(activityLIZJ);
                Integer num = c1209980ham.LIZLLL;
                if (num != null && iIdentityHashCode == num.intValue()) {
                    if (c1209980ham.LIZJ.getCommentSetting() != 3) {
                        if (!C1361160lWc.LIZ()) {
                            return;
                        }
                    } else {
                        z = false;
                    }
                    List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), DanmakuProtocol.class, false);
                    if (listLIZIZ == null) {
                        return;
                    }
                    for (DanmakuProtocol danmakuProtocol : (ArrayList) listLIZIZ) {
                        if (danmakuProtocol != null) {
                            danmakuProtocol.xn1(z);
                        }
                    }
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDanmakuEntranceToggle(C7836034g c7836034g) {
        List<DanmakuProtocol> listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), DanmakuProtocol.class, false);
        if (listLIZIZ != null) {
            for (DanmakuProtocol danmakuProtocol : listLIZIZ) {
                if (danmakuProtocol != null) {
                    danmakuProtocol.xn1(c7836034g.LIZ);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJZIJLIL = view.findViewById(R.id.ff3);
        View viewFindViewById = view.findViewById(R.id.ff2);
        this.LLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 64), viewFindViewById);
        }
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0lWW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(92), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nyr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(36), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0RCC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, AFwS305S0000000_21.get$arr$(39), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nkk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS305S0000000_21.get$arr$(41), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        Ep().vQ2(videoItemParams);
        this.LLLFFI = true;
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeEntrancesControlAbility.class, null);
        if (landscapeEntrancesControlAbility != null) {
            landscapeEntrancesControlAbility.nU(this);
        }
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.service.DanmakuProtocol
    public final void xn1(boolean z) {
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeEntrancesControlAbility.class, null);
        if (landscapeEntrancesControlAbility != null) {
            landscapeEntrancesControlAbility.nU(null);
        }
    }
}
