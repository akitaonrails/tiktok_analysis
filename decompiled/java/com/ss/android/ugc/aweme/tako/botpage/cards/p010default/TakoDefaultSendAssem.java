package com.ss.android.ugc.aweme.tako.botpage.cards.p010default;

import X.C01GW;
import X.C0HZQ;
import X.C1857180yQe;
import X.C427660Gpo;
import X.C452501pT;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoDefaultSendAssem extends TakoSendBaseAssem<C1857180yQe> {
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 751));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fms;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }
}
