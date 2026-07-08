package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveSeiConfig_OptTypeAdapter extends TypeAdapter<LiveSeiConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveSeiConfig read(C09CU c09cu) {
        LiveSeiConfig liveSeiConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveSeiConfig = new LiveSeiConfig(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "parse_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSeiConfig.parseType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "parse_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSeiConfig.interval = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveSeiConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSeiConfig liveSeiConfig) {
        LiveSeiConfig liveSeiConfig2 = liveSeiConfig;
        if (liveSeiConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("parse_type");
        c09dl.LJJJJ(Integer.valueOf(liveSeiConfig2.parseType));
        c09dl.LJIILLIIL("parse_interval");
        c09dl.LJJJJ(Integer.valueOf(liveSeiConfig2.interval));
        c09dl.LJII();
    }
}
