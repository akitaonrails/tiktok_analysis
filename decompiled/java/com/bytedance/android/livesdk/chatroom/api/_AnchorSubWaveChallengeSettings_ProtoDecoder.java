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
public final class _AnchorSubWaveChallengeSettings_ProtoDecoder implements C0IMD<AnchorSubWaveChallengeSettings> {
    public static AnchorSubWaveChallengeSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorSubWaveChallengeSettings anchorSubWaveChallengeSettings = new AnchorSubWaveChallengeSettings();
        anchorSubWaveChallengeSettings.emoteList = new ArrayList();
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
                                    anchorSubWaveChallengeSettings.emoteList.add(_EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                anchorSubWaveChallengeSettings.duringTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            anchorSubWaveChallengeSettings.needSubCounts = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        anchorSubWaveChallengeSettings.name = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorSubWaveChallengeSettings.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorSubWaveChallengeSettings;
            }
        }
    }

    public static void LJ(AnchorSubWaveChallengeSettings anchorSubWaveChallengeSettings) {
        List<EmoteModel> list = anchorSubWaveChallengeSettings.emoteList;
        if (list == null) {
            anchorSubWaveChallengeSettings.emoteList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EmoteModel emoteModel : anchorSubWaveChallengeSettings.emoteList) {
            if (emoteModel != null) {
                _EmoteModel_ProtoDecoder.LJ(emoteModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorSubWaveChallengeSettings anchorSubWaveChallengeSettings) {
        LJ(anchorSubWaveChallengeSettings);
    }

    @Override // X.C0IMD
    public final AnchorSubWaveChallengeSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorSubWaveChallengeSettings anchorSubWaveChallengeSettings, List list) {
    }
}
