package com.ss.android.ugc.aweme.tako.botpage.cards.p010default;

import X.C0HZQ;
import X.C14J2;
import X.C1857050yQR;
import X.C1858660yT2;
import X.C1918907fP;
import X.C426750GoL;
import X.C427660Gpo;
import X.C723830SaL;
import X.InterfaceC1860810yWV;
import X.InterfaceC689540R2y;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoDefaultAnswerAssem extends TakoAnswerBaseAssem<C1857050yQR> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmr;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        C14J2 c14j2 = (C14J2) LJJIJL().findViewById(R.id.ety);
        if (c14j2 == null) {
            return null;
        }
        if (!yp()) {
            if (!up()) {
                C426750GoL.LJIIL(c14j2, (Integer) ListProtector.get(qq(), 0), (Integer) ListProtector.get(qq(), 1), (Integer) ListProtector.get(qq(), 2), (Integer) ListProtector.get(qq(), 3), 16);
                return c14j2;
            }
            View viewFindViewById = c14j2.findViewById(R.id.eth);
            if (viewFindViewById != null) {
                C426750GoL.LJIIIZ(viewFindViewById, Integer.valueOf(C1918907fP.LIZ()), null, Integer.valueOf(C1918907fP.LIZ()), null, false, 26);
            }
        }
        return c14j2;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    /* JADX INFO: renamed from: Ap */
    public final void up(InterfaceC689540R2y interfaceC689540R2y) {
        super.up((C1858660yT2) interfaceC689540R2y);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    /* JADX INFO: renamed from: Iq */
    public final void up(C1858660yT2 c1858660yT2) {
        super.up(c1858660yT2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 228));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        super.up((C1858660yT2) obj);
    }
}
