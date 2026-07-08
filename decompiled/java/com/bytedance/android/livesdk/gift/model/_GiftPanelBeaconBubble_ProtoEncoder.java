package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftPanelBeaconBubble_ProtoEncoder implements InterfaceC1132110fZB<GiftPanelBeaconBubble> {
    public static int LIZIZ(GiftPanelBeaconBubble giftPanelBeaconBubble) {
        return C1142340fpg.LJIILL(1, giftPanelBeaconBubble.lynxUrl) + C1142340fpg.LJIILL(2, giftPanelBeaconBubble.lynxExtra) + C1142340fpg.LJIIIZ(3, giftPanelBeaconBubble.type);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftPanelBeaconBubble giftPanelBeaconBubble) {
        GiftPanelBeaconBubble giftPanelBeaconBubble2 = giftPanelBeaconBubble;
        C1142340fpg.LJFF(c1142350fph, 1, giftPanelBeaconBubble2.lynxUrl);
        C1142340fpg.LJFF(c1142350fph, 2, giftPanelBeaconBubble2.lynxExtra);
        int i = giftPanelBeaconBubble2.type;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i);
    }
}
