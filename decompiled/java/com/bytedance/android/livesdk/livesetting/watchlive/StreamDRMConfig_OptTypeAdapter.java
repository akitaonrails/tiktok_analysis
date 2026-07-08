package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class StreamDRMConfig_OptTypeAdapter extends TypeAdapter<StreamDRMConfig> {
    public final Gson LIZ;

    public StreamDRMConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final StreamDRMConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        StreamDRMConfig streamDRMConfig = new StreamDRMConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_standard_drm")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    streamDRMConfig.enableStandardDRM = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "disable_pre_pull_stream")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    streamDRMConfig.disablePrePullStream = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return streamDRMConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StreamDRMConfig streamDRMConfig) throws IOException {
        StreamDRMConfig streamDRMConfig2 = streamDRMConfig;
        if (streamDRMConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_standard_drm");
        c09dl.LJJJJJL(streamDRMConfig2.enableStandardDRM);
        c09dl.LJIILLIIL("disable_pre_pull_stream");
        c09dl.LJJJJJL(streamDRMConfig2.disablePrePullStream);
        c09dl.LJII();
    }
}
