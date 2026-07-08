package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchThemeDisplayResource_ProtoDecoder implements C0IMD<MatchThemeDisplayResource> {
    public static MatchThemeDisplayResource LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchThemeDisplayResource matchThemeDisplayResource = new MatchThemeDisplayResource();
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
                                matchThemeDisplayResource.matchInvitePanelConfig = _MatchInvitePanelConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            matchThemeDisplayResource.matchTitleBarConfig = _MatchTitleBarConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        matchThemeDisplayResource.matchOpeningAnimationConfig = _MatchOpeningAnimationConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    matchThemeDisplayResource.matchTheme = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchThemeDisplayResource;
            }
        }
    }

    public static void LJ(MatchThemeDisplayResource matchThemeDisplayResource) {
        MatchTitleBarConfig matchTitleBarConfig = matchThemeDisplayResource.matchTitleBarConfig;
        if (matchTitleBarConfig != null) {
            _MatchTitleBarConfig_ProtoDecoder.LJ(matchTitleBarConfig);
        }
        MatchInvitePanelConfig matchInvitePanelConfig = matchThemeDisplayResource.matchInvitePanelConfig;
        if (matchInvitePanelConfig != null) {
            _MatchInvitePanelConfig_ProtoDecoder.LJ(matchInvitePanelConfig);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MatchThemeDisplayResource matchThemeDisplayResource) {
        LJ(matchThemeDisplayResource);
    }

    @Override // X.C0IMD
    public final MatchThemeDisplayResource LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchThemeDisplayResource matchThemeDisplayResource, List list) {
    }
}
