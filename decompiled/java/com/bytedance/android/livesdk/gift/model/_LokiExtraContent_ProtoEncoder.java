package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _LokiExtraContent_ProtoEncoder implements InterfaceC1132110fZB<LokiExtraContent> {
    public static int LIZJ(LokiExtraContent lokiExtraContent) {
        int iLIZIZ;
        int iLJIILL = C1142340fpg.LJIILL(1, lokiExtraContent.giftType) + C1142340fpg.LJIILIIL(2, lokiExtraContent.giftDuration) + C1142340fpg.LJI(3) + C1142340fpg.LJI(4) + C1142340fpg.LJIILL(5, lokiExtraContent.viewOverlay);
        BEFViewRenderSize bEFViewRenderSize = lokiExtraContent.befViewRenderSize;
        if (bEFViewRenderSize == null) {
            iLIZIZ = 0;
        } else {
            int iLJIIIZ = C1142340fpg.LJIIIZ(1, bEFViewRenderSize.with) + C1142340fpg.LJIIIZ(2, bEFViewRenderSize.height);
            iLIZIZ = iLJIIIZ + C1142350fph.LIZIZ(iLJIIIZ) + C1142350fph.LIZ(6);
        }
        int iLJIIIZ2 = iLJIILL + iLIZIZ + C1142340fpg.LJIIIZ(7, lokiExtraContent.befViewRenderFPS) + C1142340fpg.LJIIIZ(8, lokiExtraContent.befViewFitMode) + C1142340fpg.LJIILL(9, lokiExtraContent.modelNames);
        List<String> list = lokiExtraContent.requirements;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < lokiExtraContent.requirements.size(); i++) {
                iLJIIIZ2 += C1142340fpg.LJIILL(10, (String) ListProtector.get(lokiExtraContent.requirements, i));
            }
        }
        return iLJIIIZ2;
    }

    public static void LIZIZ(C1142350fph c1142350fph, LokiExtraContent lokiExtraContent) {
        C1142340fpg.LJFF(c1142350fph, 1, lokiExtraContent.giftType);
        C1142340fpg.LJ(c1142350fph, 2, lokiExtraContent.giftDuration);
        boolean z = lokiExtraContent.needScreenShot;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = lokiExtraContent.ismultiFrame;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 5, lokiExtraContent.viewOverlay);
        BEFViewRenderSize bEFViewRenderSize = lokiExtraContent.befViewRenderSize;
        if (bEFViewRenderSize != null) {
            c1142350fph.LIZLLL(6, 2);
            c1142350fph.LJ(C1142340fpg.LJIIIZ(1, bEFViewRenderSize.with) + C1142340fpg.LJIIIZ(2, bEFViewRenderSize.height));
            int i = bEFViewRenderSize.with;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LIZJ(i);
            int i2 = bEFViewRenderSize.height;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LIZJ(i2);
        }
        int i3 = lokiExtraContent.befViewRenderFPS;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i3);
        int i4 = lokiExtraContent.befViewFitMode;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LIZJ(i4);
        C1142340fpg.LJFF(c1142350fph, 9, lokiExtraContent.modelNames);
        List<String> list = lokiExtraContent.requirements;
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < lokiExtraContent.requirements.size(); i5++) {
                C1142340fpg.LJFF(c1142350fph, 10, (String) ListProtector.get(lokiExtraContent.requirements, i5));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LokiExtraContent lokiExtraContent) {
        LIZIZ(c1142350fph, lokiExtraContent);
    }
}
