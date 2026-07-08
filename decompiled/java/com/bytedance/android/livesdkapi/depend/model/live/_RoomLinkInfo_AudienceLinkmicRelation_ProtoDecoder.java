package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomLinkInfo_AudienceLinkmicRelation_ProtoDecoder implements C0IMD<RoomLinkInfo.AudienceLinkmicRelation> {
    public static RoomLinkInfo.AudienceLinkmicRelation LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomLinkInfo.AudienceLinkmicRelation audienceLinkmicRelation = new RoomLinkInfo.AudienceLinkmicRelation();
        audienceLinkmicRelation.relationMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    Long lValueOf2 = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (lValueOf2 != null) {
                            audienceLinkmicRelation.relationMap.put(lValueOf, lValueOf2);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audienceLinkmicRelation;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomLinkInfo.AudienceLinkmicRelation audienceLinkmicRelation) {
        RoomLinkInfo.AudienceLinkmicRelation audienceLinkmicRelation2 = audienceLinkmicRelation;
        if (audienceLinkmicRelation2.relationMap == null) {
            audienceLinkmicRelation2.relationMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final RoomLinkInfo.AudienceLinkmicRelation LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomLinkInfo.AudienceLinkmicRelation audienceLinkmicRelation, List list) {
    }
}
