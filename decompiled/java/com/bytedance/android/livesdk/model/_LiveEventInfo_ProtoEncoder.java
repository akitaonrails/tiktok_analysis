package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import webcast.data.EventUserInfo;
import webcast.data.PaidEventPreview;

/* JADX INFO: loaded from: classes18.dex */
public final class _LiveEventInfo_ProtoEncoder implements InterfaceC1132110fZB<LiveEventInfo> {
    public static int LIZJ(LiveEventInfo liveEventInfo) {
        int iLIZIZ;
        int iLIZ = 0;
        int iLJIILIIL = C1142340fpg.LJIILIIL(1, liveEventInfo.eventId) + C1142340fpg.LJIILIIL(2, liveEventInfo.startTime) + C1142340fpg.LJIILIIL(3, liveEventInfo.duration) + C1142340fpg.LJIILL(4, liveEventInfo.title) + C1142340fpg.LJIILL(5, liveEventInfo.description) + C1142340fpg.LJII(6, liveEventInfo.subscribed) + C1142340fpg.LJII(7, liveEventInfo.isPaidEvent) + C1142340fpg.LJIILIIL(8, liveEventInfo.ticketAmount) + C1142340fpg.LJIIIZ(9, liveEventInfo.payMethod);
        HashMap<String, WalletPackage> map = liveEventInfo.walletPkgDict;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, WalletPackage> entry : liveEventInfo.walletPkgDict.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIILL = C1142340fpg.LJIILL(1, entry.getKey()) + _WalletPackage_ProtoEncoder.LIZIZ(2, entry.getValue());
                    iLJIILIIL += iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(10);
                }
            }
        }
        List<EventUserInfo> list = liveEventInfo.eventUserInfo;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < liveEventInfo.eventUserInfo.size(); i++) {
                EventUserInfo eventUserInfo = (EventUserInfo) ListProtector.get(liveEventInfo.eventUserInfo, i);
                if (eventUserInfo == null) {
                    iLIZIZ = 0;
                } else {
                    int iLJIIL = C1142340fpg.LJIIL(1, eventUserInfo.userId) + C1142340fpg.LJIILL(2, eventUserInfo.avatarUri);
                    iLIZIZ = iLJIIL + C1142350fph.LIZIZ(iLJIIL) + C1142350fph.LIZ(11);
                }
                iLJIILIIL += iLIZIZ;
            }
        }
        int iLJIIL2 = iLJIILIIL + C1142340fpg.LJIIL(12, liveEventInfo.subscribedCount);
        PaidEventPreview paidEventPreview = liveEventInfo.paidEventPreview;
        if (paidEventPreview != null) {
            int iLJIIL3 = C1142340fpg.LJIIL(1, paidEventPreview.allowPreview) + C1142340fpg.LJIIL(2, paidEventPreview.allowPreviewTime);
            iLIZ = C1142350fph.LIZ(13) + iLJIIL3 + C1142350fph.LIZIZ(iLJIIL3);
        }
        return iLJIIL2 + iLIZ + _WalletPackage_ProtoEncoder.LIZIZ(14, liveEventInfo.walletPackage) + C1142340fpg.LJIIL(15, liveEventInfo.registerType) + C1142340fpg.LJIILL(16, liveEventInfo.periodicSettings) + C1142340fpg.LJIILL(17, liveEventInfo.periodicShows);
    }

    public static void LIZIZ(C1142350fph c1142350fph, LiveEventInfo liveEventInfo) {
        C1142340fpg.LJ(c1142350fph, 1, liveEventInfo.eventId);
        C1142340fpg.LJ(c1142350fph, 2, liveEventInfo.startTime);
        C1142340fpg.LJ(c1142350fph, 3, liveEventInfo.duration);
        C1142340fpg.LJFF(c1142350fph, 4, liveEventInfo.title);
        C1142340fpg.LJFF(c1142350fph, 5, liveEventInfo.description);
        C1142340fpg.LIZ(c1142350fph, 6, liveEventInfo.subscribed);
        C1142340fpg.LIZ(c1142350fph, 7, liveEventInfo.isPaidEvent);
        C1142340fpg.LJ(c1142350fph, 8, liveEventInfo.ticketAmount);
        int i = liveEventInfo.payMethod;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LIZJ(i);
        HashMap<String, WalletPackage> map = liveEventInfo.walletPkgDict;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, WalletPackage> entry : liveEventInfo.walletPkgDict.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(10, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, entry.getKey()) + _WalletPackage_ProtoEncoder.LIZIZ(2, entry.getValue()));
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    WalletPackage value = entry.getValue();
                    if (value != null) {
                        c1142350fph.LIZLLL(2, 2);
                        c1142350fph.LJ(C1142340fpg.LJIILL(1, value.iapId) + C1142340fpg.LJIILL(2, value.usdPriceShow));
                        C1142340fpg.LJFF(c1142350fph, 1, value.iapId);
                        C1142340fpg.LJFF(c1142350fph, 2, value.usdPriceShow);
                    }
                }
            }
        }
        List<EventUserInfo> list = liveEventInfo.eventUserInfo;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < liveEventInfo.eventUserInfo.size(); i2++) {
                EventUserInfo eventUserInfo = (EventUserInfo) ListProtector.get(liveEventInfo.eventUserInfo, i2);
                if (eventUserInfo != null) {
                    c1142350fph.LIZLLL(11, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIL(1, eventUserInfo.userId) + C1142340fpg.LJIILL(2, eventUserInfo.avatarUri));
                    long j = eventUserInfo.userId;
                    c1142350fph.LIZLLL(1, 0);
                    c1142350fph.LJFF(j);
                    C1142340fpg.LJFF(c1142350fph, 2, eventUserInfo.avatarUri);
                }
            }
        }
        long j2 = liveEventInfo.subscribedCount;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LJFF(j2);
        PaidEventPreview paidEventPreview = liveEventInfo.paidEventPreview;
        if (paidEventPreview != null) {
            c1142350fph.LIZLLL(13, 2);
            c1142350fph.LJ(C1142340fpg.LJIIL(1, paidEventPreview.allowPreview) + C1142340fpg.LJIIL(2, paidEventPreview.allowPreviewTime));
            long j3 = paidEventPreview.allowPreview;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJFF(j3);
            long j4 = paidEventPreview.allowPreviewTime;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJFF(j4);
        }
        WalletPackage walletPackage = liveEventInfo.walletPackage;
        if (walletPackage != null) {
            c1142350fph.LIZLLL(14, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, walletPackage.iapId) + C1142340fpg.LJIILL(2, walletPackage.usdPriceShow));
            C1142340fpg.LJFF(c1142350fph, 1, walletPackage.iapId);
            C1142340fpg.LJFF(c1142350fph, 2, walletPackage.usdPriceShow);
        }
        long j5 = liveEventInfo.registerType;
        c1142350fph.LIZLLL(15, 0);
        c1142350fph.LJFF(j5);
        C1142340fpg.LJFF(c1142350fph, 16, liveEventInfo.periodicSettings);
        C1142340fpg.LJFF(c1142350fph, 17, liveEventInfo.periodicShows);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LiveEventInfo liveEventInfo) {
        LIZIZ(c1142350fph, liveEventInfo);
    }
}
