package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class ServiceSkuRoutingConfig_OptTypeAdapter extends TypeAdapter<ServiceSkuRoutingConfig> {
    public final Gson LIZ;

    public ServiceSkuRoutingConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ServiceSkuRoutingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ServiceSkuRoutingConfig serviceSkuRoutingConfig = new ServiceSkuRoutingConfig(false, 0.5f, 2, 3, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1609594047:
                        if (strLJJJJ.equals("enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                serviceSkuRoutingConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1488426701:
                        if (strLJJJJ.equals("max_show_per_day")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                serviceSkuRoutingConfig.setMaxShowPerDay(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1376992083:
                        if (strLJJJJ.equals("max_show_per_session")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                serviceSkuRoutingConfig.setMaxShowPerSession(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -678560424:
                        if (strLJJJJ.equals("ignore_frequency_for_test")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                serviceSkuRoutingConfig.setIgnoreFrequencyForTest(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -310250801:
                        if (strLJJJJ.equals("global_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                serviceSkuRoutingConfig.setGlobalThreshold((float) c09cu.LJJIL());
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
        return serviceSkuRoutingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ServiceSkuRoutingConfig serviceSkuRoutingConfig) throws IOException {
        ServiceSkuRoutingConfig serviceSkuRoutingConfig2 = serviceSkuRoutingConfig;
        if (serviceSkuRoutingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(serviceSkuRoutingConfig2.getEnabled());
        c09dl.LJIILLIIL("global_threshold");
        c09dl.LJJJJ(Float.valueOf(serviceSkuRoutingConfig2.getGlobalThreshold()));
        c09dl.LJIILLIIL("max_show_per_session");
        c09dl.LJJJJ(Integer.valueOf(serviceSkuRoutingConfig2.getMaxShowPerSession()));
        c09dl.LJIILLIIL("max_show_per_day");
        c09dl.LJJJJ(Integer.valueOf(serviceSkuRoutingConfig2.getMaxShowPerDay()));
        c09dl.LJIILLIIL("ignore_frequency_for_test");
        c09dl.LJJJJJL(serviceSkuRoutingConfig2.getIgnoreFrequencyForTest());
        c09dl.LJII();
    }
}
