package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveQuickCohostPreferenceMatchTimingSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveQuickCohostPreferenceMatchTimingSettings_TimingConfigs_OptTypeAdapter extends TypeAdapter<LiveQuickCohostPreferenceMatchTimingSettings.TimingConfigs> {
    @Override // com.google.gson.TypeAdapter
    public final LiveQuickCohostPreferenceMatchTimingSettings.TimingConfigs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveQuickCohostPreferenceMatchTimingSettings.TimingConfigs timingConfigs = new LiveQuickCohostPreferenceMatchTimingSettings.TimingConfigs(5, 0.5d);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "set_preference_entry_delay_seconds")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    timingConfigs.setPreferenceEntryDelaySeconds = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "match_success_min_duration_seconds")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    timingConfigs.matchSuccessMinDurationSeconds = c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return timingConfigs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveQuickCohostPreferenceMatchTimingSettings.TimingConfigs timingConfigs) throws IOException {
        LiveQuickCohostPreferenceMatchTimingSettings.TimingConfigs timingConfigs2 = timingConfigs;
        if (timingConfigs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("set_preference_entry_delay_seconds");
        c09dl.LJJJJ(Integer.valueOf(timingConfigs2.setPreferenceEntryDelaySeconds));
        c09dl.LJIILLIIL("match_success_min_duration_seconds");
        c09dl.LJJIL(timingConfigs2.matchSuccessMinDurationSeconds);
        c09dl.LJII();
    }
}
