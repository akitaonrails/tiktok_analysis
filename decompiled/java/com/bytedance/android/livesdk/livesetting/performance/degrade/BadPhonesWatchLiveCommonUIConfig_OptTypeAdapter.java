package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class BadPhonesWatchLiveCommonUIConfig_OptTypeAdapter extends TypeAdapter<BadPhonesWatchLiveCommonUIConfig> {
    public final Gson LIZ;

    public BadPhonesWatchLiveCommonUIConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BadPhonesWatchLiveCommonUIConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig = new BadPhonesWatchLiveCommonUIConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -330471441:
                        if (strLJJJJ.equals("disable_gauss_blurred")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badPhonesWatchLiveCommonUIConfig.disableGaussBlurred = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -245253831:
                        if (strLJJJJ.equals("remove_bottom_shadow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badPhonesWatchLiveCommonUIConfig.removeBottomShadow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 43466913:
                        if (strLJJJJ.equals("remove_insert_message_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badPhonesWatchLiveCommonUIConfig.removeInsertMessageAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 791485925:
                        if (strLJJJJ.equals("remove_top_shadow")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                badPhonesWatchLiveCommonUIConfig.removeTopShadow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return badPhonesWatchLiveCommonUIConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig) throws IOException {
        BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig2 = badPhonesWatchLiveCommonUIConfig;
        if (badPhonesWatchLiveCommonUIConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("remove_top_shadow");
        c09dl.LJJJJJL(badPhonesWatchLiveCommonUIConfig2.removeTopShadow);
        c09dl.LJIILLIIL("remove_bottom_shadow");
        c09dl.LJJJJJL(badPhonesWatchLiveCommonUIConfig2.removeBottomShadow);
        c09dl.LJIILLIIL("disable_gauss_blurred");
        c09dl.LJJJJJL(badPhonesWatchLiveCommonUIConfig2.disableGaussBlurred);
        c09dl.LJIILLIIL("remove_insert_message_animation");
        c09dl.LJJJJJL(badPhonesWatchLiveCommonUIConfig2.removeInsertMessageAnimation);
        c09dl.LJII();
    }
}
