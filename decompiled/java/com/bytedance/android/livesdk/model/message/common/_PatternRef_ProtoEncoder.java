package com.bytedance.android.livesdk.model.message.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _PatternRef_ProtoEncoder implements InterfaceC1132110fZB<PatternRef> {
    public static int LIZJ(PatternRef patternRef) {
        int iLJIILL = C1142340fpg.LJIILL(1, patternRef.key) + C1142340fpg.LJIILL(2, patternRef.defaultPattern);
        Map<String, String> map = patternRef.keyGroups;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : patternRef.keyGroups.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIILL2 = C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue());
                    iLJIILL += iLJIILL2 + C1142350fph.LIZIZ(iLJIILL2) + C1142350fph.LIZ(3);
                }
            }
        }
        return iLJIILL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, PatternRef patternRef) {
        C1142340fpg.LJFF(c1142350fph, 1, patternRef.key);
        C1142340fpg.LJFF(c1142350fph, 2, patternRef.defaultPattern);
        Map<String, String> map = patternRef.keyGroups;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : patternRef.keyGroups.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(3, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue()));
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LJFF(c1142350fph, 2, entry.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PatternRef patternRef) {
        LIZIZ(c1142350fph, patternRef);
    }
}
