package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ExperimentalOptConfig_OptTypeAdapter extends TypeAdapter<ExperimentalOptConfig> {
    public final Gson LIZ;

    public ExperimentalOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ExperimentalOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ExperimentalOptConfig experimentalOptConfig = new ExperimentalOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enter_room_limit_dispatch_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    experimentalOptConfig.setEnterRoomLimitDispatchDuration((EnterRoomLimitDispatchDurationConfig) this.LIZ.LJIIJ(EnterRoomLimitDispatchDurationConfig.class).read(c09cu));
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "enter_room_change_window_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    experimentalOptConfig.setEnterRoomChangeWindowTime((EnterRoomChangeWindowTimeConfig) this.LIZ.LJIIJ(EnterRoomChangeWindowTimeConfig.class).read(c09cu));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return experimentalOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ExperimentalOptConfig experimentalOptConfig) {
        ExperimentalOptConfig experimentalOptConfig2 = experimentalOptConfig;
        if (experimentalOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enter_room_limit_dispatch_duration");
        this.LIZ.LJIIJ(EnterRoomLimitDispatchDurationConfig.class).write(c09dl, experimentalOptConfig2.getEnterRoomLimitDispatchDuration());
        c09dl.LJIILLIIL("enter_room_change_window_time");
        this.LIZ.LJIIJ(EnterRoomChangeWindowTimeConfig.class).write(c09dl, experimentalOptConfig2.getEnterRoomChangeWindowTime());
        c09dl.LJII();
    }
}
