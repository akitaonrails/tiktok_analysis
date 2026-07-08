package com.ss.android.ugc.aweme.series.commonfeed.component.overlay;

import X.C01GW;
import X.C0CNO;
import X.C0N0Y;
import X.C0N55;
import X.C0RD6;
import X.C0RDX;
import X.C0SFC;
import X.C11NJ;
import X.C11RK;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1615710s9B;
import X.C1620830sHR;
import X.C2037807ya;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C694540RMe;
import X.C718510SGj;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1614460s7A;
import X.InterfaceC1615720s9C;
import X.InterfaceC726350SeP;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.IPaidContentPanelAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentCellOverlayComponent extends BaseCellSlotComponent<PaidContentCellOverlayComponent> implements InterfaceC1614460s7A {
    public String LLLFF;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 900));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 901));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1807));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1808));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 896));
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS264S0000000_24.get$arr$(275));
    public final C11RK<Unit> LLLFFI = new C11RK<>();
    public final C11RK<Unit> LLLFZ = new C11RK<>();
    public final C11NJ LLLI = new C11NJ();
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 899));
    public final C1620830sHR LLLIIIL = new C1620830sHR(this, 6);

    @Override // X.InterfaceC1614460s7A
    public final void LLIIIZ() {
        this.LLLIIL = true;
        Fp().LLIIIZ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final boolean Vo() {
        return false;
    }

    public final InterfaceC1615720s9C Fp() {
        return (InterfaceC1615720s9C) this.LLLIIIIL.getValue();
    }

    public final boolean Ip() {
        Aweme awemeLJIIIIZZ;
        Aweme awemeLJIIIIZZ2;
        Aweme awemeLJIIIIZZ3;
        PaidContentInfo paidContentInfo;
        return (C0SFC.LIZIZ.LJIILLIIL(LJIIIIZZ()) || (awemeLJIIIIZZ = LJIIIIZZ()) == null || awemeLJIIIIZZ.mPaidContentInfo == null || ((awemeLJIIIIZZ2 = LJIIIIZZ()) != null && C718510SGj.LIZJ(awemeLJIIIIZZ2)) || (awemeLJIIIIZZ3 = LJIIIIZZ()) == null || (paidContentInfo = awemeLJIIIIZZ3.mPaidContentInfo) == null || paidContentInfo.isVideoPurchased() || paidContentInfo.isSeriesPurchased() || !paidContentInfo.isPartialPreview() || paidContentInfo.isLimitedFreeShortDrama()) ? false : true;
    }

    public final Aweme LJIIIIZZ() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJZIJLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            return iViewPagerComponentAbility.LJIIIIZZ();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        C0CNO.LIZLLL(0L, new AwS568S0100000_24(this, 897));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        C0CNO.LIZLLL(0L, new AwS568S0100000_24(this, 898));
    }

    public final IPlayerComponentAbility x32() {
        return (IPlayerComponentAbility) this.LLJLLL.getValue();
    }

    public final boolean Ep() {
        PaidContentInfo paidContentInfo;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        return (awemeLJIIIIZZ == null || (paidContentInfo = awemeLJIIIIZZ.mPaidContentInfo) == null || !paidContentInfo.getEnableSingleVideoPurchase()) ? false : true;
    }

    public final void Gp() {
        if (getContentView().getVisibility() == 0) {
            this.LLLFF = null;
            C339190DRl.LIZIZ(getContentView());
            Fp().LJFF();
        }
    }

    public final void Jp() {
        if (getContentView().getVisibility() == 0 && LJJIJL().getVisibility() == 0) {
            return;
        }
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        this.LLLFF = awemeLJIIIIZZ != null ? awemeLJIIIIZZ.getAid() : null;
        C339190DRl.LIZLLL(LJJIJL());
        C339190DRl.LIZLLL(getContentView());
        Fp().LIZIZ();
        Bp(true, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return Fp().LIZLLL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this);
        Fp().LJJIIJ();
        IPaidContentPanelAbility iPaidContentPanelAbility = (IPaidContentPanelAbility) this.LLJLLIL.getValue();
        if (iPaidContentPanelAbility != null) {
            iPaidContentPanelAbility.CA0(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_play_completed", new AwS603S0100000_24(this, 193));
        C0RDX.LIZJ(this, "event_on_playing", new AwS603S0100000_24(this, 194));
    }

    @C14EU(sticky = true)
    public final void onLandscapePreviewVideoPlayCompleted(C694540RMe c694540RMe) {
        Jp();
        if (this.LLLII) {
            C1440005kM.LIZ(C1615710s9B.LIZ);
        }
        this.LLLFZ.onNext(Unit.LIZ);
        EventBus.LIZLLL().LJIL(c694540RMe);
    }

    @C14EU
    public final void onSeriesFeedOverlayUpdate(C2037807ya c2037807ya) {
        C0N0Y playerManager;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C0N0Y playerManager2;
        if (!C0SFC.LIZIZ.LJIIIIZZ(LJIIIIZZ())) {
            Gp();
            if (!c2037807ya.LIZ) {
                if (Ep() && (iPlayerComponentAbilityX32 = x32()) != null && (playerManager2 = iPlayerComponentAbilityX32.getPlayerManager()) != null) {
                    playerManager2.seek(0.0f);
                }
                InterfaceC726350SeP interfaceC726350SeP = (InterfaceC726350SeP) this.LLJZ.getValue();
                if (interfaceC726350SeP != null) {
                    interfaceC726350SeP.ui(LJIIIIZZ());
                    return;
                }
                return;
            }
            return;
        }
        IPlayerComponentAbility iPlayerComponentAbilityX322 = x32();
        if (iPlayerComponentAbilityX322 != null && (playerManager = iPlayerComponentAbilityX322.getPlayerManager()) != null) {
            playerManager.LJJJ();
        }
        Jp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C339190DRl.LIZIZ(getContentView());
        Fp().onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0zq0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS310S0000000_24.get$arr$(53), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0zq1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS310S0000000_24.get$arr$(54), 6);
        IPaidContentPanelAbility iPaidContentPanelAbility = (IPaidContentPanelAbility) this.LLJLLIL.getValue();
        if (iPaidContentPanelAbility != null) {
            iPaidContentPanelAbility.i11(this);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C0N0Y playerManager;
        VideoItemParams videoItemParams2 = videoItemParams;
        InterfaceC1615720s9C interfaceC1615720s9CFp = Fp();
        if (interfaceC1615720s9CFp != null) {
            interfaceC1615720s9CFp.onBind(videoItemParams2.getAweme());
        }
        if (!Ep()) {
            if (C0SFC.LIZIZ.LJIIIIZZ(LJIIIIZZ())) {
                IPlayerComponentAbility iPlayerComponentAbilityX32 = x32();
                if (iPlayerComponentAbilityX32 != null && (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) != null) {
                    playerManager.LJJJ();
                }
                Jp();
                return;
            }
            Gp();
        }
    }

    public final void Bp(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        if (this.LLLFF != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJZIJLIL.getValue();
        if (iViewPagerComponentAbility == null || iViewPagerComponentAbility.Rh(LJIIIIZZ()) == null) {
            z4 = false;
        }
        C1440005kM.LIZ(new C0N55(z, z3, z4, z2));
        this.LLLIIII = false;
    }
}
