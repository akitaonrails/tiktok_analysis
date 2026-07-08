package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AudienceReserveUserStateMessage_ProtoDecoder implements C0IMD<AudienceReserveUserStateMessage> {
    @Override // X.C0IMD
    public final void LIZ(AudienceReserveUserStateMessage audienceReserveUserStateMessage) {
        User user;
        User user2;
        AudienceReserveUserStateMessage audienceReserveUserStateMessage2 = audienceReserveUserStateMessage;
        CommonMessageData commonMessageData = audienceReserveUserStateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        AudienceReserveContent audienceReserveContent = audienceReserveUserStateMessage2.audienceReserveContent;
        if (audienceReserveContent != null && (user2 = audienceReserveContent.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        AudienceCancelContent audienceCancelContent = audienceReserveUserStateMessage2.audienceCancelContent;
        if (audienceCancelContent != null && (user = audienceCancelContent.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final AudienceReserveUserStateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AudienceReserveUserStateMessage audienceReserveUserStateMessage = new AudienceReserveUserStateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                switch (iLJI) {
                                    case 100:
                                        audienceReserveUserStateMessage.audienceReserveContent = _AudienceReserveContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 101:
                                        audienceReserveUserStateMessage.audienceCancelContent = _AudienceCancelContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 102:
                                        audienceReserveUserStateMessage.audienceReplyContent = _AudienceReplyContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 103:
                                        audienceReserveUserStateMessage.audienceRejectContent = _AudienceRejectContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                audienceReserveUserStateMessage.audienceReserveUserInfo = _AudienceReserveUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            audienceReserveUserStateMessage.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        audienceReserveUserStateMessage.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    audienceReserveUserStateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audienceReserveUserStateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AudienceReserveUserStateMessage audienceReserveUserStateMessage, List list) {
    }
}
