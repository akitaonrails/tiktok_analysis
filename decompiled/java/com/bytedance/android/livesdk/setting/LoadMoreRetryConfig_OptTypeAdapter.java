package com.bytedance.android.livesdk.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LoadMoreRetryConfig_OptTypeAdapter extends TypeAdapter<LoadMoreRetryConfig> {
    public final Gson LIZ;

    public LoadMoreRetryConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LoadMoreRetryConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LoadMoreRetryConfig loadMoreRetryConfig = new LoadMoreRetryConfig(false, C1697810uHb.LJIIJJI("homepage_hot_live_cell", "homepage_hot_video_head"), false, false, 0, 0L, 0, 0L, false, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2130561205:
                        if (strLJJJJ.equals("backup_data_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.backupDataDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1313911455:
                        if (strLJJJJ.equals("timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.timeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1086485169:
                        if (strLJJJJ.equals("use_backup_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.useBackupData = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -928040776:
                        if (strLJJJJ.equals("retry_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.retryCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -500773763:
                        if (strLJJJJ.equals("entrances")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.entrances = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -216806399:
                        if (strLJJJJ.equals("min_network_quality")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.minNetworkQuality = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 384266364:
                        if (strLJJJJ.equals("retry_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.retryInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 407983819:
                        if (strLJJJJ.equals("expand_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.expandParams = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1062837651:
                        if (strLJJJJ.equals("retry_when_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loadMoreRetryConfig.retryWhenTimeout = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return loadMoreRetryConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LoadMoreRetryConfig loadMoreRetryConfig) throws IOException {
        LoadMoreRetryConfig loadMoreRetryConfig2 = loadMoreRetryConfig;
        if (loadMoreRetryConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(loadMoreRetryConfig2.enable);
        c09dl.LJIILLIIL("entrances");
        C473040Igo.LIZLLL(this.LIZ, c09dl, loadMoreRetryConfig2.entrances, String.class);
        c09dl.LJIILLIIL("retry_when_timeout");
        c09dl.LJJJJJL(loadMoreRetryConfig2.retryWhenTimeout);
        c09dl.LJIILLIIL("expand_params");
        c09dl.LJJJJJL(loadMoreRetryConfig2.expandParams);
        c09dl.LJIILLIIL("min_network_quality");
        c09dl.LJJJJ(Integer.valueOf(loadMoreRetryConfig2.minNetworkQuality));
        c09dl.LJIILLIIL("timeout");
        c09dl.LJJIZ(loadMoreRetryConfig2.timeout);
        c09dl.LJIILLIIL("retry_count");
        c09dl.LJJJJ(Integer.valueOf(loadMoreRetryConfig2.retryCount));
        c09dl.LJIILLIIL("retry_interval");
        c09dl.LJJIZ(loadMoreRetryConfig2.retryInterval);
        c09dl.LJIILLIIL("use_backup_data");
        c09dl.LJJJJJL(loadMoreRetryConfig2.useBackupData);
        c09dl.LJIILLIIL("backup_data_delay");
        c09dl.LJJIZ(loadMoreRetryConfig2.backupDataDelay);
        c09dl.LJII();
    }
}
