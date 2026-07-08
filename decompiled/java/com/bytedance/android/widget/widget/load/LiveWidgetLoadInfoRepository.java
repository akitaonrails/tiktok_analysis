package com.bytedance.android.widget.widget.load;

import X.InterfaceC1078810eBD;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveWidgetLoadInfoRepository implements InterfaceC1078810eBD {
    public final HashMap<String, String> portraitWidgetInfoMap = new HashMap<>(94);
    public final HashMap<String, String> landscapeWidgetInfoMap = new HashMap<>(5);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1078810eBD
    public String getLandscapeWidgetFunction(String str) {
        if (this.landscapeWidgetInfoMap.containsKey(str)) {
            return this.landscapeWidgetInfoMap.get(str);
        }
        switch (str.hashCode()) {
            case -1219410253:
                if (!str.equals("RevenueStrategyWidget")) {
                    return null;
                }
                this.landscapeWidgetInfoMap.put("RevenueStrategyWidget", "RevenueStrategy");
                return "RevenueStrategy";
            case -950581857:
                if (!str.equals("EnigmaWidget")) {
                    return null;
                }
                this.landscapeWidgetInfoMap.put("EnigmaWidget", "Enigma");
                return "Enigma";
            case -186131296:
                if (!str.equals("GuideTriggerWidget")) {
                    return null;
                }
                this.landscapeWidgetInfoMap.put("GuideTriggerWidget", "RevenueStrategy");
                return "RevenueStrategy";
            case 467275303:
                if (!str.equals("AudienceRightToolbarWidget")) {
                    return null;
                }
                this.landscapeWidgetInfoMap.put("AudienceRightToolbarWidget", "Toolbar");
                return "Toolbar";
            case 1966327361:
                if (!str.equals("TouchPointBubbleWidget")) {
                    return null;
                }
                this.landscapeWidgetInfoMap.put("TouchPointBubbleWidget", "RevenueStrategy");
                return "RevenueStrategy";
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1078810eBD
    public String getPortraitWidgetFunction(String str) {
        if (this.portraitWidgetInfoMap.containsKey(str)) {
            return this.portraitWidgetInfoMap.get(str);
        }
        switch (str.hashCode()) {
            case -2024491957:
                if (!str.equals("ECAuctionBottomRightActingAreaSlotWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ECAuctionBottomRightActingAreaSlotWidget", "ECAuctionBottomRightActingArea");
                return "ECAuctionBottomRightActingArea";
            case -2017901246:
                if (!str.equals("FullVideoButtonWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("FullVideoButtonWidget", "Orientation");
                return "Orientation";
            case -2003015401:
                if (!str.equals("PadAutoRotateScreenGuideWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("PadAutoRotateScreenGuideWidget", "PadAutoRotateScreenGuide");
                return "PadAutoRotateScreenGuide";
            case -1937875059:
                if (!str.equals("ShareUserFollowGuideDialogWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ShareUserFollowGuideDialogWidget", "ShareUserGuide");
                return "ShareUserGuide";
            case -1934819168:
                if (!str.equals("SubscriptionCommonGuidanceLiveCardWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("SubscriptionCommonGuidanceLiveCardWidget", "SubGuide");
                return "SubGuide";
            case -1901662267:
                if (!str.equals("LikeUserInfoAnimWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LikeUserInfoAnimWidget", "Digg");
                return "Digg";
            case -1867835706:
                if (!str.equals("SlotBarrageWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("SlotBarrageWidget", "Barrage");
                return "Barrage";
            case -1831655058:
                if (!str.equals("MiddleTouchWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("MiddleTouchWidget", "MiddleTouch");
                return "MiddleTouch";
            case -1783295430:
                if (!str.equals("RandomMatchGuestWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("RandomMatchGuestWidget", "RandomMatch");
                return "RandomMatch";
            case -1757915653:
                if (!str.equals("CaptionTextDeleteTopWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CaptionTextDeleteTopWidget", "Caption");
                return "Caption";
            case -1749702084:
                if (!str.equals("KaraokeHoverWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("KaraokeHoverWidget", "Karaoke");
                return "Karaoke";
            case -1713622583:
                if (!str.equals("MatchAudienceWidgetV2")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("MatchAudienceWidgetV2", "AudienceMultiMatch");
                return "AudienceMultiMatch";
            case -1683799882:
                if (!str.equals("QuickCommentWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("QuickCommentWidget", "QuickComment");
                return "QuickComment";
            case -1664458510:
                if (!str.equals("UserPermissionCheckWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("UserPermissionCheckWidget", "UserPermissionCheck");
                return "UserPermissionCheck";
            case -1635231815:
                if (!str.equals("SubscriptionTrialLiveCardWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("SubscriptionTrialLiveCardWidget", "SubTrial");
                return "SubTrial";
            case -1486345350:
                if (!str.equals("EventAreaUnityAnimationWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("EventAreaUnityAnimationWidget", "UnityAnimation");
                return "UnityAnimation";
            case -1479666356:
                if (!str.equals("AudienceHashTagWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("AudienceHashTagWidget", "Topic");
                return "Topic";
            case -1473911720:
                if (!str.equals("CaptionSplitWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CaptionSplitWidget", "Caption");
                return "Caption";
            case -1466320748:
                if (!str.equals("LiveRoomNotifyWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveRoomNotifyWidget", "RoomNotify");
                return "RoomNotify";
            case -1438141090:
                if (!str.equals("LiveMarketingWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveMarketingWidget", "Marketing");
                return "Marketing";
            case -1411905677:
                if (!str.equals("LiveEventDescCardWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveEventDescCardWidget", "LiveEvent");
                return "LiveEvent";
            case -1298319466:
                if (!str.equals("MicRoomAudienceEnterWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("MicRoomAudienceEnterWidget", "MicBase");
                return "MicBase";
            case -1236256268:
                if (!str.equals("PortraitPublicScreenWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("PortraitPublicScreenWidget", "MessageList");
                return "MessageList";
            case -1219410253:
                if (!str.equals("RevenueStrategyWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("RevenueStrategyWidget", "RevenueStrategy");
                return "RevenueStrategy";
            case -1207429545:
                if (!str.equals("LiveShareWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveShareWidget", "Share");
                return "Share";
            case -1185837922:
                if (!str.equals("OthersLikeWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("OthersLikeWidget", "Digg");
                return "Digg";
            case -1173531179:
                if (!str.equals("GiftWidgetKotlin")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("GiftWidgetKotlin", "Gift");
                return "Gift";
            case -1098709424:
                if (!str.equals("LivePrivilegeAnnouncementWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LivePrivilegeAnnouncementWidget", "PrivilegeAnnouncement");
                return "PrivilegeAnnouncement";
            case -950581857:
                if (!str.equals("EnigmaWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("EnigmaWidget", "Enigma");
                return "Enigma";
            case -917380049:
                if (!str.equals("DrawGuessCanvasWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("DrawGuessCanvasWidget", "DrawGuess");
                return "DrawGuess";
            case -917210150:
                if (!str.equals("LiveNameFrameWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveNameFrameWidget", "NameFrame");
                return "NameFrame";
            case -893157355:
                if (!str.equals("RoomStickerWrapperWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("RoomStickerWrapperWidget", "RoomSticker");
                return "RoomSticker";
            case -788097485:
                if (!str.equals("GroupLiveAudienceWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("GroupLiveAudienceWidget", "GroupLive");
                return "GroupLive";
            case -679408797:
                if (!str.equals("WatchFocusTrayWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("WatchFocusTrayWidget", "GameMoment");
                return "GameMoment";
            case -677176900:
                if (!str.equals("ProgrammedLiveOnlineAudienceCollapseWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ProgrammedLiveOnlineAudienceCollapseWidget", "ProgrammedLiveOnlineAudience");
                return "ProgrammedLiveOnlineAudience";
            case -629190002:
                if (!str.equals("PortraitShortTouchPreviewWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("PortraitShortTouchPreviewWidget", "ShortTouch");
                return "ShortTouch";
            case -604791827:
                if (!str.equals("SkylightSwitchWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("SkylightSwitchWidget", "SkyLightSwitch");
                return "SkyLightSwitch";
            case -591777639:
                if (!str.equals("LiveDebugInfoWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveDebugInfoWidget", "Debug");
                return "Debug";
            case -581292758:
                if (!str.equals("LiveTopAlphaVideoWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveTopAlphaVideoWidget", "TopEffect");
                return "TopEffect";
            case -558275767:
                if (!str.equals("DrawGuessStatusWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("DrawGuessStatusWidget", "DrawGuess");
                return "DrawGuess";
            case -545857181:
                if (!str.equals("CommentWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CommentWidget", "Comment");
                return "Comment";
            case -526254728:
                if (!str.equals("LiveGoalsWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveGoalsWidget", "MiddleTouch");
                return "MiddleTouch";
            case -440174585:
                if (!str.equals("LinkControlWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LinkControlWidget", "LinkMic");
                return "LinkMic";
            case -419663774:
                if (!str.equals("LiveDetectInfoView")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveDetectInfoView", "Debug");
                return "Debug";
            case -380218609:
                if (!str.equals("FrameSlotWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("FrameSlotWidget", "FrameSlot");
                return "FrameSlot";
            case -333497248:
                if (!str.equals("WatcherLiveECWaterMarkSlotWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("WatcherLiveECWaterMarkSlotWidget", "ECWatcherWaterMark");
                return "ECWatcherWaterMark";
            case -233244407:
                if (!str.equals("CommentComboTrayWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CommentComboTrayWidget", "CommentTray");
                return "CommentTray";
            case -208416408:
                if (!str.equals("MicRoomAudienceExitWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("MicRoomAudienceExitWidget", "MicBase");
                return "MicBase";
            case -186131296:
                if (!str.equals("GuideTriggerWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("GuideTriggerWidget", "RevenueStrategy");
                return "RevenueStrategy";
            case -174282345:
                if (!str.equals("ProgrammedLiveMenuWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ProgrammedLiveMenuWidget", "ProgrammedLiveMenu");
                return "ProgrammedLiveMenu";
            case -146229112:
                if (!str.equals("LiveEventStickerWrapperWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveEventStickerWrapperWidget", "LiveEventSticker");
                return "LiveEventSticker";
            case -145697471:
                if (!str.equals("LivePinCardHorizontalWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LivePinCardHorizontalWidget", "PinCardContainer");
                return "PinCardContainer";
            case 12814308:
                if (!str.equals("ECAuctionActingAreaSlotWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ECAuctionActingAreaSlotWidget", "ECAuctionActingArea");
                return "ECAuctionActingArea";
            case 19103271:
                if (!str.equals("PortraitShortTouchViewWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("PortraitShortTouchViewWidget", "ShortTouch");
                return "ShortTouch";
            case 24332328:
                if (!str.equals("LiveToggleWatermarkWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveToggleWatermarkWidget", "ToggleWatermark");
                return "ToggleWatermark";
            case 105889040:
                if (!str.equals("LiveGiftPollEffectWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveGiftPollEffectWidget", "Poll");
                return "Poll";
            case 118465248:
                if (!str.equals("MicRoomBackUpTipsWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("MicRoomBackUpTipsWidget", "MicBackUp");
                return "MicBackUp";
            case 163354315:
                if (!str.equals("CastersWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CastersWidget", "Casters");
                return "Casters";
            case 286235412:
                if (!str.equals("AudienceLeftToolbarWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("AudienceLeftToolbarWidget", "Toolbar");
                return "Toolbar";
            case 292676773:
                if (!str.equals("GamePartnershipGamePinCardWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("GamePartnershipGamePinCardWidget", "ParterShip");
                return "ParterShip";
            case 311983640:
                if (!str.equals("PcsAudienceDecorationWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("PcsAudienceDecorationWidget", "PcsAudienceDslDecoration");
                return "PcsAudienceDslDecoration";
            case 317889159:
                if (!str.equals("OnlineAudienceRankWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("OnlineAudienceRankWidget", "AudienceRankList");
                return "AudienceRankList";
            case 462560721:
                if (!str.equals("ProgrammedLiveUserInfoWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ProgrammedLiveUserInfoWidget", "RoomProfile");
                return "RoomProfile";
            case 467275303:
                if (!str.equals("AudienceRightToolbarWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("AudienceRightToolbarWidget", "Toolbar");
                return "Toolbar";
            case 470955775:
                if (!str.equals("MicRoomUserInfoWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("MicRoomUserInfoWidget", "MicUserInfo");
                return "MicUserInfo";
            case 552169799:
                if (!str.equals("SelfLikeWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("SelfLikeWidget", "Digg");
                return "Digg";
            case 596719638:
                if (!str.equals("ClearScreenUserInfoWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ClearScreenUserInfoWidget", "RoomProfile");
                return "RoomProfile";
            case 621019353:
                if (!str.equals("CastersBackgroundWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CastersBackgroundWidget", "Casters");
                return "Casters";
            case 652192091:
                if (!str.equals("WatcherLiveECBillboardSlotWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("WatcherLiveECBillboardSlotWidget", "ECBillboard");
                return "ECBillboard";
            case 699137588:
                if (!str.equals("InteractCutShortWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("InteractCutShortWidget", "InteractCutShort");
                return "InteractCutShort";
            case 726930969:
                if (!str.equals("ProgrammedLiveFollowCardWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ProgrammedLiveFollowCardWidget", "ProgrammedLiveFollow");
                return "ProgrammedLiveFollow";
            case 792561480:
                if (!str.equals("StickerContainerWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("StickerContainerWidget", "BizRoomSticker");
                return "BizRoomSticker";
            case 817595396:
                if (!str.equals("CumulativeWatchAudienceWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CumulativeWatchAudienceWidget", "QuizCumulative");
                return "QuizCumulative";
            case 851539953:
                if (!str.equals("MessageStationWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("MessageStationWidget", "TopicStation");
                return "TopicStation";
            case 904112071:
                if (!str.equals("LiveNormalPollEffectWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveNormalPollEffectWidget", "Poll");
                return "Poll";
            case 918120843:
                if (!str.equals("ViewerWishesWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ViewerWishesWidget", "ViewerWishes");
                return "ViewerWishes";
            case 923382792:
                if (!str.equals("HighPrioritySlotWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("HighPrioritySlotWidget", "ECommerceSlot");
                return "ECommerceSlot";
            case 976508968:
                if (!str.equals("ProgrammedLiveTitleWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ProgrammedLiveTitleWidget", "ProgrammedLiveTitle");
                return "ProgrammedLiveTitle";
            case 1098603119:
                if (!str.equals("GiftSelectPollWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("GiftSelectPollWidget", "Poll");
                return "Poll";
            case 1170404684:
                if (!str.equals("DonationStickerWrapperWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("DonationStickerWrapperWidget", "Donation");
                return "Donation";
            case 1190713751:
                if (!str.equals("NewTopRightBannerWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("NewTopRightBannerWidget", "Banner");
                return "Banner";
            case 1201380917:
                if (!str.equals("GameLinkControlWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("GameLinkControlWidget", "GameLinkMic");
                return "GameLinkMic";
            case 1223331241:
                if (!str.equals("ProgrammedLiveOnlineAudienceExpandWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ProgrammedLiveOnlineAudienceExpandWidget", "ProgrammedLiveOnlineAudience");
                return "ProgrammedLiveOnlineAudience";
            case 1276964420:
                if (!str.equals("InteractiveTopBarWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("InteractiveTopBarWidget", "InteractiveTopBar");
                return "InteractiveTopBar";
            case 1307742871:
                if (!str.equals("VoiceChatControlWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("VoiceChatControlWidget", "AudioChat");
                return "AudioChat";
            case 1522447217:
                if (!str.equals("XMultiTabContainerWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("XMultiTabContainerWidget", "XMultiTabContainer");
                return "XMultiTabContainer";
            case 1679988503:
                if (!str.equals("LiveDrawerEntranceWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LiveDrawerEntranceWidget", "Drawer");
                return "Drawer";
            case 1926137484:
                if (!str.equals("CaptionTranslateWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CaptionTranslateWidget", "Caption");
                return "Caption";
            case 1944810044:
                if (!str.equals("CloseWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("CloseWidget", "Close");
                return "Close";
            case 1966327361:
                if (!str.equals("TouchPointBubbleWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("TouchPointBubbleWidget", "RevenueStrategy");
                return "RevenueStrategy";
            case 2000476198:
                if (!str.equals("NormalSelectPollWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("NormalSelectPollWidget", "Poll");
                return "Poll";
            case 2057046795:
                if (!str.equals("ActQuizWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("ActQuizWidget", "QuizBase");
                return "QuizBase";
            case 2122123102:
                if (!str.equals("FullVideoButtonWidgetV2")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("FullVideoButtonWidgetV2", "Orientation");
                return "Orientation";
            case 2144313834:
                if (!str.equals("LikeUserInfoAnimOptimizedWidget")) {
                    return null;
                }
                this.portraitWidgetInfoMap.put("LikeUserInfoAnimOptimizedWidget", "Digg");
                return "Digg";
            default:
                return null;
        }
    }
}
