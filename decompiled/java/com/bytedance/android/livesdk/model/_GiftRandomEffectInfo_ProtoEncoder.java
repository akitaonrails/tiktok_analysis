package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftRandomEffectInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftRandomEffectInfo> {
    public static int LIZJ(GiftRandomEffectInfo giftRandomEffectInfo) {
        int iLIZIZ;
        RandomGiftPanelBanner randomGiftPanelBanner = giftRandomEffectInfo.randomGiftPanelBanner;
        int iLIZ = 0;
        if (randomGiftPanelBanner == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _RandomGiftPanelBanner_ProtoEncoder.LIZJ(randomGiftPanelBanner);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
        }
        List<Long> list = giftRandomEffectInfo.effectIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftRandomEffectInfo.effectIds.size(); i++) {
                iLIZIZ += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(giftRandomEffectInfo.effectIds, i));
            }
        }
        int iLJIILL = iLIZIZ + C1142340fpg.LJIILL(3, giftRandomEffectInfo.hostKey) + C1142340fpg.LJIILL(4, giftRandomEffectInfo.audienceKey);
        RandomGiftBubble randomGiftBubble = giftRandomEffectInfo.randomGiftBubble;
        if (randomGiftBubble != null) {
            int iLJIILL2 = C1142340fpg.LJIILL(1, randomGiftBubble.bubbleDisplayText) + _ImageModel_ProtoEncoder.LJ(2, randomGiftBubble.image);
            iLIZ = C1142350fph.LIZ(5) + iLJIILL2 + C1142350fph.LIZIZ(iLJIILL2);
        }
        return iLJIILL + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftRandomEffectInfo giftRandomEffectInfo) {
        RandomGiftPanelBanner randomGiftPanelBanner = giftRandomEffectInfo.randomGiftPanelBanner;
        if (randomGiftPanelBanner != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_RandomGiftPanelBanner_ProtoEncoder.LIZJ(randomGiftPanelBanner));
            _RandomGiftPanelBanner_ProtoEncoder.LIZIZ(c1142350fph, randomGiftPanelBanner);
        }
        List<Long> list = giftRandomEffectInfo.effectIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftRandomEffectInfo.effectIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(giftRandomEffectInfo.effectIds, i));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 3, giftRandomEffectInfo.hostKey);
        C1142340fpg.LJFF(c1142350fph, 4, giftRandomEffectInfo.audienceKey);
        RandomGiftBubble randomGiftBubble = giftRandomEffectInfo.randomGiftBubble;
        if (randomGiftBubble != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, randomGiftBubble.bubbleDisplayText) + _ImageModel_ProtoEncoder.LJ(2, randomGiftBubble.image));
            C1142340fpg.LJFF(c1142350fph, 1, randomGiftBubble.bubbleDisplayText);
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, randomGiftBubble.image);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftRandomEffectInfo giftRandomEffectInfo) {
        LIZIZ(c1142350fph, giftRandomEffectInfo);
    }
}
