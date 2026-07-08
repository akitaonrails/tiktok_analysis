package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerConfigSetting;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBannerConfigSetting_BannerConfig_OptTypeAdapter extends TypeAdapter<LiveBannerConfigSetting.BannerConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBannerConfigSetting.BannerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBannerConfigSetting.BannerConfig bannerConfig = new LiveBannerConfigSetting.BannerConfig(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0L, 0L, 0L, 0L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2014553398:
                        if (strLJJJJ.equals("total_new_carousel_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerConfig.totalNewCarouselCount = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1734539477:
                        if (strLJJJJ.equals("total_carousel_interval_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerConfig.totalCarouselIntervalAnchor = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1723914275:
                        if (strLJJJJ.equals("min_carousel_interval_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerConfig.minCarouselIntervalAnchor = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1613582103:
                        if (strLJJJJ.equals("first_banner_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerConfig.firstNormalInterVal = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1451823843:
                        if (strLJJJJ.equals("normal_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerConfig.normalInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -175534321:
                        if (strLJJJJ.equals("anchor_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerConfig.anchorInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -135534901:
                        if (strLJJJJ.equals("first_banner_interval_anchor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerConfig.firstAnchorInterval = c09cu.LJJJ();
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
        return bannerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBannerConfigSetting.BannerConfig bannerConfig) throws IOException {
        LiveBannerConfigSetting.BannerConfig bannerConfig2 = bannerConfig;
        if (bannerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("normal_interval");
        c09dl.LJJIZ(bannerConfig2.normalInterval);
        c09dl.LJIILLIIL("anchor_interval");
        c09dl.LJJIZ(bannerConfig2.anchorInterval);
        c09dl.LJIILLIIL("first_banner_interval_anchor");
        c09dl.LJJIZ(bannerConfig2.firstAnchorInterval);
        c09dl.LJIILLIIL("first_banner_interval");
        c09dl.LJJIZ(bannerConfig2.firstNormalInterVal);
        c09dl.LJIILLIIL("total_carousel_interval_anchor");
        c09dl.LJJIZ(bannerConfig2.totalCarouselIntervalAnchor);
        c09dl.LJIILLIIL("total_new_carousel_count");
        c09dl.LJJIZ(bannerConfig2.totalNewCarouselCount);
        c09dl.LJIILLIIL("min_carousel_interval_anchor");
        c09dl.LJJIZ(bannerConfig2.minCarouselIntervalAnchor);
        c09dl.LJII();
    }
}
