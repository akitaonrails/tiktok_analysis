package com.ss.android.ugc.aweme.tako.botpage.cards.multianswer;

import X.C07IB;
import X.C1857530yRD;
import X.C1858670yT3;
import X.C326880Cre;
import X.C326940Crk;
import X.InterfaceC1858000yRy;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultiAnswerTabInsertProtocol implements ITakoCardPostProcessProtocol {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardPostProcessProtocol
    public final List<InterfaceC1858000yRy> IM1(List<? extends InterfaceC1858000yRy> list, C1857530yRD c1857530yRD) {
        C326880Cre c326880Cre;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1858000yRy interfaceC1858000yRy : list) {
            if (interfaceC1858000yRy instanceof C326880Cre) {
                c326880Cre = (C326880Cre) interfaceC1858000yRy;
            } else {
                c326880Cre = null;
            }
            if (!C07IB.LIZ() && ((c1857530yRD == null || !c1857530yRD.LJI) && c326880Cre != null && !C1858670yT3.LJ(c326880Cre.LLILLL) && c326880Cre.LLILLL.LJIIIZ)) {
                arrayList.add(new C326940Crk(c326880Cre));
            }
            arrayList.add(interfaceC1858000yRy);
        }
        return arrayList;
    }
}
