package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2CohostUserNamePosOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestPhase2CohostUserNamePosOpt_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestPhase2CohostUserNamePosOpt.Configs> {
    public final Gson LIZ;

    public CohostWithGuestPhase2CohostUserNamePosOpt_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestPhase2CohostUserNamePosOpt.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestPhase2CohostUserNamePosOpt.Configs configs = new CohostWithGuestPhase2CohostUserNamePosOpt.Configs(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1750253004) {
                    if (iHashCode != -1555897888) {
                        if (iHashCode == 1131576718 && strLJJJJ.equals("update_on_attached")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.updateOnAttached = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("update_on_guest_list_change")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            configs.updateOnGuestListChange = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("old_layout_layer_cache_margin_bottom")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.oldLayoutLayerCacheMarginBottom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestPhase2CohostUserNamePosOpt.Configs configs) throws IOException {
        CohostWithGuestPhase2CohostUserNamePosOpt.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("update_on_guest_list_change");
        c09dl.LJJJJJL(configs2.updateOnGuestListChange);
        c09dl.LJIILLIIL("update_on_attached");
        c09dl.LJJJJJL(configs2.updateOnAttached);
        c09dl.LJIILLIIL("old_layout_layer_cache_margin_bottom");
        c09dl.LJJJJJL(configs2.oldLayoutLayerCacheMarginBottom);
        c09dl.LJII();
    }
}
