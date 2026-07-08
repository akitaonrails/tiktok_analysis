package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AnimationConfig_OptTypeAdapter extends TypeAdapter<AnimationConfig> {
    public final Gson LIZ;

    public AnimationConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AnimationConfig read(C09CU c09cu) {
        AnimationConfig animationConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            animationConfig = new AnimationConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "start_anim_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        animationConfig.start_anim_opt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "punish_anim_use_lottie")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        animationConfig.punish_anim_use_lottie = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return animationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AnimationConfig animationConfig) throws IOException {
        AnimationConfig animationConfig2 = animationConfig;
        if (animationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("start_anim_opt");
        c09dl.LJJJJJL(animationConfig2.start_anim_opt);
        c09dl.LJIILLIIL("punish_anim_use_lottie");
        c09dl.LJJJJJL(animationConfig2.punish_anim_use_lottie);
        c09dl.LJII();
    }
}
