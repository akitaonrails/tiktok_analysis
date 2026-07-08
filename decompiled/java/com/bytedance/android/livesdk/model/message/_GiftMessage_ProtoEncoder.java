package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user._User_ProtoEncoder;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.gift.model.GiftEffectStreamSpec;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.gift.model.SecondaryEffectInfo;
import com.bytedance.android.livesdk.gift.model._AssetBundle_PrefabBundle_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._AssetBundle_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._FlyingMicResources_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._GiftEffectSpecs_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._GiftEffectStreamSpec_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._GiftEffect_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._LynxGiftExtra_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._MatchInfo_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model._SecondaryEffectInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model._GiftInfoInBox_ProtoEncoder;
import com.bytedance.android.livesdk.model._GiftTrayInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model._Gift_ProtoEncoder;
import com.bytedance.android.livesdk.model._GiftsBoxInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.TextEffect;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoEncoder;
import com.bytedance.android.livesdkapi.message._LiveMessageID_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;
import webcast.data._UserIdentity_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftMessage_ProtoEncoder implements InterfaceC1132110fZB<GiftMessage> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftMessage giftMessage) {
        int iLJ;
        int iLJIILL;
        int iLJ2;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZ;
        int i;
        int iLIZIZ7;
        int iLJIILIIL;
        int iLIZIZ8;
        int iLIZIZ9;
        int iLIZ2;
        GiftMessage giftMessage2 = giftMessage;
        CommonMessageData commonMessageData = giftMessage2.baseMessage;
        int iLJI = C1142340fpg.LJI(1);
        int iLIZ3 = C1142350fph.LIZ(1);
        int iLJI2 = C1142340fpg.LJI(6);
        int iLJI3 = C1142340fpg.LJI(5);
        int iLJI4 = C1142340fpg.LJI(4);
        int iLJI5 = C1142340fpg.LJI(3);
        int iLIZ4 = C1142350fph.LIZ(2);
        int iLJI6 = C1142340fpg.LJI(2);
        int iLIZIZ10 = 0;
        if (commonMessageData != null) {
            c1142350fph.LIZLLL(1, 2);
            int iLJIILL2 = C1142340fpg.LJIILL(1, commonMessageData.method) + C1142340fpg.LJIIL(2, commonMessageData.messageId) + C1142340fpg.LJIIL(3, commonMessageData.roomId) + C1142340fpg.LJIIL(4, commonMessageData.createTime) + C1142340fpg.LJIIIZ(5, commonMessageData.monitor) + iLJI2 + C1142340fpg.LJIILL(7, commonMessageData.describe) + _Text_ProtoEncoder.LJ(8, commonMessageData.displayText) + C1142340fpg.LJIIL(9, commonMessageData.foldType) + C1142340fpg.LJIILIIL(10, commonMessageData.anchorFoldType) + C1142340fpg.LJIIL(11, commonMessageData.priorityScore) + C1142340fpg.LJIILL(12, commonMessageData.logId) + C1142340fpg.LJIILL(13, commonMessageData.msgProcessFilterK) + C1142340fpg.LJIILL(14, commonMessageData.msgProcessFilterV) + C1142340fpg.LJIILL(15, commonMessageData.fromIdc) + C1142340fpg.LJIILL(16, commonMessageData.toIdc);
            List<String> list = commonMessageData.filterTags;
            if (list != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < commonMessageData.filterTags.size(); i2++) {
                    iLJIILL2 += C1142340fpg.LJIILL(17, (String) ListProtector.get(commonMessageData.filterTags, i2));
                }
            }
            LiveMessageSEI liveMessageSEI = commonMessageData.messageSEI;
            if (liveMessageSEI == null) {
                iLIZ2 = 0;
            } else {
                int iLIZJ = _LiveMessageID_ProtoEncoder.LIZJ(1, liveMessageSEI.uniqueID) + C1142340fpg.LJIIL(2, liveMessageSEI.timestamp);
                iLIZ2 = C1142350fph.LIZ(18) + iLIZJ + C1142350fph.LIZIZ(iLIZJ);
            }
            c1142350fph.LJ(iLJIILL2 + iLIZ2 + _LiveMessageID_ProtoEncoder.LIZJ(19, commonMessageData.dependRootID) + _LiveMessageID_ProtoEncoder.LIZJ(20, commonMessageData.dependID) + C1142340fpg.LJIIL(21, commonMessageData.anchorPriorityScore) + C1142340fpg.LJIIL(22, commonMessageData.roomMessageHeatLevel) + C1142340fpg.LJIIL(23, commonMessageData.foldTypeForWeb) + C1142340fpg.LJIIL(24, commonMessageData.anchorFoldTypeForWeb) + C1142340fpg.LJIIL(25, commonMessageData.clientSendTime) + C1142340fpg.LJIIIZ(26, commonMessageData.dispatchStrategy));
            _CommonMessageData_ProtoEncoder.LIZIZ(c1142350fph, commonMessageData);
        }
        long j = giftMessage2.giftId;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = giftMessage2.fanTicketCount;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        long j3 = giftMessage2.groupCount;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j3);
        long j4 = giftMessage2.repeatCount;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j4);
        long j5 = giftMessage2.comboCount;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j5);
        _User_ProtoEncoder.LIZJ(c1142350fph, 7, giftMessage2.fromUser);
        _User_ProtoEncoder.LIZJ(c1142350fph, 8, giftMessage2.toUser);
        int i3 = giftMessage2.repeatEnd;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LIZJ(i3);
        TextEffect textEffect = giftMessage2.textEffect;
        if (textEffect != null) {
            c1142350fph.LIZLLL(10, 2);
            TextEffect.Detail detail = textEffect.portraitDetail;
            if (detail == null) {
                iLIZIZ8 = 0;
            } else {
                int iLIZJ2 = _TextEffect_Detail_ProtoEncoder.LIZJ(detail);
                iLIZIZ8 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + iLIZ3;
            }
            TextEffect.Detail detail2 = textEffect.landscapeDetail;
            if (detail2 == null) {
                iLIZIZ9 = 0;
            } else {
                int iLIZJ3 = _TextEffect_Detail_ProtoEncoder.LIZJ(detail2);
                iLIZIZ9 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + iLIZ4;
            }
            c1142350fph.LJ(iLIZIZ8 + iLIZIZ9);
            TextEffect.Detail detail3 = textEffect.portraitDetail;
            if (detail3 != null) {
                c1142350fph.LIZLLL(1, 2);
                c1142350fph.LJ(_TextEffect_Detail_ProtoEncoder.LIZJ(detail3));
                _TextEffect_Detail_ProtoEncoder.LIZIZ(c1142350fph, detail3);
            }
            TextEffect.Detail detail4 = textEffect.landscapeDetail;
            if (detail4 != null) {
                c1142350fph.LIZLLL(2, 2);
                c1142350fph.LJ(_TextEffect_Detail_ProtoEncoder.LIZJ(detail4));
                _TextEffect_Detail_ProtoEncoder.LIZIZ(c1142350fph, detail4);
            }
        }
        long j6 = giftMessage2.groupId;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJFF(j6);
        C1142340fpg.LJ(c1142350fph, 12, giftMessage2.incomeTaskgifts);
        long j7 = giftMessage2.roomFanTicketCount;
        c1142350fph.LIZLLL(13, 0);
        c1142350fph.LJFF(j7);
        GiftIMPriority giftIMPriority = giftMessage2.priority;
        if (giftIMPriority != null) {
            c1142350fph.LIZLLL(14, 2);
            List<Long> list2 = giftIMPriority.queueSizes;
            if (list2 != null && !list2.isEmpty()) {
                iLJIILIIL = 0;
                for (int i4 = 0; i4 < giftIMPriority.queueSizes.size(); i4++) {
                    iLJIILIIL += C1142340fpg.LJIILIIL(1, (Long) ListProtector.get(giftIMPriority.queueSizes, i4));
                }
            } else {
                iLJIILIIL = 0;
            }
            c1142350fph.LJ(iLJIILIIL + C1142340fpg.LJIIL(2, giftIMPriority.selfQueuePriority) + C1142340fpg.LJIIL(3, giftIMPriority.priority));
            _GiftIMPriority_ProtoEncoder.LIZIZ(c1142350fph, giftIMPriority);
        }
        _Gift_ProtoEncoder.LIZJ(c1142350fph, 15, giftMessage2.mGift);
        C1142340fpg.LJFF(c1142350fph, 16, giftMessage2.mLogId);
        C1142340fpg.LJ(c1142350fph, 17, giftMessage2.sendType);
        PublicAreaCommon publicAreaCommon = giftMessage2.publicAreaCommon;
        if (publicAreaCommon != null) {
            c1142350fph.LIZLLL(18, 2);
            c1142350fph.LJ(_ImageModel_ProtoEncoder.LJ(1, publicAreaCommon.userLabel) + C1142340fpg.LJIILIIL(2, publicAreaCommon.userConsumeInRoom));
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, publicAreaCommon.userLabel);
            C1142340fpg.LJ(c1142350fph, 2, publicAreaCommon.userConsumeInRoom);
        }
        _Text_ProtoEncoder.LIZJ(c1142350fph, 19, giftMessage2.trayDisplayText);
        C1142340fpg.LJ(c1142350fph, 20, giftMessage2.bannedDisplayEffects);
        GiftTrayInfo giftTrayInfo = giftMessage2.mTrayInfo;
        if (giftTrayInfo != null) {
            c1142350fph.LIZLLL(21, 2);
            int iLJ3 = _ImageModel_ProtoEncoder.LJ(1, giftTrayInfo.mDynamicImg) + iLJI6 + _ImageModel_ProtoEncoder.LJ(3, giftTrayInfo.trayNormalBgImg);
            List<String> list3 = giftTrayInfo.trayNormalBgColor;
            if (list3 != null && !list3.isEmpty()) {
                for (int i5 = 0; i5 < giftTrayInfo.trayNormalBgColor.size(); i5++) {
                    iLJ3 += C1142340fpg.LJIILL(4, (String) ListProtector.get(giftTrayInfo.trayNormalBgColor, i5));
                }
            }
            int iLJ4 = iLJ3 + _ImageModel_ProtoEncoder.LJ(5, giftTrayInfo.traySmallBgImg);
            List<String> list4 = giftTrayInfo.traySmallBgColor;
            if (list4 != null && !list4.isEmpty()) {
                for (int i6 = 0; i6 < giftTrayInfo.traySmallBgColor.size(); i6++) {
                    iLJ4 += C1142340fpg.LJIILL(6, (String) ListProtector.get(giftTrayInfo.traySmallBgColor, i6));
                }
            }
            int iLJ5 = iLJ4 + _Text_ProtoEncoder.LJ(7, giftTrayInfo.rightTagText) + _ImageModel_ProtoEncoder.LJ(8, giftTrayInfo.rightTagBgImg);
            List<String> list5 = giftTrayInfo.rightTagBgColor;
            if (list5 != null && !list5.isEmpty()) {
                for (int i7 = 0; i7 < giftTrayInfo.rightTagBgColor.size(); i7++) {
                    iLJ5 += C1142340fpg.LJIILL(9, (String) ListProtector.get(giftTrayInfo.rightTagBgColor, i7));
                }
            }
            c1142350fph.LJ(iLJ5 + C1142340fpg.LJIILL(10, giftTrayInfo.trayNameTextColor) + C1142340fpg.LJIILL(11, giftTrayInfo.trayDescTextColor) + C1142340fpg.LJIILL(12, giftTrayInfo.rightTagJumpSchema) + C1142340fpg.LJIILL(13, giftTrayInfo.giftTrayJumpSchema));
            _GiftTrayInfo_ProtoEncoder.LIZIZ(c1142350fph, giftTrayInfo);
        }
        GiftMonitorInfo giftMonitorInfo = giftMessage2.giftMonitorInfo;
        if (giftMonitorInfo != null) {
            c1142350fph.LIZLLL(23, 2);
            c1142350fph.LJ(C1142340fpg.LJIIL(1, giftMonitorInfo.anchor_id) + C1142340fpg.LJIIL(2, giftMonitorInfo.profit_api_message_dur) + C1142340fpg.LJIIL(3, giftMonitorInfo.send_gift_profit_api_start_ms) + C1142340fpg.LJIIL(4, giftMonitorInfo.send_gift_profit_core_start_ms) + C1142340fpg.LJIIL(5, giftMonitorInfo.send_gift_req_start_ms) + C1142340fpg.LJIIL(6, giftMonitorInfo.send_gift_send_message_success_ms) + C1142340fpg.LJIIL(7, giftMonitorInfo.send_profit_api_dur) + C1142340fpg.LJIIL(8, giftMonitorInfo.to_user_id) + C1142340fpg.LJIIL(9, giftMonitorInfo.sendGiftStartClientLocalMs) + C1142340fpg.LJIILL(10, giftMonitorInfo.fromPlatform) + C1142340fpg.LJIILL(11, giftMonitorInfo.fromVersion));
            _GiftMonitorInfo_ProtoEncoder.LIZIZ(c1142350fph, giftMonitorInfo);
        }
        C1142340fpg.LJ(c1142350fph, 24, giftMessage2.colorId);
        boolean z = giftMessage2.isFirstSendGift;
        c1142350fph.LIZLLL(25, 0);
        c1142350fph.LJ(z ? 1 : 0);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 26, giftMessage2.displayTextForAnchor);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 27, giftMessage2.displayTextForAudience);
        C1142340fpg.LJFF(c1142350fph, 28, giftMessage2.orderId);
        GiftsBoxInfo giftsBoxInfo = giftMessage2.giftsInBox;
        if (giftsBoxInfo != null) {
            c1142350fph.LIZLLL(29, 2);
            List<GiftInfoInBox> list6 = giftsBoxInfo.gifts;
            if (list6 != null && !list6.isEmpty()) {
                i = 0;
                for (int i8 = 0; i8 < giftsBoxInfo.gifts.size(); i8++) {
                    GiftInfoInBox giftInfoInBox = (GiftInfoInBox) ListProtector.get(giftsBoxInfo.gifts, i8);
                    if (giftInfoInBox == null) {
                        iLIZIZ7 = 0;
                    } else {
                        int iLIZJ4 = _GiftInfoInBox_ProtoEncoder.LIZJ(giftInfoInBox);
                        iLIZIZ7 = iLIZJ4 + C1142350fph.LIZIZ(iLIZJ4) + iLIZ3;
                    }
                    i += iLIZIZ7;
                }
            } else {
                i = 0;
            }
            c1142350fph.LJ(i);
            _GiftsBoxInfo_ProtoEncoder.LIZIZ(c1142350fph, giftsBoxInfo);
        }
        MsgFilter msgFilter = giftMessage2.msgFilter;
        if (msgFilter != null) {
            c1142350fph.LIZLLL(30, 2);
            c1142350fph.LJ(iLJI + iLJI6);
            boolean z2 = msgFilter.isGifter;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJ(z2 ? 1 : 0);
            boolean z3 = msgFilter.isSubscribedToAnchor;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJ(z3 ? 1 : 0);
        }
        List<LynxGiftExtra> list7 = giftMessage2.lynxExtra;
        if (list7 != null && !list7.isEmpty()) {
            for (int i9 = 0; i9 < giftMessage2.lynxExtra.size(); i9++) {
                LynxGiftExtra lynxGiftExtra = (LynxGiftExtra) ListProtector.get(giftMessage2.lynxExtra, i9);
                if (lynxGiftExtra != null) {
                    c1142350fph.LIZLLL(31, 2);
                    int iLJIIL = C1142340fpg.LJIIL(1, lynxGiftExtra.id) + C1142340fpg.LJIIL(2, lynxGiftExtra.code) + C1142340fpg.LJIIL(3, lynxGiftExtra.type);
                    List<String> list8 = lynxGiftExtra.params;
                    if (list8 != null && !list8.isEmpty()) {
                        for (int i10 = 0; i10 < lynxGiftExtra.params.size(); i10++) {
                            iLJIIL += C1142340fpg.LJIILL(4, (String) ListProtector.get(lynxGiftExtra.params, i10));
                        }
                    }
                    c1142350fph.LJ(iLJIIL + C1142340fpg.LJIILL(5, lynxGiftExtra.extra));
                    _LynxGiftExtra_ProtoEncoder.LIZIZ(c1142350fph, lynxGiftExtra);
                }
            }
        }
        UserIdentity userIdentity = giftMessage2.userIdentity;
        if (userIdentity != null) {
            c1142350fph.LIZLLL(32, 2);
            c1142350fph.LJ(iLJI + iLJI6 + iLJI5 + iLJI4 + iLJI3 + iLJI2);
            _UserIdentity_ProtoEncoder.LIZIZ(c1142350fph, userIdentity);
        }
        MatchInfo matchInfo = giftMessage2.matchInfo;
        if (matchInfo != null) {
            c1142350fph.LIZLLL(33, 2);
            c1142350fph.LJ(C1142340fpg.LJIIL(1, matchInfo.critical) + iLJI6 + C1142340fpg.LJIIIZ(3, matchInfo.multiplierType) + C1142340fpg.LJIIL(4, matchInfo.multiplierValue));
            _MatchInfo_ProtoEncoder.LIZIZ(c1142350fph, matchInfo);
        }
        int i11 = giftMessage2.linkmicGiftExpressionStrategy;
        c1142350fph.LIZLLL(34, 0);
        c1142350fph.LIZJ(i11);
        _FlyingMicResources_ProtoEncoder.LIZJ(c1142350fph, 35, giftMessage2.flyingMicResources);
        boolean z4 = giftMessage2.disableGiftTracking;
        c1142350fph.LIZLLL(36, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        _AssetsModel_ProtoEncoder.LIZJ(c1142350fph, 37, giftMessage2.asset);
        int i12 = giftMessage2.version;
        c1142350fph.LIZLLL(38, 0);
        c1142350fph.LIZJ(i12);
        List<GiftMessage.SponsorshipInfo> list9 = giftMessage2.sponsorshipInfo;
        if (list9 != null && !list9.isEmpty()) {
            for (int i13 = 0; i13 < giftMessage2.sponsorshipInfo.size(); i13++) {
                GiftMessage.SponsorshipInfo sponsorshipInfo = (GiftMessage.SponsorshipInfo) ListProtector.get(giftMessage2.sponsorshipInfo, i13);
                if (sponsorshipInfo != null) {
                    c1142350fph.LIZLLL(39, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIL(1, sponsorshipInfo.giftId) + C1142340fpg.LJIIL(2, sponsorshipInfo.sponsorId) + iLJI5 + C1142340fpg.LJIILL(4, sponsorshipInfo.unlightedGiftIcon) + C1142340fpg.LJIILL(5, sponsorshipInfo.giftGalleryDetailPageSchemeUrl) + iLJI2 + C1142340fpg.LJIIIZ(7, sponsorshipInfo.giftTrayStyle) + C1142340fpg.LJI(21));
                    _GiftMessage_SponsorshipInfo_ProtoEncoder.LIZIZ(c1142350fph, sponsorshipInfo);
                }
            }
        }
        _FlyingMicResources_ProtoEncoder.LIZJ(c1142350fph, 40, giftMessage2.flyingMicResourcesV2);
        PublicAreaMessageCommon publicAreaMessageCommon = giftMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            c1142350fph.LIZLLL(41, 2);
            int iLJIIL2 = C1142340fpg.LJIIL(1, publicAreaMessageCommon.scrollGapCount) + C1142340fpg.LJIIL(2, publicAreaMessageCommon.anchorScrollGapCount) + iLJI5 + iLJI4 + iLJI3;
            PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo = publicAreaMessageCommon.creatorSuccessInfo;
            if (creatorSuccessInfo == null) {
                iLIZIZ3 = 0;
            } else {
                int iLIZJ5 = _PublicAreaMessageCommon_CreatorSuccessInfo_ProtoEncoder.LIZJ(creatorSuccessInfo);
                iLIZIZ3 = iLIZJ5 + C1142350fph.LIZIZ(iLIZJ5) + C1142350fph.LIZ(6);
            }
            int i14 = iLJIIL2 + iLIZIZ3;
            PublicAreaMessageCommon.PortraitInfo portraitInfo = publicAreaMessageCommon.portraitInfo;
            if (portraitInfo == null) {
                iLIZIZ4 = 0;
            } else {
                int iLIZJ6 = _PublicAreaMessageCommon_PortraitInfo_ProtoEncoder.LIZJ(portraitInfo);
                iLIZIZ4 = iLIZJ6 + C1142350fph.LIZIZ(iLIZJ6) + C1142350fph.LIZ(7);
            }
            int i15 = i14 + iLIZIZ4;
            PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo = publicAreaMessageCommon.userInteractionInfo;
            if (userInteractionInfo == null) {
                iLIZIZ5 = 0;
            } else {
                int iLIZJ7 = _PublicAreaMessageCommon_UserInteractionInfo_ProtoEncoder.LIZJ(userInteractionInfo);
                iLIZIZ5 = iLIZJ7 + C1142350fph.LIZIZ(iLIZJ7) + C1142350fph.LIZ(8);
            }
            int iLJIIL3 = i15 + iLIZIZ5 + C1142340fpg.LJIIL(9, publicAreaMessageCommon.adminFoldType);
            PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo = publicAreaMessageCommon.displayInfo;
            if (messageDisplayInfo == null) {
                iLIZIZ6 = 0;
            } else {
                int iLIZJ8 = _PublicAreaMessageCommon_MessageDisplayInfo_ProtoEncoder.LIZJ(messageDisplayInfo);
                iLIZIZ6 = iLIZJ8 + C1142350fph.LIZIZ(iLIZJ8) + C1142350fph.LIZ(10);
            }
            int iLJI7 = iLJIIL3 + iLIZIZ6 + C1142340fpg.LJI(11);
            PublicAreaMessageCommon.OperationInfo operationInfo = publicAreaMessageCommon.operationInfo;
            if (operationInfo == null) {
                iLIZ = 0;
            } else {
                int iLIZIZ11 = _PublicAreaMessageCommon_OperationInfo_ProtoEncoder.LIZIZ(operationInfo);
                iLIZ = C1142350fph.LIZ(12) + iLIZIZ11 + C1142350fph.LIZIZ(iLIZIZ11);
            }
            c1142350fph.LJ(iLJI7 + iLIZ + _Text_ProtoEncoder.LJ(13, publicAreaMessageCommon.dynamicDisplayText));
            _PublicAreaMessageCommon_ProtoEncoder.LIZIZ(c1142350fph, publicAreaMessageCommon);
        }
        C1142340fpg.LJFF(c1142350fph, 42, giftMessage2.signature);
        C1142340fpg.LJFF(c1142350fph, 43, giftMessage2.signatureVersion);
        boolean z5 = giftMessage2.multiGenerateMessage;
        c1142350fph.LIZLLL(44, 0);
        c1142350fph.LJ(z5 ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 45, giftMessage2.toMemberId);
        long j8 = giftMessage2.toMemberIdInt;
        c1142350fph.LIZLLL(46, 0);
        c1142350fph.LJFF(j8);
        C1142340fpg.LJFF(c1142350fph, 47, giftMessage2.toMemberNickname);
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo = giftMessage2.interactiveGiftInfo;
        if (interactiveGiftInfo != null) {
            c1142350fph.LIZLLL(48, 2);
            c1142350fph.LJ(C1142340fpg.LJIIL(1, interactiveGiftInfo.crossScreenDelay) + C1142340fpg.LJIIL(2, interactiveGiftInfo.crossScreenRole) + C1142340fpg.LJIIIZ(3, interactiveGiftInfo.ignoreConfig) + C1142340fpg.LJIIL(4, interactiveGiftInfo.uniqId) + C1142340fpg.LJIIL(5, interactiveGiftInfo.toUserTeamId) + C1142340fpg.LJIIL(6, interactiveGiftInfo.ignoreComponent));
            _GiftMessage_InteractiveGiftInfo_ProtoEncoder.LIZIZ(c1142350fph, interactiveGiftInfo);
        }
        long j9 = giftMessage2.displayDurationMs;
        c1142350fph.LIZLLL(49, 0);
        c1142350fph.LJFF(j9);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 50, giftMessage2.displayTextForSender);
        boolean z6 = giftMessage2.isAssetBundleGift;
        c1142350fph.LIZLLL(51, 0);
        c1142350fph.LJ(z6 ? 1 : 0);
        AssetBundle assetBundle = giftMessage2.assetBundle;
        if (assetBundle != null) {
            c1142350fph.LIZLLL(52, 2);
            List<AssetsModel> list10 = assetBundle.assets;
            if (list10 != null && !list10.isEmpty()) {
                iLJ2 = 0;
                for (int i16 = 0; i16 < assetBundle.assets.size(); i16++) {
                    iLJ2 += _AssetsModel_ProtoEncoder.LJ(1, (AssetsModel) ListProtector.get(assetBundle.assets, i16));
                }
            } else {
                iLJ2 = 0;
            }
            AssetBundle.PrefabBundle prefabBundle = assetBundle.prefabBundle;
            if (prefabBundle == null) {
                iLIZIZ = 0;
            } else {
                int iLIZJ9 = _AssetBundle_PrefabBundle_ProtoEncoder.LIZJ(prefabBundle);
                iLIZIZ = iLIZJ9 + C1142350fph.LIZIZ(iLIZJ9) + iLIZ4;
            }
            int i17 = iLJ2 + iLIZIZ;
            GiftEffectStreamSpec giftEffectStreamSpec = assetBundle.streamEffectSpec;
            if (giftEffectStreamSpec == null) {
                iLIZIZ2 = 0;
            } else {
                int iLIZJ10 = _GiftEffectStreamSpec_ProtoEncoder.LIZJ(giftEffectStreamSpec);
                iLIZIZ2 = iLIZJ10 + C1142350fph.LIZIZ(iLIZJ10) + C1142350fph.LIZ(3);
            }
            c1142350fph.LJ(i17 + iLIZIZ2);
            _AssetBundle_ProtoEncoder.LIZIZ(c1142350fph, assetBundle);
        }
        C1142340fpg.LJFF(c1142350fph, 53, giftMessage2.effectExtra);
        SecondaryEffectInfo secondaryEffectInfo = giftMessage2.secondaryEffectInfo;
        if (secondaryEffectInfo != null) {
            c1142350fph.LIZLLL(54, 2);
            List<Long> list11 = secondaryEffectInfo.effectIds;
            if (list11 != null && !list11.isEmpty()) {
                iLJIILL = 0;
                for (int i18 = 0; i18 < secondaryEffectInfo.effectIds.size(); i18++) {
                    iLJIILL += C1142340fpg.LJIILIIL(1, (Long) ListProtector.get(secondaryEffectInfo.effectIds, i18));
                }
            } else {
                iLJIILL = 0;
            }
            List<String> list12 = secondaryEffectInfo.builtinStrings;
            if (list12 != null && !list12.isEmpty()) {
                for (int i19 = 0; i19 < secondaryEffectInfo.builtinStrings.size(); i19++) {
                    iLJIILL += C1142340fpg.LJIILL(2, (String) ListProtector.get(secondaryEffectInfo.builtinStrings, i19));
                }
            }
            c1142350fph.LJ(iLJIILL + C1142340fpg.LJIIL(3, secondaryEffectInfo.minuteGameGameplayId));
            _SecondaryEffectInfo_ProtoEncoder.LIZIZ(c1142350fph, secondaryEffectInfo);
        }
        int i20 = giftMessage2.giftVariantId;
        c1142350fph.LIZLLL(55, 0);
        c1142350fph.LIZJ(i20);
        C1142340fpg.LJFF(c1142350fph, 56, giftMessage2.shinyCardUnlockToken);
        GiftEffect giftEffect = giftMessage2.giftEffect;
        if (giftEffect != null) {
            c1142350fph.LIZLLL(100, 2);
            List<AssetsModel> list13 = giftEffect.assets;
            if (list13 != null && !list13.isEmpty()) {
                iLJ = 0;
                for (int i21 = 0; i21 < giftEffect.assets.size(); i21++) {
                    iLJ += _AssetsModel_ProtoEncoder.LJ(1, (AssetsModel) ListProtector.get(giftEffect.assets, i21));
                }
            } else {
                iLJ = 0;
            }
            GiftEffectSpecs giftEffectSpecs = giftEffect.specs;
            if (giftEffectSpecs != null) {
                int iLIZJ11 = _GiftEffectSpecs_ProtoEncoder.LIZJ(giftEffectSpecs);
                iLIZIZ10 = iLIZ4 + iLIZJ11 + C1142350fph.LIZIZ(iLIZJ11);
            }
            int iLIZIZ12 = iLJ + iLIZIZ10;
            Map<String, String> map = giftEffect.eventTrackingParams;
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : giftEffect.eventTrackingParams.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        int iLJIILL3 = C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue());
                        iLIZIZ12 += iLJIILL3 + C1142350fph.LIZIZ(iLJIILL3) + C1142350fph.LIZ(5);
                    }
                }
            }
            c1142350fph.LJ(iLIZIZ12);
            _GiftEffect_ProtoEncoder.LIZIZ(c1142350fph, giftEffect);
        }
    }
}
