package com.ss.android.ugc.aweme.tako.botpage.cards.answer.loading;

import X.C0HZQ;
import X.C14J2;
import X.C1857810yRf;
import X.C1858660yT2;
import X.C19MB;
import X.C326880Cre;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C723830SaL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1860810yWV;
import X.InterfaceC689540R2y;
import Y.ARunnableS102S0100000_2;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerLoadingAssem extends TakoAnswerBaseAssem<C1857810yRf> {
    public C326880Cre LLLLZLLLI;
    public String LLLZ;

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmi;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        View viewFindViewById = LJJIJL().findViewById(R.id.ety);
        if (viewFindViewById instanceof C14J2) {
            return (C14J2) viewFindViewById;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    /* JADX INFO: renamed from: Ap */
    public final void up(InterfaceC689540R2y interfaceC689540R2y) {
        C1857810yRf c1857810yRf = (C1857810yRf) interfaceC689540R2y;
        super.up(c1857810yRf);
        this.LLLLZLLLI = c1857810yRf.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    /* JADX INFO: renamed from: Iq */
    public final void up(C1858660yT2 c1858660yT2) {
        C1857810yRf c1857810yRf = (C1857810yRf) c1858660yT2;
        super.up(c1857810yRf);
        this.LLLLZLLLI = c1857810yRf.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void ir(C19MB c19mb) {
        c19mb.LJIIIZ(R.id.esh, 3, R.id.o6x, 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 212));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C1857810yRf c1857810yRf = (C1857810yRf) obj;
        super.up(c1857810yRf);
        this.LLLLZLLLI = c1857810yRf.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Gq(View view, C1858660yT2 c1858660yT2) {
        String str;
        if (!Intrinsics.LJFF(((C1857810yRf) c1858660yT2).LLJJIJI.LLILLL.uuid, this.LLLZ)) {
            C326880Cre c326880Cre = this.LLLLZLLLI;
            if (c326880Cre != null) {
                str = c326880Cre.LLILLL.uuid;
            } else {
                str = null;
            }
            this.LLLZ = str;
            C786410Ut5.T4(view, 0.0f);
            C786410Ut5.LJLLLLLL(0, view);
            HandlerHook.viewPost(view, new ARunnableS102S0100000_2(view, 84));
        }
    }
}
