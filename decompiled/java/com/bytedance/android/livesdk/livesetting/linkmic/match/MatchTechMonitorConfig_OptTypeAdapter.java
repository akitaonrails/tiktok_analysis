package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchTechMonitorConfig_OptTypeAdapter extends TypeAdapter<MatchTechMonitorConfig> {
    public final Gson LIZ;

    public MatchTechMonitorConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MatchTechMonitorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MatchTechMonitorConfig matchTechMonitorConfig = new MatchTechMonitorConfig(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1372200597) {
                    if (iHashCode != -1361642690) {
                        if (iHashCode == 1517596822 && strLJJJJ.equals("enable_request_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchTechMonitorConfig.enableRequestFrom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_funnel_detail")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            matchTechMonitorConfig.enableFunnelDetail = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_invitee_request_from_passing")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        matchTechMonitorConfig.enableInviteeRequestFromPassing = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return matchTechMonitorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MatchTechMonitorConfig matchTechMonitorConfig) throws IOException {
        MatchTechMonitorConfig matchTechMonitorConfig2 = matchTechMonitorConfig;
        if (matchTechMonitorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_request_from");
        c09dl.LJJJJJL(matchTechMonitorConfig2.enableRequestFrom);
        c09dl.LJIILLIIL("enable_funnel_detail");
        c09dl.LJJJJJL(matchTechMonitorConfig2.enableFunnelDetail);
        c09dl.LJIILLIIL("enable_invitee_request_from_passing");
        c09dl.LJJJJJL(matchTechMonitorConfig2.enableInviteeRequestFromPassing);
        c09dl.LJII();
    }
}
