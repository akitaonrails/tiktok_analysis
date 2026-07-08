package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TextConfig_OptTypeAdapter extends TypeAdapter<TextConfig> {
    public final Gson LIZ;

    public TextConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TextConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TextConfig textConfig = new TextConfig("", "", null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -794388590) {
                    if (iHashCode != 106079) {
                        if (iHashCode == 1779155893 && strLJJJJ.equals("default_format")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textConfig.defaultFormat = (TextFormat) this.LIZ.LJIIJ(TextFormat.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("key")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            textConfig.key = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("default_pattern")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        textConfig.defaultPattern = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return textConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TextConfig textConfig) {
        TextConfig textConfig2 = textConfig;
        if (textConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("key");
        c09dl.LJJJJJ(textConfig2.key);
        c09dl.LJIILLIIL("default_pattern");
        c09dl.LJJJJJ(textConfig2.defaultPattern);
        c09dl.LJIILLIIL("default_format");
        this.LIZ.LJIIJ(TextFormat.class).write(c09dl, textConfig2.defaultFormat);
        c09dl.LJII();
    }
}
