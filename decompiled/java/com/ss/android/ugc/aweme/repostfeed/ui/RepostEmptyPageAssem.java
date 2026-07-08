package com.ss.android.ugc.aweme.repostfeed.ui;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnLongClickListenerC1208780hYq;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class RepostEmptyPageAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostEmptyPageAssem.class, "feedVM", "getFeedVM()Lcom/ss/android/ugc/aweme/repostfeed/viewmodel/RepostFeedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostEmptyPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostFeedViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2185), AFwS256S0000000_18.get$arr$(740), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.em0;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hOU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1567630qtd) obj).LLILLJJLI);
            }
        }, null, new AwS632S0100000_18(this, 188), 6);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 121), view.findViewById(R.id.t_3));
        if (ComplianceServiceProvider.LJI().LJIIJ(false)) {
            LJJIJL().setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 19));
        }
    }
}
