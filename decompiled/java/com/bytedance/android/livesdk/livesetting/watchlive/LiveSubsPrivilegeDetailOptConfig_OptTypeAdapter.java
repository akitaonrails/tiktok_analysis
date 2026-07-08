package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveSubsPrivilegeDetailOptConfig_OptTypeAdapter extends TypeAdapter<LiveSubsPrivilegeDetailOptConfig> {
    public final Gson LIZ;

    public LiveSubsPrivilegeDetailOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSubsPrivilegeDetailOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig = new LiveSubsPrivilegeDetailOptConfig(false, null, new ArrayList(), new ArrayList(), true, 2000L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1972341613:
                        if (strLJJJJ.equals("preload_data_idle")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubsPrivilegeDetailOptConfig.preloadDataIdle = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1956700211:
                        if (strLJJJJ.equals("preload_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubsPrivilegeDetailOptConfig.preloadDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -100689769:
                        if (strLJJJJ.equals("preload_schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubsPrivilegeDetailOptConfig.preloadSchema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 329999306:
                        if (strLJJJJ.equals("preload_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubsPrivilegeDetailOptConfig.preloadAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 417997570:
                        if (strLJJJJ.equals("enable_preload_reuse")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubsPrivilegeDetailOptConfig.enablePreloadReuse = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1068943999:
                        if (strLJJJJ.equals("reuse_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubsPrivilegeDetailOptConfig.reuseAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1435758100:
                        if (strLJJJJ.equals("ignore_failed_preload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubsPrivilegeDetailOptConfig.ignoreFailedPreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveSubsPrivilegeDetailOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig) throws IOException {
        LiveSubsPrivilegeDetailOptConfig liveSubsPrivilegeDetailOptConfig2 = liveSubsPrivilegeDetailOptConfig;
        if (liveSubsPrivilegeDetailOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_preload_reuse");
        c09dl.LJJJJJL(liveSubsPrivilegeDetailOptConfig2.enablePreloadReuse);
        c09dl.LJIILLIIL("preload_schema");
        c09dl.LJJJJJ(liveSubsPrivilegeDetailOptConfig2.preloadSchema);
        c09dl.LJIILLIIL("reuse_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveSubsPrivilegeDetailOptConfig2.reuseAllowList, String.class);
        c09dl.LJIILLIIL("preload_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveSubsPrivilegeDetailOptConfig2.preloadAllowList, String.class);
        c09dl.LJIILLIIL("ignore_failed_preload");
        c09dl.LJJJJJL(liveSubsPrivilegeDetailOptConfig2.ignoreFailedPreload);
        c09dl.LJIILLIIL("preload_delay");
        c09dl.LJJIZ(liveSubsPrivilegeDetailOptConfig2.preloadDelay);
        c09dl.LJIILLIIL("preload_data_idle");
        c09dl.LJJJJJL(liveSubsPrivilegeDetailOptConfig2.preloadDataIdle);
        c09dl.LJII();
    }
}
