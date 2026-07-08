package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DisplayConfiguration_OptTypeAdapter extends TypeAdapter<DisplayConfiguration> {
    public final Gson LIZ;

    public DisplayConfiguration_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DisplayConfiguration read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DisplayConfiguration displayConfiguration = new DisplayConfiguration(0, 0, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1992012396:
                        if (strLJJJJ.equals("duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                displayConfiguration.duration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -237433463:
                        if (strLJJJJ.equals("interaction_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                displayConfiguration.interactionConfiguration = (InteractionConfiguration) this.LIZ.LJIIJ(InteractionConfiguration.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -180013089:
                        if (strLJJJJ.equals("template_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                displayConfiguration.templateType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2067968944:
                        if (strLJJJJ.equals("content_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                displayConfiguration.contentConfiguration = (ContentConfiguration) this.LIZ.LJIIJ(ContentConfiguration.class).read(c09cu);
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
        return displayConfiguration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DisplayConfiguration displayConfiguration) {
        DisplayConfiguration displayConfiguration2 = displayConfiguration;
        if (displayConfiguration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("template_type");
        c09dl.LJJJJ(Integer.valueOf(displayConfiguration2.templateType));
        c09dl.LJIILLIIL("duration");
        c09dl.LJJJJ(Integer.valueOf(displayConfiguration2.duration));
        c09dl.LJIILLIIL("content_configuration");
        this.LIZ.LJIIJ(ContentConfiguration.class).write(c09dl, displayConfiguration2.contentConfiguration);
        c09dl.LJIILLIIL("interaction_configuration");
        this.LIZ.LJIIJ(InteractionConfiguration.class).write(c09dl, displayConfiguration2.interactionConfiguration);
        c09dl.LJII();
    }
}
