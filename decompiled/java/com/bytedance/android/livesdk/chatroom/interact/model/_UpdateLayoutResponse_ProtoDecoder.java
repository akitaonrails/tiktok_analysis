package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.UpdateLayoutResponse;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateLayoutResponse_ProtoDecoder implements C0IMD<UpdateLayoutResponse> {
    @Override // X.C0IMD
    public final void LIZ(UpdateLayoutResponse updateLayoutResponse) {
        LayoutData layoutData;
        UpdateLayoutResponse.ResponseData responseData = updateLayoutResponse.data;
        if (responseData != null && (layoutData = responseData.crossRoomLayout) != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
    }

    @Override // X.C0IMD
    public final UpdateLayoutResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateLayoutResponse updateLayoutResponse = new UpdateLayoutResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    updateLayoutResponse.data = _UpdateLayoutResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateLayoutResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateLayoutResponse updateLayoutResponse, List list) {
    }
}
