package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveLikeAnimationDowngradeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLikeAnimationDowngradeSetting_LiveTapLikeAnimatorDowngradeConfig_OptTypeAdapter extends TypeAdapter<LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig> {
    public final Gson LIZ;

    public LiveLikeAnimationDowngradeSetting_LiveTapLikeAnimatorDowngradeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig read(C09CU c09cu) {
        LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig liveTapLikeAnimatorDowngradeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveTapLikeAnimatorDowngradeConfig = new LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig(false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "remove_tap_like_to_head_animator")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveTapLikeAnimatorDowngradeConfig.removeTapLikeToHeadAnim = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveTapLikeAnimatorDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig liveTapLikeAnimatorDowngradeConfig) throws IOException {
        LiveLikeAnimationDowngradeSetting.LiveTapLikeAnimatorDowngradeConfig liveTapLikeAnimatorDowngradeConfig2 = liveTapLikeAnimatorDowngradeConfig;
        if (liveTapLikeAnimatorDowngradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("remove_tap_like_to_head_animator");
        c09dl.LJJJJJL(liveTapLikeAnimatorDowngradeConfig2.removeTapLikeToHeadAnim);
        c09dl.LJII();
    }
}
