package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ModeratorSpeakerMessage_ProtoDecoder implements C0IMD<ModeratorSpeakerMessage> {
    @Override // X.C0IMD
    public final void LIZ(ModeratorSpeakerMessage moderatorSpeakerMessage) {
        CommonMessageData commonMessageData = moderatorSpeakerMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final ModeratorSpeakerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ModeratorSpeakerMessage moderatorSpeakerMessage = new ModeratorSpeakerMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    moderatorSpeakerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return moderatorSpeakerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ModeratorSpeakerMessage moderatorSpeakerMessage, List list) {
    }
}
