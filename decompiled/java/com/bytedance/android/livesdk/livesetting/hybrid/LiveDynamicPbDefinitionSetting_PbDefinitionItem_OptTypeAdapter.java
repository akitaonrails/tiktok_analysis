package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDynamicPbDefinitionSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveDynamicPbDefinitionSetting_PbDefinitionItem_OptTypeAdapter extends TypeAdapter<LiveDynamicPbDefinitionSetting.PbDefinitionItem> {
    @Override // com.google.gson.TypeAdapter
    public final LiveDynamicPbDefinitionSetting.PbDefinitionItem read(C09CU c09cu) {
        LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            pbDefinitionItem = new LiveDynamicPbDefinitionSetting.PbDefinitionItem("", "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "channel")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        pbDefinitionItem.channel = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "definition_url")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        pbDefinitionItem.url = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return pbDefinitionItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem) {
        LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem2 = pbDefinitionItem;
        if (pbDefinitionItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(pbDefinitionItem2.channel);
        c09dl.LJIILLIIL("definition_url");
        c09dl.LJJJJJ(pbDefinitionItem2.url);
        c09dl.LJII();
    }
}
