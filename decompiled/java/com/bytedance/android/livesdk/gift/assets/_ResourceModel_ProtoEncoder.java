package com.bytedance.android.livesdk.gift.assets;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _ResourceModel_ProtoEncoder implements InterfaceC1132110fZB<ResourceModel> {
    public static int LIZLLL(ResourceModel resourceModel) {
        int i = 0;
        if (resourceModel == null) {
            return 0;
        }
        List<String> list = resourceModel.urlList;
        if (list != null && !list.isEmpty()) {
            int iLJIILL = 0;
            while (i < resourceModel.urlList.size()) {
                iLJIILL += C1142340fpg.LJIILL(1, (String) ListProtector.get(resourceModel.urlList, i));
                i++;
            }
            i = iLJIILL;
        }
        return i + C1142340fpg.LJIILL(2, resourceModel.uri);
    }

    public static void LIZIZ(C1142350fph c1142350fph, ResourceModel resourceModel) {
        List<String> list = resourceModel.urlList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < resourceModel.urlList.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 1, (String) ListProtector.get(resourceModel.urlList, i));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 2, resourceModel.uri);
    }

    public static int LJ(int i, ResourceModel resourceModel) {
        if (resourceModel == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(resourceModel);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ResourceModel resourceModel) {
        LIZIZ(c1142350fph, resourceModel);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, ResourceModel resourceModel) {
        if (resourceModel == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(resourceModel));
        LIZIZ(c1142350fph, resourceModel);
    }
}
