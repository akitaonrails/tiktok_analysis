package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class DataChannelOptConfig_OptTypeAdapter extends TypeAdapter<DataChannelOptConfig> {
    public final Gson LIZ;

    public DataChannelOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DataChannelOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DataChannelOptConfig dataChannelOptConfig = new DataChannelOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2026876836:
                        if (strLJJJJ.equals("enable_audience_registry")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dataChannelOptConfig.enableAudienceRegistry = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -384534985:
                        if (strLJJJJ.equals("enable_broadcast_registry")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dataChannelOptConfig.enableBroadcastRegistry = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1517819988:
                        if (strLJJJJ.equals("enable_observe_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dataChannelOptConfig.enableObserveOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2124391068:
                        if (strLJJJJ.equals("enable_observe_sticky_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                dataChannelOptConfig.enableObserveStickyOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return dataChannelOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DataChannelOptConfig dataChannelOptConfig) throws IOException {
        DataChannelOptConfig dataChannelOptConfig2 = dataChannelOptConfig;
        if (dataChannelOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_audience_registry");
        c09dl.LJJJJJL(dataChannelOptConfig2.enableAudienceRegistry);
        c09dl.LJIILLIIL("enable_broadcast_registry");
        c09dl.LJJJJJL(dataChannelOptConfig2.enableBroadcastRegistry);
        c09dl.LJIILLIIL("enable_observe_opt");
        c09dl.LJJJJJL(dataChannelOptConfig2.enableObserveOpt);
        c09dl.LJIILLIIL("enable_observe_sticky_opt");
        c09dl.LJJJJJL(dataChannelOptConfig2.enableObserveStickyOpt);
        c09dl.LJII();
    }
}
