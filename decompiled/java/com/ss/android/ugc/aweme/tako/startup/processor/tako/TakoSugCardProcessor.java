package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C1862620yZQ;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoEnterAction;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSugCardProcessor implements ITakoNormalProcessorProtocol, ITakoEnterAction {
    public final int LL = 99;
    public final List<String> LLILLJJLI = Collections.singletonList("fetch_sug");

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Wd(com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r16, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r17) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoSugCardProcessor.Wd(com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, com.ss.android.ugc.aweme.tako.model.TakoEnterParams):boolean");
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean TS(androidx.fragment.app.Fragment r8, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r9, X.C1862660yZU r10, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r11, X.C14FD r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoSugCardProcessor.TS(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.tako.model.TakoEnterParams, X.0yZU, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, X.14FD):boolean");
    }
}
