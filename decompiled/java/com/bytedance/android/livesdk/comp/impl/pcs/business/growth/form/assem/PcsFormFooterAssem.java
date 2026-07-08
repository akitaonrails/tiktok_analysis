package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.assem;

import X.C019F;
import X.C1217610hn5;
import X.C1217620hn6;
import X.C1246030iWv;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class PcsFormFooterAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public C16FS LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsFormFooterAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/form/vm/PcsFormVm;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsFormFooterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsFormVm.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217610hn5(c19719912DlLIZ), new C1217620hn6(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyl;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (C16FS) view.findViewById(R.id.q6p);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0vEc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1734460vEi) obj).LLILLL;
            }
        }, null, new C1246030iWv(this), 6);
    }
}
