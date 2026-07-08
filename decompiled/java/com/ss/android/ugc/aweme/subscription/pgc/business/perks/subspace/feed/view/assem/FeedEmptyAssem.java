package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem;

import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C511370K3r;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC521810KdH;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedEmptyAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public C511370K3r LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedEmptyAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedEmptyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 487), AFwS237S0000000_7.get$arr$(219), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fhb;
    }

    public final C511370K3r hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C511370K3r.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C511370K3r) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubSpaceFeedVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    public final void kp(View view) {
        int iIntValue;
        Integer num;
        if (!ip().yQ2()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            C511370K3r c511370K3rHp = hp();
            if (c511370K3rHp != null && (num = c511370K3rHp.LLIZLLLIL) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            layoutParams.topMargin = iIntValue;
            C786410Ut5.W5(view, layoutParams);
            view.requestLayout();
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(this, view, 3));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, view);
        ip().DQ2();
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jts
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 12), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jug
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 14), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jub
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 16), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0JuZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 17), 4);
    }
}
