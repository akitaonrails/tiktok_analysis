package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WhisperMessage_ProtoDecoder implements C0IMD<WhisperMessage> {
    @Override // X.C0IMD
    public final void LIZ(WhisperMessage whisperMessage) {
        EmoteModel emoteModel;
        WhisperMessage whisperMessage2 = whisperMessage;
        CommonMessageData commonMessageData = whisperMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = whisperMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Text text = whisperMessage2.content;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel = whisperMessage2.backgroundImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        List<WhisperMessage.EmoteWithIndex> list = whisperMessage2.f316emotes;
        if (list == null) {
            whisperMessage2.f316emotes = new ArrayList();
        } else if (!list.isEmpty()) {
            for (WhisperMessage.EmoteWithIndex emoteWithIndex : whisperMessage2.f316emotes) {
                if (emoteWithIndex != null && (emoteModel = emoteWithIndex.emote) != null) {
                    _EmoteModel_ProtoDecoder.LJ(emoteModel);
                }
            }
        }
        User user2 = whisperMessage2.atUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
    }

    @Override // X.C0IMD
    public final WhisperMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        WhisperMessage whisperMessage = new WhisperMessage();
        whisperMessage.f316emotes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        whisperMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        whisperMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        whisperMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        whisperMessage.backgroundImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        whisperMessage.f316emotes.add(_WhisperMessage_EmoteWithIndex_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        whisperMessage.encodingType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        whisperMessage.atUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return whisperMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WhisperMessage whisperMessage, List list) {
    }
}
