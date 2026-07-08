package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterInitOptSettingV2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveI18nCenterInitOptSettingV2_I18nInitOptConfig_OptTypeAdapter extends TypeAdapter<LiveI18nCenterInitOptSettingV2.I18nInitOptConfig> {
    public final Gson LIZ;

    public LiveI18nCenterInitOptSettingV2_I18nInitOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveI18nCenterInitOptSettingV2.I18nInitOptConfig read(C09CU c09cu) {
        LiveI18nCenterInitOptSettingV2.I18nInitOptConfig i18nInitOptConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            i18nInitOptConfig = new LiveI18nCenterInitOptSettingV2.I18nInitOptConfig(false, 6000);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "isEnable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        i18nInitOptConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "saveCacheFreqCtrTimeMs")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        i18nInitOptConfig.saveCacheFreqCtrTimeMs = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return i18nInitOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveI18nCenterInitOptSettingV2.I18nInitOptConfig i18nInitOptConfig) throws IOException {
        LiveI18nCenterInitOptSettingV2.I18nInitOptConfig i18nInitOptConfig2 = i18nInitOptConfig;
        if (i18nInitOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isEnable");
        c09dl.LJJJJJL(i18nInitOptConfig2.isEnable);
        c09dl.LJIILLIIL("saveCacheFreqCtrTimeMs");
        c09dl.LJJJJ(Integer.valueOf(i18nInitOptConfig2.saveCacheFreqCtrTimeMs));
        c09dl.LJII();
    }
}
