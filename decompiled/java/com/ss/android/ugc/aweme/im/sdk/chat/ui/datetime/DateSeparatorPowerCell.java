package com.ss.android.ugc.aweme.im.sdk.chat.ui.datetime;

import X.C01GW;
import X.C1279804zc;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC432220GxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.EasterEggShareMessageAnimatorAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class DateSeparatorPowerCell extends PowerCell<C1279804zc> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 551));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 552));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ckh;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LL.getValue();
        if (easterEggShareMessageAnimatorAbility != null) {
            easterEggShareMessageAnimatorAbility.LIZLLL(this.itemView, EnumC432220GxA.INLINE);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1279804zc c1279804zc = (C1279804zc) interfaceC1891350zJl;
        String str = c1279804zc.LLILLJJLI;
        if (str != null && str.length() != 0) {
            ((TextView) this.LLILLJJLI.getValue()).setText(str);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILLJJLI.getValue(), 0);
            C426750GoL.LJIIIZ((View) this.LLILLJJLI.getValue(), null, null, null, Integer.valueOf(c1279804zc.LLILZ.getPaddingDp()), false, 23);
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILLJJLI.getValue(), 8);
        }
        EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LL.getValue();
        if (easterEggShareMessageAnimatorAbility != null) {
            easterEggShareMessageAnimatorAbility.LIZ(this.itemView, EnumC432220GxA.INLINE);
        }
    }
}
