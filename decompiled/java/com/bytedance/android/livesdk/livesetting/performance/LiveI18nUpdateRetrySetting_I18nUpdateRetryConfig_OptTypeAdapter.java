package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nUpdateRetrySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveI18nUpdateRetrySetting_I18nUpdateRetryConfig_OptTypeAdapter extends TypeAdapter<LiveI18nUpdateRetrySetting.I18nUpdateRetryConfig> {
    public final Gson LIZ;

    public LiveI18nUpdateRetrySetting_I18nUpdateRetryConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveI18nUpdateRetrySetting.I18nUpdateRetryConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveI18nUpdateRetrySetting.I18nUpdateRetryConfig i18nUpdateRetryConfig = new LiveI18nUpdateRetrySetting.I18nUpdateRetryConfig(false, 3, C1697810uHb.LJIIJJI(3000L, 6000L, 9000L));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 1216104029) {
                        if (iHashCode == 2092469102 && strLJJJJ.equals("retry_intervals_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                i18nUpdateRetryConfig.setRetryIntervalsMs(C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("max_retry_count")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            i18nUpdateRetryConfig.setMaxRetryCount(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        i18nUpdateRetryConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return i18nUpdateRetryConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveI18nUpdateRetrySetting.I18nUpdateRetryConfig i18nUpdateRetryConfig) throws IOException {
        LiveI18nUpdateRetrySetting.I18nUpdateRetryConfig i18nUpdateRetryConfig2 = i18nUpdateRetryConfig;
        if (i18nUpdateRetryConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(i18nUpdateRetryConfig2.getEnable());
        c09dl.LJIILLIIL("max_retry_count");
        c09dl.LJJJJ(Integer.valueOf(i18nUpdateRetryConfig2.getMaxRetryCount()));
        c09dl.LJIILLIIL("retry_intervals_ms");
        C473040Igo.LIZLLL(this.LIZ, c09dl, i18nUpdateRetryConfig2.getRetryIntervalsMs(), Long.TYPE);
        c09dl.LJII();
    }
}
