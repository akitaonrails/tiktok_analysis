package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TtlivePlayTogetherSchemaV2Setting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class TtlivePlayTogetherSchemaV2Setting_GamePlayTogetherSchemaV2_OptTypeAdapter extends TypeAdapter<TtlivePlayTogetherSchemaV2Setting.GamePlayTogetherSchemaV2> {
    @Override // com.google.gson.TypeAdapter
    public final TtlivePlayTogetherSchemaV2Setting.GamePlayTogetherSchemaV2 read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TtlivePlayTogetherSchemaV2Setting.GamePlayTogetherSchemaV2 gamePlayTogetherSchemaV2 = new TtlivePlayTogetherSchemaV2Setting.GamePlayTogetherSchemaV2();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -981448387) {
                    if (iHashCode != 1744784681) {
                        if (iHashCode == 1754016574 && strLJJJJ.equals("creator_queue")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gamePlayTogetherSchemaV2.creatorQueueSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("creator_guide")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gamePlayTogetherSchemaV2.creatorGuideSchema = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("creator_setting")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gamePlayTogetherSchemaV2.creatorSettingSchema = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gamePlayTogetherSchemaV2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TtlivePlayTogetherSchemaV2Setting.GamePlayTogetherSchemaV2 gamePlayTogetherSchemaV2) {
        TtlivePlayTogetherSchemaV2Setting.GamePlayTogetherSchemaV2 gamePlayTogetherSchemaV22 = gamePlayTogetherSchemaV2;
        if (gamePlayTogetherSchemaV22 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("creator_guide");
        c09dl.LJJJJJ(gamePlayTogetherSchemaV22.creatorGuideSchema);
        c09dl.LJIILLIIL("creator_setting");
        c09dl.LJJJJJ(gamePlayTogetherSchemaV22.creatorSettingSchema);
        c09dl.LJIILLIIL("creator_queue");
        c09dl.LJJJJJ(gamePlayTogetherSchemaV22.creatorQueueSchema);
        c09dl.LJII();
    }
}
