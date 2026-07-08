package com.ss.android.ugc.aweme.tako.botpage.cards.answer.userlanding;

import X.AbstractC848400XPy;
import X.C0HZQ;
import X.C0R34;
import X.C0XQ7;
import X.C14J2;
import X.C1860520yW2;
import X.C2188811AlT;
import X.C427660Gpo;
import X.C723830SaL;
import X.InterfaceC1860810yWV;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoUserLandingStoryAssem extends TakoAnswerBaseAssem<C0R34> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnr;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        View viewFindViewById = LJJIJL().findViewById(R.id.ety);
        if (viewFindViewById instanceof C14J2) {
            return (C14J2) viewFindViewById;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Vr, reason: merged with bridge method [inline-methods] */
    public final void up(C0R34 c0r34) {
        super.up(c0r34);
        C1860520yW2.LIZ.getClass();
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_showed_user_landing_story");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 361));
    }
}
