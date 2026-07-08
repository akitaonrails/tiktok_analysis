package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveOutSourceConfig_OptTypeAdapter extends TypeAdapter<LiveOutSourceConfig> {
    public final Gson LIZ;

    public LiveOutSourceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveOutSourceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveOutSourceConfig liveOutSourceConfig = new LiveOutSourceConfig(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1786073791) {
                    if (iHashCode != -690621446) {
                        if (iHashCode == -597808597 && strLJJJJ.equals("fix_item_position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveOutSourceConfig.setFixGetItemPos(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("fix_delete_card")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveOutSourceConfig.setFixDeleteCard(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("fix_preview_stream")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveOutSourceConfig.setFixPreviewStream(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveOutSourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveOutSourceConfig liveOutSourceConfig) throws IOException {
        LiveOutSourceConfig liveOutSourceConfig2 = liveOutSourceConfig;
        if (liveOutSourceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fix_delete_card");
        c09dl.LJJJJJL(liveOutSourceConfig2.getFixDeleteCard());
        c09dl.LJIILLIIL("fix_item_position");
        c09dl.LJJJJJL(liveOutSourceConfig2.getFixGetItemPos());
        c09dl.LJIILLIIL("fix_preview_stream");
        c09dl.LJJJJJL(liveOutSourceConfig2.getFixPreviewStream());
        c09dl.LJII();
    }
}
