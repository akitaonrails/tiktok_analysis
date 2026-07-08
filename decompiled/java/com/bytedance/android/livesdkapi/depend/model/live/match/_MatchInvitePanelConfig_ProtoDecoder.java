package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchInvitePanelConfig_ProtoDecoder implements C0IMD<MatchInvitePanelConfig> {
    public static MatchInvitePanelConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchInvitePanelConfig matchInvitePanelConfig = new MatchInvitePanelConfig();
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
                                matchInvitePanelConfig.descTextDarkMode = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            matchInvitePanelConfig.descText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        matchInvitePanelConfig.headerTextDarkMode = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    matchInvitePanelConfig.headerText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchInvitePanelConfig;
            }
        }
    }

    public static void LJ(MatchInvitePanelConfig matchInvitePanelConfig) {
        Text text = matchInvitePanelConfig.headerText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = matchInvitePanelConfig.headerTextDarkMode;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = matchInvitePanelConfig.descText;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        Text text4 = matchInvitePanelConfig.descTextDarkMode;
        if (text4 != null) {
            _Text_ProtoDecoder.LJ(text4);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MatchInvitePanelConfig matchInvitePanelConfig) {
        LJ(matchInvitePanelConfig);
    }

    @Override // X.C0IMD
    public final MatchInvitePanelConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchInvitePanelConfig matchInvitePanelConfig, List list) {
    }
}
