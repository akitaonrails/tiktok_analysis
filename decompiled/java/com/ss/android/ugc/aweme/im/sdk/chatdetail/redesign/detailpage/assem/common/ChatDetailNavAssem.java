package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common;

import X.C01GW;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1509305vX;
import X.C1A61;
import X.C1A62;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public abstract class ChatDetailNavAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS577S0100000_33(this, 2408));
    public final C01GW LLJ = C1509305vX.LIZ(new AwS577S0100000_33(this, 2409));

    public void Go() {
    }

    public abstract void Ho();

    public C1A62 Lo() {
        return null;
    }

    public abstract void No();

    public final TuxNavBar Jo() {
        return (TuxNavBar) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        C786410Ut5.W4((LinearLayout) this.LLJ.getValue(), 0.0f);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            Jo().setNavBackground(numLIZJ.intValue());
        }
        C786410Ut5.i9(Jo(), new View.OnClickListener() { // from class: X.1A63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        Jo().LJIIZILJ(false);
        TuxNavBar tuxNavBarJo = Jo();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LJIIIIZZ = C1383370m6R.LJIIJ(R.string.e8n);
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS577S0100000_33(this, 2));
        tuxNavBarJo.LIZIZ(c1251150ifB);
        C1A62 c1a62Lo = Lo();
        if (c1a62Lo != null) {
            int i = C1A61.LIZ[c1a62Lo.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    TuxNavBar tuxNavBarJo2 = Jo();
                    C1251150ifB c1251150ifB2 = new C1251150ifB();
                    c1251150ifB2.LIZLLL();
                    c1251150ifB2.LIZJ = R.raw.icon_ellipsis_horizontal;
                    c1251150ifB2.LIZLLL = true;
                    c1251150ifB2.LIZJ(new AwS577S0100000_33(this, 0));
                    tuxNavBarJo2.LIZ(c1251150ifB2);
                }
            } else {
                TuxNavBar tuxNavBarJo3 = Jo();
                C1251150ifB c1251150ifB3 = new C1251150ifB();
                c1251150ifB3.LIZLLL();
                c1251150ifB3.LIZJ = R.raw.icon_flag;
                c1251150ifB3.LIZLLL = true;
                c1251150ifB3.LIZJ(new AwS577S0100000_33(this, 1));
                tuxNavBarJo3.LIZ(c1251150ifB3);
            }
        }
        No();
    }
}
