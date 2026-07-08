package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C0PEM;
import X.C123100dR;
import X.C14FD;
import X.C1849007Ma;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C2296808zG;
import X.C23250099c;
import X.C844370XAl;
import X.C844420XAq;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.components.easteregg.model.TakoEasterEggConfig;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEasterEggConfigParseProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = 3;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C123100dR.LIZ((String) C1849007Ma.LIZ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        List<TakoEasterEggConfig> list = C844420XAq.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C844370XAl(null), 3);
        return false;
    }
}
