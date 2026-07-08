package com.ss.android.ugc.aweme.tako.botpage.cards.answer.videogeneration;

import X.C01GW;
import X.C0HZQ;
import X.C14J2;
import X.C1856840yQ6;
import X.C1856960yQI;
import X.C1857020yQO;
import X.C1857280yQo;
import X.C427660Gpo;
import X.C436180H8m;
import X.C452501pT;
import X.C723830SaL;
import X.C724240Sb0;
import X.InterfaceC665370Q7z;
import X.ViewOnLongClickListenerC1864690ycl;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerVideoGenerationAssem extends TakoAnswerBaseAssem<C1857020yQO> {
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 730));
    public View LLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    /* JADX INFO: renamed from: Vr, reason: merged with bridge method [inline-methods] */
    public final C14J2 Tp() {
        C14J2 c14j2Pq = pq();
        C1856960yQI.LIZ.getClass();
        if (C1856960yQI.LIZ()) {
            c14j2Pq.getLayoutParams().width = -1;
            return c14j2Pq;
        }
        c14j2Pq.getLayoutParams().width = -2;
        return c14j2Pq;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void jr() {
        ViewGroup viewGroupY4 = Y4();
        if (viewGroupY4 != null) {
            viewGroupY4.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wr, reason: merged with bridge method [inline-methods] */
    public final void up(C1857020yQO c1857020yQO) {
        boolean z;
        C1857280yQo.LIZJ(LJJIJL(), C1857280yQo.LIZ((TakoCardAbility) this.LLLLZLLLI.getValue()));
        super.up(c1857020yQO);
        View view = this.LLLZ;
        if (view != null) {
            String str = c1857020yQO.LLJJJ;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            C436180H8m.LIZJ(view, !z);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 47));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final List Wp(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message) {
        return C1856840yQ6.LIZ(view, message, interfaceC665370Q7z, getContext(), null, C1856840yQ6.LIZIZ(C724240Sb0.LIZ(this), message, interfaceC665370Q7z, null));
    }
}
