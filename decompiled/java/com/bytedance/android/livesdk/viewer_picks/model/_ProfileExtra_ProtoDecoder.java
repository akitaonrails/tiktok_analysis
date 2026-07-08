package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProfileExtra_ProtoDecoder implements C0IMD<ProfileExtra> {
    public static ProfileExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProfileExtra profileExtra = new ProfileExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        profileExtra.gameInteraction = _ProfileExtraGameInteraction_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    profileExtra.gameTricks = _ProfileExtraGameTricks_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return profileExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ProfileExtra profileExtra) {
        ProfileExtraGameTricksStorage profileExtraGameTricksStorage;
        GameTricksShortcut gameTricksShortcut;
        ProfileExtraGameTricks profileExtraGameTricks = profileExtra.gameTricks;
        if (profileExtraGameTricks != null && (profileExtraGameTricksStorage = profileExtraGameTricks.storage) != null && (gameTricksShortcut = profileExtraGameTricksStorage.gameTricksShortcut) != null) {
            _GameTricksShortcut_ProtoDecoder.LJ(gameTricksShortcut);
        }
    }

    @Override // X.C0IMD
    public final ProfileExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProfileExtra profileExtra, List list) {
    }
}
