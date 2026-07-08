package com.ss.android.ugc.aweme.relation.feed.performanceui;

import X.C01D1;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A5L;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import wh6.AbS707S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PerformanceButtonsAssem extends ReusedUIContentAssem<PerformanceButtonsAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJJJ;
    public boolean LLJJJJJIL;
    public String LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PerformanceButtonsAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/relation/feed/performanceui/PerformanceUserCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PerformanceButtonsAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PerformanceUserCardViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 855), AFwS271S0000000_28.get$arr$(198), null, true);
        this.LLJJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 510));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 511));
        this.LLJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 509));
    }

    public final PerformanceUserCardViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (PerformanceUserCardViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = cp().LLJIJIL;
        C786410Ut5.I7(new AbS707S0100000_28(this, 4, 42), (View) this.LLJJLIIIJLLLLLLLZ.getValue());
        C786410Ut5.I7(new AbS707S0100000_28(this, 3, 42), (View) this.LLJJL.getValue());
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.10LC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713290ugZ) obj).LLILZ;
            }
        }, null, AFwS315S0000000_28.get$arr$(26), 6);
        C2271391DvN.LIZ((View) this.LLJJL.getValue(), (C1A5L) C2271381DvM.LLILLL.getValue());
        C2271391DvN.LIZ((View) this.LLJJLIIIJLLLLLLLZ.getValue(), (C1A5L) C2271381DvM.LLILZIL.getValue());
    }
}
