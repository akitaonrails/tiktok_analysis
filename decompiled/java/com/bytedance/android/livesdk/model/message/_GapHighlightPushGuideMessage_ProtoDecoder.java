package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GapHighlightPushGuideMessage_ProtoDecoder implements C0IMD<GapHighlightPushGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(GapHighlightPushGuideMessage gapHighlightPushGuideMessage) {
        GapHighlightPushGuideMessage gapHighlightPushGuideMessage2 = gapHighlightPushGuideMessage;
        List<LiveFragment> list = gapHighlightPushGuideMessage2.fragments;
        if (list == null) {
            gapHighlightPushGuideMessage2.fragments = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LiveFragment> it2 = gapHighlightPushGuideMessage2.fragments.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        Text text = gapHighlightPushGuideMessage2.mainTitle;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = gapHighlightPushGuideMessage2.subTitle;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        CommonMessageData commonMessageData = gapHighlightPushGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GapHighlightPushGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GapHighlightPushGuideMessage gapHighlightPushGuideMessage = new GapHighlightPushGuideMessage();
        gapHighlightPushGuideMessage.fragments = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            gapHighlightPushGuideMessage.fragments.add(_LiveFragment_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 2:
                            gapHighlightPushGuideMessage.autocutsWindowStartTs = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            gapHighlightPushGuideMessage.autocutsWindowEndTs = c1516680pZS.LJIIJJI();
                            break;
                        case 4:
                            gapHighlightPushGuideMessage.mainTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            gapHighlightPushGuideMessage.subTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            gapHighlightPushGuideMessage.isGameRoom = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 7:
                            gapHighlightPushGuideMessage.autoPostSwitchStatus = c1516680pZS.LJIIJJI();
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    gapHighlightPushGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gapHighlightPushGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GapHighlightPushGuideMessage gapHighlightPushGuideMessage, List list) {
    }
}
