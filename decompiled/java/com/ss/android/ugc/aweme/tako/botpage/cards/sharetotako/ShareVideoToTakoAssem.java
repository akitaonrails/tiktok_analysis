package com.ss.android.ugc.aweme.tako.botpage.cards.sharetotako;

import X.C01GW;
import X.C0HZQ;
import X.C123100dR;
import X.C13LC;
import X.C14J2;
import X.C1558520qew;
import X.C1857200yQg;
import X.C1863850ybP;
import X.C19ME;
import X.C339410DSh;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C723830SaL;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class ShareVideoToTakoAssem extends TakoSendBaseAssem<C1857200yQg> {
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 763));
    public C339410DSh LLLJL;
    public AIBotInfo LLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnj;
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
    /* JADX INFO: renamed from: Wp, reason: merged with bridge method [inline-methods] */
    public final void up(C1857200yQg c1857200yQg) {
        int i;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        super.up(c1857200yQg);
        C339410DSh c339410DSh = this.LLLJL;
        if (c339410DSh != null) {
            c339410DSh.LIZ(c1857200yQg.LLILZIL);
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            long j = c1863850ybP.LLJJ;
            int i2 = c1863850ybP.LLJJI;
            String str = c1863850ybP.LLJJIII;
            if (str == null) {
                str = "";
            }
            this.LLLL = new AIBotInfo(j, str, null, i2, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null);
        }
        C14J2 c14j2 = this.LLLIL;
        if (c14j2 != null) {
            if (C123100dR.LIZ(c1857200yQg.LLJI)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c14j2);
        }
        C14J2 c14j22 = this.LLLIL;
        if (c14j22 != null) {
            c14j22.LIZIZ(null, Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(5.0f))), null, null);
        }
        String str2 = c1857200yQg.LLJI;
        if (str2 == null || str2.length() == 0) {
            C0HZQ c0hzq = (C0HZQ) LJJIJL().findViewById(R.id.umx);
            C19ME c19me = (C19ME) c0hzq.getLayoutParams();
            c19me.topToTop = R.id.eto;
            c19me.bottomToBottom = R.id.eto;
            C786410Ut5.N6(c0hzq, c19me);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C339410DSh c339410DSh = (C339410DSh) view.findViewById(R.id.o_4);
        this.LLLJL = c339410DSh;
        if (c339410DSh != null) {
            c339410DSh.setOnNotSentClickCallback(new AwS606S0100000_27(this, 240));
        }
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 241));
    }
}
