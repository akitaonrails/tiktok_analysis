package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import com.bytedance.android.live.base.model.emoji._EmoteWithIndex_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data._MsgFilter_ProtoDecoder;
import webcast.data._UserIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ChatMessage_ProtoDecoder implements C0IMD<ChatMessage> {
    public static ChatMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.commentQualityScores = new ArrayList();
        chatMessage.commentLabelScores = new ArrayList();
        chatMessage.mentionUserList = new ArrayList();
        chatMessage.commentTag = new ArrayList();
        chatMessage.mentionUsers = new ArrayList();
        chatMessage.f314emotes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        chatMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        chatMessage.userInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        chatMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        chatMessage.visibleToSender = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        chatMessage.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        chatMessage.fullScreenTextColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        chatMessage.backgroundImageV2 = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        chatMessage.publicAreaCommon = _PublicAreaCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        chatMessage.giftImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        chatMessage.inputType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        chatMessage.atUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        chatMessage.f314emotes.add(_EmoteWithIndex_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 14:
                        chatMessage.contentLanguage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        chatMessage.msgFilter = _MsgFilter_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        chatMessage.quickChatScene = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        chatMessage.communityflaggedStatus = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        chatMessage.userIdentity = _UserIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        chatMessage.commentQualityScores.add(_CommentQualityScore_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        chatMessage.commentTag.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case 21:
                        chatMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        chatMessage.screenTime = c1516680pZS.LJIIJJI();
                        break;
                    case 23:
                        chatMessage.signature = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        chatMessage.signatureVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 25:
                        chatMessage.ecStreamerKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        chatMessage.commentLabelScores.add(_CommentLabelScore_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 27:
                        chatMessage.mentionUserList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 28:
                        chatMessage.mentionUsers.add(_User_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 29:
                        chatMessage.isOnCommentTray = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return chatMessage;
            }
        }
    }

    public static void LJ(ChatMessage chatMessage) {
        EmoteModel emoteModel;
        ImageModel imageModel;
        CommonMessageData commonMessageData = chatMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = chatMessage.userInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        ImageModel imageModel2 = chatMessage.background;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = chatMessage.backgroundImageV2;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        PublicAreaCommon publicAreaCommon = chatMessage.publicAreaCommon;
        if (publicAreaCommon != null && (imageModel = publicAreaCommon.userLabel) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel4 = chatMessage.giftImage;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        User user2 = chatMessage.atUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        List<EmoteWithIndex> list = chatMessage.f314emotes;
        if (list == null) {
            chatMessage.f314emotes = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EmoteWithIndex emoteWithIndex : chatMessage.f314emotes) {
                if (emoteWithIndex != null && (emoteModel = emoteWithIndex.emoteModel) != null) {
                    _EmoteModel_ProtoDecoder.LJ(emoteModel);
                }
            }
        }
        List<CommentQualityScore> list2 = chatMessage.commentQualityScores;
        if (list2 == null) {
            chatMessage.commentQualityScores = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<CommentQualityScore> it2 = chatMessage.commentQualityScores.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (chatMessage.commentTag == null) {
            chatMessage.commentTag = new ArrayList();
        }
        PublicAreaMessageCommon publicAreaMessageCommon = chatMessage.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
        List<CommentLabelScore> list3 = chatMessage.commentLabelScores;
        if (list3 == null) {
            chatMessage.commentLabelScores = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<CommentLabelScore> it3 = chatMessage.commentLabelScores.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        if (chatMessage.mentionUserList == null) {
            chatMessage.mentionUserList = new ArrayList();
        }
        List<User> list4 = chatMessage.mentionUsers;
        if (list4 == null) {
            chatMessage.mentionUsers = new ArrayList();
            return;
        }
        if (list4.isEmpty()) {
            return;
        }
        for (User user3 : chatMessage.mentionUsers) {
            if (user3 != null) {
                _User_ProtoDecoder.LJ(user3);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ChatMessage chatMessage) {
        LJ(chatMessage);
    }

    @Override // X.C0IMD
    public final ChatMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ChatMessage chatMessage, List list) {
    }
}
