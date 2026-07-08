package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C14FD;
import X.C1861390yXR;
import X.C1861630yXp;
import X.C1862620yZQ;
import X.C1862660yZU;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoEnterAction;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCarrySugProcessor implements ITakoNormalProcessorProtocol, ITakoEnterAction {
    public final int LL = 54;
    public final List<String> LLILLJJLI = Collections.singletonList("ask_more_with_sug");

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        List<String> carriedSugList = takoEnterParams.getCarriedSugList();
        if (carriedSugList == null || carriedSugList.isEmpty() || !Intrinsics.LJFF(takoEnterParams.getType(), "ask_more_with_sug") || !C1861390yXR.LJII(takoEnterParams)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        c1862660yZU.LJIIIZ = true;
        iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS606S0100000_27(takoEnterParams, 280)));
        return false;
    }
}
