package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PinMessage_ProtoDecoder implements C0IMD<PinMessage> {
    @Override // X.C0IMD
    public final void LIZ(PinMessage pinMessage) {
        PinMessage pinMessage2 = pinMessage;
        CommonMessageData commonMessageData = pinMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ChatMessage chatMessage = pinMessage2.chatMessage;
        if (chatMessage != null) {
            _ChatMessage_ProtoDecoder.LJ(chatMessage);
        }
        SocialMessage socialMessage = pinMessage2.socialMessage;
        if (socialMessage != null) {
            CommonMessageData commonMessageData2 = socialMessage.baseMessage;
            if (commonMessageData2 != null) {
                _CommonMessageData_ProtoDecoder.LJ(commonMessageData2);
            }
            User user = socialMessage.user;
            if (user != null) {
                _User_ProtoDecoder.LJ(user);
            }
            PublicAreaMessageCommon publicAreaMessageCommon = socialMessage.publicAreaMessageCommon;
            if (publicAreaMessageCommon != null) {
                _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
            }
        }
        GiftMessage giftMessage = pinMessage2.giftMessage;
        if (giftMessage != null) {
            _GiftMessage_ProtoDecoder.LJ(giftMessage);
        }
        User user2 = pinMessage2.operator;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
    }

    @Override // X.C0IMD
    public final PinMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PinMessage pinMessage = new PinMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                switch (iLJI) {
                                    case 30:
                                        pinMessage.method = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 31:
                                        pinMessage.pinTime = c1516680pZS.LJIIJJI();
                                        break;
                                    case 32:
                                        pinMessage.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                        pinMessage.action = c1516680pZS.LJIIJ();
                                        break;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                        pinMessage.displayDuration = c1516680pZS.LJIIJJI();
                                        break;
                                    case 35:
                                        pinMessage.pinId = c1516680pZS.LJIIJJI();
                                        break;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                        pinMessage.ecStreamerKey = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                pinMessage.giftMessage = _GiftMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            pinMessage.socialMessage = _SocialMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        pinMessage.chatMessage = _ChatMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    pinMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pinMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PinMessage pinMessage, List list) {
    }
}
