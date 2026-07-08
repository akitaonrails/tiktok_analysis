package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveLynxBannerReverseAllowListSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLynxBannerReverseAllowListSetting_BannerLynxAllowListConfig_OptTypeAdapter extends TypeAdapter<LiveLynxBannerReverseAllowListSetting.BannerLynxAllowListConfig> {
    public final Gson LIZ;

    public LiveLynxBannerReverseAllowListSetting_BannerLynxAllowListConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLynxBannerReverseAllowListSetting.BannerLynxAllowListConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLynxBannerReverseAllowListSetting.BannerLynxAllowListConfig bannerLynxAllowListConfig = new LiveLynxBannerReverseAllowListSetting.BannerLynxAllowListConfig(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "allowlist_banner_ids")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    bannerLynxAllowListConfig.setBannerIds(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "allowlist_activity_ids")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    bannerLynxAllowListConfig.setActivityIds(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return bannerLynxAllowListConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLynxBannerReverseAllowListSetting.BannerLynxAllowListConfig bannerLynxAllowListConfig) {
        LiveLynxBannerReverseAllowListSetting.BannerLynxAllowListConfig bannerLynxAllowListConfig2 = bannerLynxAllowListConfig;
        if (bannerLynxAllowListConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("allowlist_banner_ids");
        C473040Igo.LIZLLL(this.LIZ, c09dl, bannerLynxAllowListConfig2.getBannerIds(), String.class);
        c09dl.LJIILLIIL("allowlist_activity_ids");
        C473040Igo.LIZLLL(this.LIZ, c09dl, bannerLynxAllowListConfig2.getActivityIds(), String.class);
        c09dl.LJII();
    }
}
