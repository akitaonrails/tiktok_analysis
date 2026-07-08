package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C01GW;
import X.C13LE;
import X.C1558520qew;
import X.C1618440sDa;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C719610SKp;
import X.C719620SKq;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.SurfaceViewTransitionAdaptAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SurfaceViewTransitionAdaptAssem extends BaseCellSlotComponent<SurfaceViewTransitionAdaptAssem> implements SurfaceViewTransitionAdaptAbility, InterfaceC1554640qYg {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 86));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 87));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 355));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 354));
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(170));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 85));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 357));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bab;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2117071527) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C1618440sDa.LIZIZ.LJJ().LJI(this, "common_feed_social_detail_transition_snapshot", true, new AwS555S0100000_11(this, 356));
    }

    public final ImageView Ep() {
        return (ImageView) this.LLJLLL.getValue();
    }

    public final View LLLLLLLZIL() {
        InterfaceC583650Mup interfaceC583650MupX3;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJZ.getValue();
        if (iVideoCellAbility == null || (interfaceC583650MupX3 = iVideoCellAbility.x3()) == null) {
            return null;
        }
        return interfaceC583650MupX3.getVideoView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        if (!(LLLLLLLZIL() instanceof SurfaceView)) {
            return;
        }
        View viewLLLLLLLZIL = LLLLLLLZIL();
        if (viewLLLLLLLZIL != null) {
            viewLLLLLLLZIL.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLF.getValue());
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJZIJLIL.getValue();
        if (cellAdaptionComponentAbility != null) {
            cellAdaptionComponentAbility.XX0((C719610SKp) this.LLLFF.getValue());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.ability.SurfaceViewTransitionAdaptAbility
    public final void Ll2(AwS555S0100000_11 awS555S0100000_11) {
        if (!(LLLLLLLZIL() instanceof SurfaceView)) {
            awS555S0100000_11.invoke();
        } else {
            C719620SKq.LIZ(LLLLLLLZIL(), 0.3f, new AwS372S0200000_6(this, new AwS555S0100000_11(awS555S0100000_11, 1506), 79));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!(!(LLLLLLLZIL() instanceof SurfaceView))) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0SEc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLJJJJLIIL;
                }
            }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(74), 4);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
