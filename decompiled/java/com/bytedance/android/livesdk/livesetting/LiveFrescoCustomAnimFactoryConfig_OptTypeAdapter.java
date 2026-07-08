package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveFrescoCustomAnimFactoryConfig_OptTypeAdapter extends TypeAdapter<LiveFrescoCustomAnimFactoryConfig> {
    public final Gson LIZ;

    public LiveFrescoCustomAnimFactoryConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveFrescoCustomAnimFactoryConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFrescoCustomAnimFactoryConfig liveFrescoCustomAnimFactoryConfig = new LiveFrescoCustomAnimFactoryConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -889492591:
                        if (strLJJJJ.equals("share_anim_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFrescoCustomAnimFactoryConfig.setShareAnimKey(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 412637374:
                        if (strLJJJJ.equals("scene_configs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFrescoCustomAnimFactoryConfig.setSceneConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, AnimFactoryConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1418777727:
                        if (strLJJJJ.equals("memory_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFrescoCustomAnimFactoryConfig.setMemorySize(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2058681175:
                        if (strLJJJJ.equals("path_configs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFrescoCustomAnimFactoryConfig.setPathConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, AnimFactoryConfig.class));
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
        return liveFrescoCustomAnimFactoryConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFrescoCustomAnimFactoryConfig liveFrescoCustomAnimFactoryConfig) throws IOException {
        LiveFrescoCustomAnimFactoryConfig liveFrescoCustomAnimFactoryConfig2 = liveFrescoCustomAnimFactoryConfig;
        if (liveFrescoCustomAnimFactoryConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("share_anim_key");
        c09dl.LJJJJJL(liveFrescoCustomAnimFactoryConfig2.getShareAnimKey());
        c09dl.LJIILLIIL("path_configs");
        C473040Igo.LJ(this.LIZ, c09dl, liveFrescoCustomAnimFactoryConfig2.getPathConfigs(), AnimFactoryConfig.class);
        c09dl.LJIILLIIL("scene_configs");
        C473040Igo.LJ(this.LIZ, c09dl, liveFrescoCustomAnimFactoryConfig2.getSceneConfigs(), AnimFactoryConfig.class);
        c09dl.LJIILLIIL("memory_size");
        c09dl.LJJJJ(Integer.valueOf(liveFrescoCustomAnimFactoryConfig2.getMemorySize()));
        c09dl.LJII();
    }
}
