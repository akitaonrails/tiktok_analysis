package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostProduceConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRepostProduceConfig_ProduceGroupConfig_OptTypeAdapter extends TypeAdapter<LiveRepostProduceConfig.ProduceGroupConfig> {
    public final Gson LIZ;

    public LiveRepostProduceConfig_ProduceGroupConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRepostProduceConfig.ProduceGroupConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRepostProduceConfig.ProduceGroupConfig produceGroupConfig = new LiveRepostProduceConfig.ProduceGroupConfig(true, true, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1790302748:
                        if (strLJJJJ.equals("repost_bubble_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                produceGroupConfig.repostBubbleShow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -768114130:
                        if (strLJJJJ.equals("repost_produce_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                produceGroupConfig.repostProduceEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -150725695:
                        if (strLJJJJ.equals("repost_education_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                produceGroupConfig.repostEducationPanel = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1723858119:
                        if (strLJJJJ.equals("repost_like_icon_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                produceGroupConfig.selfLikeIconShow = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2109327768:
                        if (strLJJJJ.equals("repost_see_myself_message")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                produceGroupConfig.myselfMessage = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return produceGroupConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRepostProduceConfig.ProduceGroupConfig produceGroupConfig) throws IOException {
        LiveRepostProduceConfig.ProduceGroupConfig produceGroupConfig2 = produceGroupConfig;
        if (produceGroupConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("repost_produce_enable");
        c09dl.LJJJJJL(produceGroupConfig2.repostProduceEnable);
        c09dl.LJIILLIIL("repost_see_myself_message");
        c09dl.LJJJJJL(produceGroupConfig2.myselfMessage);
        c09dl.LJIILLIIL("repost_like_icon_show");
        c09dl.LJJJJJL(produceGroupConfig2.selfLikeIconShow);
        c09dl.LJIILLIIL("repost_bubble_show");
        c09dl.LJJJJJL(produceGroupConfig2.repostBubbleShow);
        c09dl.LJIILLIIL("repost_education_panel");
        c09dl.LJJJJJL(produceGroupConfig2.repostEducationPanel);
        c09dl.LJII();
    }
}
