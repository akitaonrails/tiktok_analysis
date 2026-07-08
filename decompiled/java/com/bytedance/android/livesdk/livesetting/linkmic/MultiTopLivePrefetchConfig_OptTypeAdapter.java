package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLivePrefetchConfig_OptTypeAdapter extends TypeAdapter<MultiTopLivePrefetchConfig> {
    public final Gson LIZ;

    public MultiTopLivePrefetchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiTopLivePrefetchConfig read(C09CU c09cu) {
        MultiTopLivePrefetchConfig multiTopLivePrefetchConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            multiTopLivePrefetchConfig = new MultiTopLivePrefetchConfig(false, 1);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiTopLivePrefetchConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "prefetch_room_size")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiTopLivePrefetchConfig.prefetchRoomSize = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return multiTopLivePrefetchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiTopLivePrefetchConfig multiTopLivePrefetchConfig) throws IOException {
        MultiTopLivePrefetchConfig multiTopLivePrefetchConfig2 = multiTopLivePrefetchConfig;
        if (multiTopLivePrefetchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(multiTopLivePrefetchConfig2.enable);
        c09dl.LJIILLIIL("prefetch_room_size");
        c09dl.LJJJJ(Integer.valueOf(multiTopLivePrefetchConfig2.prefetchRoomSize));
        c09dl.LJII();
    }
}
