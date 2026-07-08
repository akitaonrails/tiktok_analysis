package com.bytedance.android.livesdk.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class PlayerLoggerDisableConfig_OptTypeAdapter extends TypeAdapter<PlayerLoggerDisableConfig> {
    public final Gson LIZ;

    public PlayerLoggerDisableConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PlayerLoggerDisableConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PlayerLoggerDisableConfig playerLoggerDisableConfig = new PlayerLoggerDisableConfig(false, new ArrayList(), false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1618930279) {
                    if (iHashCode != -1046530408) {
                        if (iHashCode == 1353060604 && strLJJJJ.equals("disableKeys")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playerLoggerDisableConfig.disableKeys = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("disableLogger")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            playerLoggerDisableConfig.disable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("disableAll")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        playerLoggerDisableConfig.disableAll = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return playerLoggerDisableConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PlayerLoggerDisableConfig playerLoggerDisableConfig) throws IOException {
        PlayerLoggerDisableConfig playerLoggerDisableConfig2 = playerLoggerDisableConfig;
        if (playerLoggerDisableConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("disableLogger");
        c09dl.LJJJJJL(playerLoggerDisableConfig2.disable);
        c09dl.LJIILLIIL("disableKeys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, playerLoggerDisableConfig2.disableKeys, String.class);
        c09dl.LJIILLIIL("disableAll");
        c09dl.LJJJJJL(playerLoggerDisableConfig2.disableAll);
        c09dl.LJII();
    }
}
