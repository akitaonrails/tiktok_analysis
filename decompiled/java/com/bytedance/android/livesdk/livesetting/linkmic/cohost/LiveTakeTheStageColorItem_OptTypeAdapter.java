package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveTakeTheStageColorItem_OptTypeAdapter extends TypeAdapter<LiveTakeTheStageColorItem> {
    public final Gson LIZ;

    public LiveTakeTheStageColorItem_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTakeTheStageColorItem read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTakeTheStageColorItem liveTakeTheStageColorItem = new LiveTakeTheStageColorItem(null, null, null, null, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -645462130:
                        if (strLJJJJ.equals("rank_component_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItem.rankComponentColor = (LiveTakeTheStageColor) this.LIZ.LJIIJ(LiveTakeTheStageColor.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1461085588:
                        if (strLJJJJ.equals("contribute_list_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItem.contributeListColor = (LiveTakeTheStageColor) this.LIZ.LJIIJ(LiveTakeTheStageColor.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1812053869:
                        if (strLJJJJ.equals("led_component_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItem.ledComponentColor = (LiveTakeTheStageColor) this.LIZ.LJIIJ(LiveTakeTheStageColor.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1890050897:
                        if (strLJJJJ.equals("switch_turn_animation_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColorItem.switchTurnAnimationColor = (LiveTakeTheStageColor) this.LIZ.LJIIJ(LiveTakeTheStageColor.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveTakeTheStageColorItem;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTakeTheStageColorItem liveTakeTheStageColorItem) {
        LiveTakeTheStageColorItem liveTakeTheStageColorItem2 = liveTakeTheStageColorItem;
        if (liveTakeTheStageColorItem2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("led_component_color");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveTakeTheStageColor.class);
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItem2.ledComponentColor);
        c09dl.LJIILLIIL("rank_component_color");
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItem2.rankComponentColor);
        c09dl.LJIILLIIL("switch_turn_animation_color");
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItem2.switchTurnAnimationColor);
        c09dl.LJIILLIIL("contribute_list_color");
        typeAdapterLJIIJ.write(c09dl, liveTakeTheStageColorItem2.contributeListColor);
        c09dl.LJII();
    }
}
