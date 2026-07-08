package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBeingAtConfigSetting_LiveBeingAtConfig_OptTypeAdapter extends TypeAdapter<LiveBeingAtConfigSetting.LiveBeingAtConfig> {
    public final Gson LIZ;

    public LiveBeingAtConfigSetting_LiveBeingAtConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBeingAtConfigSetting.LiveBeingAtConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBeingAtConfigSetting.LiveBeingAtConfig liveBeingAtConfig = new LiveBeingAtConfigSetting.LiveBeingAtConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1689144471:
                        if (strLJJJJ.equals("flagReadThreshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBeingAtConfig.flagReadThreshold = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1207414310:
                        if (strLJJJJ.equals("messageConsumeInterval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBeingAtConfig.messageConsumeInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -518282078:
                        if (strLJJJJ.equals("check_user")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBeingAtConfig.checkUser = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1911301719:
                        if (strLJJJJ.equals("messageLifeDuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBeingAtConfig.messageLifeDuration = c09cu.LJJJ();
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
        return liveBeingAtConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBeingAtConfigSetting.LiveBeingAtConfig liveBeingAtConfig) throws IOException {
        LiveBeingAtConfigSetting.LiveBeingAtConfig liveBeingAtConfig2 = liveBeingAtConfig;
        if (liveBeingAtConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("messageConsumeInterval");
        c09dl.LJJIZ(liveBeingAtConfig2.messageConsumeInterval);
        c09dl.LJIILLIIL("messageLifeDuration");
        c09dl.LJJIZ(liveBeingAtConfig2.messageLifeDuration);
        c09dl.LJIILLIIL("flagReadThreshold");
        c09dl.LJJIZ(liveBeingAtConfig2.flagReadThreshold);
        c09dl.LJIILLIIL("check_user");
        c09dl.LJJJJJL(liveBeingAtConfig2.checkUser);
        c09dl.LJII();
    }
}
