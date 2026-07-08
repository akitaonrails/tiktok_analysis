package com.ss.android.ugc.aweme.videohotswap.overlay;

import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C03H5;
import X.C0K77;
import X.C0RUJ;
import X.C0S88;
import X.C0S8S;
import X.C0SR4;
import X.C0SUC;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C14EU;
import X.C15438062q;
import X.C1697810uHb;
import X.C1AV2;
import X.C1AVH;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C531650Kt9;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C707350Ror;
import X.C716200S7m;
import X.C716210S7n;
import X.C716230S7p;
import X.C716240S7q;
import X.C716250S7r;
import X.C716260S7s;
import X.C716270S7t;
import X.C716280S7u;
import X.C716300S7w;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class PaywallComponentTrigger extends BaseCellTriggerComponent<PaywallComponentTrigger> implements ComponentPriorityProtocol, C0RUJ {
    public static final C01GW<IPaidContentVideoHotSwapService> LLJLILLLLZIIL = C452501pT.LIZIZ(new C716270S7t());
    public static final C01GW<C0K77> LLJLL = C452501pT.LIZIZ(new C716260S7s());
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C716230S7p(this));
    public final C01GW LLJL = C452501pT.LIZIZ(new C716250S7r(this));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C716240S7q(this));

    public static final class NewPaywallCellOverlayComponent extends BaseCellSlotComponent<NewPaywallCellOverlayComponent> implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public C0S8S LLLFFI;
        public long LLLIIIL;
        public AnonymousClass0956 LLLIIL;
        public AwS590S0100000_11 LLLIILIL;
        public boolean LLLIL;
        public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1143));
        public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(244));
        public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1141));
        public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1138));
        public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1137));
        public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(549));
        public final C01GW LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(550));
        public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1140));
        public final C01GW LLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1139));
        public final C01GW LLLII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1142));
        public boolean LLLIIII = true;
        public boolean LLLIIIIL = true;

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

        public final IFeedPanelPlatformAbility Ep() {
            return (IFeedPanelPlatformAbility) this.LLJZIJLIL.getValue();
        }

        public final boolean Fp() {
            return ((Boolean) this.LLLII.getValue()).booleanValue();
        }

        public final void Gp() {
            C0SR4 c0sr4Zv0;
            Integer numBp;
            int iIntValue;
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityEp = Ep();
            if (iFeedPanelPlatformAbilityEp == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityEp.Zv0()) == null || (numBp = Bp()) == null || (iIntValue = numBp.intValue()) <= -1) {
                return;
            }
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            if (C716300S7w.LIZIZ(LJIIIIZZ(), Fp())) {
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, c0sr4Zv0.getCount());
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
                C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                while (it2.LLILLL) {
                    arrayList.add(c0sr4Zv0.getItem(it2.nextInt()));
                }
                List listLJJJJLI = C13LP.LJJJJLI(arrayList);
                C01GW<IPaidContentVideoHotSwapService> c01gw2 = PaywallComponentTrigger.LLJLILLLLZIIL;
                IPaidContentVideoHotSwapService iPaidContentVideoHotSwapServiceLIZ = C716300S7w.LIZ();
                Aweme awemeLJIIIIZZ = LJIIIIZZ();
                boolean zFp = Fp();
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityEp2 = Ep();
                String strCY1 = iFeedPanelPlatformAbilityEp2 != null ? iFeedPanelPlatformAbilityEp2.cY1() : null;
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityEp3 = Ep();
                String from = iFeedPanelPlatformAbilityEp3 != null ? iFeedPanelPlatformAbilityEp3.getFrom() : null;
                String previousPageWithPlaylistScene = C0SUC.LIZ(getContext()).getPreviousPageWithPlaylistScene();
                if (previousPageWithPlaylistScene == null || !(!a0.LJJJIL(previousPageWithPlaylistScene))) {
                    previousPageWithPlaylistScene = null;
                }
                iPaidContentVideoHotSwapServiceLIZ.LIZLLL(awemeLJIIIIZZ, listLJJJJLI, iIntValue, zFp, strCY1, from, previousPageWithPlaylistScene, LifecycleOwnerKt.getLifecycleScope(this), (C0S88) this.LLLFZ.getValue(), (C716280S7u) this.LLLI.getValue());
            }
        }

        @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
        public final int Oo() {
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            C716300S7w.LIZ().LJIIJJI();
            return R.layout.dss;
        }

        public final Integer Bp() {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityEp = Ep();
            if (iFeedPanelPlatformAbilityEp != null) {
                return Integer.valueOf(iFeedPanelPlatformAbilityEp.LJLJJL());
            }
            return null;
        }

        public final Aweme LJIIIIZZ() {
            C0SR4 c0sr4Zv0;
            Integer numBp = Bp();
            if (numBp == null) {
                return null;
            }
            int iIntValue = numBp.intValue();
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityEp = Ep();
            if (iFeedPanelPlatformAbilityEp == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityEp.Zv0()) == null) {
                return null;
            }
            return c0sr4Zv0.getItem(iIntValue);
        }

        public final void Ip(boolean z) {
            boolean z2;
            float f;
            if (this.LLLIL) {
                C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
                boolean zLIZIZ = C716300S7w.LIZIZ(LJIIIIZZ(), Fp());
                if (z && zLIZIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float[] fArr = new float[2];
                float f2 = 1.0f;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                if (z2) {
                    f2 = 0.0f;
                }
                fArr[1] = f2;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                valueAnimatorOfFloat.setDuration(0L);
                Map<String, List<String>> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("full_container", C1697810uHb.LJIILJJIL("full_container_vhs_overlay")), new Pair("bottom_container", C1697810uHb.LJIILJJIL("bottom_banner_playlist")));
                InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZ.getValue();
                if (interactAreaCommonAbility != null) {
                    interactAreaCommonAbility.BK1(mapLJIIJ, valueAnimatorOfFloat, !z2, (C1AV2) C1AVH.LJJJIL.getValue());
                }
            }
        }

        @C14EU
        public final void onPaywallFullFetchStatusChange(C716200S7m c716200S7m) {
            Gp();
        }

        @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
        public final void onViewCreated(View view) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
            super.onViewCreated(view);
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            this.LLLFFI = C716300S7w.LIZ().LJ(view, new AwS555S0100000_11(this, 1144), new AwS555S0100000_11(this, 1145), new AwS555S0100000_11(this, 1146), new AwS555S0100000_11(this, 1147), new AwS555S0100000_11(this, 1148), new AwS590S0100000_11(this, 312));
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RmJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJIJI;
                }
            }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(194), 4);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RyJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJJJ;
                }
            }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(191), 4);
            C013C c013c = new C013C();
            c013c.element = true;
            AwS220S0300000_11 awS220S0300000_11 = new AwS220S0300000_11(this, new AwS377S0200000_11(c013c, this, 70), new C707350Ror(this, null), 12);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLL.getValue();
            if ((iFeedPanelPlatformAbility2 != null && iFeedPanelPlatformAbility2.cl2() == 0) || ((iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLL.getValue()) != null && iFeedPanelPlatformAbility.cl2() == 2000)) {
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RoD
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C709790Rsn) obj).LLILLL;
                    }
                }, null, new AwS625S0100000_11(awS220S0300000_11, 89), 6);
            } else {
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RoC
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C709790Rsn) obj).LLILLL;
                    }
                }, C736820SvI.LIZLLL(), new AwS625S0100000_11(awS220S0300000_11, 88), 4);
            }
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RoE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILZ;
                }
            }, null, AFwS294S0000000_11.get$arr$(192), 6);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RoF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJ;
                }
            }, null, AFwS294S0000000_11.get$arr$(193), 6);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C716210S7n(this, null), 3);
        }

        @Override // X.InterfaceC712990Rxx
        /* JADX INFO: renamed from: rr */
        public final void up(VideoItemParams videoItemParams) {
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            if (C716300S7w.LIZIZ(videoItemParams.getAweme(), Fp())) {
                C786410Ut5.LJLLLLLL(0, getContentView());
            } else {
                C786410Ut5.LJLLLLLL(8, getContentView());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "full_container_vhs_overlay";
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
        return C13LE.LIZ(NewPaywallCellOverlayComponent.class);
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        boolean z = true;
        if (videoItemParams.mAwemeFromPage != 1) {
            z = false;
        }
        return C716300S7w.LIZIZ(aweme, z);
    }
}
