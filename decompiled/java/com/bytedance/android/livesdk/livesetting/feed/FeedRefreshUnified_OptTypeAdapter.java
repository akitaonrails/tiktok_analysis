package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedRefreshUnified_OptTypeAdapter extends TypeAdapter<FeedRefreshUnified> {
    public final Gson LIZ;

    public FeedRefreshUnified_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FeedRefreshUnified read(C09CU c09cu) {
        FeedRefreshUnified feedRefreshUnified = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            feedRefreshUnified = new FeedRefreshUnified(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        feedRefreshUnified.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "remove_swipe_refresh")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        feedRefreshUnified.removeSwipeRefresh = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return feedRefreshUnified;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeedRefreshUnified feedRefreshUnified) throws IOException {
        FeedRefreshUnified feedRefreshUnified2 = feedRefreshUnified;
        if (feedRefreshUnified2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(feedRefreshUnified2.enable);
        c09dl.LJIILLIIL("remove_swipe_refresh");
        c09dl.LJJJJJL(feedRefreshUnified2.removeSwipeRefresh);
        c09dl.LJII();
    }
}
