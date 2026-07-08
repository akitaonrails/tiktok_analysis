package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLikeAnimationDowngradeSetting_LiveLikeAnimatorDowngradeConfig_OptTypeAdapter extends TypeAdapter<LiveLikeAnimationDowngradeSetting.LiveLikeAnimatorDowngradeConfig> {
    public final Gson LIZ;

    public LiveLikeAnimationDowngradeSetting_LiveLikeAnimatorDowngradeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLikeAnimationDowngradeSetting.LiveLikeAnimatorDowngradeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLikeAnimationDowngradeSetting.LiveLikeAnimatorDowngradeConfig liveLikeAnimatorDowngradeConfig = new LiveLikeAnimationDowngradeSetting.LiveLikeAnimatorDowngradeConfig(new LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig(false, false, 1, 25, -1.0f, 1.0f, 1.0f), new LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig(false), new LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig(false));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1934995608) {
                    if (iHashCode != -292694560) {
                        if (iHashCode == 1430450898 && strLJJJJ.equals("userinfo_downgrade_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveLikeAnimatorDowngradeConfig.userinfoDowngradeConfig = (LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig) this.LIZ.LJIIJ(LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("bottom_downgrade_config")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveLikeAnimatorDowngradeConfig.bottomDowngradeConfig = (LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig) this.LIZ.LJIIJ(LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("tap_downgrade_config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveLikeAnimatorDowngradeConfig.tapDowngradeConfig = (LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig) this.LIZ.LJIIJ(LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveLikeAnimatorDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLikeAnimationDowngradeSetting.LiveLikeAnimatorDowngradeConfig liveLikeAnimatorDowngradeConfig) {
        LiveLikeAnimationDowngradeSetting.LiveLikeAnimatorDowngradeConfig liveLikeAnimatorDowngradeConfig2 = liveLikeAnimatorDowngradeConfig;
        if (liveLikeAnimatorDowngradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("bottom_downgrade_config");
        this.LIZ.LJIIJ(LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig.class).write(c09dl, liveLikeAnimatorDowngradeConfig2.bottomDowngradeConfig);
        c09dl.LJIILLIIL("tap_downgrade_config");
        this.LIZ.LJIIJ(LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig.class).write(c09dl, liveLikeAnimatorDowngradeConfig2.tapDowngradeConfig);
        c09dl.LJIILLIIL("userinfo_downgrade_config");
        this.LIZ.LJIIJ(LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig.class).write(c09dl, liveLikeAnimatorDowngradeConfig2.userinfoDowngradeConfig);
        c09dl.LJII();
    }
}
