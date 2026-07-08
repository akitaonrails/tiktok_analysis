package com.ss.android.ugc.aweme.notification.aggnotice.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes3.dex */
public final class AggregatePageStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AggregatePageStatusAssem.class, "aggregateListViewModel", "getAggregateListViewModel()Lcom/ss/android/ugc/aweme/notification/aggnotice/vm/AggregateListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AggregatePageStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AggregateListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 706), AFwS229S0000000_2.get$arr$(426), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 707));
        this.LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 705));
    }

    public final C1749280vcc Go() {
        return (C1749280vcc) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        AssemViewModel value = assemVMLazy.getValue();
        subscribe(value, C736820SvI.LIZIZ(value.usedInReusedScene), null, new AwS618S0100000_4(this, 19));
    }
}
