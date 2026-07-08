package com.ss.android.ugc.aweme.explore.assem.creation;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1057880ddS;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1481605r4;
import X.C438710HIf;
import X.C572330McZ;
import X.C786410Ut5;
import X.InterfaceC427710Gpt;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS77S0200000_8;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ExploreText2ImageComponent extends UISlotAssem {
    public final C572330McZ LLJJI = new InterfaceC427710Gpt() { // from class: X.0McZ
        @Override // X.InterfaceC427710Gpt
        public final void LLLLLLZZ(int i, User user, User user2) {
            C1481605r4.LIZIZ(new ARunnableS108S0100000_8(this.LL, 11));
        }
    };

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.c5o;
    }

    public final void hp() {
        String string;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        TextView textView = (TextView) LJJIJL().findViewById(R.id.xkz);
        if (textView != null) {
            Context context = getContext();
            textView.setText(context != null ? context.getString(2131829903) : null);
        }
        TextView textView2 = (TextView) LJJIJL().findViewById(R.id.xkr);
        if (textView2 != null) {
            Context context2 = getContext();
            if (context2 == null || (string = context2.getString(2131829904)) == null) {
                string = "";
            }
            textView2.setText(string);
        }
        C0XQ7.LJ();
        User curUser = C0XQ7.LIZ.LJIIJ().getCurUser();
        TextView textView3 = (TextView) LJJIJL().findViewById(R.id.xku);
        if (textView3 != null) {
            textView3.setText(C1057880ddS.LIZ(curUser.getNickname()));
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(curUser.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) LJJIJL().findViewById(R.id.xkq));
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIIJ().LJIILLIIL(this.LLJJI);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1481605r4.LIZIZ(new ARunnableS77S0200000_8(view, this, 3));
    }
}
