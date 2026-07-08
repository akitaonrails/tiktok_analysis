package com.ss.android.ugc.aweme.ecommerce.base.address.widget;

import X.C01GW;
import X.C0H1U;
import X.C0H9H;
import X.C0H9I;
import X.C1744700vVE;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class InputResultIndicator extends LinearLayout implements c {
    public final View LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;

    @Override // p8b.c
    public String getViewName() {
        return "InputResultIndicator";
    }

    private final bha.c getDynamicStyle() {
        return (bha.c) this.LLIZ.getValue();
    }

    public final void setResultTextTuxFont(Integer num) {
        if (num != null) {
            this.LLILLL.setTuxFont(num.intValue());
        }
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet) {
        int iLIZIZ;
        super(context, attributeSet, 0);
        this.LLILZLL = true;
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 8));
        int iLIZ = C0H9I.LIZ(0.5d);
        int iLIZ2 = C960203pA.LIZ(R.attr.nb, context);
        this.LLILZ = iLIZ2;
        this.LLILZIL = C960203pA.LIZ(R.attr.zs, context);
        this.LLILZLL = true;
        C786410Ut5.LJLLJ(context, R.layout.ana, this);
        View viewFindViewById = findViewById(R.id.tdq);
        this.LL = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tdo);
        this.LLILLJJLI = viewFindViewById2;
        this.LLILLL = (TuxTextView) findViewById(R.id.tdr);
        if (getDynamicStyle().LJJLL()) {
            iLIZIZ = C0H9H.LIZIZ(8);
        } else {
            iLIZIZ = C0H9H.LIZIZ(0);
        }
        C0H1U.LJII(iLIZIZ, viewFindViewById2);
        C1744700vVE.LJIIIIZZ(iLIZ, viewFindViewById);
        C786410Ut5.LJLLLLLL(this.LLILZLL ? 0 : 8, viewFindViewById);
        viewFindViewById.setBackgroundColor(iLIZ2);
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
    }
}
