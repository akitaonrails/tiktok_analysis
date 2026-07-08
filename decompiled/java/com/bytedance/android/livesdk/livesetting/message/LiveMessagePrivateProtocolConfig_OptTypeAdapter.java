package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessagePrivateProtocolConfig_OptTypeAdapter extends TypeAdapter<LiveMessagePrivateProtocolConfig> {
    public final Gson LIZ;

    public LiveMessagePrivateProtocolConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessagePrivateProtocolConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessagePrivateProtocolConfig liveMessagePrivateProtocolConfig = new LiveMessagePrivateProtocolConfig(false, false, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1700351728) {
                    if (iHashCode != -1395488548) {
                        if (iHashCode == 213086331 && strLJJJJ.equals("enable_new_frontier_access")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMessagePrivateProtocolConfig.setEnableNewFrontierAccess(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("fallback_timeout_mills")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMessagePrivateProtocolConfig.setFallbackTimeoutMills(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_private_protocol")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessagePrivateProtocolConfig.setEnablePrivateProtocol(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMessagePrivateProtocolConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessagePrivateProtocolConfig liveMessagePrivateProtocolConfig) throws IOException {
        LiveMessagePrivateProtocolConfig liveMessagePrivateProtocolConfig2 = liveMessagePrivateProtocolConfig;
        if (liveMessagePrivateProtocolConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_new_frontier_access");
        c09dl.LJJJJJL(liveMessagePrivateProtocolConfig2.getEnableNewFrontierAccess());
        c09dl.LJIILLIIL("enable_private_protocol");
        c09dl.LJJJJJL(liveMessagePrivateProtocolConfig2.getEnablePrivateProtocol());
        c09dl.LJIILLIIL("fallback_timeout_mills");
        c09dl.LJJIZ(liveMessagePrivateProtocolConfig2.getFallbackTimeoutMills());
        c09dl.LJII();
    }
}
