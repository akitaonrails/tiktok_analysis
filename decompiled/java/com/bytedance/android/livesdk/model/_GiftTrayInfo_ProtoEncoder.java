package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftTrayInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftTrayInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftTrayInfo giftTrayInfo) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, giftTrayInfo.mDynamicImg);
        boolean z = giftTrayInfo.canMirror;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z ? 1 : 0);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 3, giftTrayInfo.trayNormalBgImg);
        List<String> list = giftTrayInfo.trayNormalBgColor;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftTrayInfo.trayNormalBgColor.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 4, (String) ListProtector.get(giftTrayInfo.trayNormalBgColor, i));
            }
        }
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 5, giftTrayInfo.traySmallBgImg);
        List<String> list2 = giftTrayInfo.traySmallBgColor;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < giftTrayInfo.traySmallBgColor.size(); i2++) {
                C1142340fpg.LJFF(c1142350fph, 6, (String) ListProtector.get(giftTrayInfo.traySmallBgColor, i2));
            }
        }
        _Text_ProtoEncoder.LIZJ(c1142350fph, 7, giftTrayInfo.rightTagText);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 8, giftTrayInfo.rightTagBgImg);
        List<String> list3 = giftTrayInfo.rightTagBgColor;
        if (list3 != null && !list3.isEmpty()) {
            for (int i3 = 0; i3 < giftTrayInfo.rightTagBgColor.size(); i3++) {
                C1142340fpg.LJFF(c1142350fph, 9, (String) ListProtector.get(giftTrayInfo.rightTagBgColor, i3));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 10, giftTrayInfo.trayNameTextColor);
        C1142340fpg.LJFF(c1142350fph, 11, giftTrayInfo.trayDescTextColor);
        C1142340fpg.LJFF(c1142350fph, 12, giftTrayInfo.rightTagJumpSchema);
        C1142340fpg.LJFF(c1142350fph, 13, giftTrayInfo.giftTrayJumpSchema);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftTrayInfo giftTrayInfo) {
        LIZIZ(c1142350fph, giftTrayInfo);
    }
}
