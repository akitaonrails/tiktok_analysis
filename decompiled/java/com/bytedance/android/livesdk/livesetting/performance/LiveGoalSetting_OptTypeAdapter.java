package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGoalSetting_OptTypeAdapter extends TypeAdapter<LiveGoalSetting> {
    @Override // com.google.gson.TypeAdapter
    public final LiveGoalSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGoalSetting liveGoalSetting = new LiveGoalSetting();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "goal_position")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveGoalSetting.goalPosition = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveGoalSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGoalSetting liveGoalSetting) {
        LiveGoalSetting liveGoalSetting2 = liveGoalSetting;
        if (liveGoalSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("goal_position");
        c09dl.LJJJJ(Integer.valueOf(liveGoalSetting2.goalPosition));
        c09dl.LJII();
    }
}
