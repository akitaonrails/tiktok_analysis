package com.ss.android.ugc.aweme.tako.botpage.cards.novel.text;

import X.C0HZQ;
import X.C0R33;
import X.C1697630uHJ;
import X.C1860130yVP;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C723830SaL;
import X.C814420VxA;
import X.InterfaceC1860040yVG;
import X.InterfaceC1860810yWV;
import android.text.TextPaint;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoNovelTextAssem extends TakoAnswerBaseAssem<C0R33> {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmg;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final /* bridge */ /* synthetic */ InterfaceC1860810yWV Tp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final InterfaceC1860040yVG rA0() {
        return this.LLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final void hw(C1860130yVP c1860130yVP) {
        TextPaint paint;
        this.LLLLZI = c1860130yVP;
        float fLIZIZ = C1697630uHJ.LIZIZ();
        C1860130yVP c1860130yVP2 = this.LLLLZI;
        if (c1860130yVP2 != null && (paint = c1860130yVP2.getPaint()) != null) {
            paint.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) * fLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS609S0100000_30(this, 100));
    }
}
