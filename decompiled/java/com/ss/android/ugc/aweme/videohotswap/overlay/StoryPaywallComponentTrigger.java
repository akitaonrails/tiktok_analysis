package com.ss.android.ugc.aweme.videohotswap.overlay;

import X.C013C;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0K77;
import X.C0RUJ;
import X.C0S80;
import X.C0S82;
import X.C0S84;
import X.C0S85;
import X.C0S87;
import X.C0S88;
import X.C0S8S;
import X.C0SR4;
import X.C0SUC;
import X.C13IQ;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C189200o6;
import X.C2217381BqS;
import X.C23250099c;
import X.C2450509ix;
import X.C296970BkV;
import X.C337180DJs;
import X.C356901a3;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C716310S7x;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC445610Hdf;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryPaywallComponentTrigger extends BaseCellTriggerComponent<StoryPaywallComponentTrigger> implements ComponentPriorityProtocol, InterfaceC445610Hdf, C0RUJ {
    public static final C01GW<IPaidContentVideoHotSwapService> LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(246));

    public static final class StoryPaywallCellOverlayComponent extends BaseCellSlotComponent<StoryPaywallCellOverlayComponent> implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public static final /* synthetic */ int LLLIIL = 0;
        public C0S8S LLJZ;
        public boolean LLJZIJLIL;
        public boolean LLL;
        public boolean LLLF;
        public String LLLFF;
        public String LLLFFI;
        public boolean LLLFZ;
        public boolean LLLI;
        public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(245));
        public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(551));
        public final C01GW LLLII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1156));
        public final C630740Ooa LLLIIII = C628500Oky.LIZ(new AwS555S0100000_11(this, 1157));
        public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1155));
        public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1149));

        @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
        public final void mo() {
            this.LLJZIJLIL = true;
            Ep("onActive");
            super.mo();
            if (this.LLJJJJJIL != null) {
                try {
                    C337180DJs.LIZJ(getContentView());
                    Gp(true);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
        public final void oo() {
            C0S87<Object> c0s87;
            this.LLJZIJLIL = false;
            this.LLL = false;
            this.LLLF = false;
            this.LLLFF = null;
            this.LLLFFI = null;
            this.LLLFZ = false;
            this.LLLI = false;
            C0S8S c0s8s = this.LLJZ;
            if (c0s8s != null && (c0s87 = c0s8s.LJ) != null) {
                c0s87.g2();
            }
            if (this.LLJJJJJIL != null) {
                try {
                    C337180DJs.LIZ(getContentView());
                    Gp(false);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            super.oo();
        }

        public final IFeedPanelPlatformAbility Bp() {
            return (IFeedPanelPlatformAbility) this.LLLIIIIL.getValue();
        }

        public final Aweme LJIIIIZZ() {
            C724270Sb3 c724270Sb3 = this.LLJI;
            return ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        }

        @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
        public final int Oo() {
            C01GW<IPaidContentVideoHotSwapService> c01gw = StoryPaywallComponentTrigger.LLJJLIIIJLLLLLLLZ;
            IPaidContentVideoHotSwapService iPaidContentVideoHotSwapServiceLIZ = C716310S7x.LIZ();
            if (iPaidContentVideoHotSwapServiceLIZ == null) {
                return -1;
            }
            iPaidContentVideoHotSwapServiceLIZ.LJIIJJI();
            return R.layout.dss;
        }

        @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
        public final void ep() {
            Ep("onHostResume");
        }

        public final void Fp() {
            IPlayerComponentAbility iPlayerComponentAbilityX32;
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBp = Bp();
            if (iFeedPanelPlatformAbilityBp == null || (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityBp.x32()) == null) {
                return;
            }
            iPlayerComponentAbilityX32.LLLLLLLLLL();
        }

        public final void Ep(String str) {
            C0SR4 c0sr4LJJLIIIJL;
            List<Aweme> listLJJJLZIJ;
            String strCY1;
            String from;
            IAdapterAbility iAdapterAbility = (IAdapterAbility) this.LLLIIII.getValue();
            if (iAdapterAbility != null && (c0sr4LJJLIIIJL = iAdapterAbility.LJJLIIIJL()) != null && (listLJJJLZIJ = c0sr4LJJLIIIJL.LJJJLZIJ()) != null) {
                Aweme awemeLJIIIIZZ = LJIIIIZZ();
                Iterator<Aweme> it2 = listLJJJLZIJ.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getAid(), awemeLJIIIIZZ.getAid())) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (Intrinsics.LJFF(str, "onActive") || Intrinsics.LJFF(str, "onHostResume") || Intrinsics.LJFF(str, "unspecified")) {
                    if (Intrinsics.LJFF(this.LLLFF, awemeLJIIIIZZ.getAid())) {
                        return;
                    } else {
                        this.LLLFF = awemeLJIIIIZZ.getAid();
                    }
                }
                C01GW<IPaidContentVideoHotSwapService> c01gw = StoryPaywallComponentTrigger.LLJJLIIIJLLLLLLLZ;
                IPaidContentVideoHotSwapService iPaidContentVideoHotSwapServiceLIZ = C716310S7x.LIZ();
                if (iPaidContentVideoHotSwapServiceLIZ != null) {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBp = Bp();
                    if (iFeedPanelPlatformAbilityBp != null) {
                        strCY1 = iFeedPanelPlatformAbilityBp.cY1();
                    } else {
                        strCY1 = null;
                    }
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBp2 = Bp();
                    if (iFeedPanelPlatformAbilityBp2 != null) {
                        from = iFeedPanelPlatformAbilityBp2.getFrom();
                    } else {
                        from = null;
                    }
                    String previousPageWithPlaylistScene = C0SUC.LIZ(getContext()).getPreviousPageWithPlaylistScene();
                    if (previousPageWithPlaylistScene == null || !(true ^ a0.LJJJIL(previousPageWithPlaylistScene))) {
                        previousPageWithPlaylistScene = null;
                    }
                    iPaidContentVideoHotSwapServiceLIZ.LIZLLL(awemeLJIIIIZZ, listLJJJLZIJ, i, false, strCY1, from, previousPageWithPlaylistScene, LifecycleOwnerKt.getLifecycleScope(this), (C0S88) this.LLLII.getValue(), (C0S80) this.LLLIIIL.getValue());
                }
            }
        }

        public final void Gp(boolean z) {
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), CleanModeProtocol.class, false);
            if (listLIZIZ != null) {
                ArrayList<CleanModeProtocol> arrayList = new ArrayList();
                for (Object obj : listLIZIZ) {
                    if (!Intrinsics.LJFF(((CleanModeProtocol) obj).BB1(), "top_area_tag")) {
                        arrayList.add(obj);
                    }
                }
                for (CleanModeProtocol cleanModeProtocol : arrayList) {
                    if (z) {
                        cleanModeProtocol.Lv();
                    } else {
                        cleanModeProtocol.Iu0();
                    }
                }
            }
        }

        public final boolean Ip(Aweme aweme) {
            if (!this.LLJZIJLIL || aweme == null) {
                return false;
            }
            if (!Intrinsics.LJFF(aweme.getAid(), LJIIIIZZ().getAid())) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
        public final void onViewCreated(View view) {
            C0S8S c0s8sLJ;
            C0S87<Object> c0s87;
            super.onViewCreated(view);
            C01GW<IPaidContentVideoHotSwapService> c01gw = StoryPaywallComponentTrigger.LLJJLIIIJLLLLLLLZ;
            IPaidContentVideoHotSwapService iPaidContentVideoHotSwapServiceLIZ = C716310S7x.LIZ();
            if (iPaidContentVideoHotSwapServiceLIZ != null) {
                c0s8sLJ = iPaidContentVideoHotSwapServiceLIZ.LJ(view, new AwS555S0100000_11(this, 1150), new AwS555S0100000_11(this, 1151), new AwS555S0100000_11(this, 1152), new AwS555S0100000_11(this, 1153), new AwS555S0100000_11(this, 1154), new AwS590S0100000_11(this, 313));
            } else {
                c0s8sLJ = null;
            }
            this.LLJZ = c0s8sLJ;
            boolean z = false;
            if (this.LLL) {
                if (c0s8sLJ != null) {
                    C0S87<Object> c0s872 = c0s8sLJ.LJ;
                    if (c0s872 != null) {
                        c0s872.LJJLJLI();
                    } else {
                        c0s8sLJ.LJI = true;
                    }
                }
                this.LLL = false;
            }
            if (this.LLLF) {
                C0S8S c0s8s = this.LLJZ;
                if (c0s8s != null && (c0s87 = c0s8s.LJ) != null) {
                    c0s87.LJ();
                    z = true;
                }
                this.LLLF = !z;
            }
            Ep("unspecified");
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0S86
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJJIJIL;
                }
            }, null, AFwS294S0000000_11.get$arr$(195), 6);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0S84(this, null), 3);
        }

        @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
        /* JADX INFO: renamed from: op */
        public final boolean ur(VideoItemParams videoItemParams) {
            C01GW<IPaidContentVideoHotSwapService> c01gw = StoryPaywallComponentTrigger.LLJJLIIIJLLLLLLLZ;
            Aweme aweme = videoItemParams.getAweme();
            jm();
            return C716310S7x.LIZIZ(aweme);
        }

        @Override // X.InterfaceC712990Rxx
        /* JADX INFO: renamed from: rr */
        public final void up(VideoItemParams videoItemParams) {
            MutableLiveData mutableLiveDataLJIILJJIL;
            C01GW<IPaidContentVideoHotSwapService> c01gw = StoryPaywallComponentTrigger.LLJJLIIIJLLLLLLLZ;
            Aweme aweme = videoItemParams.getAweme();
            jm();
            if (C716310S7x.LIZIZ(aweme)) {
                C786410Ut5.LJLLLLLL(0, getContentView());
                C013C c013c = new C013C();
                c013c.element = true;
                AwS377S0200000_11 awS377S0200000_11 = new AwS377S0200000_11(c013c, this, 71);
                C0S82 c0s82 = new C0S82(this, null);
                if (C296970BkV.LIZ()) {
                    C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), null, null, new C2450509ix(this, c0s82, null), 3);
                    return;
                }
                C0K77 c0k77 = (C0K77) this.LLJLLIL.getValue();
                if (c0k77 == null || (mutableLiveDataLJIILJJIL = c0k77.LJIILJJIL()) == null) {
                    return;
                }
                mutableLiveDataLJIILJJIL.observe(this, new C0S85(awS377S0200000_11));
                return;
            }
            C786410Ut5.LJLLLLLL(8, getContentView());
        }

        @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
        public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
            return ur((VideoItemParams) obj);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "story_vhs_overlay";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(StoryPaywallCellOverlayComponent.class);
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // X.C0RUJ
    public final String T1() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        jm();
        return C716310S7x.LIZIZ(aweme);
    }

    @Override // X.InterfaceC445610Hdf
    public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        return C716310S7x.LIZIZ(videoItemParams.getAweme());
    }
}
