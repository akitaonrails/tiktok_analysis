package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LopBanner_OptTypeAdapter extends TypeAdapter<LopBanner> {
    @Override // com.google.gson.TypeAdapter
    public final LopBanner read(C09CU c09cu) {
        LopBanner lopBanner = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            lopBanner = new LopBanner("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:profile_lop_banner}");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "go_live_schema")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        lopBanner.setGoLiveSchema(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return lopBanner;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LopBanner lopBanner) {
        LopBanner lopBanner2 = lopBanner;
        if (lopBanner2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("go_live_schema");
        c09dl.LJJJJJ(lopBanner2.getGoLiveSchema());
        c09dl.LJII();
    }
}
