package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomRightLikeParamsSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBottomRightLikeParamsSetting_LikeBehaviorParams_OptTypeAdapter extends TypeAdapter<LiveBottomRightLikeParamsSetting.LikeBehaviorParams> {
    public final Gson LIZ;

    public LiveBottomRightLikeParamsSetting_LikeBehaviorParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBottomRightLikeParamsSetting.LikeBehaviorParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBottomRightLikeParamsSetting.LikeBehaviorParams likeBehaviorParams = new LiveBottomRightLikeParamsSetting.LikeBehaviorParams();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1817822493:
                        if (strLJJJJ.equals("bezier_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeBehaviorParams.bezierEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1581595426:
                        if (strLJJJJ.equals("disappear_alpha_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeBehaviorParams.disappearAlphaEnd = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -835039593:
                        if (strLJJJJ.equals("appear_alpha_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeBehaviorParams.appearAlphaStart = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -209407167:
                        if (strLJJJJ.equals("distance_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeBehaviorParams.distanceRatio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 518327205:
                        if (strLJJJJ.equals("disappear_alpha_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeBehaviorParams.disappearAlphaStart = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1134491673:
                        if (strLJJJJ.equals("time_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeBehaviorParams.timeRatio = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1862802512:
                        if (strLJJJJ.equals("appear_alpha_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeBehaviorParams.appearAlphaEnd = (float) c09cu.LJJIL();
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
        return likeBehaviorParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBottomRightLikeParamsSetting.LikeBehaviorParams likeBehaviorParams) throws IOException {
        LiveBottomRightLikeParamsSetting.LikeBehaviorParams likeBehaviorParams2 = likeBehaviorParams;
        if (likeBehaviorParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("appear_alpha_start");
        c09dl.LJJJJ(Float.valueOf(likeBehaviorParams2.appearAlphaStart));
        c09dl.LJIILLIIL("appear_alpha_end");
        c09dl.LJJJJ(Float.valueOf(likeBehaviorParams2.appearAlphaEnd));
        c09dl.LJIILLIIL("disappear_alpha_start");
        c09dl.LJJJJ(Float.valueOf(likeBehaviorParams2.disappearAlphaStart));
        c09dl.LJIILLIIL("disappear_alpha_end");
        c09dl.LJJJJ(Float.valueOf(likeBehaviorParams2.disappearAlphaEnd));
        c09dl.LJIILLIIL("bezier_enable");
        c09dl.LJJJJJL(likeBehaviorParams2.bezierEnable);
        c09dl.LJIILLIIL("distance_ratio");
        c09dl.LJJJJ(Float.valueOf(likeBehaviorParams2.distanceRatio));
        c09dl.LJIILLIIL("time_ratio");
        c09dl.LJJJJ(Float.valueOf(likeBehaviorParams2.timeRatio));
        c09dl.LJII();
    }
}
