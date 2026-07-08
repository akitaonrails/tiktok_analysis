package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GeckoResourceDownloadConfig_OptTypeAdapter extends TypeAdapter<GeckoResourceDownloadConfig> {
    public final Gson LIZ;

    public GeckoResourceDownloadConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GeckoResourceDownloadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GeckoResourceDownloadConfig geckoResourceDownloadConfig = new GeckoResourceDownloadConfig(null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "client_resource_channels")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    geckoResourceDownloadConfig.geckoResourceDownloadList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return geckoResourceDownloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GeckoResourceDownloadConfig geckoResourceDownloadConfig) {
        GeckoResourceDownloadConfig geckoResourceDownloadConfig2 = geckoResourceDownloadConfig;
        if (geckoResourceDownloadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("client_resource_channels");
        C473040Igo.LIZLLL(this.LIZ, c09dl, geckoResourceDownloadConfig2.geckoResourceDownloadList, String.class);
        c09dl.LJII();
    }
}
