package com.bytedance.android.livesdk.live.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFeedDraw_OptTypeAdapter extends TypeAdapter<LiveFeedDraw> {
    public final Gson LIZ;

    public LiveFeedDraw_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFeedDraw read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFeedDraw liveFeedDraw = new LiveFeedDraw();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "url")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFeedDraw.setUrl(c09cu.LJJJZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "settings")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFeedDraw.setSettings(C473040Igo.LIZIZ(this.LIZ, c09cu, LiveFeedSettings.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveFeedDraw;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFeedDraw liveFeedDraw) {
        LiveFeedDraw liveFeedDraw2 = liveFeedDraw;
        if (liveFeedDraw2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("url");
        c09dl.LJJJJJ(liveFeedDraw2.getUrl());
        c09dl.LJIILLIIL("settings");
        C473040Igo.LJ(this.LIZ, c09dl, liveFeedDraw2.getSettings(), LiveFeedSettings.class);
        c09dl.LJII();
    }
}
