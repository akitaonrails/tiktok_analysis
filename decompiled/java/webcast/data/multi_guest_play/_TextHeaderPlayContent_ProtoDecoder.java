package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderPlayContent_ProtoDecoder implements C0IMD<TextHeaderPlayContent> {
    public static TextHeaderPlayContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderPlayContent textHeaderPlayContent = new TextHeaderPlayContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        textHeaderPlayContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 3:
                        textHeaderPlayContent.textHeaderId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        textHeaderPlayContent.status = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        textHeaderPlayContent.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        textHeaderPlayContent.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        textHeaderPlayContent.runningTextHeaderInfo = _TextHeaderRecordInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        textHeaderPlayContent.selectedTextHeaderInfo = _TextHeaderRecordInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        textHeaderPlayContent.version = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textHeaderPlayContent;
            }
        }
    }

    public static void LJ(TextHeaderPlayContent textHeaderPlayContent) {
        TextHeaderRecordInfo textHeaderRecordInfo = textHeaderPlayContent.runningTextHeaderInfo;
        TextHeaderRecordInfo textHeaderRecordInfo2 = textHeaderPlayContent.selectedTextHeaderInfo;
    }

    @Override // X.C0IMD
    public final void LIZ(TextHeaderPlayContent textHeaderPlayContent) {
        LJ(textHeaderPlayContent);
    }

    @Override // X.C0IMD
    public final TextHeaderPlayContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderPlayContent textHeaderPlayContent, List list) {
    }
}
