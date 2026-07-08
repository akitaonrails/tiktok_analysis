package com.bytedance.android.livesdk.performancetune.perfloadinfo;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePerfLoadInfo_OptTypeAdapter extends TypeAdapter<LivePerfLoadInfo> {
    public final Gson LIZ;

    public LivePerfLoadInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePerfLoadInfo read(C09CU c09cu) {
        LivePerfLoadInfo livePerfLoadInfo = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePerfLoadInfo = new LivePerfLoadInfo("unknown", new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "biz_scene")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePerfLoadInfo.setBizScene(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "biz_tags")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePerfLoadInfo.setBizTags(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePerfLoadInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePerfLoadInfo livePerfLoadInfo) {
        LivePerfLoadInfo livePerfLoadInfo2 = livePerfLoadInfo;
        if (livePerfLoadInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("biz_scene");
        c09dl.LJJJJJ(livePerfLoadInfo2.getBizScene());
        c09dl.LJIILLIIL("biz_tags");
        C473040Igo.LIZLLL(this.LIZ, c09dl, livePerfLoadInfo2.getBizTags(), String.class);
        c09dl.LJII();
    }
}
