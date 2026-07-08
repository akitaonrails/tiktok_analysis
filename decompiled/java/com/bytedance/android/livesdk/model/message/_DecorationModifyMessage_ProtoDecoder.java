package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.DonationSticker;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdk.model._DonationSticker_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DecorationModifyMessage_ProtoDecoder implements C0IMD<DecorationModifyMessage> {
    @Override // X.C0IMD
    public final void LIZ(DecorationModifyMessage decorationModifyMessage) {
        ImageModel imageModel;
        DecorationModifyMessage decorationModifyMessage2 = decorationModifyMessage;
        CommonMessageData commonMessageData = decorationModifyMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<DonationSticker> list = decorationModifyMessage2.decorationList;
        if (list == null) {
            decorationModifyMessage2.decorationList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (DonationSticker donationSticker : decorationModifyMessage2.decorationList) {
            if (donationSticker != null) {
                ImageModel imageModel2 = donationSticker.image;
                if (imageModel2 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
                if (donationSticker.inputRect == null) {
                    donationSticker.inputRect = new ArrayList();
                }
                OrganizationModel organizationModel = donationSticker.content;
                if (organizationModel != null && (imageModel = organizationModel.icon) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final DecorationModifyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DecorationModifyMessage decorationModifyMessage = new DecorationModifyMessage();
        decorationModifyMessage.decorationList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        decorationModifyMessage.decorationList.add(_DonationSticker_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    decorationModifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return decorationModifyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DecorationModifyMessage decorationModifyMessage, List list) {
    }
}
