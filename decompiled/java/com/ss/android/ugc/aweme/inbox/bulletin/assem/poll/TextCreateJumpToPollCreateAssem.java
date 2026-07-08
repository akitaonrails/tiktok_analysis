package com.ss.android.ugc.aweme.inbox.bulletin.assem.poll;

import X.C0OWL;
import X.C1559260qg8;
import X.C197039127h;
import X.C723580SZw;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class TextCreateJumpToPollCreateAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0OWL.class, "bulletin_board_edit_param"), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a8k;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.U8((C197039127h) view.findViewById(R.id.m1a), new ACListenerS144S0100000_9(this, 46));
    }
}
