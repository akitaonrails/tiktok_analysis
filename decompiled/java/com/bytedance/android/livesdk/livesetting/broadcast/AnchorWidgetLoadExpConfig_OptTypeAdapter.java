package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class AnchorWidgetLoadExpConfig_OptTypeAdapter extends TypeAdapter<AnchorWidgetLoadExpConfig> {
    public final Gson LIZ;

    public AnchorWidgetLoadExpConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final AnchorWidgetLoadExpConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AnchorWidgetLoadExpConfig anchorWidgetLoadExpConfig = new AnchorWidgetLoadExpConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1941653973:
                        if (strLJJJJ.equals("enable_completion_driven")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorWidgetLoadExpConfig.setEnableCompletionDriven(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -691789974:
                        if (strLJJJJ.equals("request_settle_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorWidgetLoadExpConfig.setRequestSettleMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -357695230:
                        if (strLJJJJ.equals("startup_guard_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorWidgetLoadExpConfig.setStartupGuardMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1346548519:
                        if (strLJJJJ.equals("widget_priority_overrides")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorWidgetLoadExpConfig.setWidgetPriorityOverrides(C473040Igo.LIZIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1637170051:
                        if (strLJJJJ.equals("timeout_after_delay_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorWidgetLoadExpConfig.setTimeoutAfterDelayMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1638373750:
                        if (strLJJJJ.equals("inter_phase_gap_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorWidgetLoadExpConfig.setInterPhaseGapMs(c09cu.LJJJ());
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
        return anchorWidgetLoadExpConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AnchorWidgetLoadExpConfig anchorWidgetLoadExpConfig) throws IOException {
        AnchorWidgetLoadExpConfig anchorWidgetLoadExpConfig2 = anchorWidgetLoadExpConfig;
        if (anchorWidgetLoadExpConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_completion_driven");
        c09dl.LJJJJJL(anchorWidgetLoadExpConfig2.getEnableCompletionDriven());
        c09dl.LJIILLIIL("request_settle_ms");
        c09dl.LJJIZ(anchorWidgetLoadExpConfig2.getRequestSettleMs());
        c09dl.LJIILLIIL("timeout_after_delay_ms");
        c09dl.LJJIZ(anchorWidgetLoadExpConfig2.getTimeoutAfterDelayMs());
        c09dl.LJIILLIIL("widget_priority_overrides");
        C473040Igo.LJ(this.LIZ, c09dl, anchorWidgetLoadExpConfig2.getWidgetPriorityOverrides(), String.class);
        c09dl.LJIILLIIL("startup_guard_ms");
        c09dl.LJJIZ(anchorWidgetLoadExpConfig2.getStartupGuardMs());
        c09dl.LJIILLIIL("inter_phase_gap_ms");
        c09dl.LJJIZ(anchorWidgetLoadExpConfig2.getInterPhaseGapMs());
        c09dl.LJII();
    }
}
