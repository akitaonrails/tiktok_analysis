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
public final class LiveLikeAnimationDowngradeSetting_LiveUserInfoLikeAnimatorDowngradeConfig_OptTypeAdapter extends TypeAdapter<LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig> {
    public final Gson LIZ;

    public LiveLikeAnimationDowngradeSetting_LiveUserInfoLikeAnimatorDowngradeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig read(C09CU c09cu) {
        LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig liveUserInfoLikeAnimatorDowngradeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveUserInfoLikeAnimatorDowngradeConfig = new LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig(false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "remove_breath_animator")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveUserInfoLikeAnimatorDowngradeConfig.removeHeadBreathAnimator = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveUserInfoLikeAnimatorDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig liveUserInfoLikeAnimatorDowngradeConfig) throws IOException {
        LiveLikeAnimationDowngradeSetting.LiveUserInfoLikeAnimatorDowngradeConfig liveUserInfoLikeAnimatorDowngradeConfig2 = liveUserInfoLikeAnimatorDowngradeConfig;
        if (liveUserInfoLikeAnimatorDowngradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("remove_breath_animator");
        c09dl.LJJJJJL(liveUserInfoLikeAnimatorDowngradeConfig2.removeHeadBreathAnimator);
        c09dl.LJII();
    }
}
