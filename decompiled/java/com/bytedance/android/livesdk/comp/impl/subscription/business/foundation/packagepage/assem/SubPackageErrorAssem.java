package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem;

import X.C019F;
import X.C0KGJ;
import X.C0KHM;
import X.C0KJ1;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C513700KCq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageErrorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public C16F5 LLJJI;
    public C16FS LLJJIII;
    public C197039127h LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public C513700KCq LLJJIJIL;
    public ViewGroup LLJJJ;
    public ViewGroup LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackageErrorAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubPackageErrorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0KHM(c19719912DlLIZ), new C0KJ1(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hfk;
    }

    public final C513700KCq hp() {
        if (this.LLJJIJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C513700KCq.class, null);
            this.LLJJIJIL = interfaceC1555100qZQLIZIZ != null ? (C513700KCq) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C197039127h c197039127h;
        C16FS c16fs;
        super.onViewCreated(view);
        C16F5 c16f5 = null;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.hbx);
        } else {
            viewGroup = null;
        }
        this.LLJJJ = viewGroup;
        if (viewGroup != null) {
            C500260Jjc.LJIILIIL(viewGroup);
        }
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.pxk);
        } else {
            viewGroup2 = null;
        }
        this.LLJJJIL = viewGroup2;
        if (view != null) {
            c197039127h = (C197039127h) view.findViewById(R.id.pxm);
        } else {
            c197039127h = null;
        }
        this.LLJJIJI = c197039127h;
        if (view != null) {
            c16fs = (C16FS) view.findViewById(R.id.m1_);
        } else {
            c16fs = null;
        }
        this.LLJJIII = c16fs;
        if (view != null) {
            c16f5 = (C16F5) view.findViewById(R.id.pxi);
        }
        this.LLJJI = c16f5;
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KIE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, null, new C0KGJ(this, view), 6);
    }
}
