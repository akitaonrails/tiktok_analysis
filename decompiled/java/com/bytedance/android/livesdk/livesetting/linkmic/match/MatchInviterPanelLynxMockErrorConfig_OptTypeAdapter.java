package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchInviterPanelLynxMockErrorConfig_OptTypeAdapter extends TypeAdapter<MatchInviterPanelLynxMockErrorConfig> {
    public final Gson LIZ;

    public MatchInviterPanelLynxMockErrorConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MatchInviterPanelLynxMockErrorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MatchInviterPanelLynxMockErrorConfig matchInviterPanelLynxMockErrorConfig = new MatchInviterPanelLynxMockErrorConfig(false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1084694879:
                        if (strLJJJJ.equals("start_up_error")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxMockErrorConfig.startUpError = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 76299171:
                        if (strLJJJJ.equals("error_after_invite")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxMockErrorConfig.errorAfterInvite = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 796837330:
                        if (strLJJJJ.equals("error_before_invite")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxMockErrorConfig.errorBeforeInvite = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1300191382:
                        if (strLJJJJ.equals("time_up_error")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchInviterPanelLynxMockErrorConfig.timeUpError = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return matchInviterPanelLynxMockErrorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MatchInviterPanelLynxMockErrorConfig matchInviterPanelLynxMockErrorConfig) throws IOException {
        MatchInviterPanelLynxMockErrorConfig matchInviterPanelLynxMockErrorConfig2 = matchInviterPanelLynxMockErrorConfig;
        if (matchInviterPanelLynxMockErrorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("start_up_error");
        c09dl.LJJJJJL(matchInviterPanelLynxMockErrorConfig2.startUpError);
        c09dl.LJIILLIIL("time_up_error");
        c09dl.LJJJJJL(matchInviterPanelLynxMockErrorConfig2.timeUpError);
        c09dl.LJIILLIIL("error_before_invite");
        c09dl.LJJJJJL(matchInviterPanelLynxMockErrorConfig2.errorBeforeInvite);
        c09dl.LJIILLIIL("error_after_invite");
        c09dl.LJJJJJL(matchInviterPanelLynxMockErrorConfig2.errorAfterInvite);
        c09dl.LJII();
    }
}
