package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GuidanceConfig_OptTypeAdapter extends TypeAdapter<GuidanceConfig> {
    public final Gson LIZ;

    public GuidanceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GuidanceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GuidanceConfig guidanceConfig = new GuidanceConfig("", null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1918704583:
                        if (strLJJJJ.equals("display_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guidanceConfig.displayConfiguration = (DisplayConfiguration) this.LIZ.LJIIJ(DisplayConfiguration.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -601736365:
                        if (strLJJJJ.equals("frequency_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guidanceConfig.frequencyConfiguration = C473040Igo.LIZ(this.LIZ, c09cu, FrequencyConfiguration.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 130370808:
                        if (strLJJJJ.equals("guidance_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guidanceConfig.guidanceKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 135281327:
                        if (strLJJJJ.equals("trigger_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guidanceConfig.triggerConfiguration = C473040Igo.LIZ(this.LIZ, c09cu, TriggerConfiguration.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 286656161:
                        if (strLJJJJ.equals("business_dependency_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guidanceConfig.businessDependencyConfiguration = C473040Igo.LIZ(this.LIZ, c09cu, BusinessDependency.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1108686470:
                        if (strLJJJJ.equals("permission_configuration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guidanceConfig.permissionConfiguration = C473040Igo.LIZ(this.LIZ, c09cu, PermissionConfiguration.class);
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
        return guidanceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GuidanceConfig guidanceConfig) {
        GuidanceConfig guidanceConfig2 = guidanceConfig;
        if (guidanceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("guidance_key");
        c09dl.LJJJJJ(guidanceConfig2.guidanceKey);
        c09dl.LJIILLIIL("display_configuration");
        this.LIZ.LJIIJ(DisplayConfiguration.class).write(c09dl, guidanceConfig2.displayConfiguration);
        c09dl.LJIILLIIL("trigger_configuration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, guidanceConfig2.triggerConfiguration, TriggerConfiguration.class);
        c09dl.LJIILLIIL("business_dependency_configuration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, guidanceConfig2.businessDependencyConfiguration, BusinessDependency.class);
        c09dl.LJIILLIIL("permission_configuration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, guidanceConfig2.permissionConfiguration, PermissionConfiguration.class);
        c09dl.LJIILLIIL("frequency_configuration");
        C473040Igo.LIZLLL(this.LIZ, c09dl, guidanceConfig2.frequencyConfiguration, FrequencyConfiguration.class);
        c09dl.LJII();
    }
}
