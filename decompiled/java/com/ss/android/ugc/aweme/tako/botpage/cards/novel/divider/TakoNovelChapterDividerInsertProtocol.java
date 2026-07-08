package com.ss.android.ugc.aweme.tako.botpage.cards.novel.divider;

import X.C0R2X;
import X.C1857530yRD;
import X.C326880Cre;
import X.C326910Crh;
import X.InterfaceC1858000yRy;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoNovelChapterDividerInsertProtocol implements ITakoCardPostProcessProtocol {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol
    public final List<InterfaceC1858000yRy> IM1(List<? extends InterfaceC1858000yRy> list, C1857530yRD c1857530yRD) {
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        InterfaceC1858000yRy interfaceC1858000yRy = null;
        for (InterfaceC1858000yRy interfaceC1858000yRy2 : list) {
            if (interfaceC1858000yRy2 instanceof C326880Cre) {
                Message message = ((C326880Cre) interfaceC1858000yRy2).LLILLL;
                if (interfaceC1858000yRy != null) {
                    TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                    if (takoMixFeedLJIIIZ != null) {
                        numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
                    } else {
                        numValueOf = null;
                    }
                    if (C0R2X.LIZJ(numValueOf)) {
                        arrayList.add(new C326910Crh(0));
                    }
                }
                interfaceC1858000yRy = interfaceC1858000yRy2;
            }
            arrayList.add(interfaceC1858000yRy2);
        }
        return arrayList;
    }
}
