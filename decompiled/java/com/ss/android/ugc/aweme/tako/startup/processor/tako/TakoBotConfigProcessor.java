package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C07I5;
import X.C14FD;
import X.C1862660yZU;
import X.C20231914Ej;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoBotConfigProcessor implements ITakoProcessorProtocol {
    public final int LL = 5;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C07I5.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean TS(Fragment fragment, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, IMessageAbility iMessageAbility, C14FD c14fd) {
        C20231914Ej.LIZIZ(new AwS574S0100000_30(iMessageAbility, 278), new AwS574S0100000_30(iMessageAbility, 279), true);
        return false;
    }
}
