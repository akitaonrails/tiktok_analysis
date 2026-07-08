package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig_OptTypeAdapter extends TypeAdapter<LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig> {
    public final Gson LIZ;

    public LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig liveAnchorStatusDiagnosticsPerfConfigAndroidConfig = new LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig(null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1188604883) {
                    if (iHashCode != -605682797) {
                        if (iHashCode == -198258271 && strLJJJJ.equals("low_device")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfigAndroidConfig.setLowTier((LiveAnchorStatusDiagnosticsPerfConfig) this.LIZ.LJIIJ(LiveAnchorStatusDiagnosticsPerfConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("high_device")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveAnchorStatusDiagnosticsPerfConfigAndroidConfig.setHighTier((LiveAnchorStatusDiagnosticsPerfConfig) this.LIZ.LJIIJ(LiveAnchorStatusDiagnosticsPerfConfig.class).read(c09cu));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("mid_device")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveAnchorStatusDiagnosticsPerfConfigAndroidConfig.setMediumTier((LiveAnchorStatusDiagnosticsPerfConfig) this.LIZ.LJIIJ(LiveAnchorStatusDiagnosticsPerfConfig.class).read(c09cu));
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveAnchorStatusDiagnosticsPerfConfigAndroidConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig liveAnchorStatusDiagnosticsPerfConfigAndroidConfig) {
        LiveAnchorStatusDiagnosticsPerfConfigAndroidConfig liveAnchorStatusDiagnosticsPerfConfigAndroidConfig2 = liveAnchorStatusDiagnosticsPerfConfigAndroidConfig;
        if (liveAnchorStatusDiagnosticsPerfConfigAndroidConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("low_device");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveAnchorStatusDiagnosticsPerfConfig.class);
        typeAdapterLJIIJ.write(c09dl, liveAnchorStatusDiagnosticsPerfConfigAndroidConfig2.getLowTier());
        c09dl.LJIILLIIL("mid_device");
        typeAdapterLJIIJ.write(c09dl, liveAnchorStatusDiagnosticsPerfConfigAndroidConfig2.getMediumTier());
        c09dl.LJIILLIIL("high_device");
        typeAdapterLJIIJ.write(c09dl, liveAnchorStatusDiagnosticsPerfConfigAndroidConfig2.getHighTier());
        c09dl.LJII();
    }
}
