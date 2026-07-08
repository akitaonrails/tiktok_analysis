package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _RandomGiftPanelBanner_ProtoEncoder implements InterfaceC1132110fZB<RandomGiftPanelBanner> {
    public static int LIZJ(RandomGiftPanelBanner randomGiftPanelBanner) {
        int iLJ = _ImageModel_ProtoEncoder.LJ(2, randomGiftPanelBanner.shadingImage) + C1142340fpg.LJIIL(3, randomGiftPanelBanner.targetNum) + C1142340fpg.LJIIL(4, randomGiftPanelBanner.collectNum) + C1142340fpg.LJIILL(5, randomGiftPanelBanner.displayText) + _ImageModel_ProtoEncoder.LJ(6, randomGiftPanelBanner.leftIcon) + C1142340fpg.LJIILL(7, randomGiftPanelBanner.schemaUrl);
        List<String> list = randomGiftPanelBanner.bgColors;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < randomGiftPanelBanner.bgColors.size(); i++) {
                iLJ += C1142340fpg.LJIILL(8, (String) ListProtector.get(randomGiftPanelBanner.bgColors, i));
            }
        }
        return iLJ + C1142340fpg.LJIIL(9, randomGiftPanelBanner.round) + C1142340fpg.LJIIIZ(10, randomGiftPanelBanner.bannerPriority);
    }

    public static void LIZIZ(C1142350fph c1142350fph, RandomGiftPanelBanner randomGiftPanelBanner) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, randomGiftPanelBanner.shadingImage);
        long j = randomGiftPanelBanner.targetNum;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
        long j2 = randomGiftPanelBanner.collectNum;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LJFF(c1142350fph, 5, randomGiftPanelBanner.displayText);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 6, randomGiftPanelBanner.leftIcon);
        C1142340fpg.LJFF(c1142350fph, 7, randomGiftPanelBanner.schemaUrl);
        List<String> list = randomGiftPanelBanner.bgColors;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < randomGiftPanelBanner.bgColors.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 8, (String) ListProtector.get(randomGiftPanelBanner.bgColors, i));
            }
        }
        long j3 = randomGiftPanelBanner.round;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j3);
        int i2 = randomGiftPanelBanner.bannerPriority;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LIZJ(i2);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, RandomGiftPanelBanner randomGiftPanelBanner) {
        LIZIZ(c1142350fph, randomGiftPanelBanner);
    }
}
