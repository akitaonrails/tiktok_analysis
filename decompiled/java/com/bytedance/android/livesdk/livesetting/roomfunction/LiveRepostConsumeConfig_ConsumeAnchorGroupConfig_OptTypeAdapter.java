package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostConsumeConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRepostConsumeConfig_ConsumeAnchorGroupConfig_OptTypeAdapter extends TypeAdapter<LiveRepostConsumeConfig.ConsumeAnchorGroupConfig> {
    public final Gson LIZ;

    public LiveRepostConsumeConfig_ConsumeAnchorGroupConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRepostConsumeConfig.ConsumeAnchorGroupConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRepostConsumeConfig.ConsumeAnchorGroupConfig consumeAnchorGroupConfig = new LiveRepostConsumeConfig.ConsumeAnchorGroupConfig(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1014938651) {
                    if (iHashCode != -338240835) {
                        if (iHashCode == 1614338637 && strLJJJJ.equals("anchor_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                consumeAnchorGroupConfig.anchorEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("anchor_repost_like_icon_show")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            consumeAnchorGroupConfig.anchorLikeIcon = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("anchor_repost_message")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        consumeAnchorGroupConfig.anchorRepostMessage = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return consumeAnchorGroupConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRepostConsumeConfig.ConsumeAnchorGroupConfig consumeAnchorGroupConfig) throws IOException {
        LiveRepostConsumeConfig.ConsumeAnchorGroupConfig consumeAnchorGroupConfig2 = consumeAnchorGroupConfig;
        if (consumeAnchorGroupConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anchor_enable");
        c09dl.LJJJJJL(consumeAnchorGroupConfig2.anchorEnable);
        c09dl.LJIILLIIL("anchor_repost_message");
        c09dl.LJJJJJL(consumeAnchorGroupConfig2.anchorRepostMessage);
        c09dl.LJIILLIIL("anchor_repost_like_icon_show");
        c09dl.LJJJJJL(consumeAnchorGroupConfig2.anchorLikeIcon);
        c09dl.LJII();
    }
}
