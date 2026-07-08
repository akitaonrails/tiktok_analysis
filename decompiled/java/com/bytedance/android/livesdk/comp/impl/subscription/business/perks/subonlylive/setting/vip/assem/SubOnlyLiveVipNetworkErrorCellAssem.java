package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.assem;

import X.C019F;
import X.C0JB6;
import X.C0JB7;
import X.C0JB8;
import X.C13LE;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.assem.SubOnlyLiveVipNetworkErrorCellAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLiveVipNetworkErrorCellAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlyLiveVipNetworkErrorCellAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subonlylive/setting/vip/vm/SubOnlyLiveVipListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubOnlyLiveVipNetworkErrorCellAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubOnlyLiveVipListVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0JB6(c19719912DlLIZ), new C0JB8(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hnt;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.p52), new View.OnClickListener() { // from class: X.0JB5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AssemVMLazy assemVMLazy = this.LL.LLJJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SubOnlyLiveVipNetworkErrorCellAssem.LLJJIII;
                SubOnlyLiveVipListVM subOnlyLiveVipListVM = (SubOnlyLiveVipListVM) assemVMLazy.getValue();
                subOnlyLiveVipListVM.setState(new C0JB9());
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(subOnlyLiveVipListVM), C0PEM.LIZJ, null, new C0JYU(subOnlyLiveVipListVM, null), 2);
            }
        });
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0JB4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0JBB) obj).LLILLJJLI;
            }
        }, null, new C0JB7(view), 6);
    }
}
