package com.ss.android.ugc.aweme.selector.choosegroup;

import X.C01GW;
import X.C1225220hzM;
import X.C1819620xS4;
import X.C1841350y17;
import X.C197039127h;
import X.C427870Gq9;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupChooseGroupRowCell extends PowerCell<C1225220hzM> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1801));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1805));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1804));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1802));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1803));

    public final C1841350y17 L5() {
        return (C1841350y17) this.LLILZ.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new AbS700S0100000_19(this, 2), this.itemView);
        C786410Ut5.I7(new AbS700S0100000_19(this, 3), (View) this.LLILZIL.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
    }

    public final void I5(C1225220hzM c1225220hzM) {
        boolean z;
        float f;
        String str = c1225220hzM.LLILLJJLI;
        if (str != null) {
            C1819620xS4.LIZ().setUrl(str).LJJI((View) this.LL.getValue());
        }
        ((TextView) this.LLILLJJLI.getValue()).setText(c1225220hzM.LLILLL);
        String str2 = c1225220hzM.LLILZ;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILLL.getValue(), 8);
        } else {
            ((TextView) this.LLILLL.getValue()).setText(str2);
            C786410Ut5.LLLLZLL((TuxTextView) this.LLILLL.getValue(), 0);
        }
        if (c1225220hzM.LLJ) {
            C786410Ut5.LLLLZ(L5(), 8);
            C786410Ut5.LLLLLLJ((C197039127h) this.LLILZIL.getValue(), 0);
        } else {
            C786410Ut5.LLLLLLJ((C197039127h) this.LLILZIL.getValue(), 8);
            if (!c1225220hzM.LLILZLL) {
                C786410Ut5.LLLLZ(L5(), 8);
            } else {
                C786410Ut5.LLLLZ(L5(), 0);
                L5().setChecked(c1225220hzM.LLIZ);
                L5().setClickable(false);
            }
        }
        if (c1225220hzM.LLIZLLLIL && !c1225220hzM.LLJ) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.t5((C427870Gq9) this.LL.getValue(), f);
        C786410Ut5.B5((TuxTextView) this.LLILLJJLI.getValue(), f);
        C786410Ut5.B5((TuxTextView) this.LLILLL.getValue(), f);
        C1841350y17 c1841350y17L5 = L5();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1841350y17L5);
        c1841350y17L5.setAlpha(f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C1225220hzM) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dcr, false, 4, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        I5((C1225220hzM) interfaceC1891350zJl);
    }
}
