package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.linksetting._MultiLiveUpdateUserSettingContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message._LinkerAcceptNoticeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.cancel_message._LinkerCancelContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.enter_message.LinkerEnterContent;
import com.bytedance.android.livesdk.model.message.linker.enter_message._LinkerEnterContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message._LinkerInviteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.kick_out_message._LinkerKickOutContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.leave_message._LinkerLeaveContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.LinkedListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message._LinkedListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage._LinkerListChangeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mic_update._LinkerMicIdxUpdateContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mute_message._LinkerMuteContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message._LinkerRandomMatchContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import com.bytedance.android.livesdk.model.message.linker.reply_message._LinkerReplyContent_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import tikcast.linkmic.common.AnchorLayoutSetting;
import tikcast.linkmic.common._AnchorLayoutSetting_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMessage_ProtoDecoder implements C0IMD<LinkMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMessage linkMessage) {
        Text text;
        AnchorLayoutSetting anchorLayoutSetting;
        User user;
        LinkMessage linkMessage2 = linkMessage;
        CommonMessageData commonMessageData = linkMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LinkerInviteContent linkerInviteContent = linkMessage2.inviteContent;
        if (linkerInviteContent != null) {
            _LinkerInviteContent_ProtoDecoder.LJ(linkerInviteContent);
        }
        LinkerReplyContent linkerReplyContent = linkMessage2.replyContent;
        if (linkerReplyContent != null) {
            _LinkerReplyContent_ProtoDecoder.LJ(linkerReplyContent);
        }
        LinkerEnterContent linkerEnterContent = linkMessage2.enterContent;
        if (linkerEnterContent != null) {
            _LinkerEnterContent_ProtoDecoder.LJ(linkerEnterContent);
        }
        LinkedListChangeContent linkedListChangeContent = linkMessage2.linkedListChangeContent;
        if (linkedListChangeContent != null) {
            _LinkedListChangeContent_ProtoDecoder.LJ(linkedListChangeContent);
        }
        LinkerUpdateUserContent linkerUpdateUserContent = linkMessage2.updateUserContent;
        if (linkerUpdateUserContent != null && linkerUpdateUserContent.updateInfo == null) {
            linkerUpdateUserContent.updateInfo = new HashMap();
        }
        LinkerRandomMatchContent linkerRandomMatchContent = linkMessage2.randomMatchContent;
        if (linkerRandomMatchContent != null && (user = linkerRandomMatchContent.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent = linkMessage2.multiLiveUpdateUserSettingContent;
        if (multiLiveUpdateUserSettingContent != null && (anchorLayoutSetting = multiLiveUpdateUserSettingContent.anchorLayoutSetting) != null) {
            _AnchorLayoutSetting_ProtoDecoder.LJ(anchorLayoutSetting);
        }
        LinkerListChangeContent linkerListChangeContent = linkMessage2.mListChangeContent;
        if (linkerListChangeContent != null) {
            _LinkerListChangeContent_ProtoDecoder.LJ(linkerListChangeContent);
        }
        CohostListChangeContent cohostListChangeContent = linkMessage2.cohostListChangeContent;
        if (cohostListChangeContent != null) {
            _CohostListChangeContent_ProtoDecoder.LJ(cohostListChangeContent);
        }
        LinkmicUserToastContent linkmicUserToastContent = linkMessage2.userToastContent;
        if (linkmicUserToastContent != null && (text = linkmicUserToastContent.displayText) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final LinkMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMessage linkMessage = new LinkMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 101) {
                    if (iLJI != 102) {
                        switch (iLJI) {
                            case 1:
                                linkMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 2:
                                linkMessage.messageType = (int) c1516680pZS.LJIIJJI();
                                break;
                            case 3:
                                linkMessage.channelId = c1516680pZS.LJIIJJI();
                                break;
                            case 4:
                                linkMessage.scene = (int) c1516680pZS.LJIIJJI();
                                break;
                            case 5:
                                linkMessage.inviteContent = _LinkerInviteContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                linkMessage.replyContent = _LinkerReplyContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 7:
                                linkMessage.createContent = _LinkerCreateContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 8:
                                LinkerCloseContent linkerCloseContent = new LinkerCloseContent();
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                while (c1516680pZS.LJI() != -1) {
                                    C1516700pZU.LJ(c1516680pZS);
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                linkMessage.closeContent = linkerCloseContent;
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                linkMessage.enterContent = _LinkerEnterContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                linkMessage.leaveContent = _LinkerLeaveContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                linkMessage.cancelContent = _LinkerCancelContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                linkMessage.kickOutContent = _LinkerKickOutContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                linkMessage.linkedListChangeContent = _LinkedListChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 14:
                                linkMessage.updateUserContent = _LinkerUpdateUserContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 15:
                                LinkerWaitingListChangeContent linkerWaitingListChangeContent = new LinkerWaitingListChangeContent();
                                long jLIZJ3 = c1516680pZS.LIZJ();
                                while (c1516680pZS.LJI() != -1) {
                                    C1516700pZU.LJ(c1516680pZS);
                                }
                                c1516680pZS.LJ(jLIZJ3);
                                linkMessage.waitingListChangeContent = linkerWaitingListChangeContent;
                                break;
                            case 16:
                                linkMessage.muteContent = _LinkerMuteContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                linkMessage.randomMatchContent = _LinkerRandomMatchContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                linkMessage.multiLiveUpdateUserSettingContent = _MultiLiveUpdateUserSettingContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 19:
                                linkMessage.micIdxUpdateContent = _LinkerMicIdxUpdateContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                linkMessage.mListChangeContent = _LinkerListChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 21:
                                linkMessage.cohostListChangeContent = _CohostListChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 22:
                                linkMessage.mediaChangeContent = _LinkerMediaChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 23:
                                linkMessage.acceptNoticeContentMessage = _LinkerAcceptNoticeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                switch (iLJI) {
                                    case 200:
                                        linkMessage.extraStr = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 201:
                                        linkMessage.expireTimestamp = c1516680pZS.LJIIJJI();
                                        break;
                                    case 202:
                                        linkMessage.transferExtra = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 203:
                                        linkMessage.version = c1516680pZS.LJIIJJI();
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                                break;
                        }
                    } else {
                        linkMessage.userToastContent = _LinkmicUserToastContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkMessage.sysKickOutContent = _LinkerSysKickOutContent_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMessage linkMessage, List list) {
    }
}
