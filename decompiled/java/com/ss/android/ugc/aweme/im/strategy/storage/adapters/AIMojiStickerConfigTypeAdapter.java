package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class AIMojiStickerConfigTypeAdapter extends TypeAdapter<AIMojiStickerConfig> {
    public final Gson LIZ;

    public AIMojiStickerConfigTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AIMojiStickerConfig read(C09CU c09cu) {
        c09cu.LIZIZ();
        ArrayList arrayList = null;
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "expressions")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    arrayList = new ArrayList();
                    c09cu.LIZ();
                    while (c09cu.LJIIZILJ()) {
                        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                            c09cu.LJJJJJL();
                        } else {
                            arrayList.add(c09cu.LJJJZ());
                        }
                    }
                    c09cu.LJI();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "fallback_sticker")) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                } else {
                    lightInteractionStickerSetMessage = (LightInteractionStickerSetMessage) this.LIZ.LJIIJ(LightInteractionStickerSetMessage.class).read(c09cu);
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return new AIMojiStickerConfig(arrayList, lightInteractionStickerSetMessage);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AIMojiStickerConfig aIMojiStickerConfig) {
        AIMojiStickerConfig aIMojiStickerConfig2 = aIMojiStickerConfig;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("expressions");
        if (aIMojiStickerConfig2.expressions == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<String> list = aIMojiStickerConfig2.expressions;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    c09dl.LJJJJJ(it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("fallback_sticker");
        if (aIMojiStickerConfig2.fallbackSticker == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(LightInteractionStickerSetMessage.class).write(c09dl, aIMojiStickerConfig2.fallbackSticker);
        }
        c09dl.LJII();
    }
}
