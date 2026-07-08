package com.ss.android.ugc.aweme.tako.botpage.cards.answer.imagedisclaimer;

import X.C1857530yRD;
import X.C326880Cre;
import X.C326920Cri;
import X.InterfaceC1858000yRy;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageDisclaimerInsertProtocol implements ITakoCardPostProcessProtocol {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol
    public final List<InterfaceC1858000yRy> IM1(List<? extends InterfaceC1858000yRy> list, C1857530yRD c1857530yRD) {
        C326880Cre c326880Cre;
        Message message;
        TakoMixFeed takoMixFeedLJIIIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1858000yRy interfaceC1858000yRy : list) {
            if ((c1857530yRD == null || !c1857530yRD.LJI) && (interfaceC1858000yRy instanceof C326880Cre) && (c326880Cre = (C326880Cre) interfaceC1858000yRy) != null && (message = c326880Cre.LLILLL) != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.disclaimer != null) {
                arrayList.add(new C326920Cri((C326880Cre) interfaceC1858000yRy));
            }
            arrayList.add(interfaceC1858000yRy);
        }
        return arrayList;
    }
}
