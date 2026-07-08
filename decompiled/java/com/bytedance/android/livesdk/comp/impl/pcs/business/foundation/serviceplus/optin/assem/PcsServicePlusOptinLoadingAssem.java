package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem;

import X.C019F;
import X.C055C;
import X.C06V9;
import X.C06VA;
import X.C1390410mHn;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class PcsServicePlusOptinLoadingAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public ConstraintLayout LLJJIII;
    public C1390410mHn LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServicePlusOptinLoadingAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/optin/viewmodel/PcsServicePlusOptinVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServicePlusOptinLoadingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServicePlusOptinVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055C(c19719912DlLIZ), new C06VA(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz1;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (ConstraintLayout) view.findViewById(R.id.uti);
        ConstraintLayout constraintLayout = this.LLJJIII;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                C786410Ut5.W5(constraintLayout, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.LLJJIJI = (C1390410mHn) view.findViewById(R.id.utg);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xYo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1823670xYb) obj).LL;
            }
        }, null, new C06V9(this), 6);
    }
}
