package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostConsumeConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRepostConsumeConfig_ConsumeAudienceGroupConfig_OptTypeAdapter extends TypeAdapter<LiveRepostConsumeConfig.ConsumeAudienceGroupConfig> {
    public final Gson LIZ;

    public LiveRepostConsumeConfig_ConsumeAudienceGroupConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRepostConsumeConfig.ConsumeAudienceGroupConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRepostConsumeConfig.ConsumeAudienceGroupConfig consumeAudienceGroupConfig = new LiveRepostConsumeConfig.ConsumeAudienceGroupConfig(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -173560802) {
                    if (iHashCode != 705668331) {
                        if (iHashCode == 1809281399 && strLJJJJ.equals("others_repost_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                consumeAudienceGroupConfig.othersRepostMessage = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("others_repost_like_icon_show")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            consumeAudienceGroupConfig.othersLikeIcon = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("audience_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        consumeAudienceGroupConfig.audienceEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return consumeAudienceGroupConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRepostConsumeConfig.ConsumeAudienceGroupConfig consumeAudienceGroupConfig) throws IOException {
        LiveRepostConsumeConfig.ConsumeAudienceGroupConfig consumeAudienceGroupConfig2 = consumeAudienceGroupConfig;
        if (consumeAudienceGroupConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("audience_enable");
        c09dl.LJJJJJL(consumeAudienceGroupConfig2.audienceEnable);
        c09dl.LJIILLIIL("others_repost_message");
        c09dl.LJJJJJL(consumeAudienceGroupConfig2.othersRepostMessage);
        c09dl.LJIILLIIL("others_repost_like_icon_show");
        c09dl.LJJJJJL(consumeAudienceGroupConfig2.othersLikeIcon);
        c09dl.LJII();
    }
}
