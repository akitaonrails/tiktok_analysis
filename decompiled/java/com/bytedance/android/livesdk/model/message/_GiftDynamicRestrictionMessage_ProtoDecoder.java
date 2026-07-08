package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.DynamicRestriction;
import com.bytedance.android.livesdk.gift.model._DynamicRestriction_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftDynamicRestrictionMessage_ProtoDecoder implements C0IMD<GiftDynamicRestrictionMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftDynamicRestrictionMessage giftDynamicRestrictionMessage) {
        GiftDynamicRestrictionMessage giftDynamicRestrictionMessage2 = giftDynamicRestrictionMessage;
        CommonMessageData commonMessageData = giftDynamicRestrictionMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        DynamicRestriction dynamicRestriction = giftDynamicRestrictionMessage2.dynamicRestriction;
        if (dynamicRestriction != null) {
            _DynamicRestriction_ProtoDecoder.LJ(dynamicRestriction);
        }
    }

    @Override // X.C0IMD
    public final GiftDynamicRestrictionMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftDynamicRestrictionMessage giftDynamicRestrictionMessage = new GiftDynamicRestrictionMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftDynamicRestrictionMessage.dynamicRestriction = _DynamicRestriction_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftDynamicRestrictionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftDynamicRestrictionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftDynamicRestrictionMessage giftDynamicRestrictionMessage, List list) {
    }
}
