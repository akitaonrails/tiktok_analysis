package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLikeAnimationDowngradeSetting_LiveBottomLikeAnimatorDowngradeConfig_OptTypeAdapter extends TypeAdapter<LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig> {
    public final Gson LIZ;

    public LiveLikeAnimationDowngradeSetting_LiveBottomLikeAnimatorDowngradeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig liveBottomLikeAnimatorDowngradeConfig = new LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig(false, false, 1, 25, -1.0f, 1.0f, 1.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1419279657:
                        if (strLJJJJ.equals("remove_bottom_like_alpha_animator")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeAnimatorDowngradeConfig.removeBottomLikeAlphaAnim = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -403807813:
                        if (strLJJJJ.equals("minFrameRate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeAnimatorDowngradeConfig.minFrameRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -209407167:
                        if (strLJJJJ.equals("distance_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeAnimatorDowngradeConfig.distanceRatio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 63013280:
                        if (strLJJJJ.equals("duration_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeAnimatorDowngradeConfig.durationRatio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 684924319:
                        if (strLJJJJ.equals("fixed_alpha_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeAnimatorDowngradeConfig.fixedAlphaRatio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1410033750:
                        if (strLJJJJ.equals("remove_bottom_like_animator")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeAnimatorDowngradeConfig.removeBottomLikeAnimator = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1576832567:
                        if (strLJJJJ.equals("refreshFrameInterval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBottomLikeAnimatorDowngradeConfig.refreshFrameInterval = c09cu.LJJIZ();
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
        return liveBottomLikeAnimatorDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig liveBottomLikeAnimatorDowngradeConfig) throws IOException {
        LiveLikeAnimationDowngradeSetting.LiveBottomLikeAnimatorDowngradeConfig liveBottomLikeAnimatorDowngradeConfig2 = liveBottomLikeAnimatorDowngradeConfig;
        if (liveBottomLikeAnimatorDowngradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("remove_bottom_like_animator");
        c09dl.LJJJJJL(liveBottomLikeAnimatorDowngradeConfig2.removeBottomLikeAnimator);
        c09dl.LJIILLIIL("remove_bottom_like_alpha_animator");
        c09dl.LJJJJJL(liveBottomLikeAnimatorDowngradeConfig2.removeBottomLikeAlphaAnim);
        c09dl.LJIILLIIL("refreshFrameInterval");
        c09dl.LJJJJ(Integer.valueOf(liveBottomLikeAnimatorDowngradeConfig2.refreshFrameInterval));
        c09dl.LJIILLIIL("minFrameRate");
        c09dl.LJJJJ(Integer.valueOf(liveBottomLikeAnimatorDowngradeConfig2.minFrameRate));
        c09dl.LJIILLIIL("fixed_alpha_ratio");
        c09dl.LJJJJ(Float.valueOf(liveBottomLikeAnimatorDowngradeConfig2.fixedAlphaRatio));
        c09dl.LJIILLIIL("distance_ratio");
        c09dl.LJJJJ(Float.valueOf(liveBottomLikeAnimatorDowngradeConfig2.distanceRatio));
        c09dl.LJIILLIIL("duration_ratio");
        c09dl.LJJJJ(Float.valueOf(liveBottomLikeAnimatorDowngradeConfig2.durationRatio));
        c09dl.LJII();
    }
}
