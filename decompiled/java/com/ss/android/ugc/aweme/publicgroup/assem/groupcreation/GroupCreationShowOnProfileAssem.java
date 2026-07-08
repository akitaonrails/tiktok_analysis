package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1767606w6;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupCreationShowOnProfileAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 769));
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupCreationShowOnProfileAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/PublicGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupCreationShowOnProfileAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PublicGroupCreationVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 768), AFwS229S0000000_2.get$arr$(471), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cjh;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        C786410Ut5.C7((C21411818qq) this.LLJJI.getValue(), new C1767606w6(this, 3));
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Vx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1228870i5F) obj).LLILZLL);
            }
        }, null, new AwS616S0100000_2(this, 59), 6);
    }
}
