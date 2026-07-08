package webcast.api.room;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class _Modification_ProtoEncoder implements InterfaceC1132110fZB<Modification> {
    public static void LIZIZ(C1142350fph c1142350fph, Modification modification) {
        int iLIZ;
        long j = modification.effectId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 2, modification.name);
        C1142340fpg.LJFF(c1142350fph, 3, modification.resourceId);
        long j2 = modification.modificationType;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
        long j3 = modification.startTime;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j3);
        long j4 = modification.endTime;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j4);
        long j5 = modification.role;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j5);
        C1142340fpg.LJFF(c1142350fph, 21, modification.tab);
        long j6 = modification.mode;
        c1142350fph.LIZLLL(22, 0);
        c1142350fph.LJFF(j6);
        long j7 = modification.from;
        c1142350fph.LIZLLL(23, 0);
        c1142350fph.LJFF(j7);
        C1142340fpg.LIZIZ(c1142350fph, 24, modification.value);
        C1142340fpg.LJFF(c1142350fph, 25, modification.url);
        C1142340fpg.LJFF(c1142350fph, 26, modification.scene);
        C1142340fpg.LJFF(c1142350fph, 27, modification.extra);
        long j8 = modification.subEffectId;
        c1142350fph.LIZLLL(28, 0);
        c1142350fph.LJFF(j8);
        long j9 = modification.subType;
        c1142350fph.LIZLLL(29, 0);
        c1142350fph.LJFF(j9);
        int i = modification.status;
        c1142350fph.LIZLLL(30, 0);
        c1142350fph.LIZJ(i);
        Map<String, Double> map = modification.values;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Double> entry : modification.values.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(31, 2);
                    int iLJIILL = C1142340fpg.LJIILL(1, entry.getKey());
                    Double value = entry.getValue();
                    if (value == null) {
                        iLIZ = 0;
                    } else {
                        value.doubleValue();
                        iLIZ = C1142350fph.LIZ(2) + 8;
                    }
                    c1142350fph.LJ(iLJIILL + iLIZ);
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    Double value2 = entry.getValue();
                    if (value2 != null) {
                        c1142350fph.LIZLLL(2, 1);
                        c1142350fph.LIZ.LJLLLLLL(Double.doubleToLongBits(value2.doubleValue()));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Modification modification) {
        LIZIZ(c1142350fph, modification);
    }
}
