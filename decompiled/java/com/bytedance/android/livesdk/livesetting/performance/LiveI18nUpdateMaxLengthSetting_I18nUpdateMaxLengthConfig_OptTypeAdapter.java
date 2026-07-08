package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nUpdateMaxLengthSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveI18nUpdateMaxLengthSetting_I18nUpdateMaxLengthConfig_OptTypeAdapter extends TypeAdapter<LiveI18nUpdateMaxLengthSetting.I18nUpdateMaxLengthConfig> {
    public final Gson LIZ;

    public LiveI18nUpdateMaxLengthSetting_I18nUpdateMaxLengthConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveI18nUpdateMaxLengthSetting.I18nUpdateMaxLengthConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveI18nUpdateMaxLengthSetting.I18nUpdateMaxLengthConfig i18nUpdateMaxLengthConfig = new LiveI18nUpdateMaxLengthSetting.I18nUpdateMaxLengthConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    i18nUpdateMaxLengthConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "max_length")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    i18nUpdateMaxLengthConfig.setMaxLength(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return i18nUpdateMaxLengthConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveI18nUpdateMaxLengthSetting.I18nUpdateMaxLengthConfig i18nUpdateMaxLengthConfig) throws IOException {
        LiveI18nUpdateMaxLengthSetting.I18nUpdateMaxLengthConfig i18nUpdateMaxLengthConfig2 = i18nUpdateMaxLengthConfig;
        if (i18nUpdateMaxLengthConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(i18nUpdateMaxLengthConfig2.getEnable());
        c09dl.LJIILLIIL("max_length");
        c09dl.LJJJJ(Integer.valueOf(i18nUpdateMaxLengthConfig2.getMaxLength()));
        c09dl.LJII();
    }
}
