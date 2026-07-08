package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkMicMultiGuestPageFirstFrameLogConfig_OptTypeAdapter extends TypeAdapter<LinkMicMultiGuestPageFirstFrameLogConfig> {
    public final Gson LIZ;

    public LinkMicMultiGuestPageFirstFrameLogConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicMultiGuestPageFirstFrameLogConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig = new LinkMicMultiGuestPageFirstFrameLogConfig(false, 1.0d);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    linkMicMultiGuestPageFirstFrameLogConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "sample_rate")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    linkMicMultiGuestPageFirstFrameLogConfig.sampleRate = c09cu.LJJIL();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return linkMicMultiGuestPageFirstFrameLogConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig) throws IOException {
        LinkMicMultiGuestPageFirstFrameLogConfig linkMicMultiGuestPageFirstFrameLogConfig2 = linkMicMultiGuestPageFirstFrameLogConfig;
        if (linkMicMultiGuestPageFirstFrameLogConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(linkMicMultiGuestPageFirstFrameLogConfig2.enable);
        c09dl.LJIILLIIL("sample_rate");
        c09dl.LJJIL(linkMicMultiGuestPageFirstFrameLogConfig2.sampleRate);
        c09dl.LJII();
    }
}
