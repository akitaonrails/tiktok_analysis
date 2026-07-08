package com.ss.android.ugc.aweme.publicgroup.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1559260qg8;
import X.C1617006Uu;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class PublicGroupNavBarAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1680));
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723590SZx(this, C1617006Uu.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PublicGroupNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/GroupListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PublicGroupNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupListViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 754), AFwS257S0000000_19.get$arr$(252), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cjg;
    }

    public final C1617006Uu hp() {
        return (C1617006Uu) this.LLJJIII.getValue();
    }

    public final TuxNavBar ip() {
        return (TuxNavBar) this.LLJJI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publicgroup.assem.PublicGroupNavBarAssem.onViewCreated(android.view.View):void");
    }
}
