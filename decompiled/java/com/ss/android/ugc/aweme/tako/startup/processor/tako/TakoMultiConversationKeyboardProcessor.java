package com.ss.android.ugc.aweme.tako.startup.processor.tako;

import X.C1862620yZQ;
import X.C324800CoI;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultiConversationKeyboardProcessor implements ITakoNormalProcessorProtocol {
    public final int LL = 98;

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoNormalProcessorProtocol
    public final boolean Wd(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        C324800CoI.LIZ.getClass();
        return C324800CoI.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    public final boolean Xw(IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams) {
        return C1862620yZQ.LIZ(this, takoEnterParams, iMessageAbility);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @Override // com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean TS(androidx.fragment.app.Fragment r6, com.ss.android.ugc.aweme.tako.model.TakoEnterParams r7, X.C1862660yZU r8, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r9, X.C14FD r10) {
        /*
            r5 = this;
            X.0yW2 r0 = X.C1860520yW2.LIZ
            r0.getClass()
            X.0yO2 r1 = X.C1860520yW2.LJIIJJI()
            X.0yO2 r0 = X.EnumC1855560yO2.KEYBOARD
            r3 = 1
            r4 = 0
            if (r1 == r0) goto L5a
            r1 = 1
        L10:
            X.07QF r0 = X.C07QF.LIZ
            r0.getClass()
            boolean r0 = X.C07QF.LIZ()
            if (r0 == 0) goto L3e
            boolean r0 = X.C1861390yXR.LJIIJ(r7)
            if (r0 == 0) goto L55
            if (r1 != 0) goto L55
        L23:
            r9.zJ1(r3)
            r2 = 0
            X.0Q7z r1 = X.C1558360qeg.LJFF(r6, r2)
            java.lang.Class<com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility> r0 = com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r1 = (com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility) r1
            if (r1 == 0) goto L3d
            X.144M r0 = new X.144M
            r0.<init>(r3)
            r1.PG0(r0)
        L3d:
            return r4
        L3e:
            X.0yOU r0 = X.C1855840yOU.LIZ
            r0.getClass()
            boolean r0 = X.C1855840yOU.LIZ()
            if (r0 != 0) goto L57
            java.lang.String r0 = r7.getInputContent()
            if (r0 == 0) goto L55
            int r0 = r0.length()
            if (r0 != 0) goto L57
        L55:
            r3 = 0
            goto L23
        L57:
            if (r1 != 0) goto L55
            goto L23
        L5a:
            r1 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoMultiConversationKeyboardProcessor.TS(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.tako.model.TakoEnterParams, X.0yZU, com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility, X.14FD):boolean");
    }
}
