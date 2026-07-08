package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftColorInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftColorInfo> {
    public static int LIZJ(GiftColorInfo giftColorInfo) {
        if (giftColorInfo == null) {
            return 0;
        }
        int iLJIILIIL = C1142340fpg.LJIILIIL(1, giftColorInfo.colorId) + C1142340fpg.LJIILL(2, giftColorInfo.colorName);
        List<String> list = giftColorInfo.colorValues;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftColorInfo.colorValues.size(); i++) {
                iLJIILIIL += C1142340fpg.LJIILL(3, (String) ListProtector.get(giftColorInfo.colorValues, i));
            }
        }
        int iLJ = iLJIILIIL + _ImageModel_ProtoEncoder.LJ(4, giftColorInfo.colorImage) + _ImageModel_ProtoEncoder.LJ(5, giftColorInfo.giftImage) + C1142340fpg.LJIILIIL(6, giftColorInfo.colorEffectId) + C1142340fpg.LJI(7) + C1142340fpg.LJIIL(8, giftColorInfo.colorImageSize);
        List<String> list2 = giftColorInfo.colorReason;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < giftColorInfo.colorReason.size(); i2++) {
                iLJ += C1142340fpg.LJIILL(9, (String) ListProtector.get(giftColorInfo.colorReason, i2));
            }
        }
        return iLJ + C1142340fpg.LJIILL(10, giftColorInfo.colorNameEnglish) + C1142340fpg.LJIILL(11, giftColorInfo.giftDescribe);
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftColorInfo giftColorInfo) {
        C1142340fpg.LJ(c1142350fph, 1, giftColorInfo.colorId);
        C1142340fpg.LJFF(c1142350fph, 2, giftColorInfo.colorName);
        List<String> list = giftColorInfo.colorValues;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftColorInfo.colorValues.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 3, (String) ListProtector.get(giftColorInfo.colorValues, i));
            }
        }
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, giftColorInfo.colorImage);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 5, giftColorInfo.giftImage);
        C1142340fpg.LJ(c1142350fph, 6, giftColorInfo.colorEffectId);
        boolean z = giftColorInfo.isDefault;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJ(z ? 1 : 0);
        long j = giftColorInfo.colorImageSize;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LJFF(j);
        List<String> list2 = giftColorInfo.colorReason;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < giftColorInfo.colorReason.size(); i2++) {
                C1142340fpg.LJFF(c1142350fph, 9, (String) ListProtector.get(giftColorInfo.colorReason, i2));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 10, giftColorInfo.colorNameEnglish);
        C1142340fpg.LJFF(c1142350fph, 11, giftColorInfo.giftDescribe);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftColorInfo giftColorInfo) {
        LIZIZ(c1142350fph, giftColorInfo);
    }
}
