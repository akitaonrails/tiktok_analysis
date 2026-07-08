package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.OnlineAudience;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OnlineAudience_DisplayConfig_ProtoDecoder implements C0IMD<OnlineAudience.DisplayConfig> {
    public static OnlineAudience.DisplayConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OnlineAudience.DisplayConfig displayConfig = new OnlineAudience.DisplayConfig();
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
                                    displayConfig.showScore = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                displayConfig.avatarCount = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            displayConfig.showAvatarList = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        displayConfig.canPanelClick = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    displayConfig.showOnlinePanel = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return displayConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final OnlineAudience.DisplayConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(OnlineAudience.DisplayConfig displayConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OnlineAudience.DisplayConfig displayConfig, List list) {
    }
}
