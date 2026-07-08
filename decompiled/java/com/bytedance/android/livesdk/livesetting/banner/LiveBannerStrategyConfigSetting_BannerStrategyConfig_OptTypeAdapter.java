package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerStrategyConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBannerStrategyConfigSetting_BannerStrategyConfig_OptTypeAdapter extends TypeAdapter<LiveBannerStrategyConfigSetting.BannerStrategyConfig> {
    public final Gson LIZ;

    public LiveBannerStrategyConfigSetting_BannerStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBannerStrategyConfigSetting.BannerStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBannerStrategyConfigSetting.BannerStrategyConfig bannerStrategyConfig = new LiveBannerStrategyConfigSetting.BannerStrategyConfig(0, C2097608Jq.LJ(), C2097608Jq.LJ());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 713118242) {
                        if (iHashCode == 2030201413 && strLJJJJ.equals("business_classification")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerStrategyConfig.businessClassification = C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("delay_classification")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            bannerStrategyConfig.delayClassification = C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        bannerStrategyConfig.enable = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return bannerStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBannerStrategyConfigSetting.BannerStrategyConfig bannerStrategyConfig) {
        LiveBannerStrategyConfigSetting.BannerStrategyConfig bannerStrategyConfig2 = bannerStrategyConfig;
        if (bannerStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(bannerStrategyConfig2.enable));
        c09dl.LJIILLIIL("delay_classification");
        C473040Igo.LJ(this.LIZ, c09dl, bannerStrategyConfig2.delayClassification, Object.class);
        c09dl.LJIILLIIL("business_classification");
        C473040Igo.LJ(this.LIZ, c09dl, bannerStrategyConfig2.businessClassification, Integer.TYPE);
        c09dl.LJII();
    }
}
