package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveBannerPlaceholderSettingConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBannerPlaceholderSettingConfig_BannerPlaceholderConfig_OptTypeAdapter extends TypeAdapter<LiveBannerPlaceholderSettingConfig.BannerPlaceholderConfig> {
    public final Gson LIZ;

    public LiveBannerPlaceholderSettingConfig_BannerPlaceholderConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBannerPlaceholderSettingConfig.BannerPlaceholderConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBannerPlaceholderSettingConfig.BannerPlaceholderConfig bannerPlaceholderConfig = new LiveBannerPlaceholderSettingConfig.BannerPlaceholderConfig(true, 2, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1768236686) {
                    if (iHashCode != -1249569615) {
                        if (iHashCode == 783772386 && strLJJJJ.equals("static_banner_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bannerPlaceholderConfig.setBaseSingleLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("dynamic_banner_level")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            bannerPlaceholderConfig.setDynamicBannerLevel(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_tab_title")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        bannerPlaceholderConfig.setTabTitleEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return bannerPlaceholderConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBannerPlaceholderSettingConfig.BannerPlaceholderConfig bannerPlaceholderConfig) throws IOException {
        LiveBannerPlaceholderSettingConfig.BannerPlaceholderConfig bannerPlaceholderConfig2 = bannerPlaceholderConfig;
        if (bannerPlaceholderConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_tab_title");
        c09dl.LJJJJJL(bannerPlaceholderConfig2.getTabTitleEnable());
        c09dl.LJIILLIIL("static_banner_level");
        c09dl.LJJJJ(Integer.valueOf(bannerPlaceholderConfig2.getBaseSingleLevel()));
        c09dl.LJIILLIIL("dynamic_banner_level");
        c09dl.LJJJJ(Integer.valueOf(bannerPlaceholderConfig2.getDynamicBannerLevel()));
        c09dl.LJII();
    }
}
