package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridPopupMigrateSparkLiteSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHybridPopupMigrateSparkLiteSetting_MigrateConfig_OptTypeAdapter extends TypeAdapter<LiveHybridPopupMigrateSparkLiteSetting.MigrateConfig> {
    public final Gson LIZ;

    public LiveHybridPopupMigrateSparkLiteSetting_MigrateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveHybridPopupMigrateSparkLiteSetting.MigrateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHybridPopupMigrateSparkLiteSetting.MigrateConfig migrateConfig = new LiveHybridPopupMigrateSparkLiteSetting.MigrateConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1611763523) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == -1236166923 && strLJJJJ.equals("enable_strict_plugin_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                migrateConfig.enableStrictPluginMode = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            migrateConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("preload_and_decode_resource_deferred")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        migrateConfig.preloadAndDecodeResourceDeferred = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return migrateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHybridPopupMigrateSparkLiteSetting.MigrateConfig migrateConfig) throws IOException {
        LiveHybridPopupMigrateSparkLiteSetting.MigrateConfig migrateConfig2 = migrateConfig;
        if (migrateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(migrateConfig2.enable);
        c09dl.LJIILLIIL("enable_strict_plugin_mode");
        c09dl.LJJJJJL(migrateConfig2.enableStrictPluginMode);
        c09dl.LJIILLIIL("preload_and_decode_resource_deferred");
        c09dl.LJJJJJL(migrateConfig2.preloadAndDecodeResourceDeferred);
        c09dl.LJII();
    }
}
