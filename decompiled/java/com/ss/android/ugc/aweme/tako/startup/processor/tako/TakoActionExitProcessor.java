package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C14FD;
import X.C1860520yW2;
import X.C1861630yXp;
import X.C1862620yZQ;
import X.C1862660yZU;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoActionExitProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = 1;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        C1860520yW2.LIZ.getClass();
        if (C1860520yW2.LIZ().id > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        C1860520yW2.LIZ.getClass();
        TakoActiveActionItem takoActiveActionItemLIZ = C1860520yW2.LIZ();
        C1860520yW2.LJIJJ(new TakoActiveActionItem("", 0L, "", "", "", "", "", "", ""));
        iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS609S0100000_30(takoActiveActionItemLIZ, 259)));
        return false;
    }
}
