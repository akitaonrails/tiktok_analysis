package com.ss.android.ugc.aweme.tako.botpage.vm.ability;

import X.C01GW;
import X.C0DSB;
import X.C0PEM;
import X.C20227614Cs;
import X.C2296808zG;
import X.C23250099c;
import X.C332580D2a;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoAIBotUIAbility implements ITakoAIBotUIAbility {
    public final TakoEnterParams LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public TakoAIBotUIAbility() {
        this(null);
    }

    public final boolean LIZ() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final AIBotInfo getBotInfo() {
        TakoEnterParams takoEnterParams = this.LL;
        if (takoEnterParams != null) {
            return takoEnterParams.botInfo;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final boolean ve2() {
        TakoEnterParams takoEnterParams = this.LL;
        return takoEnterParams != null && C20227614Cs.LIZLLL(takoEnterParams);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final boolean wJ1() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final Integer BV1() {
        if (LIZ()) {
            return Integer.valueOf(R.attr.zj);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final boolean RL() {
        return LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final Integer YC0() {
        TakoEnterParams takoEnterParams;
        AIBotInfo aIBotInfo;
        String str;
        if (!LIZ() || (takoEnterParams = this.LL) == null || (aIBotInfo = takoEnterParams.botInfo) == null || (str = aIBotInfo.bubbleColor) == null || str.length() <= 0) {
            return null;
        }
        return Integer.valueOf(ColorProtector.parseColor(str));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final boolean hH2() {
        TakoEnterParams takoEnterParams;
        AIBotInfo aIBotInfo;
        return LIZ() && ((takoEnterParams = this.LL) == null || (aIBotInfo = takoEnterParams.botInfo) == null || !aIBotInfo.isNovelBot());
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final Integer op2() {
        if (LIZ()) {
            return Integer.valueOf(R.attr.zd);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final Integer zH() {
        TakoEnterParams takoEnterParams;
        AIBotInfo aIBotInfo;
        String str;
        if (!LIZ() || (takoEnterParams = this.LL) == null || (aIBotInfo = takoEnterParams.botInfo) == null || (str = aIBotInfo.hintContentColor) == null || str.length() <= 0) {
            return null;
        }
        return Integer.valueOf(ColorProtector.parseColor(str));
    }

    public TakoAIBotUIAbility(TakoEnterParams takoEnterParams) {
        this.LL = takoEnterParams;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 266));
        this.LLILLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 267));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final void MI2(View view) {
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C332580D2a(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility
    public final void xK0(View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) C0DSB.LIZ(200);
            }
            if (view != null) {
                C786410Ut5.W5(view, layoutParams);
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
    }
}
