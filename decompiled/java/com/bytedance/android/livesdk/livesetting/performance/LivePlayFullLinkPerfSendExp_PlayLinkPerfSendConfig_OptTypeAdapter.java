package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFullLinkPerfSendExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePlayFullLinkPerfSendExp_PlayLinkPerfSendConfig_OptTypeAdapter extends TypeAdapter<LivePlayFullLinkPerfSendExp.PlayLinkPerfSendConfig> {
    public final Gson LIZ;

    public LivePlayFullLinkPerfSendExp_PlayLinkPerfSendConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePlayFullLinkPerfSendExp.PlayLinkPerfSendConfig read(C09CU c09cu) {
        LivePlayFullLinkPerfSendExp.PlayLinkPerfSendConfig playLinkPerfSendConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            playLinkPerfSendConfig = new LivePlayFullLinkPerfSendExp.PlayLinkPerfSendConfig(false, 15);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        playLinkPerfSendConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "collect_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        playLinkPerfSendConfig.collectIntervalSec = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return playLinkPerfSendConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePlayFullLinkPerfSendExp.PlayLinkPerfSendConfig playLinkPerfSendConfig) throws IOException {
        LivePlayFullLinkPerfSendExp.PlayLinkPerfSendConfig playLinkPerfSendConfig2 = playLinkPerfSendConfig;
        if (playLinkPerfSendConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(playLinkPerfSendConfig2.isEnable);
        c09dl.LJIILLIIL("collect_interval");
        c09dl.LJJJJ(Integer.valueOf(playLinkPerfSendConfig2.collectIntervalSec));
        c09dl.LJII();
    }
}
