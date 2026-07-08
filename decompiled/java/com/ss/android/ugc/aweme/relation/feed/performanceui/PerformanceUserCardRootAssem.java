package com.ss.android.ugc.aweme.relation.feed.performanceui;

import X.C01D1;
import X.C01GW;
import X.C10L2;
import X.C1295090jo3;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C1385040m98;
import X.C1387040mCM;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C197039127h;
import X.C19719912Dl;
import X.C19ME;
import X.C20742216Eq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C447550Hgn;
import X.C452501pT;
import X.C723830SaL;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC428940Grs;
import X.InterfaceC1295080jo2;
import X.InterfaceC1296040jpa;
import X.InterfaceC19229810Ky;
import X.InterfaceC207200166c;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import u4.q0;
import wh6.AbS707S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PerformanceUserCardRootAssem extends ReusedUIContentAssem<PerformanceUserCardRootAssem> implements InterfaceC207200166c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(340));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 567));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 566));
    public final AssemVMLazy LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PerformanceUserCardRootAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/relation/feed/performanceui/PerformanceUserCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PerformanceUserCardRootAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PerformanceUserCardViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 568), AFwS271S0000000_28.get$arr$(200), null, true);
    }

    @Override // X.InterfaceC207200166c
    public final InterfaceC19229810Ky wk() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (PerformanceUserCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC207200166c
    public final int D8() {
        return ((PerformanceUserCardViewModel) wk()).LLIZ;
    }

    @Override // X.InterfaceC207200166c
    public final boolean Kf() {
        return ((PerformanceUserCardViewModel) wk()).zQ2();
    }

    @Override // X.InterfaceC207200166c
    public final boolean Tj() {
        return ((PerformanceUserCardViewModel) wk()).BQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC207200166c
    public final void Wf() {
        C786410Ut5.LLD(0, ep());
        Context context = getContext();
        if (context != null) {
            C1295960jpS c1295960jpSEp = ep();
            final Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zl, context);
            Iterator it2 = C1697810uHb.LJIIJJI("1", "2").iterator();
            while (it2.hasNext()) {
                c1295960jpSEp.addValueCallback(new C1295090jo3(it2.next(), "**", "Fill 1"), InterfaceC1295080jo2.LIZ, (InterfaceC1296040jpa<Integer>) new InterfaceC1296040jpa() { // from class: X.0y5s
                    @Override // X.InterfaceC1296040jpa
                    public final Object LIZ(C1295570jop c1295570jop) {
                        return numLIZJ;
                    }
                });
            }
            c1295960jpSEp.invalidate();
        }
    }

    @Override // X.InterfaceC207200166c
    public final int c3() {
        return ((PerformanceUserCardViewModel) wk()).LLJI;
    }

    public final C197039127h cp() {
        return (C197039127h) LJJIJL().findViewById(R.id.bzs);
    }

    public final C197039127h dp() {
        return (C197039127h) LJJIJL().findViewById(R.id.bzu);
    }

    public final C1295960jpS ep() {
        return (C1295960jpS) LJJIJL().findViewById(R.id.nra);
    }

    @Override // X.InterfaceC207200166c
    public final int fj() {
        return ((PerformanceUserCardViewModel) wk()).LLIZLLLIL;
    }

    @Override // X.InterfaceC207200166c
    public final int gj() {
        return ((PerformanceUserCardViewModel) wk()).LLJ;
    }

    @Override // X.InterfaceC207200166c
    public final boolean m3() {
        return ((PerformanceUserCardViewModel) wk()).AQ2();
    }

    @Override // X.InterfaceC207200166c
    public final boolean xl() {
        return ((PerformanceUserCardViewModel) wk()).yQ2();
    }

    @Override // X.InterfaceC207200166c
    public final void LJIILIIL(Aweme aweme) {
        ((PerformanceUserCardViewModel) wk()).LLILZLL = aweme;
    }

    @Override // X.InterfaceC207200166c
    public final void hc(boolean z) {
        wk();
    }

    @Override // X.InterfaceC207200166c
    public final void j7(String str) {
        ((PerformanceUserCardViewModel) wk()).DQ2(str);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C723830SaL.LIZ(this, null, new AwS394S0200000_28(this, view, 38));
        C19ME c19me = (C19ME) LJJIJL().findViewById(R.id.bzx).getLayoutParams();
        if (((Boolean) this.LLJJJJJIL.getValue()).booleanValue()) {
            c19me.guidePercent = 0.15f;
        } else if (((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
            c19me.guidePercent = 0.18f;
        } else {
            c19me.guidePercent = 0.23f;
        }
        C786410Ut5.n6((C20742216Eq) LJJIJL().findViewById(R.id.bzx), c19me);
        View viewFindViewById = LJJIJL().findViewById(R.id.sxv);
        q0.LJJI(viewFindViewById, true);
        q0.LJIJI(viewFindViewById, true);
        C1387040mCM.LIZ(LJJIJL().findViewById(R.id.kmh), new AwS626S0100000_12(this, 51));
        C786410Ut5.I7(new AbS707S0100000_28(this, 5, 42), LJJIJL().findViewById(R.id.kmh));
        C428150Gqb.LIZ(LJJIJL().findViewById(R.id.kmh), EnumC428940Grs.ALPHA, 0.0f);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, C1385040m98.LIZ(context, false))) != null) {
            int iIntValue = numLIZJ.intValue();
            cp().setBackgroundColor(iIntValue);
            dp().setBackgroundColor(iIntValue);
        }
        cp().getBackground().setAlpha(102);
        dp().getBackground().setAlpha(204);
        C1378990lzN.LIZIZ(cp(), Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
        C1378990lzN.LIZIZ(dp(), Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
        if (((Boolean) this.LLJJJJJIL.getValue()).booleanValue()) {
            C447550Hgn.LJFF(cp(), Integer.valueOf(cp().getWidth()), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
            C447550Hgn.LJFF(dp(), Integer.valueOf(dp().getWidth()), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
        }
        ep().setRepeatCount(-1);
        ep().playAnimation();
    }

    @Override // X.InterfaceC207200166c
    public final void setEventType(String str) {
        C10L2.LIZ(this, str);
    }
}
