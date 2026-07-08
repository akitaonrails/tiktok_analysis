package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubWaveImMsg_ProtoDecoder implements C0IMD<SubWaveImMsg> {
    public static SubWaveImMsg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubWaveImMsg subWaveImMsg = new SubWaveImMsg();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subWaveImMsg.msgType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        subWaveImMsg.newComeSubscriberInfo = _SubWaveSubscriberInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        subWaveImMsg.subWaveInfoCommon = _SubWaveInfoCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        subWaveImMsg.waveReward = _WaveReward_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        subWaveImMsg.currentStrikeRound = _SubWaveStrikeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        subWaveImMsg.strikeEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subWaveImMsg;
            }
        }
    }

    public static void LJ(SubWaveImMsg subWaveImMsg) {
        SubWaveSubscriberInfo subWaveSubscriberInfo = subWaveImMsg.newComeSubscriberInfo;
        if (subWaveSubscriberInfo != null) {
            _SubWaveSubscriberInfo_ProtoDecoder.LJ(subWaveSubscriberInfo);
        }
        SubWaveInfoCommon subWaveInfoCommon = subWaveImMsg.subWaveInfoCommon;
        if (subWaveInfoCommon != null) {
            _SubWaveInfoCommon_ProtoDecoder.LJ(subWaveInfoCommon);
        }
        WaveReward waveReward = subWaveImMsg.waveReward;
        if (waveReward != null) {
            _WaveReward_ProtoDecoder.LJ(waveReward);
        }
        SubWaveStrikeInfo subWaveStrikeInfo = subWaveImMsg.currentStrikeRound;
        if (subWaveStrikeInfo != null) {
            _SubWaveStrikeInfo_ProtoDecoder.LJ(subWaveStrikeInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubWaveImMsg subWaveImMsg) {
        LJ(subWaveImMsg);
    }

    @Override // X.C0IMD
    public final SubWaveImMsg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubWaveImMsg subWaveImMsg, List list) {
    }
}
