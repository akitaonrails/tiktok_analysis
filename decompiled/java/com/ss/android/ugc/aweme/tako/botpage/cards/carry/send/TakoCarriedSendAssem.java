package com.ss.android.ugc.aweme.tako.botpage.cards.carry.send;

import X.C0HZQ;
import X.C14J2;
import X.C1857110yQX;
import X.C427660Gpo;
import X.C723830SaL;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCarriedSendAssem extends TakoSendBaseAssem<C1857110yQX> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmp;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C1857110yQX c1857110yQX) {
        super.up(c1857110yQX);
        String str = c1857110yQX.LLJ;
        if (str != null && str.length() != 0) {
            C14J2 c14j2 = this.LLLIL;
            if (c14j2 != null) {
                C786410Ut5.LJZL(0, c14j2);
                return;
            }
            return;
        }
        C14J2 c14j22 = this.LLLIL;
        if (c14j22 == null) {
            return;
        }
        C786410Ut5.LJZL(8, c14j22);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 226));
    }
}
