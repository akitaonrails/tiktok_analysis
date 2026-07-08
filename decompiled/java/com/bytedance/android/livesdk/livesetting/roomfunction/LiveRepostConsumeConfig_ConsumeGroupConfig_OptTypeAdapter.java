package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostConsumeConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRepostConsumeConfig_ConsumeGroupConfig_OptTypeAdapter extends TypeAdapter<LiveRepostConsumeConfig.ConsumeGroupConfig> {
    public final Gson LIZ;

    public LiveRepostConsumeConfig_ConsumeGroupConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRepostConsumeConfig.ConsumeGroupConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRepostConsumeConfig.ConsumeGroupConfig consumeGroupConfig = new LiveRepostConsumeConfig.ConsumeGroupConfig(true, new LiveRepostConsumeConfig.ConsumeAudienceGroupConfig(true, true, true), new LiveRepostConsumeConfig.ConsumeAnchorGroupConfig(true, true, true));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -683489495) {
                    if (iHashCode != 181164946) {
                        if (iHashCode == 1344244568 && strLJJJJ.equals("repost_anchor_message_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                consumeGroupConfig.consumeAnchorGroupConfig = (LiveRepostConsumeConfig.ConsumeAnchorGroupConfig) this.LIZ.LJIIJ(LiveRepostConsumeConfig.ConsumeAnchorGroupConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("repost_consume_enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            consumeGroupConfig.repostConsumeEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("repost_audience_message_config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        consumeGroupConfig.consumeAudienceGroupConfig = (LiveRepostConsumeConfig.ConsumeAudienceGroupConfig) this.LIZ.LJIIJ(LiveRepostConsumeConfig.ConsumeAudienceGroupConfig.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return consumeGroupConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRepostConsumeConfig.ConsumeGroupConfig consumeGroupConfig) throws IOException {
        LiveRepostConsumeConfig.ConsumeGroupConfig consumeGroupConfig2 = consumeGroupConfig;
        if (consumeGroupConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("repost_consume_enable");
        c09dl.LJJJJJL(consumeGroupConfig2.repostConsumeEnable);
        c09dl.LJIILLIIL("repost_audience_message_config");
        this.LIZ.LJIIJ(LiveRepostConsumeConfig.ConsumeAudienceGroupConfig.class).write(c09dl, consumeGroupConfig2.consumeAudienceGroupConfig);
        c09dl.LJIILLIIL("repost_anchor_message_config");
        this.LIZ.LJIIJ(LiveRepostConsumeConfig.ConsumeAnchorGroupConfig.class).write(c09dl, consumeGroupConfig2.consumeAnchorGroupConfig);
        c09dl.LJII();
    }
}
