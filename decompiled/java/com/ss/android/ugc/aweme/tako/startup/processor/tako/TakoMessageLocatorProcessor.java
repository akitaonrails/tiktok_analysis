package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C14FD;
import X.C1861290yXH;
import X.C1861390yXR;
import X.C1862620yZQ;
import X.C1862660yZU;
import X.C326960Crm;
import X.EnumC1778520wNm;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMessageLocatorProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = 8;

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
        boolean z;
        if (C1861390yXR.LIZLLL == EnumC1778520wNm.READ_LAST_ANSWER_5_60) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iMessageAbility.K12(null, "message_bottom");
        }
        if (C1861390yXR.LIZLLL == EnumC1778520wNm.READ_LAST_ANSWER) {
            iMessageAbility.K12(new C1861290yXH(C1861390yXR.LIZJ, (C326960Crm) null, 6), "read_last");
        }
        if (C1861390yXR.LJ()) {
            iMessageAbility.K12(C1861390yXR.LIZIZ.LJIIJJI, "keep");
        }
        return false;
    }
}
