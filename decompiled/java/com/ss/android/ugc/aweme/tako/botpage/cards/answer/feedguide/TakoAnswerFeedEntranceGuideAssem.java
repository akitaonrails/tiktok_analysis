package com.ss.android.ugc.aweme.tako.botpage.cards.answer.feedguide;

import X.C0HZQ;
import X.C13MK;
import X.C1856990yQL;
import X.C2188811AlT;
import X.C321970Cjj;
import X.C326880Cre;
import X.C427660Gpo;
import X.C723830SaL;
import X.InterfaceC1860810yWV;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerFeedEntranceGuideAssem extends TakoAnswerBaseAssem<C1856990yQL> {
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
    public final void up(C1856990yQL c1856990yQL) {
        Message messageLIZ;
        super.up(c1856990yQL);
        C326880Cre c326880Cre = c1856990yQL.LLJJIJI;
        if (c326880Cre != null && (messageLIZ = C321970Cjj.LIZ(c326880Cre)) != null) {
            AwS428S0200000_27 awS428S0200000_27 = new AwS428S0200000_27(c1856990yQL, this, 30);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("message:");
            sbLIZ.append(messageLIZ.uuid);
            C13MK.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "tikbot_guide_bar_show", awS428S0200000_27);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 198));
    }
}
