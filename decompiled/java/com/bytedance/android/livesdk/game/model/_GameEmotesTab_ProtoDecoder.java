package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import emotes.model.EmoteListResult;
import emotes.model._EmoteListResult_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameEmotesTab_ProtoDecoder implements C0IMD<GameEmotesTab> {
    public static GameEmotesTab LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameEmotesTab gameEmotesTab = new GameEmotesTab();
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
                                gameEmotesTab.unusableGuessingEmotes = _EmoteListResult_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            gameEmotesTab.usableGuessingEmotes = _EmoteListResult_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameEmotesTab.gameEmoteConfig = _GameEmoteConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameEmotesTab.canUseGuessingEmotes = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameEmotesTab;
            }
        }
    }

    public static void LJ(GameEmotesTab gameEmotesTab) {
        EmoteListResult emoteListResult = gameEmotesTab.usableGuessingEmotes;
        if (emoteListResult != null) {
            _EmoteListResult_ProtoDecoder.LJ(emoteListResult);
        }
        EmoteListResult emoteListResult2 = gameEmotesTab.unusableGuessingEmotes;
        if (emoteListResult2 != null) {
            _EmoteListResult_ProtoDecoder.LJ(emoteListResult2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameEmotesTab gameEmotesTab) {
        LJ(gameEmotesTab);
    }

    @Override // X.C0IMD
    public final GameEmotesTab LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameEmotesTab gameEmotesTab, List list) {
    }
}
