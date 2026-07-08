package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class SchemaConfig_OptTypeAdapter extends TypeAdapter<SchemaConfig> {
    public final Gson LIZ;

    public SchemaConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SchemaConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SchemaConfig schemaConfig = new SchemaConfig(null, "aweme://roma_redirect/?spark_page=fan_club_user_join&roma_group_key=spark_page_fan_club_user_join&roma_page_key=p", true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1354792126) {
                    if (iHashCode != -889473228) {
                        if (iHashCode == 1514666804 && strLJJJJ.equals("join_page_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaConfig.joinDialogSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("switch")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            schemaConfig.f32switch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        schemaConfig.configs = C473040Igo.LIZ(this.LIZ, c09cu, ParamConfig.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return schemaConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SchemaConfig schemaConfig) throws IOException {
        SchemaConfig schemaConfig2 = schemaConfig;
        if (schemaConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, schemaConfig2.configs, ParamConfig.class);
        c09dl.LJIILLIIL("join_page_url");
        c09dl.LJJJJJ(schemaConfig2.joinDialogSchema);
        c09dl.LJIILLIIL("switch");
        c09dl.LJJJJJL(schemaConfig2.f32switch);
        c09dl.LJII();
    }
}
