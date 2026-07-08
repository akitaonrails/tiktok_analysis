package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftPage_GiftDynamicField_GiftPanelBanner_ProtoEncoder implements InterfaceC1132110fZB<GiftPage.GiftDynamicField.GiftPanelBanner> {
    public static int LIZJ(GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner) {
        int iLJ = _Text_ProtoEncoder.LJ(1, giftPanelBanner.displayText) + _ImageModel_ProtoEncoder.LJ(2, giftPanelBanner.leftIcon) + C1142340fpg.LJIILL(3, giftPanelBanner.schemaUrl);
        List<String> list = giftPanelBanner.bgColorValues;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftPanelBanner.bgColorValues.size(); i++) {
                iLJ += C1142340fpg.LJIILL(5, (String) ListProtector.get(giftPanelBanner.bgColorValues, i));
            }
        }
        return iLJ + C1142340fpg.LJIILL(6, giftPanelBanner.bannerLynxUrl) + C1142340fpg.LJIIIZ(7, giftPanelBanner.bannerPriority) + C1142340fpg.LJIILL(8, giftPanelBanner.bannerLynxExtra) + _ImageModel_ProtoEncoder.LJ(9, giftPanelBanner.bgImage);
    }

    public static void LIZIZ(C1142350fph c1142350fph, GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner) {
        _Text_ProtoEncoder.LIZJ(c1142350fph, 1, giftPanelBanner.displayText);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, giftPanelBanner.leftIcon);
        C1142340fpg.LJFF(c1142350fph, 3, giftPanelBanner.schemaUrl);
        List<String> list = giftPanelBanner.bgColorValues;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftPanelBanner.bgColorValues.size(); i++) {
                C1142340fpg.LJFF(c1142350fph, 5, (String) ListProtector.get(giftPanelBanner.bgColorValues, i));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 6, giftPanelBanner.bannerLynxUrl);
        int i2 = giftPanelBanner.bannerPriority;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i2);
        C1142340fpg.LJFF(c1142350fph, 8, giftPanelBanner.bannerLynxExtra);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 9, giftPanelBanner.bgImage);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner) {
        LIZIZ(c1142350fph, giftPanelBanner);
    }
}
