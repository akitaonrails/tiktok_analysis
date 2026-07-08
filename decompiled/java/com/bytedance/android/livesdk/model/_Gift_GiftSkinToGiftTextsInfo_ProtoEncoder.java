package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_GiftSkinToGiftTextsInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.GiftSkinToGiftTextsInfo> {
    public static int LIZJ(Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo) {
        int iLJIIL = C1142340fpg.LJIIL(1, giftSkinToGiftTextsInfo.giftSkinId);
        List<Long> list = giftSkinToGiftTextsInfo.giftTextIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftSkinToGiftTextsInfo.giftTextIds.size(); i++) {
                iLJIIL += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(giftSkinToGiftTextsInfo.giftTextIds, i));
            }
        }
        return iLJIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo) {
        long j = giftSkinToGiftTextsInfo.giftSkinId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        List<Long> list = giftSkinToGiftTextsInfo.giftTextIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftSkinToGiftTextsInfo.giftTextIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(giftSkinToGiftTextsInfo.giftTextIds, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo) {
        LIZIZ(c1142350fph, giftSkinToGiftTextsInfo);
    }
}
