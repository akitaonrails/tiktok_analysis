package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class IncreaseSDKRegistrationConfig_OptTypeAdapter extends TypeAdapter<IncreaseSDKRegistrationConfig> {
    public final Gson LIZ;

    public IncreaseSDKRegistrationConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final IncreaseSDKRegistrationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        IncreaseSDKRegistrationConfig increaseSDKRegistrationConfig = new IncreaseSDKRegistrationConfig(false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1473394175:
                        if (strLJJJJ.equals("parse_rule_locally")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                increaseSDKRegistrationConfig.parseRuleLocally = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1088566769:
                        if (strLJJJJ.equals("register_on_demand")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                increaseSDKRegistrationConfig.registerOnDemand = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -666334447:
                        if (strLJJJJ.equals("avoid_component_loaded")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                increaseSDKRegistrationConfig.avoidComponentLoading = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1037484:
                        if (strLJJJJ.equals("avoid_first_frame")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                increaseSDKRegistrationConfig.avoidFirstFrame = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return increaseSDKRegistrationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, IncreaseSDKRegistrationConfig increaseSDKRegistrationConfig) throws IOException {
        IncreaseSDKRegistrationConfig increaseSDKRegistrationConfig2 = increaseSDKRegistrationConfig;
        if (increaseSDKRegistrationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("avoid_first_frame");
        c09dl.LJJJJJL(increaseSDKRegistrationConfig2.avoidFirstFrame);
        c09dl.LJIILLIIL("avoid_component_loaded");
        c09dl.LJJJJJL(increaseSDKRegistrationConfig2.avoidComponentLoading);
        c09dl.LJIILLIIL("register_on_demand");
        c09dl.LJJJJJL(increaseSDKRegistrationConfig2.registerOnDemand);
        c09dl.LJIILLIIL("parse_rule_locally");
        c09dl.LJJJJJL(increaseSDKRegistrationConfig2.parseRuleLocally);
        c09dl.LJII();
    }
}
