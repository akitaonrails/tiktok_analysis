package com.ss.android.ugc.aweme.tako.botpage.cards.answer.userlist;

import X.C0HZQ;
import X.C0R35;
import X.C427660Gpo;
import X.C723830SaL;
import X.InterfaceC1860810yWV;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoAnswerUserListAssem extends TakoAnswerBaseAssem<C0R35> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        return pq();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 348));
    }
}
