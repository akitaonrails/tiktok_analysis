package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchPlaybookDefaultValueModel_OptTypeAdapter extends TypeAdapter<LiveMatchPlaybookDefaultValueModel> {
    public final Gson LIZ;

    public LiveMatchPlaybookDefaultValueModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchPlaybookDefaultValueModel read(C09CU c09cu) {
        LiveMatchPlaybookDefaultValueModel liveMatchPlaybookDefaultValueModel = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveMatchPlaybookDefaultValueModel = new LiveMatchPlaybookDefaultValueModel(0, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "match_gameplay_option")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchPlaybookDefaultValueModel.matchGameplayOption = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable_match_entity_edit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchPlaybookDefaultValueModel.enableMatchEntityEdit = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveMatchPlaybookDefaultValueModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchPlaybookDefaultValueModel liveMatchPlaybookDefaultValueModel) throws IOException {
        LiveMatchPlaybookDefaultValueModel liveMatchPlaybookDefaultValueModel2 = liveMatchPlaybookDefaultValueModel;
        if (liveMatchPlaybookDefaultValueModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("match_gameplay_option");
        c09dl.LJJJJ(Integer.valueOf(liveMatchPlaybookDefaultValueModel2.matchGameplayOption));
        c09dl.LJIILLIIL("enable_match_entity_edit");
        c09dl.LJJJJJL(liveMatchPlaybookDefaultValueModel2.enableMatchEntityEdit);
        c09dl.LJII();
    }
}
