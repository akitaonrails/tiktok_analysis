package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class PendantWidgetSettingsParams_OptTypeAdapter extends TypeAdapter<PendantWidgetSettingsParams> {
    public final Gson LIZ;

    public PendantWidgetSettingsParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PendantWidgetSettingsParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PendantWidgetSettingsParams pendantWidgetSettingsParams = new PendantWidgetSettingsParams(0L, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1510162990) {
                    if (iHashCode != -1312633073) {
                        if (iHashCode == -1030097907 && strLJJJJ.equals("preload_delay_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                pendantWidgetSettingsParams.preloadDelaySeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("widget_reward_animation")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            pendantWidgetSettingsParams.rewardAnimRes = C473040Igo.LIZIZ(this.LIZ, c09cu, PendantWidgetResParams.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("widget_default_icon")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        pendantWidgetSettingsParams.defaultWidgetBg = (PendantWidgetResParams) this.LIZ.LJIIJ(PendantWidgetResParams.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return pendantWidgetSettingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PendantWidgetSettingsParams pendantWidgetSettingsParams) throws IOException {
        PendantWidgetSettingsParams pendantWidgetSettingsParams2 = pendantWidgetSettingsParams;
        if (pendantWidgetSettingsParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("preload_delay_seconds");
        c09dl.LJJIZ(pendantWidgetSettingsParams2.preloadDelaySeconds);
        c09dl.LJIILLIIL("widget_default_icon");
        this.LIZ.LJIIJ(PendantWidgetResParams.class).write(c09dl, pendantWidgetSettingsParams2.defaultWidgetBg);
        c09dl.LJIILLIIL("widget_reward_animation");
        C473040Igo.LJ(this.LIZ, c09dl, pendantWidgetSettingsParams2.rewardAnimRes, PendantWidgetResParams.class);
        c09dl.LJII();
    }
}
