package com.bytedance.android.livesdk.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.setting.LiveInteractViewRemoveSettingV2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveInteractViewRemoveSettingV2_Config_OptTypeAdapter extends TypeAdapter<LiveInteractViewRemoveSettingV2.Config> {
    public final Gson LIZ;

    public LiveInteractViewRemoveSettingV2_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveInteractViewRemoveSettingV2.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInteractViewRemoveSettingV2.Config config = new LiveInteractViewRemoveSettingV2.Config(false, false, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 274498123) {
                    if (iHashCode != 1228678848) {
                        if (iHashCode == 1836543906 && strLJJJJ.equals("enable_remove_all")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableRemoveAll = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_remove")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            config.enableRemove = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("remove_view_mask")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.removeViewMask = Integer.valueOf(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveInteractViewRemoveSettingV2.Config config) throws IOException {
        LiveInteractViewRemoveSettingV2.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_remove");
        c09dl.LJJJJJL(config2.enableRemove);
        c09dl.LJIILLIIL("enable_remove_all");
        c09dl.LJJJJJL(config2.enableRemoveAll);
        c09dl.LJIILLIIL("remove_view_mask");
        c09dl.LJJJJ(config2.removeViewMask);
        c09dl.LJII();
    }
}
