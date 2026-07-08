package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterInitOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveI18nCenterInitOptSetting_I18nInitOptConfig_OptTypeAdapter extends TypeAdapter<LiveI18nCenterInitOptSetting.I18nInitOptConfig> {
    public final Gson LIZ;

    public LiveI18nCenterInitOptSetting_I18nInitOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveI18nCenterInitOptSetting.I18nInitOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveI18nCenterInitOptSetting.I18nInitOptConfig i18nInitOptConfig = new LiveI18nCenterInitOptSetting.I18nInitOptConfig(false, 500, 6000);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -624814259) {
                    if (iHashCode != 869235511) {
                        if (iHashCode == 945563049 && strLJJJJ.equals("cachePartitionSize")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                i18nInitOptConfig.cachePartitionSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("saveCacheFreqCtrTimeMs")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            i18nInitOptConfig.saveCacheFreqCtrTimeMs = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("isEnable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        i18nInitOptConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return i18nInitOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveI18nCenterInitOptSetting.I18nInitOptConfig i18nInitOptConfig) throws IOException {
        LiveI18nCenterInitOptSetting.I18nInitOptConfig i18nInitOptConfig2 = i18nInitOptConfig;
        if (i18nInitOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isEnable");
        c09dl.LJJJJJL(i18nInitOptConfig2.isEnable);
        c09dl.LJIILLIIL("cachePartitionSize");
        c09dl.LJJJJ(Integer.valueOf(i18nInitOptConfig2.cachePartitionSize));
        c09dl.LJIILLIIL("saveCacheFreqCtrTimeMs");
        c09dl.LJJJJ(Integer.valueOf(i18nInitOptConfig2.saveCacheFreqCtrTimeMs));
        c09dl.LJII();
    }
}
