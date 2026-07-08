package com.ss.android.ugc.aweme.tako.botpage.cards.answer.messagedisclaimer;

import X.C13LP;
import X.C1697810uHb;
import X.C1857530yRD;
import X.C326880Cre;
import X.C326890Crf;
import X.InterfaceC1858000yRy;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMessageDisclaimerProtocol implements ITakoCardPostProcessProtocol {
    public final List<Integer> LL = C1697810uHb.LJIIJJI(1001, 1002, 1003, 1012, 1022, 10001);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol
    public final List<InterfaceC1858000yRy> IM1(List<? extends InterfaceC1858000yRy> list, C1857530yRD c1857530yRD) {
        Integer numValueOf;
        C326890Crf c326890Crf;
        Message message;
        TakoMixFeed takoMixFeedLJIIIZ;
        if (c1857530yRD != null && c1857530yRD.LJII) {
            return list;
        }
        ArrayList<C326880Cre> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C326880Cre) {
                arrayList.add(obj);
            }
        }
        C326880Cre c326880Cre = (C326880Cre) C13LP.LJJLIIIJL(arrayList);
        List<Integer> list2 = this.LL;
        if (c326880Cre != null && (message = c326880Cre.LLILLL) != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null) {
            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
        } else {
            numValueOf = null;
        }
        if (!C13LP.LJJJJ(numValueOf, list2) && c326880Cre != null && (c326890Crf = c326880Cre.LLILLJJLI) != null) {
            c326890Crf.LIZJ = true;
        }
        for (C326880Cre c326880Cre2 : arrayList) {
            if (!Intrinsics.LJFF(c326880Cre2, c326880Cre)) {
                c326880Cre2.LLILLJJLI.LIZJ = false;
            }
        }
        return list;
    }
}
