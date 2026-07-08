package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCoHostScreenShareLayoutIdConfig_OptTypeAdapter extends TypeAdapter<LiveCoHostScreenShareLayoutIdConfig> {
    public final Gson LIZ;

    public LiveCoHostScreenShareLayoutIdConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCoHostScreenShareLayoutIdConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCoHostScreenShareLayoutIdConfig liveCoHostScreenShareLayoutIdConfig = new LiveCoHostScreenShareLayoutIdConfig(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "landscape")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveCoHostScreenShareLayoutIdConfig.landscapeLayout = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "portrait")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveCoHostScreenShareLayoutIdConfig.portraitLayout = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveCoHostScreenShareLayoutIdConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCoHostScreenShareLayoutIdConfig liveCoHostScreenShareLayoutIdConfig) {
        LiveCoHostScreenShareLayoutIdConfig liveCoHostScreenShareLayoutIdConfig2 = liveCoHostScreenShareLayoutIdConfig;
        if (liveCoHostScreenShareLayoutIdConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("landscape");
        C473040Igo.LJ(this.LIZ, c09dl, liveCoHostScreenShareLayoutIdConfig2.landscapeLayout, String.class);
        c09dl.LJIILLIIL("portrait");
        C473040Igo.LJ(this.LIZ, c09dl, liveCoHostScreenShareLayoutIdConfig2.portraitLayout, String.class);
        c09dl.LJII();
    }
}
