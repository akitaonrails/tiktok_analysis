package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play._TextHeaderPlayContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderMessage_ProtoDecoder implements C0IMD<TextHeaderMessage> {
    @Override // X.C0IMD
    public final void LIZ(TextHeaderMessage textHeaderMessage) {
        TextHeaderMessage textHeaderMessage2 = textHeaderMessage;
        CommonMessageData commonMessageData = textHeaderMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        TextHeaderPlayContent textHeaderPlayContent = textHeaderMessage2.textHeaderPlayContent;
        if (textHeaderPlayContent != null) {
            _TextHeaderPlayContent_ProtoDecoder.LJ(textHeaderPlayContent);
        }
    }

    @Override // X.C0IMD
    public final TextHeaderMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderMessage textHeaderMessage = new TextHeaderMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            textHeaderMessage.textHeaderPlayContent = _TextHeaderPlayContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        textHeaderMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    textHeaderMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textHeaderMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderMessage textHeaderMessage, List list) {
    }
}
