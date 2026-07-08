package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftMonitorInfo_ProtoEncoder implements InterfaceC1132110fZB<GiftMonitorInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftMonitorInfo giftMonitorInfo) {
        long j = giftMonitorInfo.anchor_id;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = giftMonitorInfo.profit_api_message_dur;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = giftMonitorInfo.send_gift_profit_api_start_ms;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        long j4 = giftMonitorInfo.send_gift_profit_core_start_ms;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j4);
        long j5 = giftMonitorInfo.send_gift_req_start_ms;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j5);
        long j6 = giftMonitorInfo.send_gift_send_message_success_ms;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j6);
        long j7 = giftMonitorInfo.send_profit_api_dur;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j7);
        long j8 = giftMonitorInfo.to_user_id;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LJFF(j8);
        long j9 = giftMonitorInfo.sendGiftStartClientLocalMs;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j9);
        C1142340fpg.LJFF(c1142350fph, 10, giftMonitorInfo.fromPlatform);
        C1142340fpg.LJFF(c1142350fph, 11, giftMonitorInfo.fromVersion);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftMonitorInfo giftMonitorInfo) {
        LIZIZ(c1142350fph, giftMonitorInfo);
    }
}
