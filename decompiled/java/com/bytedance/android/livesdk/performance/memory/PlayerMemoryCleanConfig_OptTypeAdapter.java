package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class PlayerMemoryCleanConfig_OptTypeAdapter extends TypeAdapter<PlayerMemoryCleanConfig> {
    public final Gson LIZ;

    public PlayerMemoryCleanConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PlayerMemoryCleanConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PlayerMemoryCleanConfig playerMemoryCleanConfig = new PlayerMemoryCleanConfig(false, 30000L, false, false, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -469104912:
                        if (strLJJJJ.equals("delayTime")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playerMemoryCleanConfig.setDelayTimeMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -225700515:
                        if (strLJJJJ.equals("policyInt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playerMemoryCleanConfig.setReleaseType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playerMemoryCleanConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 732588373:
                        if (strLJJJJ.equals("optSlowMethod")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playerMemoryCleanConfig.setOptSlowMethod(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1190352721:
                        if (strLJJJJ.equals("lowMemoryRestrict")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                playerMemoryCleanConfig.setLowMemoryRestrict(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return playerMemoryCleanConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PlayerMemoryCleanConfig playerMemoryCleanConfig) throws IOException {
        PlayerMemoryCleanConfig playerMemoryCleanConfig2 = playerMemoryCleanConfig;
        if (playerMemoryCleanConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(playerMemoryCleanConfig2.isEnabled());
        c09dl.LJIILLIIL("delayTime");
        c09dl.LJJIZ(playerMemoryCleanConfig2.getDelayTimeMs());
        c09dl.LJIILLIIL("lowMemoryRestrict");
        c09dl.LJJJJJL(playerMemoryCleanConfig2.getLowMemoryRestrict());
        c09dl.LJIILLIIL("optSlowMethod");
        c09dl.LJJJJJL(playerMemoryCleanConfig2.getOptSlowMethod());
        c09dl.LJIILLIIL("policyInt");
        c09dl.LJJJJ(Integer.valueOf(playerMemoryCleanConfig2.getReleaseType()));
        c09dl.LJII();
    }
}
