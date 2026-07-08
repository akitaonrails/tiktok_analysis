package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh;

import X.C01GW;
import X.C03H5;
import X.C0AIM;
import X.C0HTT;
import X.C0QSJ;
import X.C0R9L;
import X.C0RF0;
import X.C0RF2;
import X.C0RJN;
import X.C0SDF;
import X.C0SDJ;
import X.C0SDL;
import X.C0SDM;
import X.C0SDN;
import X.C0SDP;
import X.C0T1R;
import X.C1196320hEk;
import X.C1261804wi;
import X.C13LE;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1558420qem;
import X.C1558520qew;
import X.C1587740rQ4;
import X.C19719912Dl;
import X.C2189821An6;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C690430R6j;
import X.C690630R7d;
import X.C690870R8b;
import X.C692910RFx;
import X.C705700RmC;
import X.C723830SaL;
import X.C723850SaN;
import X.C737910Sx3;
import X.EnumC21696919vj;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1361290lWp;
import X.InterfaceC1473950oSX;
import X.InterfaceC1582750rI1;
import X.InterfaceC1588310rQz;
import X.InterfaceC1588320rR0;
import X.InterfaceC1891350zJl;
import X.InterfaceC21699619wA;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC690460R6m;
import X.InterfaceC713360RyY;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3SharedElementSourceAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.IFriendsV3VHAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LegacyAbility;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FriendsV3BaseAwemeCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, T extends InterfaceC1361290lWp> extends AssemPowerCell<ASSEM, T> implements InterfaceC713360RyY, InterfaceC1588310rQz, InterfaceC1582750rI1, CommonCellAbility, InterfaceC21699619wA, IFriendsV3VHAbility, C0QSJ, InterfaceC1146704e9 {
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(117));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS555S0100000_11((FriendsV3BaseAwemeCell) this, 487));
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS555S0100000_11((FriendsV3BaseAwemeCell) this, 485));
    public final C630740Ooa LLJI = C628500Oky.LIZ(new AwS555S0100000_11((FriendsV3BaseAwemeCell) this, 484));
    public final C630740Ooa LLJIJIL = C628500Oky.LIZ(new AwS555S0100000_11((FriendsV3BaseAwemeCell) this, 486));
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // X.InterfaceC1588310rQz
    public final InterfaceC1582750rI1 LLIZLLLIL() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.IFriendsV3VHAbility
    public final FriendsV3BaseAwemeCell SJ1() {
        return this;
    }

    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommonVideoCellScope.class});
    }

    public Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    public void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    public void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLIZLLLIL.getValue();
    }

    public final FriendsV3CellPlayHostAbility R5() {
        return (FriendsV3CellPlayHostAbility) this.LLJI.getValue();
    }

    public final VideoPlayViewModel S5() {
        return (VideoPlayViewModel) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    public FriendsV3BaseAwemeCell() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoPlayViewModel.class);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(287);
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LLJILJIL = C737910Sx3.LIZLLL(this, c19719912DlLIZ, aFwS243S0000000_11, enumC452301pR);
        this.LLJILJILJ = C737910Sx3.LIZLLL(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(288), enumC452301pR);
        this.LLJILLL = C737910Sx3.LIZLLL(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS243S0000000_11.get$arr$(289), enumC452301pR);
    }

    @Override // X.InterfaceC1582750rI1
    public final boolean E6() {
        FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbilityR5 = R5();
        return friendsV3CellPlayHostAbilityR5 != null && friendsV3CellPlayHostAbilityR5.E6();
    }

    @Override // X.InterfaceC1588310rQz
    public final View W8() {
        FriendsV3SharedElementSourceAbility friendsV3SharedElementSourceAbility = (FriendsV3SharedElementSourceAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), FriendsV3SharedElementSourceAbility.class, null);
        if (friendsV3SharedElementSourceAbility != null) {
            return friendsV3SharedElementSourceAbility.W8();
        }
        return null;
    }

    @Override // X.InterfaceC1588310rQz
    public final InterfaceC1588320rR0 Z0() {
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558420qem.LIZIZ(this), FriendsV3SharedElementSourceAbility.class, null);
        if (interfaceC494301wDLIZ instanceof InterfaceC1588320rR0) {
            return (InterfaceC1588320rR0) interfaceC494301wDLIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1582750rI1
    public final void bk() {
        FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbilityR5 = R5();
        if (friendsV3CellPlayHostAbilityR5 != null) {
            friendsV3CellPlayHostAbilityR5.bk();
        }
    }

    @Override // X.InterfaceC1582750rI1, X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbilityR5 = R5();
        if (friendsV3CellPlayHostAbilityR5 != null) {
            return friendsV3CellPlayHostAbilityR5.M4();
        }
        return null;
    }

    @Override // X.InterfaceC1582750rI1, X.InterfaceC1483820oiS
    public final Surface getSurface() {
        FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbilityR5 = R5();
        if (friendsV3CellPlayHostAbilityR5 != null) {
            return friendsV3CellPlayHostAbilityR5.getSurface();
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, CommonCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IFriendsV3VHAbility.class, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        if (((Number) C0AIM.LIZ.getValue()).intValue() == 1) {
            Boolean bool = Boolean.FALSE;
            LLJJ(new C0SDJ(bool, bool, bool, EnumC21696919vj.ON_DETACHED));
        }
    }

    @Override // X.InterfaceC1588310rQz
    public final int y2() {
        return getBindingAdapterPosition();
    }

    public C0SDF ed() {
        return C0SDF.NONE;
    }

    @Override // X.InterfaceC1582750rI1
    public final void Hh(AwS107S1200000_24 awS107S1200000_24) {
        FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbilityR5 = R5();
        if (friendsV3CellPlayHostAbilityR5 != null) {
            friendsV3CellPlayHostAbilityR5.Hh(awS107S1200000_24);
        }
    }

    @Override // X.InterfaceC1588310rQz
    public final void LLJJ(C0SDJ c0sdj) {
        Boolean bool = ((C0SDJ) ((AssemViewModel) this.LLJILLL.getValue()).getState()).LL;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJILLL.getValue();
        if (!Intrinsics.LJFF(assemViewModel.getState(), c0sdj)) {
            assemViewModel.setStateImmediate(new AwS590S0100000_11(c0sdj, 13));
        }
        Boolean bool2 = c0sdj.LL;
        if (Intrinsics.LJFF(bool2, bool)) {
            return;
        }
        String aid = null;
        if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
            ((VideoViewModel) this.LLJILJILJ.getValue()).BQ2(getAdapterPosition(), null);
            S5().yQ2(true);
        } else {
            if (!Intrinsics.LJFF(bool2, Boolean.FALSE)) {
                return;
            }
            S5().zQ2();
            VideoViewModel videoViewModel = (VideoViewModel) this.LLJILJILJ.getValue();
            Aweme aweme = getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            }
            videoViewModel.CQ2(aid, true);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        VideoItemParams videoItemParams;
        T item = getItem();
        if ((item instanceof VideoItemParams) && (videoItemParams = (VideoItemParams) item) != null) {
            videoItemParams.currentPosition = getAdapterPosition();
            C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
            c1587740rQ4.getClass();
            if (!C1587740rQ4.LJIJI) {
                C1587740rQ4.LJJI = videoItemParams.getAweme();
                C1587740rQ4.LJIILIIL = SystemClock.elapsedRealtime() - C1587740rQ4.LIZJ;
                C1587740rQ4.LJI(c1587740rQ4, C0SDP.FEED_LIST, false, null, 6);
            }
        }
        super.onBindItemView(t);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView;
        C2189821An6 c2189821An6;
        int pageType;
        C0HTT c0httDA0;
        C0R9L c0r9lSz2;
        C2189821An6 c2189821An62;
        C2189821An6 c2189821An63;
        if (C1261804wi.LIZ()) {
            this.LL = C705700RmC.LIZIZ(viewGroup.getContext(), ((ReusedUISlotAssem) NG1()).Oo(), viewGroup, false, false, 52);
            Sl0(LJJIJL(), this);
            viewOnCreateItemView = LJJIJL();
        } else {
            viewOnCreateItemView = super.onCreateItemView(viewGroup);
        }
        BaseFeedPageParams baseFeedPageParamsNewBuilder = BaseFeedPageParams.Companion.newBuilder();
        baseFeedPageParamsNewBuilder.setAwemeFromPage(C0T1R.LIZIZ(getActivity(), getCurrentFragment()));
        C0RJN c0rjn = (C0RJN) this.LLJIJIL.getValue();
        String eventType = null;
        if (c0rjn != null && (c2189821An63 = c0rjn.LIZJ) != null) {
            eventType = c2189821An63.getEventType();
        }
        baseFeedPageParamsNewBuilder.setEventType(eventType);
        C0RJN c0rjn2 = (C0RJN) this.LLJIJIL.getValue();
        if (c0rjn2 == null || (c2189821An6 = c0rjn2.LIZJ) == null) {
            c2189821An6 = new C2189821An6();
        }
        baseFeedPageParamsNewBuilder.setParam(c2189821An6);
        C0RJN c0rjn3 = (C0RJN) this.LLJIJIL.getValue();
        if (c0rjn3 != null && (c2189821An62 = c0rjn3.LIZJ) != null) {
            pageType = c2189821An62.getPageType();
        } else {
            pageType = 0;
        }
        baseFeedPageParamsNewBuilder.setPageType(pageType);
        C690870R8b c690870R8b = new C690870R8b();
        c690870R8b.LIZIZ = gq();
        FriendsV3LegacyAbility friendsV3LegacyAbility = (FriendsV3LegacyAbility) this.LLJ.getValue();
        if (friendsV3LegacyAbility == null || (c0httDA0 = friendsV3LegacyAbility.DA0()) == null) {
            c0httDA0 = new C0HTT() { // from class: X.0RUf
                @Override // X.C0HTT
                public final /* bridge */ /* synthetic */ void LLIIL(Object obj) {
                }
            };
        }
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            currentFragment = new Fragment();
        }
        C0SDL c0sdl = new View.OnTouchListener() { // from class: X.0SDL
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        };
        FriendsV3LegacyAbility friendsV3LegacyAbility2 = (FriendsV3LegacyAbility) this.LLJ.getValue();
        if (friendsV3LegacyAbility2 == null || (c0r9lSz2 = friendsV3LegacyAbility2.sz2()) == null) {
            c0r9lSz2 = new C0R9L() { // from class: X.0SDK
                @Override // X.C0R9L
                public final void Y2(Aweme aweme, boolean z, boolean z2) {
                }

                @Override // X.C0R9L
                public final void handleDoubleClick(MotionEvent motionEvent) {
                }

                @Override // X.C0R9L
                public final void nk(boolean z) {
                }

                @Override // X.C0R9L
                public final C583170Mu3 ok() {
                    return null;
                }

                @Override // X.C0R9L
                public final void z() {
                }
            };
        }
        C692910RFx c692910RFx = new C692910RFx();
        C0SDM c0sdm = new View.OnTouchListener() { // from class: X.0SDM
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        };
        C0SDN c0sdn = new InterfaceC690460R6m() { // from class: X.0SDN
            @Override // X.InterfaceC690460R6m
            public final void LIZ(float f, float f2) {
            }
        };
        String str = baseFeedPageParamsNewBuilder.eventType;
        if (str == null) {
            str = "";
        }
        View view = viewOnCreateItemView;
        c690870R8b.LIZLLL = new C0RF0(view, c0httDA0, currentFragment, c0sdl, baseFeedPageParamsNewBuilder, c0r9lSz2, c692910RFx, c0sdm, c0sdn, str, baseFeedPageParamsNewBuilder.pageType, System.currentTimeMillis(), null, null, 0, new C0RF2<VideoBaseCell, VideoItemParams>() { // from class: X.0RF1
            @Override // X.C0RF2
            public final void LIZIZ(InterfaceC1587906Jp interfaceC1587906Jp, C0SMO<?, ?> c0smo, int i, List<? extends Object> list) {
            }
        }, new LinkedHashMap(), Integer.valueOf(getAdapterPosition()), 28672);
        c690870R8b.LJ = baseFeedPageParamsNewBuilder;
        C690430R6j c690430R6j = new C690430R6j(c690870R8b);
        C723850SaN.LJ(this, new AwS377S0200000_11((FriendsV3BaseAwemeCell) this, (FriendsV3BaseAwemeCell<ReusedUISlotAssem<? extends C03H5>, InterfaceC1361290lWp>) c690430R6j, (C690430R6j) 180));
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        C723830SaL.LIZ(reusedUIAssemNG1, null, new AwS377S0200000_11((ReusedUIAssem) reusedUIAssemNG1, (ReusedUIAssem<?>) c690430R6j, (C690430R6j) 181));
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CommonCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IFriendsV3VHAbility.class, null, null);
        return view;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        getAdapterPosition();
        P5(interfaceC1891350zJl);
    }

    @Override // X.InterfaceC21699619wA
    public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        S5().wQ2();
    }

    @Override // X.InterfaceC21699619wA
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
        FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbilityR5 = R5();
        if (friendsV3CellPlayHostAbilityR5 != null) {
            friendsV3CellPlayHostAbilityR5.onPlaying(str, c1480430ocz);
        }
    }

    @Override // X.InterfaceC21699619wA
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        S5().LJJIJIIJI(str);
    }

    @Override // X.InterfaceC21699619wA
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        S5().onResumePlay(str);
    }

    @Override // X.InterfaceC21699619wA
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbilityR5 = R5();
        if (friendsV3CellPlayHostAbilityR5 != null) {
            friendsV3CellPlayHostAbilityR5.onPlayFailed(str, c1481290oeN, c1480430ocz);
        }
    }

    @Override // X.InterfaceC21699619wA
    public final void onPlayProgressChange(String str, long j, long j2) {
        VideoPlayViewModel videoPlayViewModelS5 = S5();
        videoPlayViewModelS5.getClass();
        videoPlayViewModelS5.setState(new C690630R7d(j / 1000.0f));
    }
}
