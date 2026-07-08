package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TtlivePlayTogetherSchemaSetting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class TtlivePlayTogetherSchemaSetting_GamePlayTogetherSchema_OptTypeAdapter extends TypeAdapter<TtlivePlayTogetherSchemaSetting.GamePlayTogetherSchema> {
    @Override // com.google.gson.TypeAdapter
    public final TtlivePlayTogetherSchemaSetting.GamePlayTogetherSchema read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TtlivePlayTogetherSchemaSetting.GamePlayTogetherSchema gamePlayTogetherSchema = new TtlivePlayTogetherSchemaSetting.GamePlayTogetherSchema();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -981448387) {
                    if (iHashCode != 1744784681) {
                        if (iHashCode == 1754016574 && strLJJJJ.equals("creator_queue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gamePlayTogetherSchema.creatprQueueSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("creator_guide")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gamePlayTogetherSchema.creatorGuideSchema = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("creator_setting")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gamePlayTogetherSchema.creatorSettingSchema = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gamePlayTogetherSchema;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TtlivePlayTogetherSchemaSetting.GamePlayTogetherSchema gamePlayTogetherSchema) {
        TtlivePlayTogetherSchemaSetting.GamePlayTogetherSchema gamePlayTogetherSchema2 = gamePlayTogetherSchema;
        if (gamePlayTogetherSchema2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("creator_guide");
        c09dl.LJJJJJ(gamePlayTogetherSchema2.creatorGuideSchema);
        c09dl.LJIILLIIL("creator_setting");
        c09dl.LJJJJJ(gamePlayTogetherSchema2.creatorSettingSchema);
        c09dl.LJIILLIIL("creator_queue");
        c09dl.LJJJJJ(gamePlayTogetherSchema2.creatprQueueSchema);
        c09dl.LJII();
    }
}
