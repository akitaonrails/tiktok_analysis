package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProfileExtraGameInteractionStorage_ProtoDecoder implements C0IMD<ProfileExtraGameInteractionStorage> {
    public static ProfileExtraGameInteractionStorage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProfileExtraGameInteractionStorage profileExtraGameInteractionStorage = new ProfileExtraGameInteractionStorage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        profileExtraGameInteractionStorage.templateId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    profileExtraGameInteractionStorage.gameId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return profileExtraGameInteractionStorage;
            }
        }
    }

    @Override // X.C0IMD
    public final ProfileExtraGameInteractionStorage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ProfileExtraGameInteractionStorage profileExtraGameInteractionStorage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProfileExtraGameInteractionStorage profileExtraGameInteractionStorage, List list) {
    }
}
