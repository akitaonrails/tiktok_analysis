package webcast.api.room;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class _ModificationUploadReqMessage_ProtoEncoder implements InterfaceC1132110fZB<ModificationUploadReqMessage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ModificationUploadReqMessage modificationUploadReqMessage) {
        int iLIZ;
        ModificationUploadReqMessage modificationUploadReqMessage2 = modificationUploadReqMessage;
        long j = modificationUploadReqMessage2.roomId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        List<Modification> list = modificationUploadReqMessage2.modifications;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < modificationUploadReqMessage2.modifications.size(); i++) {
                Modification modification = (Modification) ListProtector.get(modificationUploadReqMessage2.modifications, i);
                if (modification != null) {
                    c1142350fph.LIZLLL(2, 2);
                    int iLJIIL = C1142340fpg.LJIIL(1, modification.effectId) + C1142340fpg.LJIILL(2, modification.name) + C1142340fpg.LJIILL(3, modification.resourceId) + C1142340fpg.LJIIL(4, modification.modificationType) + C1142340fpg.LJIIL(5, modification.startTime) + C1142340fpg.LJIIL(6, modification.endTime) + C1142340fpg.LJIIL(7, modification.role) + C1142340fpg.LJIILL(21, modification.tab) + C1142340fpg.LJIIL(22, modification.mode) + C1142340fpg.LJIIL(23, modification.from) + C1142340fpg.LJIIIIZZ(24) + C1142340fpg.LJIILL(25, modification.url) + C1142340fpg.LJIILL(26, modification.scene) + C1142340fpg.LJIILL(27, modification.extra) + C1142340fpg.LJIIL(28, modification.subEffectId) + C1142340fpg.LJIIL(29, modification.subType) + C1142340fpg.LJIIIZ(30, modification.status);
                    Map<String, Double> map = modification.values;
                    if (map != null && !map.isEmpty()) {
                        for (Map.Entry<String, Double> entry : modification.values.entrySet()) {
                            if (entry.getKey() != null && entry.getValue() != null) {
                                int iLJIILL = C1142340fpg.LJIILL(1, entry.getKey());
                                Double value = entry.getValue();
                                if (value == null) {
                                    iLIZ = 0;
                                } else {
                                    value.doubleValue();
                                    iLIZ = C1142350fph.LIZ(2) + 8;
                                }
                                int i2 = iLJIILL + iLIZ;
                                iLJIIL += i2 + C1142350fph.LIZIZ(i2) + C1142350fph.LIZ(31);
                            }
                        }
                    }
                    c1142350fph.LJ(iLJIIL);
                    _Modification_ProtoEncoder.LIZIZ(c1142350fph, modification);
                }
            }
        }
    }
}
