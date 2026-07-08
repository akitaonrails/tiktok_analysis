package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ChannelInfo_ProtoDecoder implements C0IMD<ChannelInfo> {
    public static ChannelInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ChannelInfo channelInfo = new ChannelInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    channelInfo.groupChannelId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                channelInfo.innerChannelId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            channelInfo.dimension = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        channelInfo.vendor = (int) c1516680pZS.LJIIJJI();
                    }
                } else {
                    channelInfo.layout = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return channelInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final ChannelInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ChannelInfo channelInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ChannelInfo channelInfo, List list) {
    }
}
