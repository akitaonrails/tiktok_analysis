package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinChannelResponse_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinChannelResp_ProtoDecoder implements C0IMD<JoinChannelResp> {
    @Override // X.C0IMD
    public final void LIZ(JoinChannelResp joinChannelResp) {
        LinkMicCommonResp linkMicCommonResp = joinChannelResp.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final JoinChannelResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        JoinChannelResp joinChannelResp = new JoinChannelResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 9527) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            joinChannelResp.multiGuestRespExtra = _BizJoinChannelResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        joinChannelResp.linkLayerListUser = _LinkLayerListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    joinChannelResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinChannelResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinChannelResp joinChannelResp, List list) {
    }
}
