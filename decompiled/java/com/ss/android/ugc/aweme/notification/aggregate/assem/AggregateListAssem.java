package com.ss.android.ugc.aweme.notification.aggregate.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class AggregateListAssem extends UIListContentAssem<InviteListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AggregateListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/notification/aggregate/InviteListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AggregateListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InviteListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 709), AFwS229S0000000_2.get$arr$(431), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 708));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (AssemListViewModel) assemVMLazy.getValue();
    }
}
