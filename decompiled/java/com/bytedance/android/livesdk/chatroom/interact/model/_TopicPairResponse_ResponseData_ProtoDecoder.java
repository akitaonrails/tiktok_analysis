package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopicPairResponse_ResponseData_ProtoDecoder implements C0IMD<TopicPairResponse.ResponseData> {
    public static TopicPairResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopicPairResponse.ResponseData responseData = new TopicPairResponse.ResponseData();
        responseData.rivalAvatars = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.setting = _TopicPairResponse_ResponseData_Setting_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.rivalAvatars.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.pairId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(TopicPairResponse.ResponseData responseData) {
        List<ImageModel> list = responseData.rivalAvatars;
        if (list == null) {
            responseData.rivalAvatars = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ImageModel imageModel : responseData.rivalAvatars) {
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopicPairResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final TopicPairResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopicPairResponse.ResponseData responseData, List list) {
    }
}
