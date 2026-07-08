package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.rank.TtliveOnlineAudienceThresholdConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class TtliveOnlineAudienceThresholdConfigSetting_ThresholdConfig_OptTypeAdapter extends TypeAdapter<TtliveOnlineAudienceThresholdConfigSetting.ThresholdConfig> {
    public final Gson LIZ;

    public TtliveOnlineAudienceThresholdConfigSetting_ThresholdConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TtliveOnlineAudienceThresholdConfigSetting.ThresholdConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TtliveOnlineAudienceThresholdConfigSetting.ThresholdConfig thresholdConfig = new TtliveOnlineAudienceThresholdConfigSetting.ThresholdConfig(false, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 3739) {
                        if (iHashCode == 3089570 && strLJJJJ.equals("down")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                thresholdConfig.downConfig = C473040Igo.LIZ(this.LIZ, c09cu, TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("up")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            thresholdConfig.upConfig = C473040Igo.LIZ(this.LIZ, c09cu, TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        thresholdConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return thresholdConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TtliveOnlineAudienceThresholdConfigSetting.ThresholdConfig thresholdConfig) throws IOException {
        TtliveOnlineAudienceThresholdConfigSetting.ThresholdConfig thresholdConfig2 = thresholdConfig;
        if (thresholdConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(thresholdConfig2.enable);
        c09dl.LJIILLIIL("down");
        C473040Igo.LIZLLL(this.LIZ, c09dl, thresholdConfig2.downConfig, TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig.class);
        c09dl.LJIILLIIL("up");
        C473040Igo.LIZLLL(this.LIZ, c09dl, thresholdConfig2.upConfig, TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig.class);
        c09dl.LJII();
    }
}
