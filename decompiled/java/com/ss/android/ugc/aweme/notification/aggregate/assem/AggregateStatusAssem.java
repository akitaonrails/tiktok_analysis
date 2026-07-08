package com.ss.android.ugc.aweme.notification.aggregate.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes3.dex */
public final class AggregateStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AggregateStatusAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/notification/aggregate/InviteListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AggregateStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InviteListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 710), AFwS229S0000000_2.get$arr$(432), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06KH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1840880y0M) obj).LLILLJJLI;
            }
        }, null, new AwS641S0100000_27(this, 27), 6);
    }
}
