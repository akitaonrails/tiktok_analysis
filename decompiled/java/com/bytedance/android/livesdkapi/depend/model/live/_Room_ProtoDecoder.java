package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._SubscribeInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.chatroom.api._SubPinCard_ProtoDecoder;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;
import com.bytedance.android.livesdk.game.model.GuessTaskPackInfo;
import com.bytedance.android.livesdk.game.model.GuessWidgets;
import com.bytedance.android.livesdk.game.model._DropsRoomInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameEmotesTab_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameTagDetail_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GuessTaskPackInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GuessWidgets_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PlayTogetherBasicInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._PlayTogetherExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.message.proto.ToolBarManagement;
import com.bytedance.android.livesdk.message.proto._LiveProInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._StarCommentConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.QuickChatInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.android.livesdk.model.TopFanTicket;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model._BaLeadsGenInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Creator_ProtoDecoder;
import com.bytedance.android.livesdk.model._GameTag_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.android.livesdk.model._InteractionQuestionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import com.bytedance.android.livesdk.model._LikeEffect_ProtoDecoder;
import com.bytedance.android.livesdk.model._LikeInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._MaskLayer_ProtoDecoder;
import com.bytedance.android.livesdk.model._OfficialChannelInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._PollData_ProtoDecoder;
import com.bytedance.android.livesdk.model._PollInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._QuickChatInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomAuthStatus_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomDecoration_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomStats_ProtoDecoder;
import com.bytedance.android.livesdk.model._RoomSticker_ProtoDecoder;
import com.bytedance.android.livesdk.model._ShortTouchItem_ProtoDecoder;
import com.bytedance.android.livesdk.model._TopFanTicket_ProtoDecoder;
import com.bytedance.android.livesdk.model._TopFrameSummary_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserVoteInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._WarningTag_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting._CoHost_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUserApplySettings_ProtoDecoder;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUserSettings_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message._BannerInRoomCollection_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.AILiveSummary;
import webcast.data.EventCard;
import webcast.data.GameGiftGuideKeywordsConfig;
import webcast.data.PreviewCommentInfo;
import webcast.data.RechargeCustomError;
import webcast.data._AILivePreviewHighlightExtra_ProtoDecoder;
import webcast.data._AILivePreviewHighlight_ProtoDecoder;
import webcast.data._AILiveSummary_ProtoDecoder;
import webcast.data._EventCard_ProtoDecoder;
import webcast.data._GameGiftGuideKeywordsConfig_ProtoDecoder;
import webcast.data._PreviewCommentInfo_ProtoDecoder;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _Room_ProtoDecoder implements C0IMD<Room> {
    public static void LJFF(C1516680pZS c1516680pZS, Room room, List<Integer> list) throws IOException {
        Object[] objArr;
        Object obj;
        Object obj2;
        Object[] objArr2;
        Object obj3;
        Object obj4;
        Object[] objArr3;
        Object obj5;
        Object obj6;
        Object[] objArr4;
        Object obj7;
        Object obj8;
        Object[] objArr5;
        Object obj9;
        Object obj10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        room.id = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 2:
                        room.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        room.status = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 4:
                        room.ownerUserId = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 5:
                        room.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        room.userCount = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 7:
                        room.createTime = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 8:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                    case 19:
                    case 27:
                    case 30:
                    case 31:
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 44:
                    case 45:
                    case 47:
                    case 49:
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case BaseNotice.CREATOR /* 62 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 92:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 121:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 146:
                    case 148:
                    case 150:
                    case 154:
                    case 156:
                    case 160:
                    case 161:
                    case 162:
                    case 164:
                    case 168:
                    case 171:
                    case 173:
                    case 175:
                    case 181:
                    case 190:
                    case 195:
                    case 243:
                    case 244:
                    case 278:
                    case 279:
                    case 323:
                    case 324:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        room.finishTime = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 16:
                        room.platform = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        room.clientVersion = String.valueOf(C1516700pZU.LIZJ(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        room.withLinkMic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        room.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        room.dynamicCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        room.dynamicCoverLow = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        room.shareUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        room.anchorShareText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 25:
                        room.userShareText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        room.streamId = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 28:
                        room.streamUrl = _StreamUrl_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 29:
                        room.mosaicStatus = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 32:
                        room.linkMicInfoGson = _RoomLinkInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_RoomDecoration_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 35:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_TopFanTicket_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        room.stats = _RoomStats_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 42:
                        room.feedRoomLabel = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 43:
                        room.labels = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 46:
                        room.owner = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 48:
                        room.hasCommerceGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 51:
                        room.liveTypeAudio = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 52:
                        room.isThirdParty = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 53:
                        room.isScreenshot = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 54:
                        room.liveTypeSandbox = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 63:
                        room.startTime = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                        room.mRoomAuthStatus = _RoomAuthStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 83:
                        room.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 84:
                        room.layout = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 90:
                        room.unusedEffect = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 91:
                        room.giftMessageStyle = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 93:
                        room.finish_url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 101:
                        room.roomLayout = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 111:
                        room.likeCount = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 120:
                        room.anchorTabType = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 122:
                        room.officialChannelInfo = _OfficialChannelInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 130:
                        Object[] objArr6 = new Object[2];
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                c1516680pZS.LJ(jLIZJ2);
                                arrayList.add(Integer.valueOf(iLJI));
                                arrayList2.add(objArr6);
                                break;
                            } else if (iLJI2 == 1) {
                                objArr6[0] = C1516700pZU.LIZLLL(c1516680pZS);
                            } else if (iLJI2 == 2) {
                                objArr6[1] = Long.valueOf(C1516700pZU.LIZJ(c1516680pZS));
                            } else {
                                C1516700pZU.LJ(c1516680pZS);
                            }
                        }
                        break;
                    case 138:
                        room.webcastSdkVersion = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 139:
                        room.mNameMode = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 140:
                        room.roomCreateAbParam = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 145:
                        room.commerceStruct = _CommerceStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 147:
                        room.streamCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 149:
                        room.questionVersion = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 151:
                        room.liveEventInfo = _LiveEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 152:
                        room.hashtag = _Hashtag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 153:
                        room.baLinkStruct = _BALinkStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 155:
                        room.answeringQuestion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 157:
                        room.warningTag = _WarningTag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 158:
                        room.maskLayer = _MaskLayer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 159:
                        room.liveRoomMode = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 163:
                        room.finishUrlLynx = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 165:
                        room.likeInfo = _LikeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 166:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_ShortTouchItem_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 167:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_LiveFilterMsgRule_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 169:
                        room.mBoostCardRoomStatus = _LiveGiftBoostCardRoomStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 170:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_FeedRoomLabel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 172:
                        room.haveWishList = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 174:
                        room.multiLiveUserSettings = _MultiLiveUserSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 176:
                        room.interactionQuestion = _InteractionQuestionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 177:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_RoomSticker_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 178:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_GameTag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 179:
                        room.advancedPollInfo = _PollInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 180:
                        room.giftPollVoteEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 182:
                        room.skin = _Skin_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 183:
                        room.squareCoverImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 184:
                        room.rectangleCoverImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 185:
                        room.mRoomAuthMessage = _RoomAuthMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 186:
                        room.paidEvent = _PaidEvent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 187:
                        room.pictionaryFullInfo = _PictionaryFullInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 188:
                        room.existedCommerceGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 189:
                        room.ageRestricted = _AgeRestricted_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 191:
                        room.pinInfo = _PinInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 192:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 193:
                        room.topFrameSummary = _TopFrameSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 194:
                        room.bcToggleInfo = _BcToggleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 196:
                        room.commentHasTextEmojiEmote = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 197:
                        room.partnershipInfo = _PartnershipInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 198:
                        room.streamStatus = (int) C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 199:
                        room.creator = _Creator_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 200:
                        room.drawerTabPosition = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 201:
                        room.baLeadsGenInfo = _BaLeadsGenInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 202:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_EffectInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 203:
                        room.audioMute = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 204:
                        room.liveEventCard = _EventCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 205:
                        room.liveSubOnly = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 206:
                        room.supportQuiz = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 207:
                        Object[] objArr7 = new Object[2];
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 == -1) {
                                c1516680pZS.LJ(jLIZJ3);
                                arrayList.add(Integer.valueOf(iLJI));
                                arrayList2.add(objArr7);
                                break;
                            } else if (iLJI3 == 1) {
                                objArr7[0] = Long.valueOf(C1516700pZU.LIZJ(c1516680pZS));
                            } else if (iLJI3 == 2) {
                                objArr7[1] = Long.valueOf(C1516700pZU.LIZJ(c1516680pZS));
                            } else {
                                C1516700pZU.LJ(c1516680pZS);
                            }
                        }
                        break;
                    case 208:
                        room.blurredCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 209:
                        room.captionInfo = _CaptionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 210:
                        room.adjustDisplayOrder = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 211:
                        room.commerceInfoBackup = _CommerceStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 212:
                        room.allowPreviewTime = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 213:
                        room.paidContentInfo = _PaidContentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 214:
                        room.subPinCard = _SubPinCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 215:
                        room.enableServerDrop = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 216:
                        room.disablePreviewSubOnly = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 217:
                        room.liteUserVisible = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 218:
                        room.liteUserNotVisible = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 219:
                        room.dropCommentGroup = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 220:
                        room.picoLiveType = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 221:
                        room.giftSuspension = _GiftSuspension_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 222:
                        room.pollingStarComment = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 223:
                        room.hasUsedMusic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 224:
                        room.anchorLiveProInfo = _LiveProInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 225:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 226:
                        room.multiStreamScene = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 227:
                        room.multiStreamId = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 228:
                        room.multiStreamIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 229:
                        room.multiStreamUrl = _StreamUrl_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 230:
                        room.idcRegion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 231:
                        room.regionalRestricted = _RegionalRestricted_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 232:
                        room.commercialContentToggle = _CommercialContentToggle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 233:
                        room.maxPreviewTime = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 234:
                        room.karaokeInfo = _KaraokeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 235:
                        room.starCommentConfig = _StarCommentConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 236:
                        room.showStarCommentEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 237:
                        room.cppVersion = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 238:
                        room.liveSubOnlyUseMusic = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 239:
                        room.likeEffect = _LikeEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 240:
                        room.roomPcu = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 241:
                        room.fypCommerceInfo = _FYPCommerceStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 242:
                        room.netMode = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 245:
                        room.rtcAppId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 246:
                        room.gameDemo = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 247:
                        room.quickGift = _QuickGift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 248:
                        room.onlineAudience = _OnlineAudience_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 249:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 250:
                        room.hasMoreHistoryComment = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 251:
                        room.historyCommentCursor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 252:
                        room.commercialWelcomeMessage = _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 253:
                        room.likeIconInfo = _LikeIconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 254:
                        room.guessWidgets = _GuessWidgets_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 255:
                        room.guessTaskPackInfo = _GuessTaskPackInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 256:
                        room.currentInteractionQuestion = _CurrentInteractionQuestion_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 257:
                        room.pollConf = _PollConf_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 258:
                        room.decisions = _EpiphronDecision_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 259:
                        room.aggregationData = _AggregationData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 260:
                        room.playTogetherInfo = _PlayTogetherBasicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 261:
                        room.multiStreamSource = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 262:
                        room.highlightFragmentInfo = _HighlightFragmentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 263:
                        Object[] objArr8 = new Object[2];
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 == -1) {
                                c1516680pZS.LJ(jLIZJ4);
                                arrayList.add(Integer.valueOf(iLJI));
                                arrayList2.add(objArr8);
                                break;
                            } else if (iLJI4 == 1) {
                                objArr8[0] = Long.valueOf(C1516700pZU.LIZJ(c1516680pZS));
                            } else if (iLJI4 == 2) {
                                objArr8[1] = _MsgNotifyQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                            } else {
                                C1516700pZU.LJ(c1516680pZS);
                            }
                        }
                        break;
                    case 264:
                        room.liveRecordConfig = _LiveRecordConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 265:
                        room.effectFrameUploadDemotion = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 266:
                        room.subUpsellInfo = _SubUpsellInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 267:
                        room.coverType = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 268:
                        room.reposted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 269:
                        room.repostInfo = _RepostInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 270:
                        room.dropsInfo = _DropsRoomInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 271:
                        room.enableStreamEncryption = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 272:
                        room.disableScreenRecord = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 273:
                        room.gameTagDetail = _GameTagDetail_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 274:
                        room.enableOptimizeSensitiveWord = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 275:
                        room.customTabInfo = _CustomTabInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 276:
                        room.roomLlmTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 277:
                        room.gameEmotesTab = _GameEmotesTab_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 280:
                        room.officialChannelBcToggleInfo = _BcToggleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 281:
                        room.officialChannelAnchorLiveProInfo = _LiveProInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 282:
                        room.previewCommentInfo = _PreviewCommentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 283:
                        room.ecAgeInterval = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 284:
                        room.taxonomyTagInfo = _TaxonomyTagInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 285:
                        room.subTag = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 286:
                        room.liveSubOnlyTier = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 287:
                        room.liveSubOnlyMonth = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 288:
                        room.avoidConfig = _MsgNotifyComAvoidConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 289:
                        room.aigcSelfDisclosureSwitch = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 290:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_EcommerceRoomTag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 291:
                        room.groupLiveInfo = _GroupLiveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 292:
                        room.groupLiveSession = _GroupLiveSession_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 293:
                        Object[] objArr9 = new Object[2];
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 == -1) {
                                c1516680pZS.LJ(jLIZJ5);
                                arrayList.add(Integer.valueOf(iLJI));
                                arrayList2.add(objArr9);
                                break;
                            } else if (iLJI5 == 1) {
                                objArr9[0] = Long.valueOf(C1516700pZU.LIZJ(c1516680pZS));
                            } else if (iLJI5 == 2) {
                                objArr9[1] = _MsgNotifyWatchEarlyQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                            } else {
                                C1516700pZU.LJ(c1516680pZS);
                            }
                        }
                        break;
                    case 294:
                        Object[] objArr10 = new Object[2];
                        long jLIZJ6 = c1516680pZS.LIZJ();
                        while (true) {
                            int iLJI6 = c1516680pZS.LJI();
                            if (iLJI6 == -1) {
                                c1516680pZS.LJ(jLIZJ6);
                                arrayList.add(Integer.valueOf(iLJI));
                                arrayList2.add(objArr10);
                                break;
                            } else if (iLJI6 == 1) {
                                objArr10[0] = Long.valueOf(C1516700pZU.LIZJ(c1516680pZS));
                            } else if (iLJI6 == 2) {
                                objArr10[1] = _MsgNotifyWatchContinuousQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                            } else {
                                C1516700pZU.LJ(c1516680pZS);
                            }
                        }
                        break;
                    case 295:
                        room.maxContinueWatchMillSeconds = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 296:
                        room.aiLiveSummary = _AILiveSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 297:
                        room.parallelPullStreamInfo = _ParallelPullStreamInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 298:
                        room.gameGiftGuideConfig = _GameGiftGuideKeywordsConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 299:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_RoomSticker_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 301:
                        room.queueInfo = _QueueInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 302:
                        room.smbInfo = _SMBInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 303:
                        room.isGame = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 304:
                        room.smbIndustryInfo = _SMBIndustryInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 305:
                        room.toolbarConfig = _ToolbarConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 306:
                        room.aiLivePreviewHighlight = _AILivePreviewHighlight_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 307:
                        room.showEmojiList = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 308:
                        room.previewCta = _PreviewCTA_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 309:
                        room.gsGuessingXtabAbParam = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 310:
                        room.noticeFcConfig = _NotifyFCConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 311:
                        room.m2GuideInfo = _M2GuideInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 312:
                        room.playTogetherExtraInfo = _PlayTogetherExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 313:
                        room.repostNote = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 314:
                        room.fypSkylightAvatarRefresh = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 315:
                        room.watchDayCntLayer = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 316:
                        room.streamSnapshot = _StreamSnapShot_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 317:
                        room.aiLivePreviewHighlightExpect = _AILivePreviewHighlight_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 318:
                        room.topFrameV2Summary = _TopFrameV2Summary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 319:
                        room.visibleScopeType = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 320:
                        room.hostBoardStatus = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 321:
                        room.ecommerceRoomHeadTag = _EcommerceRoomHeadTag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 322:
                        room.detectAnchorLeave = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 325:
                        room.boardUsingInfo = _BoardUsingInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 326:
                        room.secretRoomAccess = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 327:
                        room.intendedDrm = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 328:
                        room.existedTtlsGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 329:
                        room.hasTtlsLivePermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 330:
                        room.smbLivePreview = _SMBLivePreview_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 331:
                        room.ttlsRoomInfo = _TTLSRoomInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 332:
                        room.hasTtlsGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 333:
                        room.showWatchLiveCta = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 334:
                        room.isRepostedExpect = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 335:
                        room.aiLivePreviewHighlightExtra = _AILivePreviewHighlightExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 336:
                        room.isTag2SfvRelationPair = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 337:
                        room.interception = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 338:
                        room.quickChatInfo = _QuickChatInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 339:
                        room.roomCreateUserInfo = _RoomCreateUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 340:
                        room.nearbyInfo = _NearbyInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 341:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 342:
                        room.asrSummary = _ASRSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 343:
                        room.strategyPlatformFeatures = _StrategyPlatformFeatures_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 344:
                        room.previewCardCommentBox = _PreviewCardCommentBox_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 345:
                        room.hasViewerWishesGameTricks = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 346:
                        room.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 347:
                        room.likeAggOptimizeGroup = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 348:
                        room.liveChainInfo = _LiveChain_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 349:
                        room.forbiddenCopy = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 350:
                        room.ecomRankInfo = _EcomRankInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 351:
                        room.ecomRoomType = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 352:
                        room.ecLiveHeadParams = _ECLiveHeadToLiveRoomParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 353:
                        room.smbToolInfo = _SMBToolInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 354:
                        room.isStreamLowLatency = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 355:
                        room.multiStreamNetMode = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 356:
                        room.enlargeViewInfo = _EnlargeViewInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 357:
                        room.enterNearbyInfo = _EnterNearByInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 358:
                        room.dynamicTextInfo = _PublicCommonDynamicText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 359:
                        room.fypWatchReason = _WatchReason_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 360:
                        room.innerWatchReason = _WatchReason_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 361:
                        room.enterRoomBoostExtraStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 362:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(Long.valueOf(C1516700pZU.LIZJ(c1516680pZS)));
                        break;
                    case 363:
                        room.smbBoardId = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 364:
                        room.roomBanner = _BannerInRoomCollection_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 365:
                        room.contentSpotlightRankInfo = _ContentSpotlightRankInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 366:
                        room.streamSnapshotCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 367:
                        room.ttlsLiveType = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 368:
                        room.leadsAdsPinCard = _SubPinCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 369:
                        room.finalAnchorType = C1516700pZU.LIZIZ(c1516680pZS);
                        break;
                    case 370:
                        arrayList.add(Integer.valueOf(iLJI));
                        arrayList2.add(_StreamFeature_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 371:
                        room.enableStreamTranslation = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 372:
                        room.existedCommerceGoodsTs = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 373:
                        room.addTtlsProductTs = C1516700pZU.LIZJ(c1516680pZS);
                        break;
                    case 374:
                        room.activityToggleInfo = _ActivityToggleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 375:
                        room.ecommerceActivityInfo = _EcommerceActivityInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 376:
                        room.watchReasonV2 = _WatchReasonV2_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                HashSet hashSet = new HashSet();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Integer) it2.next()).intValue();
                    if (!hashSet.contains(Integer.valueOf(iIntValue))) {
                        switch (iIntValue) {
                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                List<RoomDecoration> list2 = room.decorationList;
                                if (list2 != null) {
                                    list2.clear();
                                } else {
                                    room.decorationList = new ArrayList();
                                }
                                break;
                            case 35:
                                List<TopFanTicket> list3 = room.topFanTickets;
                                if (list3 != null) {
                                    list3.clear();
                                } else {
                                    room.topFanTickets = new ArrayList();
                                }
                                break;
                            case 130:
                                Map<String, Long> map = room.linkerMap;
                                if (map != null) {
                                    map.clear();
                                } else {
                                    room.linkerMap = new LinkedHashMap();
                                }
                                break;
                            case 166:
                                List<ShortTouchItem> list4 = room.shortTouchItems;
                                if (list4 != null) {
                                    list4.clear();
                                } else {
                                    room.shortTouchItems = new ArrayList();
                                }
                                break;
                            case 167:
                                List<LiveFilterMsgRule> list5 = room.filterRule;
                                if (list5 != null) {
                                    list5.clear();
                                } else {
                                    room.filterRule = new ArrayList();
                                }
                                break;
                            case 170:
                                List<FeedRoomLabel> list6 = room.feedRoomLabelList;
                                if (list6 != null) {
                                    list6.clear();
                                } else {
                                    room.feedRoomLabelList = new ArrayList();
                                }
                                break;
                            case 177:
                                List<RoomSticker> list7 = room.roomStickerList;
                                if (list7 != null) {
                                    list7.clear();
                                } else {
                                    room.roomStickerList = new ArrayList();
                                }
                                break;
                            case 178:
                                List<GameTag> list8 = room.gameTags;
                                if (list8 != null) {
                                    list8.clear();
                                } else {
                                    room.gameTags = new ArrayList();
                                }
                                break;
                            case 192:
                                List<String> list9 = room.mIndicators;
                                if (list9 != null) {
                                    list9.clear();
                                } else {
                                    room.mIndicators = new ArrayList();
                                }
                                break;
                            case 202:
                                List<EffectInfo> list10 = room.effectInfo;
                                if (list10 != null) {
                                    list10.clear();
                                } else {
                                    room.effectInfo = new ArrayList();
                                }
                                break;
                            case 207:
                                Map<Long, Long> map2 = room.adminEcShowPermission;
                                if (map2 != null) {
                                    map2.clear();
                                } else {
                                    room.adminEcShowPermission = new LinkedHashMap();
                                }
                                break;
                            case 225:
                                List<String> list11 = room.rankCommentGroups;
                                if (list11 != null) {
                                    list11.clear();
                                } else {
                                    room.rankCommentGroups = new ArrayList();
                                }
                                break;
                            case 249:
                                List<ProtoMessageFetchResult.BaseProtoMessage> list12 = room.historyCommentList;
                                if (list12 != null) {
                                    list12.clear();
                                } else {
                                    room.historyCommentList = new ArrayList();
                                }
                                break;
                            case 263:
                                Map<Long, MsgNotifyQuota> map3 = room.quotaConfig;
                                if (map3 != null) {
                                    map3.clear();
                                } else {
                                    room.quotaConfig = new LinkedHashMap();
                                }
                                break;
                            case 290:
                                List<EcommerceRoomTag> list13 = room.ecommerceRoomTags;
                                if (list13 != null) {
                                    list13.clear();
                                } else {
                                    room.ecommerceRoomTags = new ArrayList();
                                }
                                break;
                            case 293:
                                Map<Long, MsgNotifyWatchEarlyQuota> map4 = room.watchEarlyQuotaConfig;
                                if (map4 != null) {
                                    map4.clear();
                                } else {
                                    room.watchEarlyQuotaConfig = new LinkedHashMap();
                                }
                                break;
                            case 294:
                                Map<Long, MsgNotifyWatchContinuousQuota> map5 = room.continuousRoomQuotaConfig;
                                if (map5 != null) {
                                    map5.clear();
                                } else {
                                    room.continuousRoomQuotaConfig = new LinkedHashMap();
                                }
                                break;
                            case 299:
                                List<RoomSticker> list14 = room.bizStickerList;
                                if (list14 != null) {
                                    list14.clear();
                                } else {
                                    room.bizStickerList = new ArrayList();
                                }
                                break;
                            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                                List<String> list15 = room.emojiList;
                                if (list15 != null) {
                                    list15.clear();
                                } else {
                                    room.emojiList = new ArrayList();
                                }
                                break;
                            case 341:
                                List<String> list16 = room.allEmojiList;
                                if (list16 != null) {
                                    list16.clear();
                                } else {
                                    room.allEmojiList = new ArrayList();
                                }
                                break;
                            case 362:
                                List<Long> list17 = room.roomDiffFieldsIndex;
                                if (list17 != null) {
                                    list17.clear();
                                } else {
                                    room.roomDiffFieldsIndex = new ArrayList();
                                }
                                break;
                            case 370:
                                List<StreamFeature> list18 = room.streamFeatures;
                                if (list18 != null) {
                                    list18.clear();
                                } else {
                                    room.streamFeatures = new ArrayList();
                                }
                                break;
                        }
                        hashSet.add(Integer.valueOf(iIntValue));
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    int iIntValue2 = ((Integer) ListProtector.get(arrayList, i)).intValue();
                    Object obj11 = ListProtector.get(arrayList2, i);
                    switch (iIntValue2) {
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            if (obj11 != null) {
                                room.decorationList.add((RoomDecoration) obj11);
                            }
                            break;
                        case 35:
                            if (obj11 != null) {
                                room.topFanTickets.add((TopFanTicket) obj11);
                            }
                            break;
                        case 130:
                            if (obj11 != null && (obj = (objArr = (Object[]) obj11)[0]) != null && (obj2 = objArr[1]) != null) {
                                room.linkerMap.put((String) obj, (Long) obj2);
                            }
                            break;
                        case 166:
                            if (obj11 != null) {
                                room.shortTouchItems.add((ShortTouchItem) obj11);
                            }
                            break;
                        case 167:
                            if (obj11 != null) {
                                room.filterRule.add((LiveFilterMsgRule) obj11);
                            }
                            break;
                        case 170:
                            if (obj11 != null) {
                                room.feedRoomLabelList.add((FeedRoomLabel) obj11);
                            }
                            break;
                        case 177:
                            if (obj11 != null) {
                                room.roomStickerList.add((RoomSticker) obj11);
                            }
                            break;
                        case 178:
                            if (obj11 != null) {
                                room.gameTags.add((GameTag) obj11);
                            }
                            break;
                        case 192:
                            if (obj11 != null) {
                                room.mIndicators.add((String) obj11);
                            }
                            break;
                        case 202:
                            if (obj11 != null) {
                                room.effectInfo.add((EffectInfo) obj11);
                            }
                            break;
                        case 207:
                            if (obj11 != null && (obj3 = (objArr2 = (Object[]) obj11)[0]) != null && (obj4 = objArr2[1]) != null) {
                                room.adminEcShowPermission.put((Long) obj3, (Long) obj4);
                            }
                            break;
                        case 225:
                            if (obj11 != null) {
                                room.rankCommentGroups.add((String) obj11);
                            }
                            break;
                        case 249:
                            if (obj11 != null) {
                                room.historyCommentList.add((ProtoMessageFetchResult.BaseProtoMessage) obj11);
                            }
                            break;
                        case 263:
                            if (obj11 != null && (obj5 = (objArr3 = (Object[]) obj11)[0]) != null && (obj6 = objArr3[1]) != null) {
                                room.quotaConfig.put((Long) obj5, (MsgNotifyQuota) obj6);
                            }
                            break;
                        case 290:
                            if (obj11 != null) {
                                room.ecommerceRoomTags.add((EcommerceRoomTag) obj11);
                            }
                            break;
                        case 293:
                            if (obj11 != null && (obj7 = (objArr4 = (Object[]) obj11)[0]) != null && (obj8 = objArr4[1]) != null) {
                                room.watchEarlyQuotaConfig.put((Long) obj7, (MsgNotifyWatchEarlyQuota) obj8);
                            }
                            break;
                        case 294:
                            if (obj11 != null && (obj9 = (objArr5 = (Object[]) obj11)[0]) != null && (obj10 = objArr5[1]) != null) {
                                room.continuousRoomQuotaConfig.put((Long) obj9, (MsgNotifyWatchContinuousQuota) obj10);
                            }
                            break;
                        case 299:
                            if (obj11 != null) {
                                room.bizStickerList.add((RoomSticker) obj11);
                            }
                            break;
                        case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                            if (obj11 != null) {
                                room.emojiList.add((String) obj11);
                            }
                            break;
                        case 341:
                            if (obj11 != null) {
                                room.allEmojiList.add((String) obj11);
                            }
                            break;
                        case 362:
                            if (obj11 != null) {
                                room.roomDiffFieldsIndex.add((Long) obj11);
                            }
                            break;
                        case 370:
                            if (obj11 != null) {
                                room.streamFeatures.add((StreamFeature) obj11);
                            }
                            break;
                    }
                }
                if (list != null) {
                    Iterator<Integer> it3 = list.iterator();
                    while (it3.hasNext()) {
                        switch (it3.next().intValue()) {
                            case 1:
                                room.id = 0L;
                                break;
                            case 2:
                                room.idStr = null;
                                break;
                            case 3:
                                room.status = 0;
                                break;
                            case 4:
                                room.ownerUserId = 0L;
                                break;
                            case 5:
                                room.title = null;
                                break;
                            case 6:
                                room.userCount = 0;
                                break;
                            case 7:
                                room.createTime = 0L;
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                room.finishTime = 0L;
                                break;
                            case 16:
                                room.platform = 0;
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                room.clientVersion = null;
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                room.withLinkMic = false;
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                room.cover = null;
                                break;
                            case 21:
                                room.dynamicCover = null;
                                break;
                            case 22:
                                room.dynamicCoverLow = null;
                                break;
                            case 23:
                                room.shareUrl = null;
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                room.anchorShareText = null;
                                break;
                            case 25:
                                room.userShareText = null;
                                break;
                            case 26:
                                room.streamId = 0L;
                                break;
                            case 28:
                                room.streamUrl = null;
                                break;
                            case 29:
                                room.mosaicStatus = 0;
                                break;
                            case 32:
                                room.linkMicInfoGson = null;
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                List<RoomDecoration> list19 = room.decorationList;
                                if (list19 != null) {
                                    list19.clear();
                                } else {
                                    room.decorationList = new ArrayList();
                                }
                                break;
                            case 35:
                                List<TopFanTicket> list20 = room.topFanTickets;
                                if (list20 != null) {
                                    list20.clear();
                                } else {
                                    room.topFanTickets = new ArrayList();
                                }
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                room.stats = null;
                                break;
                            case 42:
                                room.feedRoomLabel = null;
                                break;
                            case 43:
                                room.labels = null;
                                break;
                            case 46:
                                room.owner = null;
                                break;
                            case 48:
                                room.hasCommerceGoods = false;
                                break;
                            case 51:
                                room.liveTypeAudio = false;
                                break;
                            case 52:
                                room.isThirdParty = false;
                                break;
                            case 53:
                                room.isScreenshot = false;
                                break;
                            case 54:
                                room.liveTypeSandbox = false;
                                break;
                            case 63:
                                room.startTime = 0L;
                                break;
                            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                room.mRoomAuthStatus = null;
                                break;
                            case 83:
                                room.background = null;
                                break;
                            case 84:
                                room.layout = 0L;
                                break;
                            case 90:
                                room.unusedEffect = false;
                                break;
                            case 91:
                                room.giftMessageStyle = 0;
                                break;
                            case 93:
                                room.finish_url = null;
                                break;
                            case 101:
                                room.roomLayout = 0;
                                break;
                            case 111:
                                room.likeCount = 0L;
                                break;
                            case 120:
                                room.anchorTabType = 0L;
                                break;
                            case 122:
                                room.officialChannelInfo = null;
                                break;
                            case 130:
                                Map<String, Long> map6 = room.linkerMap;
                                if (map6 != null) {
                                    map6.clear();
                                } else {
                                    room.linkerMap = new LinkedHashMap();
                                }
                                break;
                            case 138:
                                room.webcastSdkVersion = 0L;
                                break;
                            case 139:
                                room.mNameMode = 0;
                                break;
                            case 140:
                                room.roomCreateAbParam = null;
                                break;
                            case 145:
                                room.commerceStruct = null;
                                break;
                            case 147:
                                room.streamCover = null;
                                break;
                            case 149:
                                room.questionVersion = 0;
                                break;
                            case 151:
                                room.liveEventInfo = null;
                                break;
                            case 152:
                                room.hashtag = null;
                                break;
                            case 153:
                                room.baLinkStruct = null;
                                break;
                            case 155:
                                room.answeringQuestion = null;
                                break;
                            case 157:
                                room.warningTag = null;
                                break;
                            case 158:
                                room.maskLayer = null;
                                break;
                            case 159:
                                room.liveRoomMode = 0;
                                break;
                            case 163:
                                room.finishUrlLynx = null;
                                break;
                            case 165:
                                room.likeInfo = null;
                                break;
                            case 166:
                                List<ShortTouchItem> list21 = room.shortTouchItems;
                                if (list21 != null) {
                                    list21.clear();
                                } else {
                                    room.shortTouchItems = new ArrayList();
                                }
                                break;
                            case 167:
                                List<LiveFilterMsgRule> list22 = room.filterRule;
                                if (list22 != null) {
                                    list22.clear();
                                } else {
                                    room.filterRule = new ArrayList();
                                }
                                break;
                            case 169:
                                room.mBoostCardRoomStatus = null;
                                break;
                            case 170:
                                List<FeedRoomLabel> list23 = room.feedRoomLabelList;
                                if (list23 != null) {
                                    list23.clear();
                                } else {
                                    room.feedRoomLabelList = new ArrayList();
                                }
                                break;
                            case 172:
                                room.haveWishList = false;
                                break;
                            case 174:
                                room.multiLiveUserSettings = null;
                                break;
                            case 176:
                                room.interactionQuestion = null;
                                break;
                            case 177:
                                List<RoomSticker> list24 = room.roomStickerList;
                                if (list24 != null) {
                                    list24.clear();
                                } else {
                                    room.roomStickerList = new ArrayList();
                                }
                                break;
                            case 178:
                                List<GameTag> list25 = room.gameTags;
                                if (list25 != null) {
                                    list25.clear();
                                } else {
                                    room.gameTags = new ArrayList();
                                }
                                break;
                            case 179:
                                room.advancedPollInfo = null;
                                break;
                            case 180:
                                room.giftPollVoteEnabled = false;
                                break;
                            case 182:
                                room.skin = null;
                                break;
                            case 183:
                                room.squareCoverImg = null;
                                break;
                            case 184:
                                room.rectangleCoverImg = null;
                                break;
                            case 185:
                                room.mRoomAuthMessage = null;
                                break;
                            case 186:
                                room.paidEvent = null;
                                break;
                            case 187:
                                room.pictionaryFullInfo = null;
                                break;
                            case 188:
                                room.existedCommerceGoods = false;
                                break;
                            case 189:
                                room.ageRestricted = null;
                                break;
                            case 191:
                                room.pinInfo = null;
                                break;
                            case 192:
                                List<String> list26 = room.mIndicators;
                                if (list26 != null) {
                                    list26.clear();
                                } else {
                                    room.mIndicators = new ArrayList();
                                }
                                break;
                            case 193:
                                room.topFrameSummary = null;
                                break;
                            case 194:
                                room.bcToggleInfo = null;
                                break;
                            case 196:
                                room.commentHasTextEmojiEmote = 0;
                                break;
                            case 197:
                                room.partnershipInfo = null;
                                break;
                            case 198:
                                room.streamStatus = 0;
                                break;
                            case 199:
                                room.creator = null;
                                break;
                            case 200:
                                room.drawerTabPosition = null;
                                break;
                            case 201:
                                room.baLeadsGenInfo = null;
                                break;
                            case 202:
                                List<EffectInfo> list27 = room.effectInfo;
                                if (list27 != null) {
                                    list27.clear();
                                } else {
                                    room.effectInfo = new ArrayList();
                                }
                                break;
                            case 203:
                                room.audioMute = 0;
                                break;
                            case 204:
                                room.liveEventCard = null;
                                break;
                            case 205:
                                room.liveSubOnly = 0L;
                                break;
                            case 206:
                                room.supportQuiz = 0L;
                                break;
                            case 207:
                                Map<Long, Long> map7 = room.adminEcShowPermission;
                                if (map7 != null) {
                                    map7.clear();
                                } else {
                                    room.adminEcShowPermission = new LinkedHashMap();
                                }
                                break;
                            case 208:
                                room.blurredCover = null;
                                break;
                            case 209:
                                room.captionInfo = null;
                                break;
                            case 210:
                                room.adjustDisplayOrder = 0L;
                                break;
                            case 211:
                                room.commerceInfoBackup = null;
                                break;
                            case 212:
                                room.allowPreviewTime = 0L;
                                break;
                            case 213:
                                room.paidContentInfo = null;
                                break;
                            case 214:
                                room.subPinCard = null;
                                break;
                            case 215:
                                room.enableServerDrop = 0L;
                                break;
                            case 216:
                                room.disablePreviewSubOnly = 0L;
                                break;
                            case 217:
                                room.liteUserVisible = false;
                                break;
                            case 218:
                                room.liteUserNotVisible = false;
                                break;
                            case 219:
                                room.dropCommentGroup = 0L;
                                break;
                            case 220:
                                room.picoLiveType = 0;
                                break;
                            case 221:
                                room.giftSuspension = null;
                                break;
                            case 222:
                                room.pollingStarComment = false;
                                break;
                            case 223:
                                room.hasUsedMusic = false;
                                break;
                            case 224:
                                room.anchorLiveProInfo = null;
                                break;
                            case 225:
                                List<String> list28 = room.rankCommentGroups;
                                if (list28 != null) {
                                    list28.clear();
                                } else {
                                    room.rankCommentGroups = new ArrayList();
                                }
                                break;
                            case 226:
                                room.multiStreamScene = 0L;
                                break;
                            case 227:
                                room.multiStreamId = 0L;
                                break;
                            case 228:
                                room.multiStreamIdStr = null;
                                break;
                            case 229:
                                room.multiStreamUrl = null;
                                break;
                            case 230:
                                room.idcRegion = null;
                                break;
                            case 231:
                                room.regionalRestricted = null;
                                break;
                            case 232:
                                room.commercialContentToggle = null;
                                break;
                            case 233:
                                room.maxPreviewTime = 0L;
                                break;
                            case 234:
                                room.karaokeInfo = null;
                                break;
                            case 235:
                                room.starCommentConfig = null;
                                break;
                            case 236:
                                room.showStarCommentEntrance = false;
                                break;
                            case 237:
                                room.cppVersion = 0;
                                break;
                            case 238:
                                room.liveSubOnlyUseMusic = 0L;
                                break;
                            case 239:
                                room.likeEffect = null;
                                break;
                            case 240:
                                room.roomPcu = 0L;
                                break;
                            case 241:
                                room.fypCommerceInfo = null;
                                break;
                            case 242:
                                room.netMode = 0L;
                                break;
                            case 245:
                                room.rtcAppId = null;
                                break;
                            case 246:
                                room.gameDemo = 0L;
                                break;
                            case 247:
                                room.quickGift = null;
                                break;
                            case 248:
                                room.onlineAudience = null;
                                break;
                            case 249:
                                List<ProtoMessageFetchResult.BaseProtoMessage> list29 = room.historyCommentList;
                                if (list29 != null) {
                                    list29.clear();
                                } else {
                                    room.historyCommentList = new ArrayList();
                                }
                                break;
                            case 250:
                                room.hasMoreHistoryComment = false;
                                break;
                            case 251:
                                room.historyCommentCursor = null;
                                break;
                            case 252:
                                room.commercialWelcomeMessage = null;
                                break;
                            case 253:
                                room.likeIconInfo = null;
                                break;
                            case 254:
                                room.guessWidgets = null;
                                break;
                            case 255:
                                room.guessTaskPackInfo = null;
                                break;
                            case 256:
                                room.currentInteractionQuestion = null;
                                break;
                            case 257:
                                room.pollConf = null;
                                break;
                            case 258:
                                room.decisions = null;
                                break;
                            case 259:
                                room.aggregationData = null;
                                break;
                            case 260:
                                room.playTogetherInfo = null;
                                break;
                            case 261:
                                room.multiStreamSource = 0;
                                break;
                            case 262:
                                room.highlightFragmentInfo = null;
                                break;
                            case 263:
                                Map<Long, MsgNotifyQuota> map8 = room.quotaConfig;
                                if (map8 != null) {
                                    map8.clear();
                                } else {
                                    room.quotaConfig = new LinkedHashMap();
                                }
                                break;
                            case 264:
                                room.liveRecordConfig = null;
                                break;
                            case 265:
                                room.effectFrameUploadDemotion = 0L;
                                break;
                            case 266:
                                room.subUpsellInfo = null;
                                break;
                            case 267:
                                room.coverType = 0L;
                                break;
                            case 268:
                                room.reposted = false;
                                break;
                            case 269:
                                room.repostInfo = null;
                                break;
                            case 270:
                                room.dropsInfo = null;
                                break;
                            case 271:
                                room.enableStreamEncryption = false;
                                break;
                            case 272:
                                room.disableScreenRecord = false;
                                break;
                            case 273:
                                room.gameTagDetail = null;
                                break;
                            case 274:
                                room.enableOptimizeSensitiveWord = false;
                                break;
                            case 275:
                                room.customTabInfo = null;
                                break;
                            case 276:
                                room.roomLlmTitle = null;
                                break;
                            case 277:
                                room.gameEmotesTab = null;
                                break;
                            case 280:
                                room.officialChannelBcToggleInfo = null;
                                break;
                            case 281:
                                room.officialChannelAnchorLiveProInfo = null;
                                break;
                            case 282:
                                room.previewCommentInfo = null;
                                break;
                            case 283:
                                room.ecAgeInterval = 0;
                                break;
                            case 284:
                                room.taxonomyTagInfo = null;
                                break;
                            case 285:
                                room.subTag = 0L;
                                break;
                            case 286:
                                room.liveSubOnlyTier = 0L;
                                break;
                            case 287:
                                room.liveSubOnlyMonth = 0L;
                                break;
                            case 288:
                                room.avoidConfig = null;
                                break;
                            case 289:
                                room.aigcSelfDisclosureSwitch = false;
                                break;
                            case 290:
                                List<EcommerceRoomTag> list30 = room.ecommerceRoomTags;
                                if (list30 != null) {
                                    list30.clear();
                                } else {
                                    room.ecommerceRoomTags = new ArrayList();
                                }
                                break;
                            case 291:
                                room.groupLiveInfo = null;
                                break;
                            case 292:
                                room.groupLiveSession = null;
                                break;
                            case 293:
                                Map<Long, MsgNotifyWatchEarlyQuota> map9 = room.watchEarlyQuotaConfig;
                                if (map9 != null) {
                                    map9.clear();
                                } else {
                                    room.watchEarlyQuotaConfig = new LinkedHashMap();
                                }
                                break;
                            case 294:
                                Map<Long, MsgNotifyWatchContinuousQuota> map10 = room.continuousRoomQuotaConfig;
                                if (map10 != null) {
                                    map10.clear();
                                } else {
                                    room.continuousRoomQuotaConfig = new LinkedHashMap();
                                }
                                break;
                            case 295:
                                room.maxContinueWatchMillSeconds = 0L;
                                break;
                            case 296:
                                room.aiLiveSummary = null;
                                break;
                            case 297:
                                room.parallelPullStreamInfo = null;
                                break;
                            case 298:
                                room.gameGiftGuideConfig = null;
                                break;
                            case 299:
                                List<RoomSticker> list31 = room.bizStickerList;
                                if (list31 != null) {
                                    list31.clear();
                                } else {
                                    room.bizStickerList = new ArrayList();
                                }
                                break;
                            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                                List<String> list32 = room.emojiList;
                                if (list32 != null) {
                                    list32.clear();
                                } else {
                                    room.emojiList = new ArrayList();
                                }
                                break;
                            case 301:
                                room.queueInfo = null;
                                break;
                            case 302:
                                room.smbInfo = null;
                                break;
                            case 303:
                                room.isGame = 0L;
                                break;
                            case 304:
                                room.smbIndustryInfo = null;
                                break;
                            case 305:
                                room.toolbarConfig = null;
                                break;
                            case 306:
                                room.aiLivePreviewHighlight = null;
                                break;
                            case 307:
                                room.showEmojiList = false;
                                break;
                            case 308:
                                room.previewCta = null;
                                break;
                            case 309:
                                room.gsGuessingXtabAbParam = 0L;
                                break;
                            case 310:
                                room.noticeFcConfig = null;
                                break;
                            case 311:
                                room.m2GuideInfo = null;
                                break;
                            case 312:
                                room.playTogetherExtraInfo = null;
                                break;
                            case 313:
                                room.repostNote = null;
                                break;
                            case 314:
                                room.fypSkylightAvatarRefresh = 0L;
                                break;
                            case 315:
                                room.watchDayCntLayer = 0L;
                                break;
                            case 316:
                                room.streamSnapshot = null;
                                break;
                            case 317:
                                room.aiLivePreviewHighlightExpect = null;
                                break;
                            case 318:
                                room.topFrameV2Summary = null;
                                break;
                            case 319:
                                room.visibleScopeType = 0L;
                                break;
                            case 320:
                                room.hostBoardStatus = 0L;
                                break;
                            case 321:
                                room.ecommerceRoomHeadTag = null;
                                break;
                            case 322:
                                room.detectAnchorLeave = 0L;
                                break;
                            case 325:
                                room.boardUsingInfo = null;
                                break;
                            case 326:
                                room.secretRoomAccess = false;
                                break;
                            case 327:
                                room.intendedDrm = null;
                                break;
                            case 328:
                                room.existedTtlsGoods = false;
                                break;
                            case 329:
                                room.hasTtlsLivePermission = false;
                                break;
                            case 330:
                                room.smbLivePreview = null;
                                break;
                            case 331:
                                room.ttlsRoomInfo = null;
                                break;
                            case 332:
                                room.hasTtlsGoods = false;
                                break;
                            case 333:
                                room.showWatchLiveCta = false;
                                break;
                            case 334:
                                room.isRepostedExpect = 0L;
                                break;
                            case 335:
                                room.aiLivePreviewHighlightExtra = null;
                                break;
                            case 336:
                                room.isTag2SfvRelationPair = false;
                                break;
                            case 337:
                                room.interception = false;
                                break;
                            case 338:
                                room.quickChatInfo = null;
                                break;
                            case 339:
                                room.roomCreateUserInfo = null;
                                break;
                            case 340:
                                room.nearbyInfo = null;
                                break;
                            case 341:
                                List<String> list33 = room.allEmojiList;
                                if (list33 != null) {
                                    list33.clear();
                                } else {
                                    room.allEmojiList = new ArrayList();
                                }
                                break;
                            case 342:
                                room.asrSummary = null;
                                break;
                            case 343:
                                room.strategyPlatformFeatures = null;
                                break;
                            case 344:
                                room.previewCardCommentBox = null;
                                break;
                            case 345:
                                room.hasViewerWishesGameTricks = false;
                                break;
                            case 346:
                                room.logId = null;
                                break;
                            case 347:
                                room.likeAggOptimizeGroup = 0L;
                                break;
                            case 348:
                                room.liveChainInfo = null;
                                break;
                            case 349:
                                room.forbiddenCopy = false;
                                break;
                            case 350:
                                room.ecomRankInfo = null;
                                break;
                            case 351:
                                room.ecomRoomType = 0L;
                                break;
                            case 352:
                                room.ecLiveHeadParams = null;
                                break;
                            case 353:
                                room.smbToolInfo = null;
                                break;
                            case 354:
                                room.isStreamLowLatency = false;
                                break;
                            case 355:
                                room.multiStreamNetMode = 0L;
                                break;
                            case 356:
                                room.enlargeViewInfo = null;
                                break;
                            case 357:
                                room.enterNearbyInfo = null;
                                break;
                            case 358:
                                room.dynamicTextInfo = null;
                                break;
                            case 359:
                                room.fypWatchReason = null;
                                break;
                            case 360:
                                room.innerWatchReason = null;
                                break;
                            case 361:
                                room.enterRoomBoostExtraStr = null;
                                break;
                            case 362:
                                List<Long> list34 = room.roomDiffFieldsIndex;
                                if (list34 != null) {
                                    list34.clear();
                                } else {
                                    room.roomDiffFieldsIndex = new ArrayList();
                                }
                                break;
                            case 363:
                                room.smbBoardId = 0L;
                                break;
                            case 364:
                                room.roomBanner = null;
                                break;
                            case 365:
                                room.contentSpotlightRankInfo = null;
                                break;
                            case 366:
                                room.streamSnapshotCover = null;
                                break;
                            case 367:
                                room.ttlsLiveType = 0L;
                                break;
                            case 368:
                                room.leadsAdsPinCard = null;
                                break;
                            case 369:
                                room.finalAnchorType = 0;
                                break;
                            case 370:
                                List<StreamFeature> list35 = room.streamFeatures;
                                if (list35 != null) {
                                    list35.clear();
                                } else {
                                    room.streamFeatures = new ArrayList();
                                }
                                break;
                            case 371:
                                room.enableStreamTranslation = false;
                                break;
                            case 372:
                                room.existedCommerceGoodsTs = 0L;
                                break;
                            case 373:
                                room.addTtlsProductTs = 0L;
                                break;
                            case 374:
                                room.activityToggleInfo = null;
                                break;
                            case 375:
                                room.ecommerceActivityInfo = null;
                                break;
                            case 376:
                                room.watchReasonV2 = null;
                                break;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public static Room LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Room room = new Room();
        room.topFanTickets = new ArrayList();
        room.rankCommentGroups = new ArrayList();
        room.bizStickerList = new ArrayList();
        room.mIndicators = new ArrayList();
        room.shortTouchItems = new ArrayList();
        room.roomStickerList = new ArrayList();
        room.emojiList = new ArrayList();
        room.effectInfo = new ArrayList();
        room.filterRule = new ArrayList();
        room.adminEcShowPermission = new HashMap();
        room.decorationList = new ArrayList();
        room.allEmojiList = new ArrayList();
        room.continuousRoomQuotaConfig = new HashMap();
        room.historyCommentList = new ArrayList();
        room.feedRoomLabelList = new ArrayList();
        room.quotaConfig = new HashMap();
        room.roomDiffFieldsIndex = new ArrayList();
        room.watchEarlyQuotaConfig = new HashMap();
        room.gameTags = new ArrayList();
        room.streamFeatures = new ArrayList();
        room.ecommerceRoomTags = new ArrayList();
        room.linkerMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Object objValueOf = null;
                switch (iLJI) {
                    case 1:
                        room.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        room.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        room.status = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        room.ownerUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        room.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        room.userCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        room.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                    case 19:
                    case 27:
                    case 30:
                    case 31:
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 44:
                    case 45:
                    case 47:
                    case 49:
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case BaseNotice.CREATOR /* 62 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 92:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 121:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 146:
                    case 148:
                    case 150:
                    case 154:
                    case 156:
                    case 160:
                    case 161:
                    case 162:
                    case 164:
                    case 168:
                    case 171:
                    case 173:
                    case 175:
                    case 181:
                    case 190:
                    case 195:
                    case 243:
                    case 244:
                    case 278:
                    case 279:
                    case 323:
                    case 324:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        room.finishTime = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        room.platform = (int) c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        room.clientVersion = String.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        room.withLinkMic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        room.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        room.dynamicCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        room.dynamicCoverLow = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        room.shareUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        room.anchorShareText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 25:
                        room.userShareText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        room.streamId = c1516680pZS.LJIIJJI();
                        break;
                    case 28:
                        room.streamUrl = _StreamUrl_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 29:
                        room.mosaicStatus = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 32:
                        room.linkMicInfoGson = _RoomLinkInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        room.decorationList.add(_RoomDecoration_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 35:
                        room.topFanTickets.add(_TopFanTicket_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        room.stats = _RoomStats_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 42:
                        room.feedRoomLabel = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 43:
                        room.labels = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 46:
                        room.owner = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 48:
                        room.hasCommerceGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 51:
                        room.liveTypeAudio = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 52:
                        room.isThirdParty = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 53:
                        room.isScreenshot = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 54:
                        room.liveTypeSandbox = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 63:
                        room.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                        room.mRoomAuthStatus = _RoomAuthStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 83:
                        room.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 84:
                        room.layout = c1516680pZS.LJIIJJI();
                        break;
                    case 90:
                        room.unusedEffect = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 91:
                        room.giftMessageStyle = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 93:
                        room.finish_url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 101:
                        room.roomLayout = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 111:
                        room.likeCount = c1516680pZS.LJIIJJI();
                        break;
                    case 120:
                        room.anchorTabType = c1516680pZS.LJIIJ();
                        break;
                    case 122:
                        room.officialChannelInfo = _OfficialChannelInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 130:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    objValueOf = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (objValueOf != null) {
                                    if (lValueOf != null) {
                                        room.linkerMap.put((String) objValueOf, lValueOf);
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
                    case 138:
                        room.webcastSdkVersion = c1516680pZS.LJIIJJI();
                        break;
                    case 139:
                        room.mNameMode = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 140:
                        room.roomCreateAbParam = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 145:
                        room.commerceStruct = _CommerceStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 147:
                        room.streamCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 149:
                        room.questionVersion = c1516680pZS.LJIIJ();
                        break;
                    case 151:
                        room.liveEventInfo = _LiveEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 152:
                        room.hashtag = _Hashtag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 153:
                        room.baLinkStruct = _BALinkStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 155:
                        room.answeringQuestion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 157:
                        room.warningTag = _WarningTag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 158:
                        room.maskLayer = _MaskLayer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 159:
                        room.liveRoomMode = c1516680pZS.LJIIJ();
                        break;
                    case 163:
                        room.finishUrlLynx = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 165:
                        room.likeInfo = _LikeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 166:
                        room.shortTouchItems.add(_ShortTouchItem_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 167:
                        room.filterRule.add(_LiveFilterMsgRule_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 169:
                        room.mBoostCardRoomStatus = _LiveGiftBoostCardRoomStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 170:
                        room.feedRoomLabelList.add(_FeedRoomLabel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 172:
                        room.haveWishList = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 174:
                        room.multiLiveUserSettings = _MultiLiveUserSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 176:
                        room.interactionQuestion = _InteractionQuestionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 177:
                        room.roomStickerList.add(_RoomSticker_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 178:
                        room.gameTags.add(_GameTag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 179:
                        room.advancedPollInfo = _PollInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 180:
                        room.giftPollVoteEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 182:
                        room.skin = _Skin_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 183:
                        room.squareCoverImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 184:
                        room.rectangleCoverImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 185:
                        room.mRoomAuthMessage = _RoomAuthMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 186:
                        room.paidEvent = _PaidEvent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 187:
                        room.pictionaryFullInfo = _PictionaryFullInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 188:
                        room.existedCommerceGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 189:
                        room.ageRestricted = _AgeRestricted_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 191:
                        room.pinInfo = _PinInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 192:
                        room.mIndicators.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 193:
                        room.topFrameSummary = _TopFrameSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 194:
                        room.bcToggleInfo = _BcToggleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 196:
                        room.commentHasTextEmojiEmote = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 197:
                        room.partnershipInfo = _PartnershipInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 198:
                        room.streamStatus = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 199:
                        room.creator = _Creator_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 200:
                        room.drawerTabPosition = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 201:
                        room.baLeadsGenInfo = _BaLeadsGenInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 202:
                        room.effectInfo.add(_EffectInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 203:
                        room.audioMute = c1516680pZS.LJIIJ();
                        break;
                    case 204:
                        room.liveEventCard = _EventCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 205:
                        room.liveSubOnly = c1516680pZS.LJIIJJI();
                        break;
                    case 206:
                        room.supportQuiz = c1516680pZS.LJIIJJI();
                        break;
                    case 207:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Long lValueOf2 = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (objValueOf != null) {
                                    if (lValueOf2 != null) {
                                        room.adminEcShowPermission.put((Long) objValueOf, lValueOf2);
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
                    case 208:
                        room.blurredCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 209:
                        room.captionInfo = _CaptionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 210:
                        room.adjustDisplayOrder = c1516680pZS.LJIIJJI();
                        break;
                    case 211:
                        room.commerceInfoBackup = _CommerceStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 212:
                        room.allowPreviewTime = c1516680pZS.LJIIJJI();
                        break;
                    case 213:
                        room.paidContentInfo = _PaidContentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 214:
                        room.subPinCard = _SubPinCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 215:
                        room.enableServerDrop = c1516680pZS.LJIIJJI();
                        break;
                    case 216:
                        room.disablePreviewSubOnly = c1516680pZS.LJIIJJI();
                        break;
                    case 217:
                        room.liteUserVisible = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 218:
                        room.liteUserNotVisible = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 219:
                        room.dropCommentGroup = c1516680pZS.LJIIJJI();
                        break;
                    case 220:
                        room.picoLiveType = c1516680pZS.LJIIJ();
                        break;
                    case 221:
                        room.giftSuspension = _GiftSuspension_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 222:
                        room.pollingStarComment = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 223:
                        room.hasUsedMusic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 224:
                        room.anchorLiveProInfo = _LiveProInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 225:
                        room.rankCommentGroups.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 226:
                        room.multiStreamScene = c1516680pZS.LJIIJJI();
                        break;
                    case 227:
                        room.multiStreamId = c1516680pZS.LJIIJJI();
                        break;
                    case 228:
                        room.multiStreamIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 229:
                        room.multiStreamUrl = _StreamUrl_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 230:
                        room.idcRegion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 231:
                        room.regionalRestricted = _RegionalRestricted_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 232:
                        room.commercialContentToggle = _CommercialContentToggle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 233:
                        room.maxPreviewTime = c1516680pZS.LJIIJJI();
                        break;
                    case 234:
                        room.karaokeInfo = _KaraokeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 235:
                        room.starCommentConfig = _StarCommentConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 236:
                        room.showStarCommentEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 237:
                        room.cppVersion = c1516680pZS.LJIIJ();
                        break;
                    case 238:
                        room.liveSubOnlyUseMusic = c1516680pZS.LJIIJJI();
                        break;
                    case 239:
                        room.likeEffect = _LikeEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 240:
                        room.roomPcu = c1516680pZS.LJIIJJI();
                        break;
                    case 241:
                        room.fypCommerceInfo = _FYPCommerceStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 242:
                        room.netMode = c1516680pZS.LJIIJJI();
                        break;
                    case 245:
                        room.rtcAppId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 246:
                        room.gameDemo = c1516680pZS.LJIIJJI();
                        break;
                    case 247:
                        room.quickGift = _QuickGift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 248:
                        room.onlineAudience = _OnlineAudience_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 249:
                        room.historyCommentList.add(_ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 250:
                        room.hasMoreHistoryComment = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 251:
                        room.historyCommentCursor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 252:
                        room.commercialWelcomeMessage = _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 253:
                        room.likeIconInfo = _LikeIconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 254:
                        room.guessWidgets = _GuessWidgets_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 255:
                        room.guessTaskPackInfo = _GuessTaskPackInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 256:
                        room.currentInteractionQuestion = _CurrentInteractionQuestion_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 257:
                        room.pollConf = _PollConf_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 258:
                        room.decisions = _EpiphronDecision_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 259:
                        room.aggregationData = _AggregationData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 260:
                        room.playTogetherInfo = _PlayTogetherBasicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 261:
                        room.multiStreamSource = c1516680pZS.LJIIJ();
                        break;
                    case 262:
                        room.highlightFragmentInfo = _HighlightFragmentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 263:
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        MsgNotifyQuota msgNotifyQuotaLIZLLL = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 != -1) {
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        msgNotifyQuotaLIZLLL = _MsgNotifyQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ4);
                                if (objValueOf != null) {
                                    if (msgNotifyQuotaLIZLLL != null) {
                                        room.quotaConfig.put((Long) objValueOf, msgNotifyQuotaLIZLLL);
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
                    case 264:
                        room.liveRecordConfig = _LiveRecordConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 265:
                        room.effectFrameUploadDemotion = c1516680pZS.LJIIJJI();
                        break;
                    case 266:
                        room.subUpsellInfo = _SubUpsellInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 267:
                        room.coverType = c1516680pZS.LJIIJJI();
                        break;
                    case 268:
                        room.reposted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 269:
                        room.repostInfo = _RepostInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 270:
                        room.dropsInfo = _DropsRoomInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 271:
                        room.enableStreamEncryption = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 272:
                        room.disableScreenRecord = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 273:
                        room.gameTagDetail = _GameTagDetail_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 274:
                        room.enableOptimizeSensitiveWord = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 275:
                        room.customTabInfo = _CustomTabInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 276:
                        room.roomLlmTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 277:
                        room.gameEmotesTab = _GameEmotesTab_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 280:
                        room.officialChannelBcToggleInfo = _BcToggleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 281:
                        room.officialChannelAnchorLiveProInfo = _LiveProInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 282:
                        room.previewCommentInfo = _PreviewCommentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 283:
                        room.ecAgeInterval = c1516680pZS.LJIIJ();
                        break;
                    case 284:
                        room.taxonomyTagInfo = _TaxonomyTagInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 285:
                        room.subTag = c1516680pZS.LJIIJJI();
                        break;
                    case 286:
                        room.liveSubOnlyTier = c1516680pZS.LJIIJJI();
                        break;
                    case 287:
                        room.liveSubOnlyMonth = c1516680pZS.LJIIJJI();
                        break;
                    case 288:
                        room.avoidConfig = _MsgNotifyComAvoidConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 289:
                        room.aigcSelfDisclosureSwitch = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 290:
                        room.ecommerceRoomTags.add(_EcommerceRoomTag_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 291:
                        room.groupLiveInfo = _GroupLiveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 292:
                        room.groupLiveSession = _GroupLiveSession_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 293:
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        MsgNotifyWatchEarlyQuota msgNotifyWatchEarlyQuotaLIZLLL = null;
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 != -1) {
                                if (iLJI5 != 1) {
                                    if (iLJI5 == 2) {
                                        msgNotifyWatchEarlyQuotaLIZLLL = _MsgNotifyWatchEarlyQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ5);
                                if (objValueOf != null) {
                                    if (msgNotifyWatchEarlyQuotaLIZLLL != null) {
                                        room.watchEarlyQuotaConfig.put((Long) objValueOf, msgNotifyWatchEarlyQuotaLIZLLL);
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
                    case 294:
                        long jLIZJ6 = c1516680pZS.LIZJ();
                        MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuotaLIZLLL = null;
                        while (true) {
                            int iLJI6 = c1516680pZS.LJI();
                            if (iLJI6 != -1) {
                                if (iLJI6 != 1) {
                                    if (iLJI6 == 2) {
                                        msgNotifyWatchContinuousQuotaLIZLLL = _MsgNotifyWatchContinuousQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ6);
                                if (objValueOf != null) {
                                    if (msgNotifyWatchContinuousQuotaLIZLLL != null) {
                                        room.continuousRoomQuotaConfig.put((Long) objValueOf, msgNotifyWatchContinuousQuotaLIZLLL);
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
                    case 295:
                        room.maxContinueWatchMillSeconds = c1516680pZS.LJIIJJI();
                        break;
                    case 296:
                        room.aiLiveSummary = _AILiveSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 297:
                        room.parallelPullStreamInfo = _ParallelPullStreamInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 298:
                        room.gameGiftGuideConfig = _GameGiftGuideKeywordsConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 299:
                        room.bizStickerList.add(_RoomSticker_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                        room.emojiList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 301:
                        room.queueInfo = _QueueInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 302:
                        room.smbInfo = _SMBInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 303:
                        room.isGame = c1516680pZS.LJIIJJI();
                        break;
                    case 304:
                        room.smbIndustryInfo = _SMBIndustryInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 305:
                        room.toolbarConfig = _ToolbarConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 306:
                        room.aiLivePreviewHighlight = _AILivePreviewHighlight_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 307:
                        room.showEmojiList = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 308:
                        room.previewCta = _PreviewCTA_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 309:
                        room.gsGuessingXtabAbParam = c1516680pZS.LJIIJJI();
                        break;
                    case 310:
                        room.noticeFcConfig = _NotifyFCConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 311:
                        room.m2GuideInfo = _M2GuideInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 312:
                        room.playTogetherExtraInfo = _PlayTogetherExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 313:
                        room.repostNote = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 314:
                        room.fypSkylightAvatarRefresh = c1516680pZS.LJIIJJI();
                        break;
                    case 315:
                        room.watchDayCntLayer = c1516680pZS.LJIIJJI();
                        break;
                    case 316:
                        room.streamSnapshot = _StreamSnapShot_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 317:
                        room.aiLivePreviewHighlightExpect = _AILivePreviewHighlight_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 318:
                        room.topFrameV2Summary = _TopFrameV2Summary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 319:
                        room.visibleScopeType = c1516680pZS.LJIIJJI();
                        break;
                    case 320:
                        room.hostBoardStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 321:
                        room.ecommerceRoomHeadTag = _EcommerceRoomHeadTag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 322:
                        room.detectAnchorLeave = c1516680pZS.LJIIJJI();
                        break;
                    case 325:
                        room.boardUsingInfo = _BoardUsingInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 326:
                        room.secretRoomAccess = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 327:
                        room.intendedDrm = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 328:
                        room.existedTtlsGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 329:
                        room.hasTtlsLivePermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 330:
                        room.smbLivePreview = _SMBLivePreview_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 331:
                        room.ttlsRoomInfo = _TTLSRoomInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 332:
                        room.hasTtlsGoods = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 333:
                        room.showWatchLiveCta = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 334:
                        room.isRepostedExpect = c1516680pZS.LJIIJJI();
                        break;
                    case 335:
                        room.aiLivePreviewHighlightExtra = _AILivePreviewHighlightExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 336:
                        room.isTag2SfvRelationPair = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 337:
                        room.interception = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 338:
                        room.quickChatInfo = _QuickChatInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 339:
                        room.roomCreateUserInfo = _RoomCreateUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 340:
                        room.nearbyInfo = _NearbyInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 341:
                        room.allEmojiList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 342:
                        room.asrSummary = _ASRSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 343:
                        room.strategyPlatformFeatures = _StrategyPlatformFeatures_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 344:
                        room.previewCardCommentBox = _PreviewCardCommentBox_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 345:
                        room.hasViewerWishesGameTricks = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 346:
                        room.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 347:
                        room.likeAggOptimizeGroup = c1516680pZS.LJIIJJI();
                        break;
                    case 348:
                        room.liveChainInfo = _LiveChain_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 349:
                        room.forbiddenCopy = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 350:
                        room.ecomRankInfo = _EcomRankInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 351:
                        room.ecomRoomType = c1516680pZS.LJIIJJI();
                        break;
                    case 352:
                        room.ecLiveHeadParams = _ECLiveHeadToLiveRoomParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 353:
                        room.smbToolInfo = _SMBToolInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 354:
                        room.isStreamLowLatency = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 355:
                        room.multiStreamNetMode = c1516680pZS.LJIIJJI();
                        break;
                    case 356:
                        room.enlargeViewInfo = _EnlargeViewInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 357:
                        room.enterNearbyInfo = _EnterNearByInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 358:
                        room.dynamicTextInfo = _PublicCommonDynamicText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 359:
                        room.fypWatchReason = _WatchReason_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 360:
                        room.innerWatchReason = _WatchReason_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 361:
                        room.enterRoomBoostExtraStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 362:
                        room.roomDiffFieldsIndex.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 363:
                        room.smbBoardId = c1516680pZS.LJIIJJI();
                        break;
                    case 364:
                        room.roomBanner = _BannerInRoomCollection_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 365:
                        room.contentSpotlightRankInfo = _ContentSpotlightRankInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 366:
                        room.streamSnapshotCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 367:
                        room.ttlsLiveType = c1516680pZS.LJIIJJI();
                        break;
                    case 368:
                        room.leadsAdsPinCard = _SubPinCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 369:
                        room.finalAnchorType = c1516680pZS.LJIIJ();
                        break;
                    case 370:
                        room.streamFeatures.add(_StreamFeature_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 371:
                        room.enableStreamTranslation = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 372:
                        room.existedCommerceGoodsTs = c1516680pZS.LJIIJJI();
                        break;
                    case 373:
                        room.addTtlsProductTs = c1516680pZS.LJIIJJI();
                        break;
                    case 374:
                        room.activityToggleInfo = _ActivityToggleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 375:
                        room.ecommerceActivityInfo = _EcommerceActivityInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 376:
                        room.watchReasonV2 = _WatchReasonV2_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                room.init();
                return room;
            }
        }
    }

    public static void LJ(Room room) {
        User user;
        ShortTouchPreviewSetting shortTouchPreviewSetting;
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        ImageModel imageModel4;
        ImageModel imageModel5;
        CompetitionInfo competitionInfo;
        CustomTabs customTabs;
        Question question;
        User user2;
        KaraokeSong karaokeSong;
        LiveEventInfo liveEventInfo;
        User user3;
        ImageModel imageModel6;
        ImageModel imageModel7;
        ImageModel imageModel8;
        Text text;
        ImageModel imageModel9;
        ImageModel imageModel10 = room.cover;
        if (imageModel10 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel10);
        }
        ImageModel imageModel11 = room.dynamicCover;
        if (imageModel11 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel11);
        }
        ImageModel imageModel12 = room.dynamicCoverLow;
        if (imageModel12 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel12);
        }
        StreamUrl streamUrl = room.streamUrl;
        if (streamUrl != null) {
            _StreamUrl_ProtoDecoder.LJ(streamUrl);
        }
        RoomLinkInfo roomLinkInfo = room.linkMicInfoGson;
        if (roomLinkInfo != null) {
            _RoomLinkInfo_ProtoDecoder.LJ(roomLinkInfo);
        }
        List<RoomDecoration> list = room.decorationList;
        if (list == null) {
            room.decorationList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RoomDecoration roomDecoration : room.decorationList) {
                if (roomDecoration != null) {
                    ImageModel imageModel13 = roomDecoration.image;
                    if (imageModel13 != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel13);
                    }
                    if (roomDecoration.inputRect == null) {
                        roomDecoration.inputRect = new ArrayList();
                    }
                }
            }
        }
        List<TopFanTicket> list2 = room.topFanTickets;
        if (list2 == null) {
            room.topFanTickets = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (TopFanTicket topFanTicket : room.topFanTickets) {
                if (topFanTicket != null && (user = topFanTicket.user) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        ImageModel imageModel14 = room.feedRoomLabel;
        if (imageModel14 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel14);
        }
        User user4 = room.owner;
        if (user4 != null) {
            _User_ProtoDecoder.LJ(user4);
        }
        RoomAuthStatus roomAuthStatus = room.mRoomAuthStatus;
        if (roomAuthStatus != null) {
            ToolBarManagement toolBarManagement = roomAuthStatus.toolbarmanagement;
            if (toolBarManagement != null && toolBarManagement.mergingmorepriority == null) {
                toolBarManagement.mergingmorepriority = new ArrayList();
            }
            RechargeCustomError rechargeCustomError = roomAuthStatus.customErrorForGiftSetting;
            if (rechargeCustomError != null) {
                _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
            }
        }
        ImageModel imageModel15 = room.background;
        if (imageModel15 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel15);
        }
        OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
        if (officialChannelInfo != null) {
            User user5 = officialChannelInfo.channelUser;
            if (user5 != null) {
                _User_ProtoDecoder.LJ(user5);
            }
            if (officialChannelInfo.delayEnterTime == null) {
                officialChannelInfo.delayEnterTime = new HashMap();
            }
        }
        if (room.linkerMap == null) {
            room.linkerMap = new HashMap();
        }
        ImageModel imageModel16 = room.streamCover;
        if (imageModel16 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel16);
        }
        LiveEventInfo liveEventInfo2 = room.liveEventInfo;
        if (liveEventInfo2 != null) {
            _LiveEventInfo_ProtoDecoder.LJ(liveEventInfo2);
        }
        Hashtag hashtag = room.hashtag;
        if (hashtag != null && (imageModel9 = hashtag.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel9);
        }
        WarningTag warningTag = room.warningTag;
        if (warningTag != null && (text = warningTag.text) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        MaskLayer maskLayer = room.maskLayer;
        if (maskLayer != null) {
            Text text2 = maskLayer.title;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
            Text text3 = maskLayer.subTitle;
            if (text3 != null) {
                _Text_ProtoDecoder.LJ(text3);
            }
        }
        List<ShortTouchItem> list3 = room.shortTouchItems;
        if (list3 == null) {
            room.shortTouchItems = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (ShortTouchItem shortTouchItem : room.shortTouchItems) {
                if (shortTouchItem != null && (shortTouchPreviewSetting = shortTouchItem.previewSetting) != null && (imageModel = shortTouchPreviewSetting.previewImage) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<LiveFilterMsgRule> list4 = room.filterRule;
        if (list4 == null) {
            room.filterRule = new ArrayList();
        } else if (!list4.isEmpty()) {
            Iterator<LiveFilterMsgRule> it2 = room.filterRule.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<FeedRoomLabel> list5 = room.feedRoomLabelList;
        if (list5 == null) {
            room.feedRoomLabelList = new ArrayList();
        } else if (!list5.isEmpty()) {
            for (FeedRoomLabel feedRoomLabel : room.feedRoomLabelList) {
                if (feedRoomLabel != null) {
                    Text text4 = feedRoomLabel.text;
                    if (text4 != null) {
                        _Text_ProtoDecoder.LJ(text4);
                    }
                    ImageModel imageModel17 = feedRoomLabel.icon;
                    if (imageModel17 != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel17);
                    }
                    ImageModel imageModel18 = feedRoomLabel.bgImage;
                    if (imageModel18 != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel18);
                    }
                }
            }
        }
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings != null) {
            MultiLiveUserApplySettings multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings;
            if (multiLiveUserApplySettings != null) {
                _MultiLiveUserApplySettings_ProtoDecoder.LJ(multiLiveUserApplySettings);
            }
            CoHost coHost = multiLiveUserSettings.coHost;
            if (coHost != null) {
                _CoHost_ProtoDecoder.LJ(coHost);
            }
        }
        List<RoomSticker> list6 = room.roomStickerList;
        if (list6 == null) {
            room.roomStickerList = new ArrayList();
        } else if (!list6.isEmpty()) {
            for (RoomSticker roomSticker : room.roomStickerList) {
                if (roomSticker != null) {
                    _RoomSticker_ProtoDecoder.LJ(roomSticker);
                }
            }
        }
        List<GameTag> list7 = room.gameTags;
        if (list7 == null) {
            room.gameTags = new ArrayList();
        } else if (!list7.isEmpty()) {
            for (GameTag gameTag : room.gameTags) {
                if (gameTag != null) {
                    _GameTag_ProtoDecoder.LJ(gameTag);
                }
            }
        }
        PollInfo pollInfo = room.advancedPollInfo;
        if (pollInfo != null) {
            PollData pollData = pollInfo.pollData;
            if (pollData != null) {
                _PollData_ProtoDecoder.LJ(pollData);
            }
            UserVoteInfo userVoteInfo = pollInfo.userVoteInfo;
            if (userVoteInfo != null) {
                _UserVoteInfo_ProtoDecoder.LJ(userVoteInfo);
            }
        }
        Skin skin = room.skin;
        if (skin != null) {
            SkinHostAccount skinHostAccount = skin.account;
            if (skinHostAccount != null && (imageModel8 = skinHostAccount.bgImage) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel8);
            }
            SkinDrawerEntrance skinDrawerEntrance = skin.drawerEntrance;
            if (skinDrawerEntrance != null && (imageModel7 = skinDrawerEntrance.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel7);
            }
        }
        ImageModel imageModel19 = room.squareCoverImg;
        if (imageModel19 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel19);
        }
        ImageModel imageModel20 = room.rectangleCoverImg;
        if (imageModel20 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel20);
        }
        PictionaryFullInfo pictionaryFullInfo = room.pictionaryFullInfo;
        if (pictionaryFullInfo != null) {
            PictionaryInfo pictionaryInfo = pictionaryFullInfo.pictionaryInfo;
            if (pictionaryInfo != null && (imageModel6 = pictionaryInfo.drawUrl) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel6);
            }
            PictionaryStatistics pictionaryStatistics = pictionaryFullInfo.pictionaryStatistics;
            if (pictionaryStatistics != null && (user3 = pictionaryStatistics.firstUser) != null) {
                _User_ProtoDecoder.LJ(user3);
            }
        }
        if (room.mIndicators == null) {
            room.mIndicators = new ArrayList();
        }
        TopFrameSummary topFrameSummary = room.topFrameSummary;
        if (topFrameSummary != null) {
            _TopFrameSummary_ProtoDecoder.LJ(topFrameSummary);
        }
        PartnershipInfo partnershipInfo = room.partnershipInfo;
        if (partnershipInfo != null) {
            _PartnershipInfo_ProtoDecoder.LJ(partnershipInfo);
        }
        List<EffectInfo> list8 = room.effectInfo;
        if (list8 == null) {
            room.effectInfo = new ArrayList();
        } else if (!list8.isEmpty()) {
            Iterator<EffectInfo> it3 = room.effectInfo.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        EventCard eventCard = room.liveEventCard;
        if (eventCard != null && (liveEventInfo = eventCard.event) != null) {
            _LiveEventInfo_ProtoDecoder.LJ(liveEventInfo);
        }
        if (room.adminEcShowPermission == null) {
            room.adminEcShowPermission = new HashMap();
        }
        ImageModel imageModel21 = room.blurredCover;
        if (imageModel21 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel21);
        }
        CaptionInfo captionInfo = room.captionInfo;
        if (captionInfo != null && captionInfo.supportLang == null) {
            captionInfo.supportLang = new ArrayList();
        }
        SubPinCard subPinCard = room.subPinCard;
        if (subPinCard != null) {
            _SubPinCard_ProtoDecoder.LJ(subPinCard);
        }
        LiveProInfo liveProInfo = room.anchorLiveProInfo;
        if (liveProInfo != null) {
            _LiveProInfo_ProtoDecoder.LJ(liveProInfo);
        }
        if (room.rankCommentGroups == null) {
            room.rankCommentGroups = new ArrayList();
        }
        StreamUrl streamUrl2 = room.multiStreamUrl;
        if (streamUrl2 != null) {
            _StreamUrl_ProtoDecoder.LJ(streamUrl2);
        }
        RegionalRestricted regionalRestricted = room.regionalRestricted;
        if (regionalRestricted != null && regionalRestricted.blockList == null) {
            regionalRestricted.blockList = new ArrayList();
        }
        KaraokeInfo karaokeInfo = room.karaokeInfo;
        if (karaokeInfo != null && (karaokeSong = karaokeInfo.song) != null) {
            _KaraokeSong_ProtoDecoder.LJ(karaokeSong);
        }
        QuickGift quickGift = room.quickGift;
        if (quickGift != null) {
            ImageModel imageModel22 = quickGift.image;
            if (imageModel22 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel22);
            }
            ImageModel imageModel23 = quickGift.greyImage;
            if (imageModel23 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel23);
            }
        }
        OnlineAudience onlineAudience = room.onlineAudience;
        if (onlineAudience != null) {
            _OnlineAudience_ProtoDecoder.LJ(onlineAudience);
        }
        List<ProtoMessageFetchResult.BaseProtoMessage> list9 = room.historyCommentList;
        if (list9 == null) {
            room.historyCommentList = new ArrayList();
        } else if (!list9.isEmpty()) {
            Iterator<ProtoMessageFetchResult.BaseProtoMessage> it4 = room.historyCommentList.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        LikeIconInfo likeIconInfo = room.likeIconInfo;
        if (likeIconInfo != null) {
            _LikeIconInfo_ProtoDecoder.LJ(likeIconInfo);
        }
        GuessWidgets guessWidgets = room.guessWidgets;
        if (guessWidgets != null) {
            _GuessWidgets_ProtoDecoder.LJ(guessWidgets);
        }
        GuessTaskPackInfo guessTaskPackInfo = room.guessTaskPackInfo;
        if (guessTaskPackInfo != null) {
            _GuessTaskPackInfo_ProtoDecoder.LJ(guessTaskPackInfo);
        }
        CurrentInteractionQuestion currentInteractionQuestion = room.currentInteractionQuestion;
        if (currentInteractionQuestion != null && (question = currentInteractionQuestion.question) != null && (user2 = question.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        EpiphronDecision epiphronDecision = room.decisions;
        if (epiphronDecision != null) {
            _EpiphronDecision_ProtoDecoder.LJ(epiphronDecision);
        }
        AggregationData aggregationData = room.aggregationData;
        if (aggregationData != null) {
            User user6 = aggregationData.audience;
            if (user6 != null) {
                _User_ProtoDecoder.LJ(user6);
            }
            if (aggregationData.successlist == null) {
                aggregationData.successlist = new ArrayList();
            }
        }
        HighlightFragmentInfo highlightFragmentInfo = room.highlightFragmentInfo;
        if (highlightFragmentInfo != null) {
            _HighlightFragmentInfo_ProtoDecoder.LJ(highlightFragmentInfo);
        }
        Map<Long, MsgNotifyQuota> map = room.quotaConfig;
        if (map == null) {
            room.quotaConfig = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, MsgNotifyQuota>> it5 = room.quotaConfig.entrySet().iterator();
            while (it5.hasNext()) {
                MsgNotifyQuota value = it5.next().getValue();
                if (value != null && value.positionCountMap == null) {
                    value.positionCountMap = new HashMap();
                }
            }
        }
        CustomTabInfo customTabInfo = room.customTabInfo;
        if (customTabInfo != null && (customTabs = customTabInfo.customTabs) != null) {
            _CustomTabs_ProtoDecoder.LJ(customTabs);
        }
        GameEmotesTab gameEmotesTab = room.gameEmotesTab;
        if (gameEmotesTab != null) {
            _GameEmotesTab_ProtoDecoder.LJ(gameEmotesTab);
        }
        LiveProInfo liveProInfo2 = room.officialChannelAnchorLiveProInfo;
        if (liveProInfo2 != null) {
            _LiveProInfo_ProtoDecoder.LJ(liveProInfo2);
        }
        PreviewCommentInfo previewCommentInfo = room.previewCommentInfo;
        if (previewCommentInfo != null) {
            _PreviewCommentInfo_ProtoDecoder.LJ(previewCommentInfo);
        }
        TaxonomyTagInfo taxonomyTagInfo = room.taxonomyTagInfo;
        if (taxonomyTagInfo != null && taxonomyTagInfo.level1Tag == null) {
            taxonomyTagInfo.level1Tag = new ArrayList();
        }
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig = room.avoidConfig;
        if (msgNotifyComAvoidConfig != null) {
            _MsgNotifyComAvoidConfig_ProtoDecoder.LJ(msgNotifyComAvoidConfig);
        }
        List<EcommerceRoomTag> list10 = room.ecommerceRoomTags;
        if (list10 == null) {
            room.ecommerceRoomTags = new ArrayList();
        } else if (!list10.isEmpty()) {
            Iterator<EcommerceRoomTag> it6 = room.ecommerceRoomTags.iterator();
            while (it6.hasNext()) {
                it6.next();
            }
        }
        GroupLiveInfo groupLiveInfo = room.groupLiveInfo;
        if (groupLiveInfo != null && (competitionInfo = groupLiveInfo.groupShow) != null) {
            _CompetitionInfo_ProtoDecoder.LJ(competitionInfo);
        }
        GroupLiveSession groupLiveSession = room.groupLiveSession;
        if (groupLiveSession != null) {
            _GroupLiveSession_ProtoDecoder.LJ(groupLiveSession);
        }
        Map<Long, MsgNotifyWatchEarlyQuota> map2 = room.watchEarlyQuotaConfig;
        if (map2 == null) {
            room.watchEarlyQuotaConfig = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, MsgNotifyWatchEarlyQuota>> it7 = room.watchEarlyQuotaConfig.entrySet().iterator();
            while (it7.hasNext()) {
                it7.next().getValue();
            }
        }
        Map<Long, MsgNotifyWatchContinuousQuota> map3 = room.continuousRoomQuotaConfig;
        if (map3 == null) {
            room.continuousRoomQuotaConfig = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, MsgNotifyWatchContinuousQuota>> it8 = room.continuousRoomQuotaConfig.entrySet().iterator();
            while (it8.hasNext()) {
                it8.next().getValue();
            }
        }
        AILiveSummary aILiveSummary = room.aiLiveSummary;
        if (aILiveSummary != null && aILiveSummary.aiSummaryList == null) {
            aILiveSummary.aiSummaryList = new ArrayList();
        }
        GameGiftGuideKeywordsConfig gameGiftGuideKeywordsConfig = room.gameGiftGuideConfig;
        if (gameGiftGuideKeywordsConfig != null) {
            _GameGiftGuideKeywordsConfig_ProtoDecoder.LJ(gameGiftGuideKeywordsConfig);
        }
        List<RoomSticker> list11 = room.bizStickerList;
        if (list11 == null) {
            room.bizStickerList = new ArrayList();
        } else if (!list11.isEmpty()) {
            for (RoomSticker roomSticker2 : room.bizStickerList) {
                if (roomSticker2 != null) {
                    _RoomSticker_ProtoDecoder.LJ(roomSticker2);
                }
            }
        }
        if (room.emojiList == null) {
            room.emojiList = new ArrayList();
        }
        SMBInfo sMBInfo = room.smbInfo;
        if (sMBInfo != null) {
            _SMBInfo_ProtoDecoder.LJ(sMBInfo);
        }
        ToolbarConfig toolbarConfig = room.toolbarConfig;
        if (toolbarConfig != null) {
            _ToolbarConfig_ProtoDecoder.LJ(toolbarConfig);
        }
        NotifyFCConfig notifyFCConfig = room.noticeFcConfig;
        if (notifyFCConfig != null) {
            _NotifyFCConfig_ProtoDecoder.LJ(notifyFCConfig);
        }
        StreamSnapShot streamSnapShot = room.streamSnapshot;
        if (streamSnapShot != null && streamSnapShot.urls == null) {
            streamSnapShot.urls = new ArrayList();
        }
        TopFrameV2Summary topFrameV2Summary = room.topFrameV2Summary;
        if (topFrameV2Summary != null) {
            _TopFrameV2Summary_ProtoDecoder.LJ(topFrameV2Summary);
        }
        EcommerceRoomHeadTag ecommerceRoomHeadTag = room.ecommerceRoomHeadTag;
        if (ecommerceRoomHeadTag != null && (imageModel5 = ecommerceRoomHeadTag.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel5);
        }
        SMBLivePreview sMBLivePreview = room.smbLivePreview;
        if (sMBLivePreview != null) {
            _SMBLivePreview_ProtoDecoder.LJ(sMBLivePreview);
        }
        QuickChatInfo quickChatInfo = room.quickChatInfo;
        if (quickChatInfo != null) {
            _QuickChatInfo_ProtoDecoder.LJ(quickChatInfo);
        }
        RoomCreateUserInfo roomCreateUserInfo = room.roomCreateUserInfo;
        if (roomCreateUserInfo != null) {
            User.OwnRoom ownRoom = roomCreateUserInfo.ownRoom;
            if (ownRoom != null && ownRoom.roomIdList == null) {
                ownRoom.roomIdList = new ArrayList();
            }
            User.FansClubInfo fansClubInfo = roomCreateUserInfo.fansClubInfo;
            if (fansClubInfo != null && (imageModel4 = fansClubInfo.badge) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel4);
            }
            SubscribeInfo subscribeInfo = roomCreateUserInfo.subscribeInfo;
            if (subscribeInfo != null) {
                _SubscribeInfo_ProtoDecoder.LJ(subscribeInfo);
            }
        }
        NearbyInfo nearbyInfo = room.nearbyInfo;
        if (nearbyInfo != null && (imageModel3 = nearbyInfo.cardCover) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        if (room.allEmojiList == null) {
            room.allEmojiList = new ArrayList();
        }
        StrategyPlatformFeatures strategyPlatformFeatures = room.strategyPlatformFeatures;
        if (strategyPlatformFeatures != null) {
            _StrategyPlatformFeatures_ProtoDecoder.LJ(strategyPlatformFeatures);
        }
        LiveChain liveChain = room.liveChainInfo;
        if (liveChain != null) {
            _LiveChain_ProtoDecoder.LJ(liveChain);
        }
        EcomRankInfo ecomRankInfo = room.ecomRankInfo;
        if (ecomRankInfo != null) {
            _EcomRankInfo_ProtoDecoder.LJ(ecomRankInfo);
        }
        PublicCommonDynamicText publicCommonDynamicText = room.dynamicTextInfo;
        if (publicCommonDynamicText != null && publicCommonDynamicText.clientStringRef == null) {
            publicCommonDynamicText.clientStringRef = new HashMap();
        }
        WatchReason watchReason = room.fypWatchReason;
        if (watchReason != null) {
            _WatchReason_ProtoDecoder.LJ(watchReason);
        }
        WatchReason watchReason2 = room.innerWatchReason;
        if (watchReason2 != null) {
            _WatchReason_ProtoDecoder.LJ(watchReason2);
        }
        if (room.roomDiffFieldsIndex == null) {
            room.roomDiffFieldsIndex = new ArrayList();
        }
        BannerInRoomCollection bannerInRoomCollection = room.roomBanner;
        if (bannerInRoomCollection != null) {
            _BannerInRoomCollection_ProtoDecoder.LJ(bannerInRoomCollection);
        }
        ContentSpotlightRankInfo contentSpotlightRankInfo = room.contentSpotlightRankInfo;
        if (contentSpotlightRankInfo != null && (imageModel2 = contentSpotlightRankInfo.scoreIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel24 = room.streamSnapshotCover;
        if (imageModel24 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel24);
        }
        SubPinCard subPinCard2 = room.leadsAdsPinCard;
        if (subPinCard2 != null) {
            _SubPinCard_ProtoDecoder.LJ(subPinCard2);
        }
        List<StreamFeature> list12 = room.streamFeatures;
        if (list12 == null) {
            room.streamFeatures = new ArrayList();
        } else if (!list12.isEmpty()) {
            Iterator<StreamFeature> it9 = room.streamFeatures.iterator();
            while (it9.hasNext()) {
                it9.next();
            }
        }
        WatchReasonV2 watchReasonV2 = room.watchReasonV2;
        if (watchReasonV2 != null) {
            _WatchReasonV2_ProtoDecoder.LJ(watchReasonV2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Room room) {
        LJ(room);
    }

    @Override // X.C0IMD
    public final Room LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final void LIZIZ(C1516680pZS c1516680pZS, Room room, List list) throws IOException {
        LJFF(c1516680pZS, room, list);
    }
}
