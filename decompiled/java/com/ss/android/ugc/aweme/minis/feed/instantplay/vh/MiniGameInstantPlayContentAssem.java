package com.ss.android.ugc.aweme.minis.feed.instantplay.vh;

import X.AnonymousClass0956;
import X.C01GW;
import X.C1006440cIU;
import X.C1006540cIe;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C497820Jfg;
import X.C625920Ogo;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1006410cIR;
import Y.ACListenerS151S0100000_16;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vm.MiniGameInstantPlayViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS42S0001000_30;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniGameInstantPlayContentAssem extends BaseCellSlotComponent<MiniGameInstantPlayContentAssem> {
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(MiniGameInstantPlayViewModel.class), AFwS252S0000000_16.get$arr$(275));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 367));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 363));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 364));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 366));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 365));
    public AnonymousClass0956 LLLFF;
    public ValueAnimator LLLFFI;
    public Integer LLLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d6h;
    }

    public final MiniGameInstantPlayViewModel Fp() {
        return (MiniGameInstantPlayViewModel) this.LLJLLIL.getValue();
    }

    public final C1006440cIU Bp() {
        Aweme aweme;
        CardInsertInfo cardInsertInfo;
        VideoItemParams videoItemParams = Fp().getState().LLILLL;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (cardInsertInfo = aweme.getCardInsertInfo()) == null) {
            return null;
        }
        return C1006540cIe.LIZ(cardInsertInfo.getCardId());
    }

    public final InterfaceC1006410cIR Ep() {
        C1006440cIU c1006440cIUBp = Bp();
        if (c1006440cIUBp != null) {
            return c1006440cIUBp.LJFF;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        InterfaceC1006410cIR interfaceC1006410cIREp = Ep();
        if (interfaceC1006410cIREp != null) {
            interfaceC1006410cIREp.pause();
        }
    }

    public final void Gp(int i) {
        View view = (View) this.LLJZ.getValue();
        if (view != null) {
            C625920Ogo.LIZ(view, new AwS42S0001000_30(i, 2));
        }
        View view2 = (View) this.LLJLLL.getValue();
        if (view2 != null) {
            C625920Ogo.LIZ(view2, new AwS42S0001000_30(i, 3));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View view2 = (View) this.LLL.getValue();
        if (view2 != null) {
            C625920Ogo.LIZ(view2, AFwS274S0000000_30.get$arr$(320));
        }
        View view3 = (View) this.LLLF.getValue();
        if (view3 != null) {
            C625920Ogo.LIZ(view3, AFwS274S0000000_30.get$arr$(321));
        }
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0cI7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1006240cIA) obj).LLILZ;
            }
        }, null, AFwS300S0000000_16.get$arr$(61), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0cI6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1006240cIA) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(62), 4);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0cI8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1006240cIA) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AFwS300S0000000_16.get$arr$(63), 4);
        FrameLayout frameLayout = (FrameLayout) this.LLJZIJLIL.getValue();
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = C497820Jfg.LIZIZ(frameLayout.getContext());
            layoutParams.height = C497820Jfg.LIZ(frameLayout.getContext());
            C786410Ut5.a6(frameLayout, layoutParams);
            C786410Ut5.O7(frameLayout, new ACListenerS151S0100000_16(this, 46));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        InterfaceC1006410cIR interfaceC1006410cIREp = Ep();
        if (interfaceC1006410cIREp != null) {
            interfaceC1006410cIREp.resume();
        }
    }
}
