package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model._GiftOperation_ProtoEncoder;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoEncoder;
import com.bytedance.android.livesdk.model._Gift_ProtoEncoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftPage_ProtoEncoder implements InterfaceC1132110fZB<GiftPage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftPage giftPage) {
        int iLIZIZ;
        int iLIZ;
        int iLIZIZ2;
        GiftPage giftPage2 = giftPage;
        int i = giftPage2.pageType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, giftPage2.pageName);
        List<Gift> list = giftPage2.gifts;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < giftPage2.gifts.size(); i2++) {
                _Gift_ProtoEncoder.LIZJ(c1142350fph, 3, (Gift) ListProtector.get(giftPage2.gifts, i2));
            }
        }
        boolean z = giftPage2.display;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z ? 1 : 0);
        GiftOperation giftOperation = giftPage2.operation;
        if (giftOperation != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_ImageModel_ProtoEncoder.LJ(1, giftOperation.leftImage) + _ImageModel_ProtoEncoder.LJ(2, giftOperation.rightImage) + C1142340fpg.LJIILL(3, giftOperation.title) + C1142340fpg.LJIILL(4, giftOperation.titleColor) + C1142340fpg.LJIIL(5, giftOperation.titleSize) + C1142340fpg.LJIILL(6, giftOperation.schemeUrl) + C1142340fpg.LJIILL(7, giftOperation.eventName));
            _GiftOperation_ProtoEncoder.LIZIZ(c1142350fph, giftOperation);
        }
        C1142340fpg.LJFF(c1142350fph, 6, giftPage2.eventName);
        GiftPanelBanner giftPanelBanner = giftPage2.pagePanelBanner;
        if (giftPanelBanner != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(_GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner));
            _GiftPanelBanner_ProtoEncoder.LIZIZ(c1142350fph, giftPanelBanner);
        }
        List<Gift> list2 = giftPage2.frequentlyUsedGifts;
        if (list2 != null && !list2.isEmpty()) {
            for (int i3 = 0; i3 < giftPage2.frequentlyUsedGifts.size(); i3++) {
                _Gift_ProtoEncoder.LIZJ(c1142350fph, 8, (Gift) ListProtector.get(giftPage2.frequentlyUsedGifts, i3));
            }
        }
        Map<Long, ForceInsertMetricsItem> map = giftPage2.forceInsertMetrics;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Long, ForceInsertMetricsItem> entry : giftPage2.forceInsertMetrics.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(9, 2);
                    int iLJIILIIL = C1142340fpg.LJIILIIL(1, entry.getKey());
                    ForceInsertMetricsItem value = entry.getValue();
                    if (value == null) {
                        iLIZIZ2 = 0;
                    } else {
                        int iLJIIIZ = C1142340fpg.LJIIIZ(1, value.forceInsertType) + C1142340fpg.LJIIIZ(2, value.forceIndexConfig);
                        iLIZIZ2 = iLJIIIZ + C1142350fph.LIZIZ(iLJIIIZ) + C1142350fph.LIZ(2);
                    }
                    c1142350fph.LJ(iLJIILIIL + iLIZIZ2);
                    C1142340fpg.LJ(c1142350fph, 1, entry.getKey());
                    ForceInsertMetricsItem value2 = entry.getValue();
                    if (value2 != null) {
                        c1142350fph.LIZLLL(2, 2);
                        c1142350fph.LJ(C1142340fpg.LJIIIZ(1, value2.forceInsertType) + C1142340fpg.LJIIIZ(2, value2.forceIndexConfig));
                        int i4 = value2.forceInsertType;
                        c1142350fph.LIZLLL(1, 0);
                        c1142350fph.LIZJ(i4);
                        int i5 = value2.forceIndexConfig;
                        c1142350fph.LIZLLL(2, 0);
                        c1142350fph.LIZJ(i5);
                    }
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 10, giftPage2.region);
        Map<Long, Long> map2 = giftPage2.forceInsertPriorityMap;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<Long, Long> entry2 : giftPage2.forceInsertPriorityMap.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null) {
                    c1142350fph.LIZLLL(11, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILIIL(1, entry2.getKey()) + C1142340fpg.LJIILIIL(2, entry2.getValue()));
                    C1142340fpg.LJ(c1142350fph, 1, entry2.getKey());
                    C1142340fpg.LJ(c1142350fph, 2, entry2.getValue());
                }
            }
        }
        List<Gift> list3 = giftPage2.favouriteGifts;
        if (list3 != null && !list3.isEmpty()) {
            for (int i6 = 0; i6 < giftPage2.favouriteGifts.size(); i6++) {
                _Gift_ProtoEncoder.LIZJ(c1142350fph, 12, (Gift) ListProtector.get(giftPage2.favouriteGifts, i6));
            }
        }
        List<Gift> list4 = giftPage2.backfillGifts;
        if (list4 != null && !list4.isEmpty()) {
            for (int i7 = 0; i7 < giftPage2.backfillGifts.size(); i7++) {
                _Gift_ProtoEncoder.LIZJ(c1142350fph, 13, (Gift) ListProtector.get(giftPage2.backfillGifts, i7));
            }
        }
        boolean z2 = giftPage2.useBackfillSpecialText;
        c1142350fph.LIZLLL(14, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        List<GiftPage.GiftGroupInTab> list5 = giftPage2.groupsInTab;
        if (list5 != null && !list5.isEmpty()) {
            for (int i8 = 0; i8 < giftPage2.groupsInTab.size(); i8++) {
                GiftPage.GiftGroupInTab giftGroupInTab = (GiftPage.GiftGroupInTab) ListProtector.get(giftPage2.groupsInTab, i8);
                if (giftGroupInTab != null) {
                    c1142350fph.LIZLLL(15, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIIZ(1, giftGroupInTab.groupInTab) + _Text_ProtoEncoder.LJ(2, giftGroupInTab.title) + _Text_ProtoEncoder.LJ(3, giftGroupInTab.description));
                    int i9 = giftGroupInTab.groupInTab;
                    c1142350fph.LIZLLL(1, 0);
                    c1142350fph.LIZJ(i9);
                    _Text_ProtoEncoder.LIZJ(c1142350fph, 2, giftGroupInTab.title);
                    _Text_ProtoEncoder.LIZJ(c1142350fph, 3, giftGroupInTab.description);
                }
            }
        }
        List<Gift> list6 = giftPage2.matchGameGifts;
        if (list6 != null && !list6.isEmpty()) {
            for (int i10 = 0; i10 < giftPage2.matchGameGifts.size(); i10++) {
                _Gift_ProtoEncoder.LIZJ(c1142350fph, 16, (Gift) ListProtector.get(giftPage2.matchGameGifts, i10));
            }
        }
        List<GiftPage.GiftDynamicField> list7 = giftPage2.giftDynamicFields;
        if (list7 != null && !list7.isEmpty()) {
            for (int i11 = 0; i11 < giftPage2.giftDynamicFields.size(); i11++) {
                GiftPage.GiftDynamicField giftDynamicField = (GiftPage.GiftDynamicField) ListProtector.get(giftPage2.giftDynamicFields, i11);
                if (giftDynamicField != null) {
                    c1142350fph.LIZLLL(17, 2);
                    int iLJIIL = C1142340fpg.LJIIL(1, giftDynamicField.id) + C1142340fpg.LJIILL(2, giftDynamicField.giftRankRecommendInfo);
                    GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner2 = giftDynamicField.giftPanelBanner;
                    if (giftPanelBanner2 == null) {
                        iLIZIZ = 0;
                    } else {
                        int iLIZJ = _GiftPage_GiftDynamicField_GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner2);
                        iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(3);
                    }
                    int iLJI = iLJIIL + iLIZIZ + C1142340fpg.LJI(4);
                    GiftPage.GiftDynamicField.GiftSponsorInfo giftSponsorInfo = giftDynamicField.giftSponsorInfo;
                    if (giftSponsorInfo == null) {
                        iLIZ = 0;
                    } else {
                        int iLIZJ2 = _GiftPage_GiftDynamicField_GiftSponsorInfo_ProtoEncoder.LIZJ(giftSponsorInfo);
                        iLIZ = C1142350fph.LIZ(5) + iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2);
                    }
                    c1142350fph.LJ(iLJI + iLIZ + C1142340fpg.LJI(6));
                    _GiftPage_GiftDynamicField_ProtoEncoder.LIZIZ(c1142350fph, giftDynamicField);
                }
            }
        }
        boolean z3 = giftPage2.clientCanReorder;
        c1142350fph.LIZLLL(18, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
    }
}
