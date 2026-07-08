package com.ss.android.ugc.aweme.creativedetail.assem;

import X.C019F;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C627830Ojt;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creativedetail.viewmodel.CreativeToolDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolDescAssem extends DynamicAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public String LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreativeToolDescAssem.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/creativedetail/viewmodel/CreativeToolDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CreativeToolDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CreativeToolDetailViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 89), AFwS240S0000000_9.get$arr$(66), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C627830Ojt.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ftu;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Ojq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C627720Oji) obj).LL;
            }
        }, null, null, null, new AwS375S0200000_9(this, view, 23), 14, null);
    }
}
