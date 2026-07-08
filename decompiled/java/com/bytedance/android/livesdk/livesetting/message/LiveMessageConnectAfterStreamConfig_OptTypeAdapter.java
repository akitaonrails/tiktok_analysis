package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveMessageConnectAfterStreamConfig_OptTypeAdapter extends TypeAdapter<LiveMessageConnectAfterStreamConfig> {
    public final Gson LIZ;

    public LiveMessageConnectAfterStreamConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageConnectAfterStreamConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessageConnectAfterStreamConfig liveMessageConnectAfterStreamConfig = new LiveMessageConnectAfterStreamConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1313911455) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 367809210 && strLJJJJ.equals("need_nqe_lower_than_equal")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessageConnectAfterStreamConfig.needNqeLowerThanEqual = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMessageConnectAfterStreamConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("timeout")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessageConnectAfterStreamConfig.timeout = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMessageConnectAfterStreamConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageConnectAfterStreamConfig liveMessageConnectAfterStreamConfig) throws IOException {
        LiveMessageConnectAfterStreamConfig liveMessageConnectAfterStreamConfig2 = liveMessageConnectAfterStreamConfig;
        if (liveMessageConnectAfterStreamConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveMessageConnectAfterStreamConfig2.enable);
        c09dl.LJIILLIIL("timeout");
        c09dl.LJJIZ(liveMessageConnectAfterStreamConfig2.timeout);
        c09dl.LJIILLIIL("need_nqe_lower_than_equal");
        c09dl.LJJJJ(Integer.valueOf(liveMessageConnectAfterStreamConfig2.needNqeLowerThanEqual));
        c09dl.LJII();
    }
}
