package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class ParamConfig_OptTypeAdapter extends TypeAdapter<ParamConfig> {
    public final Gson LIZ;

    public ParamConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ParamConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ParamConfig paramConfig = new ParamConfig(null, false, false, null, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1755119028:
                        if (strLJJJJ.equals("fan_club_page")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                paramConfig.fanClubPage = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -207204798:
                        if (strLJJJJ.equals("need_common_param")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                paramConfig.needCommonParam = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1325648814:
                        if (strLJJJJ.equals("preload_storage_keys")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                paramConfig.preloadStorageKeys = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1943425084:
                        if (strLJJJJ.equals("need_preload_storage_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                paramConfig.needPreloadStorageKey = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return paramConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ParamConfig paramConfig) throws IOException {
        ParamConfig paramConfig2 = paramConfig;
        if (paramConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fan_club_page");
        c09dl.LJJJJJ(paramConfig2.fanClubPage);
        c09dl.LJIILLIIL("need_common_param");
        c09dl.LJJJJJL(paramConfig2.needCommonParam);
        c09dl.LJIILLIIL("need_preload_storage_key");
        c09dl.LJJJJJL(paramConfig2.needPreloadStorageKey);
        c09dl.LJIILLIIL("preload_storage_keys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, paramConfig2.preloadStorageKeys, String.class);
        c09dl.LJII();
    }
}
