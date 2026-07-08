package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveAvoidNotifySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAvoidNotifySetting_LiveConflictFrameworkConfig_OptTypeAdapter extends TypeAdapter<LiveAvoidNotifySetting.LiveConflictFrameworkConfig> {
    public final Gson LIZ;

    public LiveAvoidNotifySetting_LiveConflictFrameworkConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAvoidNotifySetting.LiveConflictFrameworkConfig read(C09CU c09cu) {
        LiveAvoidNotifySetting.LiveConflictFrameworkConfig liveConflictFrameworkConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveConflictFrameworkConfig = new LiveAvoidNotifySetting.LiveConflictFrameworkConfig(Boolean.FALSE, Boolean.FALSE);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveConflictFrameworkConfig.enable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable_pin_comment")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveConflictFrameworkConfig.enablePinComment = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveConflictFrameworkConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAvoidNotifySetting.LiveConflictFrameworkConfig liveConflictFrameworkConfig) {
        LiveAvoidNotifySetting.LiveConflictFrameworkConfig liveConflictFrameworkConfig2 = liveConflictFrameworkConfig;
        if (liveConflictFrameworkConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJ(liveConflictFrameworkConfig2.enable);
        c09dl.LJIILLIIL("enable_pin_comment");
        c09dl.LJJJ(liveConflictFrameworkConfig2.enablePinComment);
        c09dl.LJII();
    }
}
