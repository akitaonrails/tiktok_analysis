package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class InitialEffectSettingParams_OptTypeAdapter extends TypeAdapter<InitialEffectSettingParams> {
    public final Gson LIZ;

    public InitialEffectSettingParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InitialEffectSettingParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InitialEffectSettingParams initialEffectSettingParams = new InitialEffectSettingParams(false, 0, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1609594047:
                        if (strLJJJJ.equals("enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                initialEffectSettingParams.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -342623805:
                        if (strLJJJJ.equals("load_timing")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                initialEffectSettingParams.loadTiming = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1234537196:
                        if (strLJJJJ.equals("resource_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                initialEffectSettingParams.resourceId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1298123750:
                        if (strLJJJJ.equals("panel_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                initialEffectSettingParams.panelName = c09cu.LJJJZ();
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
        return initialEffectSettingParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InitialEffectSettingParams initialEffectSettingParams) throws IOException {
        InitialEffectSettingParams initialEffectSettingParams2 = initialEffectSettingParams;
        if (initialEffectSettingParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(initialEffectSettingParams2.enabled);
        c09dl.LJIILLIIL("load_timing");
        c09dl.LJJJJ(Integer.valueOf(initialEffectSettingParams2.loadTiming));
        c09dl.LJIILLIIL("panel_name");
        c09dl.LJJJJJ(initialEffectSettingParams2.panelName);
        c09dl.LJIILLIIL("resource_id");
        c09dl.LJJJJJ(initialEffectSettingParams2.resourceId);
        c09dl.LJII();
    }
}
