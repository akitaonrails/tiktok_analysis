package com.ss.android.ugc.aweme.tako.botpage.cards.answer.video;

import X.C0DSB;
import X.C0HZQ;
import X.C0R3F;
import X.C1858670yT3;
import X.C1913307eV;
import X.C427660Gpo;
import X.C723830SaL;
import X.InterfaceC1860810yWV;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerVideoListAssem extends TakoAnswerBaseAssem<C0R3F> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Kq() {
        super.Kq();
        C1913307eV.LIZIZ(LJJIJL().findViewById(R.id.eto));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        return pq();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        View viewFindViewById = LJJIJL().findViewById(R.id.bh2);
        if (viewFindViewById instanceof C427660Gpo) {
            return (C427660Gpo) viewFindViewById;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Vr, reason: merged with bridge method [inline-methods] */
    public final void up(C0R3F c0r3f) {
        TakoPassExt takoPassExt;
        super.up(c0r3f);
        if (C1858670yT3.LJIILL(c0r3f.LL.LLILLL)) {
            TakoMixFeed takoMixFeed = c0r3f.LLILZLL;
            boolean z = false;
            if (takoMixFeed != null && (takoPassExt = takoMixFeed.ext) != null && takoPassExt.isBigVideo == 1) {
                z = true;
            }
            if (z) {
                C0DSB.LIZIZ(LJJIJL().findViewById(R.id.etr));
                C0DSB.LIZJ(LJJIJL().findViewById(R.id.eto));
            } else {
                C0DSB.LIZJ(LJJIJL().findViewById(R.id.etr));
                C0DSB.LIZIZ(LJJIJL().findViewById(R.id.eto));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 11));
    }
}
