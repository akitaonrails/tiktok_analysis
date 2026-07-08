package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AutoMatchResp_ResponseData_ProtoDecoder implements C0IMD<AutoMatchResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(AutoMatchResp.ResponseData responseData) {
        AutoMatchResp.ResponseData responseData2 = responseData;
        List<ImageModel> list = responseData2.avatars;
        if (list == null) {
            responseData2.avatars = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ImageModel imageModel : responseData2.avatars) {
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final AutoMatchResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AutoMatchResp.ResponseData responseData = new AutoMatchResp.ResponseData();
        responseData.avatars = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.sessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.avatars.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.settings = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AutoMatchResp.ResponseData responseData, List list) {
    }
}
