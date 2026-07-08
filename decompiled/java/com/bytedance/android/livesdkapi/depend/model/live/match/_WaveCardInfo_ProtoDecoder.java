package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WaveCardInfo_ProtoDecoder implements C0IMD<WaveCardInfo> {
    public static WaveCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WaveCardInfo waveCardInfo = new WaveCardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        waveCardInfo.cardNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        waveCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        waveCardInfo.sendTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        waveCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        waveCardInfo.effectLastDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        waveCardInfo.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        waveCardInfo.effectTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        waveCardInfo.toAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return waveCardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WaveCardInfo waveCardInfo) {
        WaveCardInfo waveCardInfo2 = waveCardInfo;
        ImageModel imageModel = waveCardInfo2.cardImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        BattleUserInfo battleUserInfo = waveCardInfo2.sendUser;
        if (battleUserInfo != null) {
            _BattleUserInfo_ProtoDecoder.LJ(battleUserInfo);
        }
    }

    @Override // X.C0IMD
    public final WaveCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WaveCardInfo waveCardInfo, List list) {
    }
}
