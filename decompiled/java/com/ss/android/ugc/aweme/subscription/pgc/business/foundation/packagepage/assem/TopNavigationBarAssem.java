package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem;

import X.C019F;
import X.C0KC4;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC513400KBm;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class TopNavigationBarAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJI;
    public C0KC4 LLJJIII;
    public ViewGroup LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxTextView LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopNavigationBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopNavigationBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 443), AFwS237S0000000_7.get$arr$(204), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fez;
    }

    public final C0KC4 hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0KC4.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0KC4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC513400KBm enumC513400KBm;
        TuxTextView tuxTextView;
        super.onViewCreated(view);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.p1q);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.bn7);
        this.LLJJIJIL = (TuxIconView) view.findViewById(R.id.hoq);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.title);
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS142S0100000_7(this, 226));
        }
        TuxIconView tuxIconView2 = this.LLJJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS142S0100000_7(this, 227));
        }
        C0KC4 c0kc4Hp = hp();
        if (c0kc4Hp != null) {
            enumC513400KBm = c0kc4Hp.LLIZLLLIL;
        } else {
            enumC513400KBm = null;
        }
        if (enumC513400KBm == EnumC513400KBm.PACKAGE_PAGE && (tuxTextView = this.LLJJJ) != null) {
            tuxTextView.setText(C20642515q3.LJI(2131839387));
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KEt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C513800KDa) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 89), 6);
    }
}
