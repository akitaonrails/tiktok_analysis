package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VirtualTicketEnvelopeInfoList_ProtoDecoder implements C0IMD<VirtualTicketEnvelopeInfoList> {
    public static VirtualTicketEnvelopeInfoList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VirtualTicketEnvelopeInfoList virtualTicketEnvelopeInfoList = new VirtualTicketEnvelopeInfoList();
        virtualTicketEnvelopeInfoList.envelopes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    virtualTicketEnvelopeInfoList.envelopes.add(_VirtualTicketEnvelopeInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return virtualTicketEnvelopeInfoList;
            }
        }
    }

    public static void LJ(VirtualTicketEnvelopeInfoList virtualTicketEnvelopeInfoList) {
        List<VirtualTicketEnvelopeInfo> list = virtualTicketEnvelopeInfoList.envelopes;
        if (list == null) {
            virtualTicketEnvelopeInfoList.envelopes = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo : virtualTicketEnvelopeInfoList.envelopes) {
            if (virtualTicketEnvelopeInfo != null) {
                ImageModel imageModel = virtualTicketEnvelopeInfo.envelopeIcon;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
                Text text = virtualTicketEnvelopeInfo.crossRoomGuide;
                if (text != null) {
                    _Text_ProtoDecoder.LJ(text);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(VirtualTicketEnvelopeInfoList virtualTicketEnvelopeInfoList) {
        LJ(virtualTicketEnvelopeInfoList);
    }

    @Override // X.C0IMD
    public final VirtualTicketEnvelopeInfoList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VirtualTicketEnvelopeInfoList virtualTicketEnvelopeInfoList, List list) {
    }
}
