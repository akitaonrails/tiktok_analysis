package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendScreenGuideTestSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveExtendScreenGuideTestSetting_GuideConfig_OptTypeAdapter extends TypeAdapter<LiveExtendScreenGuideTestSetting.GuideConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveExtendScreenGuideTestSetting.GuideConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveExtendScreenGuideTestSetting.GuideConfig guideConfig = new LiveExtendScreenGuideTestSetting.GuideConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "common_guide_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    guideConfig.commonGuideTime = (float) c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "companion_guide_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    guideConfig.companionGuideTime = (float) c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return guideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveExtendScreenGuideTestSetting.GuideConfig guideConfig) {
        LiveExtendScreenGuideTestSetting.GuideConfig guideConfig2 = guideConfig;
        if (guideConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("common_guide_time");
        c09dl.LJJJJ(Float.valueOf(guideConfig2.commonGuideTime));
        c09dl.LJIILLIIL("companion_guide_time");
        c09dl.LJJJJ(Float.valueOf(guideConfig2.companionGuideTime));
        c09dl.LJII();
    }
}
