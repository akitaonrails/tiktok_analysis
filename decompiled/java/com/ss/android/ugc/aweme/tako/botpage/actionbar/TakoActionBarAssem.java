package com.ss.android.ugc.aweme.tako.botpage.actionbar;

import X.C0H9Q;
import X.C0R2Q;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1860520yW2;
import X.C1861630yXp;
import X.C21657619pO;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoActionBarAssem extends TakoBottomBarAssem<TakoActiveActionItem> {
    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C0H9Q c0h9qWN2;
        super.onPause();
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoChatUIAbility.class, null);
        if (takoChatUIAbility == null || (c0h9qWN2 = takoChatUIAbility.wN2()) == null) {
            return;
        }
        c0h9qWN2.LL = true;
        int visibility = c0h9qWN2.getVisibility();
        c0h9qWN2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0h9qWN2);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        TakoActiveActionItem takoActiveActionItem;
        super.onResume();
        TakoActiveActionItem takoActiveActionItem2 = (TakoActiveActionItem) this.LLJJIJIL;
        long jLIZIZ = C0R2Q.LIZIZ(takoActiveActionItem2 != null ? Long.valueOf(takoActiveActionItem2.id) : null);
        C1860520yW2.LIZ.getClass();
        long j = C1860520yW2.LIZ().id;
        if (jLIZIZ <= 0 || j == jLIZIZ || (takoActiveActionItem = (TakoActiveActionItem) this.LLJJIJIL) == null) {
            return;
        }
        C21657619pO c21657619pO = this.LLJJJ;
        if (c21657619pO != null) {
            c21657619pO.LIZIZ();
        }
        this.LLJJJ = null;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS396S0200000_30(this, takoActiveActionItem, 33)));
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBottomBarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (getContext() != null) {
            hp();
        }
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.Zd(new AwS612S0100000_33(this, 147));
        }
    }
}
