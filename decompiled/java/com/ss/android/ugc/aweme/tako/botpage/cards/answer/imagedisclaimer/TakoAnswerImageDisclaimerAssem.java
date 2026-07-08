package com.ss.android.ugc.aweme.tako.botpage.cards.answer.imagedisclaimer;

import X.C1857710yRV;
import X.C426750GoL;
import X.C723830SaL;
import X.InterfaceC689540R2y;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoLocalAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerImageDisclaimerAssem extends TakoLocalAnswerBaseAssem<C1857710yRV> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    public final void Fp() {
        View viewFindViewById = LJJIJL().findViewById(R.id.iah);
        if (viewFindViewById != null) {
            C426750GoL.LJIIL(viewFindViewById, null, null, null, 0, 23);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    /* JADX INFO: renamed from: Ap */
    public final /* bridge */ /* synthetic */ void up(InterfaceC689540R2y interfaceC689540R2y) {
        Fp();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoLocalAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 211));
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        Fp();
    }
}
