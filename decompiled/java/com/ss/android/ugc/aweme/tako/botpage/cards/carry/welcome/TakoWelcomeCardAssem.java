package com.ss.android.ugc.aweme.tako.botpage.cards.carry.welcome;

import X.C0HZQ;
import X.C0R38;
import X.C14J2;
import X.C1858660yT2;
import X.C1859620yUa;
import X.C1918907fP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C723830SaL;
import X.C786410Ut5;
import X.InterfaceC1860810yWV;
import X.InterfaceC689540R2y;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoWelcomeCardAssem extends TakoAnswerBaseAssem<C0R38> {
    public TuxTextView LLLLZLLLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fns;
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
            View viewFindViewById = c14j2.findViewById(R.id.ewp);
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
        C0R38 c0r38 = (C0R38) interfaceC689540R2y;
        super.up(c0r38);
        TuxTextView tuxTextView = this.LLLLZLLLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c0r38.LLJJIJIIJIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    /* JADX INFO: renamed from: Iq */
    public final void up(C1858660yT2 c1858660yT2) {
        C0R38 c0r38 = (C0R38) c1858660yT2;
        super.up(c0r38);
        TuxTextView tuxTextView = this.LLLLZLLLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c0r38.LLJJIJIIJIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ewp);
        this.LLLLZLLLI = tuxTextView;
        if (tuxTextView != null) {
            if (C1859620yUa.LIZIZ()) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setTuxFont(101);
                tuxTextView.setTextColorRes(R.attr.a1h);
                tuxTextView.setLineSpacing(C418440Gaw.LIZIZ(3), 1.0f);
            }
        }
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 227));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C0R38 c0r38 = (C0R38) obj;
        super.up(c0r38);
        TuxTextView tuxTextView = this.LLLLZLLLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c0r38.LLJJIJIIJIL);
        }
    }
}
