package com.ss.android.ugc.aweme.tako.botpage.cards.answer.user;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C0R31;
import X.C13IQ;
import X.C1857770yRb;
import X.C1857820yRg;
import X.C326880Cre;
import X.C643310PLd;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoAnswerUserCardProtocol implements ITakoAnswerCardProtocol {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return new C643310PLd();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326880Cre> getDataType() {
        return C1857770yRb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoAnswerUserCell.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCardProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Hq(X.C326880Cre r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = r4.LLILLL
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r0.LJIIIZ()
            r2 = 1
            if (r0 == 0) goto L35
            int r1 = r0.cardType
            r0 = 4
            if (r1 != r0) goto L35
            X.01GW r0 = X.C07IK.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L54
            X.13b3 r1 = X.C20039913b3.LIZ
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = r4.LLILLL
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r0.LJIIIZ()
            if (r0 == 0) goto L55
            int r0 = r0.cardType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L2c:
            r1.getClass()
            com.ss.android.ugc.aweme.nimblecard.model.Template r0 = X.C20039913b3.LIZLLL(r0)
            if (r0 == 0) goto L54
        L35:
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = r4.LLILLL
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r0.LJIIIZ()
            if (r0 == 0) goto L57
            int r1 = r0.cardType
            r0 = 6
            if (r1 != r0) goto L57
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = r4.LLILLL
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r0.LJIIIZ()
            if (r0 == 0) goto L57
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem> r0 = r0.userList
            if (r0 == 0) goto L57
            int r0 = r0.size()
            if (r0 != r2) goto L57
        L54:
            return r2
        L55:
            r0 = 0
            goto L2c
        L57:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.answer.user.TakoAnswerUserCardProtocol.Hq(X.0Cre):boolean");
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C0R31((C326880Cre) interfaceC1858000yRy);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return C1857820yRg.LIZ(this, (C326880Cre) interfaceC1858000yRy);
    }
}
