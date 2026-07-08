package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProfileExtraGameInteractionExternal_ProtoDecoder implements C0IMD<ProfileExtraGameInteractionExternal> {
    public static ProfileExtraGameInteractionExternal LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProfileExtraGameInteractionExternal profileExtraGameInteractionExternal = new ProfileExtraGameInteractionExternal();
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
                                profileExtraGameInteractionExternal.gameTagId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            profileExtraGameInteractionExternal.gameIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        profileExtraGameInteractionExternal.gameNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    profileExtraGameInteractionExternal.gameName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return profileExtraGameInteractionExternal;
            }
        }
    }

    @Override // X.C0IMD
    public final ProfileExtraGameInteractionExternal LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ProfileExtraGameInteractionExternal profileExtraGameInteractionExternal) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProfileExtraGameInteractionExternal profileExtraGameInteractionExternal, List list) {
    }
}
