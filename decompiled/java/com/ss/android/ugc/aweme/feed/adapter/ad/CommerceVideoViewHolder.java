package com.ss.android.ugc.aweme.feed.adapter.ad;

import X.C01GW;
import X.C0RF0;
import X.C0S00;
import X.C0S01;
import X.C0S02;
import X.C1022620cia;
import X.C335610DDr;
import X.C452501pT;
import X.C584270Mvp;
import X.C692050RCp;
import X.C714200Rzu;
import X.C714400S0o;
import X.InterfaceC1008930cMV;
import X.InterfaceC714210Rzv;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.ability.overlay.ICommerceFeedOverlayAbility;
import com.ss.android.ugc.aweme.ad.feed.component.videoshrink.ICommerceLandingPageVideoShrinkAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomLogic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class CommerceVideoViewHolder extends VideoViewCell {
    public boolean T0;
    public final C0S00 U0;
    public final C01GW V0;
    public final C01GW W0;
    public final C01GW X0;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJLLILLLL() {
        this.T0 = true;
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((IFeedService) this.X0.getValue()).LIZJ(this.LLLLLLLLLL, this.LLJJ, this.LLJILJILJ.LJIIIZ, true);
        if (interfaceC1008930cMVLIZJ != null) {
            interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(true));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LLLIIL() {
        return 7;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public String gq() {
        return "cell_commerce";
    }

    static {
        new Object() { // from class: X.0S03
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C584270Mvp LLLLLJIL() {
        return new C584270Mvp(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean LLLZ() {
        ICommerceLandingPageVideoShrinkAbility iCommerceLandingPageVideoShrinkAbility = (ICommerceLandingPageVideoShrinkAbility) this.V0.getValue();
        if (iCommerceLandingPageVideoShrinkAbility != null && iCommerceLandingPageVideoShrinkAbility.xy()) {
            return false;
        }
        ICommerceFeedOverlayAbility iCommerceFeedOverlayAbility = (ICommerceFeedOverlayAbility) this.W0.getValue();
        if (iCommerceFeedOverlayAbility == null || !iCommerceFeedOverlayAbility.nu0()) {
            return super.LLLZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void u0() {
        C1022620cia.LIZ("CommerceVideoViewHolder", "resetPlayerView before");
        this.U0.LIZLLL();
        if (!this.U0.LIZ()) {
            super.u0();
        } else {
            C1022620cia.LIZ("CommerceVideoViewHolder", "[resetPlayerView] support slide guide, initSlideViewPager");
            this.U0.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onPause() {
        super.onPause();
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((IFeedService) this.X0.getValue()).LIZJ(this.LLLLLLLLLL, this.LLJJ, this.LLJILJILJ.LJIIIZ, true);
        if (interfaceC1008930cMVLIZJ != null) {
            interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(false));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onResume() {
        super.onResume();
        if (this.T0) {
            InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((IFeedService) this.X0.getValue()).LIZJ(this.LLLLLLLLLL, this.LLJJ, this.LLJILJILJ.LJIIIZ, true);
            if (interfaceC1008930cMVLIZJ != null) {
                interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(true));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void unBind() {
        super.unBind();
        this.U0.LIZIZ();
    }

    public CommerceVideoViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.T0 = true;
        this.U0 = new C0S00(this);
        this.V0 = C452501pT.LIZIZ(new C0S01(this));
        this.W0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 191));
        this.X0 = C452501pT.LIZIZ(new C0S02());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        super.LJI(aweme);
        C1022620cia.LIZ("CommerceVideoViewHolder", "bind");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        C714200Rzu c714200Rzu;
        InterfaceC714210Rzv interfaceC714210Rzv;
        super.LJJIJIIJIL(i);
        C335610DDr.LIZ(this.LLLLLLLLLL, "commerce new");
        C714400S0o c714400S0o = this.U0.LIZ.LLLLILI;
        if (c714400S0o != null && (c714400S0o.getAdapter() instanceof C714200Rzu)) {
            PagerAdapter adapter = c714400S0o.getAdapter();
            if ((adapter instanceof C714200Rzu) && (c714200Rzu = (C714200Rzu) adapter) != null && (interfaceC714210Rzv = c714200Rzu.LLJIJIL) != null) {
                interfaceC714210Rzv.LJFF();
            }
        }
        ICommonFeedCustomLogic iCommonFeedCustomLogic = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null);
        if (iCommonFeedCustomLogic != null) {
            iCommonFeedCustomLogic.LJIIIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LJLIIIL(int i) {
        super.LJLIIIL(i);
        if (i == 1 || i == 4 || i == 5) {
            this.T0 = false;
        }
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((IFeedService) this.X0.getValue()).LIZJ(this.LLLLLLLLLL, this.LLJJ, this.LLJILJILJ.LJIIIZ, true);
        if (interfaceC1008930cMVLIZJ != null) {
            interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(false));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LLLI(int i) {
        super.LLLI(i);
        if (this.T0) {
            InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((IFeedService) this.X0.getValue()).LIZJ(this.LLLLLLLLLL, this.LLJJ, this.LLJILJILJ.LJIIIZ, true);
            if (interfaceC1008930cMVLIZJ != null) {
                interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(true));
            }
        }
    }
}
