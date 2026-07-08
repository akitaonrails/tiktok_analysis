package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestSuggestMessage_ProtoDecoder implements C0IMD<MultiGuestSuggestMessage> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestSuggestMessage multiGuestSuggestMessage) {
        MultiGuestSuggestMessage multiGuestSuggestMessage2 = multiGuestSuggestMessage;
        CommonMessageData commonMessageData = multiGuestSuggestMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<ImageModel> list = multiGuestSuggestMessage2.suggestedImage;
        if (list == null) {
            multiGuestSuggestMessage2.suggestedImage = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ImageModel imageModel : multiGuestSuggestMessage2.suggestedImage) {
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestSuggestMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestSuggestMessage multiGuestSuggestMessage = new MultiGuestSuggestMessage();
        multiGuestSuggestMessage.suggestedImage = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        multiGuestSuggestMessage.suggestedImage.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    multiGuestSuggestMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestSuggestMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestSuggestMessage multiGuestSuggestMessage, List list) {
    }
}
