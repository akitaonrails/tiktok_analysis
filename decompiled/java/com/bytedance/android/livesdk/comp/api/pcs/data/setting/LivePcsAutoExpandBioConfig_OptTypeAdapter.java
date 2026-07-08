package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LivePcsAutoExpandBioConfig_OptTypeAdapter extends TypeAdapter<LivePcsAutoExpandBioConfig> {
    public final Gson LIZ;

    public LivePcsAutoExpandBioConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePcsAutoExpandBioConfig read(C09CU c09cu) {
        LivePcsAutoExpandBioConfig livePcsAutoExpandBioConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePcsAutoExpandBioConfig = new LivePcsAutoExpandBioConfig(true, 0.5f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePcsAutoExpandBioConfig.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "height_threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePcsAutoExpandBioConfig.heightThreshold = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePcsAutoExpandBioConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePcsAutoExpandBioConfig livePcsAutoExpandBioConfig) throws IOException {
        LivePcsAutoExpandBioConfig livePcsAutoExpandBioConfig2 = livePcsAutoExpandBioConfig;
        if (livePcsAutoExpandBioConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(livePcsAutoExpandBioConfig2.enabled);
        c09dl.LJIILLIIL("height_threshold");
        c09dl.LJJJJ(Float.valueOf(livePcsAutoExpandBioConfig2.heightThreshold));
        c09dl.LJII();
    }
}
