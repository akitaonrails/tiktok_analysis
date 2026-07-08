package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveAISummaryBoardUsageConfig_OptTypeAdapter extends TypeAdapter<LiveAISummaryBoardUsageConfig> {
    public final Gson LIZ;

    public LiveAISummaryBoardUsageConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAISummaryBoardUsageConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAISummaryBoardUsageConfig liveAISummaryBoardUsageConfig = new LiveAISummaryBoardUsageConfig(false, 0, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -714102427) {
                    if (iHashCode != 287472310) {
                        if (iHashCode == 1333521080 && strLJJJJ.equals("broadcast_dialog_style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAISummaryBoardUsageConfig.setBroadcastDialogStyle(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("preview_keep_old_style")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveAISummaryBoardUsageConfig.setPreviewKeepOldStyle(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("ai_summary_usage_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveAISummaryBoardUsageConfig.setAiSummaryUsageOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveAISummaryBoardUsageConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAISummaryBoardUsageConfig liveAISummaryBoardUsageConfig) throws IOException {
        LiveAISummaryBoardUsageConfig liveAISummaryBoardUsageConfig2 = liveAISummaryBoardUsageConfig;
        if (liveAISummaryBoardUsageConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ai_summary_usage_opt");
        c09dl.LJJJJJL(liveAISummaryBoardUsageConfig2.getAiSummaryUsageOpt());
        c09dl.LJIILLIIL("broadcast_dialog_style");
        c09dl.LJJJJ(Integer.valueOf(liveAISummaryBoardUsageConfig2.getBroadcastDialogStyle()));
        c09dl.LJIILLIIL("preview_keep_old_style");
        c09dl.LJJJJJL(liveAISummaryBoardUsageConfig2.getPreviewKeepOldStyle());
        c09dl.LJII();
    }
}
