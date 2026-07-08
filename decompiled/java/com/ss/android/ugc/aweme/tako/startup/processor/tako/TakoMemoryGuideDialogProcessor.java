package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C14FD;
import X.C1861940yYK;
import X.C1862620yZQ;
import X.C1862660yZU;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import kotlin.jvm.internal.AwS122S0400000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMemoryGuideDialogProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = -1;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        if (c1862660yZU.LIZ) {
            return false;
        }
        AIBotInfo aIBotInfo = takoEnterParams.botInfo;
        C1861940yYK.LIZ(iMessageAbility, aIBotInfo.botId, aIBotInfo.botSource, new AwS122S0400000_27(fragment, iMessageAbility, takoEnterParams, c1862660yZU, 8));
        return false;
    }
}
