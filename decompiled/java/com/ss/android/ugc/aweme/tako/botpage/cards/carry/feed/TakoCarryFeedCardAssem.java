package com.ss.android.ugc.aweme.tako.botpage.cards.carry.feed;

import X.C0HZQ;
import X.C0R39;
import X.C14J2;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C723830SaL;
import X.C814420VxA;
import X.InterfaceC1860810yWV;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCarryFeedCardAssem extends TakoAnswerBaseAssem<C0R39> {
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

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Vr, reason: merged with bridge method [inline-methods] */
    public final void up(C0R39 c0r39) {
        super.up(c0r39);
        int i = c0r39.LL.LLILZ;
        C14J2 c14j2Pq = pq();
        if (c14j2Pq != null) {
            c14j2Pq.LIZIZ(Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(5.0f))), null, null, null);
        }
        if (i != 2 && i != 3) {
            return;
        }
        LJJIJL().setPadding(LJJIJL().getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), LJJIJL().getPaddingRight(), LJJIJL().getPaddingBottom());
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 178));
    }
}
