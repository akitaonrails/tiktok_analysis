package com.ss.android.ugc.aweme.feed.assem.progressbar;

import X.C01GW;
import X.C1214480hi2;
import X.C13LE;
import X.C14LC;
import X.C1591220rVg;
import X.C1591860rWi;
import X.C1602160rnK;
import X.C1637806bA;
import X.C16E7;
import X.C16E9;
import X.C16EA;
import X.C16EG;
import X.C16EH;
import X.C16EI;
import X.C16EJ;
import X.C16EK;
import X.C16EL;
import X.C16EM;
import X.C16EN;
import X.C16EP;
import X.C16EQ;
import X.C16ER;
import X.C16ES;
import X.C16ET;
import X.C19719912Dl;
import X.C20740716Eb;
import X.C20740816Ec;
import X.C20740916Ed;
import X.C20741016Ee;
import X.C2217381BqS;
import X.C2487409ou;
import X.C309690CBz;
import X.C341940Daq;
import X.C418630GbF;
import X.C452501pT;
import X.C487580JAe;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1399350mWD;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC655270Pn3;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ALAdapterS25S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoProgressBarAssem extends BaseCellSlotComponent<VideoProgressBarAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public InsertCacheWhenPlayLagAbility LLJZ;
    public C16EG LLL;
    public C418630GbF LLLF;
    public LineProgressBar LLLFF;
    public AnimatorSet LLLFFI;
    public AnimatorSet LLLFZ;
    public AnimatorSet LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C16E7 LLLIIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C16E9(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C16EQ(this));
    public final C01GW LLJZIJLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS563S0100000_19(this, 1435));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoProgressBarAssem.class, "progressBarVM", "getProgressBarVM()Lcom/ss/android/ugc/aweme/feed/assem/progressbar/VideoProgressBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.16E7] */
    public VideoProgressBarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoProgressBarViewModel.class);
        this.LLLII = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new C1214480hi2(c19719912DlLIZ), null, new C20740716Eb());
        this.LLLIIII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C20740816Ec());
        this.LLLIIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C20740916Ed());
        this.LLLIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C20741016Ee());
        this.LLLIIL = new InterfaceC1399350mWD() { // from class: X.16E7
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x01ae  */
            @Override // X.InterfaceC1399350mWD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onKeyDown(int r18, android.view.KeyEvent r19) {
                /*
                    Method dump skipped, instruction units count: 472
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16E7.onKeyDown(int, android.view.KeyEvent):boolean");
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_container_video_progress_bar";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bbc;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
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

    public final void Bp() {
        if (this.LLLF == null || this.LLL == null) {
            return;
        }
        AnimatorSet animatorSet = this.LLLI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C418630GbF c418630GbF = this.LLLF;
        if (c418630GbF != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418630GbF);
            c418630GbF.setAlpha(0.0f);
        }
        C16EG c16eg = this.LLL;
        if (c16eg != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16eg);
            c16eg.setAlpha(1.0f);
        }
    }

    public final VideoProgressBarViewModel Ep() {
        return (VideoProgressBarViewModel) this.LLLII.getValue(this, LLLIILIL[0]);
    }

    public final void Fp() {
        if (this.LLLF == null || this.LLL == null) {
            return;
        }
        if (this.LLLFZ == null && this.LLLFFI == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLLI = animatorSet;
        animatorSet.addListener(new ALAdapterS25S0100000_31(this, 14));
        AnimatorSet animatorSet2 = this.LLLI;
        if (animatorSet2 != null) {
            C418630GbF c418630GbF = this.LLLF;
            AnimatorSet.Builder builderPlay = animatorSet2.play(c418630GbF != null ? c418630GbF.getShowAnim() : null);
            if (builderPlay != null) {
                C16EG c16eg = this.LLL;
                builderPlay.after(c16eg != null ? c16eg.getHideVolumeAnim() : null);
            }
        }
        AnimatorSet animatorSet3 = this.LLLI;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C2487409ou.LIZJ(new ARunnableS131S0100000_31(this, 62));
        if (C1591220rVg.LIZLLL()) {
            Jp();
        }
    }

    public final void Gp() {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        Object objLIZJ = C487580JAe.LIZJ(C724240Sb0.LJI(this));
        if (!(objLIZJ instanceof InterfaceC655270Pn3) || (interfaceC655270Pn3 = (InterfaceC655270Pn3) objLIZJ) == null) {
            return;
        }
        interfaceC655270Pn3.registerActivityOnKeyDownListener(this.LLLIIL);
    }

    public final void Ip() {
        C418630GbF c418630GbF;
        C418630GbF c418630GbF2;
        Ep().LL = SystemClock.elapsedRealtime();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme() == null) {
            return;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (C729510SjV.LJJIJIL(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme()) && (c418630GbF2 = this.LLLF) != null) {
            int visibility = c418630GbF2.getVisibility();
            c418630GbF2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c418630GbF2);
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (!C1591860rWi.LIZIZ(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme())) {
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme().getVideoControl() != null) {
                C724270Sb3 c724270Sb35 = this.LLJI;
                if (((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme().getVideoControl().showProgressBar == 1) {
                    C418630GbF c418630GbF3 = this.LLLF;
                    if (c418630GbF3 != null) {
                        c418630GbF3.setProgress(0);
                    }
                    C724270Sb3 c724270Sb36 = this.LLJI;
                    if (((VideoItemParams) (c724270Sb36 != null ? c724270Sb36.LL : null)).getAweme().getVideo() != null && (c418630GbF = this.LLLF) != null) {
                        C724270Sb3 c724270Sb37 = this.LLJI;
                        c418630GbF.setMax(((VideoItemParams) (c724270Sb37 != null ? c724270Sb37.LL : null)).getAweme().getVideo().getDuration());
                    }
                    C418630GbF c418630GbF4 = this.LLLF;
                    if (c418630GbF4 != null) {
                        int visibility2 = c418630GbF4.getVisibility();
                        c418630GbF4.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility2, 0, c418630GbF4);
                    }
                    InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue();
                    if (interactAreaCommonAbility != null) {
                        interactAreaCommonAbility.zB1(this);
                        return;
                    }
                    return;
                }
            }
        }
        C418630GbF c418630GbF5 = this.LLLF;
        if (c418630GbF5 != null) {
            int visibility3 = c418630GbF5.getVisibility();
            c418630GbF5.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c418630GbF5);
        }
        InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLJLLIL.getValue();
        if (interactAreaCommonAbility2 != null) {
            interactAreaCommonAbility2.Mr2(this);
        }
    }

    public final void Jp() {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        Object objLIZJ = C487580JAe.LIZJ(C724240Sb0.LJI(this));
        if (!(objLIZJ instanceof InterfaceC655270Pn3) || (interfaceC655270Pn3 = (InterfaceC655270Pn3) objLIZJ) == null) {
            return;
        }
        interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this.LLLIIL);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLL = (C16EG) view.findViewById(R.id.baz);
        this.LLLF = (C418630GbF) view.findViewById(R.id.video_player_progress);
        this.LLLFF = (LineProgressBar) view.findViewById(R.id.mpn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C341940Daq.LIZ(1.0d));
        layoutParams.gravity = 80;
        boolean z = C14LC.LJIIIZ;
        if (C309690CBz.LIZ.LJIIIIZZ) {
            int iLIZ = C341940Daq.LIZ(8.0d);
            layoutParams.leftMargin = iLIZ;
            layoutParams.rightMargin = iLIZ;
        }
        C786410Ut5.W5(view, layoutParams);
        C16EG c16eg = this.LLL;
        if (c16eg != null) {
            c16eg.setOnAudioControlViewHideListener(new C16EH() { // from class: X.16EV
                @Override // X.C16EH
                public final void onCancel() {
                    this.LIZ.Fp();
                }

                @Override // X.C16EH
                public final void onHide() {
                    this.LIZ.Bp();
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0i9b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJ;
            }
        }, null, new C16EK(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0P2O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new C16EN(this), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0P2P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new C16EL(this), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIIIL.getValue(), new C2217381BqS() { // from class: X.0P2L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new C16EP(), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIIIL.getValue(), new C2217381BqS() { // from class: X.0SF0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, new C16ES(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIIIL.getValue(), new C2217381BqS() { // from class: X.0SEj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, new C16EM(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0SEi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZ;
            }
        }, null, new C16ET(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIIL.getValue(), new C2217381BqS() { // from class: X.16EU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJI;
            }
        }, null, new C16EJ(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIIL.getValue(), new C2217381BqS() { // from class: X.16EW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJIJIL;
            }
        }, null, new C16ER(), 6);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLIIIL.getValue(), new C2217381BqS() { // from class: X.0SFq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJ;
            }
        }, null, new C16EI(), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.16EC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C16EB) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), new C16EA(), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C16EG c16eg = this.LLL;
        if (c16eg != null) {
            c16eg.setOnAudioControlViewHideListener(new C16EH() { // from class: X.16Ea
                @Override // X.C16EH
                public final void onCancel() {
                    this.LIZ.Bp();
                }

                @Override // X.C16EH
                public final void onHide() {
                    this.LIZ.Fp();
                }
            });
        }
    }
}
