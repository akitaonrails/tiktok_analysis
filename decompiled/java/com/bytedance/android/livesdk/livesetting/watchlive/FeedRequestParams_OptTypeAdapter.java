package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedRequestParams_OptTypeAdapter extends TypeAdapter<FeedRequestParams> {
    public final Gson LIZ;

    public FeedRequestParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FeedRequestParams read(C09CU c09cu) {
        FeedRequestParams feedRequestParams = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            feedRequestParams = new FeedRequestParams(C2097608Jq.LJ());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "req_feed_v3")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        feedRequestParams.reqFeedV3 = C473040Igo.LIZIZ(this.LIZ, c09cu, Boolean.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return feedRequestParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeedRequestParams feedRequestParams) {
        FeedRequestParams feedRequestParams2 = feedRequestParams;
        if (feedRequestParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("req_feed_v3");
        C473040Igo.LJ(this.LIZ, c09dl, feedRequestParams2.reqFeedV3, Boolean.TYPE);
        c09dl.LJII();
    }
}
