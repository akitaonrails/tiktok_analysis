package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SmokeCardInfo_ProtoDecoder implements C0IMD<SmokeCardInfo> {
    public static SmokeCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SmokeCardInfo smokeCardInfo = new SmokeCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 12) {
                    if (iLJI != 13) {
                        switch (iLJI) {
                            case 1:
                                smokeCardInfo.cardNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 2:
                                smokeCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                smokeCardInfo.sendTimeSec = c1516680pZS.LJIIJJI();
                                break;
                            case 4:
                                smokeCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 5:
                                smokeCardInfo.effectLastDuration = c1516680pZS.LJIIJJI();
                                break;
                            case 6:
                                smokeCardInfo.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 7:
                                smokeCardInfo.effectTimeSec = c1516680pZS.LJIIJJI();
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        smokeCardInfo.toAnchorIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    smokeCardInfo.toAnchorId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return smokeCardInfo;
            }
        }
    }

    public static void LJ(SmokeCardInfo smokeCardInfo) {
        ImageModel imageModel = smokeCardInfo.cardImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        BattleUserInfo battleUserInfo = smokeCardInfo.sendUser;
        if (battleUserInfo != null) {
            _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SmokeCardInfo smokeCardInfo) {
        LJ(smokeCardInfo);
    }

    @Override // X.C0IMD
    public final SmokeCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SmokeCardInfo smokeCardInfo, List list) {
    }
}
