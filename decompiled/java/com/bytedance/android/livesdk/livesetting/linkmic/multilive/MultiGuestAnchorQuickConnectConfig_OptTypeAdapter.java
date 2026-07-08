package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiGuestAnchorQuickConnectConfig_OptTypeAdapter extends TypeAdapter<MultiGuestAnchorQuickConnectConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestAnchorQuickConnectConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestAnchorQuickConnectConfig multiGuestAnchorQuickConnectConfig = new MultiGuestAnchorQuickConnectConfig(0, 120L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "type")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiGuestAnchorQuickConnectConfig.type = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    multiGuestAnchorQuickConnectConfig.time = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return multiGuestAnchorQuickConnectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestAnchorQuickConnectConfig multiGuestAnchorQuickConnectConfig) throws IOException {
        MultiGuestAnchorQuickConnectConfig multiGuestAnchorQuickConnectConfig2 = multiGuestAnchorQuickConnectConfig;
        if (multiGuestAnchorQuickConnectConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJ(Integer.valueOf(multiGuestAnchorQuickConnectConfig2.type));
        c09dl.LJIILLIIL("time");
        c09dl.LJJIZ(multiGuestAnchorQuickConnectConfig2.time);
        c09dl.LJII();
    }
}
