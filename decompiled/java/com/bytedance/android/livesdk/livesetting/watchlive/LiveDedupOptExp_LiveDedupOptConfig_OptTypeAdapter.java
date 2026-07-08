package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveDedupOptExp_LiveDedupOptConfig_OptTypeAdapter extends TypeAdapter<LiveDedupOptExp.LiveDedupOptConfig> {
    public final Gson LIZ;

    public LiveDedupOptExp_LiveDedupOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveDedupOptExp.LiveDedupOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveDedupOptExp.LiveDedupOptConfig liveDedupOptConfig = new LiveDedupOptExp.LiveDedupOptConfig(false, false, 20, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDedupOptConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 124472189:
                        if (strLJJJJ.equals("save_feature_when_leave_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDedupOptConfig.saveFeatureWhenLeaveRoom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 355137277:
                        if (strLJJJJ.equals("cacheForColdBoot")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDedupOptConfig.cacheForColdBoot = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1099134828:
                        if (strLJJJJ.equals("consume_record_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDedupOptConfig.consumeRecordSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1287462488:
                        if (strLJJJJ.equals("unread_disable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDedupOptConfig.unreadDisable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveDedupOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDedupOptExp.LiveDedupOptConfig liveDedupOptConfig) throws IOException {
        LiveDedupOptExp.LiveDedupOptConfig liveDedupOptConfig2 = liveDedupOptConfig;
        if (liveDedupOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveDedupOptConfig2.enable);
        c09dl.LJIILLIIL("unread_disable");
        c09dl.LJJJJJL(liveDedupOptConfig2.unreadDisable);
        c09dl.LJIILLIIL("consume_record_size");
        c09dl.LJJJJ(Integer.valueOf(liveDedupOptConfig2.consumeRecordSize));
        c09dl.LJIILLIIL("cacheForColdBoot");
        c09dl.LJJJJJL(liveDedupOptConfig2.cacheForColdBoot);
        c09dl.LJIILLIIL("save_feature_when_leave_room");
        c09dl.LJJJJJL(liveDedupOptConfig2.saveFeatureWhenLeaveRoom);
        c09dl.LJII();
    }
}
