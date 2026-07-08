package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ContentConfiguration_OptTypeAdapter extends TypeAdapter<ContentConfiguration> {
    public final Gson LIZ;

    public ContentConfiguration_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ContentConfiguration read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ContentConfiguration contentConfiguration = new ContentConfiguration(null, null, 0, 0, 0, 0, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1321767224:
                        if (strLJJJJ.equals("effect_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.effectConfiguration = (EffectConfig) this.LIZ.LJIIJ(EffectConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1264345041:
                        if (strLJJJJ.equals("container_right_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.marginRight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1160944042:
                        if (strLJJJJ.equals("container_top_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.marginTop = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -974850453:
                        if (strLJJJJ.equals("text_color_array")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.textColorArray = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3226745:
                        if (strLJJJJ.equals("icon")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.icon = (IconConfig) this.LIZ.LJIIJ(IconConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3556653:
                        if (strLJJJJ.equals("text")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.text = (TextConfig) this.LIZ.LJIIJ(TextConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 550165252:
                        if (strLJJJJ.equals("container_bottom_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.marginBottom = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1453329960:
                        if (strLJJJJ.equals("container_left_margin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                contentConfiguration.marginLeft = c09cu.LJJIZ();
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
        return contentConfiguration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ContentConfiguration contentConfiguration) {
        ContentConfiguration contentConfiguration2 = contentConfiguration;
        if (contentConfiguration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("text");
        this.LIZ.LJIIJ(TextConfig.class).write(c09dl, contentConfiguration2.text);
        c09dl.LJIILLIIL("icon");
        this.LIZ.LJIIJ(IconConfig.class).write(c09dl, contentConfiguration2.icon);
        c09dl.LJIILLIIL("container_left_margin");
        c09dl.LJJJJ(Integer.valueOf(contentConfiguration2.marginLeft));
        c09dl.LJIILLIIL("container_right_margin");
        c09dl.LJJJJ(Integer.valueOf(contentConfiguration2.marginRight));
        c09dl.LJIILLIIL("container_top_margin");
        c09dl.LJJJJ(Integer.valueOf(contentConfiguration2.marginTop));
        c09dl.LJIILLIIL("container_bottom_margin");
        c09dl.LJJJJ(Integer.valueOf(contentConfiguration2.marginBottom));
        c09dl.LJIILLIIL("effect_configuration");
        this.LIZ.LJIIJ(EffectConfig.class).write(c09dl, contentConfiguration2.effectConfiguration);
        c09dl.LJIILLIIL("text_color_array");
        C473040Igo.LIZLLL(this.LIZ, c09dl, contentConfiguration2.textColorArray, String.class);
        c09dl.LJII();
    }
}
