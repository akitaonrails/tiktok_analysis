package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model._GiftColorInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_ColorGroup_ProtoEncoder implements InterfaceC1132110fZB<Gift.ColorGroup> {
    public static int LIZJ(Gift.ColorGroup colorGroup) {
        int iLIZIZ;
        int iLJIILL = C1142340fpg.LJIILL(1, colorGroup.groupName);
        List<GiftColorInfo> list = colorGroup.colorInfos;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < colorGroup.colorInfos.size(); i++) {
                GiftColorInfo giftColorInfo = (GiftColorInfo) ListProtector.get(colorGroup.colorInfos, i);
                if (giftColorInfo == null) {
                    iLIZIZ = 0;
                } else {
                    int iLIZJ = _GiftColorInfo_ProtoEncoder.LIZJ(giftColorInfo);
                    iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(2);
                }
                iLJIILL += iLIZIZ;
            }
        }
        return iLJIILL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, Gift.ColorGroup colorGroup) {
        C1142340fpg.LJFF(c1142350fph, 1, colorGroup.groupName);
        List<GiftColorInfo> list = colorGroup.colorInfos;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < colorGroup.colorInfos.size(); i++) {
                GiftColorInfo giftColorInfo = (GiftColorInfo) ListProtector.get(colorGroup.colorInfos, i);
                if (giftColorInfo != null) {
                    c1142350fph.LIZLLL(2, 2);
                    c1142350fph.LJ(_GiftColorInfo_ProtoEncoder.LIZJ(giftColorInfo));
                    _GiftColorInfo_ProtoEncoder.LIZIZ(c1142350fph, giftColorInfo);
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift.ColorGroup colorGroup) {
        LIZIZ(c1142350fph, colorGroup);
    }
}
