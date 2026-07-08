package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TranscodeInfo_ProtoDecoder implements C0IMD<TranscodeInfo> {
    public static TranscodeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TranscodeInfo transcodeInfo = new TranscodeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                transcodeInfo.videoMeta = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            transcodeInfo.failReason = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        transcodeInfo.estimatedSize = c1516680pZS.LJIIJJI();
                    }
                } else {
                    transcodeInfo.transcodeStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return transcodeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TranscodeInfo transcodeInfo) {
    }

    @Override // X.C0IMD
    public final TranscodeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TranscodeInfo transcodeInfo, List list) {
    }
}
