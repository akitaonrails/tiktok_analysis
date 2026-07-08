package com.ss.android.ugc.aweme.mix.choose;

import X.C019F;
import X.C1158260gFM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistChoosePanelCreateAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1158260gFM.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlaylistChoosePanelCreateAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/mix/choose/PlaylistChoosePanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlaylistChoosePanelCreateAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PlaylistChoosePanelViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 409), AFwS256S0000000_18.get$arr$(133), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dwt;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.quk);
        View viewFindViewById = view.findViewById(R.id.qul);
        TextView textView = (TextView) view.findViewById(R.id.qum);
        Context context = getContext();
        if (context == null || (string = context.getString(2131840549)) == null) {
            string = "";
        }
        textView.setText(string);
        C786410Ut5.R7(linearLayout, new ACListenerS153S0100000_18(this, 32));
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gVq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1168510gVt) obj).LLILZIL);
            }
        }, null, new AwS632S0100000_18(viewFindViewById, 42), 6);
    }
}
