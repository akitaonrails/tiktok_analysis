package com.bytedance.android.livesdk.model.linksetting;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model._RoomHostMultiGuestPermissionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import webcast.data.AllLinkedUserData;
import webcast.data.AnchorSettingInfo;
import webcast.data.CardTag;
import webcast.data.FeedCard;
import webcast.data.GuestApplicationInfo;
import webcast.data.GuestInvitedInfo;
import webcast.data.MGEnterActionInfo;
import webcast.data.MultiGuestLinkmicInfo;
import webcast.data.MultiGuestPlayInfo;
import webcast.data.RoomMultiGuestLinkmicInfo;
import webcast.data._AllLinkedUserData_ProtoDecoder;
import webcast.data._AnchorSettingInfo_ProtoDecoder;
import webcast.data._CardTag_ProtoDecoder;
import webcast.data._FeedCard_ProtoDecoder;
import webcast.data._GuestApplicationInfo_ProtoDecoder;
import webcast.data._GuestInvitedInfo_ProtoDecoder;
import webcast.data._MGEnterActionInfo_ProtoDecoder;
import webcast.data._MultiGuestLayoutInfo_ProtoDecoder;
import webcast.data._MultiGuestLinkmicInfo_ProtoDecoder;
import webcast.data._MultiGuestPlayInfo_ProtoDecoder;
import webcast.data._MultiGuestShareRevenueSettingInfo_ProtoDecoder;
import webcast.data._RandomMatchInfo_ProtoDecoder;
import webcast.data._RoomMultiGuestLinkmicInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiLiveUserApplySettings_ProtoDecoder implements C0IMD<MultiLiveUserApplySettings> {
    public static MultiLiveUserApplySettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiLiveUserApplySettings multiLiveUserApplySettings = new MultiLiveUserApplySettings();
        multiLiveUserApplySettings.hangoutCardTagList = new ArrayList();
        multiLiveUserApplySettings.extraInfo = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 30) {
                    switch (iLJI) {
                        case 1:
                            multiLiveUserApplySettings.multiLiveUserApplyPermission = _MultiLiveUserApplyPermission_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            multiLiveUserApplySettings.linkMicServiceVersion = Integer.valueOf(c1516680pZS.LJIIJ());
                            break;
                        case 3:
                            multiLiveUserApplySettings.roomHostMultiGuestPermissionInfo = _RoomHostMultiGuestPermissionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            multiLiveUserApplySettings.tryOpenMultiGuest = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 5:
                            multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo = _RoomAudienceMultiGuestPermissionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            multiLiveUserApplySettings.roomMultiGuestLinkmicInfo = _RoomMultiGuestLinkmicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            multiLiveUserApplySettings.hostMultiGuestDevMode = c1516680pZS.LJIIJJI();
                            break;
                        case 8:
                            multiLiveUserApplySettings.audienceSharedInviteePanelType = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            multiLiveUserApplySettings.hostGifterLinkmicEnum = c1516680pZS.LJIIJJI();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            multiLiveUserApplySettings.viewerGifterLinkmicEnum = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            multiLiveUserApplySettings.anchorSettingInfo = _AnchorSettingInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            multiLiveUserApplySettings.isEligibleForApplyAutoApprove = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            multiLiveUserApplySettings.guestApplicationInfo = _GuestApplicationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 14:
                            multiLiveUserApplySettings.guestInvitedInfo = _GuestInvitedInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            switch (iLJI) {
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    multiLiveUserApplySettings.hostSendGiftsToAllEnum = c1516680pZS.LJIIJJI();
                                    break;
                                case 21:
                                    multiLiveUserApplySettings.audienceSendGiftsToAllEnum = c1516680pZS.LJIIJJI();
                                    break;
                                case 22:
                                    multiLiveUserApplySettings.multiGuestLayoutInfo = _MultiGuestLayoutInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    switch (iLJI) {
                                        case 40:
                                            multiLiveUserApplySettings.feedCard = _FeedCard_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 41:
                                            multiLiveUserApplySettings.topLiveTitle = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 42:
                                            multiLiveUserApplySettings.playLabelTag = _CardTag_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 43:
                                            multiLiveUserApplySettings.allLinkedUserData = _AllLinkedUserData_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 44:
                                            multiLiveUserApplySettings.topLiveGuide = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 45:
                                            multiLiveUserApplySettings.aiSummary = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 46:
                                            long jLIZJ2 = c1516680pZS.LIZJ();
                                            String strLIZLLL = null;
                                            String strLIZLLL2 = null;
                                            while (true) {
                                                int iLJI2 = c1516680pZS.LJI();
                                                if (iLJI2 != -1) {
                                                    if (iLJI2 != 1) {
                                                        if (iLJI2 == 2) {
                                                            strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                                        }
                                                    } else {
                                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                                    }
                                                } else {
                                                    c1516680pZS.LJ(jLIZJ2);
                                                    if (strLIZLLL != null) {
                                                        if (strLIZLLL2 != null) {
                                                            multiLiveUserApplySettings.extraInfo.put(strLIZLLL, strLIZLLL2);
                                                        } else {
                                                            throw new IllegalStateException("Map value must not be null!");
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Map key must not be null!");
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        case 47:
                                            multiLiveUserApplySettings.randomMatchInfo = _RandomMatchInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 48:
                                            multiLiveUserApplySettings.triggerGuideTime = c1516680pZS.LJIIJJI();
                                            break;
                                        case 49:
                                            multiLiveUserApplySettings.hangoutCardTagList.add(_CardTag_ProtoDecoder.LIZLLL(c1516680pZS));
                                            break;
                                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                            multiLiveUserApplySettings.backgroundStickerId = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        case 51:
                                            multiLiveUserApplySettings.mgEnterActionInfo = _MGEnterActionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 52:
                                            multiLiveUserApplySettings.multiGuestShareRevenueSettingInfo = _MultiGuestShareRevenueSettingInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 53:
                                            multiLiveUserApplySettings.multiGuestEnableRevenueRatio = c1516680pZS.LJIIJJI();
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    multiLiveUserApplySettings.multiGuestPlayInfo = _MultiGuestPlayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiLiveUserApplySettings;
            }
        }
    }

    public static void LJ(MultiLiveUserApplySettings multiLiveUserApplySettings) {
        ImageModel imageModel;
        User user;
        ImageModel imageModel2;
        MultiGuestLinkmicInfo multiGuestLinkmicInfo;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo;
        if (roomMultiGuestLinkmicInfo != null && (multiGuestLinkmicInfo = roomMultiGuestLinkmicInfo.multiGuestLinkmicInfo) != null) {
            _MultiGuestLinkmicInfo_ProtoDecoder.LJ(multiGuestLinkmicInfo);
        }
        AnchorSettingInfo anchorSettingInfo = multiLiveUserApplySettings.anchorSettingInfo;
        if (anchorSettingInfo != null) {
            _AnchorSettingInfo_ProtoDecoder.LJ(anchorSettingInfo);
        }
        GuestApplicationInfo guestApplicationInfo = multiLiveUserApplySettings.guestApplicationInfo;
        if (guestApplicationInfo != null) {
            _GuestApplicationInfo_ProtoDecoder.LJ(guestApplicationInfo);
        }
        GuestInvitedInfo guestInvitedInfo = multiLiveUserApplySettings.guestInvitedInfo;
        if (guestInvitedInfo != null) {
            _GuestInvitedInfo_ProtoDecoder.LJ(guestInvitedInfo);
        }
        MultiGuestPlayInfo multiGuestPlayInfo = multiLiveUserApplySettings.multiGuestPlayInfo;
        if (multiGuestPlayInfo != null) {
            _MultiGuestPlayInfo_ProtoDecoder.LJ(multiGuestPlayInfo);
        }
        FeedCard feedCard = multiLiveUserApplySettings.feedCard;
        if (feedCard != null) {
            _FeedCard_ProtoDecoder.LJ(feedCard);
        }
        CardTag cardTag = multiLiveUserApplySettings.playLabelTag;
        if (cardTag != null && (imageModel2 = cardTag.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        AllLinkedUserData allLinkedUserData = multiLiveUserApplySettings.allLinkedUserData;
        if (allLinkedUserData != null) {
            _AllLinkedUserData_ProtoDecoder.LJ(allLinkedUserData);
        }
        if (multiLiveUserApplySettings.extraInfo == null) {
            multiLiveUserApplySettings.extraInfo = new HashMap();
        }
        List<CardTag> list = multiLiveUserApplySettings.hangoutCardTagList;
        if (list == null) {
            multiLiveUserApplySettings.hangoutCardTagList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CardTag cardTag2 : multiLiveUserApplySettings.hangoutCardTagList) {
                if (cardTag2 != null && (imageModel = cardTag2.icon) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        MGEnterActionInfo mGEnterActionInfo = multiLiveUserApplySettings.mgEnterActionInfo;
        if (mGEnterActionInfo != null && (user = mGEnterActionInfo.enterActionSourceUser) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiLiveUserApplySettings multiLiveUserApplySettings) {
        LJ(multiLiveUserApplySettings);
    }

    @Override // X.C0IMD
    public final MultiLiveUserApplySettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiLiveUserApplySettings multiLiveUserApplySettings, List list) {
    }
}
