package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HashtagMessage_ProtoDecoder implements C0IMD<HashtagMessage> {
    @Override // X.C0IMD
    public final void LIZ(HashtagMessage hashtagMessage) {
        HashtagMessage hashtagMessage2 = hashtagMessage;
        CommonMessageData commonMessageData = hashtagMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Hashtag hashtag = hashtagMessage2.hashtag;
        if (hashtag != null) {
            _Hashtag_ProtoDecoder.LJ(hashtag);
        }
    }

    @Override // X.C0IMD
    public final HashtagMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HashtagMessage hashtagMessage = new HashtagMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        hashtagMessage.hashtag = _Hashtag_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    hashtagMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hashtagMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HashtagMessage hashtagMessage, List list) {
    }
}
