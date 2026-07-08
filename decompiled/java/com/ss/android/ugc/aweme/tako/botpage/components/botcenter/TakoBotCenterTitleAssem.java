package com.ss.android.ugc.aweme.tako.botpage.components.botcenter;

import X.C1559260qg8;
import X.C20237414Gm;
import X.C723580SZw;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.ui.TakoBotCenterAbilityImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoBotCenterTitleAssem extends UISlotAssem implements InterfaceC1554640qYg {
    public final TakoBotCenterAbilityImpl LLJJI = new TakoBotCenterAbilityImpl();
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C20237414Gm.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fk4;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.x5_), new ACListenerS158S0100000_24(this, 57));
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1727051104) {
            return null;
        }
        return this.LLJJI;
    }
}
