package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_GiftSeriesInfo_ProtoEncoder implements InterfaceC1132110fZB<Gift.GiftSeriesInfo> {
    public static int LIZJ(Gift.GiftSeriesInfo giftSeriesInfo) {
        int iLJIILL = C1142340fpg.LJIILL(2, giftSeriesInfo.seriesName);
        List<Long> list = giftSeriesInfo.giftIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftSeriesInfo.giftIds.size(); i++) {
                iLJIILL += C1142340fpg.LJIILIIL(3, (Long) ListProtector.get(giftSeriesInfo.giftIds, i));
            }
        }
        return iLJIILL + C1142340fpg.LJI(4) + _ImageModel_ProtoEncoder.LJ(5, giftSeriesInfo.containerBackground) + C1142340fpg.LJIILL(6, giftSeriesInfo.sendGiftButtonColor) + C1142340fpg.LJIILL(7, giftSeriesInfo.pointingBackTriColor) + C1142340fpg.LJIILL(8, giftSeriesInfo.seriesNameColor) + C1142340fpg.LJIIL(9, giftSeriesInfo.endTimeSec);
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.GiftSeriesInfo giftSeriesInfo) {
        C1142340fpg.LJFF(c1142350fph, 2, giftSeriesInfo.seriesName);
        List<Long> list = giftSeriesInfo.giftIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftSeriesInfo.giftIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 3, (Long) ListProtector.get(giftSeriesInfo.giftIds, i));
            }
        }
        boolean z = giftSeriesInfo.enabled;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z ? 1 : 0);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 5, giftSeriesInfo.containerBackground);
        C1142340fpg.LJFF(c1142350fph, 6, giftSeriesInfo.sendGiftButtonColor);
        C1142340fpg.LJFF(c1142350fph, 7, giftSeriesInfo.pointingBackTriColor);
        C1142340fpg.LJFF(c1142350fph, 8, giftSeriesInfo.seriesNameColor);
        long j = giftSeriesInfo.endTimeSec;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.GiftSeriesInfo giftSeriesInfo) {
        LIZIZ(c1142350fph, giftSeriesInfo);
    }
}
