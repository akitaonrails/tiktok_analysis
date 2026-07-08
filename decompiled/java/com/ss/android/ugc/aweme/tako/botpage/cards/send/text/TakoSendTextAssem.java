package com.ss.android.ugc.aweme.tako.botpage.cards.send.text;

import X.C01GW;
import X.C0DSB;
import X.C0HZQ;
import X.C13LC;
import X.C1558520qew;
import X.C1857120yQY;
import X.C1857750yRZ;
import X.C1859620yUa;
import X.C1860910yWf;
import X.C1863850ybP;
import X.C1918907fP;
import X.C1919007fQ;
import X.C339410DSh;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C723830SaL;
import X.C814420VxA;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSendTextAssem extends TakoSendBaseAssem<C1857120yQY> {
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 762));
    public C339410DSh LLLJL;
    public AIBotInfo LLLL;
    public FrameLayout LLLLII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fng;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void yk0(View view, C1860910yWf c1860910yWf) {
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
    /* JADX INFO: renamed from: Wp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C1857120yQY c1857120yQY) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        super.up(c1857120yQY);
        C339410DSh c339410DSh = this.LLLJL;
        if (c339410DSh != null) {
            c339410DSh.LIZ(c1857120yQY.LLILZIL);
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            long j = c1863850ybP.LLJJ;
            int i = c1863850ybP.LLJJI;
            String str = c1863850ybP.LLJJIII;
            if (str == null) {
                str = "";
            }
            this.LLLL = new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null);
        }
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZ() && c1857120yQY.LLIZ.length() > 0) {
            C0DSB.LIZJ(this.LLLLII);
        } else {
            C0DSB.LIZIZ(this.LLLLII);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C339410DSh c339410DSh;
        super.onViewCreated(view);
        this.LLLJL = (C339410DSh) view.findViewById(R.id.o_4);
        if (C1859620yUa.LIZ() && (c339410DSh = this.LLLJL) != null) {
            C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), c339410DSh);
        }
        C339410DSh c339410DSh2 = this.LLLJL;
        if (c339410DSh2 != null) {
            c339410DSh2.setOnNotSentClickCallback(new AwS606S0100000_27(this, 238));
        }
        this.LLLLII = (FrameLayout) view.findViewById(R.id.et0);
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZ()) {
            C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 239));
            FrameLayout frameLayout = this.LLLLII;
            if (frameLayout != null) {
                C1857750yRZ.LJIIJJI(C1918907fP.LIZ(), frameLayout);
            }
        }
    }
}
