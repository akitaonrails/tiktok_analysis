package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubWaveStrikeInfo_ProtoDecoder implements C0IMD<SubWaveStrikeInfo> {
    public static SubWaveStrikeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubWaveStrikeInfo subWaveStrikeInfo = new SubWaveStrikeInfo();
        subWaveStrikeInfo.emoteList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subWaveStrikeInfo.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        subWaveStrikeInfo.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        subWaveStrikeInfo.round = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        subWaveStrikeInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        subWaveStrikeInfo.emoteList.add(_EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        subWaveStrikeInfo.strikeReward = _WaveReward_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        subWaveStrikeInfo.strikeRecordId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        subWaveStrikeInfo.strikeTargetCount = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subWaveStrikeInfo;
            }
        }
    }

    public static void LJ(SubWaveStrikeInfo subWaveStrikeInfo) {
        List<EmoteModel> list = subWaveStrikeInfo.emoteList;
        if (list == null) {
            subWaveStrikeInfo.emoteList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EmoteModel emoteModel : subWaveStrikeInfo.emoteList) {
                if (emoteModel != null) {
                    _EmoteModel_ProtoDecoder.LJ(emoteModel);
                }
            }
        }
        WaveReward waveReward = subWaveStrikeInfo.strikeReward;
        if (waveReward != null) {
            _WaveReward_ProtoDecoder.LJ(waveReward);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubWaveStrikeInfo subWaveStrikeInfo) {
        LJ(subWaveStrikeInfo);
    }

    @Override // X.C0IMD
    public final SubWaveStrikeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubWaveStrikeInfo subWaveStrikeInfo, List list) {
    }
}
