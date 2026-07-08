package com.bytedance.android.livesdk.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftPanelBeaconBubble;
import com.bytedance.android.livesdk.gift.model.GiftResource;
import com.bytedance.android.livesdk.gift.model._GiftColorInfo_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._GiftPanelBeaconBubble_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._GiftResource_ProtoEncoder;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _Gift_ProtoEncoder implements InterfaceC1132110fZB<Gift> {
    public static void LIZIZ(C1142350fph c1142350fph, Gift gift) {
        int iLIZIZ;
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, gift.image);
        C1142340fpg.LJFF(c1142350fph, 2, gift.describe);
        long j = gift.duration;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j);
        long j2 = gift.id;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j2);
        boolean z = gift.forLinkMic;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = gift.combo;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        int i = gift.type;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LIZJ(i);
        int i2 = gift.diamondCount;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LIZJ(i2);
        boolean z3 = gift.isDisplayedOnPanel;
        c1142350fph.LIZLLL(13, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        long j3 = gift.primaryEffectId;
        c1142350fph.LIZLLL(14, 0);
        c1142350fph.LJFF(j3);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 15, gift.leftLogo);
        C1142340fpg.LJFF(c1142350fph, 16, gift.name);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 21, gift.icon);
        C1142340fpg.LJFF(c1142350fph, 24, gift.liveUserPngInfo);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 47, gift.previewImage);
        GiftPanelBanner giftPanelBanner = gift.giftPanelBanner;
        if (giftPanelBanner != null) {
            c1142350fph.LIZLLL(48, 2);
            c1142350fph.LJ(_GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner));
            _GiftPanelBanner_ProtoEncoder.LIZIZ(c1142350fph, giftPanelBanner);
        }
        boolean z4 = gift.isBroadcastGift;
        c1142350fph.LIZLLL(49, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        boolean z5 = gift.isEffectBEFView;
        c1142350fph.LIZLLL(50, 0);
        c1142350fph.LJ(z5 ? 1 : 0);
        boolean z6 = gift.isRandomGift;
        c1142350fph.LIZLLL(51, 0);
        c1142350fph.LJ(z6 ? 1 : 0);
        boolean z7 = gift.isBoxGift;
        c1142350fph.LIZLLL(52, 0);
        c1142350fph.LJ(z7 ? 1 : 0);
        boolean z8 = gift.canPutInGiftBox;
        c1142350fph.LIZLLL(53, 0);
        c1142350fph.LJ(z8 ? 1 : 0);
        GiftBoxInfo giftBoxInfo = gift.giftBoxInfo;
        if (giftBoxInfo != null) {
            c1142350fph.LIZLLL(54, 2);
            c1142350fph.LJ(_GiftBoxInfo_ProtoEncoder.LIZIZ(giftBoxInfo));
            long j4 = giftBoxInfo.capacity;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJFF(j4);
            boolean z9 = giftBoxInfo.isPrimaryBox;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJ(z9 ? 1 : 0);
            C1142340fpg.LJFF(c1142350fph, 3, giftBoxInfo.schemeUrl);
        }
        Map<String, String> map = gift.trackerParams;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : gift.trackerParams.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(100, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue()));
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LJFF(c1142350fph, 2, entry.getValue());
                }
            }
        }
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo != null) {
            c1142350fph.LIZLLL(101, 2);
            c1142350fph.LJ(_GiftLockInfo_ProtoEncoder.LIZJ(giftLockInfo));
            _GiftLockInfo_ProtoEncoder.LIZIZ(c1142350fph, giftLockInfo);
        }
        List<GiftColorInfo> list = gift.colorInfos;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < gift.colorInfos.size(); i3++) {
                GiftColorInfo giftColorInfo = (GiftColorInfo) ListProtector.get(gift.colorInfos, i3);
                if (giftColorInfo != null) {
                    c1142350fph.LIZLLL(102, 2);
                    c1142350fph.LJ(_GiftColorInfo_ProtoEncoder.LIZJ(giftColorInfo));
                    _GiftColorInfo_ProtoEncoder.LIZIZ(c1142350fph, giftColorInfo);
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 103, gift.recommendInfo);
        GiftRandomEffectInfo giftRandomEffectInfo = gift.randomEffectInfo;
        if (giftRandomEffectInfo != null) {
            c1142350fph.LIZLLL(104, 2);
            c1142350fph.LJ(_GiftRandomEffectInfo_ProtoEncoder.LIZJ(giftRandomEffectInfo));
            _GiftRandomEffectInfo_ProtoEncoder.LIZIZ(c1142350fph, giftRandomEffectInfo);
        }
        int i4 = gift.giftSubType;
        c1142350fph.LIZLLL(105, 0);
        c1142350fph.LIZJ(i4);
        List<Integer> list2 = gift.giftVerticalScenarios;
        if (list2 != null && !list2.isEmpty()) {
            for (int i5 = 0; i5 < gift.giftVerticalScenarios.size(); i5++) {
                C1142340fpg.LIZLLL(c1142350fph, 106, (Integer) ListProtector.get(gift.giftVerticalScenarios, i5));
            }
        }
        int i6 = gift.groupInTab;
        c1142350fph.LIZLLL(107, 0);
        c1142350fph.LIZJ(i6);
        boolean z10 = gift.isGalleryGift;
        c1142350fph.LIZLLL(108, 0);
        c1142350fph.LJ(z10 ? 1 : 0);
        Gift.GiftSponsorInfo giftSponsorInfo = gift.giftSponsorInfo;
        if (giftSponsorInfo != null) {
            c1142350fph.LIZLLL(109, 2);
            c1142350fph.LJ(_Gift_GiftSponsorInfo_ProtoEncoder.LIZJ(giftSponsorInfo));
            _Gift_GiftSponsorInfo_ProtoEncoder.LIZIZ(c1142350fph, giftSponsorInfo);
        }
        List<Gift.GiftSkin> list3 = gift.giftSkins;
        if (list3 != null && !list3.isEmpty()) {
            for (int i7 = 0; i7 < gift.giftSkins.size(); i7++) {
                Gift.GiftSkin giftSkin = (Gift.GiftSkin) ListProtector.get(gift.giftSkins, i7);
                if (giftSkin != null) {
                    c1142350fph.LIZLLL(110, 2);
                    c1142350fph.LJ(_Gift_GiftSkin_ProtoEncoder.LIZJ(giftSkin));
                    _Gift_GiftSkin_ProtoEncoder.LIZIZ(c1142350fph, giftSkin);
                }
            }
        }
        int i8 = gift.giftLabelType;
        c1142350fph.LIZLLL(111, 0);
        c1142350fph.LIZJ(i8);
        List<Gift.GiftText> list4 = gift.giftTexts;
        if (list4 != null && !list4.isEmpty()) {
            for (int i9 = 0; i9 < gift.giftTexts.size(); i9++) {
                Gift.GiftText giftText = (Gift.GiftText) ListProtector.get(gift.giftTexts, i9);
                if (giftText != null) {
                    c1142350fph.LIZLLL(112, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIL(1, giftText.giftTextId) + C1142340fpg.LJIILL(2, giftText.giftTextName));
                    long j5 = giftText.giftTextId;
                    c1142350fph.LIZLLL(1, 0);
                    c1142350fph.LJFF(j5);
                    C1142340fpg.LJFF(c1142350fph, 2, giftText.giftTextName);
                }
            }
        }
        List<Gift.GiftSkinToGiftTextsInfo> list5 = gift.giftSkinToGiftTextsInfos;
        if (list5 != null && !list5.isEmpty()) {
            for (int i10 = 0; i10 < gift.giftSkinToGiftTextsInfos.size(); i10++) {
                Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo = (Gift.GiftSkinToGiftTextsInfo) ListProtector.get(gift.giftSkinToGiftTextsInfos, i10);
                if (giftSkinToGiftTextsInfo != null) {
                    c1142350fph.LIZLLL(113, 2);
                    c1142350fph.LJ(_Gift_GiftSkinToGiftTextsInfo_ProtoEncoder.LIZJ(giftSkinToGiftTextsInfo));
                    _Gift_GiftSkinToGiftTextsInfo_ProtoEncoder.LIZIZ(c1142350fph, giftSkinToGiftTextsInfo);
                }
            }
        }
        long j6 = gift.expirationTimestamp;
        c1142350fph.LIZLLL(114, 0);
        c1142350fph.LJFF(j6);
        Gift.BatchGiftInfo batchGiftInfo = gift.batchGiftInfo;
        if (batchGiftInfo != null) {
            c1142350fph.LIZLLL(115, 2);
            c1142350fph.LJ(_Gift_BatchGiftInfo_ProtoEncoder.LIZJ(batchGiftInfo));
            _Gift_BatchGiftInfo_ProtoEncoder.LIZIZ(c1142350fph, batchGiftInfo);
        }
        boolean z11 = gift.isGlobalGift;
        c1142350fph.LIZLLL(116, 0);
        c1142350fph.LJ(z11 ? 1 : 0);
        boolean z12 = gift.disableGalleryBanner;
        c1142350fph.LIZLLL(117, 0);
        c1142350fph.LJ(z12 ? 1 : 0);
        Gift.UGGiftStructInfo uGGiftStructInfo = gift.ugGiftInfo;
        if (uGGiftStructInfo != null) {
            c1142350fph.LIZLLL(118, 2);
            c1142350fph.LJ(C1142340fpg.LJI(1) + C1142340fpg.LJIIL(2, uGGiftStructInfo.ugPointsCost));
            boolean z13 = uGGiftStructInfo.isUgGift;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJ(z13 ? 1 : 0);
            long j7 = uGGiftStructInfo.ugPointsCost;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJFF(j7);
        }
        Gift.CrossScreenEffectInfo crossScreenEffectInfo = gift.crossScreenEffectInfo;
        if (crossScreenEffectInfo != null) {
            c1142350fph.LIZLLL(119, 2);
            c1142350fph.LJ(_Gift_CrossScreenEffectInfo_ProtoEncoder.LIZJ(crossScreenEffectInfo));
            _Gift_CrossScreenEffectInfo_ProtoEncoder.LIZIZ(c1142350fph, crossScreenEffectInfo);
        }
        GiftPanelBeaconBubble giftPanelBeaconBubble = gift.beaconBubble;
        if (giftPanelBeaconBubble != null) {
            c1142350fph.LIZLLL(120, 2);
            c1142350fph.LJ(_GiftPanelBeaconBubble_ProtoEncoder.LIZIZ(giftPanelBeaconBubble));
            C1142340fpg.LJFF(c1142350fph, 1, giftPanelBeaconBubble.lynxUrl);
            C1142340fpg.LJFF(c1142350fph, 2, giftPanelBeaconBubble.lynxExtra);
            int i11 = giftPanelBeaconBubble.type;
            c1142350fph.LIZLLL(3, 0);
            c1142350fph.LIZJ(i11);
        }
        Map<String, GiftResource> map2 = gift.giftResources;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<String, GiftResource> entry2 : gift.giftResources.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null) {
                    c1142350fph.LIZLLL(121, 2);
                    int iLJIILL = C1142340fpg.LJIILL(1, entry2.getKey());
                    GiftResource value = entry2.getValue();
                    if (value == null) {
                        iLIZIZ = 0;
                    } else {
                        int iLIZIZ2 = _GiftResource_ProtoEncoder.LIZIZ(value);
                        iLIZIZ = iLIZIZ2 + C1142350fph.LIZIZ(iLIZIZ2) + C1142350fph.LIZ(2);
                    }
                    c1142350fph.LJ(iLJIILL + iLIZIZ);
                    C1142340fpg.LJFF(c1142350fph, 1, entry2.getKey());
                    GiftResource value2 = entry2.getValue();
                    if (value2 != null) {
                        c1142350fph.LIZLLL(2, 2);
                        c1142350fph.LJ(_GiftResource_ProtoEncoder.LIZIZ(value2));
                        long j8 = value2.id;
                        c1142350fph.LIZLLL(1, 0);
                        c1142350fph.LJFF(j8);
                        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, value2.image);
                        long j9 = value2.effectId;
                        c1142350fph.LIZLLL(3, 0);
                        c1142350fph.LJFF(j9);
                    }
                }
            }
        }
        long j10 = gift.resourceId;
        c1142350fph.LIZLLL(122, 0);
        c1142350fph.LJFF(j10);
        Map<Long, String> map3 = gift.bizExtra;
        if (map3 != null && !map3.isEmpty()) {
            for (Map.Entry<Long, String> entry3 : gift.bizExtra.entrySet()) {
                if (entry3.getKey() != null && entry3.getValue() != null) {
                    c1142350fph.LIZLLL(123, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILIIL(1, entry3.getKey()) + C1142340fpg.LJIILL(2, entry3.getValue()));
                    C1142340fpg.LJ(c1142350fph, 1, entry3.getKey());
                    C1142340fpg.LJFF(c1142350fph, 2, entry3.getValue());
                }
            }
        }
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo = gift.lynxCrossScreenEffectInfo;
        if (lynxCrossScreenEffectInfo != null) {
            c1142350fph.LIZLLL(124, 2);
            c1142350fph.LJ(_Gift_LynxCrossScreenEffectInfo_ProtoEncoder.LIZJ(lynxCrossScreenEffectInfo));
            _Gift_LynxCrossScreenEffectInfo_ProtoEncoder.LIZIZ(c1142350fph, lynxCrossScreenEffectInfo);
        }
        C1142340fpg.LJFF(c1142350fph, 125, gift.giftStructHash);
        Gift.SchemeInfo schemeInfo = gift.schemeInfo;
        if (schemeInfo != null) {
            c1142350fph.LIZLLL(126, 2);
            c1142350fph.LJ(_Gift_SchemeInfo_ProtoEncoder.LIZJ(schemeInfo));
            _Gift_SchemeInfo_ProtoEncoder.LIZIZ(c1142350fph, schemeInfo);
        }
        Gift.GiftSeriesInfo giftSeriesInfo = gift.seriesInfo;
        if (giftSeriesInfo != null) {
            c1142350fph.LIZLLL(127, 2);
            c1142350fph.LJ(_Gift_GiftSeriesInfo_ProtoEncoder.LIZJ(giftSeriesInfo));
            _Gift_GiftSeriesInfo_ProtoEncoder.LIZIZ(c1142350fph, giftSeriesInfo);
        }
        Gift.ColorPickerInfo colorPickerInfo = gift.colorPickerInfo;
        if (colorPickerInfo != null) {
            c1142350fph.LIZLLL(128, 2);
            c1142350fph.LJ(_Gift_ColorPickerInfo_ProtoEncoder.LIZJ(colorPickerInfo));
            _Gift_ColorPickerInfo_ProtoEncoder.LIZIZ(c1142350fph, colorPickerInfo);
        }
        Gift.MusicGiftInfo musicGiftInfo = gift.musicInfo;
        if (musicGiftInfo != null) {
            c1142350fph.LIZLLL(140, 2);
            c1142350fph.LJ(_Gift_MusicGiftInfo_ProtoEncoder.LIZJ(musicGiftInfo));
            _Gift_MusicGiftInfo_ProtoEncoder.LIZIZ(c1142350fph, musicGiftInfo);
        }
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 141, gift.giftBottomRightLabelIcon);
        C1142340fpg.LJFF(c1142350fph, 201, gift.strategyEvent);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, Gift gift) {
        LIZIZ(c1142350fph, gift);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, Gift gift) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZIZ7;
        int iLIZIZ8;
        int iLIZIZ9;
        int iLIZIZ10;
        int iLIZIZ11;
        int iLIZIZ12;
        int iLIZIZ13;
        int iLIZIZ14;
        int iLIZIZ15;
        int iLIZIZ16;
        int iLIZIZ17;
        int iLIZIZ18;
        if (gift == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        int iLIZIZ19 = 0;
        int iLJ = _ImageModel_ProtoEncoder.LJ(1, gift.image) + C1142340fpg.LJIILL(2, gift.describe) + C1142340fpg.LJIIL(4, gift.duration) + C1142340fpg.LJIIL(5, gift.id) + C1142340fpg.LJI(7) + C1142340fpg.LJI(10) + C1142340fpg.LJIIIZ(11, gift.type) + C1142340fpg.LJIIIZ(12, gift.diamondCount) + C1142340fpg.LJI(13) + C1142340fpg.LJIIL(14, gift.primaryEffectId) + _ImageModel_ProtoEncoder.LJ(15, gift.leftLogo) + C1142340fpg.LJIILL(16, gift.name) + _ImageModel_ProtoEncoder.LJ(21, gift.icon) + C1142340fpg.LJIILL(24, gift.liveUserPngInfo) + _ImageModel_ProtoEncoder.LJ(47, gift.previewImage);
        GiftPanelBanner giftPanelBanner = gift.giftPanelBanner;
        if (giftPanelBanner == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(48);
        }
        int iLJI = iLJ + iLIZIZ + C1142340fpg.LJI(49) + C1142340fpg.LJI(50) + C1142340fpg.LJI(51) + C1142340fpg.LJI(52) + C1142340fpg.LJI(53);
        GiftBoxInfo giftBoxInfo = gift.giftBoxInfo;
        if (giftBoxInfo == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZIZ20 = _GiftBoxInfo_ProtoEncoder.LIZIZ(giftBoxInfo);
            iLIZIZ2 = iLIZIZ20 + C1142350fph.LIZIZ(iLIZIZ20) + C1142350fph.LIZ(54);
        }
        int iLIZIZ21 = iLJI + iLIZIZ2;
        Map<String, String> map = gift.trackerParams;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : gift.trackerParams.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIILL = C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue());
                    iLIZIZ21 += iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(100);
                }
            }
        }
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo == null) {
            iLIZIZ3 = 0;
        } else {
            int iLIZJ2 = _GiftLockInfo_ProtoEncoder.LIZJ(giftLockInfo);
            iLIZIZ3 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(101);
        }
        int i2 = iLIZIZ21 + iLIZIZ3;
        List<GiftColorInfo> list = gift.colorInfos;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < gift.colorInfos.size(); i3++) {
                GiftColorInfo giftColorInfo = (GiftColorInfo) ListProtector.get(gift.colorInfos, i3);
                if (giftColorInfo == null) {
                    iLIZIZ18 = 0;
                } else {
                    int iLIZJ3 = _GiftColorInfo_ProtoEncoder.LIZJ(giftColorInfo);
                    iLIZIZ18 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + C1142350fph.LIZ(102);
                }
                i2 += iLIZIZ18;
            }
        }
        int iLJIILL2 = i2 + C1142340fpg.LJIILL(103, gift.recommendInfo);
        GiftRandomEffectInfo giftRandomEffectInfo = gift.randomEffectInfo;
        if (giftRandomEffectInfo == null) {
            iLIZIZ4 = 0;
        } else {
            int iLIZJ4 = _GiftRandomEffectInfo_ProtoEncoder.LIZJ(giftRandomEffectInfo);
            iLIZIZ4 = iLIZJ4 + C1142350fph.LIZIZ(iLIZJ4) + C1142350fph.LIZ(104);
        }
        int iLJIIIZ = iLJIILL2 + iLIZIZ4 + C1142340fpg.LJIIIZ(105, gift.giftSubType);
        List<Integer> list2 = gift.giftVerticalScenarios;
        if (list2 != null && !list2.isEmpty()) {
            for (int i4 = 0; i4 < gift.giftVerticalScenarios.size(); i4++) {
                iLJIIIZ += C1142340fpg.LJIIJ(106, (Integer) ListProtector.get(gift.giftVerticalScenarios, i4));
            }
        }
        int iLJIIIZ2 = iLJIIIZ + C1142340fpg.LJIIIZ(107, gift.groupInTab) + C1142340fpg.LJI(108);
        Gift.GiftSponsorInfo giftSponsorInfo = gift.giftSponsorInfo;
        if (giftSponsorInfo == null) {
            iLIZIZ5 = 0;
        } else {
            int iLIZJ5 = _Gift_GiftSponsorInfo_ProtoEncoder.LIZJ(giftSponsorInfo);
            iLIZIZ5 = iLIZJ5 + C1142350fph.LIZIZ(iLIZJ5) + C1142350fph.LIZ(109);
        }
        int i5 = iLJIIIZ2 + iLIZIZ5;
        List<Gift.GiftSkin> list3 = gift.giftSkins;
        if (list3 != null && !list3.isEmpty()) {
            for (int i6 = 0; i6 < gift.giftSkins.size(); i6++) {
                Gift.GiftSkin giftSkin = (Gift.GiftSkin) ListProtector.get(gift.giftSkins, i6);
                if (giftSkin == null) {
                    iLIZIZ17 = 0;
                } else {
                    int iLIZJ6 = _Gift_GiftSkin_ProtoEncoder.LIZJ(giftSkin);
                    iLIZIZ17 = iLIZJ6 + C1142350fph.LIZIZ(iLIZJ6) + C1142350fph.LIZ(110);
                }
                i5 += iLIZIZ17;
            }
        }
        int iLJIIIZ3 = i5 + C1142340fpg.LJIIIZ(111, gift.giftLabelType);
        List<Gift.GiftText> list4 = gift.giftTexts;
        if (list4 != null && !list4.isEmpty()) {
            for (int i7 = 0; i7 < gift.giftTexts.size(); i7++) {
                Gift.GiftText giftText = (Gift.GiftText) ListProtector.get(gift.giftTexts, i7);
                if (giftText == null) {
                    iLIZIZ16 = 0;
                } else {
                    int iLJIIL = C1142340fpg.LJIIL(1, giftText.giftTextId) + C1142340fpg.LJIILL(2, giftText.giftTextName);
                    iLIZIZ16 = iLJIIL + C1142350fph.LIZIZ(iLJIIL) + C1142350fph.LIZ(112);
                }
                iLJIIIZ3 += iLIZIZ16;
            }
        }
        List<Gift.GiftSkinToGiftTextsInfo> list5 = gift.giftSkinToGiftTextsInfos;
        if (list5 != null && !list5.isEmpty()) {
            for (int i8 = 0; i8 < gift.giftSkinToGiftTextsInfos.size(); i8++) {
                Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo = (Gift.GiftSkinToGiftTextsInfo) ListProtector.get(gift.giftSkinToGiftTextsInfos, i8);
                if (giftSkinToGiftTextsInfo == null) {
                    iLIZIZ15 = 0;
                } else {
                    int iLIZJ7 = _Gift_GiftSkinToGiftTextsInfo_ProtoEncoder.LIZJ(giftSkinToGiftTextsInfo);
                    iLIZIZ15 = iLIZJ7 + C1142350fph.LIZIZ(iLIZJ7) + C1142350fph.LIZ(113);
                }
                iLJIIIZ3 += iLIZIZ15;
            }
        }
        int iLJIIL2 = iLJIIIZ3 + C1142340fpg.LJIIL(114, gift.expirationTimestamp);
        Gift.BatchGiftInfo batchGiftInfo = gift.batchGiftInfo;
        if (batchGiftInfo == null) {
            iLIZIZ6 = 0;
        } else {
            int iLIZJ8 = _Gift_BatchGiftInfo_ProtoEncoder.LIZJ(batchGiftInfo);
            iLIZIZ6 = iLIZJ8 + C1142350fph.LIZIZ(iLIZJ8) + C1142350fph.LIZ(115);
        }
        int iLJI2 = iLJIIL2 + iLIZIZ6 + C1142340fpg.LJI(116) + C1142340fpg.LJI(117);
        Gift.UGGiftStructInfo uGGiftStructInfo = gift.ugGiftInfo;
        if (uGGiftStructInfo == null) {
            iLIZIZ7 = 0;
        } else {
            int iLJI3 = C1142340fpg.LJI(1) + C1142340fpg.LJIIL(2, uGGiftStructInfo.ugPointsCost);
            iLIZIZ7 = iLJI3 + C1142350fph.LIZIZ(iLJI3) + C1142350fph.LIZ(118);
        }
        int i9 = iLJI2 + iLIZIZ7;
        Gift.CrossScreenEffectInfo crossScreenEffectInfo = gift.crossScreenEffectInfo;
        if (crossScreenEffectInfo == null) {
            iLIZIZ8 = 0;
        } else {
            int iLIZJ9 = _Gift_CrossScreenEffectInfo_ProtoEncoder.LIZJ(crossScreenEffectInfo);
            iLIZIZ8 = iLIZJ9 + C1142350fph.LIZIZ(iLIZJ9) + C1142350fph.LIZ(119);
        }
        int i10 = i9 + iLIZIZ8;
        GiftPanelBeaconBubble giftPanelBeaconBubble = gift.beaconBubble;
        if (giftPanelBeaconBubble == null) {
            iLIZIZ9 = 0;
        } else {
            int iLIZIZ22 = _GiftPanelBeaconBubble_ProtoEncoder.LIZIZ(giftPanelBeaconBubble);
            iLIZIZ9 = iLIZIZ22 + C1142350fph.LIZIZ(iLIZIZ22) + C1142350fph.LIZ(120);
        }
        int iLIZIZ23 = i10 + iLIZIZ9;
        Map<String, GiftResource> map2 = gift.giftResources;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<String, GiftResource> entry2 : gift.giftResources.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null) {
                    int iLJIILL3 = C1142340fpg.LJIILL(1, entry2.getKey());
                    GiftResource value = entry2.getValue();
                    if (value == null) {
                        iLIZIZ14 = 0;
                    } else {
                        int iLIZIZ24 = _GiftResource_ProtoEncoder.LIZIZ(value);
                        iLIZIZ14 = iLIZIZ24 + C1142350fph.LIZIZ(iLIZIZ24) + C1142350fph.LIZ(2);
                    }
                    int i11 = iLJIILL3 + iLIZIZ14;
                    iLIZIZ23 += i11 + C1142350fph.LIZIZ(i11) + C1142350fph.LIZ(121);
                }
            }
        }
        int iLJIIL3 = iLIZIZ23 + C1142340fpg.LJIIL(122, gift.resourceId);
        Map<Long, String> map3 = gift.bizExtra;
        if (map3 != null && !map3.isEmpty()) {
            for (Map.Entry<Long, String> entry3 : gift.bizExtra.entrySet()) {
                if (entry3.getKey() != null && entry3.getValue() != null) {
                    int iLJIILIIL = C1142340fpg.LJIILIIL(1, entry3.getKey()) + C1142340fpg.LJIILL(2, entry3.getValue());
                    iLJIIL3 += iLJIILIIL + C1142350fph.LIZIZ(iLJIILIIL) + C1142350fph.LIZ(123);
                }
            }
        }
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo = gift.lynxCrossScreenEffectInfo;
        if (lynxCrossScreenEffectInfo == null) {
            iLIZIZ10 = 0;
        } else {
            int iLIZJ10 = _Gift_LynxCrossScreenEffectInfo_ProtoEncoder.LIZJ(lynxCrossScreenEffectInfo);
            iLIZIZ10 = iLIZJ10 + C1142350fph.LIZIZ(iLIZJ10) + C1142350fph.LIZ(124);
        }
        int iLJIILL4 = iLJIIL3 + iLIZIZ10 + C1142340fpg.LJIILL(125, gift.giftStructHash);
        Gift.SchemeInfo schemeInfo = gift.schemeInfo;
        if (schemeInfo == null) {
            iLIZIZ11 = 0;
        } else {
            int iLIZJ11 = _Gift_SchemeInfo_ProtoEncoder.LIZJ(schemeInfo);
            iLIZIZ11 = iLIZJ11 + C1142350fph.LIZIZ(iLIZJ11) + C1142350fph.LIZ(126);
        }
        int i12 = iLJIILL4 + iLIZIZ11;
        Gift.GiftSeriesInfo giftSeriesInfo = gift.seriesInfo;
        if (giftSeriesInfo == null) {
            iLIZIZ12 = 0;
        } else {
            int iLIZJ12 = _Gift_GiftSeriesInfo_ProtoEncoder.LIZJ(giftSeriesInfo);
            iLIZIZ12 = iLIZJ12 + C1142350fph.LIZIZ(iLIZJ12) + C1142350fph.LIZ(127);
        }
        int i13 = i12 + iLIZIZ12;
        Gift.ColorPickerInfo colorPickerInfo = gift.colorPickerInfo;
        if (colorPickerInfo == null) {
            iLIZIZ13 = 0;
        } else {
            int iLIZJ13 = _Gift_ColorPickerInfo_ProtoEncoder.LIZJ(colorPickerInfo);
            iLIZIZ13 = iLIZJ13 + C1142350fph.LIZIZ(iLIZJ13) + C1142350fph.LIZ(128);
        }
        int i14 = i13 + iLIZIZ13;
        Gift.MusicGiftInfo musicGiftInfo = gift.musicInfo;
        if (musicGiftInfo != null) {
            int iLIZJ14 = _Gift_MusicGiftInfo_ProtoEncoder.LIZJ(musicGiftInfo);
            iLIZIZ19 = iLIZJ14 + C1142350fph.LIZIZ(iLIZJ14) + C1142350fph.LIZ(140);
        }
        c1142350fph.LJ(i14 + iLIZIZ19 + _ImageModel_ProtoEncoder.LJ(141, gift.giftBottomRightLabelIcon) + C1142340fpg.LJIILL(201, gift.strategyEvent));
        LIZIZ(c1142350fph, gift);
    }
}
