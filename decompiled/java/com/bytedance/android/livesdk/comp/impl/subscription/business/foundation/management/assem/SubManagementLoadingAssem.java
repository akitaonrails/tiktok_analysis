package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.assem;

import X.C019F;
import X.C055P;
import X.C06L1;
import X.C06L2;
import X.C06L3;
import X.C13LE;
import X.C1637806bA;
import X.C16FZ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.vm.SubManagementPageVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class SubManagementLoadingAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public FrameLayout LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubManagementLoadingAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/management/vm/SubManagementPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubManagementLoadingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubManagementPageVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055P(c19719912DlLIZ), new C06L3(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hnk;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06L4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C06L6) obj).LL;
            }
        }, null, new C06L1(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.06L5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C06L6) obj).LLILLJJLI;
            }
        }, null, new C06L2(this), 6);
        this.LLJJIII = (FrameLayout) view.findViewById(R.id.nlo);
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = this.LLJJIII;
            if (frameLayout != null && frameLayout.getChildCount() == 0) {
                C16FZ c16fz = new C16FZ(context, null);
                FrameLayout frameLayout2 = this.LLJJIII;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c16fz);
                }
            }
            FrameLayout frameLayout3 = this.LLJJIII;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(0, frameLayout3);
            }
        }
        SubManagementPageVM.vQ2((SubManagementPageVM) this.LLJJI.getValue());
    }
}
