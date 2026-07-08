package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkReuseConfig_OptTypeAdapter extends TypeAdapter<SparkReuseConfig> {
    public final Gson LIZ;

    public SparkReuseConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SparkReuseConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SparkReuseConfig sparkReuseConfig = new SparkReuseConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkReuseConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -810883302:
                        if (strLJJJJ.equals("volume")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkReuseConfig.volume = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -126600503:
                        if (strLJJJJ.equals("deny_schema_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkReuseConfig.denySchemaList = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 97555:
                        if (strLJJJJ.equals("biz")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkReuseConfig.biz = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 255323270:
                        if (strLJJJJ.equals("allow_schema_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkReuseConfig.allowSchemaList = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1344097533:
                        if (strLJJJJ.equals("expired_time_in_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkReuseConfig.expiredTimeInSeconds = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1865206070:
                        if (strLJJJJ.equals("match_rule")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkReuseConfig.matchRule = c09cu.LJJIZ();
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
        return sparkReuseConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SparkReuseConfig sparkReuseConfig) throws IOException {
        SparkReuseConfig sparkReuseConfig2 = sparkReuseConfig;
        if (sparkReuseConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(sparkReuseConfig2.enable);
        c09dl.LJIILLIIL("volume");
        c09dl.LJJJJ(Integer.valueOf(sparkReuseConfig2.volume));
        c09dl.LJIILLIIL("biz");
        c09dl.LJJJJJ(sparkReuseConfig2.biz);
        c09dl.LJIILLIIL("expired_time_in_seconds");
        c09dl.LJJJJ(Integer.valueOf(sparkReuseConfig2.expiredTimeInSeconds));
        c09dl.LJIILLIIL("allow_schema_list");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(String[].class);
        typeAdapterLJIIJ.write(c09dl, sparkReuseConfig2.allowSchemaList);
        c09dl.LJIILLIIL("deny_schema_list");
        typeAdapterLJIIJ.write(c09dl, sparkReuseConfig2.denySchemaList);
        c09dl.LJIILLIIL("match_rule");
        c09dl.LJJJJ(Integer.valueOf(sparkReuseConfig2.matchRule));
        c09dl.LJII();
    }
}
