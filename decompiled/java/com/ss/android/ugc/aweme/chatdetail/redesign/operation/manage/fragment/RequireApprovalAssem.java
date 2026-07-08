package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C1767606w6;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class RequireApprovalAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RequireApprovalAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RequireApprovalAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 75), AFwS229S0000000_2.get$arr$(89), null, true);
        this.LLJJIII = C1509305vX.LIZ(new AwS546S0100000_2(this, 76));
        this.LLJJIJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 77));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ci4;
    }

    public final ManageGroupViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (ManageGroupViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06dC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLILZ);
            }
        }, null, new AwS616S0100000_2(this, 18), 6);
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.06dD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.06dI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1651206dK) obj).LLILZLL;
            }
        }, null, new AwS651S0100000_2(this, 1), 12);
        C786410Ut5.C7((C21411818qq) this.LLJJIJI.getValue(), new C1767606w6(this, 2));
    }
}
