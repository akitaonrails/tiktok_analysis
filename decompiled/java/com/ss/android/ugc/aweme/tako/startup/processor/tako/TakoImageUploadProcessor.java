package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C07I1;
import X.C0PEM;
import X.C14FD;
import X.C1861930yYJ;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C2296808zG;
import X.C23250099c;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageUploadProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = 4;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C07I1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1861930yYJ(null), 3);
        return false;
    }
}
