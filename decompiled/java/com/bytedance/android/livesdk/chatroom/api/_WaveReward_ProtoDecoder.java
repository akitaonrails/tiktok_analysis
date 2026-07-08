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
public final class _WaveReward_ProtoDecoder implements C0IMD<WaveReward> {
    public static WaveReward LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WaveReward waveReward = new WaveReward();
        waveReward.f298emotes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        waveReward.f298emotes.add(_EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    waveReward.emote = _EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return waveReward;
            }
        }
    }

    public static void LJ(WaveReward waveReward) {
        EmoteModel emoteModel = waveReward.emote;
        if (emoteModel != null) {
            _EmoteModel_ProtoDecoder.LJ(emoteModel);
        }
        List<EmoteModel> list = waveReward.f298emotes;
        if (list == null) {
            waveReward.f298emotes = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EmoteModel emoteModel2 : waveReward.f298emotes) {
            if (emoteModel2 != null) {
                _EmoteModel_ProtoDecoder.LJ(emoteModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WaveReward waveReward) {
        LJ(waveReward);
    }

    @Override // X.C0IMD
    public final WaveReward LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WaveReward waveReward, List list) {
    }
}
