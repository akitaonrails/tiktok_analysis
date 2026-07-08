package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.TtliveOnlineAudienceThresholdConfigSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TtliveOnlineAudienceThresholdConfigSetting_ProportionConfig_OptTypeAdapter extends TypeAdapter<TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig> {
    @Override // com.google.gson.TypeAdapter
    public final TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig proportionConfig = new TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig(0L, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "cur_user_count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    proportionConfig.curUserCount = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "prop")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    proportionConfig.prop = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return proportionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig proportionConfig) throws IOException {
        TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig proportionConfig2 = proportionConfig;
        if (proportionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cur_user_count");
        c09dl.LJJIZ(proportionConfig2.curUserCount);
        c09dl.LJIILLIIL("prop");
        c09dl.LJJJJ(Integer.valueOf(proportionConfig2.prop));
        c09dl.LJII();
    }
}
