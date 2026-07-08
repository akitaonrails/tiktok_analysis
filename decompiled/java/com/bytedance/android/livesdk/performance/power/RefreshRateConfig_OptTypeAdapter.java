package com.bytedance.android.livesdk.performance.power;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class RefreshRateConfig_OptTypeAdapter extends TypeAdapter<RefreshRateConfig> {
    public final Gson LIZ;

    public RefreshRateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RefreshRateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RefreshRateConfig refreshRateConfig = new RefreshRateConfig(false, 30.0f, 20.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1690296135) {
                    if (iHashCode != -109284052) {
                        if (iHashCode == 671443392 && strLJJJJ.equals("temp_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                refreshRateConfig.setHighTempThreshold((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("is_enabled")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            refreshRateConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("battery_threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        refreshRateConfig.setLowBatteryThreshold((float) c09cu.LJJIL());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return refreshRateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RefreshRateConfig refreshRateConfig) throws IOException {
        RefreshRateConfig refreshRateConfig2 = refreshRateConfig;
        if (refreshRateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(refreshRateConfig2.isEnabled());
        c09dl.LJIILLIIL("temp_threshold");
        c09dl.LJJJJ(Float.valueOf(refreshRateConfig2.getHighTempThreshold()));
        c09dl.LJIILLIIL("battery_threshold");
        c09dl.LJJJJ(Float.valueOf(refreshRateConfig2.getLowBatteryThreshold()));
        c09dl.LJII();
    }
}
