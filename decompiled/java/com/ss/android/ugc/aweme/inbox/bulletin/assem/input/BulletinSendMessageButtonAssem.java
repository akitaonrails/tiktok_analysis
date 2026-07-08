package com.ss.android.ugc.aweme.inbox.bulletin.assem.input;

import X.AbstractC738140SxQ;
import X.C0OWL;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C197039127h;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSendMessageButtonAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIII;
    public C197039127h LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a87;
    }

    public BulletinSendMessageButtonAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 392);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(227), new AwS553S0100000_9((AbstractC738140SxQ) this, 393), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0OWd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C620540OVo) obj).LLILZLL);
            }
        }, null, new AwS623S0100000_9(this, 52), 6);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.d5c);
        this.LLJJIJI = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9(this, 38));
        }
    }
}
