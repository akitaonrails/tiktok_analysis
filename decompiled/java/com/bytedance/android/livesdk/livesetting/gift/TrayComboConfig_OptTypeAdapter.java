package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class TrayComboConfig_OptTypeAdapter extends TypeAdapter<TrayComboConfig> {
    public final Gson LIZ;

    public TrayComboConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrayComboConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TrayComboConfig trayComboConfig = new TrayComboConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -785704977) {
                    if (iHashCode != -991413) {
                        if (iHashCode == 1667386806 && strLJJJJ.equals("dynamic_jump_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                trayComboConfig._jumpInterval = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("combo_type")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            trayComboConfig._comboType = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("animation_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        trayComboConfig._animationDuration = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return trayComboConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TrayComboConfig trayComboConfig) {
        TrayComboConfig trayComboConfig2 = trayComboConfig;
        if (trayComboConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("animation_duration");
        Gson gson = this.LIZ;
        List<Integer> list = trayComboConfig2._animationDuration;
        Class cls = Integer.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("combo_type");
        c09dl.LJJJJJ(trayComboConfig2._comboType);
        c09dl.LJIILLIIL("dynamic_jump_interval");
        C473040Igo.LIZLLL(this.LIZ, c09dl, trayComboConfig2._jumpInterval, cls);
        c09dl.LJII();
    }
}
