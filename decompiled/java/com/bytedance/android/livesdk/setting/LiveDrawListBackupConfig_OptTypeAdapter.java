package com.bytedance.android.livesdk.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDrawListBackupConfig_OptTypeAdapter extends TypeAdapter<LiveDrawListBackupConfig> {
    public final Gson LIZ;

    public LiveDrawListBackupConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveDrawListBackupConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveDrawListBackupConfig liveDrawListBackupConfig = new LiveDrawListBackupConfig(false, false, false, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDrawListBackupConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 650549340:
                        if (strLJJJJ.equals("use_skylight_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDrawListBackupConfig.useSkylightData = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1731831763:
                        if (strLJJJJ.equals("request_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDrawListBackupConfig.requestDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2049530099:
                        if (strLJJJJ.equals("use_feed_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDrawListBackupConfig.useFeedData = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveDrawListBackupConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDrawListBackupConfig liveDrawListBackupConfig) throws IOException {
        LiveDrawListBackupConfig liveDrawListBackupConfig2 = liveDrawListBackupConfig;
        if (liveDrawListBackupConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveDrawListBackupConfig2.enable);
        c09dl.LJIILLIIL("use_skylight_data");
        c09dl.LJJJJJL(liveDrawListBackupConfig2.useSkylightData);
        c09dl.LJIILLIIL("use_feed_data");
        c09dl.LJJJJJL(liveDrawListBackupConfig2.useFeedData);
        c09dl.LJIILLIIL("request_delay");
        c09dl.LJJIZ(liveDrawListBackupConfig2.requestDelay);
        c09dl.LJII();
    }
}
