package com.ss.android.ugc.aweme.im.ai.impl.bot.chat.title;

import X.C1383370m6R;
import X.C1559260qg8;
import X.C1660206em;
import X.C723580SZw;
import X.C786410Ut5;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BotTitleBarRightAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1660206em.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqb;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k02);
        if (tuxIconView != null) {
            tuxIconView.setTintColor(C1383370m6R.LJFF(R.attr.a1h));
            C786410Ut5.LJLLLLLL(0, tuxIconView);
            tuxIconView.setContentDescription(C1383370m6R.LJIIJ(R.string.loy));
            C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 15));
        }
    }
}
