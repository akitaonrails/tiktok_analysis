package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class AnimFactoryConfig_OptTypeAdapter extends TypeAdapter<AnimFactoryConfig> {
    public final Gson LIZ;

    public AnimFactoryConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final AnimFactoryConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AnimFactoryConfig animFactoryConfig = new AnimFactoryConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1945120249:
                        if (strLJJJJ.equals("enable_single_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                animFactoryConfig.setEnableSingleCache(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1571888463:
                        if (strLJJJJ.equals("enable_memory_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                animFactoryConfig.setEnableMemoryOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1003721149:
                        if (strLJJJJ.equals("enable_share_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                animFactoryConfig.setEnableShareKey(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -692584955:
                        if (strLJJJJ.equals("enable_clear_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                animFactoryConfig.setEnableClearOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1742892340:
                        if (strLJJJJ.equals("disable_reusing_bitmap")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                animFactoryConfig.setDisableReusingBitmap(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return animFactoryConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AnimFactoryConfig animFactoryConfig) throws IOException {
        AnimFactoryConfig animFactoryConfig2 = animFactoryConfig;
        if (animFactoryConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_share_key");
        c09dl.LJJJJJL(animFactoryConfig2.getEnableShareKey());
        c09dl.LJIILLIIL("disable_reusing_bitmap");
        c09dl.LJJJJJL(animFactoryConfig2.getDisableReusingBitmap());
        c09dl.LJIILLIIL("enable_single_cache");
        c09dl.LJJJJJL(animFactoryConfig2.getEnableSingleCache());
        c09dl.LJIILLIIL("enable_clear_opt");
        c09dl.LJJJJJL(animFactoryConfig2.getEnableClearOpt());
        c09dl.LJIILLIIL("enable_memory_opt");
        c09dl.LJJJJJL(animFactoryConfig2.getEnableMemoryOpt());
        c09dl.LJII();
    }
}
