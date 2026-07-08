package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractionLayoutNewEventConfig_OptTypeAdapter extends TypeAdapter<InteractionLayoutNewEventConfig> {
    public final Gson LIZ;

    public InteractionLayoutNewEventConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InteractionLayoutNewEventConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InteractionLayoutNewEventConfig interactionLayoutNewEventConfig = new InteractionLayoutNewEventConfig(true, C1697810uHb.LJ("biz_link_mic_view_p", "biz_gameplay_view_p", "biz_gameplay_view_p", "biz_score_bar", "biz_contributor"), 3, 3000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1390126163:
                        if (strLJJJJ.equals("draw_result_frame_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionLayoutNewEventConfig.drawResultFrameTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionLayoutNewEventConfig.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1732409310:
                        if (strLJJJJ.equals("monitor_tags")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionLayoutNewEventConfig.monitorTags = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2088371960:
                        if (strLJJJJ.equals("layout_pipeline_stage_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionLayoutNewEventConfig.layoutPipelineStageTimeout = c09cu.LJJJ();
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
        return interactionLayoutNewEventConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InteractionLayoutNewEventConfig interactionLayoutNewEventConfig) throws IOException {
        InteractionLayoutNewEventConfig interactionLayoutNewEventConfig2 = interactionLayoutNewEventConfig;
        if (interactionLayoutNewEventConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(interactionLayoutNewEventConfig2.isEnabled);
        c09dl.LJIILLIIL("monitor_tags");
        C473040Igo.LIZLLL(this.LIZ, c09dl, interactionLayoutNewEventConfig2.monitorTags, String.class);
        c09dl.LJIILLIIL("draw_result_frame_times");
        c09dl.LJJJJ(Integer.valueOf(interactionLayoutNewEventConfig2.drawResultFrameTimes));
        c09dl.LJIILLIIL("layout_pipeline_stage_timeout");
        c09dl.LJJIZ(interactionLayoutNewEventConfig2.layoutPipelineStageTimeout);
        c09dl.LJII();
    }
}
