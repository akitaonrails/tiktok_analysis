package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem;

import X.C019F;
import X.C0K0R;
import X.C0KC4;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EH;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageAbnormalSubStatusAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final String LLJJI = "";
    public final AssemVMLazy LLJJIII;
    public C0KC4 LLJJIJI;
    public ViewGroup LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackageAbnormalSubStatusAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubPackageAbnormalSubStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 439), AFwS237S0000000_7.get$arr$(201), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fig;
    }

    public final C0KC4 hp() {
        if (this.LLJJIJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0KC4.class, null);
            this.LLJJIJI = interfaceC1555100qZQLIZIZ != null ? (C0KC4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJI;
    }

    public final void ip(Fragment fragment) {
        FragmentManager fragmentManager;
        C19EH c19ehLJIIJ;
        try {
            C0KC4 c0kc4Hp = hp();
            if (c0kc4Hp != null && (fragmentManager = c0kc4Hp.LLJJ) != null && (c19ehLJIIJ = fragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIJ(R.id.f659yd, fragment, null);
                c19ehLJIIJ.LJIIIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.f659yd)) != null) {
            C0K0R.LIZ(viewGroup);
        } else {
            viewGroup = null;
        }
        this.LLJJIJIIJIL = viewGroup;
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KF2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 93), 6);
    }
}
