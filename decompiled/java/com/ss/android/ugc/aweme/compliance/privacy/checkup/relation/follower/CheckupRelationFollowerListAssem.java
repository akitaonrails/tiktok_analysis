package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.follower;

import X.C01D1;
import X.C1076010e6h;
import X.C1265470j2H;
import X.C1265530j2N;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C724750Sbp;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.AObserverS223S0100000_19;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckupRelationFollowerListAssem extends BaseCheckupRelationListAssem<C1265530j2N, C1265470j2H> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final String LLJ = "followers";
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CheckupRelationFollowerListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/privacy/checkup/relation/follower/CheckupRelationFollowerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CheckupRelationFollowerListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CheckupRelationFollowerViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 134), AFwS257S0000000_19.get$arr$(107), null, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationListAssem
    public final void Oo() {
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.w28);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_person;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJI = c1749280vcc.getResources().getString(2131845066);
        c1722300uv6.LJIIIIZZ = c1749280vcc.getResources().getString(2131845065);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1749280vcc.setStatus(c1722300uv6);
        C337180DJs.LIZJ(c1749280vcc);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationListAssem
    public final Class<? extends PowerCell<?>> Lo() {
        return CheckupRelationFollowerCell.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationListAssem
    public final String No() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationListAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1076010e6h.LIZJ.LIZIZ().LIZJ().subscribe(this, new AObserverS223S0100000_19(this, 14));
    }
}
