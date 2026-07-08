package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.PerceptionSheetInfo;
import com.bytedance.android.livesdk.message.proto._PerceptionSheetInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PerceptionMessage_ProtoDecoder implements C0IMD<PerceptionMessage> {
    public static PerceptionMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PerceptionMessage perceptionMessage = new PerceptionMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        perceptionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        perceptionMessage.dialog = _PerceptionDialogInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        perceptionMessage.publicEventInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        perceptionMessage.endTime = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        perceptionMessage.showViolation = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 6:
                        perceptionMessage.toast = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        perceptionMessage.floatStyle = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        perceptionMessage.floatText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        perceptionMessage.sheet = _PerceptionSheetInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        perceptionMessage.floatIconType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return perceptionMessage;
            }
        }
    }

    public static void LJ(PerceptionMessage perceptionMessage) {
        CommonMessageData commonMessageData = perceptionMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
        if (perceptionDialogInfo != null) {
            _PerceptionDialogInfo_ProtoDecoder.LJ(perceptionDialogInfo);
        }
        Text text = perceptionMessage.toast;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = perceptionMessage.floatText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        PerceptionSheetInfo perceptionSheetInfo = perceptionMessage.sheet;
        if (perceptionSheetInfo != null) {
            _PerceptionSheetInfo_ProtoDecoder.LJ(perceptionSheetInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PerceptionMessage perceptionMessage) {
        LJ(perceptionMessage);
    }

    @Override // X.C0IMD
    public final PerceptionMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PerceptionMessage perceptionMessage, List list) {
    }
}
