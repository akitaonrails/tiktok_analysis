package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.message.LivePreviewGameMomentSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreviewGameMomentSetting_LivePreviewGameMomentConfig_OptTypeAdapter extends TypeAdapter<LivePreviewGameMomentSetting.LivePreviewGameMomentConfig> {
    public final Gson LIZ;

    public LivePreviewGameMomentSetting_LivePreviewGameMomentConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePreviewGameMomentSetting.LivePreviewGameMomentConfig read(C09CU c09cu) {
        LivePreviewGameMomentSetting.LivePreviewGameMomentConfig livePreviewGameMomentConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePreviewGameMomentConfig = new LivePreviewGameMomentSetting.LivePreviewGameMomentConfig(false, new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_show_game_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePreviewGameMomentConfig.setEnableShowGameName(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "support_game_moment_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePreviewGameMomentConfig.setSupportGameMomentType(C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePreviewGameMomentConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePreviewGameMomentSetting.LivePreviewGameMomentConfig livePreviewGameMomentConfig) throws IOException {
        LivePreviewGameMomentSetting.LivePreviewGameMomentConfig livePreviewGameMomentConfig2 = livePreviewGameMomentConfig;
        if (livePreviewGameMomentConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_show_game_name");
        c09dl.LJJJJJL(livePreviewGameMomentConfig2.getEnableShowGameName());
        c09dl.LJIILLIIL("support_game_moment_type");
        C473040Igo.LIZLLL(this.LIZ, c09dl, livePreviewGameMomentConfig2.getSupportGameMomentType(), Integer.TYPE);
        c09dl.LJII();
    }
}
