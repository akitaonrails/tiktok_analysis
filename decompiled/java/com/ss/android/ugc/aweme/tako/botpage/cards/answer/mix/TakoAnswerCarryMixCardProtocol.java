package com.ss.android.ugc.aweme.tako.botpage.cards.answer.mix;

import X.AbstractC642490PHz;
import X.C03H5;
import X.C0R2X;
import X.C0R3X;
import X.C13IQ;
import X.C1857760yRa;
import X.C1857770yRb;
import X.C326880Cre;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCarryCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoAnswerCarryMixCardProtocol implements ITakoAnswerCarryCardProtocol {
    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final int qO2() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final AbstractC642490PHz<C326880Cre> getConfig() {
        return new AbstractC642490PHz<C326880Cre>() { // from class: X.0R2T
            public final C642240PHa LIZIZ = new C642240PHa(true, true, 0, false, false, true, false, false, true, false, null, null, 15228);

            @Override // X.AbstractC642490PHz
            public final C642240PHa LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC642490PHz
            public final List LIZ(InterfaceC1858000yRy interfaceC1858000yRy) {
                Map<String, TakoPlaceholderSource> map;
                C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
                TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
                if (takoMixFeedLJIIIZ != null && (map = takoMixFeedLJIIIZ.placeholderSources) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, TakoPlaceholderSource> entry : map.entrySet()) {
                        List<TakoVideoItem> list = entry.getValue().itemList;
                        if (list != null && !list.isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Collection collectionValues = linkedHashMap.values();
                    if (collectionValues != null) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                        Iterator it2 = collectionValues.iterator();
                        while (it2.hasNext()) {
                            List list2 = ((TakoPlaceholderSource) it2.next()).itemList;
                            if (list2 == null) {
                                list2 = C13BV.INSTANCE;
                            }
                            arrayList.add(new C642570PIh(c326880Cre, list2));
                        }
                        return arrayList;
                    }
                }
                return C13BV.INSTANCE;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final C13IQ<C326880Cre> getDataType() {
        return C1857770yRb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final Class<? extends AssemPowerCell<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> T2() {
        return TakoAnswerMixCell.class;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCarryCardProtocol
    public final boolean Hq(C326880Cre c326880Cre) {
        Integer numValueOf;
        TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
        } else {
            numValueOf = null;
        }
        return C0R2X.LIZ(numValueOf);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final InterfaceC1891350zJl l51(InterfaceC1858000yRy interfaceC1858000yRy) {
        return new C0R3X((C326880Cre) interfaceC1858000yRy);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol
    public final boolean ru1(InterfaceC1858000yRy interfaceC1858000yRy) {
        return C1857760yRa.LIZ(this, (C326880Cre) interfaceC1858000yRy);
    }
}
