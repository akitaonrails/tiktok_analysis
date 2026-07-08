package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class InteractionConfiguration_OptTypeAdapter extends TypeAdapter<InteractionConfiguration> {
    public final Gson LIZ;

    public InteractionConfiguration_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InteractionConfiguration read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InteractionConfiguration interactionConfiguration = new InteractionConfiguration(new LinkedHashMap(), "", 0, new LinkedHashMap());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -995427962:
                        if (strLJJJJ.equals("params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionConfiguration.params = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -907987551:
                        if (strLJJJJ.equals("schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionConfiguration.schema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -388089439:
                        if (strLJJJJ.equals("effective_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionConfiguration.effectiveDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 956646091:
                        if (strLJJJJ.equals("event_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                interactionConfiguration.eventParams = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
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
        return interactionConfiguration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InteractionConfiguration interactionConfiguration) {
        InteractionConfiguration interactionConfiguration2 = interactionConfiguration;
        if (interactionConfiguration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("event_params");
        C473040Igo.LJ(this.LIZ, c09dl, interactionConfiguration2.eventParams, String.class);
        c09dl.LJIILLIIL("schema");
        c09dl.LJJJJJ(interactionConfiguration2.schema);
        c09dl.LJIILLIIL("effective_delay_time");
        c09dl.LJJJJ(Integer.valueOf(interactionConfiguration2.effectiveDelayTime));
        c09dl.LJIILLIIL("params");
        C473040Igo.LJ(this.LIZ, c09dl, interactionConfiguration2.params, String.class);
        c09dl.LJII();
    }
}
