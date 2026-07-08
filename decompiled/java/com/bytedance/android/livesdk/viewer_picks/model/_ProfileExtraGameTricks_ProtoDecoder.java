package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProfileExtraGameTricks_ProtoDecoder implements C0IMD<ProfileExtraGameTricks> {
    public static ProfileExtraGameTricks LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProfileExtraGameTricks profileExtraGameTricks = new ProfileExtraGameTricks();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        profileExtraGameTricks.external = _ProfileExtraGameTricksExternal_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    profileExtraGameTricks.storage = _ProfileExtraGameTricksStorage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return profileExtraGameTricks;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ProfileExtraGameTricks profileExtraGameTricks) {
        GameTricksShortcut gameTricksShortcut;
        ProfileExtraGameTricksStorage profileExtraGameTricksStorage = profileExtraGameTricks.storage;
        if (profileExtraGameTricksStorage != null && (gameTricksShortcut = profileExtraGameTricksStorage.gameTricksShortcut) != null) {
            _GameTricksShortcut_ProtoDecoder.LJ(gameTricksShortcut);
        }
    }

    @Override // X.C0IMD
    public final ProfileExtraGameTricks LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProfileExtraGameTricks profileExtraGameTricks, List list) {
    }
}
