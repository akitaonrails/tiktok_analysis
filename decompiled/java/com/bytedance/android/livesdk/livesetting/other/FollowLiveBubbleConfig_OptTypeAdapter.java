package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowLiveBubbleConfig_OptTypeAdapter extends TypeAdapter<FollowLiveBubbleConfig> {
    @Override // com.google.gson.TypeAdapter
    public final FollowLiveBubbleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FollowLiveBubbleConfig followLiveBubbleConfig = new FollowLiveBubbleConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "exp_group")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    followLiveBubbleConfig.expGroup = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "diff_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    followLiveBubbleConfig.diffTime = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return followLiveBubbleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FollowLiveBubbleConfig followLiveBubbleConfig) {
        FollowLiveBubbleConfig followLiveBubbleConfig2 = followLiveBubbleConfig;
        if (followLiveBubbleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("exp_group");
        c09dl.LJJJJ(Integer.valueOf(followLiveBubbleConfig2.expGroup));
        c09dl.LJIILLIIL("diff_time");
        c09dl.LJJJJ(Integer.valueOf(followLiveBubbleConfig2.diffTime));
        c09dl.LJII();
    }
}
