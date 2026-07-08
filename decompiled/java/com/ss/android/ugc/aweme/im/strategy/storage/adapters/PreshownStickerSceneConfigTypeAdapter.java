package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PreshownStickerSceneConfigTypeAdapter extends TypeAdapter<PreshownStickerSceneConfig> {
    public final Gson LIZ;

    public PreshownStickerSceneConfigTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PreshownStickerSceneConfig read(C09CU c09cu) {
        c09cu.LIZIZ();
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        ArrayList arrayList = null;
        Boolean boolValueOf = null;
        Integer numValueOf = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1326324723:
                        if (strLJJJJ.equals("preshown_sticker_items")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                arrayList = new ArrayList();
                                c09cu.LIZ();
                                while (c09cu.LJIIZILJ()) {
                                    arrayList.add(this.LIZ.LJIIJ(PreshownStickerItem.class).read(c09cu));
                                }
                                c09cu.LJI();
                            }
                        }
                        break;
                    case -1057664125:
                        if (strLJJJJ.equals("display_stickers_count")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                numValueOf = Integer.valueOf(c09cu.LJJIZ());
                            }
                        }
                        break;
                    case -775488082:
                        if (strLJJJJ.equals("scene_id")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 35505072:
                        if (strLJJJJ.equals("should_randomize_stickers")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                boolValueOf = Boolean.valueOf(c09cu.LJJ());
                            }
                        }
                        break;
                    case 950214929:
                        if (strLJJJJ.equals("sender_copy_string")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new PreshownStickerSceneConfig(strLJJJZ, strLJJJZ2, arrayList, boolValueOf, numValueOf);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreshownStickerSceneConfig preshownStickerSceneConfig) {
        PreshownStickerSceneConfig preshownStickerSceneConfig2 = preshownStickerSceneConfig;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("scene_id");
        c09dl.LJJJJJ(preshownStickerSceneConfig2.sceneId);
        c09dl.LJIILLIIL("sender_copy_string");
        c09dl.LJJJJJ(preshownStickerSceneConfig2.headerText);
        c09dl.LJIILLIIL("preshown_sticker_items");
        if (preshownStickerSceneConfig2.preshownStickerItem == null) {
            c09dl.LJIJJ();
        } else {
            c09dl.LIZIZ();
            List<PreshownStickerItem> list = preshownStickerSceneConfig2.preshownStickerItem;
            if (list != null) {
                Iterator<PreshownStickerItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    this.LIZ.LJIIJ(PreshownStickerItem.class).write(c09dl, it2.next());
                }
            }
            c09dl.LJI();
        }
        c09dl.LJIILLIIL("should_randomize_stickers");
        c09dl.LJJJ(preshownStickerSceneConfig2.shouldRandomizeStickers);
        c09dl.LJIILLIIL("display_stickers_count");
        c09dl.LJJJJ(preshownStickerSceneConfig2.displayStickersCount);
        c09dl.LJII();
    }
}
