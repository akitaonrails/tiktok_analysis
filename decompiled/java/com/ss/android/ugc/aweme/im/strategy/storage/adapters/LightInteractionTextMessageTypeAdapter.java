package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionTextMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionTextMessageTypeAdapter extends TypeAdapter<LightInteractionTextMessage> {
    @Override // com.google.gson.TypeAdapter
    public final LightInteractionTextMessage read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "text")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    strLJJJZ = c09cu.LJJJZ();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return new LightInteractionTextMessage(strLJJJZ);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LightInteractionTextMessage lightInteractionTextMessage) {
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("text");
        c09dl.LJJJJJ(lightInteractionTextMessage.text);
        c09dl.LJII();
    }
}
